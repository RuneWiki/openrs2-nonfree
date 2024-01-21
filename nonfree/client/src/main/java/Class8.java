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

	@OriginalMember(owner = "client!e", name = "i", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "I")
	private int anInt494;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "I")
	private int anInt495;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "I")
	private int anInt492 = 69;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "I")
	private int anInt493 = -203;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "Lclient!a;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!a;I)V")
	public Class8(@OriginalArg(0) Socket arg0, @OriginalArg(1) Applet_Sub1 arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg1;
			this.aSocket1 = arg0;
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("48678, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
	public void method235() {
		this.aBoolean80 = true;
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
		this.aBoolean81 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray3 = null;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()I")
	public int method236() throws IOException {
		return this.aBoolean80 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()I")
	public int method237() throws IOException {
		return this.aBoolean80 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BII)V")
	public void method238(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean80) {
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

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BI[BI)V")
	public void method239(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (arg0 == 7) {
				@Pc(6) boolean local6 = false;
			} else {
				this.anInt493 = 227;
			}
			if (!this.aBoolean80) {
				if (this.aBoolean82) {
					this.aBoolean82 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray3 == null) {
					this.aByteArray3 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
						this.aByteArray3[this.anInt495] = arg2[local40 + 0];
						this.anInt495 = (this.anInt495 + 1) % 5000;
						if (this.anInt495 == (this.anInt494 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean81) {
						this.aBoolean81 = true;
						this.anApplet_Sub1_2.method90(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("79109, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean81) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt495 == this.anInt494) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean81) {
					return;
				}
				local27 = this.anInt494;
				if (this.anInt495 >= this.anInt494) {
					local38 = this.anInt495 - this.anInt494;
				} else {
					local38 = 5000 - this.anInt494;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray3, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean82 = true;
				}
				this.anInt494 = (this.anInt494 + local38) % 5000;
				try {
					if (this.anInt495 == this.anInt494) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean82 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public void method240() {
		try {
			System.out.println("dummy:" + this.aBoolean80);
			System.out.println("tcycl:" + this.anInt494);
			System.out.println("tnum:" + this.anInt495);
			System.out.println("writer:" + this.aBoolean81);
			System.out.println("ioerror:" + this.aBoolean82);
			try {
				System.out.println("available:" + this.method237());
			} catch (@Pc(64) IOException local64) {
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("60723, " + 0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}
}
