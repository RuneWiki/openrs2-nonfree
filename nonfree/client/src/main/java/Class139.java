import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class139 implements Runnable {

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "[B")
	private byte[] aByteArray53;

	@OriginalMember(owner = "client!pl", name = "p", descriptor = "Lclient!uh;")
	private Class178 aClass178_3;

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
	private int anInt4231 = 0;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "Z")
	private boolean aBoolean300 = false;

	@OriginalMember(owner = "client!pl", name = "m", descriptor = "Z")
	private boolean aBoolean301 = false;

	@OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
	private int anInt4241 = 0;

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "Lclient!ua;")
	private Class176 aClass176_2;

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!pl", name = "o", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!pl", name = "v", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ua;)V")
	public Class139(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class176 arg1) throws IOException {
		this.aClass176_2 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!pl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(41) int var1;
				@Pc(29) int var2;
				label86: {
					synchronized (this) {
						label87: {
							if (this.anInt4241 == this.anInt4231) {
								if (this.aBoolean300) {
									break label87;
								}
								try {
									this.wait();
								} catch (@Pc(26) InterruptedException local26) {
								}
							}
							var2 = this.anInt4231;
							if (this.anInt4241 >= this.anInt4231) {
								var1 = this.anInt4241 - this.anInt4231;
							} else {
								var1 = 5000 - this.anInt4231;
							}
							break label86;
						}
					}
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
					} catch (@Pc(122) IOException local122) {
					}
					this.aByteArray53 = null;
					break;
				}
				if (var1 > 0) {
					try {
						this.anOutputStream1.write(this.aByteArray53, var2, var1);
					} catch (@Pc(71) IOException local71) {
						this.aBoolean301 = true;
					}
					this.anInt4231 = (var1 + this.anInt4231) % 5000;
					try {
						if (this.anInt4241 == this.anInt4231) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(97) IOException local97) {
						this.aBoolean301 = true;
					}
				}
			}
		} catch (@Pc(127) Exception local127) {
			Static42.method613(null, local127);
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
	public void method3549() throws IOException {
		if (!this.aBoolean300 && this.aBoolean301) {
			this.aBoolean301 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	public void method3550() {
		if (!this.aBoolean300) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)I")
	public int method3553() throws IOException {
		return this.aBoolean300 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)I")
	public int method3554() throws IOException {
		return this.aBoolean300 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(II[BI)V")
	public void method3556(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean300) {
			return;
		}
		if (this.aBoolean301) {
			this.aBoolean301 = false;
			throw new IOException();
		}
		if (this.aByteArray53 == null) {
			this.aByteArray53 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(34) int local34 = 0; local34 < arg1; local34++) {
				this.aByteArray53[this.anInt4241] = arg0[local34];
				this.anInt4241 = (this.anInt4241 + 1) % 5000;
				if ((this.anInt4231 + 4900) % 5000 == this.anInt4241) {
					throw new IOException();
				}
			}
			if (this.aClass178_3 == null) {
				this.aClass178_3 = this.aClass176_2.method4523(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[BBI)V")
	public void method3558(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean300) {
			return;
		}
		while (arg0 > 0) {
			@Pc(28) int local28 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local28 <= 0) {
				throw new EOFException();
			}
			arg2 += local28;
			arg0 -= local28;
		}
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(Z)V")
	public void method3559() {
		if (this.aBoolean300) {
			return;
		}
		synchronized (this) {
			this.aBoolean300 = true;
			this.notifyAll();
		}
		if (this.aClass178_3 != null) {
			while (this.aClass178_3.anInt5649 == 0) {
				Static150.method2552(1L);
			}
			if (this.aClass178_3.anInt5649 == 1) {
				try {
					((Thread) this.aClass178_3.anObject6).join();
				} catch (@Pc(55) InterruptedException local55) {
				}
			}
		}
		this.aClass178_3 = null;
	}

	@OriginalMember(owner = "client!pl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method3559();
	}
}
