import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class140_Sub1 extends Class140 {

	@OriginalMember(owner = "client!kr", name = "k", descriptor = "I")
	private int anInt3612 = 1;

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!kr", name = "j", descriptor = "J")
	private long aLong116 = 0L;

	@OriginalMember(owner = "client!kr", name = "i", descriptor = "I")
	private int anInt3611 = 0;

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "J")
	private long aLong118 = 0L;

	@OriginalMember(owner = "client!kr", name = "l", descriptor = "J")
	private long aLong117 = 0L;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)J")
	private long method2903() {
		@Pc(4) long local4 = Static110.method1702() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong117;
		this.aLong117 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray6[this.anInt3611] = local10;
			this.anInt3611 = (this.anInt3611 + 1) % 10;
			if (this.anInt3612 < 10) {
				this.anInt3612++;
			}
		}
		@Pc(61) long local61 = 0L;
		for (@Pc(63) int local63 = 1; local63 <= this.anInt3612; local63++) {
			local61 += this.aLongArray6[(this.anInt3611 + 10 - local63) % 10];
		}
		return local61 / (long) this.anInt3612;
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)J")
	@Override
	public long method5403() {
		return this.aLong116;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BI)I")
	@Override
	public int method5400(@OriginalArg(1) int arg0) {
		@Pc(10) long local10 = (long) arg0 * 1000000L;
		this.aLong116 += this.method2903();
		if (this.aLong118 > this.aLong116) {
			Static429.method5376((this.aLong118 - this.aLong116) / 1000000L);
			this.aLong117 += this.aLong118 - this.aLong116;
			this.aLong116 += this.aLong118 - this.aLong116;
			this.aLong118 += local10;
			return 1;
		}
		@Pc(67) int local67 = 0;
		do {
			local67++;
			this.aLong118 += local10;
		} while (local67 < 10 && this.aLong118 < this.aLong116);
		if (this.aLong118 < this.aLong116) {
			this.aLong118 = this.aLong116;
		}
		return local67;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	@Override
	public void method5399() {
		if (this.aLong116 < this.aLong118) {
			this.aLong116 += this.aLong118 - this.aLong116;
		}
		this.aLong117 = 0L;
	}
}
