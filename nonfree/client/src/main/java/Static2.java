import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "K", descriptor = "[Lclient!wa;")
	public static final Class1_Sub14[] aClass1_Sub14Array1 = new Class1_Sub14[2048];

	@OriginalMember(owner = "client!aa", name = "L", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_44 = Static118.method2249("Please try again)3");

	@OriginalMember(owner = "client!aa", name = "T", descriptor = "[Lclient!lf;")
	public static final Class54[] aClass54Array1 = new Class54[100];

	@OriginalMember(owner = "client!aa", name = "ab", descriptor = "I")
	public static int anInt66 = 0;

	@OriginalMember(owner = "client!aa", name = "bb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_45 = aClass65_44;

	@OriginalMember(owner = "client!aa", name = "cb", descriptor = "I")
	public static int anInt67 = 0;

	@OriginalMember(owner = "client!aa", name = "jb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_46 = Static118.method2249("<col=ffffff>");

	@OriginalMember(owner = "client!aa", name = "kb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_47 = Static118.method2249(")2");

	@OriginalMember(owner = "client!aa", name = "lb", descriptor = "I")
	public static int anInt73 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBILclient!wd;I)V")
	public static void method48(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class97 arg2, @OriginalArg(4) int arg3) {
		Static16.method298();
		Static194.method3107(arg1, arg3, arg1 + arg2.anInt4353, arg3 - -arg2.anInt4354);
		if (Static31.anInt933 == 2 || Static31.anInt933 == 5) {
			Static194.method3098(arg1, arg3, arg2.anIntArray504, arg2.anIntArray508);
		} else {
			@Pc(33) int local33 = Static105.anInt2597 + Static82.anInt2025 & 0x7FF;
			@Pc(41) int local41 = 464 - Static201.aClass6_Sub4_Sub1_3.anInt3976 / 32;
			@Pc(48) int local48 = Static201.aClass6_Sub4_Sub1_3.anInt3934 / 32 + 48;
			Static189.aClass1_Sub2_Sub5_Sub3_8.method1318(arg1, arg3, arg2.anInt4353, arg2.anInt4354, local48, local41, local33, Static130.anInt3193 + 256, arg2.anIntArray504, arg2.anIntArray508);
			@Pc(83) int local83;
			@Pc(97) int local97;
			for (@Pc(68) int local68 = 0; local68 < Static41.anInt1105; local68++) {
				local83 = Static67.anIntArray164[local68] * 4 + 2 - Static201.aClass6_Sub4_Sub1_3.anInt3934 / 32;
				local97 = Static180.anIntArray448[local68] * 4 + 2 - Static201.aClass6_Sub4_Sub1_3.anInt3976 / 32;
				@Pc(103) Class1_Sub2_Sub13 local103 = Static5.method65(Static100.anIntArray286[local68]);
				if (local103.anIntArray227 != null) {
					local103 = local103.method1430();
					if (local103 == null || local103.anInt1997 == -1) {
						continue;
					}
				}
				Static119.method2263(local97, arg2, arg3, Static28.aClass1_Sub2_Sub5_Sub3Array1[local103.anInt1997], arg1, local83);
			}
			@Pc(178) int local178;
			for (local83 = 0; local83 < 104; local83++) {
				for (local97 = 0; local97 < 104; local97++) {
					@Pc(153) Class91 local153 = Static27.aClass91ArrayArrayArray1[Static207.anInt4425][local83][local97];
					if (local153 != null) {
						@Pc(167) int local167 = local83 * 4 + 2 - Static201.aClass6_Sub4_Sub1_3.anInt3934 / 32;
						local178 = local97 * 4 + 2 - Static201.aClass6_Sub4_Sub1_3.anInt3976 / 32;
						Static119.method2263(local178, arg2, arg3, Static146.aClass1_Sub2_Sub5_Sub3Array11[0], arg1, local167);
					}
				}
			}
			@Pc(260) int local260;
			for (local97 = 0; local97 < Static22.anInt659; local97++) {
				@Pc(210) Class6_Sub4_Sub2 local210 = Static106.aClass6_Sub4_Sub2Array1[Static72.anIntArray197[local97]];
				if (local210 != null && local210.method2996()) {
					@Pc(219) Class1_Sub2_Sub11 local219 = local210.aClass1_Sub2_Sub11_1;
					if (local219 != null && local219.anIntArray151 != null) {
						local219 = local219.method1076();
					}
					if (local219 != null && local219.aBoolean66 && local219.aBoolean68) {
						local178 = local210.anInt3934 / 32 - Static201.aClass6_Sub4_Sub1_3.anInt3934 / 32;
						local260 = local210.anInt3976 / 32 - Static201.aClass6_Sub4_Sub1_3.anInt3976 / 32;
						Static119.method2263(local260, arg2, arg3, Static146.aClass1_Sub2_Sub5_Sub3Array11[1], arg1, local178);
					}
				}
			}
			for (@Pc(280) int local280 = 0; local280 < Static44.anInt1123; local280++) {
				@Pc(288) Class6_Sub4_Sub1 local288 = Static158.aClass6_Sub4_Sub1Array1[Static138.anIntArray385[local280]];
				if (local288 != null && local288.method2996()) {
					local178 = local288.anInt3934 / 32 - Static201.aClass6_Sub4_Sub1_3.anInt3934 / 32;
					local260 = local288.anInt3976 / 32 - Static201.aClass6_Sub4_Sub1_3.anInt3976 / 32;
					@Pc(322) long local322 = local288.aClass65_479.method2475();
					@Pc(324) boolean local324 = false;
					for (@Pc(326) int local326 = 0; local326 < Static33.anInt973; local326++) {
						if (local322 == Static206.aLongArray10[local326] && Static9.anIntArray16[local326] != 0) {
							local324 = true;
							break;
						}
					}
					@Pc(351) boolean local351 = false;
					if (Static201.aClass6_Sub4_Sub1_3.anInt613 != 0 && local288.anInt613 != 0 && local288.anInt613 == Static201.aClass6_Sub4_Sub1_3.anInt613) {
						local351 = true;
					}
					if (local324) {
						Static119.method2263(local260, arg2, arg3, Static146.aClass1_Sub2_Sub5_Sub3Array11[3], arg1, local178);
					} else if (local351) {
						Static119.method2263(local260, arg2, arg3, Static146.aClass1_Sub2_Sub5_Sub3Array11[4], arg1, local178);
					} else {
						Static119.method2263(local260, arg2, arg3, Static146.aClass1_Sub2_Sub5_Sub3Array11[2], arg1, local178);
					}
				}
			}
			@Pc(408) Class49[] local408 = Static44.aClass49Array1;
			@Pc(507) int local507;
			for (local178 = 0; local178 < local408.length; local178++) {
				@Pc(416) Class49 local416 = local408[local178];
				if (local416 != null && local416.anInt2337 != 0 && Static174.anInt3887 % 20 < 10) {
					@Pc(466) int local466;
					@Pc(477) int local477;
					if (local416.anInt2337 == 1 && local416.anInt2327 >= 0 && local416.anInt2327 < Static106.aClass6_Sub4_Sub2Array1.length) {
						@Pc(453) Class6_Sub4_Sub2 local453 = Static106.aClass6_Sub4_Sub2Array1[local416.anInt2327];
						if (local453 != null) {
							local466 = local453.anInt3976 / 32 - Static201.aClass6_Sub4_Sub1_3.anInt3976 / 32;
							local477 = local453.anInt3934 / 32 - Static201.aClass6_Sub4_Sub1_3.anInt3934 / 32;
							Static20.method383(local416.anInt2333, arg1, arg2, local466, arg3, local477);
						}
					}
					if (local416.anInt2337 == 2) {
						local507 = (local416.anInt2336 - Static205.anInt4337) * 4 + 2 - Static201.aClass6_Sub4_Sub1_3.anInt3934 / 32;
						local477 = (local416.anInt2331 - Static58.anInt1543) * 4 + 2 - Static201.aClass6_Sub4_Sub1_3.anInt3976 / 32;
						Static20.method383(local416.anInt2333, arg1, arg2, local477, arg3, local507);
					}
					if (local416.anInt2337 == 10 && local416.anInt2327 >= 0 && local416.anInt2327 < Static158.aClass6_Sub4_Sub1Array1.length) {
						@Pc(557) Class6_Sub4_Sub1 local557 = Static158.aClass6_Sub4_Sub1Array1[local416.anInt2327];
						if (local557 != null) {
							local477 = local557.anInt3934 / 32 - Static201.aClass6_Sub4_Sub1_3.anInt3934 / 32;
							local466 = local557.anInt3976 / 32 - Static201.aClass6_Sub4_Sub1_3.anInt3976 / 32;
							Static20.method383(local416.anInt2333, arg1, arg2, local466, arg3, local477);
						}
					}
				}
			}
			if (Static106.anInt2616 != 0) {
				local260 = Static106.anInt2616 * 4 + 2 - Static201.aClass6_Sub4_Sub1_3.anInt3934 / 32;
				local507 = Static129.anInt3182 * 4 + 2 - Static201.aClass6_Sub4_Sub1_3.anInt3976 / 32;
				Static119.method2263(local507, arg2, arg3, Static200.aClass1_Sub2_Sub5_Sub3_9, arg1, local260);
			}
			Static194.method3096(arg2.anInt4353 / 2 + arg1 - 1, arg3 - -(arg2.anInt4354 / 2) - 1, 3, 3, 16777215);
		}
		Static57.aBooleanArray8[arg0] = true;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V")
	public static void method49() {
		Static82.anInt2025 &= 0x7FF;
		@Pc(7) int local7 = Static15.anInt404 >> 7;
		if (Static54.anInt3674 < 128) {
			Static54.anInt3674 = 128;
		}
		@Pc(27) int local27 = Static21.anInt649 >> 7;
		if (Static54.anInt3674 > 383) {
			Static54.anInt3674 = 383;
		}
		@Pc(40) int local40 = Static171.method2896(Static15.anInt404, Static207.anInt4425, Static21.anInt649);
		@Pc(42) int local42 = 0;
		@Pc(64) int local64;
		if (local7 > 3 && local27 > 3 && local7 < 100 && local27 < 100) {
			for (local64 = local7 - 4; local64 <= local7 + 4; local64++) {
				for (@Pc(69) int local69 = local27 - 4; local69 <= local27 + 4; local69++) {
					@Pc(72) int local72 = Static207.anInt4425;
					if (local72 < 3 && (Static106.aByteArrayArrayArray67[1][local64][local69] & 0x2) == 2) {
						local72++;
					}
					@Pc(98) int local98 = local40 - Static89.anIntArrayArrayArray3[local72][local64][local69];
					if (local42 < local98) {
						local42 = local98;
					}
				}
			}
		}
		local64 = local42 * 192;
		if (local64 > 98048) {
			local64 = 98048;
		}
		if (local64 < 32768) {
			local64 = 32768;
		}
		if (local64 > Static127.anInt3142) {
			Static127.anInt3142 += (local64 - Static127.anInt3142) / 24;
		} else if (local64 < Static127.anInt3142) {
			Static127.anInt3142 += (local64 - Static127.anInt3142) / 80;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIII)V")
	public static void method50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(17) int local17 = arg0 + 1;
		Static51.method893(arg1, Static40.anIntArrayArray11[arg0], arg3, arg2);
		@Pc(26) int local26 = arg4 - 1;
		Static51.method893(arg1, Static40.anIntArrayArray11[arg4], arg3, arg2);
		for (@Pc(32) int local32 = local17; local32 <= local26; local32++) {
			@Pc(38) int[] local38 = Static40.anIntArrayArray11[local32];
			local38[arg2] = local38[arg3] = arg1;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B[[I)V")
	public static void method51(@OriginalArg(1) int[][] arg0) {
		Static40.anIntArrayArray11 = arg0;
	}
}
