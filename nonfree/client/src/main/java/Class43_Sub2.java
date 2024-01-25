import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class43_Sub2 extends Class43 {

	@OriginalMember(owner = "client!ck", name = "k", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "J")
	private long aLong46 = 0L;

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
	private int anInt1311 = 0;

	@OriginalMember(owner = "client!ck", name = "o", descriptor = "J")
	private long aLong47 = 0L;

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
	private int anInt1310 = 1;

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "J")
	private long aLong48 = 0L;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)J")
	@Override
	public long method3557() {
		return this.aLong46;
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)J")
	private long method1303() {
		@Pc(4) long local4 = Static8.method201() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong48;
		this.aLong48 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray2[this.anInt1311] = local10;
			if (this.anInt1310 < 10) {
				this.anInt1310++;
			}
			this.anInt1311 = (this.anInt1311 + 1) % 10;
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt1310; local53++) {
			local51 += this.aLongArray2[(this.anInt1311 + 10 - local53) % 10];
		}
		return local51 / (long) this.anInt1310;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(JI)I")
	@Override
	protected int method3558(@OriginalArg(0) long arg0) {
		if (this.aLong46 < this.aLong47) {
			this.aLong48 += this.aLong47 - this.aLong46;
			this.aLong46 += this.aLong47 - this.aLong46;
			this.aLong47 += arg0;
			return 1;
		}
		@Pc(43) int local43 = 0;
		do {
			local43++;
			this.aLong47 += arg0;
		} while (local43 < 10 && this.aLong46 > this.aLong47);
		if (this.aLong47 < this.aLong46) {
			this.aLong47 = this.aLong46;
		}
		return local43;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)J")
	@Override
	protected long method3561() {
		this.aLong46 += this.method1303();
		return this.aLong47 > this.aLong46 ? (this.aLong47 - this.aLong46) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
	@Override
	public void method3556() {
		this.aLong48 = 0L;
		if (this.aLong47 > this.aLong46) {
			this.aLong46 += this.aLong47 - this.aLong46;
		}
	}
}
