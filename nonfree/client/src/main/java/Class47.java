import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class47 implements Runnable {

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "Lclient!af;")
	private Class7 aClass7_6;

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "[B")
	private byte[] aByteArray64;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	private int anInt2408 = 0;

	@OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
	private int anInt2418 = 0;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "Lclient!u;")
	private final Class74 aClass74_4;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!u;)V")
	public Class47(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class74 arg1) throws IOException {
		this.aClass74_4 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIB[B)V")
	public void method1555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean87) {
			return;
		}
		while (arg0 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg2, arg1, arg0);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg0 -= local19;
			arg1 += local19;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)I")
	public int method1557() throws IOException {
		return this.aBoolean87 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!nc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(44) int local44;
					@Pc(56) int local56;
					synchronized (this) {
						if (this.anInt2408 == this.anInt2418) {
							if (this.aBoolean87) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						if (this.anInt2418 < this.anInt2408) {
							local44 = 5000 - this.anInt2408;
						} else {
							local44 = this.anInt2418 - this.anInt2408;
						}
						local56 = this.anInt2408;
					}
					if (local44 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray64, local56, local44);
					} catch (@Pc(73) IOException local73) {
						this.aBoolean88 = true;
					}
					this.anInt2408 = (local44 + this.anInt2408) % 5000;
					try {
						if (this.anInt2418 == this.anInt2408) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(94) IOException local94) {
						this.aBoolean88 = true;
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
				} catch (@Pc(118) IOException local118) {
				}
				this.aByteArray64 = null;
				return;
			}
		} catch (@Pc(123) Exception local123) {
			Static87.method1031(local123, null);
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)I")
	public int method1558() throws IOException {
		return this.aBoolean87 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B[BII)V")
	public void method1562(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean87) {
			return;
		}
		if (this.aBoolean88) {
			this.aBoolean88 = false;
			throw new IOException();
		}
		if (this.aByteArray64 == null) {
			this.aByteArray64 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
				this.aByteArray64[this.anInt2418] = arg0[local38];
				this.anInt2418 = (this.anInt2418 + 1) % 5000;
				if (this.anInt2418 == (this.anInt2408 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass7_6 == null) {
				this.aClass7_6 = this.aClass74_4.method2122(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
	public void method1564() {
		if (this.aBoolean87) {
			return;
		}
		synchronized (this) {
			this.aBoolean87 = true;
			this.notifyAll();
		}
		if (this.aClass7_6 != null) {
			while (this.aClass7_6.anInt148 == 0) {
				Static126.method2277(1L);
			}
			if (this.aClass7_6.anInt148 == 1) {
				try {
					((Thread) this.aClass7_6.anObject1).join();
				} catch (@Pc(60) InterruptedException local60) {
				}
			}
		}
		this.aClass7_6 = null;
	}

	@OriginalMember(owner = "client!nc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1564();
	}
}
