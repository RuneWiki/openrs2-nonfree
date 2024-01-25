import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class63_Sub3 extends Class63 {

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "J")
	private long aLong182 = 0L;

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "J")
	private long aLong183 = 0L;

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
	private int anInt5588 = 1;

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "[J")
	private final long[] aLongArray10 = new long[10];

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "J")
	private long aLong184 = 0L;

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
	private int anInt5589 = 0;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
	public Class63_Sub3() {
		this.aLong182 = this.aLong183 = jagmisc.nanoTime();
		if (this.aLong183 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)J")
	@Override
	public long method4637() {
		return this.aLong183;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)I")
	@Override
	public int method4643(@OriginalArg(0) int arg0) {
		this.aLong183 += this.method4645();
		@Pc(16) long local16 = (long) arg0 * 1000000L;
		if (this.aLong183 < this.aLong182) {
			Static83.method1499((this.aLong182 - this.aLong183) / 1000000L);
			this.aLong184 += this.aLong182 - this.aLong183;
			this.aLong183 += this.aLong182 - this.aLong183;
			this.aLong182 += local16;
			return 1;
		}
		@Pc(69) int local69 = 0;
		do {
			this.aLong182 += local16;
			local69++;
		} while (local69 < 10 && this.aLong182 < this.aLong183);
		if (this.aLong182 < this.aLong183) {
			this.aLong182 = this.aLong183;
		}
		return local69;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)J")
	private long method4645() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong184;
		this.aLong184 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray10[this.anInt5589] = local7;
			if (this.anInt5588 < 1) {
				this.anInt5588++;
			}
			this.anInt5589 = (this.anInt5589 + 1) % 10;
		}
		@Pc(50) long local50 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt5588; local57++) {
			local50 += this.aLongArray10[(this.anInt5589 + 10 - local57) % 10];
		}
		return local50 / (long) this.anInt5588;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	@Override
	public void method4635() {
		if (this.aLong182 > this.aLong183) {
			this.aLong183 += this.aLong182 - this.aLong183;
		}
		this.aLong184 = 0L;
	}
}
