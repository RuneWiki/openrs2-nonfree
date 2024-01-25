import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
	public static void method6744() {
		for (@Pc(9) int local9 = 0; local9 < Static280.anInt5512; local9++) {
			@Pc(14) int local14 = Static50.anIntArray777[local9];
			@Pc(22) Class47_Sub2_Sub3_Sub1 local22 = ((Class1_Sub10) Static258.aClass174_15.method4422((long) local14)).aClass47_Sub2_Sub3_Sub1_2;
			@Pc(26) int local26 = Static255.aClass1_Sub13_Sub2_2.method3043();
			if ((local26 & 0x8) != 0) {
				local26 += Static255.aClass1_Sub13_Sub2_2.method3043() << 8;
			}
			@Pc(51) int local51;
			@Pc(55) int local55;
			if ((local26 & 0x20) != 0) {
				local51 = Static255.aClass1_Sub13_Sub2_2.method3066();
				local55 = Static255.aClass1_Sub13_Sub2_2.method3016();
				local22.method4363(local51, Static416.anInt7252, local55);
			}
			if ((local26 & 0x2000) != 0) {
				local51 = Static255.aClass1_Sub13_Sub2_2.method3057();
				@Pc(77) int[] local77 = new int[local51];
				@Pc(80) int[] local80 = new int[local51];
				@Pc(83) int[] local83 = new int[local51];
				for (@Pc(85) int local85 = 0; local85 < local51; local85++) {
					@Pc(90) int local90 = Static255.aClass1_Sub13_Sub2_2.method3056();
					if (local90 == 65535) {
						local90 = -1;
					}
					local77[local85] = local90;
					local80[local85] = Static255.aClass1_Sub13_Sub2_2.method3043();
					local83[local85] = Static255.aClass1_Sub13_Sub2_2.method3027();
				}
				Static225.method3959(local22, local83, local77, local80);
			}
			if ((local26 & 0x2) != 0) {
				local22.aString35 = Static255.aClass1_Sub13_Sub2_2.method3034();
				local22.anInt5043 = 100;
			}
			if ((local26 & 0x10) != 0) {
				local51 = Static255.aClass1_Sub13_Sub2_2.method3066();
				local55 = Static255.aClass1_Sub13_Sub2_2.method3043();
				local22.method4363(local51, Static416.anInt7252, local55);
				local22.anInt5046 = Static416.anInt7252 + 300;
				local22.anInt5062 = Static255.aClass1_Sub13_Sub2_2.method3043();
			}
			if ((local26 & 0x4) != 0) {
				if (local22.aClass238_1.method5861()) {
					Static59.method1643(local22);
				}
				local22.method3708(Static345.aClass222_1.method5587(Static255.aClass1_Sub13_Sub2_2.method3053()));
				local22.method4367(local22.aClass238_1.anInt6754);
				local22.anInt5001 = local22.aClass238_1.anInt6761 << 3;
				if (local22.aClass238_1.method5861()) {
					Static96.method2188(local22, null, local22.aByte94, null, local22.anIntArray362[0], local22.anIntArray361[0], 0);
				}
			}
			if ((local26 & 0x80) != 0) {
				local22.anInt5061 = Static255.aClass1_Sub13_Sub2_2.method3035();
				if (local22.anInt5061 == 65535) {
					local22.anInt5061 = -1;
				}
			}
			if ((local26 & 0x100) != 0) {
				local22.anInt5031 = Static255.aClass1_Sub13_Sub2_2.method3073();
				local22.anInt5055 = Static255.aClass1_Sub13_Sub2_2.method3063();
				local22.anInt5064 = Static255.aClass1_Sub13_Sub2_2.method3063();
				local22.anInt5003 = Static255.aClass1_Sub13_Sub2_2.method3073();
				local22.anInt5020 = Static255.aClass1_Sub13_Sub2_2.method3056() + Static416.anInt7252;
				local22.anInt5006 = Static255.aClass1_Sub13_Sub2_2.method3056() + Static416.anInt7252;
				local22.anInt5067 = Static255.aClass1_Sub13_Sub2_2.method3016();
				local22.anInt5082 = 1;
				local22.anInt5064 += local22.anIntArray362[0];
				local22.anInt5031 += local22.anIntArray362[0];
				local22.anInt5003 += local22.anIntArray361[0];
				local22.anInt5080 = 0;
				local22.anInt5055 += local22.anIntArray361[0];
			}
			if ((local26 & 0x200) != 0) {
				local22.aByte49 = Static255.aClass1_Sub13_Sub2_2.method3063();
				local22.aByte48 = Static255.aClass1_Sub13_Sub2_2.method3079();
				local22.aByte47 = Static255.aClass1_Sub13_Sub2_2.method3079();
				local22.aByte46 = (byte) Static255.aClass1_Sub13_Sub2_2.method3016();
				local22.anInt5079 = Static416.anInt7252 + Static255.aClass1_Sub13_Sub2_2.method3027();
				local22.anInt5034 = Static416.anInt7252 + Static255.aClass1_Sub13_Sub2_2.method3035();
			}
			if ((local26 & 0x1000) != 0) {
				local51 = Static255.aClass1_Sub13_Sub2_2.method3053();
				local22.anInt5050 = Static255.aClass1_Sub13_Sub2_2.method3043();
				local22.anInt5015 = Static255.aClass1_Sub13_Sub2_2.method3072();
				local22.aBoolean341 = (local51 & 0x8000) != 0;
				local22.anInt5069 = local51 & 0x7FFF;
				local22.anInt5060 = local22.anInt5050 + Static416.anInt7252 + local22.anInt5069;
			}
			@Pc(446) int local446;
			if ((local26 & 0x800) != 0) {
				local51 = Static255.aClass1_Sub13_Sub2_2.method3027();
				local55 = Static255.aClass1_Sub13_Sub2_2.method3029();
				if (local51 == 65535) {
					local51 = -1;
				}
				local446 = Static255.aClass1_Sub13_Sub2_2.method3043();
				local22.method4357(local55, true, local446, local51);
			}
			if ((local26 & 0x400) != 0) {
				local22.anInt4225 = Static255.aClass1_Sub13_Sub2_2.method3056();
				local22.anInt4213 = Static255.aClass1_Sub13_Sub2_2.method3027();
			}
			if ((local26 & 0x40) != 0) {
				local51 = Static255.aClass1_Sub13_Sub2_2.method3056();
				if (local51 == 65535) {
					local51 = -1;
				}
				local55 = Static255.aClass1_Sub13_Sub2_2.method3072();
				Static137.method2919(local55, local51, local22);
			}
			if ((local26 & 0x1) != 0) {
				local51 = Static255.aClass1_Sub13_Sub2_2.method3035();
				if (local51 == 65535) {
					local51 = -1;
				}
				local55 = Static255.aClass1_Sub13_Sub2_2.method3037();
				local446 = Static255.aClass1_Sub13_Sub2_2.method3043();
				local22.method4357(local55, false, local446, local51);
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IC)Z")
	public static boolean method6745(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(IIII)V")
	public static void method6746(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static542.aByteArrayArrayArray17 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;)V")
	public static void method6747(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static41.anInt1359 = 2;
		Static15.anInt836 = arg1;
		Static54.method3635(arg0, false, arg2);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!qa;B)V")
	public static void method6748(@OriginalArg(0) Class9 arg0) {
		if (Static536.aBoolean650) {
			Static183.method3499(arg0);
		} else {
			Static288.method4853(arg0);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)I")
	public static int method6749(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
