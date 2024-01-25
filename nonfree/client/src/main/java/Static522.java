import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!vr", name = "rb", descriptor = "F")
	public static float aFloat264;

	@OriginalMember(owner = "client!vr", name = "ub", descriptor = "[[S")
	public static short[][] aShortArrayArray10;

	@OriginalMember(owner = "client!vr", name = "Ab", descriptor = "I")
	public static int anInt9089;

	@OriginalMember(owner = "client!vr", name = "Bb", descriptor = "I")
	public static int anInt9090;

	@OriginalMember(owner = "client!vr", name = "Hb", descriptor = "Lclient!oo;")
	public static Class221 aClass221_5;

	@OriginalMember(owner = "client!vr", name = "ob", descriptor = "[B")
	public static final byte[] aByteArray112 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!vr", name = "Cb", descriptor = "Lclient!ig;")
	public static Class133 aClass133_166 = null;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method7499(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static33.anInt880 = 9;
		Static219.anInt4777 = 0x1 << Static33.anInt880;
		Static467.anInt8424 = Static219.anInt4777 >> 1;
		Static151.anInt3058 = (int) Math.sqrt((double) (Static467.anInt8424 * Static467.anInt8424 + Static467.anInt8424 * Static467.anInt8424));
		Static349.anInt6635 = Static219.anInt4777 >> 2;
		Static263.anInt5492 = Static219.anInt4777;
		Static126.anInt2626 = arg0;
		Static108.anInt2385 = arg1;
		Static345.anInt6586 = arg2;
		Static40.aClass290ArrayArrayArray4 = new Class290[4][Static126.anInt2626][Static108.anInt2385];
		Static163.aClass52Array4 = new Class52[4];
		if (arg3) {
			Static63.anIntArrayArray20 = new int[Static126.anInt2626][Static108.anInt2385];
			Static125.aByteArrayArray9 = new byte[Static126.anInt2626][Static108.anInt2385];
			Static222.aShortArrayArray5 = new short[Static126.anInt2626][Static108.anInt2385];
			Static23.aClass290ArrayArrayArray9 = new Class290[1][Static126.anInt2626][Static108.anInt2385];
			Static238.aClass52Array2 = new Class52[1];
		} else {
			Static63.anIntArrayArray20 = null;
			Static125.aByteArrayArray9 = null;
			Static222.aShortArrayArray5 = null;
			Static23.aClass290ArrayArrayArray9 = null;
			Static238.aClass52Array2 = null;
		}
		if (arg4) {
			Static329.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static513.aClass103Array1 = new Class103[65535];
			Static69.aBooleanArray7 = new boolean[65535];
			Static84.anInt1836 = 0;
		} else {
			Static329.aLongArrayArrayArray1 = null;
			Static513.aClass103Array1 = null;
			Static69.aBooleanArray7 = null;
			Static84.anInt1836 = 0;
		}
		Static124.method7288(false);
		Static410.aClass324Array2 = new Class324[1000];
		Static400.anInt7398 = 0;
		Static384.aClass324Array1 = new Class324[1000];
		Static414.anInt7559 = 0;
		Static40.anIntArrayArrayArray3 = new int[4][Static126.anInt2626 + 1][Static108.anInt2385 + 1];
		Static167.aClass6_Sub1Array1 = new Class6_Sub1[5000];
		Static167.anInt3855 = 0;
		Static30.aBooleanArrayArray3 = new boolean[Static345.anInt6586 + Static345.anInt6586 + 1][Static345.anInt6586 + Static345.anInt6586 + 1];
		Static131.aBooleanArrayArray4 = new boolean[Static345.anInt6586 + Static345.anInt6586 + 2][Static345.anInt6586 + Static345.anInt6586 + 2];
		Static442.aClass7_1 = null;
	}

	@OriginalMember(owner = "client!vr", name = "o", descriptor = "(I)V")
	public static void method7501() {
		for (@Pc(3) int local3 = 0; local3 < Static128.anInt2675; local3++) {
			@Pc(9) Class70 local9 = Static360.aClass70Array1[local3];
			@Pc(11) boolean local11 = false;
			@Pc(138) int local138;
			if (local9.aClass3_Sub9_Sub2_1 == null) {
				local9.anInt2330--;
				if (local9.anInt2330 < (local9.method2063() ? -1500 : -10)) {
					local11 = true;
				} else {
					if (local9.aByte26 == 1 && local9.aClass31_1 == null) {
						local9.aClass31_1 = Static552.method880(Static402.aClass161_107, local9.anInt2332, 0);
						if (local9.aClass31_1 == null) {
							continue;
						}
						local9.anInt2330 += local9.aClass31_1.method878();
					} else if (local9.method2063() && (local9.aClass3_Sub44_1 == null || local9.aClass3_Sub42_Sub1_1 == null)) {
						if (local9.aClass3_Sub44_1 == null) {
							local9.aClass3_Sub44_1 = Static433.method6581(Static135.aClass161_28, local9.anInt2332);
						}
						if (local9.aClass3_Sub44_1 == null) {
							continue;
						}
						if (local9.aClass3_Sub42_Sub1_1 == null) {
							local9.aClass3_Sub42_Sub1_1 = local9.aClass3_Sub44_1.method6589(new int[] { 22050 });
							if (local9.aClass3_Sub42_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local9.anInt2330 < 0) {
						if (local9.anInt2334 == 0) {
							local138 = local9.anInt2335 * (local9.aByte26 == 3 ? Static7.aClass3_Sub15_Sub1_1.anInt8360 : Static7.aClass3_Sub15_Sub1_1.anInt8362) >> 8;
						} else {
							@Pc(132) int local132 = local9.anInt2334 >> 24 & 0x3;
							if (Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100 == local132) {
								@Pc(147) int local147 = (local9.anInt2334 & 0xFF) << 9;
								@Pc(154) int local154 = local9.anInt2334 >> 16 & 0xFF;
								@Pc(164) int local164 = (local154 << 9) + 256 - Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811;
								if (local164 < 0) {
									local164 = -local164;
								}
								@Pc(179) int local179 = local9.anInt2334 >> 8 & 0xFF;
								@Pc(189) int local189 = (local179 << 9) + 256 - Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813;
								if (local189 < 0) {
									local189 = -local189;
								}
								@Pc(203) int local203 = local189 + local164 - 512;
								if (local147 < local203) {
									local9.anInt2330 = -99999;
									continue;
								}
								if (local203 < 0) {
									local203 = 0;
								}
								local138 = Static7.aClass3_Sub15_Sub1_1.anInt8370 * (local147 - local203) * local9.anInt2335 / local147 >> 8;
							} else {
								local138 = 0;
							}
						}
						if (local138 > 0) {
							@Pc(257) Class3_Sub42_Sub1 local257 = null;
							if (local9.aByte26 == 1) {
								local257 = local9.aClass31_1.method879().method6903(Static233.aClass270_1);
							} else if (local9.method2063()) {
								local257 = local9.aClass3_Sub42_Sub1_1;
							}
							@Pc(283) Class3_Sub9_Sub2 local283 = local9.aClass3_Sub9_Sub2_1 = Static556.method5342(local257, local138);
							local283.method5365(local9.anInt2331 - 1);
							Static530.aClass3_Sub9_Sub3_2.method5654(local283);
						}
					}
				}
			} else if (!local9.aClass3_Sub9_Sub2_1.method7821()) {
				local11 = true;
			}
			if (local11) {
				Static128.anInt2675--;
				for (local138 = local3; local138 < Static128.anInt2675; local138++) {
					Static360.aClass70Array1[local138] = Static360.aClass70Array1[local138 + 1];
				}
				local3--;
			}
		}
		if (Static432.aBoolean563 && !Static142.method2467()) {
			if (Static7.aClass3_Sub15_Sub1_1.anInt8382 != 0 && Static506.anInt8842 != -1) {
				Static317.method5135(Static506.anInt8842, Static460.aClass161_42, Static7.aClass3_Sub15_Sub1_1.anInt8382);
			}
			Static432.aBoolean563 = false;
		} else if (Static7.aClass3_Sub15_Sub1_1.anInt8382 != 0 && Static506.anInt8842 != -1 && !Static142.method2467()) {
			Static278.method4791(Static256.aClass158_67);
			Static515.aClass3_Sub27_Sub1_2.method7594(Static506.anInt8842);
			Static506.anInt8842 = -1;
		}
	}
}
