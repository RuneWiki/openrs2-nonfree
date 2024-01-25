import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class125_Sub1 extends Class125 {

	@OriginalMember(owner = "client!hs", name = "h", descriptor = "J")
	private long aLong107 = 0L;

	@OriginalMember(owner = "client!hs", name = "j", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!hs", name = "l", descriptor = "I")
	private int anInt4008 = 0;

	@OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
	private int anInt4009 = 1;

	@OriginalMember(owner = "client!hs", name = "i", descriptor = "J")
	private long aLong108 = 0L;

	@OriginalMember(owner = "client!hs", name = "k", descriptor = "J")
	private long aLong109 = 0L;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZJ)I")
	@Override
	protected int method5262(@OriginalArg(1) long arg0) {
		if (this.aLong109 < this.aLong108) {
			this.aLong107 += this.aLong108 - this.aLong109;
			this.aLong109 += this.aLong108 - this.aLong109;
			this.aLong108 += arg0;
			return 1;
		}
		@Pc(14) int local14 = 0;
		do {
			this.aLong108 += arg0;
			local14++;
		} while (local14 < 10 && this.aLong109 > this.aLong108);
		if (this.aLong109 > this.aLong108) {
			this.aLong108 = this.aLong109;
		}
		return local14;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)J")
	@Override
	public long method5264() {
		return this.aLong109;
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)J")
	private long method3567() {
		@Pc(4) long local4 = Static93.method2172() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong107;
		this.aLong107 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray2[this.anInt4008] = local10;
			if (this.anInt4009 < 10) {
				this.anInt4009++;
			}
			this.anInt4008 = (this.anInt4008 + 1) % 10;
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(51) int local51 = 1; local51 <= this.anInt4009; local51++) {
			local49 += this.aLongArray2[(this.anInt4008 + 10 - local51) % 10];
		}
		return local49 / (long) this.anInt4009;
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
	@Override
	public void method5266() {
		this.aLong107 = 0L;
		if (this.aLong108 > this.aLong109) {
			this.aLong109 += this.aLong108 - this.aLong109;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)J")
	@Override
	protected long method5261() {
		this.aLong109 += this.method3567();
		return this.aLong109 < this.aLong108 ? (this.aLong108 - this.aLong109) / 1000000L : 0L;
	}
}
