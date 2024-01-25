import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class145 implements Runnable {

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "[B")
	private byte[] aByteArray51;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "Lclient!kj;")
	private Class133 aClass133_6;

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
	private int anInt3590 = 0;

	@OriginalMember(owner = "client!lh", name = "u", descriptor = "Z")
	private boolean aBoolean260 = false;

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
	private int anInt3600 = 0;

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "Z")
	private boolean aBoolean261 = false;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "Lclient!mj;")
	private final Class156 aClass156_3;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!lh", name = "x", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!mj;)V")
	public Class145(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class156 arg1) throws IOException {
		this.aClass156_3 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
	public void method3136() {
		if (this.aBoolean260) {
			return;
		}
		synchronized (this) {
			this.aBoolean260 = true;
			this.notifyAll();
		}
		if (this.aClass133_6 != null) {
			while (this.aClass133_6.anInt3257 == 0) {
				Static37.method613(1L);
			}
			if (this.aClass133_6.anInt3257 == 1) {
				try {
					((Thread) this.aClass133_6.anObject3).join();
				} catch (@Pc(56) InterruptedException local56) {
				}
			}
		}
		this.aClass133_6 = null;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)I")
	public int method3137() throws IOException {
		return this.aBoolean260 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!lh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method3136();
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)I")
	public int method3139() throws IOException {
		return this.aBoolean260 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
	public void method3140() {
		if (!this.aBoolean260) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II[BI)V")
	public void method3141(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean260) {
			return;
		}
		while (arg2 > 0) {
			@Pc(20) int local20 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local20 <= 0) {
				throw new EOFException();
			}
			arg2 -= local20;
			arg0 += local20;
		}
	}

	@OriginalMember(owner = "client!lh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(42) int local42;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt3600 == this.anInt3590) {
							if (this.aBoolean260) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt3590;
						if (this.anInt3600 < this.anInt3590) {
							local42 = 5000 - this.anInt3590;
						} else {
							local42 = this.anInt3600 - this.anInt3590;
						}
					}
					if (local42 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray51, local28, local42);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean261 = true;
					}
					this.anInt3590 = (local42 + this.anInt3590) % 5000;
					try {
						if (this.anInt3590 == this.anInt3600) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(89) IOException local89) {
						this.aBoolean261 = true;
					}
					continue;
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
				} catch (@Pc(113) IOException local113) {
				}
				this.aByteArray51 = null;
				break;
			}
		} catch (@Pc(118) Exception local118) {
			Static355.method5328(null, local118);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[BBI)V")
	public void method3143(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		if (this.aBoolean260) {
			return;
		}
		if (this.aBoolean261) {
			this.aBoolean261 = false;
			throw new IOException();
		}
		if (this.aByteArray51 == null) {
			this.aByteArray51 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray51[this.anInt3600] = arg1[local32];
				this.anInt3600 = (this.anInt3600 + 1) % 5000;
				if (this.anInt3600 == (this.anInt3590 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass133_6 == null) {
				this.aClass133_6 = this.aClass156_3.method3658(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(Z)V")
	public void method3144() throws IOException {
		if (!this.aBoolean260 && this.aBoolean261) {
			this.aBoolean261 = false;
			throw new IOException();
		}
	}
}
