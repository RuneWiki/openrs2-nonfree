import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class113 implements Runnable {

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "Lclient!jl;")
	private Class136 aClass136_3;

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "[B")
	private byte[] aByteArray36;

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "Z")
	private boolean aBoolean177 = false;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
	private int anInt2843 = 0;

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
	private int anInt2849 = 0;

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "Z")
	private boolean aBoolean178 = false;

	@OriginalMember(owner = "client!hl", name = "w", descriptor = "Lclient!pb;")
	private final Class194 aClass194_3;

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!hl", name = "t", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!pb;)V")
	public Class113(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class194 arg1) throws IOException {
		this.aClass194_3 = arg1;
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[BBI)V")
	public void method2332(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean177) {
			return;
		}
		while (arg2 > 0) {
			@Pc(22) int local22 = this.anInputStream2.read(arg1, arg0, arg2);
			if (local22 <= 0) {
				throw new EOFException();
			}
			arg0 += local22;
			arg2 -= local22;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[BII)V")
	public void method2333(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean177) {
			return;
		}
		if (this.aBoolean178) {
			this.aBoolean178 = false;
			throw new IOException();
		}
		if (this.aByteArray36 == null) {
			this.aByteArray36 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
				this.aByteArray36[this.anInt2843] = arg0[local36];
				this.anInt2843 = (this.anInt2843 + 1) % 5000;
				if ((this.anInt2849 + 4900) % 5000 == this.anInt2843) {
					throw new IOException();
				}
			}
			if (this.aClass136_3 == null) {
				this.aClass136_3 = this.aClass194_3.method4393(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	public void method2334() {
		if (!this.aBoolean177) {
			this.anInputStream2 = new InputStream_Sub2();
			this.anOutputStream2 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
	public void method2335() throws IOException {
		if (!this.aBoolean177 && this.aBoolean178) {
			this.aBoolean178 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!hl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(37) int local37;
					@Pc(47) int local47;
					synchronized (this) {
						if (this.anInt2843 == this.anInt2849) {
							if (this.aBoolean177) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt2843 >= this.anInt2849) {
							local37 = this.anInt2843 - this.anInt2849;
						} else {
							local37 = 5000 - this.anInt2849;
						}
						local47 = this.anInt2849;
					}
					if (local37 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray36, local47, local37);
					} catch (@Pc(64) IOException local64) {
						this.aBoolean178 = true;
					}
					this.anInt2849 = (local37 + this.anInt2849) % 5000;
					try {
						if (this.anInt2849 == this.anInt2843) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(85) IOException local85) {
						this.aBoolean178 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream2 != null) {
						this.anInputStream2.close();
					}
					if (this.anOutputStream2 != null) {
						this.anOutputStream2.close();
					}
					if (this.aSocket2 != null) {
						this.aSocket2.close();
					}
				} catch (@Pc(109) IOException local109) {
				}
				this.aByteArray36 = null;
				return;
			}
		} catch (@Pc(114) Exception local114) {
			Static22.method402(local114, null);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
	public void method2337() {
		if (this.aBoolean177) {
			return;
		}
		synchronized (this) {
			this.aBoolean177 = true;
			this.notifyAll();
		}
		if (this.aClass136_3 != null) {
			while (this.aClass136_3.anInt3418 == 0) {
				Static167.method6157(1L);
			}
			if (this.aClass136_3.anInt3418 == 1) {
				try {
					((Thread) this.aClass136_3.anObject10).join();
				} catch (@Pc(59) InterruptedException local59) {
				}
			}
		}
		this.aClass136_3 = null;
	}

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)I")
	public int method2338() throws IOException {
		return this.aBoolean177 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "(I)I")
	public int method2340() throws IOException {
		return this.aBoolean177 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!hl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2337();
	}
}
