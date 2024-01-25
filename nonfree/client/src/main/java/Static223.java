import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!od", name = "c", descriptor = "Lclient!il;")
	public static final Class93 aClass93_13 = new Class93(12, 15);

	@OriginalMember(owner = "client!od", name = "d", descriptor = "[I")
	public static final int[] anIntArray371 = new int[6];

	@OriginalMember(owner = "client!od", name = "e", descriptor = "S")
	public static short aShort60 = 32767;

	@OriginalMember(owner = "client!od", name = "f", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_153 = new Class18(77, 3);

	@OriginalMember(owner = "client!od", name = "g", descriptor = "Z")
	public static final boolean aBoolean331 = false;

	@OriginalMember(owner = "client!od", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString44 = null;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIBII)V")
	public static void method4136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class112 local8 = Static147.method2868(arg1, arg4);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray15 != null) {
			@Pc(18) Class1_Sub35 local18 = new Class1_Sub35();
			local18.aClass112_16 = local8;
			local18.anObjectArray34 = local8.anObjectArray15;
			Static302.method5243(local18);
		}
		Static62.anInt1506 = arg3;
		Static77.aBoolean119 = true;
		Static9.anInt239 = arg4;
		Static166.anInt3467 = arg1;
		Static127.anInt2772 = arg0;
		Static45.anInt1171 = arg2;
		Static37.anInt936 = arg5;
		Static325.anInt5187 = local8.anInt3451;
		Static133.method2725(local8);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIBZ)V")
	public static void method4138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static105.aClass155ArrayArrayArray3 == null) {
			Static9.aClass63_1.method4639(arg2, arg3, arg0, -16777216, arg1);
		} else if (Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729 >= 0 && Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729 < Static311.anInt5653 * 128 && Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726 >= 0 && Static189.anInt3820 * 128 > Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726) {
			Static365.anInt7010++;
			if (Static191.aClass11_Sub2_Sub6_Sub1_4 != null && Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729 + 64 - Static191.aClass11_Sub2_Sub6_Sub1_4.method5894() * 64 >> 7 == Static237.anInt2678 && Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726 + 64 - Static191.aClass11_Sub2_Sub6_Sub1_4.method5894() * 64 >> 7 == Static97.anInt2177) {
				Static97.anInt2177 = -1;
				Static237.anInt2678 = -1;
				Static56.method1386();
			}
			Static43.method4865();
			if (!arg4) {
				Static285.method4337();
			}
			Static105.method2287();
			Static228.method4271(arg3, true, arg1, arg0, arg2);
			@Pc(115) int local115 = Static126.anInt2759;
			@Pc(117) int local117 = Static128.anInt5883;
			@Pc(119) int local119 = Static33.anInt828;
			@Pc(121) int local121 = Static76.anInt1693;
			@Pc(144) int local144;
			@Pc(179) int local179;
			if (Static50.anInt1273 == 1) {
				local144 = (int) Static332.aFloat62;
				if (local144 < Static109.anInt2439 >> 8) {
					local144 = Static109.anInt2439 >> 8;
				}
				if (Static26.aBooleanArray1[4] && local144 < Static277.anIntArray418[4] + 128) {
					local144 = Static277.anIntArray418[4] + 128;
				}
				local179 = (int) Static357.aFloat76 + Static38.anInt944 & 0x3FFF;
				Static196.method3685(local144, Static98.anInt2254, (local144 >> 3) * 3 + 600, local115, Static53.anInt1374, local179, Static8.method288(Static284.anInt6477, Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729, Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726) - 50);
			} else if (Static50.anInt1273 == 4) {
				local144 = (int) Static332.aFloat62;
				if (Static109.anInt2439 >> 8 > local144) {
					local144 = Static109.anInt2439 >> 8;
				}
				if (Static26.aBooleanArray1[4] && local144 < Static277.anIntArray418[4] + 128) {
					local144 = Static277.anIntArray418[4] + 128;
				}
				local179 = (int) Static357.aFloat76 & 0x3FFF;
				Static196.method3685(local144, Static98.anInt2254, (local144 >> 3) * 3 + 600, local115, Static53.anInt1374, local179, Static8.method288(Static284.anInt6477, Static78.anInt1750, Static138.anInt2972) - 50);
			} else if (Static50.anInt1273 == 5) {
				Static298.method5715(local115);
			}
			local144 = Static14.anInt4971;
			local179 = Static294.anInt5665;
			@Pc(272) int local272 = Static260.anInt5192;
			@Pc(274) int local274 = Static272.anInt5295;
			@Pc(276) int local276 = Static320.anInt4362;
			@Pc(320) int local320;
			for (@Pc(278) int local278 = 0; local278 < 5; local278++) {
				if (Static26.aBooleanArray1[local278]) {
					local320 = (int) ((double) -Static319.anIntArray473[local278] + (double) (Static319.anIntArray473[local278] * 2 + 1) * Math.random() + Math.sin((double) Static123.anIntArray197[local278] / 100.0D * (double) Static113.anIntArray188[local278]) * (double) Static277.anIntArray418[local278]);
					if (local278 == 3) {
						Static320.anInt4362 = local320 + Static320.anInt4362 & 0x3FFF;
					}
					if (local278 == 1) {
						Static294.anInt5665 += local320;
					}
					if (local278 == 4) {
						Static272.anInt5295 += local320;
						if (Static272.anInt5295 < 1024) {
							Static272.anInt5295 = 1024;
						} else if (Static272.anInt5295 > 3072) {
							Static272.anInt5295 = 3072;
						}
					}
					if (local278 == 2) {
						Static260.anInt5192 += local320;
					}
					if (local278 == 0) {
						Static14.anInt4971 += local320;
					}
				}
			}
			if (Static14.anInt4971 < 0) {
				Static14.anInt4971 = 0;
			}
			if ((Static300.anInt5778 << 7) - 1 < Static14.anInt4971) {
				Static14.anInt4971 = (Static300.anInt5778 << 7) - 1;
			}
			if (Static260.anInt5192 < 0) {
				Static260.anInt5192 = 0;
			}
			if ((Static354.anInt6714 << 7) - 1 < Static260.anInt5192) {
				Static260.anInt5192 = (Static354.anInt6714 << 7) - 1;
			}
			Static215.method3980();
			Static343.method5735();
			Static9.aClass63_1.method4566(local121, local119, local121 + local117, local115 + local119);
			Static9.aClass63_1.method4620();
			local320 = Static56.anInt1435;
			if (Static191.aClass90_3 == null) {
				Static9.aClass63_1.method4627(local320);
			} else {
				Static191.aClass90_3.method2728(local117, local115, Static15.anInt301 << 3, Static272.anInt5295, local320, Static320.anInt4362, local119, local121, Static9.aClass63_1);
			}
			Static82.method1769();
			Static341.aClass129_5.method5780(Static14.anInt4971, Static294.anInt5665, Static260.anInt5192, -Static272.anInt5295 & 0x3FFF, -Static320.anInt4362 & 0x3FFF, -Static129.anInt2810 & 0x3FFF);
			Static9.aClass63_1.method4596(Static341.aClass129_5);
			Static9.aClass63_1.method4590(local117 / 2 + local121, local115 / 2 + local119, Static266.anInt5226 << 1, Static266.anInt5226 << 1);
			Static341.method5717(Static266.anInt5226 << 1, Static266.anInt5226 << 1, local119 + local115 / 2, local121 - -(local117 / 2));
			Static359.method5944(Static260.anInt5192, -Static320.anInt4362 & 0x3FFF, Static294.anInt5665, -Static272.anInt5295 & 0x3FFF, Static14.anInt4971, -Static129.anInt2810 & 0x3FFF);
			@Pc(545) byte local545 = Static225.method4175() == 2 ? (byte) Static365.anInt7010 : 1;
			Static361.method5985(Static9.aClass63_1, Static51.anInt1301, Static44.anInt1145, Static341.aClass129_5, Static14.anInt4971, Static294.anInt5665, Static260.anInt5192, Static341.aByteArrayArrayArray10, Static198.anIntArray309, Static127.anIntArray207, Static260.anIntArray406, Static271.anIntArray43, Static40.anIntArray70, Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79 + 1, local545, Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729 >> 7, Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726 >> 7, !Static318.aBoolean455);
			Static82.method1769();
			if (Static13.anInt334 == 30) {
				Static2.method108(local121, local119, local117, local115);
				Static297.method5177(local119, local115, local117, local121);
				Static167.method3127(local121, local117, local119, local115);
				Static216.method3985(local121, local119, local117, local115);
			}
			Static50.method1208();
			Static14.anInt4971 = local144;
			Static272.anInt5295 = local274;
			Static320.anInt4362 = local276;
			Static260.anInt5192 = local272;
			Static294.anInt5665 = local179;
			if (Static248.aBoolean378 && Static280.aClass191_2.method5180() == 0) {
				Static248.aBoolean378 = false;
			}
			if (Static248.aBoolean378) {
				Static9.aClass63_1.method4639(local119, local121, local115, -16777216, local117);
				Static291.method5127(false, Static313.aClass106_210.method2927(Static254.anInt5172), Static24.aClass33_1);
			}
		} else {
			Static9.aClass63_1.method4639(arg2, arg3, arg0, -16777216, arg1);
		}
	}
}
