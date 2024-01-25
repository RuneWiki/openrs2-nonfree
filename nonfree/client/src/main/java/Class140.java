import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class140 implements Runnable {

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
	private int anInt5028 = 0;

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
	private int anInt5029 = 0;

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
	private final int anInt5021;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "[B")
	private final byte[] aByteArray32;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class140(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt5021 = arg1 + 1;
		this.aByteArray32 = new byte[this.anInt5021];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[BIB)V")
	public void method4117(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg0 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(58) int local58;
			if (this.anInt5028 >= this.anInt5029) {
				local58 = this.anInt5021 + this.anInt5029 - this.anInt5028 - 1;
			} else {
				local58 = this.anInt5029 - this.anInt5028 - 1;
			}
			if (local58 < arg0) {
				throw new IOException("");
			}
			if (this.anInt5028 + arg0 <= this.anInt5021) {
				Static649.method5532(arg1, 0, this.aByteArray32, this.anInt5028, arg0);
			} else {
				@Pc(101) int local101 = this.anInt5021 - this.anInt5028;
				Static649.method5532(arg1, 0, this.aByteArray32, this.anInt5028, local101);
				Static649.method5532(arg1, local101, this.aByteArray32, 0, arg0 - local101);
			}
			this.anInt5028 = (this.anInt5028 + arg0) % this.anInt5021;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public void method4119() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!ib", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(31) int local31;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt5028 >= this.anInt5029) {
						local31 = this.anInt5028 - this.anInt5029;
					} else {
						local31 = this.anInt5021 + this.anInt5028 - this.anInt5029;
					}
					if (local31 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(50) InterruptedException local50) {
					}
				}
			}
			try {
				if (this.anInt5021 >= local31 + this.anInt5029) {
					this.anOutputStream1.write(this.aByteArray32, this.anInt5029, local31);
				} else {
					@Pc(82) int local82 = this.anInt5021 - this.anInt5029;
					this.anOutputStream1.write(this.aByteArray32, this.anInt5029, local82);
					this.anOutputStream1.write(this.aByteArray32, 0, local31 - local82);
				}
			} catch (@Pc(102) IOException local102) {
				@Pc(102) IOException local102x = local102;
				synchronized (this) {
					this.anIOException1 = local102x;
					return;
				}
			}
			synchronized (this) {
				this.anInt5029 = (local31 + this.anInt5029) % this.anInt5021;
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
	public void method4120() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
	}
}
