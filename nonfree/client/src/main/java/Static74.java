import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!da", name = "z", descriptor = "I")
	public static int anInt1791;

	@OriginalMember(owner = "client!da", name = "J", descriptor = "I")
	public static int anInt1796;

	@OriginalMember(owner = "client!da", name = "C", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[8];

	@OriginalMember(owner = "client!da", name = "D", descriptor = "Lclient!bs;")
	public static Class37 aClass37_1 = new Class37(8);

	@OriginalMember(owner = "client!da", name = "G", descriptor = "J")
	public static long aLong44 = 0L;

	@OriginalMember(owner = "client!da", name = "H", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_32 = new Class45("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!da", name = "I", descriptor = "Lclient!uw;")
	public static final Class299 aClass299_1 = new Class299();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!os;Z)Lclient!hk;")
	public static Class22_Sub3 method1727(@OriginalArg(0) Class1_Sub17 arg0) {
		return new Class22_Sub3(arg0.method4447(), arg0.method4447(), arg0.method4447(), arg0.method4447(), arg0.method4447(), arg0.method4447(), arg0.method4447(), arg0.method4447(), arg0.method4486(), arg0.method4487());
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)I")
	public static int method1729(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[[I)V")
	public static void method1730(@OriginalArg(1) int[][] arg0) {
		Static143.anIntArrayArray33 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIIZII)V")
	public static void method1731(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static263.aClass64ArrayArrayArray3 == null) {
			Static455.aClass4_11.method7162(-16777216, arg1, arg3, arg0, arg4);
		} else if (Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954 >= 0 && Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954 < Static237.anInt4563 * 128 && Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949 >= 0 && Static373.anInt6694 * 128 > Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949) {
			Static389.anInt6904++;
			if (Static107.aClass20_Sub1_Sub1_Sub1_1 != null && Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954 + 64 - Static107.aClass20_Sub1_Sub1_Sub1_1.method7808() * 64 >> 7 == Static52.anInt4659 && Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949 + 64 - Static107.aClass20_Sub1_Sub1_Sub1_1.method7808() * 64 >> 7 == Static259.anInt5037) {
				Static52.anInt4659 = -1;
				Static259.anInt5037 = -1;
				Static327.method5596();
			}
			Static303.method5345();
			if (!arg2) {
				Static13.method510();
			}
			Static330.method5623();
			Static320.method5479(arg4, true, arg0, arg1, arg3);
			@Pc(115) int local115 = Static519.anInt2068;
			@Pc(117) int local117 = Static111.anInt2301;
			@Pc(119) int local119 = Static369.anInt6640;
			@Pc(121) int local121 = Static145.anInt2913;
			@Pc(138) int local138;
			@Pc(169) int local169;
			if (Static170.anInt3418 == 1) {
				local138 = (int) Static49.aFloat29;
				if (Static243.anInt4676 >> 8 > local138) {
					local138 = Static243.anInt4676 >> 8;
				}
				if (Static174.aBooleanArray6[4] && Static412.anIntArray698[4] + 128 > local138) {
					local138 = Static412.anIntArray698[4] + 128;
				}
				local169 = Static379.anInt7382 + (int) Static135.aFloat193 & 0x3FFF;
				Static6.method374(local169, local119, Static397.anInt6990, local138, Static508.method7754(Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949, Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954, Static322.anInt6113) - 50, Static60.anInt1483, (local138 >> 3) * 3 + 600 << 0);
			} else if (Static170.anInt3418 == 4) {
				local138 = (int) Static49.aFloat29;
				if (Static243.anInt4676 >> 8 > local138) {
					local138 = Static243.anInt4676 >> 8;
				}
				if (Static174.aBooleanArray6[4] && Static412.anIntArray698[4] + 128 > local138) {
					local138 = Static412.anIntArray698[4] + 128;
				}
				local169 = (int) Static135.aFloat193 & 0x3FFF;
				Static6.method374(local169, local119, Static397.anInt6990, local138, Static508.method7754(Static181.anInt3812, Static341.anInt6297, Static322.anInt6113) - 50, Static60.anInt1483, (local138 >> 3) * 3 + 600 << 0);
			} else if (Static170.anInt3418 == 5) {
				Static280.method4891(local119);
			}
			local138 = Static321.anInt6064;
			local169 = Static276.anInt8653;
			@Pc(265) int local265 = Static46.anInt1256;
			@Pc(267) int local267 = Static536.anInt9434;
			@Pc(269) int local269 = Static469.anInt8096;
			@Pc(312) int local312;
			for (@Pc(271) int local271 = 0; local271 < 5; local271++) {
				if (Static174.aBooleanArray6[local271]) {
					local312 = (int) ((double) (Static499.anIntArray762[local271] * 2 + 1) * Math.random() - (double) Static499.anIntArray762[local271] + Math.sin((double) Static174.anIntArray290[local271] / 100.0D * (double) Static62.anIntArray100[local271]) * (double) Static412.anIntArray698[local271]);
					if (local271 == 4) {
						Static536.anInt9434 += local312;
						if (Static536.anInt9434 < 1024) {
							Static536.anInt9434 = 1024;
						} else if (Static536.anInt9434 > 3072) {
							Static536.anInt9434 = 3072;
						}
					}
					if (local271 == 0) {
						Static321.anInt6064 += local312;
					}
					if (local271 == 3) {
						Static469.anInt8096 = Static469.anInt8096 + local312 & 0x3FFF;
					}
					if (local271 == 2) {
						Static46.anInt1256 += local312;
					}
					if (local271 == 1) {
						Static276.anInt8653 += local312;
					}
				}
			}
			if (Static321.anInt6064 < 0) {
				Static321.anInt6064 = 0;
			}
			if (Static321.anInt6064 > (Static501.anInt9458 << 7) - 1) {
				Static321.anInt6064 = (Static501.anInt9458 << 7) - 1;
			}
			if (Static46.anInt1256 < 0) {
				Static46.anInt1256 = 0;
			}
			if ((Static420.anInt7323 << 7) - 1 < Static46.anInt1256) {
				Static46.anInt1256 = (Static420.anInt7323 << 7) - 1;
			}
			Static325.method5582();
			Static435.method6758();
			Static455.aClass4_11.N(local117, local121, local115 + local117, local119 + local121);
			Static455.aClass4_11.method7202();
			local312 = Static202.anInt4056;
			if (Static516.aClass62_1 == null) {
				Static455.aClass4_11.Z(local312);
			} else {
				Static516.aClass62_1.method1795(Static536.anInt9434, local119, Static469.anInt8096, local312, Static455.aClass4_11, local121, anInt1796 << 3, local115, local117);
			}
			Static422.method6584();
			Static224.aClass128_5.B(Static321.anInt6064, Static276.anInt8653, Static46.anInt1256, -Static536.anInt9434 & 0x3FFF, -Static469.anInt8096 & 0x3FFF, -Static505.anInt6155 & 0x3FFF);
			Static455.aClass4_11.method7198(Static224.aClass128_5);
			Static455.aClass4_11.b(local115 / 2 + local117, local119 / 2 + local121, Static466.anInt8045 << 1, Static466.anInt8045 << 1);
			Static538.method8169(Static466.anInt8045 << 1, local121 + local119 / 2, local115 / 2 + local117, Static466.anInt8045 << 1);
			Static514.method7866(Static321.anInt6064, -Static536.anInt9434 & 0x3FFF, -Static505.anInt6155 & 0x3FFF, -Static469.anInt8096 & 0x3FFF, Static46.anInt1256, Static276.anInt8653);
			@Pc(534) byte local534 = Static286.aClass1_Sub15_Sub1_1.method6378(Static449.anInt7876) == 2 ? (byte) Static389.anInt6904 : 1;
			Static16.method8192(Static455.aClass4_11, Static445.anInt7791, Static154.anInt3012, Static224.aClass128_5, Static321.anInt6064, Static276.anInt8653, Static46.anInt1256, Static314.aByteArrayArrayArray12, Static204.anIntArray322, Static265.anIntArray281, Static348.anIntArray622, Static279.anIntArray261, Static220.anIntArray340, Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108 + 1, local534, Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954 >> 7, Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949 >> 7, !Static286.aClass1_Sub15_Sub1_1.aBoolean536);
			Static422.method6584();
			if (Static186.anInt3863 == 9) {
				Static536.method8133(local115, local117, local121, local119);
				Static214.method3972(local121, local117, local115, local119);
				Static510.method7785(local115, local117, local119, local121);
				Static447.method6924(local119, local117, local121, local115);
			}
			Static184.method3550();
			Static536.anInt9434 = local267;
			Static46.anInt1256 = local265;
			Static321.anInt6064 = local138;
			Static276.anInt8653 = local169;
			Static469.anInt8096 = local269;
			if (Static400.aBoolean506 && Static302.aClass117_5.method2934() == 0) {
				Static400.aBoolean506 = false;
			}
			if (Static400.aBoolean506) {
				Static455.aClass4_11.method7162(-16777216, local115, local117, local121, local119);
				Static433.method6712(Static246.aClass45_71.method1474(Static544.anInt7853), false, Static186.aClass36_1);
			}
		} else {
			Static455.aClass4_11.method7162(-16777216, arg1, arg3, arg0, arg4);
		}
	}
}
