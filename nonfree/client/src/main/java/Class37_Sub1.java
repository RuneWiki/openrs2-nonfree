import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class37_Sub1 extends Class37 {

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "J")
	private long aLong41 = 0L;

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "J")
	private long aLong40 = 0L;

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
	private int anInt871 = 0;

	@OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
	private int anInt872 = 1;

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "[J")
	private long[] aLongArray26 = new long[10];

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "J")
	private long aLong42 = 0L;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
	public Class37_Sub1() {
		this.aLong40 = System.nanoTime();
		this.aLong41 = System.nanoTime();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)J")
	@Override
	public long method2929() {
		return this.aLong40;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)J")
	private long method804() {
		@Pc(1) long local1 = 0L;
		@Pc(3) long local3 = System.nanoTime();
		@Pc(14) long local14 = local3 - this.aLong42;
		this.aLong42 = local3;
		if (local14 > -5000000000L && local14 < 5000000000L) {
			this.aLongArray26[this.anInt871] = local14;
			this.anInt871 = (this.anInt871 + 1) % 10;
			if (this.anInt872 < 1) {
				this.anInt872++;
			}
		}
		for (@Pc(54) int local54 = 1; local54 <= this.anInt872; local54++) {
			local1 += this.aLongArray26[(this.anInt871 + 10 - local54) % 10];
		}
		return local1 / (long) this.anInt872;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)I")
	@Override
	public int method2935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		Static202.method3246((long) arg0);
		this.aLong40 += this.method804();
		if (this.aLong40 < this.aLong41) {
			Static202.method3246((this.aLong41 - this.aLong40) / 1000000L);
			this.aLong42 += this.aLong41 - this.aLong40;
			this.aLong40 += this.aLong41 - this.aLong40;
			this.aLong41 += local4;
			return 1;
		}
		@Pc(34) int local34 = 0;
		do {
			local34++;
			this.aLong41 += local4;
		} while (local34 < 10 && this.aLong41 < this.aLong40);
		if (this.aLong41 < this.aLong40) {
			this.aLong41 = this.aLong40;
		}
		return local34;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
	@Override
	public void method2928() {
		if (this.aLong41 > this.aLong40) {
			this.aLong40 += this.aLong41 - this.aLong40;
		}
		this.aLong42 = 0L;
	}
}
