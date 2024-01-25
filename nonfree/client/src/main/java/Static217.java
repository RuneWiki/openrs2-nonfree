import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4043(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg5 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(32) int local32 = local7 * (Static187.aShort43 - Static160.aShort119) / 100 + Static160.aShort119;
		@Pc(38) int local38 = arg0 * local32 >> 8;
		Static165.anInt3552 = local32 * Static165.anInt3548 >> 8;
		@Pc(51) int local51 = 16384 - arg3 & 0x3FFF;
		@Pc(62) int local62 = 16384 - arg1 & 0x3FFF;
		@Pc(64) int local64 = 0;
		@Pc(66) int local66 = 0;
		@Pc(68) int local68 = local38;
		if (local51 != 0) {
			local66 = -local38 * Class12_Sub2.anIntArray204[local51] >> 14;
			local68 = local38 * Class12_Sub2.anIntArray203[local51] >> 14;
		}
		if (local62 != 0) {
			local64 = Class12_Sub2.anIntArray204[local62] * local68 >> 14;
			local68 = Class12_Sub2.anIntArray203[local62] * local68 >> 14;
		}
		Static297.anInt5413 = 0;
		Static598.anInt10387 = arg6 - local68;
		Static152.anInt3290 = arg1;
		Static229.anInt4615 = arg2 - local66;
		Static550.anInt9633 = arg3;
		Static108.anInt1987 = arg4 - local64;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!kja;Z)V")
	public static void method4044(@OriginalArg(0) Class2_Sub8_Sub2 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static318.anInt5798; local3++) {
			@Pc(9) int local9 = Static257.anIntArray250[local3];
			@Pc(13) Class15_Sub3_Sub3_Sub1_Sub1 local13 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local9];
			@Pc(17) int local17 = arg0.method5203();
			if ((local17 & 0x20) != 0) {
				local17 += arg0.method5203() << 8;
			}
			if ((local17 & 0x200) != 0) {
				local17 += arg0.method5203() << 16;
			}
			Static233.method4209(local9, local17, arg0, local13);
		}
	}
}
