import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PWLKORWL")
public final class Class32 implements Runnable {

	@OriginalMember(owner = "client!PWLKORWL", name = "f", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!PWLKORWL", name = "g", descriptor = "I")
	private int anInt518;

	@OriginalMember(owner = "client!PWLKORWL", name = "h", descriptor = "I")
	private int anInt519;

	@OriginalMember(owner = "client!PWLKORWL", name = "d", descriptor = "Z")
	private boolean aBoolean132 = false;

	@OriginalMember(owner = "client!PWLKORWL", name = "i", descriptor = "Z")
	private boolean aBoolean133 = false;

	@OriginalMember(owner = "client!PWLKORWL", name = "j", descriptor = "Z")
	private boolean aBoolean134 = false;

	@OriginalMember(owner = "client!PWLKORWL", name = "e", descriptor = "Lclient!HXUVWQPY;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!PWLKORWL", name = "c", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!PWLKORWL", name = "a", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!PWLKORWL", name = "b", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!PWLKORWL", name = "<init>", descriptor = "(Lclient!HXUVWQPY;Ljava/net/Socket;B)V")
	public Class32(@OriginalArg(0) Applet_Sub1 arg0, @OriginalArg(1) Socket arg1, @OriginalArg(2) byte arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg0;
			this.aSocket2 = arg1;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream2 = this.aSocket2.getInputStream();
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("15719, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PWLKORWL", name = "a", descriptor = "()V")
	public void method420() {
		this.aBoolean132 = true;
		try {
			if (this.anInputStream2 != null) {
				this.anInputStream2.close();
			}
			if (this.anOutputStream2 != null) {
				this.anOutputStream2.close();
			}
			if (this.aSocket2 != null) {
				this.aSocket2.close();
			}
		} catch (@Pc(22) IOException local22) {
			System.out.println("Error closing stream");
		}
		this.aBoolean133 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray13 = null;
	}

	@OriginalMember(owner = "client!PWLKORWL", name = "b", descriptor = "()I")
	public int method421() throws IOException {
		return this.aBoolean132 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!PWLKORWL", name = "c", descriptor = "()I")
	public int method422() throws IOException {
		return this.aBoolean132 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!PWLKORWL", name = "a", descriptor = "([BII)V")
	public void method423(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean132) {
			return;
		}
		while (arg2 > 0) {
			@Pc(11) int local11 = this.anInputStream2.read(arg0, arg1, arg2);
			if (local11 <= 0) {
				throw new IOException("EOF");
			}
			arg1 += local11;
			arg2 -= local11;
		}
	}

	@OriginalMember(owner = "client!PWLKORWL", name = "a", descriptor = "([BIII)V")
	public void method424(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		try {
			if (!this.aBoolean132) {
				if (this.aBoolean134) {
					this.aBoolean134 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray13 == null) {
					this.aByteArray13 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(30) int local30 = 0; local30 < arg1; local30++) {
						this.aByteArray13[this.anInt519] = arg0[local30 + 0];
						this.anInt519 = (this.anInt519 + 1) % 5000;
						if (this.anInt519 == (this.anInt518 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean133) {
						this.aBoolean133 = true;
						this.anApplet_Sub1_2.method587(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("46073, " + arg0 + ", " + arg1 + ", " + 0 + ", " + 0 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PWLKORWL", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean133) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt519 == this.anInt518) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean133) {
					return;
				}
				local27 = this.anInt518;
				if (this.anInt519 >= this.anInt518) {
					local38 = this.anInt519 - this.anInt518;
				} else {
					local38 = 5000 - this.anInt518;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray13, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean134 = true;
				}
				this.anInt518 = (this.anInt518 + local38) % 5000;
				try {
					if (this.anInt519 == this.anInt518) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean134 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!PWLKORWL", name = "a", descriptor = "(I)V")
	public void method425(@OriginalArg(0) int arg0) {
		try {
			System.out.println("dummy:" + this.aBoolean132);
			System.out.println("tcycl:" + this.anInt518);
			System.out.println("tnum:" + this.anInt519);
			@Pc(33) boolean local33 = false;
			System.out.println("writer:" + this.aBoolean133);
			System.out.println("ioerror:" + this.aBoolean134);
			try {
				System.out.println("available:" + this.method422());
			} catch (@Pc(65) IOException local65) {
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("41205, " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}
}
