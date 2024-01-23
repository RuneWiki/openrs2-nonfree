import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class25_Sub2 extends Class25 {

	@OriginalMember(owner = "client!th", name = "r", descriptor = "J")
	private long aLong179 = 0L;

	@OriginalMember(owner = "client!th", name = "s", descriptor = "J")
	private long aLong180 = 0L;

	@OriginalMember(owner = "client!th", name = "t", descriptor = "J")
	private long aLong181 = 0L;

	@OriginalMember(owner = "client!th", name = "w", descriptor = "I")
	private int anInt5116 = 0;

	@OriginalMember(owner = "client!th", name = "v", descriptor = "[J")
	private long[] aLongArray10 = new long[10];

	@OriginalMember(owner = "client!th", name = "u", descriptor = "I")
	private int anInt5115 = 1;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	public Class25_Sub2() {
		this.aLong179 = this.aLong180 = jagmisc.nanoTime();
		if (this.aLong180 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)I")
	@Override
	public int method4574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9 = (long) arg1 * 1000000L;
		Static193.method3169((long) arg0);
		this.aLong180 += this.method4069();
		if (this.aLong180 < this.aLong179) {
			Static193.method3169((this.aLong179 - this.aLong180) / 1000000L);
			this.aLong181 += this.aLong179 - this.aLong180;
			this.aLong180 += this.aLong179 - this.aLong180;
			this.aLong179 += local9;
			return 1;
		}
		@Pc(69) int local69 = 0;
		do {
			local69++;
			this.aLong179 += local9;
		} while (local69 < 10 && this.aLong179 < this.aLong180);
		if (this.aLong180 > this.aLong179) {
			this.aLong179 = this.aLong180;
		}
		return local69;
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(B)J")
	private long method4069() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong181;
		@Pc(8) long local8 = 0L;
		this.aLong181 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray10[this.anInt5116] = local6;
			this.anInt5116 = (this.anInt5116 + 1) % 10;
			if (this.anInt5115 < 1) {
				this.anInt5115++;
			}
		}
		for (@Pc(58) int local58 = 1; local58 <= this.anInt5115; local58++) {
			local8 += this.aLongArray10[(this.anInt5116 + 10 - local58) % 10];
		}
		return local8 / (long) this.anInt5115;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
	@Override
	public void method4579() {
		this.aLong181 = 0L;
		if (this.aLong179 > this.aLong180) {
			this.aLong180 += this.aLong179 - this.aLong180;
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)J")
	@Override
	public long method4580() {
		return this.aLong180;
	}
}
