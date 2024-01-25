import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
	private int anInt3040 = 1;

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "[J")
	private final long[] aLongArray9 = new long[10];

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
	private int anInt3039 = 0;

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "J")
	private long aLong56 = 0L;

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "J")
	private long aLong55 = 0L;

	@OriginalMember(owner = "client!eq", name = "m", descriptor = "J")
	private long aLong57 = 0L;

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)J")
	@Override
	public long method6159() {
		return this.aLong55;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V")
	@Override
	public void method6160() {
		this.aLong56 = 0L;
		if (this.aLong57 > this.aLong55) {
			this.aLong55 += this.aLong57 - this.aLong55;
		}
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(B)J")
	@Override
	protected long method6165() {
		this.aLong55 += this.method2695();
		return this.aLong57 > this.aLong55 ? (this.aLong57 - this.aLong55) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method6158(@OriginalArg(1) long arg0) {
		if (this.aLong57 > this.aLong55) {
			this.aLong56 += this.aLong57 - this.aLong55;
			this.aLong55 += this.aLong57 - this.aLong55;
			this.aLong57 += arg0;
			return 1;
		}
		@Pc(46) int local46 = 0;
		do {
			this.aLong57 += arg0;
			local46++;
		} while (local46 < 10 && this.aLong57 < this.aLong55);
		if (this.aLong57 < this.aLong55) {
			this.aLong57 = this.aLong55;
		}
		return local46;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)J")
	private long method2695() {
		@Pc(4) long local4 = Static547.method7619() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong56;
		this.aLong56 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray9[this.anInt3039] = local10;
			if (this.anInt3040 < 10) {
				this.anInt3040++;
			}
			this.anInt3039 = (this.anInt3039 + 1) % 10;
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(60) int local60 = 1; local60 <= this.anInt3040; local60++) {
			local51 += this.aLongArray9[(this.anInt3039 + 10 - local60) % 10];
		}
		return local51 / (long) this.anInt3040;
	}
}
