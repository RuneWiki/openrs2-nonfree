import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class158_Sub3 extends Class158 {

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "J")
	private long aLong221 = 0L;

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
	private int anInt7452 = 0;

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "J")
	private long aLong222 = 0L;

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
	private int anInt7453 = 1;

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "J")
	private long aLong223 = 0L;

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)J")
	private long method5757() {
		@Pc(4) long local4 = Static107.method1707() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong221;
		this.aLong221 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray8[this.anInt7452] = local10;
			this.anInt7452 = (this.anInt7452 + 1) % 10;
			if (this.anInt7453 < 10) {
				this.anInt7453++;
			}
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(61) int local61 = 1; local61 <= this.anInt7453; local61++) {
			local51 += this.aLongArray8[(this.anInt7452 + 10 - local61) % 10];
		}
		return local51 / (long) this.anInt7453;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
	@Override
	public void method5751() {
		this.aLong221 = 0L;
		if (this.aLong222 > this.aLong223) {
			this.aLong223 += this.aLong222 - this.aLong223;
		}
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)J")
	@Override
	public long method5755() {
		return this.aLong223;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)I")
	@Override
	public int method5756(@OriginalArg(0) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong223 += this.method5757();
		if (this.aLong223 < this.aLong222) {
			Static366.method5214((this.aLong222 - this.aLong223) / 1000000L);
			this.aLong221 += this.aLong222 - this.aLong223;
			this.aLong223 += this.aLong222 - this.aLong223;
			this.aLong222 += local4;
			return 1;
		}
		@Pc(30) int local30 = 0;
		do {
			local30++;
			this.aLong222 += local4;
		} while (local30 < 10 && this.aLong222 < this.aLong223);
		if (this.aLong223 > this.aLong222) {
			this.aLong222 = this.aLong223;
		}
		return local30;
	}
}
