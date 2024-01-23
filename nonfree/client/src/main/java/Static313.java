import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "[I")
	public static int[] anIntArray613 = new int[100];

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
	public static void method4661() {
		@Pc(8) Class138 local8 = Static94.aClass138_1;
		synchronized (Static94.aClass138_1) {
			Static43.anInt981 = Static89.anInt1900;
			Static161.anInt3218++;
			@Pc(32) int local32;
			if (Static310.anInt5532 >= 0) {
				while (Static310.anInt5532 != Static259.anInt4814) {
					local32 = Static81.anIntArray137[Static259.anInt4814];
					Static259.anInt4814 = Static259.anInt4814 + 1 & 0x7F;
					if (local32 >= 0) {
						Static1.aBooleanArray1[local32] = true;
					} else {
						Static1.aBooleanArray1[~local32] = false;
					}
				}
			} else {
				for (local32 = 0; local32 < 112; local32++) {
					Static1.aBooleanArray1[local32] = false;
				}
				Static310.anInt5532 = Static259.anInt4814;
			}
			Static89.anInt1900 = Static1.anInt46;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = 2048 - arg2 & 0x7FF;
		@Pc(18) int local18 = arg6 - 334;
		@Pc(20) int local20 = 0;
		if (local18 < 0) {
			local18 = 0;
		} else if (local18 > 100) {
			local18 = 100;
		}
		@Pc(36) int local36 = 0;
		@Pc(47) int local47 = (Static34.aShort14 - Static199.aShort44) * local18 / 100 + Static199.aShort44;
		@Pc(54) int local54 = 2048 - arg4 & 0x7FF;
		@Pc(60) int local60 = arg0 * local47 >> 8;
		@Pc(62) int local62 = local60;
		@Pc(71) int local71;
		@Pc(82) int local82;
		if (local54 != 0) {
			local71 = Class87.anIntArray173[local54];
			local36 = -local60 * local71 >> 16;
			local82 = Class87.anIntArray177[local54];
			local62 = local82 * local60 >> 16;
		}
		if (local10 != 0) {
			local71 = Class87.anIntArray173[local10];
			local82 = Class87.anIntArray177[local10];
			local20 = local62 * local71 >> 16;
			local62 = local62 * local82 >> 16;
		}
		Static305.anInt5484 = arg2;
		Static273.anInt5035 = arg3 - local20;
		Static283.anInt5144 = arg1 - local36;
		Static53.anInt1161 = arg4;
		Static87.anInt1875 = arg5 - local62;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!si;IIIIIII)V")
	public static void method4663(@OriginalArg(0) Class157 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(13) int local13 = arg5 * arg5 + arg4 * arg4;
		if (local13 > arg3) {
			return;
		}
		@Pc(38) int local38 = Math.min(arg0.anInt4680 / 2, arg0.anInt4689 / 2);
		if (local13 <= local38 * local38) {
			Static29.method519(Static189.aClass1_Sub5_Sub6Array11[arg1], arg6, arg0, arg5, arg2, arg4);
			return;
		}
		local38 -= 10;
		@Pc(51) int local51 = Static69.anInt1492 + (int) Static148.aFloat64 & 0x7FF;
		@Pc(55) int local55 = Class87.anIntArray173[local51];
		@Pc(63) int local63 = local55 * 256 / (Static289.anInt5250 + 256);
		@Pc(67) int local67 = Class87.anIntArray177[local51];
		@Pc(75) int local75 = local67 * 256 / (Static289.anInt5250 + 256);
		@Pc(86) int local86 = local75 * arg5 - arg4 * local63 >> 16;
		@Pc(96) int local96 = local75 * arg4 + local63 * arg5 >> 16;
		@Pc(102) double local102 = Math.atan2((double) local96, (double) local86);
		@Pc(109) int local109 = (int) ((double) local38 * Math.sin(local102));
		@Pc(116) int local116 = (int) ((double) local38 * Math.cos(local102));
		if (Static71.aBoolean165) {
			((Class1_Sub5_Sub6_Sub2) Static304.aClass1_Sub5_Sub6Array15[arg1]).method3215((arg0.anInt4680 / 2 + arg2 + local109) * 16, (arg6 + arg0.anInt4689 / 2 - local116) * 16, (int) (local102 * 10430.378D));
		} else {
			((Class1_Sub5_Sub6_Sub1) Static304.aClass1_Sub5_Sub6Array15[arg1]).method1280(local109 + arg2 + arg0.anInt4680 / 2 - 10, arg0.anInt4689 / 2 + -10 + arg6 + -local116, local102);
		}
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)V")
	public static void method4666() {
		Static116.aClass1_Sub13_Sub1_48.method1887(58);
		Static116.aClass1_Sub13_Sub1_48.method1835(Static82.anInt1827);
	}
}
