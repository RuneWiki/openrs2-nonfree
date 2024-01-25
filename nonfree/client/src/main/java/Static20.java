import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "[I")
	public static final int[] anIntArray48 = new int[3];

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
	public static int anInt529 = 0;

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "[I")
	public static final int[] anIntArray49 = new int[14];

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "[I")
	public static final int[] anIntArray50 = new int[500];

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "([ILclient!om;Lclient!om;B)V")
	public static void method431(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class246 arg2) {
		Static299.aClass246_141 = arg2;
		Static350.aClass246_238 = arg1;
		if (arg0 != null) {
			Static22.anIntArray52 = arg0;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZ)V")
	public static void method432(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static187.aClass3_Sub11_Sub1_1.method997(Static178.anInt8249) >= 15) {
				@Pc(18) int local18 = Static187.aClass3_Sub11_Sub1_1.method990(15);
				if (local18 != 32767) {
					@Pc(23) boolean local23 = false;
					@Pc(30) Class3_Sub39 local30 = (Class3_Sub39) Static243.aClass310_16.method6601((long) local18);
					@Pc(36) Class9_Sub1_Sub1_Sub2_Sub1 local36;
					if (local30 == null) {
						local36 = new Class9_Sub1_Sub1_Sub2_Sub1();
						local36.anInt6429 = local18;
						local30 = new Class3_Sub39(local36);
						Static243.aClass310_16.method6603(local30, (long) local18);
						Static341.aClass3_Sub39Array1[Static568.anInt9131++] = local30;
						local23 = true;
					}
					local36 = local30.aClass9_Sub1_Sub1_Sub2_Sub1_2;
					Static480.anIntArray603[Static49.anInt1058++] = local18;
					local36.anInt6391 = Static305.anInt5560;
					if (local36.aClass294_1 != null && local36.aClass294_1.method6428()) {
						Static321.method5002(local36);
					}
					@Pc(92) int local92;
					if (arg0) {
						local92 = Static187.aClass3_Sub11_Sub1_1.method990(8);
						if (local92 > 127) {
							local92 -= 256;
						}
					} else {
						local92 = Static187.aClass3_Sub11_Sub1_1.method990(5);
						if (local92 > 15) {
							local92 -= 32;
						}
					}
					@Pc(112) int local112 = Static187.aClass3_Sub11_Sub1_1.method990(1);
					if (local112 == 1) {
						Static4.anIntArray7[Static321.anInt5791++] = local18;
					}
					@Pc(130) int local130 = Static187.aClass3_Sub11_Sub1_1.method990(1);
					@Pc(141) int local141 = (Static187.aClass3_Sub11_Sub1_1.method990(3) + 4 & 0xAF000007) << 11;
					local36.method425(Static510.aClass284_2.method6281(Static187.aClass3_Sub11_Sub1_1.method990(14)));
					@Pc(156) int local156 = Static187.aClass3_Sub11_Sub1_1.method990(2);
					@Pc(163) int local163;
					if (arg0) {
						local163 = Static187.aClass3_Sub11_Sub1_1.method990(8);
						if (local163 > 127) {
							local163 -= 256;
						}
					} else {
						local163 = Static187.aClass3_Sub11_Sub1_1.method990(5);
						if (local163 > 15) {
							local163 -= 32;
						}
					}
					local36.method5565(local36.aClass294_1.anInt7615);
					local36.anInt6383 = local36.aClass294_1.anInt7589 << 3;
					if (local23) {
						local36.method5559(local141, true);
					}
					local36.method417(Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anIntArray517[0] + local92, local156, local130 == 1, local36.method5569(), Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anIntArray518[0] + local163);
					if (local36.aClass294_1.method6428()) {
						Static238.method3980(local36.aByte126, null, local36.anIntArray518[0], 0, local36, null, local36.anIntArray517[0]);
					}
					continue;
				}
			}
			Static187.aClass3_Sub11_Sub1_1.method989();
			return;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method435(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < 1 || arg5 < 1 || Static400.anInt6818 - 2 < arg2 || arg5 > Static271.anInt5050 - 2) {
			return;
		}
		@Pc(27) int local27 = arg7;
		if (arg7 < 3 && Static425.method6053(arg2, arg5)) {
			local27 = arg7 + 1;
		}
		if (!Static278.aClass3_Sub13_Sub1_1.method4485(Static260.anInt4932) && !Static1.method6(Static65.anInt1778, local27, arg5, arg2)) {
			return;
		}
		if (Static554.aClass63ArrayArrayArray4 == null) {
			return;
		}
		Static589.aClass70_Sub1_2.method2214(arg5, arg0, Static4.aClass43_1, arg7, Static221.aClass95Array2[arg7], arg2);
		if (arg4 >= 0) {
			@Pc(73) boolean local73 = Static278.aClass3_Sub13_Sub1_1.aBoolean413;
			Static278.aClass3_Sub13_Sub1_1.aBoolean413 = true;
			Static589.aClass70_Sub1_2.method2216(arg7, Static221.aClass95Array2[arg7], Static4.aClass43_1, arg2, arg5, arg4, arg3, arg6, arg1, local27);
			Static278.aClass3_Sub13_Sub1_1.aBoolean413 = local73;
		}
	}
}
