import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "Lclient!ma;")
	public static Class228 aClass228_4;

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "Lclient!gs;")
	public static final Class141 aClass141_1 = new Class141();

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "[I")
	public static int[] anIntArray144 = new int[2];

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIZZII)V")
	public static void method2158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static63.aClass89ArrayArrayArray1 == null) {
			Static103.aClass144_3.method6887(arg0, -16777216, arg3, arg1, arg4);
		} else if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11184 >= 0 && Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11184 < Static380.anInt6689 * 512 && Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11178 >= 0 && Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11178 < Static542.anInt9214 * 512) {
			Static688.anInt11168++;
			if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1 != null && Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11184 - (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.method2870(0) - 1) * 256 >> 9 == Static60.anInt998 && Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11178 + 256 - Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.method2870(0) * 256 >> 9 == Static605.anInt7003) {
				Static60.anInt998 = -1;
				Static605.anInt7003 = -1;
				Static428.method6435();
			}
			Static243.method4055();
			if (!arg2) {
				Static20.method321();
			}
			Static556.method8038();
			Static194.method2930(arg3, arg1, arg0, arg4, true);
			@Pc(128) int local128 = Static351.anInt11020;
			@Pc(130) int local130 = Static145.anInt2289;
			@Pc(132) int local132 = Static517.anInt8884;
			Static481.anInt10749 = Static481.anInt10751;
			@Pc(136) int local136 = Static26.anInt350;
			@Pc(142) int local142;
			@Pc(181) int local181;
			if (Static304.anInt5410 == 1) {
				local142 = (int) Static680.aFloat210;
				if (Static609.anInt10035 >> 8 > local142) {
					local142 = Static609.anInt10035 >> 8;
				}
				if (Static552.aBooleanArray22[4] && Static308.anIntArray304[4] + 128 > local142) {
					local142 = Static308.anIntArray304[4] + 128;
				}
				local181 = Static185.anInt3051 + (int) Static139.aFloat16 & 0x3FFF;
				Static411.method6196((local142 >> 3) * 3 + 600 << 2, Static173.anInt2835, Static660.anInt6758, Static388.method5919(Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11178, Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11184, Static391.anInt6811) - 200, local142, local181, local132);
			} else if (Static304.anInt5410 == 4) {
				local142 = (int) Static680.aFloat210;
				if (Static609.anInt10035 >> 8 > local142) {
					local142 = Static609.anInt10035 >> 8;
				}
				if (Static552.aBooleanArray22[4] && local142 < Static308.anIntArray304[4] + 128) {
					local142 = Static308.anIntArray304[4] + 128;
				}
				local181 = (int) Static139.aFloat16 & 0x3FFF;
				Static411.method6196((local142 >> 3) * 3 + 600 << 2, Static173.anInt2835, Static660.anInt6758, Static388.method5919(Static351.anInt11027, Static295.anInt5319, Static391.anInt6811) - 200, local142, local181, local132);
			} else if (Static304.anInt5410 == 5) {
				Static496.method7309(local132);
			}
			local142 = Static70.anInt1085;
			local181 = Static153.anInt2372;
			@Pc(302) int local302 = Static229.anInt4393;
			@Pc(304) int local304 = Static126.anInt9524;
			@Pc(306) int local306 = Static669.anInt10940;
			@Pc(351) int local351;
			for (@Pc(308) int local308 = 0; local308 < 5; local308++) {
				if (Static552.aBooleanArray22[local308]) {
					local351 = (int) (Math.random() * (double) (Static187.anIntArray186[local308] * 2 + 1) - (double) Static187.anIntArray186[local308] + Math.sin((double) Static331.anIntArray319[local308] / 100.0D * (double) Static246.anIntArray236[local308]) * (double) Static308.anIntArray304[local308]);
					if (local308 == 3) {
						Static669.anInt10940 = local351 + Static669.anInt10940 & 0x3FFF;
					}
					if (local308 == 1) {
						Static153.anInt2372 += local351 << 2;
					}
					if (local308 == 2) {
						Static229.anInt4393 += local351 << 2;
					}
					if (local308 == 0) {
						Static70.anInt1085 += local351 << 2;
					}
					if (local308 == 4) {
						Static126.anInt9524 += local351;
						if (Static126.anInt9524 < 1024) {
							Static126.anInt9524 = 1024;
						} else if (Static126.anInt9524 > 3072) {
							Static126.anInt9524 = 3072;
						}
					}
				}
			}
			if (Static70.anInt1085 < 0) {
				Static70.anInt1085 = 0;
			}
			if ((Static654.anInt10715 << 9) - 1 < Static70.anInt1085) {
				Static70.anInt1085 = (Static654.anInt10715 << 9) - 1;
			}
			if (Static229.anInt4393 < 0) {
				Static229.anInt4393 = 0;
			}
			if ((Static180.anInt2928 << 9) - 1 < Static229.anInt4393) {
				Static229.anInt4393 = (Static180.anInt2928 << 9) - 1;
			}
			Static671.method9289();
			Static103.aClass144_3.KA(local130, local136, local130 + local128, local132 + local136);
			Static512.method9100(true);
			local351 = Static91.anInt1594;
			Static281.aClass263_4.method8446(Static70.anInt1085, Static153.anInt2372, Static229.anInt4393, -Static126.anInt9524 & 0x3FFF, -Static669.anInt10940 & 0x3FFF, -Static470.anInt8100 & 0x3FFF);
			Static103.aClass144_3.method6896(Static281.aClass263_4);
			Static103.aClass144_3.DA(local130 + local128 / 2, local132 / 2 + local136, Static368.anInt6253 << 1, Static368.anInt6253 << 1);
			if (Static656.aBoolean741) {
				Static249.method4224(Static91.anInt1594);
				if (Static331.anInt5684 != Static481.anInt10749) {
					Static282.aBoolean384 = true;
				}
				Static331.anInt5684 = Static481.anInt10749;
				Static103.aClass144_3.GA(local351);
				Static103.aClass144_3.ya();
			} else if (Static240.aClass366_1 == null) {
				Static103.aClass144_3.GA(local351);
				Static103.aClass144_3.ya();
			} else {
				Static103.aClass144_3.xa(1.0F);
				Static103.aClass144_3.ZA(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				Static240.aClass366_1.method8683(Static669.anInt10940, Static470.anInt8100, Static126.anInt9524, local351, local130, local128, Static334.anInt5725 << 3, local132, local136, Static103.aClass144_3);
			}
			Static599.method8480();
			Static119.method1858(Static368.anInt6253 << 1, local136 + local132 / 2, Static368.anInt6253 << 1, local130 + local128 / 2);
			Static539.method7935(-Static470.anInt8100 & 0x3FFF, Static153.anInt2372, -Static126.anInt9524 & 0x3FFF, -Static669.anInt10940 & 0x3FFF, Static229.anInt4393, Static70.anInt1085);
			Static417.method6263();
			@Pc(679) byte local679 = Static181.aClass14_Sub26_9.aClass43_Sub7_1.method2650() == 2 ? (byte) Static688.anInt11168 : 1;
			if (Static656.aBoolean741) {
				Static684.method9448(-Static470.anInt8100 & 0x3FFF, -Static126.anInt9524 & 0x3FFF, -Static669.anInt10940 & 0x3FFF);
				Static465.method6862(Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146 + 1, Static384.anIntArray349, anIntArray144, Static153.anInt2372, Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11178 >> 9, Static275.anIntArray283, Static436.aByteArrayArrayArray11, Static503.anIntArray454, Static70.anInt1085, Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11184 >> 9, Static229.anInt4393, local679, Static181.aClass14_Sub26_9.aClass43_Sub20_1.method5523() == 0, Static481.anInt10749, Static530.anInt9105, Static547.anIntArray230);
			} else {
				Static362.method4763(Static530.anInt9105, Static70.anInt1085, Static153.anInt2372, Static229.anInt4393, Static436.aByteArrayArrayArray11, Static275.anIntArray283, Static503.anIntArray454, Static384.anIntArray349, Static547.anIntArray230, anIntArray144, Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146 + 1, local679, Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11184 >> 9, Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11178 >> 9, Static181.aClass14_Sub26_9.aClass43_Sub20_1.method5523() == 0, Static6.aBoolean9 ? Static481.anInt10749 : -1, 0, false);
			}
			Static599.method8480();
			if (Static387.anInt9114 == 11) {
				Static677.method9361(local136, local132, local130, local128);
				Static204.method3037(local132, local130, local136, local128);
				Static69.method1089(local130, local132, local128, local136);
				Static622.method8727(local130, local136, local128, local132);
			}
			Static73.method1219();
			Static669.anInt10940 = local306;
			Static153.anInt2372 = local181;
			Static229.anInt4393 = local302;
			Static126.anInt9524 = local304;
			Static70.anInt1085 = local142;
			if (Static292.aBoolean394 && Static685.aClass24_3.method365() == 0) {
				Static292.aBoolean394 = false;
			}
			if (Static292.aBoolean394) {
				Static103.aClass144_3.method6887(local136, -16777216, local128, local132, local130);
				Static478.method7167(Static372.aClass350_5, Static446.aClass68_8, false, Static21.aClass21_11.method324(Static26.anInt352), Static103.aClass144_3);
			}
			Static512.method9100(false);
		} else {
			Static103.aClass144_3.method6887(arg0, -16777216, arg3, arg1, arg4);
		}
	}
}
