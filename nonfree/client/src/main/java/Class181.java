import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class181 implements Runnable {

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
	private int anInt5350 = 0;

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
	private int anInt5354 = 0;

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
	private final int anInt5349;

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "[B")
	private final byte[] aByteArray44;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class181(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt5349 = arg1 + 1;
		this.anOutputStream1 = arg0;
		this.aByteArray44 = new byte[this.anInt5349];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(III[B)V")
	public void method4542(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg1.length < arg0) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(58) int local58;
			if (this.anInt5350 <= this.anInt5354) {
				local58 = this.anInt5350 + this.anInt5349 - this.anInt5354 - 1;
			} else {
				local58 = this.anInt5350 - this.anInt5354 - 1;
			}
			if (local58 < arg0) {
				throw new IOException("");
			}
			if (arg0 + this.anInt5354 <= this.anInt5349) {
				Static651.method749(arg1, 0, this.aByteArray44, this.anInt5354, arg0);
			} else {
				@Pc(100) int local100 = this.anInt5349 - this.anInt5354;
				Static651.method749(arg1, 0, this.aByteArray44, this.anInt5354, local100);
				Static651.method749(arg1, local100, this.aByteArray44, 0, arg0 - local100);
			}
			this.anInt5354 = (arg0 + this.anInt5354) % this.anInt5349;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
	public void method4543() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!jq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(27) int local27;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt5354 >= this.anInt5350) {
						local27 = this.anInt5354 - this.anInt5350;
					} else {
						local27 = this.anInt5349 + this.anInt5354 - this.anInt5350;
					}
					if (local27 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(46) InterruptedException local46) {
					}
				}
			}
			try {
				if (this.anInt5349 >= this.anInt5350 + local27) {
					this.anOutputStream1.write(this.aByteArray44, this.anInt5350, local27);
				} else {
					@Pc(82) int local82 = this.anInt5349 - this.anInt5350;
					this.anOutputStream1.write(this.aByteArray44, this.anInt5350, local82);
					this.anOutputStream1.write(this.aByteArray44, 0, local27 - local82);
				}
			} catch (@Pc(102) IOException local102) {
				@Pc(102) IOException local102x = local102;
				synchronized (this) {
					this.anIOException2 = local102x;
					return;
				}
			}
			synchronized (this) {
				this.anInt5350 = (this.anInt5350 + local27) % this.anInt5349;
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
	public void method4544() {
		this.anOutputStream1 = new OutputStream_Sub2();
	}
}
