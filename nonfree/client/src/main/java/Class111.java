import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class111 implements Runnable {

	@OriginalMember(owner = "client!fv", name = "i", descriptor = "Lclient!sa;")
	private Class299 aClass299_2;

	@OriginalMember(owner = "client!fv", name = "t", descriptor = "[B")
	private byte[] aByteArray39;

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "Z")
	private boolean aBoolean262 = false;

	@OriginalMember(owner = "client!fv", name = "n", descriptor = "Z")
	private boolean aBoolean263 = false;

	@OriginalMember(owner = "client!fv", name = "p", descriptor = "I")
	private int anInt3379 = 0;

	@OriginalMember(owner = "client!fv", name = "s", descriptor = "I")
	private int anInt3382 = 0;

	@OriginalMember(owner = "client!fv", name = "j", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "Lclient!ii;")
	private final Class161 aClass161_5;

	@OriginalMember(owner = "client!fv", name = "o", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ii;)V")
	public Class111(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class161 arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aClass161_5 = arg1;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket2.getInputStream();
		this.anOutputStream1 = this.aSocket2.getOutputStream();
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I[BZI)V")
	public void method3084(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean262) {
			return;
		}
		while (arg0 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg0 -= local14;
			arg2 += local14;
		}
	}

	@OriginalMember(owner = "client!fv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(45) int local45;
					@Pc(56) int local56;
					synchronized (this) {
						if (this.anInt3382 == this.anInt3379) {
							if (this.aBoolean262) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						if (this.anInt3382 <= this.anInt3379) {
							local45 = this.anInt3379 - this.anInt3382;
						} else {
							local45 = 5000 - this.anInt3382;
						}
						local56 = this.anInt3382;
					}
					if (local45 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray39, local56, local45);
					} catch (@Pc(76) IOException local76) {
						this.aBoolean263 = true;
					}
					this.anInt3382 = (local45 + this.anInt3382) % 5000;
					try {
						if (this.anInt3382 == this.anInt3379) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(101) IOException local101) {
						this.aBoolean263 = true;
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
					if (this.aSocket2 != null) {
						this.aSocket2.close();
					}
				} catch (@Pc(125) IOException local125) {
				}
				this.aByteArray39 = null;
				return;
			}
		} catch (@Pc(130) Exception local130) {
			Static473.method6593(local130, null);
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I[BII)V")
	public void method3085(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean262) {
			return;
		}
		if (this.aBoolean263) {
			this.aBoolean263 = false;
			throw new IOException();
		}
		if (this.aByteArray39 == null) {
			this.aByteArray39 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
				this.aByteArray39[this.anInt3379] = arg0[local32];
				this.anInt3379 = (this.anInt3379 + 1) % 5000;
				if (this.anInt3379 == (this.anInt3382 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass299_2 == null) {
				this.aClass299_2 = this.aClass161_5.method3827(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!fv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method3090();
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)I")
	public int method3088() throws IOException {
		return this.aBoolean262 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)V")
	public void method3089() throws IOException {
		if (!this.aBoolean262 && this.aBoolean263) {
			this.aBoolean263 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "(I)V")
	public void method3090() {
		if (this.aBoolean262) {
			return;
		}
		synchronized (this) {
			this.aBoolean262 = true;
			this.notifyAll();
		}
		if (this.aClass299_2 != null) {
			while (this.aClass299_2.anInt7985 == 0) {
				Static55.method845(1L);
			}
			if (this.aClass299_2.anInt7985 == 1) {
				try {
					((Thread) this.aClass299_2.anObject41).join();
				} catch (@Pc(53) InterruptedException local53) {
				}
			}
		}
		this.aClass299_2 = null;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Z)I")
	public int method3091() throws IOException {
		return this.aBoolean262 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(Z)V")
	public void method3092() {
		if (!this.aBoolean262) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}
}
