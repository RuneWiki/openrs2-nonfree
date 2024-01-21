import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class47 implements Runnable {

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "[B")
	private byte[] aByteArray26;

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "Lclient!ud;")
	private Class59 aClass59_3;

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "Z")
	private boolean aBoolean105 = false;

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "Z")
	private boolean aBoolean106 = false;

	@OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
	private int anInt1900 = 0;

	@OriginalMember(owner = "client!pa", name = "N", descriptor = "I")
	private int anInt1908 = 0;

	@OriginalMember(owner = "client!pa", name = "B", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!pa", name = "M", descriptor = "Lclient!vb;")
	private final Class60 aClass60_4;

	@OriginalMember(owner = "client!pa", name = "Q", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!vb;)V")
	public Class47(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class60 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass60_4 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)I")
	public int method1335() throws IOException {
		return this.aBoolean106 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!pa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1338();
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
	public void method1338() {
		if (this.aBoolean106) {
			return;
		}
		synchronized (this) {
			this.aBoolean106 = true;
			this.notifyAll();
		}
		if (this.aClass59_3 != null) {
			while (this.aClass59_3.anInt2522 == 0) {
				Static9.method179(1L);
			}
			if (this.aClass59_3.anInt2522 == 1) {
				try {
					((Thread) this.aClass59_3.anObject3).join();
				} catch (@Pc(55) InterruptedException local55) {
				}
			}
		}
		this.aClass59_3 = null;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)I")
	public int method1341() throws IOException {
		return this.aBoolean106 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[BII)V")
	public void method1342(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean106) {
			return;
		}
		while (arg2 > 0) {
			@Pc(24) int local24 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local24 <= 0) {
				throw new EOFException();
			}
			arg2 -= local24;
			arg0 += local24;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II[BI)V")
	public void method1343(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean106) {
			return;
		}
		if (this.aBoolean105) {
			this.aBoolean105 = false;
			throw new IOException();
		}
		if (this.aByteArray26 == null) {
			this.aByteArray26 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(30) int local30 = 0; local30 < arg0; local30++) {
				this.aByteArray26[this.anInt1900] = arg1[local30];
				this.anInt1900 = (this.anInt1900 + 1) % 5000;
				if (this.anInt1900 == (this.anInt1908 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass59_3 == null) {
				this.aClass59_3 = this.aClass60_4.method1807(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(40) int local40;
					@Pc(51) int local51;
					synchronized (this) {
						if (this.anInt1900 == this.anInt1908) {
							if (this.aBoolean106) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt1900 >= this.anInt1908) {
							local40 = this.anInt1900 - this.anInt1908;
						} else {
							local40 = 5000 - this.anInt1908;
						}
						local51 = this.anInt1908;
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray26, local51, local40);
					} catch (@Pc(71) IOException local71) {
						this.aBoolean105 = true;
					}
					this.anInt1908 = (local40 + this.anInt1908) % 5000;
					try {
						if (this.anInt1900 == this.anInt1908) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(92) IOException local92) {
						this.aBoolean105 = true;
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
				} catch (@Pc(116) IOException local116) {
				}
				this.aByteArray26 = null;
				return;
			}
		} catch (@Pc(121) Exception local121) {
			Static95.method1687(null, local121);
		}
	}
}
