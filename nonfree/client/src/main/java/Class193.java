import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class193 implements Runnable {

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "Ljava/lang/String;")
	public static final String aString44;

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "Ljava/lang/String;")
	public static final String aString43;

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
	private int anInt4788 = 0;

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
	private int anInt4791 = 0;

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
	private final int anInt4792;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "[B")
	private final byte[] aByteArray52;

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	static {
		@Pc(1) String local1 = "Unknown";
		try {
			local1 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(7) Exception local7) {
		}
		local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(18) Exception local18) {
		}
		local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(29) Exception local29) {
		}
		aString44 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(40) Exception local40) {
		}
		aString43 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(51) Exception local51) {
		}
		local1.toLowerCase();
		local1 = "~/";
		try {
			local1 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(62) Exception local62) {
		}
		new File(local1);
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class193(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt4792 = arg1 + 1;
		this.anOutputStream1 = arg0;
		this.aByteArray52 = new byte[this.anInt4792];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
	public void method3865() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V")
	public void method3866() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B[BII)V")
	public void method3868(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (arg1 < 0 || arg0.length < arg1) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(62) int local62;
			if (this.anInt4788 <= this.anInt4791) {
				local62 = this.anInt4788 + this.anInt4792 - this.anInt4791 - 1;
			} else {
				local62 = this.anInt4788 - this.anInt4791 - 1;
			}
			if (arg1 > local62) {
				throw new IOException("");
			}
			if (arg1 + this.anInt4791 <= this.anInt4792) {
				Static598.method1173(arg0, 0, this.aByteArray52, this.anInt4791, arg1);
			} else {
				@Pc(113) int local113 = this.anInt4792 - this.anInt4791;
				Static598.method1173(arg0, 0, this.aByteArray52, this.anInt4791, local113);
				Static598.method1173(arg0, local113, this.aByteArray52, 0, arg1 - local113);
			}
			this.anInt4791 = (arg1 + this.anInt4791) % this.anInt4792;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!kk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(30) int local30;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt4788 <= this.anInt4791) {
						local30 = this.anInt4791 - this.anInt4788;
					} else {
						local30 = this.anInt4792 + this.anInt4791 - this.anInt4788;
					}
					if (local30 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(48) InterruptedException local48) {
					}
				}
			}
			try {
				if (this.anInt4792 >= local30 + this.anInt4788) {
					this.anOutputStream1.write(this.aByteArray52, this.anInt4788, local30);
				} else {
					@Pc(80) int local80 = this.anInt4792 - this.anInt4788;
					this.anOutputStream1.write(this.aByteArray52, this.anInt4788, local80);
					this.anOutputStream1.write(this.aByteArray52, 0, local30 - local80);
				}
			} catch (@Pc(100) IOException local100) {
				@Pc(100) IOException local100x = local100;
				synchronized (this) {
					this.anIOException2 = local100x;
					return;
				}
			}
			synchronized (this) {
				this.anInt4788 = (local30 + this.anInt4788) % this.anInt4792;
			}
		}
	}
}
