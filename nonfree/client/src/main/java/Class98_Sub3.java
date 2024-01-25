import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wfa")
public final class Class98_Sub3 extends Class98 {

	@OriginalMember(owner = "client!wfa", name = "f", descriptor = "J")
	private long aLong305 = 0L;

	@OriginalMember(owner = "client!wfa", name = "g", descriptor = "J")
	private long aLong306 = 0L;

	@OriginalMember(owner = "client!wfa", name = "i", descriptor = "I")
	private int anInt11241 = 0;

	@OriginalMember(owner = "client!wfa", name = "h", descriptor = "J")
	private long aLong307 = 0L;

	@OriginalMember(owner = "client!wfa", name = "j", descriptor = "[J")
	private final long[] aLongArray22 = new long[10];

	@OriginalMember(owner = "client!wfa", name = "k", descriptor = "I")
	private int anInt11242 = 1;

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "()V")
	public Class98_Sub3() {
		this.aLong306 = this.aLong305 = jagmisc.nanoTime();
		if (this.aLong305 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)J")
	@Override
	public long method9616() {
		return this.aLong305;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Z)V")
	@Override
	public void method9614() {
		if (this.aLong305 < this.aLong306) {
			this.aLong305 += this.aLong306 - this.aLong305;
		}
		this.aLong307 = 0L;
	}

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "(B)J")
	private long method9620() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong307;
		this.aLong307 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray22[this.anInt11241] = local7;
			this.anInt11241 = (this.anInt11241 + 1) % 10;
			if (this.anInt11242 < 1) {
				this.anInt11242++;
			}
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt11242; local56++) {
			local48 += this.aLongArray22[(this.anInt11241 + 10 - local56) % 10];
		}
		return local48 / (long) this.anInt11242;
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(B)J")
	@Override
	protected long method9619() {
		this.aLong305 += this.method9620();
		return this.aLong306 > this.aLong305 ? (this.aLong306 - this.aLong305) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method9613(@OriginalArg(1) long arg0) {
		if (this.aLong306 > this.aLong305) {
			this.aLong307 += this.aLong306 - this.aLong305;
			this.aLong305 += this.aLong306 - this.aLong305;
			this.aLong306 += arg0;
			return 1;
		}
		@Pc(47) int local47 = 0;
		do {
			local47++;
			this.aLong306 += arg0;
		} while (local47 < 10 && this.aLong306 < this.aLong305);
		if (this.aLong305 > this.aLong306) {
			this.aLong306 = this.aLong305;
		}
		return local47;
	}
}
