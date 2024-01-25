import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class67_Sub2 extends Class67 {

	@OriginalMember(owner = "client!en", name = "h", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!en", name = "l", descriptor = "I")
	private int anInt2347 = 1;

	@OriginalMember(owner = "client!en", name = "j", descriptor = "I")
	private int anInt2348 = 0;

	@OriginalMember(owner = "client!en", name = "g", descriptor = "J")
	private long aLong67 = 0L;

	@OriginalMember(owner = "client!en", name = "i", descriptor = "J")
	private long aLong68 = 0L;

	@OriginalMember(owner = "client!en", name = "k", descriptor = "J")
	private long aLong69 = 0L;

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)J")
	@Override
	protected long method5457() {
		this.aLong69 += this.method2043();
		return this.aLong69 < this.aLong67 ? (this.aLong67 - this.aLong69) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZJ)I")
	@Override
	protected int method5460(@OriginalArg(1) long arg0) {
		if (this.aLong69 < this.aLong67) {
			this.aLong68 += this.aLong67 - this.aLong69;
			this.aLong69 += this.aLong67 - this.aLong69;
			this.aLong67 += arg0;
			return 1;
		}
		@Pc(13) int local13 = 0;
		do {
			local13++;
			this.aLong67 += arg0;
		} while (local13 < 10 && this.aLong67 < this.aLong69);
		if (this.aLong69 > this.aLong67) {
			this.aLong67 = this.aLong69;
		}
		return local13;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)V")
	@Override
	public void method5454() {
		if (this.aLong67 > this.aLong69) {
			this.aLong69 += this.aLong67 - this.aLong69;
		}
		this.aLong68 = 0L;
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(I)J")
	@Override
	public long method5453() {
		return this.aLong69;
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(I)J")
	private long method2043() {
		@Pc(16) long local16 = Static515.method7499(107) * 1000000L;
		@Pc(22) long local22 = local16 - this.aLong68;
		this.aLong68 = local16;
		if (local22 > -5000000000L && local22 < 5000000000L) {
			this.aLongArray5[this.anInt2348] = local22;
			if (this.anInt2347 < 10) {
				this.anInt2347++;
			}
			this.anInt2348 = (this.anInt2348 + 1) % 10;
		}
		@Pc(67) long local67 = 0L;
		for (@Pc(69) int local69 = 1; local69 <= this.anInt2347; local69++) {
			local67 += this.aLongArray5[(this.anInt2348 + 10 - local69) % 10];
		}
		return local67 / (long) this.anInt2347;
	}
}
