import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class93_Sub2 extends Class93 {

	@OriginalMember(owner = "client!nw", name = "f", descriptor = "J")
	private long aLong164 = 0L;

	@OriginalMember(owner = "client!nw", name = "g", descriptor = "J")
	private long aLong165 = 0L;

	@OriginalMember(owner = "client!nw", name = "i", descriptor = "I")
	private int anInt6241 = 0;

	@OriginalMember(owner = "client!nw", name = "h", descriptor = "[J")
	private final long[] aLongArray13 = new long[10];

	@OriginalMember(owner = "client!nw", name = "j", descriptor = "J")
	private long aLong166 = 0L;

	@OriginalMember(owner = "client!nw", name = "k", descriptor = "I")
	private int anInt6242 = 1;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "()V")
	public Class93_Sub2() {
		this.aLong165 = System.nanoTime();
		this.aLong164 = System.nanoTime();
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(B)J")
	private long method5671() {
		@Pc(7) long local7 = System.nanoTime();
		@Pc(12) long local12 = local7 - this.aLong166;
		this.aLong166 = local7;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray13[this.anInt6241] = local12;
			if (this.anInt6242 < 1) {
				this.anInt6242++;
			}
			this.anInt6241 = (this.anInt6241 + 1) % 10;
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt6242; local56++) {
			local54 += this.aLongArray13[(this.anInt6241 + 10 - local56) % 10];
		}
		return local54 / (long) this.anInt6242;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V")
	@Override
	public void method7550() {
		this.aLong166 = 0L;
		if (this.aLong165 < this.aLong164) {
			this.aLong165 += this.aLong164 - this.aLong165;
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method7549(@OriginalArg(1) long arg0) {
		if (this.aLong164 > this.aLong165) {
			this.aLong166 += this.aLong164 - this.aLong165;
			this.aLong165 += this.aLong164 - this.aLong165;
			this.aLong164 += arg0;
			return 1;
		}
		@Pc(19) int local19 = 0;
		do {
			this.aLong164 += arg0;
			local19++;
		} while (local19 < 10 && this.aLong165 > this.aLong164);
		if (this.aLong165 > this.aLong164) {
			this.aLong164 = this.aLong165;
		}
		return local19;
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)J")
	@Override
	protected long method7554() {
		this.aLong165 += this.method5671();
		return this.aLong165 >= this.aLong164 ? 0L : (this.aLong164 - this.aLong165) / 1000000L;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)J")
	@Override
	public long method7551() {
		return this.aLong165;
	}
}
