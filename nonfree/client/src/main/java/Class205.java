import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class205 implements Runnable {

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "Lclient!um;")
	private Class253 aClass253_6;

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "[B")
	private byte[] aByteArray77;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	private int anInt5455 = 0;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Z")
	private boolean aBoolean495 = false;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
	private int anInt5463 = 0;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "Z")
	private boolean aBoolean497 = false;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "Lclient!nt;")
	private final Class177 aClass177_4;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!nt;)V")
	public Class205(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class177 arg1) throws IOException {
		this.aClass177_4 = arg1;
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[BIB)V")
	public void method4379(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean495) {
			return;
		}
		while (arg0 > 0) {
			@Pc(22) int local22 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local22 <= 0) {
				throw new EOFException();
			}
			arg2 += local22;
			arg0 -= local22;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public void method4380() {
		if (!this.aBoolean495) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream2 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	public void method4381() throws IOException {
		if (!this.aBoolean495 && this.aBoolean497) {
			this.aBoolean497 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)I")
	public int method4382() throws IOException {
		return this.aBoolean495 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
	public void method4383() {
		if (this.aBoolean495) {
			return;
		}
		synchronized (this) {
			this.aBoolean495 = true;
			this.notifyAll();
		}
		if (this.aClass253_6 != null) {
			while (this.aClass253_6.anInt6669 == 0) {
				Static331.method4343(1L);
			}
			if (this.aClass253_6.anInt6669 == 1) {
				try {
					((Thread) this.aClass253_6.anObject9).join();
				} catch (@Pc(51) InterruptedException local51) {
				}
			}
		}
		this.aClass253_6 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II[BI)V")
	public void method4384(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean495) {
			return;
		}
		if (this.aBoolean497) {
			this.aBoolean497 = false;
			throw new IOException();
		}
		if (this.aByteArray77 == null) {
			this.aByteArray77 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray77[this.anInt5455] = arg1[local32];
				this.anInt5455 = (this.anInt5455 + 1) % 5000;
				if ((this.anInt5463 + 4900) % 5000 == this.anInt5455) {
					throw new IOException();
				}
			}
			if (this.aClass253_6 == null) {
				this.aClass253_6 = this.aClass177_4.method3840(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!qc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method4383();
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)I")
	public int method4386() throws IOException {
		return this.aBoolean495 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!qc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(40) int local40;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt5455 == this.anInt5463) {
							if (this.aBoolean495) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt5463;
						if (this.anInt5463 <= this.anInt5455) {
							local40 = this.anInt5455 - this.anInt5463;
						} else {
							local40 = 5000 - this.anInt5463;
						}
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray77, local28, local40);
					} catch (@Pc(65) IOException local65) {
						this.aBoolean497 = true;
					}
					this.anInt5463 = (this.anInt5463 + local40) % 5000;
					try {
						if (this.anInt5463 == this.anInt5455) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(87) IOException local87) {
						this.aBoolean497 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream1 != null) {
						this.anInputStream1.close();
					}
					if (this.anOutputStream2 != null) {
						this.anOutputStream2.close();
					}
					if (this.aSocket2 != null) {
						this.aSocket2.close();
					}
				} catch (@Pc(111) IOException local111) {
				}
				this.aByteArray77 = null;
				break;
			}
		} catch (@Pc(116) Exception local116) {
			Static338.method4409(local116, null);
		}
	}
}
