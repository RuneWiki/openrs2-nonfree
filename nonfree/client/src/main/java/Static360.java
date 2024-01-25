import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "Lclient!dv;")
	public static Class78 aClass78_1;

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_124 = new Class254(97, 3);

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "[Lclient!jaa;")
	public static Class161[] aClass161Array1 = new Class161[50];

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method5793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static173.anIntArrayArrayArray4[arg0][local16][local20] == -Static467.anInt8612) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static494.anInt8859) + 1;
			@Pc(142) int local142 = (arg3 << Static494.anInt8859) + 2;
			@Pc(151) int local151 = Static47.aClass62Array1[arg0].JA(arg1, arg3) + arg5;
			if (!Static220.method3989(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static494.anInt8859) - 1;
			if (!Static220.method3989(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static494.anInt8859) - 1;
			if (!Static220.method3989(local20, local151, local177)) {
				return false;
			} else if (Static220.method3989(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static104.method6580(arg0, arg1, arg3)) {
			local16 = arg1 << Static494.anInt8859;
			local20 = arg3 << Static494.anInt8859;
			return Static220.method3989(local16 + 1, Static47.aClass62Array1[arg0].JA(arg1, arg3) + arg5, local20 + 1) && Static220.method3989(local16 + Static364.anInt7313 - 1, Static47.aClass62Array1[arg0].JA(arg1 + 1, arg3) + arg5, local20 + 1) && Static220.method3989(local16 + Static364.anInt7313 - 1, Static47.aClass62Array1[arg0].JA(arg1 + 1, arg3 + 1) + arg5, local20 + Static364.anInt7313 - 1) && Static220.method3989(local16 + 1, Static47.aClass62Array1[arg0].JA(arg1, arg3 + 1) + arg5, local20 + Static364.anInt7313 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IBLclient!am;IIIZ)V")
	public static void method5794(@OriginalArg(0) int arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (Static521.anInt9062 >= 50 || (arg1 == null || arg1.anIntArrayArray2 == null || arg1.anIntArrayArray2.length <= arg4 || arg1.anIntArrayArray2[arg4] == null)) {
			return;
		}
		@Pc(34) int local34 = arg1.anIntArrayArray2[arg4][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(61) int local61;
		if (arg1.anIntArrayArray2[arg4].length > 1) {
			local61 = (int) (Math.random() * (double) arg1.anIntArrayArray2[arg4].length);
			if (local61 > 0) {
				local38 = arg1.anIntArrayArray2[arg4][local61];
			}
		}
		@Pc(74) int local74 = local34 & 0x1F;
		if (local74 == 0) {
			if (arg5) {
				if (!arg1.aBoolean38) {
					Static445.method6828(local44, local38, 255, 0);
					return;
				}
				Static96.method2072(local44, 0, 255, false, local38);
			}
		} else if (Static104.aClass6_Sub6_Sub1_4.anInt1178 != 0) {
			local61 = arg0 - 256 >> 9;
			@Pc(119) int local119 = arg2 - 256 >> 9;
			aClass161Array1[Static521.anInt9062++] = new Class161((byte) (arg1.aBoolean38 ? 2 : 1), local38, local44, 0, 255, (arg3 << 24) - (-(local61 << 16) - (local119 << 8) - local74));
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!bv;Lclient!oa;Lclient!hk;Z)V")
	public static void method5796(@OriginalArg(0) Class6_Sub7 arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) Class137 arg2) {
		@Pc(10) Class66 local10 = arg2.method3767(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.QA();
		if (local10.b() > local16) {
			local16 = local10.b();
		}
		@Pc(37) int local37 = arg0.anInt1367;
		@Pc(40) int local40 = arg0.anInt1364;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		@Pc(60) int local60;
		@Pc(87) int local87;
		if (arg2.aString46 != null) {
			local42 = Static309.aClass82_6.method2291(arg2.aString46, null, Static175.aStringArray21, null);
			for (local60 = 0; local60 < local42; local60++) {
				@Pc(66) String local66 = Static175.aStringArray21[local60];
				if (local42 - 1 > local60) {
					local66 = local66.substring(0, local66.length() - 4);
				}
				local87 = Static562.aClass269_13.method6552(local66);
				if (local87 > local44) {
					local44 = local87;
				}
			}
			local46 = Static562.aClass269_13.method6548() * local42 + Static562.aClass269_13.method6549() / 2;
		}
		local60 = arg0.anInt1367 + local16 / 2;
		if (local16 + Static461.anInt51 > local37) {
			local37 = Static461.anInt51;
			local60 = local44 / 2 + local16 / 2 + Static461.anInt51 + 10 + 5;
		} else if (local37 > Static461.anInt61 - local16) {
			local37 = Static461.anInt61 - local16;
			local60 = Static461.anInt61 - local44 / 2 - local16 / 2 - 5 - 10;
		}
		@Pc(181) int local181 = arg0.anInt1364;
		if (Static461.anInt56 + local16 > local40) {
			local40 = Static461.anInt56;
			local181 = Static461.anInt56 + local16 / 2 + 10;
		} else if (local40 > Static461.anInt55 - local16) {
			local181 = Static461.anInt55 - local46 - local16 / 2 - 10;
			local40 = Static461.anInt55 - local16;
		}
		local87 = (int) (Math.atan2((double) (local37 - arg0.anInt1367), (double) (local40 - arg0.anInt1364)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method8061((float) local37 + (float) local16 / 2.0F, (float) local40 + (float) local16 / 2.0F, 4096, local87);
		@Pc(263) int local263 = -2;
		@Pc(265) int local265 = -2;
		@Pc(267) int local267 = -2;
		@Pc(269) int local269 = -2;
		if (arg2.aString46 != null) {
			local265 = local181;
			local263 = local60 - local44 / 2 - 5;
			local269 = Static562.aClass269_13.method6548() * local42 + local181 + 3;
			local267 = local44 + local263 + 10;
			if (arg2.anInt4320 != 0) {
				arg1.method5409(local269 - local181, -local263 + local267, arg2.anInt4320, local181, local263);
			}
			if (arg2.anInt4335 != 0) {
				arg1.method5444(local181, arg2.anInt4335, local267 - local263, local263, local269 - local181);
			}
			for (@Pc(335) int local335 = 0; local335 < local42; local335++) {
				@Pc(341) String local341 = Static175.aStringArray21[local335];
				if (local335 < local42 - 1) {
					local341 = local341.substring(0, local341.length() - 4);
				}
				Static562.aClass269_13.method6553(arg1, local341, local60, local181, arg2.anInt4314);
				local181 += Static562.aClass269_13.method6548();
			}
		}
		if (arg2.anInt4328 == -1 && arg2.aString46 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(389) Class6_Sub22 local389 = new Class6_Sub22(arg0);
		local389.anInt3924 = local263;
		local389.anInt3919 = local37 - local16;
		local389.anInt3914 = local37 + local16;
		local389.anInt3921 = local265;
		local389.anInt3916 = local40 + local16;
		local389.anInt3913 = local269;
		local389.anInt3911 = local267;
		local389.anInt3917 = local40 - local16;
		Static305.aClass211_44.method5173(local389);
	}
}
