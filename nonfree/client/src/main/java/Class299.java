import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class299 implements Runnable {

	@OriginalMember(owner = "client!ru", name = "r", descriptor = "Lclient!jg;")
	private Class174 aClass174_9;

	@OriginalMember(owner = "client!ru", name = "s", descriptor = "[B")
	private byte[] aByteArray86;

	@OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
	private int anInt8538 = 0;

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "Z")
	private boolean aBoolean619 = false;

	@OriginalMember(owner = "client!ru", name = "t", descriptor = "Z")
	private boolean aBoolean620 = false;

	@OriginalMember(owner = "client!ru", name = "p", descriptor = "I")
	private int anInt8540 = 0;

	@OriginalMember(owner = "client!ru", name = "n", descriptor = "Lclient!rp;")
	private final Class298 aClass298_8;

	@OriginalMember(owner = "client!ru", name = "w", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!ru", name = "x", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
	private final int anInt8531;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!rp;I)V")
	public Class299(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class298 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass298_8 = arg1;
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
		this.anInt8531 = arg2;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZII[B)V")
	public void method7353(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean620) {
			return;
		}
		if (this.aBoolean619) {
			this.aBoolean619 = false;
			throw new IOException();
		}
		if (this.aByteArray86 == null) {
			this.aByteArray86 = new byte[this.anInt8531];
		}
		synchronized (this) {
			for (@Pc(39) int local39 = 0; local39 < arg0; local39++) {
				this.aByteArray86[this.anInt8540] = arg1[local39];
				this.anInt8540 = (this.anInt8540 + 1) % this.anInt8531;
				if ((this.anInt8531 + this.anInt8538 - 100) % this.anInt8531 == this.anInt8540) {
					throw new IOException();
				}
			}
			if (this.aClass174_9 == null) {
				this.aClass174_9 = this.aClass298_8.method7289(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ru", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(44) int local44;
					@Pc(56) int local56;
					synchronized (this) {
						if (this.anInt8538 == this.anInt8540) {
							if (this.aBoolean620) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						if (this.anInt8538 > this.anInt8540) {
							local44 = this.anInt8531 - this.anInt8538;
						} else {
							local44 = this.anInt8540 - this.anInt8538;
						}
						local56 = this.anInt8538;
					}
					if (local44 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray86, local56, local44);
					} catch (@Pc(76) IOException local76) {
						this.aBoolean619 = true;
					}
					this.anInt8538 = (this.anInt8538 + local44) % this.anInt8531;
					try {
						if (this.anInt8538 == this.anInt8540) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(99) IOException local99) {
						this.aBoolean619 = true;
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
				} catch (@Pc(123) IOException local123) {
				}
				this.aByteArray86 = null;
				return;
			}
		} catch (@Pc(128) Exception local128) {
			Static296.method5075(local128, (String) null);
		}
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)I")
	public int method7354() throws IOException {
		return this.aBoolean620 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!ru", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7360();
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "([BIIB)V")
	public void method7355(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean620) {
			return;
		}
		while (arg1 > 0) {
			@Pc(23) int local23 = this.anInputStream2.read(arg0, arg2, arg1);
			if (local23 <= 0) {
				throw new EOFException();
			}
			arg1 -= local23;
			arg2 += local23;
		}
	}

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(B)V")
	public void method7357() throws IOException {
		if (!this.aBoolean620 && this.aBoolean619) {
			this.aBoolean619 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)I")
	public int method7358() throws IOException {
		return this.aBoolean620 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)V")
	public void method7360() {
		if (this.aBoolean620) {
			return;
		}
		synchronized (this) {
			this.aBoolean620 = true;
			this.notifyAll();
		}
		if (this.aClass174_9 != null) {
			while (this.aClass174_9.anInt5121 == 0) {
				Static143.method2414(1L);
			}
			if (this.aClass174_9.anInt5121 == 1) {
				try {
					((Thread) this.aClass174_9.anObject12).join();
				} catch (@Pc(59) InterruptedException local59) {
				}
			}
		}
		this.aClass174_9 = null;
	}

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "(B)V")
	public void method7361() {
		if (!this.aBoolean620) {
			this.anInputStream2 = new InputStream_Sub2();
			this.anOutputStream2 = new OutputStream_Sub1();
		}
	}
}
