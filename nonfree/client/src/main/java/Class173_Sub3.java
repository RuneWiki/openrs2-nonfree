import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class173_Sub3 extends Class173 {

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "[J")
	private final long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "J")
	private long aLong195 = 0L;

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
	private int anInt6704 = 0;

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "J")
	private long aLong196 = 0L;

	@OriginalMember(owner = "client!tk", name = "i", descriptor = "J")
	private long aLong197 = 0L;

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
	private int anInt6703 = 1;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)I")
	@Override
	public int method5212(@OriginalArg(0) int arg0) {
		this.aLong197 += this.method5216();
		@Pc(17) long local17 = (long) arg0 * 1000000L;
		if (this.aLong197 < this.aLong195) {
			Static20.method1515((this.aLong195 - this.aLong197) / 1000000L);
			this.aLong196 += this.aLong195 - this.aLong197;
			this.aLong197 += this.aLong195 - this.aLong197;
			this.aLong195 += local17;
			return 1;
		}
		@Pc(29) int local29 = 0;
		do {
			this.aLong195 += local17;
			local29++;
		} while (local29 < 10 && this.aLong197 > this.aLong195);
		if (this.aLong197 > this.aLong195) {
			this.aLong195 = this.aLong197;
		}
		return local29;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)J")
	private long method5216() {
		@Pc(4) long local4 = Static199.method2845() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong196;
		this.aLong196 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray7[this.anInt6704] = local10;
			this.anInt6704 = (this.anInt6704 + 1) % 10;
			if (this.anInt6703 < 10) {
				this.anInt6703++;
			}
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt6703; local58++) {
			local51 += this.aLongArray7[(this.anInt6704 + 10 - local58) % 10];
		}
		return local51 / (long) this.anInt6703;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)J")
	@Override
	public long method5211() {
		return this.aLong197;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
	@Override
	public void method5213() {
		if (this.aLong197 < this.aLong195) {
			this.aLong197 += this.aLong195 - this.aLong197;
		}
		this.aLong196 = 0;
	}
}
