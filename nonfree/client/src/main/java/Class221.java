import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class221 implements Runnable {

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "Lclient!or;")
	private Class182 aClass182_10;

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "[B")
	private byte[] aByteArray103;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
	private int anInt5543 = 0;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "Z")
	private boolean aBoolean408 = false;

	@OriginalMember(owner = "client!tc", name = "u", descriptor = "Z")
	private boolean aBoolean409 = false;

	@OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
	private int anInt5553 = 0;

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "Lclient!is;")
	private final Class111 aClass111_4;

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!is;)V")
	public Class221(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class111 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass111_4 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public void method4791() throws IOException {
		if (!this.aBoolean408 && this.aBoolean409) {
			this.aBoolean409 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)I")
	public int method4794() throws IOException {
		return this.aBoolean408 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)I")
	public int method4795() throws IOException {
		return this.aBoolean408 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[BBI)V")
	public void method4796(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean408) {
			return;
		}
		if (this.aBoolean409) {
			this.aBoolean409 = false;
			throw new IOException();
		}
		if (this.aByteArray103 == null) {
			this.aByteArray103 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
				this.aByteArray103[this.anInt5543] = arg0[local36];
				this.anInt5543 = (this.anInt5543 + 1) % 5000;
				if (this.anInt5543 == (this.anInt5553 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass182_10 == null) {
				this.aClass182_10 = this.aClass111_4.method2819(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
	public void method4797() {
		if (!this.aBoolean408) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!tc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method4801();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III[B)V")
	public void method4800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean408) {
			return;
		}
		while (arg1 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg0 += local14;
			arg1 -= local14;
		}
	}

	@OriginalMember(owner = "client!tc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(35) int local35;
					@Pc(24) int local24;
					synchronized (this) {
						if (this.anInt5553 == this.anInt5543) {
							if (this.aBoolean408) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						local24 = this.anInt5553;
						if (this.anInt5553 > this.anInt5543) {
							local35 = 5000 - this.anInt5553;
						} else {
							local35 = this.anInt5543 - this.anInt5553;
						}
					}
					if (local35 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray103, local24, local35);
					} catch (@Pc(64) IOException local64) {
						this.aBoolean409 = true;
					}
					this.anInt5553 = (local35 + this.anInt5553) % 5000;
					try {
						if (this.anInt5543 == this.anInt5553) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(89) IOException local89) {
						this.aBoolean409 = true;
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
				this.aByteArray103 = null;
				break;
			}
		} catch (@Pc(118) Exception local118) {
			Static142.method2676(local118, null);
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(Z)V")
	public void method4801() {
		if (this.aBoolean408) {
			return;
		}
		synchronized (this) {
			this.aBoolean408 = true;
			this.notifyAll();
		}
		if (this.aClass182_10 != null) {
			while (this.aClass182_10.anInt4498 == 0) {
				Static358.method2028(1L);
			}
			if (this.aClass182_10.anInt4498 == 1) {
				try {
					((Thread) this.aClass182_10.anObject6).join();
				} catch (@Pc(55) InterruptedException local55) {
				}
			}
		}
		this.aClass182_10 = null;
	}
}
