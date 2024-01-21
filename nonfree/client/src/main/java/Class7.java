import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class7 implements Runnable {

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "Lclient!cf;")
	private Class15 aClass15_1;

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "Z")
	private boolean aBoolean11 = false;

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
	private int anInt227 = 0;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "Z")
	private boolean aBoolean12 = false;

	@OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
	private int anInt236 = 0;

	@OriginalMember(owner = "client!ba", name = "u", descriptor = "Lclient!df;")
	private final Class20 aClass20_1;

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!ba", name = "q", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!df;)V")
	public Class7(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class20 arg1) throws IOException {
		this.aClass20_1 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BII[B)V")
	public void method154(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean12) {
			return;
		}
		while (arg1 > 0) {
			@Pc(22) int local22 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local22 <= 0) {
				throw new EOFException();
			}
			arg0 += local22;
			arg1 -= local22;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)I")
	public int method155() throws IOException {
		return this.aBoolean12 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V")
	public void method157() {
		if (this.aBoolean12) {
			return;
		}
		synchronized (this) {
			this.aBoolean12 = true;
			this.notifyAll();
		}
		if (this.aClass15_1 != null) {
			while (this.aClass15_1.anInt404 == 0) {
				Static81.method1325(1L);
			}
			if (this.aClass15_1.anInt404 == 1) {
				try {
					((Thread) this.aClass15_1.anObject9).join();
				} catch (@Pc(59) InterruptedException local59) {
				}
			}
		}
		this.aClass15_1 = null;
	}

	@OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method157();
	}

	@OriginalMember(owner = "client!ba", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(40) int local40;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt236 == this.anInt227) {
							if (this.aBoolean12) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt227;
						if (this.anInt227 <= this.anInt236) {
							local40 = this.anInt236 - this.anInt227;
						} else {
							local40 = 5000 - this.anInt227;
						}
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray1, local28, local40);
					} catch (@Pc(64) IOException local64) {
						this.aBoolean11 = true;
					}
					this.anInt227 = (this.anInt227 + local40) % 5000;
					try {
						if (this.anInt227 == this.anInt236) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(90) IOException local90) {
						this.aBoolean11 = true;
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
				} catch (@Pc(114) IOException local114) {
				}
				this.aByteArray1 = null;
				break;
			}
		} catch (@Pc(119) Exception local119) {
			Static93.method1535(null, local119);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)I")
	public int method160() throws IOException {
		return this.aBoolean12 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[BII)V")
	public void method161(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean12) {
			return;
		}
		if (this.aBoolean11) {
			this.aBoolean11 = false;
			throw new IOException();
		}
		if (this.aByteArray1 == null) {
			this.aByteArray1 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(37) int local37 = 0; local37 < arg1; local37++) {
				this.aByteArray1[this.anInt236] = arg0[local37];
				this.anInt236 = (this.anInt236 + 1) % 5000;
				if (this.anInt236 == (this.anInt227 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass15_1 == null) {
				this.aClass15_1 = this.aClass20_1.method374(3, this);
			}
			this.notifyAll();
		}
	}
}
