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

	@OriginalMember(owner = "client!e", name = "a", descriptor = "I")
	private int anInt469;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "I")
	private int anInt470;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "I")
	private int anInt471;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Z")
	private boolean aBoolean118 = false;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "Z")
	private boolean aBoolean119 = false;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Z")
	private boolean aBoolean120 = false;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!a;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(BLclient!a;Ljava/net/Socket;)V")
	public Class8(@OriginalArg(0) byte arg0, @OriginalArg(1) Applet_Sub1 arg1, @OriginalArg(2) Socket arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg1;
			this.aSocket2 = arg2;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket2.getInputStream();
			this.anOutputStream1 = this.aSocket2.getOutputStream();
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("55219, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
	public void method247() {
		this.aBoolean118 = true;
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
		this.aBoolean119 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray3 = null;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()I")
	public int method248() throws IOException {
		return this.aBoolean118 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()I")
	public int method249() throws IOException {
		return this.aBoolean118 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BII)V")
	public void method250(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean118) {
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

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II[BI)V")
	public void method251(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (!this.aBoolean118) {
				if (this.aBoolean120) {
					this.aBoolean120 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray3 == null) {
					this.aByteArray3 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(28) int local28 = 0; local28 < arg0; local28++) {
						this.aByteArray3[this.anInt471] = arg1[local28 + 0];
						this.anInt471 = (this.anInt471 + 1) % 5000;
						if (this.anInt471 == (this.anInt470 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean119) {
						this.aBoolean119 = true;
						this.anApplet_Sub1_2.method95(this, 3);
					}
					this.notify();
				}
				@Pc(90) boolean local90 = false;
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("16859, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean119) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt471 == this.anInt470) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean119) {
					return;
				}
				local27 = this.anInt470;
				if (this.anInt471 >= this.anInt470) {
					local38 = this.anInt471 - this.anInt470;
				} else {
					local38 = 5000 - this.anInt470;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray3, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean120 = true;
				}
				this.anInt470 = (this.anInt470 + local38) % 5000;
				try {
					if (this.anInt471 == this.anInt470) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean120 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public void method252() {
		try {
			System.out.println("dummy:" + this.aBoolean118);
			System.out.println("tcycl:" + this.anInt470);
			System.out.println("tnum:" + this.anInt471);
			System.out.println("writer:" + this.aBoolean119);
			System.out.println("ioerror:" + this.aBoolean120);
			try {
				System.out.println("available:" + this.method249());
			} catch (@Pc(66) IOException local66) {
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("84958, " + -56 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}
}
