import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class62 implements Runnable {

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "Lclient!hf;")
	private Class32 aClass32_6;

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "Z")
	private boolean aBoolean240 = false;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
	private int anInt3206 = 0;

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
	private int anInt3211 = 0;

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "Z")
	private boolean aBoolean241 = false;

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "Lclient!e;")
	private final Class16 aClass16_4;

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!e;)V")
	public Class62(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class16 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass16_4 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	public void method2277() {
		if (this.aBoolean240) {
			return;
		}
		synchronized (this) {
			this.aBoolean240 = true;
			this.notifyAll();
		}
		if (this.aClass32_6 != null) {
			while (this.aClass32_6.anInt1974 == 0) {
				Static181.method2982(1L);
			}
			if (this.aClass32_6.anInt1974 == 1) {
				try {
					((Thread) this.aClass32_6.anObject2).join();
				} catch (@Pc(54) InterruptedException local54) {
				}
			}
		}
		this.aClass32_6 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[BI)V")
	public void method2279(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean240) {
			return;
		}
		while (arg0 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg2 += local14;
			arg0 -= local14;
		}
	}

	@OriginalMember(owner = "client!oa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(39) int local39;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt3206 == this.anInt3211) {
							if (this.aBoolean240) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt3211;
						if (this.anInt3211 > this.anInt3206) {
							local39 = 5000 - this.anInt3211;
						} else {
							local39 = this.anInt3206 - this.anInt3211;
						}
					}
					if (local39 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray30, local28, local39);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean241 = true;
					}
					this.anInt3211 = (local39 + this.anInt3211) % 5000;
					try {
						if (this.anInt3211 == this.anInt3206) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(89) IOException local89) {
						this.aBoolean241 = true;
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
				this.aByteArray30 = null;
				break;
			}
		} catch (@Pc(118) Exception local118) {
			Static154.method2661(null, local118);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)I")
	public int method2280() throws IOException {
		return this.aBoolean240 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[BZ)V")
	public void method2281(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean240) {
			return;
		}
		if (this.aBoolean241) {
			this.aBoolean241 = false;
			throw new IOException();
		}
		if (this.aByteArray30 == null) {
			this.aByteArray30 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray30[this.anInt3206] = arg1[local32];
				this.anInt3206 = (this.anInt3206 + 1) % 5000;
				if ((this.anInt3211 + 4900) % 5000 == this.anInt3206) {
					throw new IOException();
				}
			}
			if (this.aClass32_6 == null) {
				this.aClass32_6 = this.aClass16_4.method982(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)I")
	public int method2285() throws IOException {
		return this.aBoolean240 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2277();
	}
}
