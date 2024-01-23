import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "[J")
	private long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
	private int anInt1025 = 0;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
	private int anInt1017 = 256;

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
	private int anInt1022 = 1;

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "J")
	private long aLong36 = Static3.method57();

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
	public Class26_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray3[local22] = this.aLong36;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
	@Override
	public void method3055() {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			this.aLongArray3[local7] = 0L;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)I")
	@Override
	public int method3054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anInt1017;
		@Pc(7) int local7 = this.anInt1022;
		this.anInt1017 = 300;
		this.anInt1022 = 1;
		this.aLong36 = Static3.method57();
		if (this.aLongArray3[this.anInt1024] == 0L) {
			this.anInt1022 = local7;
			this.anInt1017 = local4;
		} else if (this.aLong36 > this.aLongArray3[this.anInt1024]) {
			this.anInt1017 = (int) ((long) (arg1 * 2560) / (this.aLong36 - this.aLongArray3[this.anInt1024]));
		}
		if (this.anInt1017 < 25) {
			this.anInt1017 = 25;
		}
		if (this.anInt1017 > 256) {
			this.anInt1017 = 256;
			this.anInt1022 = (int) ((long) arg1 - (this.aLong36 - this.aLongArray3[this.anInt1024]) / 10L);
		}
		if (this.anInt1022 > arg1) {
			this.anInt1022 = arg1;
		}
		this.aLongArray3[this.anInt1024] = this.aLong36;
		this.anInt1024 = (this.anInt1024 + 1) % 10;
		@Pc(135) int local135;
		if (this.anInt1022 > 1) {
			for (local135 = 0; local135 < 10; local135++) {
				if (this.aLongArray3[local135] != 0L) {
					this.aLongArray3[local135] -= -((long) this.anInt1022);
				}
			}
		}
		if (this.anInt1022 < arg0) {
			this.anInt1022 = arg0;
		}
		Static146.method2494((long) this.anInt1022);
		local135 = 0;
		while (this.anInt1025 < 256) {
			this.anInt1025 += this.anInt1017;
			local135++;
		}
		this.anInt1025 &= 0xFF;
		return local135;
	}
}
