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
	private int anInt453;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "I")
	private int anInt454;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "I")
	private int anInt452 = 28523;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "Z")
	private boolean aBoolean112 = true;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Z")
	private boolean aBoolean113 = false;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Z")
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Lclient!a;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(BLjava/net/Socket;Lclient!a;)V")
	public Class8(@OriginalArg(0) byte arg0, @OriginalArg(1) Socket arg1, @OriginalArg(2) Applet_Sub1 arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg2;
			this.aSocket2 = arg1;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket2.getInputStream();
			this.anOutputStream1 = this.aSocket2.getOutputStream();
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("10384, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
	public void method247() {
		this.aBoolean113 = true;
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
		this.aBoolean114 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray3 = null;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()I")
	public int method248() throws IOException {
		return this.aBoolean113 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()I")
	public int method249() throws IOException {
		return this.aBoolean113 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BII)V")
	public void method250(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean113) {
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

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III[B)V")
	public void method251(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		try {
			if (!this.aBoolean113) {
				if (this.aBoolean115) {
					this.aBoolean115 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray3 == null) {
					this.aByteArray3 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
						this.aByteArray3[this.anInt454] = arg1[local38 + 0];
						this.anInt454 = (this.anInt454 + 1) % 5000;
						if (this.anInt454 == (this.anInt453 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean114) {
						this.aBoolean114 = true;
						this.anApplet_Sub1_2.method95(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("33928, " + 0 + ", " + arg0 + ", " + -978 + ", " + arg1 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean114) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt454 == this.anInt453) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean114) {
					return;
				}
				local27 = this.anInt453;
				if (this.anInt454 >= this.anInt453) {
					local38 = this.anInt454 - this.anInt453;
				} else {
					local38 = 5000 - this.anInt453;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray3, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean115 = true;
				}
				this.anInt453 = (this.anInt453 + local38) % 5000;
				try {
					if (this.anInt454 == this.anInt453) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean115 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public void method252(@OriginalArg(0) byte arg0) {
		try {
			System.out.println("dummy:" + this.aBoolean113);
			System.out.println("tcycl:" + this.anInt453);
			System.out.println("tnum:" + this.anInt454);
			@Pc(34) boolean local34 = false;
			System.out.println("writer:" + this.aBoolean114);
			System.out.println("ioerror:" + this.aBoolean115);
			try {
				System.out.println("available:" + this.method249());
			} catch (@Pc(71) IOException local71) {
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("87175, " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
