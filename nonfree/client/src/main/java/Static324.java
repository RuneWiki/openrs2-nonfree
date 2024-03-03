import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)I", line = 3)
	public static int method5832(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZIIIIIII)V", line = 248)
	public static void method5834(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg2 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(33) int local33 = Class2_Sub28.aShort79 + local7 * (Class87.aShort36 - Class2_Sub28.aShort79) / 100;
		@Pc(39) int local39 = local33 * arg0 >> 8;
		@Pc(46) int local46 = 16384 - arg6 & 0x3FFF;
		@Pc(53) int local53 = 16384 - arg5 & 0x3FFF;
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = local39;
		if (local46 != 0) {
			local57 = Class19.anIntArray178[local46] * -local39 >> 15;
			local59 = local39 * Class19.anIntArray177[local46] >> 15;
		}
		if (local53 != 0) {
			local55 = local59 * Class19.anIntArray178[local53] >> 15;
			local59 = Class19.anIntArray177[local53] * local59 >> 15;
		}
		Static4.anInt87 = arg5;
		Static95.anInt3588 = arg3 - local57;
		Static244.anInt4847 = arg6;
		Static197.anInt3773 = arg4 - local59;
		Static127.anInt6765 = arg1 - local55;
		Static319.anInt5645 = 0;
	}
}
