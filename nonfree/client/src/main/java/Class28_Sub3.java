import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class28_Sub3 extends Class28 {

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
	private int anInt9686 = 0;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "J")
	private long aLong261 = 0L;

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
	private int anInt9687 = 1;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "J")
	private long aLong262 = 0L;

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "J")
	private long aLong263 = 0L;

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "[J")
	private final long[] aLongArray18 = new long[10];

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
	@Override
	public void method8220() {
		this.aLong263 = 0L;
		if (this.aLong262 < this.aLong261) {
			this.aLong262 += this.aLong261 - this.aLong262;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)J")
	@Override
	protected long method8215() {
		this.aLong262 += this.method8221();
		return this.aLong261 > this.aLong262 ? (this.aLong261 - this.aLong262) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method8217(@OriginalArg(1) long arg0) {
		if (this.aLong261 > this.aLong262) {
			this.aLong263 += this.aLong261 - this.aLong262;
			this.aLong262 += this.aLong261 - this.aLong262;
			this.aLong261 += arg0;
			return 1;
		}
		@Pc(47) int local47 = 0;
		do {
			this.aLong261 += arg0;
			local47++;
		} while (local47 < 10 && this.aLong261 < this.aLong262);
		if (this.aLong261 < this.aLong262) {
			this.aLong261 = this.aLong262;
		}
		return local47;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)J")
	@Override
	public long method8214() {
		return this.aLong262;
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)J")
	private long method8221() {
		@Pc(4) long local4 = Static191.method3071() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong263;
		this.aLong263 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray18[this.anInt9686] = local10;
			if (this.anInt9687 < 10) {
				this.anInt9687++;
			}
			this.anInt9686 = (this.anInt9686 + 1) % 10;
		}
		@Pc(61) long local61 = 0L;
		for (@Pc(63) int local63 = 1; local63 <= this.anInt9687; local63++) {
			local61 += this.aLongArray18[(this.anInt9686 + 10 - local63) % 10];
		}
		return local61 / (long) this.anInt9687;
	}
}
