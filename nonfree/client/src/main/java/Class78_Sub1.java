import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class78_Sub1 extends Class78 {

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "J")
	private long aLong94 = 0L;

	@OriginalMember(owner = "client!ik", name = "m", descriptor = "J")
	private long aLong93 = 0L;

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "J")
	private long aLong92 = 0L;

	@OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
	private int anInt4692 = 1;

	@OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
	private int anInt4691 = 0;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)J")
	@Override
	public long method6575() {
		return this.aLong93;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)V")
	@Override
	public void method6582() {
		this.aLong92 = 0L;
		if (this.aLong93 < this.aLong94) {
			this.aLong93 += this.aLong94 - this.aLong93;
		}
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)J")
	private long method4036() {
		@Pc(4) long local4 = Static174.method3502() * 1000000L;
		@Pc(9) long local9 = local4 - this.aLong92;
		this.aLong92 = local4;
		if (local9 > -5000000000L && local9 < 5000000000L) {
			this.aLongArray5[this.anInt4691] = local9;
			this.anInt4691 = (this.anInt4691 + 1) % 10;
			if (this.anInt4692 < 10) {
				this.anInt4692++;
			}
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt4692; local56++) {
			local48 += this.aLongArray5[(this.anInt4691 + 10 - local56) % 10];
		}
		return local48 / (long) this.anInt4692;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)J")
	@Override
	protected long method6573() {
		this.aLong93 += this.method4036();
		return this.aLong94 > this.aLong93 ? (this.aLong94 - this.aLong93) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method6576(@OriginalArg(1) long arg0) {
		if (this.aLong93 < this.aLong94) {
			this.aLong92 += this.aLong94 - this.aLong93;
			this.aLong93 += this.aLong94 - this.aLong93;
			this.aLong94 += arg0;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			this.aLong94 += arg0;
			local49++;
		} while (local49 < 10 && this.aLong94 < this.aLong93);
		if (this.aLong94 < this.aLong93) {
			this.aLong94 = this.aLong93;
		}
		return local49;
	}
}
