import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class185 implements Runnable {

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Lclient!tj;")
	private Class328 aClass328_5;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "[B")
	private byte[] aByteArray64;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "I")
	private int anInt5949 = 0;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "Z")
	private boolean aBoolean399 = false;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "I")
	private int anInt5956 = 0;

	@OriginalMember(owner = "client!le", name = "o", descriptor = "Z")
	private boolean aBoolean400 = false;

	@OriginalMember(owner = "client!le", name = "s", descriptor = "Lclient!ge;")
	private final Class112 aClass112_4;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!le", name = "q", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "I")
	private final int anInt5951;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ge;I)V")
	public Class185(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class112 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass112_4 = arg1;
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
		this.anInt5951 = arg2;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)I")
	public int method5214() throws IOException {
		return this.aBoolean399 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public void method5215() throws IOException {
		if (!this.aBoolean399 && this.aBoolean400) {
			this.aBoolean400 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
	public void method5216() {
		if (!this.aBoolean399) {
			this.anInputStream2 = new InputStream_Sub1();
			this.anOutputStream2 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIB[B)V")
	public void method5217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean399) {
			return;
		}
		while (arg0 > 0) {
			@Pc(18) int local18 = this.anInputStream2.read(arg2, arg1, arg0);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg0 -= local18;
			arg1 += local18;
		}
	}

	@OriginalMember(owner = "client!le", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5222();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I[BII)V")
	public void method5219(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean399) {
			return;
		}
		if (this.aBoolean400) {
			this.aBoolean400 = false;
			throw new IOException();
		}
		if (this.aByteArray64 == null) {
			this.aByteArray64 = new byte[this.anInt5951];
		}
		synchronized (this) {
			for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
				this.aByteArray64[this.anInt5956] = arg0[local39];
				this.anInt5956 = (this.anInt5956 + 1) % this.anInt5951;
				if (this.anInt5956 == (this.anInt5949 + this.anInt5951 - 100) % this.anInt5951) {
					throw new IOException();
				}
			}
			if (this.aClass328_5 == null) {
				this.aClass328_5 = this.aClass112_4.method3237(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!le", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(44) int local44;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt5949 == this.anInt5956) {
							if (this.aBoolean399) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt5949;
						if (this.anInt5956 >= this.anInt5949) {
							local44 = this.anInt5956 - this.anInt5949;
						} else {
							local44 = this.anInt5951 - this.anInt5949;
						}
					}
					if (local44 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray64, local28, local44);
					} catch (@Pc(73) IOException local73) {
						this.aBoolean400 = true;
					}
					this.anInt5949 = (local44 + this.anInt5949) % this.anInt5951;
					try {
						if (this.anInt5949 == this.anInt5956) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(99) IOException local99) {
						this.aBoolean400 = true;
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
				this.aByteArray64 = null;
				return;
			}
		} catch (@Pc(128) Exception local128) {
			Static619.method8645(local128, (String) null);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)I")
	public int method5220() throws IOException {
		return this.aBoolean399 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(B)V")
	public void method5222() {
		if (this.aBoolean399) {
			return;
		}
		synchronized (this) {
			this.aBoolean399 = true;
			this.notifyAll();
		}
		if (this.aClass328_5 != null) {
			while (this.aClass328_5.anInt9389 == 0) {
				Static179.method3254(1L);
			}
			if (this.aClass328_5.anInt9389 == 1) {
				try {
					((Thread) this.aClass328_5.anObject21).join();
				} catch (@Pc(59) InterruptedException local59) {
				}
			}
		}
		this.aClass328_5 = null;
	}
}
