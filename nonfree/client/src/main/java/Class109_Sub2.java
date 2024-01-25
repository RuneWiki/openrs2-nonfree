import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class109_Sub2 extends Class109 {

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
	private int anInt4633 = 0;

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "J")
	private long aLong118 = 0L;

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
	private int anInt4634 = 1;

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "J")
	private long aLong120 = 0L;

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "J")
	private long aLong119 = 0L;

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)J")
	@Override
	protected long method4081() {
		this.aLong118 += this.method3738();
		return this.aLong118 < this.aLong119 ? (this.aLong119 - this.aLong118) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
	@Override
	public void method4080() {
		if (this.aLong119 > this.aLong118) {
			this.aLong118 += this.aLong119 - this.aLong118;
		}
		this.aLong120 = 0L;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method4079(@OriginalArg(1) long arg0) {
		if (this.aLong118 < this.aLong119) {
			this.aLong120 += this.aLong119 - this.aLong118;
			this.aLong118 += this.aLong119 - this.aLong118;
			this.aLong119 += arg0;
			return 1;
		}
		@Pc(15) int local15 = 0;
		do {
			local15++;
			this.aLong119 += arg0;
		} while (local15 < 10 && this.aLong119 < this.aLong118);
		if (this.aLong118 > this.aLong119) {
			this.aLong119 = this.aLong118;
		}
		return local15;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)J")
	@Override
	public long method4082() {
		return this.aLong118;
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)J")
	private long method3738() {
		@Pc(4) long local4 = Static342.method5463() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong120;
		this.aLong120 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray5[this.anInt4633] = local10;
			this.anInt4633 = (this.anInt4633 + 1) % 10;
			if (this.anInt4634 < 10) {
				this.anInt4634++;
			}
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(61) int local61 = 1; local61 <= this.anInt4634; local61++) {
			local51 += this.aLongArray5[(this.anInt4633 + 10 - local61) % 10];
		}
		return local51 / (long) this.anInt4634;
	}
}
