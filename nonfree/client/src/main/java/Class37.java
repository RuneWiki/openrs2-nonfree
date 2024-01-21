import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QLBHZVFC")
public final class Class37 implements Runnable {

	@OriginalMember(owner = "client!QLBHZVFC", name = "a", descriptor = "I")
	private int anInt573;

	@OriginalMember(owner = "client!QLBHZVFC", name = "g", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!QLBHZVFC", name = "h", descriptor = "I")
	private int anInt574;

	@OriginalMember(owner = "client!QLBHZVFC", name = "i", descriptor = "I")
	private int anInt575;

	@OriginalMember(owner = "client!QLBHZVFC", name = "e", descriptor = "Z")
	private boolean aBoolean119 = false;

	@OriginalMember(owner = "client!QLBHZVFC", name = "j", descriptor = "Z")
	private boolean aBoolean120 = false;

	@OriginalMember(owner = "client!QLBHZVFC", name = "k", descriptor = "Z")
	private boolean aBoolean121 = false;

	@OriginalMember(owner = "client!QLBHZVFC", name = "f", descriptor = "Lclient!BTXFPMEV;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!QLBHZVFC", name = "d", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!QLBHZVFC", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!QLBHZVFC", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!QLBHZVFC", name = "<init>", descriptor = "(Lclient!BTXFPMEV;ILjava/net/Socket;)V")
	public Class37(@OriginalArg(0) Applet_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Socket arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg0;
			this.aSocket1 = arg2;
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("52541, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QLBHZVFC", name = "a", descriptor = "()V")
	public void method394() {
		this.aBoolean119 = true;
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
		} catch (@Pc(22) IOException local22) {
			System.out.println("Error closing stream");
		}
		this.aBoolean120 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray8 = null;
	}

	@OriginalMember(owner = "client!QLBHZVFC", name = "b", descriptor = "()I")
	public int method395() throws IOException {
		return this.aBoolean119 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!QLBHZVFC", name = "c", descriptor = "()I")
	public int method396() throws IOException {
		return this.aBoolean119 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!QLBHZVFC", name = "a", descriptor = "([BII)V")
	public void method397(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean119) {
			return;
		}
		while (arg2 > 0) {
			@Pc(11) int local11 = this.anInputStream1.read(arg0, arg1, arg2);
			if (local11 <= 0) {
				throw new IOException("EOF");
			}
			arg1 += local11;
			arg2 -= local11;
		}
	}

	@OriginalMember(owner = "client!QLBHZVFC", name = "a", descriptor = "([BIII)V")
	public void method398(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		try {
			if (!this.aBoolean119) {
				if (this.aBoolean121) {
					this.aBoolean121 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray8 == null) {
					this.aByteArray8 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(30) int local30 = 0; local30 < arg1; local30++) {
						this.aByteArray8[this.anInt575] = arg0[local30 + 0];
						this.anInt575 = (this.anInt575 + 1) % 5000;
						if (this.anInt575 == (this.anInt574 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean120) {
						this.aBoolean120 = true;
						this.anApplet_Sub1_2.method579(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("14281, " + arg0 + ", " + arg1 + ", " + 0 + ", " + -4632 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QLBHZVFC", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean120) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt575 == this.anInt574) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean120) {
					return;
				}
				local27 = this.anInt574;
				if (this.anInt575 >= this.anInt574) {
					local38 = this.anInt575 - this.anInt574;
				} else {
					local38 = 5000 - this.anInt574;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray8, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean121 = true;
				}
				this.anInt574 = (this.anInt574 + local38) % 5000;
				try {
					if (this.anInt575 == this.anInt574) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean121 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!QLBHZVFC", name = "a", descriptor = "(B)V")
	public void method399(@OriginalArg(0) byte arg0) {
		try {
			System.out.println("dummy:" + this.aBoolean119);
			System.out.println("tcycl:" + this.anInt574);
			System.out.println("tnum:" + this.anInt575);
			System.out.println("writer:" + this.aBoolean120);
			if (arg0 != -32) {
				this.anInt573 = 158;
			}
			System.out.println("ioerror:" + this.aBoolean121);
			try {
				System.out.println("available:" + this.method396());
			} catch (@Pc(67) IOException local67) {
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("8250, " + arg0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}
}
