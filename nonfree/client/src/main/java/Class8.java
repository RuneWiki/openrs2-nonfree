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

	@OriginalMember(owner = "client!e", name = "h", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "I")
	private int anInt474;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "I")
	private int anInt475;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "B")
	private byte aByte9 = -14;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "I")
	private int anInt473 = 8;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Z")
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Z")
	private boolean aBoolean116 = false;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Z")
	private boolean aBoolean117 = false;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Lclient!a;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lclient!a;Ljava/net/Socket;B)V")
	public Class8(@OriginalArg(0) Applet_Sub1 arg0, @OriginalArg(1) Socket arg1, @OriginalArg(2) byte arg2) throws IOException {
		try {
			if (arg2 != this.aByte9) {
				for (@Pc(22) int local22 = 1; local22 > 0; local22++) {
				}
			}
			this.anApplet_Sub1_2 = arg0;
			this.aSocket2 = arg1;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket2.getInputStream();
			this.anOutputStream1 = this.aSocket2.getOutputStream();
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("69119, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
	public void method246() {
		this.aBoolean115 = true;
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
		this.aBoolean116 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray3 = null;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()I")
	public int method247() throws IOException {
		return this.aBoolean115 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()I")
	public int method248() throws IOException {
		return this.aBoolean115 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BII)V")
	public void method249(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean115) {
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

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I[BII)V")
	public void method250(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (!this.aBoolean115) {
				if (this.aBoolean117) {
					this.aBoolean117 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray3 == null) {
					this.aByteArray3 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(28) int local28 = 0; local28 < arg2; local28++) {
						this.aByteArray3[this.anInt475] = arg0[local28 + 0];
						this.anInt475 = (this.anInt475 + 1) % 5000;
						if (this.anInt475 == (this.anInt474 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean116) {
						this.aBoolean116 = true;
						this.anApplet_Sub1_2.method94(this, 3);
					}
					this.notify();
				}
				@Pc(90) boolean local90 = false;
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("57568, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean116) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt475 == this.anInt474) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean116) {
					return;
				}
				local27 = this.anInt474;
				if (this.anInt475 >= this.anInt474) {
					local38 = this.anInt475 - this.anInt474;
				} else {
					local38 = 5000 - this.anInt474;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray3, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean117 = true;
				}
				this.anInt474 = (this.anInt474 + local38) % 5000;
				try {
					if (this.anInt475 == this.anInt474) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean117 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public void method251() {
		try {
			System.out.println("dummy:" + this.aBoolean115);
			System.out.println("tcycl:" + this.anInt474);
			System.out.println("tnum:" + this.anInt475);
			System.out.println("writer:" + this.aBoolean116);
			System.out.println("ioerror:" + this.aBoolean117);
			try {
				System.out.println("available:" + this.method248());
			} catch (@Pc(67) IOException local67) {
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("25743, " + 2 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}
}
