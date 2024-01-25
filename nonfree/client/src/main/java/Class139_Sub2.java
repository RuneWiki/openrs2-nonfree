import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class139_Sub2 extends Class139 {

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "J")
	private long aLong123 = 0L;

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "J")
	private long aLong124 = 0L;

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
	private int anInt4176 = 0;

	@OriginalMember(owner = "client!ls", name = "k", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
	private int anInt4177 = 1;

	@OriginalMember(owner = "client!ls", name = "j", descriptor = "J")
	private long aLong125 = 0L;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "()V")
	public Class139_Sub2() {
		this.aLong124 = System.nanoTime();
		this.aLong123 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)I")
	@Override
	public int method4296(@OriginalArg(1) int arg0) {
		@Pc(10) long local10 = (long) arg0 * 1000000L;
		this.aLong124 += this.method3722();
		if (this.aLong123 > this.aLong124) {
			Static215.method3855((this.aLong123 - this.aLong124) / 1000000L);
			this.aLong125 += this.aLong123 - this.aLong124;
			this.aLong124 += this.aLong123 - this.aLong124;
			this.aLong123 += local10;
			return 1;
		}
		@Pc(70) int local70 = 0;
		do {
			local70++;
			this.aLong123 += local10;
		} while (local70 < 10 && this.aLong123 < this.aLong124);
		if (this.aLong124 > this.aLong123) {
			this.aLong123 = this.aLong124;
		}
		return local70;
	}

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)V")
	@Override
	public void method4293() {
		this.aLong125 = 0;
		if (this.aLong123 > this.aLong124) {
			this.aLong124 += this.aLong123 - this.aLong124;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)J")
	@Override
	public long method4289() {
		return this.aLong124;
	}

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "(I)J")
	private long method3722() {
		@Pc(6) long local6 = System.nanoTime();
		@Pc(12) long local12 = local6 - this.aLong125;
		this.aLong125 = local6;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray5[this.anInt4176] = local12;
			this.anInt4176 = (this.anInt4176 + 1) % 10;
			if (this.anInt4177 < 1) {
				this.anInt4177++;
			}
		}
		@Pc(53) long local53 = 0L;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt4177; local55++) {
			local53 += this.aLongArray5[(this.anInt4176 + 10 - local55) % 10];
		}
		return local53 / (long) this.anInt4177;
	}
}
