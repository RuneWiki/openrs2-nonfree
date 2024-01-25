import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class159_Sub2 extends Class159 {

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "J")
	private long aLong165 = 0L;

	@OriginalMember(owner = "client!pn", name = "j", descriptor = "J")
	private long aLong166 = 0L;

	@OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
	private int anInt5639 = 0;

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
	private int anInt5638 = 1;

	@OriginalMember(owner = "client!pn", name = "n", descriptor = "J")
	private long aLong167 = 0L;

	@OriginalMember(owner = "client!pn", name = "l", descriptor = "[J")
	private final long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V")
	public Class159_Sub2() {
		this.aLong165 = this.aLong166 = jagmisc.nanoTime();
		if (this.aLong166 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZ)I")
	@Override
	public int method5789(@OriginalArg(0) int arg0) {
		@Pc(11) long local11 = (long) arg0 * 1000000L;
		this.aLong166 += this.method4545();
		if (this.aLong166 < this.aLong165) {
			Static135.method2458((this.aLong165 - this.aLong166) / 1000000L);
			this.aLong167 += this.aLong165 - this.aLong166;
			this.aLong166 += this.aLong165 - this.aLong166;
			this.aLong165 += local11;
			return 1;
		}
		@Pc(70) int local70 = 0;
		do {
			this.aLong165 += local11;
			local70++;
		} while (local70 < 10 && this.aLong166 > this.aLong165);
		if (this.aLong165 < this.aLong166) {
			this.aLong165 = this.aLong166;
		}
		return local70;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
	@Override
	public void method5790() {
		if (this.aLong165 > this.aLong166) {
			this.aLong166 += this.aLong165 - this.aLong166;
		}
		this.aLong167 = 0L;
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)J")
	@Override
	public long method5791() {
		return this.aLong166;
	}

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "(I)J")
	private long method4545() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong167;
		this.aLong167 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray7[this.anInt5639] = local7;
			if (this.anInt5638 < 1) {
				this.anInt5638++;
			}
			this.anInt5639 = (this.anInt5639 + 1) % 10;
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt5638; local56++) {
			local54 += this.aLongArray7[(this.anInt5639 + 10 - local56) % 10];
		}
		return local54 / (long) this.anInt5638;
	}
}
