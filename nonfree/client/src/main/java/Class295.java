import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class295 implements Runnable {

	@OriginalMember(owner = "client!qu", name = "j", descriptor = "[B")
	private byte[] aByteArray88;

	@OriginalMember(owner = "client!qu", name = "s", descriptor = "Lclient!fe;")
	private Class103 aClass103_7;

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "Z")
	private boolean aBoolean576 = false;

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "Z")
	private boolean aBoolean575 = false;

	@OriginalMember(owner = "client!qu", name = "q", descriptor = "I")
	private int anInt8349 = 0;

	@OriginalMember(owner = "client!qu", name = "u", descriptor = "I")
	private int anInt8350 = 0;

	@OriginalMember(owner = "client!qu", name = "z", descriptor = "Lclient!vt;")
	private final Class380 aClass380_4;

	@OriginalMember(owner = "client!qu", name = "r", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!qu", name = "A", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!qu", name = "n", descriptor = "I")
	private final int anInt8347;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!vt;I)V")
	public Class295(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class380 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass380_4 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream2 = this.aSocket1.getOutputStream();
		this.anInt8347 = arg2;
	}

	@OriginalMember(owner = "client!qu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(40) int local40;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt8350 == this.anInt8349) {
							if (this.aBoolean575) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt8350;
						if (this.anInt8349 >= this.anInt8350) {
							local40 = this.anInt8349 - this.anInt8350;
						} else {
							local40 = this.anInt8347 - this.anInt8350;
						}
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray88, local28, local40);
					} catch (@Pc(69) IOException local69) {
						this.aBoolean576 = true;
					}
					this.anInt8350 = (this.anInt8350 + local40) % this.anInt8347;
					try {
						if (this.anInt8349 == this.anInt8350) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(96) IOException local96) {
						this.aBoolean576 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream1 != null) {
						this.anInputStream1.close();
					}
					if (this.anOutputStream2 != null) {
						this.anOutputStream2.close();
					}
					if (this.aSocket1 != null) {
						this.aSocket1.close();
					}
				} catch (@Pc(120) IOException local120) {
				}
				this.aByteArray88 = null;
				return;
			}
		} catch (@Pc(125) Exception local125) {
			Static664.method9007(local125, (String) null);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
	public void method7098() throws IOException {
		if (!this.aBoolean575 && this.aBoolean576) {
			this.aBoolean576 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!qu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7101();
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)I")
	public int method7100() throws IOException {
		return this.aBoolean575 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(B)V")
	public void method7101() {
		if (this.aBoolean575) {
			return;
		}
		synchronized (this) {
			this.aBoolean575 = true;
			this.notifyAll();
		}
		if (this.aClass103_7 != null) {
			while (this.aClass103_7.anInt2541 == 0) {
				Static520.method7923(1L);
			}
			if (this.aClass103_7.anInt2541 == 1) {
				try {
					((Thread) this.aClass103_7.anObject9).join();
				} catch (@Pc(58) InterruptedException local58) {
				}
			}
		}
		this.aClass103_7 = null;
	}

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)V")
	public void method7102() {
		if (!this.aBoolean575) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream2 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "(B)I")
	public int method7103() throws IOException {
		return this.aBoolean575 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(II[BI)V")
	public void method7105(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean575) {
			return;
		}
		if (this.aBoolean576) {
			this.aBoolean576 = false;
			throw new IOException();
		}
		if (this.aByteArray88 == null) {
			this.aByteArray88 = new byte[this.anInt8347];
		}
		synchronized (this) {
			for (@Pc(33) int local33 = 0; local33 < arg0; local33++) {
				this.aByteArray88[this.anInt8349] = arg1[local33];
				this.anInt8349 = (this.anInt8349 + 1) % this.anInt8347;
				if (this.anInt8349 == (this.anInt8350 + this.anInt8347 - 100) % this.anInt8347) {
					throw new IOException();
				}
			}
			if (this.aClass103_7 == null) {
				this.aClass103_7 = this.aClass380_4.method8815(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(II[BI)V")
	public void method7107(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean575) {
			return;
		}
		while (arg0 > 0) {
			@Pc(26) int local26 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local26 <= 0) {
				throw new EOFException();
			}
			arg0 -= local26;
			arg2 += local26;
		}
	}
}
