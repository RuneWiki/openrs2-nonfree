import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "F")
	public static float aFloat186;

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_71 = new Class344(60, 8);

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "Lclient!si;")
	public static Class303 aClass303_1 = new Class303(8);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BZIIII)V")
	public static void method6234(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static571.aClass182ArrayArrayArray3 == null) {
			Static39.aClass7_2.method7825(arg3, arg2, arg1, -16777216, arg4);
		} else if (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10551 >= 0 && Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10551 < Static338.anInt6508 * 512 && Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10550 >= 0 && Static390.anInt7654 * 512 > Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10550) {
			Static70.anInt1864++;
			if (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2 != null && Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10551 - (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.method3339() - 1) * 256 >> 9 == Static384.anInt7552 && Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10550 - (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.method3339() - 1) * 256 >> 9 == Static226.anInt4729) {
				Static226.anInt4729 = -1;
				Static384.anInt7552 = -1;
				Static2.method7();
			}
			Static376.method5842();
			if (!arg0) {
				Static186.method3075();
			}
			Static227.method3700();
			Static211.method3416(arg1, arg2, arg3, arg4, true);
			@Pc(108) int local108 = Static90.anInt2301;
			@Pc(110) int local110 = Static194.anInt4048;
			@Pc(112) int local112 = Static296.anInt6002;
			@Pc(118) int local118 = Static136.anInt3032;
			@Pc(137) int local137;
			@Pc(172) int local172;
			if (Static300.anInt6053 == 1) {
				local137 = (int) Static155.aFloat73;
				if (Static506.anInt9470 >> 8 > local137) {
					local137 = Static506.anInt9470 >> 8;
				}
				if (Static179.aBooleanArray8[4] && Static60.anIntArray62[4] + 128 > local137) {
					local137 = Static60.anIntArray62[4] + 128;
				}
				local172 = (int) Static189.aFloat83 + Static42.anInt1292 & 0x3FFF;
				Static209.method3412(local172, local108, Static461.method6782(Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10550, Static352.anInt6764, Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10551) - 200, (local137 >> 3) * 3 + 600 << 2, local137, Static222.anInt4655, Static148.anInt3159);
			} else if (Static300.anInt6053 == 4) {
				local137 = (int) Static155.aFloat73;
				if (local137 < Static506.anInt9470 >> 8) {
					local137 = Static506.anInt9470 >> 8;
				}
				if (Static179.aBooleanArray8[4] && Static60.anIntArray62[4] + 128 > local137) {
					local137 = Static60.anIntArray62[4] + 128;
				}
				local172 = (int) Static189.aFloat83 & 0x3FFF;
				Static209.method3412(local172, local108, Static461.method6782(Static27.anInt4151, Static352.anInt6764, Static277.anInt5777) - 200, (local137 >> 3) * 3 + 600 << 2, local137, Static222.anInt4655, Static148.anInt3159);
			} else if (Static300.anInt6053 == 5) {
				Static377.method5878(local108);
			}
			local137 = Static534.anInt9775;
			local172 = Static139.anInt3067;
			@Pc(268) int local268 = Static114.anInt2613;
			@Pc(270) int local270 = Static233.anInt4905;
			@Pc(272) int local272 = Static353.anInt6831;
			@Pc(316) int local316;
			for (@Pc(274) int local274 = 0; local274 < 5; local274++) {
				if (Static179.aBooleanArray8[local274]) {
					local316 = (int) ((double) -Static29.anIntArray28[local274] + Math.random() * (double) (Static29.anIntArray28[local274] * 2 + 1) + Math.sin((double) Static267.anIntArray289[local274] / 100.0D * (double) Static446.anIntArray495[local274]) * (double) Static60.anIntArray62[local274]);
					if (local274 == 4) {
						Static233.anInt4905 += local316;
						if (Static233.anInt4905 < 1024) {
							Static233.anInt4905 = 1024;
						} else if (Static233.anInt4905 > 3072) {
							Static233.anInt4905 = 3072;
						}
					}
					if (local274 == 1) {
						Static139.anInt3067 += local316 << 2;
					}
					if (local274 == 2) {
						Static114.anInt2613 += local316 << 2;
					}
					if (local274 == 3) {
						Static353.anInt6831 = Static353.anInt6831 + local316 & 0x3FFF;
					}
					if (local274 == 0) {
						Static534.anInt9775 += local316 << 2;
					}
				}
			}
			if (Static534.anInt9775 < 0) {
				Static534.anInt9775 = 0;
			}
			if (Static114.anInt2613 < 0) {
				Static114.anInt2613 = 0;
			}
			if (Static534.anInt9775 > (Static10.anInt812 << 9) - 1) {
				Static534.anInt9775 = (Static10.anInt812 << 9) - 1;
			}
			if ((Static255.anInt5209 << 9) - 1 < Static114.anInt2613) {
				Static114.anInt2613 = (Static255.anInt5209 << 9) - 1;
			}
			Static410.method6363();
			Static201.method3281();
			Static39.aClass7_2.da(local110, local112, local110 + local118, local112 - -local108);
			Static39.aClass7_2.ya();
			local316 = Static337.anInt6492;
			if (Static357.aClass260_1 == null) {
				Static39.aClass7_2.ja(local316);
			} else {
				Static357.aClass260_1.method6106(Static233.anInt4905, Static353.anInt6831, local118, Static39.aClass7_2, local108, Static280.anInt5804 << 3, local112, local110, local316);
			}
			Static487.method7088();
			Static566.aClass81_6.na(Static534.anInt9775, Static139.anInt3067, Static114.anInt2613, -Static233.anInt4905 & 0x3FFF, -Static353.anInt6831 & 0x3FFF, -Static470.anInt8934 & 0x3FFF);
			Static39.aClass7_2.method7794(Static566.aClass81_6);
			Static39.aClass7_2.la(local118 / 2 + local110, local112 - -(local108 / 2), Static15.anInt864 << 1, Static15.anInt864 << 1);
			Static29.method961(Static15.anInt864 << 1, Static15.anInt864 << 1, local118 / 2 + local110, local112 + local108 / 2);
			Static393.method6015(-Static233.anInt4905 & 0x3FFF, -Static353.anInt6831 & 0x3FFF, Static139.anInt3067, -Static470.anInt8934 & 0x3FFF, Static114.anInt2613, Static534.anInt9775);
			@Pc(553) byte local553 = Static455.aClass4_Sub35_Sub1_1.method7623(Static453.anInt8614) == 2 ? (byte) Static70.anInt1864 : 1;
			Static346.method5271(Static306.anInt6122, Static534.anInt9775, Static139.anInt3067, Static114.anInt2613, Static159.aByteArrayArrayArray3, Static301.anIntArray332, Static333.anIntArray354, Static425.anIntArray455, Static15.anIntArray16, Static211.anIntArray211, Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127 + 1, local553, Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10551 >> 9, Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10550 >> 9, !Static455.aClass4_Sub35_Sub1_1.aBoolean683);
			Static487.method7088();
			if (Static9.anInt758 == 10) {
				Static397.method6091(local110, local118, local112, local108);
				Static346.method5264(local118, local112, local108, local110);
				Static324.method5021(local112, local110, local108, local118);
				Static418.method6587(local112, local108, local110, local118);
			}
			Static130.method2381();
			Static233.anInt4905 = local270;
			Static114.anInt2613 = local268;
			Static139.anInt3067 = local172;
			Static534.anInt9775 = local137;
			Static353.anInt6831 = local272;
			if (Static535.aBoolean658 && Static433.aClass72_3.method1861() == 0) {
				Static535.aBoolean658 = false;
			}
			if (Static535.aBoolean658) {
				Static39.aClass7_2.method7825(local108, local118, local112, -16777216, local110);
				Static490.method7114(Static39.aClass7_2, false, Static478.aClass198_11, Static127.aClass45_1, Static223.aClass152_16.method3624(Static142.anInt3088));
			}
		} else {
			Static39.aClass7_2.method7825(arg3, arg2, arg1, -16777216, arg4);
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
	public static void method6235() {
		if (Static241.anInt5029 <= 0) {
			Static437.aString173 = "";
			return;
		}
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < Static404.aStringArray31.length; local19++) {
			if (Static404.aStringArray31[local19].indexOf("--> ") != -1) {
				@Pc(31) int local31 = ~Static241.anInt5029;
				local17++;
				if (local31 == ~local17) {
					Static437.aString173 = Static404.aStringArray31[local19].substring(Static404.aStringArray31[local19].indexOf(">") + 2);
					return;
				}
			}
		}
	}
}
