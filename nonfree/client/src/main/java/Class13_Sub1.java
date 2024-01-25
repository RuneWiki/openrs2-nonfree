import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aha")
public final class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!aha", name = "g", descriptor = "I")
	private int anInt217 = 0;

	@OriginalMember(owner = "client!aha", name = "f", descriptor = "I")
	private int anInt216 = 1;

	@OriginalMember(owner = "client!aha", name = "j", descriptor = "J")
	private long aLong19 = 0L;

	@OriginalMember(owner = "client!aha", name = "k", descriptor = "J")
	private long aLong20 = 0L;

	@OriginalMember(owner = "client!aha", name = "i", descriptor = "J")
	private long aLong18 = 0L;

	@OriginalMember(owner = "client!aha", name = "h", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "(I)J")
	@Override
	public long method6678() {
		return this.aLong19;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(JB)I")
	@Override
	protected int method6673(@OriginalArg(0) long arg0) {
		if (this.aLong19 < this.aLong20) {
			this.aLong18 += this.aLong20 - this.aLong19;
			this.aLong19 += this.aLong20 - this.aLong19;
			this.aLong20 += arg0;
			return 1;
		}
		@Pc(47) int local47 = 0;
		do {
			local47++;
			this.aLong20 += arg0;
		} while (local47 < 10 && this.aLong20 < this.aLong19);
		if (this.aLong20 < this.aLong19) {
			this.aLong20 = this.aLong19;
		}
		return local47;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(B)V")
	@Override
	public void method6672() {
		this.aLong18 = 0L;
		if (this.aLong19 < this.aLong20) {
			this.aLong19 += this.aLong20 - this.aLong19;
		}
	}

	@OriginalMember(owner = "client!aha", name = "c", descriptor = "(B)J")
	private long method225() {
		@Pc(4) long local4 = Static124.method1947() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong18;
		this.aLong18 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray1[this.anInt217] = local10;
			if (this.anInt216 < 10) {
				this.anInt216++;
			}
			this.anInt217 = (this.anInt217 + 1) % 10;
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt216; local53++) {
			local51 += this.aLongArray1[(this.anInt217 + 10 - local53) % 10];
		}
		return local51 / (long) this.anInt216;
	}

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "(B)J")
	@Override
	protected long method6677() {
		this.aLong19 += this.method225();
		return this.aLong20 > this.aLong19 ? (this.aLong20 - this.aLong19) / 1000000L : 0L;
	}
}
