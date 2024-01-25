import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class181 implements Runnable {

	@OriginalMember(owner = "client!kv", name = "p", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
	private int anInt5515 = 0;

	@OriginalMember(owner = "client!kv", name = "r", descriptor = "I")
	private int anInt5519 = 0;

	@OriginalMember(owner = "client!kv", name = "s", descriptor = "I")
	private final int anInt5520;

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "[B")
	private final byte[] aByteArray137;

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class181(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt5520 = arg1 + 1;
		this.anOutputStream2 = arg0;
		this.aByteArray137 = new byte[this.anInt5520];
		this.aThread3 = new Thread(this);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V")
	public void method4421() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(B)V")
	public void method4422() {
		this.anOutputStream2 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!kv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(35) int local35;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt5519 < this.anInt5515) {
						local35 = this.anInt5520 + this.anInt5519 - this.anInt5515;
					} else {
						local35 = this.anInt5519 - this.anInt5515;
					}
					if (local35 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(49) InterruptedException local49) {
					}
				}
			}
			try {
				if (local35 + this.anInt5515 <= this.anInt5520) {
					this.anOutputStream2.write(this.aByteArray137, this.anInt5515, local35);
				} else {
					@Pc(81) int local81 = this.anInt5520 - this.anInt5515;
					this.anOutputStream2.write(this.aByteArray137, this.anInt5515, local81);
					this.anOutputStream2.write(this.aByteArray137, 0, local35 - local81);
				}
			} catch (@Pc(101) IOException local101) {
				@Pc(101) IOException local101x = local101;
				synchronized (this) {
					this.anIOException2 = local101x;
					return;
				}
			}
			synchronized (this) {
				this.anInt5515 = (local35 + this.anInt5515) % this.anInt5520;
			}
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(II[BI)V")
	public void method4424(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg1.length < arg0) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(54) int local54;
			if (this.anInt5515 <= this.anInt5519) {
				local54 = this.anInt5520 + this.anInt5515 - this.anInt5519 - 1;
			} else {
				local54 = this.anInt5515 - this.anInt5519 - 1;
			}
			if (local54 < arg0) {
				throw new IOException("");
			}
			if (this.anInt5520 < this.anInt5519 + arg0) {
				@Pc(91) int local91 = this.anInt5520 - this.anInt5519;
				Static604.method6225(arg1, 0, this.aByteArray137, this.anInt5519, local91);
				Static604.method6225(arg1, local91, this.aByteArray137, 0, arg0 - local91);
			} else {
				Static604.method6225(arg1, 0, this.aByteArray137, this.anInt5519, arg0);
			}
			this.anInt5519 = (this.anInt5519 + arg0) % this.anInt5520;
			this.notifyAll();
		}
	}
}
