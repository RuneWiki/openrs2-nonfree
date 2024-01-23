import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class45 implements Runnable {

	@OriginalMember(owner = "client!e", name = "t", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!e", name = "w", descriptor = "Lclient!ch;")
	private Class28 aClass28_3;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "I")
	private int anInt1209 = 0;

	@OriginalMember(owner = "client!e", name = "v", descriptor = "Z")
	private boolean aBoolean92 = false;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "I")
	private int anInt1214 = 0;

	@OriginalMember(owner = "client!e", name = "x", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "Lclient!vl;")
	private Class177 aClass177_4;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!vl;)V")
	public Class45(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class177 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass177_4 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)I")
	public int method1040() throws IOException {
		return this.aBoolean92 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!e", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1045();
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
	public void method1041() throws IOException {
		if (!this.aBoolean92 && this.aBoolean93) {
			this.aBoolean93 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
	public void method1042() {
		if (!this.aBoolean92) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II[BB)V")
	public void method1043(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean92) {
			return;
		}
		if (this.aBoolean93) {
			this.aBoolean93 = false;
			throw new IOException();
		}
		if (this.aByteArray6 == null) {
			this.aByteArray6 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(37) int local37 = 0; local37 < arg0; local37++) {
				this.aByteArray6[this.anInt1214] = arg1[local37];
				this.anInt1214 = (this.anInt1214 + 1) % 5000;
				if ((this.anInt1209 + 4900) % 5000 == this.anInt1214) {
					throw new IOException();
				}
			}
			if (this.aClass28_3 == null) {
				this.aClass28_3 = this.aClass177_4.method4678(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V")
	public void method1045() {
		if (this.aBoolean92) {
			return;
		}
		synchronized (this) {
			this.aBoolean92 = true;
			this.notifyAll();
		}
		if (this.aClass28_3 != null) {
			while (this.aClass28_3.anInt726 == 0) {
				Static134.method2329(1L);
			}
			if (this.aClass28_3.anInt726 == 1) {
				try {
					((Thread) this.aClass28_3.anObject2).join();
				} catch (@Pc(55) InterruptedException local55) {
				}
			}
		}
		this.aClass28_3 = null;
	}

	@OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(49) int var1;
				@Pc(33) int var2;
				label86: {
					synchronized (this) {
						label87: {
							if (this.anInt1209 == this.anInt1214) {
								if (this.aBoolean92) {
									break label87;
								}
								try {
									this.wait();
								} catch (@Pc(30) InterruptedException local30) {
								}
							}
							var2 = this.anInt1209;
							if (this.anInt1214 >= this.anInt1209) {
								var1 = this.anInt1214 - this.anInt1209;
							} else {
								var1 = 5000 - this.anInt1209;
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
					} catch (@Pc(127) IOException local127) {
					}
					this.aByteArray6 = null;
					break;
				}
				if (var1 > 0) {
					try {
						this.anOutputStream1.write(this.aByteArray6, var2, var1);
					} catch (@Pc(80) IOException local80) {
						this.aBoolean93 = true;
					}
					this.anInt1209 = (var1 + this.anInt1209) % 5000;
					try {
						if (this.anInt1209 == this.anInt1214) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(101) IOException local101) {
						this.aBoolean93 = true;
					}
				}
			}
		} catch (@Pc(132) Exception local132) {
			Static108.method2009(local132, null);
		}
	}

	@OriginalMember(owner = "client!e", name = "f", descriptor = "(I)I")
	public int method1047() throws IOException {
		return this.aBoolean92 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IZI[B)V")
	public void method1048(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean92) {
			return;
		}
		while (arg0 > 0) {
			@Pc(24) int local24 = this.anInputStream1.read(arg2, arg1, arg0);
			if (local24 <= 0) {
				throw new EOFException();
			}
			arg0 -= local24;
			arg1 += local24;
		}
	}
}
