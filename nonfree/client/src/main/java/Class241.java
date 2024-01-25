import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nha")
public final class Class241 implements Runnable {

	@OriginalMember(owner = "client!nha", name = "g", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!nha", name = "k", descriptor = "I")
	private int anInt6581 = 0;

	@OriginalMember(owner = "client!nha", name = "l", descriptor = "I")
	private int anInt6582 = 0;

	@OriginalMember(owner = "client!nha", name = "f", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!nha", name = "e", descriptor = "I")
	private final int anInt6577;

	@OriginalMember(owner = "client!nha", name = "q", descriptor = "[B")
	private final byte[] aByteArray76;

	@OriginalMember(owner = "client!nha", name = "p", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class241(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt6577 = arg1 + 1;
		this.aByteArray76 = new byte[this.anInt6577];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!nha", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(34) int local34;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt6581 > this.anInt6582) {
						local34 = this.anInt6577 + this.anInt6582 - this.anInt6581;
					} else {
						local34 = this.anInt6582 - this.anInt6581;
					}
					if (local34 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(52) InterruptedException local52) {
					}
				}
			}
			try {
				if (local34 + this.anInt6581 <= this.anInt6577) {
					this.anOutputStream1.write(this.aByteArray76, this.anInt6581, local34);
				} else {
					@Pc(84) int local84 = this.anInt6577 - this.anInt6581;
					this.anOutputStream1.write(this.aByteArray76, this.anInt6581, local84);
					this.anOutputStream1.write(this.aByteArray76, 0, local34 - local84);
				}
			} catch (@Pc(104) IOException local104) {
				@Pc(104) IOException local104x = local104;
				synchronized (this) {
					this.anIOException1 = local104x;
					return;
				}
			}
			synchronized (this) {
				this.anInt6581 = (local34 + this.anInt6581) % this.anInt6577;
			}
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(II[BI)V")
	public void method5575(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (arg1 < 0 || arg1 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(62) int local62;
			if (this.anInt6582 >= this.anInt6581) {
				local62 = this.anInt6581 + this.anInt6577 - this.anInt6582 - 1;
			} else {
				local62 = this.anInt6581 - this.anInt6582 - 1;
			}
			if (local62 < arg1) {
				throw new IOException("");
			}
			if (arg1 + this.anInt6582 > this.anInt6577) {
				@Pc(94) int local94 = this.anInt6577 - this.anInt6582;
				Static679.method1563(arg0, 0, this.aByteArray76, this.anInt6582, local94);
				Static679.method1563(arg0, local94, this.aByteArray76, 0, arg1 - local94);
			} else {
				Static679.method1563(arg0, 0, this.aByteArray76, this.anInt6582, arg1);
			}
			this.anInt6582 = (arg1 + this.anInt6582) % this.anInt6577;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)V")
	public void method5576() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "(B)V")
	public void method5577() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(37) InterruptedException local37) {
		}
	}
}
