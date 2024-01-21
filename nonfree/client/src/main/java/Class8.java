import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!e")
public final class Class8 implements Runnable {

	@OriginalMember(owner = "client!e", name = "g", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "I")
	private int anInt486;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "I")
	private int anInt487;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "I")
	private int anInt485 = -1399;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "Z")
	private boolean aBoolean108 = false;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!a;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Ljava/net/Socket;BLclient!a;)V")
	public Class8(@OriginalArg(0) Socket arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Applet_Sub1 arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg2;
			@Pc(21) boolean local21 = false;
			this.aSocket2 = arg0;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket2.getInputStream();
			this.anOutputStream1 = this.aSocket2.getOutputStream();
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("12383, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
	public void method247() {
		this.aBoolean107 = true;
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
		} catch (@Pc(22) IOException local22) {
			System.out.println("Error closing stream");
		}
		this.aBoolean108 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray3 = null;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()I")
	public int method248() throws IOException {
		return this.aBoolean107 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()I")
	public int method249() throws IOException {
		return this.aBoolean107 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BII)V")
	public void method250(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean107) {
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

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Z[BII)V")
	public void method251(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		try {
			if (!this.aBoolean107) {
				if (this.aBoolean109) {
					this.aBoolean109 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray3 == null) {
					this.aByteArray3 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(31) int local31 = 0; local31 < arg1; local31++) {
						this.aByteArray3[this.anInt487] = arg0[local31 + 0];
						this.anInt487 = (this.anInt487 + 1) % 5000;
						if (this.anInt487 == (this.anInt486 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean108) {
						this.aBoolean108 = true;
						this.anApplet_Sub1_2.method95(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("78596, " + true + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean108) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt487 == this.anInt486) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean108) {
					return;
				}
				local27 = this.anInt486;
				if (this.anInt487 >= this.anInt486) {
					local38 = this.anInt487 - this.anInt486;
				} else {
					local38 = 5000 - this.anInt486;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray3, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean109 = true;
				}
				this.anInt486 = (this.anInt486 + local38) % 5000;
				try {
					if (this.anInt487 == this.anInt486) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean109 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public void method252() {
		try {
			System.out.println("dummy:" + this.aBoolean107);
			System.out.println("tcycl:" + this.anInt486);
			System.out.println("tnum:" + this.anInt487);
			System.out.println("writer:" + this.aBoolean108);
			System.out.println("ioerror:" + this.aBoolean109);
			try {
				System.out.println("available:" + this.method249());
			} catch (@Pc(67) IOException local67) {
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("65589, " + 8 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}
}
