import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "Z")
	public static boolean aBoolean346 = false;

	@OriginalMember(owner = "client!jo", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString101 = "";

	@OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
	public static int anInt4488 = 0;

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)V")
	public static void method4170() {
		Static125.aClient1.method1563();
		Static259.aClass1_Sub17_Sub2_1.anInt4872 = 0;
		Static43.aClass305_340 = null;
		Static352.aClass1_Sub17_Sub2_2.anInt4872 = 0;
		Static517.aClass305_447 = null;
		Static396.anInt6970 = 0;
		Static508.anInt8899 = 0;
		Static350.aClass305_326 = null;
		Static381.aClass305_360 = null;
		Static545.method8263();
		Static81.aString35 = null;
		Static181.anInt3813 = 0;
		Static161.aClass181Array1 = null;
		Static246.anInt4721 = 0;
		Static330.anInt6194 = 0;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!vi;I)V")
	public static void method4171(@OriginalArg(0) Class20_Sub1_Sub1_Sub2 arg0) {
		for (@Pc(10) Class1_Sub37 local10 = (Class1_Sub37) Static406.aClass295_44.method7543(); local10 != null; local10 = (Class1_Sub37) Static406.aClass295_44.method7540()) {
			if (local10.aClass20_Sub1_Sub1_Sub2_1 == arg0) {
				if (local10.aClass1_Sub4_Sub1_3 != null) {
					Static475.aClass1_Sub4_Sub2_2.method3184(local10.aClass1_Sub4_Sub1_3);
					local10.aClass1_Sub4_Sub1_3 = null;
				}
				local10.method8239();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II[IIIILclient!qt;[IIIIIIIZ)I")
	public static int method4172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class243 arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) boolean arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static430.anIntArrayArray124[local7][local11] = 0;
				Static219.anIntArrayArray45[local7][local11] = 99999999;
			}
		}
		@Pc(57) boolean local57;
		if (arg0 == 1) {
			local57 = Static474.method4197(arg12, arg3, arg5, arg1, arg4, arg6, arg11, arg9, arg8, arg10);
		} else if (arg0 == 2) {
			local57 = Static543.method8253(arg4, arg6, arg1, arg12, arg11, arg3, arg8, arg9, arg5, arg10);
		} else {
			local57 = Static395.method6269(arg4, arg10, arg12, arg11, arg1, arg0, arg8, arg6, arg5, arg3, arg9);
		}
		@Pc(93) int local93 = arg1 - 64;
		@Pc(97) int local97 = arg5 - 64;
		@Pc(99) int local99 = Static106.anInt2252;
		@Pc(101) int local101 = Static140.anInt2808;
		@Pc(109) int local109;
		@Pc(111) int local111;
		@Pc(118) int local118;
		if (!local57) {
			if (!arg13) {
				return -1;
			}
			local109 = Integer.MAX_VALUE;
			local111 = Integer.MAX_VALUE;
			for (local118 = arg10 - 10; local118 <= arg10 + 10; local118++) {
				for (@Pc(124) int local124 = arg8 - 10; local124 <= arg8 + 10; local124++) {
					@Pc(131) int local131 = local118 - local93;
					@Pc(136) int local136 = local124 - local97;
					if (local131 >= 0 && local136 >= 0 && local131 < 128 && local136 < 128 && Static219.anIntArrayArray45[local131][local136] < 100) {
						@Pc(165) int local165 = 0;
						if (arg10 > local118) {
							local165 = arg10 - local118;
						} else if (arg9 + arg10 - 1 < local118) {
							local165 = local118 + 1 - arg9 - arg10;
						}
						@Pc(197) int local197 = 0;
						if (local124 < arg8) {
							local197 = arg8 - local124;
						} else if (local124 > arg12 + arg8 - 1) {
							local197 = local124 + 1 - arg12 - arg8;
						}
						@Pc(241) int local241 = local165 * local165 + local197 * local197;
						if (local241 < local109 || local241 == local109 && Static219.anIntArrayArray45[local131][local136] < local111) {
							local111 = Static219.anIntArrayArray45[local131][local136];
							local99 = local118;
							local101 = local124;
							local109 = local241;
						}
					}
				}
			}
			if (~local109 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg1 == local99 && arg5 == local101) {
			return 0;
		}
		@Pc(312) byte local312 = 0;
		Static159.anIntArray267[0] = local99;
		local109 = local312 + 1;
		Static266.anIntArray423[0] = local101;
		@Pc(334) int local334;
		local111 = local334 = Static430.anIntArrayArray124[local99 - local93][local101 - local97];
		while (arg1 != local99 || local101 != arg5) {
			if (local111 != local334) {
				Static159.anIntArray267[local109] = local99;
				local334 = local111;
				Static266.anIntArray423[local109++] = local101;
			}
			if ((local111 & 0x1) != 0) {
				local101++;
			} else if ((local111 & 0x4) != 0) {
				local101--;
			}
			if ((local111 & 0x2) != 0) {
				local99++;
			} else if ((local111 & 0x8) != 0) {
				local99--;
			}
			local111 = Static430.anIntArrayArray124[local99 - local93][local101 - local97];
		}
		local118 = 0;
		while (local109-- > 0) {
			arg7[local118] = Static159.anIntArray267[local109];
			arg2[local118++] = Static266.anIntArray423[local109];
			if (arg7.length <= local118) {
				break;
			}
		}
		return local118;
	}
}
