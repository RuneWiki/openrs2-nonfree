import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class39_Sub2 extends Class39 {

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "J")
	private long aLong182 = 0L;

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "J")
	private long aLong183 = 0L;

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "[J")
	private final long[] aLongArray12 = new long[10];

	@OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
	private int anInt4621 = 1;

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
	private int anInt4622 = 0;

	@OriginalMember(owner = "client!jo", name = "j", descriptor = "J")
	private long aLong184 = 0L;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "()V")
	public Class39_Sub2() {
		this.aLong182 = this.aLong183 = jagmisc.nanoTime();
		if (this.aLong183 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)J")
	@Override
	public long method4913() {
		return this.aLong183;
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
	@Override
	public void method4915() {
		if (this.aLong182 > this.aLong183) {
			this.aLong183 += this.aLong182 - this.aLong183;
		}
		this.aLong184 = 0L;
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)J")
	private long method4023() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong184;
		this.aLong184 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray12[this.anInt4622] = local7;
			this.anInt4622 = (this.anInt4622 + 1) % 10;
			if (this.anInt4621 < 1) {
				this.anInt4621++;
			}
		}
		@Pc(46) long local46 = 0L;
		for (@Pc(48) int local48 = 1; local48 <= this.anInt4621; local48++) {
			local46 += this.aLongArray12[(this.anInt4622 + 10 - local48) % 10];
		}
		return local46 / (long) this.anInt4621;
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)J")
	@Override
	protected long method4917() {
		this.aLong183 += this.method4023();
		return this.aLong183 < this.aLong182 ? (this.aLong182 - this.aLong183) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method4919(@OriginalArg(1) long arg0) {
		if (this.aLong182 > this.aLong183) {
			this.aLong184 += this.aLong182 - this.aLong183;
			this.aLong183 += this.aLong182 - this.aLong183;
			this.aLong182 += arg0;
			return 1;
		}
		@Pc(44) int local44 = 0;
		do {
			this.aLong182 += arg0;
			local44++;
		} while (local44 < 10 && this.aLong183 > this.aLong182);
		if (this.aLong182 < this.aLong183) {
			this.aLong182 = this.aLong183;
		}
		return local44;
	}
}
