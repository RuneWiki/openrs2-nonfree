import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public abstract class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IBIJ)V")
	protected final void method1464(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(18) int local18 = (int) ((double) arg1 * Math.pow(0.1D, (double) arg0 * 5.0E-4D) + 0.5D);
		if (local18 == Static11.anInt315) {
			return;
		}
		Static11.anInt315 = local18;
		for (@Pc(30) int local30 = 0; local30 < 16; local30++) {
			@Pc(35) int local35 = Static42.method1473(local30);
			this.method1465(local30 + 176, 7, local35 >> 7, arg2);
			this.method1465(local30 + 176, 39, local35 & 0x7F, arg2);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIJ)V")
	protected abstract void method1465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(IIIJ)Z")
	protected final boolean method1466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		if ((arg0 & 0xF0) == 176) {
			@Pc(17) int local17;
			@Pc(24) int local24;
			if (arg1 == 121) {
				this.method1465(arg0, arg1, arg2, arg3);
				local17 = arg0 & 0xF;
				Static50.anIntArray152[local17] = 12800;
				local24 = Static42.method1473(local17);
				this.method1465(arg0, 7, local24 >> 7, arg3);
				this.method1465(arg0, 39, local24 & 0x7F, arg3);
				return true;
			}
			if (arg1 == 7 || arg1 == 39) {
				local17 = arg0 & 0xF;
				if (arg1 == 7) {
					Static50.anIntArray152[local17] = (Static50.anIntArray152[local17] & 0x7F) + (arg2 << 7);
				} else {
					Static50.anIntArray152[local17] = (Static50.anIntArray152[local17] & 0x3F80) + arg2;
				}
				local24 = Static42.method1473(local17);
				this.method1465(arg0, 7, local24 >> 7, arg3);
				this.method1465(arg0, 39, local24 & 0x7F, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(JI)V")
	protected final void method1467(@OriginalArg(0) long arg0) {
		for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
			this.method1465(local7 + 176, 123, 0, arg0);
		}
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			this.method1465(local25 + 176, 120, 0, arg0);
		}
		for (@Pc(49) int local49 = 0; local49 < 16; local49++) {
			this.method1465(local49 + 176, 121, 0, arg0);
		}
		for (@Pc(67) int local67 = 0; local67 < 16; local67++) {
			this.method1465(local67 + 176, 0, 0, arg0);
		}
		for (@Pc(83) int local83 = 0; local83 < 16; local83++) {
			this.method1465(local83 + 176, 32, 0, arg0);
		}
		for (@Pc(101) int local101 = 0; local101 < 16; local101++) {
			this.method1465(local101 + 192, 0, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IJB)V")
	protected final void method1469(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		Static11.anInt315 = arg0;
		for (@Pc(13) int local13 = 0; local13 < 16; local13++) {
			Static50.anIntArray152[local13] = 12800;
		}
		for (@Pc(27) int local27 = 0; local27 < 16; local27++) {
			@Pc(32) int local32 = Static42.method1473(local27);
			this.method1465(local27 + 176, 7, local32 >> 7, arg1);
			this.method1465(local27 + 176, 39, local32 & 0x7F, arg1);
		}
	}
}
