import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class19_Sub2 extends Class19 {

	@OriginalMember(owner = "client!mr", name = "g", descriptor = "J")
	private long aLong155 = 0L;

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "J")
	private long aLong156 = 0L;

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
	private int anInt5842 = 0;

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "[J")
	private final long[] aLongArray12 = new long[10];

	@OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
	private int anInt5843 = 1;

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "J")
	private long aLong157 = 0L;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "()V")
	public Class19_Sub2() {
		this.aLong155 = this.aLong156 = jagmisc.nanoTime();
		if (this.aLong156 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)J")
	@Override
	public long method7650() {
		return this.aLong156;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(JI)I")
	@Override
	protected int method7649(@OriginalArg(0) long arg0) {
		if (this.aLong155 > this.aLong156) {
			this.aLong157 += this.aLong155 - this.aLong156;
			this.aLong156 += this.aLong155 - this.aLong156;
			this.aLong155 += arg0;
			return 1;
		}
		@Pc(46) int local46 = 0;
		do {
			this.aLong155 += arg0;
			local46++;
		} while (local46 < 10 && this.aLong155 < this.aLong156);
		if (this.aLong155 < this.aLong156) {
			this.aLong155 = this.aLong156;
		}
		return local46;
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)J")
	@Override
	protected long method7651() {
		this.aLong156 += this.method4917();
		return this.aLong155 > this.aLong156 ? (this.aLong155 - this.aLong156) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)J")
	private long method4917() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong157;
		this.aLong157 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray12[this.anInt5842] = local7;
			this.anInt5842 = (this.anInt5842 + 1) % 10;
			if (this.anInt5843 < 1) {
				this.anInt5843++;
			}
		}
		@Pc(46) long local46 = 0L;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt5843; local55++) {
			local46 += this.aLongArray12[(this.anInt5842 + 10 - local55) % 10];
		}
		return local46 / (long) this.anInt5843;
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)V")
	@Override
	public void method7653() {
		this.aLong157 = 0L;
		if (this.aLong156 < this.aLong155) {
			this.aLong156 += this.aLong155 - this.aLong156;
		}
	}
}
