import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import sign.signlink;

public final class Class6 implements Runnable {

	private boolean aBoolean74 = false;

	private InputStream anInputStream1;

	private OutputStream anOutputStream1;

	private Socket aSocket1;

	private boolean aBoolean75 = false;

	Applet_Sub1 anApplet_Sub1_2;

	private byte[] aByteArray5;

	private int anInt347;

	private int anInt348;

	private boolean aBoolean76 = false;

	private boolean aBoolean77 = false;

	public Class6(Applet_Sub1 arg0, byte arg1, Socket arg2) throws IOException {
		try {
			if (arg1 == 2) {
				boolean var6 = false;
			} else {
				this.aBoolean74 = !this.aBoolean74;
			}
			this.anApplet_Sub1_2 = arg0;
			this.aSocket1 = arg2;
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch (RuntimeException var5) {
			signlink.reporterror("77482, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public void method201() {
		this.aBoolean75 = true;
		try {
			if (this.anInputStream1 != null) {
				this.anInputStream1.close();
			}
			if (this.anOutputStream1 != null) {
				this.anOutputStream1.close();
			}
			if (this.aSocket1 != null) {
				this.aSocket1.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}
		this.aBoolean76 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray5 = null;
	}

	public int method202() throws IOException {
		return this.aBoolean75 ? 0 : this.anInputStream1.read();
	}

	public int method203() throws IOException {
		return this.aBoolean75 ? 0 : this.anInputStream1.available();
	}

	public void method204(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!this.aBoolean75) {
			while (arg2 > 0) {
				int var4 = this.anInputStream1.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}
				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	public void method205(byte[] arg0, int arg1, boolean arg2, int arg3) throws IOException {
		try {
			if (arg2) {
				if (!this.aBoolean75) {
					if (this.aBoolean77) {
						this.aBoolean77 = false;
						throw new IOException("Error in writer thread");
					} else {
						if (this.aByteArray5 == null) {
							this.aByteArray5 = new byte[5000];
						}
						synchronized (this) {
							for (int var7 = 0; var7 < arg1; ++var7) {
								this.aByteArray5[this.anInt348] = arg0[var7 + arg3];
								this.anInt348 = (this.anInt348 + 1) % 5000;
								if (this.anInt348 == (this.anInt347 + 4900) % 5000) {
									throw new IOException("buffer overflow");
								}
							}
							if (!this.aBoolean76) {
								this.aBoolean76 = true;
								this.anApplet_Sub1_2.method73(this, 2);
							}
							this.notify();
						}
					}
				}
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("86047, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	public void run() {
		while (this.aBoolean76) {
			int var1;
			int var2;
			synchronized (this) {
				if (this.anInt348 == this.anInt347) {
					try {
						this.wait();
					} catch (InterruptedException var6) {
					}
				}
				if (!this.aBoolean76) {
					return;
				}
				var2 = this.anInt347;
				if (this.anInt348 >= this.anInt347) {
					var1 = this.anInt348 - this.anInt347;
				} else {
					var1 = 5000 - this.anInt347;
				}
			}
			if (var1 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray5, var2, var1);
				} catch (IOException var5) {
					this.aBoolean77 = true;
				}
				this.anInt347 = (this.anInt347 + var1) % 5000;
				try {
					if (this.anInt348 == this.anInt347) {
						this.anOutputStream1.flush();
					}
				} catch (IOException var4) {
					this.aBoolean77 = true;
				}
			}
		}
	}
}
