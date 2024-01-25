import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class93_Sub3 extends Class93 {

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "J")
	private long aLong234 = 0L;

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "J")
	private long aLong235 = 0L;

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "J")
	private long aLong236 = 0L;

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
	private int anInt8639 = 0;

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "[J")
	private final long[] aLongArray16 = new long[10];

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
	private int anInt8640 = 1;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	public Class93_Sub3() {
		this.aLong235 = this.aLong234 = jagmisc.nanoTime();
		if (this.aLong234 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)J")
	private long method7557() {
		@Pc(7) long local7 = jagmisc.nanoTime();
		@Pc(13) long local13 = local7 - this.aLong236;
		this.aLong236 = local7;
		if (local13 > -5000000000L && local13 < 5000000000L) {
			this.aLongArray16[this.anInt8639] = local13;
			this.anInt8639 = (this.anInt8639 + 1) % 10;
			if (this.anInt8640 < 1) {
				this.anInt8640++;
			}
		}
		@Pc(56) long local56 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt8640; local58++) {
			local56 += this.aLongArray16[(this.anInt8639 + 10 - local58) % 10];
		}
		return local56 / (long) this.anInt8640;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
	@Override
	public void method7550() {
		this.aLong236 = 0L;
		if (this.aLong235 > this.aLong234) {
			this.aLong234 += this.aLong235 - this.aLong234;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method7549(@OriginalArg(1) long arg0) {
		if (this.aLong234 < this.aLong235) {
			this.aLong236 += this.aLong235 - this.aLong234;
			this.aLong234 += this.aLong235 - this.aLong234;
			this.aLong235 += arg0;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			this.aLong235 += arg0;
			local49++;
		} while (local49 < 10 && this.aLong234 > this.aLong235);
		if (this.aLong235 < this.aLong234) {
			this.aLong235 = this.aLong234;
		}
		return local49;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)J")
	@Override
	public long method7551() {
		return this.aLong234;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)J")
	@Override
	protected long method7554() {
		this.aLong234 += this.method7557();
		return this.aLong235 > this.aLong234 ? (this.aLong235 - this.aLong234) / 1000000L : 0L;
	}
}
