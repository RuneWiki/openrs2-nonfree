import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!b", name = "i", descriptor = "I")
	private int anInt404 = 1;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "J")
	private long aLong13 = 0L;

	@OriginalMember(owner = "client!b", name = "m", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!b", name = "k", descriptor = "I")
	private int anInt403 = 0;

	@OriginalMember(owner = "client!b", name = "j", descriptor = "J")
	private long aLong12 = 0L;

	@OriginalMember(owner = "client!b", name = "h", descriptor = "J")
	private long aLong14 = 0L;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)J")
	private long method373() {
		@Pc(4) long local4 = Static549.method7758() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong13;
		this.aLong13 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray2[this.anInt403] = local10;
			this.anInt403 = (this.anInt403 + 1) % 10;
			if (this.anInt404 < 10) {
				this.anInt404++;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(66) int local66 = 1; local66 <= this.anInt404; local66++) {
			local55 += this.aLongArray2[(this.anInt403 + 10 - local66) % 10];
		}
		return local55 / (long) this.anInt404;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(Z)J")
	@Override
	public long method8356() {
		return this.aLong14;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
	@Override
	public void method8349() {
		this.aLong13 = 0L;
		if (this.aLong14 < this.aLong12) {
			this.aLong14 += this.aLong12 - this.aLong14;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)J")
	@Override
	protected long method8353() {
		this.aLong14 += this.method373();
		return this.aLong12 > this.aLong14 ? (this.aLong12 - this.aLong14) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method8354(@OriginalArg(1) long arg0) {
		if (this.aLong12 > this.aLong14) {
			this.aLong13 += this.aLong12 - this.aLong14;
			this.aLong14 += this.aLong12 - this.aLong14;
			this.aLong12 += arg0;
			return 1;
		}
		@Pc(44) int local44 = 0;
		do {
			this.aLong12 += arg0;
			local44++;
		} while (local44 < 10 && this.aLong12 < this.aLong14);
		if (this.aLong12 < this.aLong14) {
			this.aLong12 = this.aLong14;
		}
		return local44;
	}
}
