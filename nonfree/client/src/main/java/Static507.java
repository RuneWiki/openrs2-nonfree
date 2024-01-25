import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	public static int anInt9337;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "[Lclient!mf;")
	public static Class206_Sub1[] aClass206_Sub1Array2;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	public static int anInt9339;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "[I")
	public static final int[] anIntArray606 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "[I")
	public static final int[] anIntArray607 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZIIII)V")
	public static void method7812(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static395.aClass100ArrayArrayArray3 == null) {
			Static186.aClass20_4.method7278(arg1, arg2, arg4, arg3, -16777216);
		} else if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10303 >= 0 && Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10303 < Static47.anInt1794 * 512 && Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10310 >= 0 && Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10310 < Static209.anInt4742 * 512) {
			Static438.anInt8137++;
			if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2 != null && Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10303 + 256 - Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.method5214() * 256 >> 9 == Static542.anInt9759 && Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10310 + 256 - Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.method5214() * 256 >> 9 == Static339.anInt6841) {
				Static339.anInt6841 = -1;
				Static542.anInt9759 = -1;
				Static451.method7098();
			}
			Static468.method7399();
			if (!arg0) {
				Static600.method8797();
			}
			Static354.method6011();
			Static328.method5638(arg2, arg4, arg1, true, arg3);
			@Pc(117) int local117 = Static523.anInt9519;
			@Pc(119) int local119 = Static619.anInt10832;
			@Pc(121) int local121 = Static595.anInt10488;
			Static380.anInt7419 = Static380.anInt7422;
			@Pc(125) int local125 = Static375.anInt3312;
			@Pc(131) int local131;
			@Pc(168) int local168;
			if (Static496.anInt9165 == 1) {
				local131 = (int) Static305.aFloat154;
				if (local131 < Static489.anInt9047 >> 8) {
					local131 = Static489.anInt9047 >> 8;
				}
				if (Static446.aBooleanArray21[4] && Static561.anIntArray651[4] + 128 > local131) {
					local131 = Static561.anIntArray651[4] + 128;
				}
				local168 = (int) Static72.aFloat68 + Static471.anInt8841 & 0x3FFF;
				Static208.method4098(local131, Static590.method8716(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10303, Static12.anInt172, Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10310) - 200, local168, Static468.anInt8821, local121, Static21.anInt398, (local131 >> 3) * 3 + 600 << 2);
			} else if (Static496.anInt9165 == 4) {
				local131 = (int) Static305.aFloat154;
				if (local131 < Static489.anInt9047 >> 8) {
					local131 = Static489.anInt9047 >> 8;
				}
				if (Static446.aBooleanArray21[4] && Static561.anIntArray651[4] + 128 > local131) {
					local131 = Static561.anIntArray651[4] + 128;
				}
				local168 = (int) Static72.aFloat68 & 0x3FFF;
				Static208.method4098(local131, Static590.method8716(Static173.anInt4166, Static12.anInt172, Static176.anInt4216) - 200, local168, Static468.anInt8821, local121, Static21.anInt398, (local131 >> 3) * 3 + 600 << 2);
			} else if (Static496.anInt9165 == 5) {
				Static60.method1920(local121);
			}
			local131 = Static135.anInt3347;
			local168 = Static639.anInt11034;
			@Pc(274) int local274 = Static621.anInt10870;
			@Pc(276) int local276 = Static266.anInt5673;
			@Pc(278) int local278 = Static189.anInt11070;
			@Pc(321) int local321;
			for (@Pc(280) int local280 = 0; local280 < 5; local280++) {
				if (Static446.aBooleanArray21[local280]) {
					local321 = (int) (Math.random() * (double) (Static590.anIntArray672[local280] * 2 + 1) - (double) Static590.anIntArray672[local280] + Math.sin((double) Static579.anIntArray664[local280] * ((double) Static113.anIntArray152[local280] / 100.0D)) * (double) Static561.anIntArray651[local280]);
					if (local280 == 4) {
						Static266.anInt5673 += local321;
						if (Static266.anInt5673 < 1024) {
							Static266.anInt5673 = 1024;
						} else if (Static266.anInt5673 > 3072) {
							Static266.anInt5673 = 3072;
						}
					}
					if (local280 == 0) {
						Static135.anInt3347 += local321 << 2;
					}
					if (local280 == 3) {
						Static189.anInt11070 = local321 + Static189.anInt11070 & 0x3FFF;
					}
					if (local280 == 1) {
						Static639.anInt11034 += local321 << 2;
					}
					if (local280 == 2) {
						Static621.anInt10870 += local321 << 2;
					}
				}
			}
			if (Static135.anInt3347 < 0) {
				Static135.anInt3347 = 0;
			}
			if ((Static477.anInt8929 << 9) - 1 < Static135.anInt3347) {
				Static135.anInt3347 = (Static477.anInt8929 << 9) - 1;
			}
			if (Static621.anInt10870 < 0) {
				Static621.anInt10870 = 0;
			}
			if ((Static562.anInt10128 << 9) - 1 < Static621.anInt10870) {
				Static621.anInt10870 = (Static562.anInt10128 << 9) - 1;
			}
			Static569.method8506();
			Static328.method5639();
			Static186.aClass20_4.KA(local119, local117, local119 + local125, local117 + local121);
			Static514.method7843(true);
			if (Static487.aBoolean676) {
				Static229.method4394(Static457.anInt8404);
				if (Static179.anInt4296 != Static380.anInt7419) {
					Static240.aBoolean380 = true;
				}
				Static179.anInt4296 = Static380.anInt7419;
			} else {
				Static186.aClass20_4.ya();
				local321 = Static457.anInt8404;
				if (Static566.aClass376_1 == null) {
					Static186.aClass20_4.GA(local321);
				} else {
					Static566.aClass376_1.method9210(Static454.anInt8397 << 3, Static186.aClass20_4, local119, local125, local117, Static189.anInt11070, Static266.anInt5673, local321, local121);
				}
			}
			Static293.method5263();
			Static45.aClass30_3.method4658(Static135.anInt3347, Static639.anInt11034, Static621.anInt10870, -Static266.anInt5673 & 0x3FFF, -Static189.anInt11070 & 0x3FFF, -Static113.anInt3037 & 0x3FFF);
			Static186.aClass20_4.method7241(Static45.aClass30_3);
			Static186.aClass20_4.DA(local125 / 2 + local119, local117 + local121 / 2, Static339.anInt6843 << 1, Static339.anInt6843 << 1);
			Static227.method4299(Static339.anInt6843 << 1, Static339.anInt6843 << 1, local119 + local125 / 2, local117 + local121 / 2);
			Static270.method4967(-Static266.anInt5673 & 0x3FFF, Static621.anInt10870, Static639.anInt11034, -Static189.anInt11070 & 0x3FFF, Static135.anInt3347, -Static113.anInt3037 & 0x3FFF);
			@Pc(582) byte local582 = Static74.aClass2_Sub13_5.lb.method6912() == 2 ? (byte) Static438.anInt8137 : 1;
			if (Static487.aBoolean676) {
				Static214.method4182(-Static189.anInt11070 & 0x3FFF, -Static113.anInt3037 & 0x3FFF, -Static266.anInt5673 & 0x3FFF);
				Static518.method7858(Static279.anIntArray498, Static612.aByteArrayArrayArray18, Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10310 >> 9, Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132 + 1, Static93.anIntArray130, Static135.anInt3347, Static621.anInt10870, Static74.aClass2_Sub13_5.aClass14_Sub1_1.method316() == 0, Static639.anInt11034, Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10303 >> 9, Static408.anIntArray496, Static472.anIntArray564, local582, Static265.anIntArray323, Static407.anInt7704, Static380.anInt7419);
			} else {
				Static187.method3896(Static407.anInt7704, Static135.anInt3347, Static639.anInt11034, Static621.anInt10870, Static612.aByteArrayArrayArray18, Static93.anIntArray130, Static408.anIntArray496, Static472.anIntArray564, Static265.anIntArray323, Static279.anIntArray498, Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132 + 1, local582, Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10303 >> 9, Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10310 >> 9, Static74.aClass2_Sub13_5.aClass14_Sub1_1.method316() == 0, Static639.aBoolean753 ? Static380.anInt7419 : -1, 0, false);
			}
			Static293.method5263();
			if (Static529.anInt9623 == 10) {
				Static212.method4176(local125, local121, local119, local117);
				Static467.method7389(local117, local121, local119, local125);
				Static579.method8631(local119, local117, local125, local121);
				Static424.method6826(local121, local125, local117, local119);
			}
			Static569.method8504();
			Static135.anInt3347 = local131;
			Static266.anInt5673 = local276;
			Static189.anInt11070 = local278;
			Static639.anInt11034 = local168;
			Static621.anInt10870 = local274;
			if (Static178.aBoolean319 && Static142.aClass329_3.method8127() == 0) {
				Static178.aBoolean319 = false;
			}
			if (Static178.aBoolean319) {
				Static186.aClass20_4.method7278(local125, local119, local117, local121, -16777216);
				Static151.method3426(false, Static300.aClass68_4, Static58.aClass239_18, Static588.aClass351_14.method8691(Static476.anInt8915), Static186.aClass20_4);
			}
			Static514.method7843(false);
		} else {
			Static186.aClass20_4.method7278(arg1, arg2, arg4, arg3, -16777216);
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
	public static void method7814() {
		@Pc(22) byte[] local22;
		if (Static12.anObject1 == null) {
			@Pc(15) Class74_Sub2_Sub1 local15 = new Class74_Sub2_Sub1();
			local22 = local15.method4174();
			Static12.anObject1 = Static51.method1759(local22);
		}
		if (Static515.anObject16 == null) {
			@Pc(37) Class74_Sub1_Sub2 local37 = new Class74_Sub1_Sub2();
			local22 = local37.method9055();
			Static515.anObject16 = Static51.method1759(local22);
		}
	}
}
