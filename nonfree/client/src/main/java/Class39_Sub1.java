import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class39_Sub1 extends Class39 {

	@OriginalMember(owner = "client!caa", name = "i", descriptor = "J")
	private long aLong61 = 0L;

	@OriginalMember(owner = "client!caa", name = "h", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!caa", name = "f", descriptor = "I")
	private int anInt1035 = 1;

	@OriginalMember(owner = "client!caa", name = "g", descriptor = "J")
	private long aLong60 = 0L;

	@OriginalMember(owner = "client!caa", name = "j", descriptor = "I")
	private int anInt1036 = 0;

	@OriginalMember(owner = "client!caa", name = "k", descriptor = "J")
	private long aLong62 = 0L;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method4919(@OriginalArg(1) long arg0) {
		if (this.aLong61 < this.aLong62) {
			this.aLong60 += this.aLong62 - this.aLong61;
			this.aLong61 += this.aLong62 - this.aLong61;
			this.aLong62 += arg0;
			return 1;
		}
		@Pc(13) int local13 = 0;
		do {
			this.aLong62 += arg0;
			local13++;
		} while (local13 < 10 && this.aLong62 < this.aLong61);
		if (this.aLong62 < this.aLong61) {
			this.aLong62 = this.aLong61;
		}
		return local13;
	}

	@OriginalMember(owner = "client!caa", name = "e", descriptor = "(I)J")
	private long method1017() {
		@Pc(6) long local6 = Static60.method1119() * 1000000L;
		@Pc(12) long local12 = local6 - this.aLong60;
		this.aLong60 = local6;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray2[this.anInt1036] = local12;
			this.anInt1036 = (this.anInt1036 + 1) % 10;
			if (this.anInt1035 < 10) {
				this.anInt1035++;
			}
		}
		@Pc(61) long local61 = 0L;
		for (@Pc(63) int local63 = 1; local63 <= this.anInt1035; local63++) {
			local61 += this.aLongArray2[(this.anInt1036 + 10 - local63) % 10];
		}
		return local61 / (long) this.anInt1035;
	}

	@OriginalMember(owner = "client!caa", name = "d", descriptor = "(I)J")
	@Override
	protected long method4917() {
		this.aLong61 += this.method1017();
		return this.aLong62 > this.aLong61 ? (this.aLong62 - this.aLong61) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)J")
	@Override
	public long method4913() {
		return this.aLong61;
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V")
	@Override
	public void method4915() {
		if (this.aLong62 > this.aLong61) {
			this.aLong61 += this.aLong62 - this.aLong61;
		}
		this.aLong60 = 0L;
	}
}
