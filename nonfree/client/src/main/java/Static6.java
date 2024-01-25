import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!aca", name = "x", descriptor = "Lclient!hga;")
	public static Class146 aClass146_1;

	@OriginalMember(owner = "client!aca", name = "r", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_2 = new Class200(76, 6);

	@OriginalMember(owner = "client!aca", name = "w", descriptor = "I")
	public static int anInt127 = 4;

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZIIIIZ)V")
	public static void method97(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static348.aClass84ArrayArrayArray5 == null) {
			Static141.aClass13_27.method8164(-16777216, arg2, arg3, arg4, arg1);
		} else if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8037 >= 0 && Static456.anInt7428 * 512 > Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8037 && Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8034 >= 0 && Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8034 < Static5.anInt112 * 512) {
			Static364.anInt6282++;
			if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1 != null && Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8037 - (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.method6999() - 1) * 256 >> 9 == Static375.anInt6459 && Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8034 + 256 - Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.method6999() * 256 >> 9 == Static583.anInt9512) {
				Static583.anInt9512 = -1;
				Static375.anInt6459 = -1;
				Static580.method8047();
			}
			Static479.method6800();
			if (!arg0) {
				Static175.method3007();
			}
			Static362.method5389();
			Static520.method7230(arg4, arg2, arg3, arg1, true);
			@Pc(111) int local111 = Static378.anInt8482;
			Static529.anInt8509 = Static529.anInt8507;
			@Pc(115) int local115 = Static265.anInt4973;
			@Pc(117) int local117 = Static485.anInt7794;
			@Pc(119) int local119 = Static198.anInt3919;
			@Pc(132) int local132;
			@Pc(163) int local163;
			if (Static407.anInt6909 == 1) {
				local132 = (int) Static464.aFloat130;
				if (local132 < Static561.anInt9242 >> 8) {
					local132 = Static561.anInt9242 >> 8;
				}
				if (Static298.aBooleanArray10[4] && Static406.anIntArray460[4] + 128 > local132) {
					local132 = Static406.anIntArray460[4] + 128;
				}
				local163 = (int) Static225.aFloat85 + Static66.anInt1804 & 0x3FFF;
				Static11.method143((local132 >> 3) * 3 + 600 << 2, Static392.method5799(Static531.anInt8550, Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8037, Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8034) - 200, local111, local132, Static145.anInt3035, local163, Static553.anInt9177);
			} else if (Static407.anInt6909 == 4) {
				local132 = (int) Static464.aFloat130;
				if (local132 < Static561.anInt9242 >> 8) {
					local132 = Static561.anInt9242 >> 8;
				}
				if (Static298.aBooleanArray10[4] && Static406.anIntArray460[4] + 128 > local132) {
					local132 = Static406.anIntArray460[4] + 128;
				}
				local163 = (int) Static225.aFloat85 & 0x3FFF;
				Static11.method143((local132 >> 3) * 3 + 600 << 2, Static392.method5799(Static531.anInt8550, Static595.anInt9886, Static33.anInt661) - 200, local111, local132, Static145.anInt3035, local163, Static553.anInt9177);
			} else if (Static407.anInt6909 == 5) {
				Static121.method2193(local111);
			}
			local132 = Static576.anInt9403;
			local163 = Static479.anInt7769;
			@Pc(264) int local264 = Static63.anInt1715;
			@Pc(266) int local266 = Static502.anInt9930;
			@Pc(268) int local268 = Static400.anInt7896;
			@Pc(311) int local311;
			for (@Pc(270) int local270 = 0; local270 < 5; local270++) {
				if (Static298.aBooleanArray10[local270]) {
					local311 = (int) (Math.random() * (double) (Static522.anIntArray623[local270] * 2 + 1) - (double) Static522.anIntArray623[local270] + Math.sin((double) Static455.anIntArray684[local270] * ((double) Static487.anIntArray559[local270] / 100.0D)) * (double) Static406.anIntArray460[local270]);
					if (local270 == 1) {
						Static479.anInt7769 += local311 << 2;
					}
					if (local270 == 0) {
						Static576.anInt9403 += local311 << 2;
					}
					if (local270 == 2) {
						Static63.anInt1715 += local311 << 2;
					}
					if (local270 == 4) {
						Static502.anInt9930 += local311;
						if (Static502.anInt9930 < 1024) {
							Static502.anInt9930 = 1024;
						} else if (Static502.anInt9930 > 3072) {
							Static502.anInt9930 = 3072;
						}
					}
					if (local270 == 3) {
						Static400.anInt7896 = local311 + Static400.anInt7896 & 0x3FFF;
					}
				}
			}
			if (Static576.anInt9403 < 0) {
				Static576.anInt9403 = 0;
			}
			if (Static63.anInt1715 < 0) {
				Static63.anInt1715 = 0;
			}
			if (Static576.anInt9403 > (Static595.anInt9881 << 9) - 1) {
				Static576.anInt9403 = (Static595.anInt9881 << 9) - 1;
			}
			if ((Static389.anInt6693 << 9) - 1 < Static63.anInt1715) {
				Static63.anInt1715 = (Static389.anInt6693 << 9) - 1;
			}
			Static49.method1208();
			Static563.method7886();
			Static141.aClass13_27.KA(local115, local117, local119 + local115, local111 + local117);
			Static560.method7863(true);
			if (Static148.aBoolean241) {
				Static124.method2238(Static532.anInt8558);
				if (Static529.anInt8509 != Static69.anInt1871) {
					Static578.aBoolean673 = true;
				}
				Static69.anInt1871 = Static529.anInt8509;
			} else {
				Static141.aClass13_27.ya();
				local311 = Static532.anInt8558;
				if (Static593.aClass224_1 == null) {
					Static141.aClass13_27.GA(local311);
				} else {
					Static593.aClass224_1.method5320(local311, local119, local115, Static400.anInt7896, Static86.anInt2185 << 3, local111, Static141.aClass13_27, Static502.anInt9930, local117);
				}
			}
			Static113.method2018();
			Static46.aClass51_5.method6716(Static576.anInt9403, Static479.anInt7769, Static63.anInt1715, -Static502.anInt9930 & 0x3FFF, -Static400.anInt7896 & 0x3FFF, -Static47.anInt1279 & 0x3FFF);
			Static141.aClass13_27.method8138(Static46.aClass51_5);
			Static141.aClass13_27.DA(local115 + local119 / 2, local117 - -(local111 / 2), Static333.anInt5839 << 1, Static333.anInt5839 << 1);
			Static544.method7524(Static333.anInt5839 << 1, Static333.anInt5839 << 1, local117 + local111 / 2, local115 + local119 / 2);
			Static394.method5832(Static479.anInt7769, Static63.anInt1715, -Static47.anInt1279 & 0x3FFF, -Static502.anInt9930 & 0x3FFF, -Static400.anInt7896 & 0x3FFF, Static576.anInt9403);
			@Pc(557) byte local557 = Static305.aClass2_Sub49_15.aClass33_Sub29_1.method8714() == 2 ? (byte) Static364.anInt6282 : 1;
			if (Static148.aBoolean241) {
				Static49.method1209(-Static400.anInt7896 & 0x3FFF, -Static502.anInt9930 & 0x3FFF, -Static47.anInt1279 & 0x3FFF);
				Static569.method7930(Static582.aByteArrayArrayArray17, Static389.anInt6694, Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8034 >> 9, local557, Static479.anInt7769, Static305.aClass2_Sub49_15.aClass33_Sub24_1.method7475() == 0, Static165.anIntArray219, Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109 + 1, Static494.anIntArray569, Static529.anInt8509, Static63.anInt1715, Static327.anIntArray367, Static576.anInt9403, Static237.anIntArray283, Static447.anIntArray498, Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8037 >> 9);
			} else {
				Static304.method4768(Static389.anInt6694, Static576.anInt9403, Static479.anInt7769, Static63.anInt1715, Static582.aByteArrayArrayArray17, Static165.anIntArray219, Static237.anIntArray283, Static327.anIntArray367, Static447.anIntArray498, Static494.anIntArray569, Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109 + 1, local557, Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8037 >> 9, Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8034 >> 9, Static305.aClass2_Sub49_15.aClass33_Sub24_1.method7475() == 0, Static582.aBoolean678 ? Static529.anInt8509 : -1, 0, false);
			}
			Static113.method2018();
			if (Static454.anInt7416 == 10) {
				Static40.method912(local115, local111, local117, local119);
				Static481.method6809(local115, local119, local117, local111);
				Static549.method7576(local119, local115, local111, local117);
				Static16.method417(local117, local115, local111, local119);
			}
			Static485.method6826();
			Static479.anInt7769 = local163;
			Static400.anInt7896 = local268;
			Static502.anInt9930 = local266;
			Static63.anInt1715 = local264;
			Static576.anInt9403 = local132;
			if (Static520.aBoolean608 && Static194.aClass322_2.method7436() == 0) {
				Static520.aBoolean608 = false;
			}
			if (Static520.aBoolean608) {
				Static141.aClass13_27.method8164(-16777216, local111, local115, local119, local117);
				Static24.method603(Static39.aClass37_1, Static141.aClass13_27, false, Static266.aClass183_7, Static573.aClass345_14.method7951(Static496.anInt7407));
			}
			Static560.method7863(false);
		} else {
			Static141.aClass13_27.method8164(-16777216, arg2, arg3, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IB)V")
	public static void method98(@OriginalArg(0) int arg0) {
		if (Static275.anInt5095 == 0) {
			Static191.aClass2_Sub11_Sub1_2.method1510(arg0);
		} else {
			Static64.anInt1727 = arg0;
		}
	}
}
