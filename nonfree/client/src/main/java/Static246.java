import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "J")
	public static long aLong123;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
	public static int anInt4757;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
	public static int anInt4758;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
	public static int anInt4759;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_71 = new Class186(46, 7);

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_75 = new Class6(99, 7);

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "Lclient!h;")
	public static final Class114 aClass114_97 = new Class114(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!r;IIII)Lclient!pl;")
	public static Class231 method4148(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return arg0 == null ? null : new Class231(arg1, arg3, arg2, arg0.e(), arg0.wa(), arg0.va(), arg0.TA(), arg0.n(), arg0.Q(), arg0.U());
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)V")
	public static void method4149(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static255.aClass1_Sub13_Sub2_2.method3093(Static45.anInt1403) >= 15) {
				@Pc(15) int local15 = Static255.aClass1_Sub13_Sub2_2.method3087(15);
				if (local15 != 32767) {
					@Pc(22) boolean local22 = false;
					@Pc(29) Class1_Sub10 local29 = (Class1_Sub10) Static258.aClass174_15.method4422((long) local15);
					@Pc(35) Class47_Sub2_Sub3_Sub1 local35;
					if (local29 == null) {
						local35 = new Class47_Sub2_Sub3_Sub1();
						local35.anInt5045 = local15;
						local29 = new Class1_Sub10(local35);
						Static258.aClass174_15.method4420(local29, (long) local15);
						Static395.aClass1_Sub10Array1[Static198.anInt4112++] = local29;
						local22 = true;
					}
					local35 = local29.aClass47_Sub2_Sub3_Sub1_2;
					Static386.anIntArray503[Static457.anInt7857++] = local15;
					local35.anInt5038 = Static416.anInt7252;
					if (local35.aClass238_1 != null && local35.aClass238_1.method5861()) {
						Static59.method1643(local35);
					}
					@Pc(95) int local95 = Static255.aClass1_Sub13_Sub2_2.method3087(3) + 4 << 11 & 0x3EE1;
					@Pc(100) int local100 = Static255.aClass1_Sub13_Sub2_2.method3087(1);
					if (local100 == 1) {
						Static50.anIntArray777[Static280.anInt5512++] = local15;
					}
					@Pc(120) int local120;
					if (arg0) {
						local120 = Static255.aClass1_Sub13_Sub2_2.method3087(8);
						if (local120 > 127) {
							local120 -= 256;
						}
					} else {
						local120 = Static255.aClass1_Sub13_Sub2_2.method3087(5);
						if (local120 > 15) {
							local120 -= 32;
						}
					}
					@Pc(143) int local143 = Static255.aClass1_Sub13_Sub2_2.method3087(2);
					@Pc(150) int local150;
					if (arg0) {
						local150 = Static255.aClass1_Sub13_Sub2_2.method3087(8);
						if (local150 > 127) {
							local150 -= 256;
						}
					} else {
						local150 = Static255.aClass1_Sub13_Sub2_2.method3087(5);
						if (local150 > 15) {
							local150 -= 32;
						}
					}
					local35.method3708(Static345.aClass222_1.method5587(Static255.aClass1_Sub13_Sub2_2.method3087(14)));
					@Pc(181) int local181 = Static255.aClass1_Sub13_Sub2_2.method3087(1);
					local35.method4367(local35.aClass238_1.anInt6754);
					local35.anInt5001 = local35.aClass238_1.anInt6761 << 3;
					if (local22) {
						local35.method4351(true, local95);
					}
					local35.method3707(local150 + Static16.aClass47_Sub2_Sub3_Sub2_1.anIntArray361[0], local35.method4350(), local181 == 1, local143, Static16.aClass47_Sub2_Sub3_Sub2_1.anIntArray362[0] + local120);
					if (local35.aClass238_1.method5861()) {
						Static96.method2188(local35, null, local35.aByte94, null, local35.anIntArray362[0], local35.anIntArray361[0], 0);
					}
					continue;
				}
			}
			Static255.aClass1_Sub13_Sub2_2.method3091();
			return;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!qa;IILclient!m;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method4151(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class22 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static423.aClass9_12 = arg0;
		Static32.anInt1261 = arg1;
		Static299.aClass22_8 = arg3;
		Static144.aBoolean206 = Static423.aClass9_12.method7582() > 0;
		Static406.anInt7107 = arg4 >> anInt4759;
		Static265.anInt5150 = arg6 >> anInt4759;
		Static267.anInt5170 = arg4;
		Static360.anInt9309 = arg6;
		Static104.anInt2470 = arg5;
		Static530.anInt8978 = Static406.anInt7107 - Static278.anInt5506;
		if (Static530.anInt8978 < 0) {
			Static135.anInt3198 = -Static530.anInt8978;
			Static530.anInt8978 = 0;
		} else {
			Static135.anInt3198 = 0;
		}
		Static537.anInt9318 = Static265.anInt5150 - Static278.anInt5506;
		if (Static537.anInt9318 < 0) {
			Static480.anInt8180 = -Static537.anInt9318;
			Static537.anInt9318 = 0;
		} else {
			Static480.anInt8180 = 0;
		}
		Static518.anInt8804 = Static406.anInt7107 + Static278.anInt5506;
		if (Static518.anInt8804 > Static488.anInt8353) {
			Static518.anInt8804 = Static488.anInt8353;
		}
		Static227.anInt8838 = Static265.anInt5150 + Static278.anInt5506;
		if (Static227.anInt8838 > Static60.anInt1677) {
			Static227.anInt8838 = Static60.anInt1677;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static278.anInt5506 + Static278.anInt5506 + 2; local74++) {
			for (local77 = 0; local77 < Static278.anInt5506 + Static278.anInt5506 + 2; local77++) {
				local84 = Static406.anInt7107 + local74 - Static278.anInt5506;
				local90 = Static265.anInt5150 + local77 - Static278.anInt5506;
				if (local84 >= 0 && local90 >= 0 && local84 < Static488.anInt8353 && local90 < Static60.anInt1677) {
					@Pc(104) int local104 = local84 << anInt4759;
					@Pc(108) int local108 = local90 << anInt4759;
					@Pc(124) int local124 = Static53.aClass10Array3[Static53.aClass10Array3.length - 1].ba(local84, local90) - (0x3E8 << anInt4759 - 7);
					@Pc(144) int local144 = Static106.aClass10Array5 == null ? Static53.aClass10Array3[0].ba(local84, local90) + Static40.anInt1354 : Static106.aClass10Array5[0].ba(local84, local90) + Static40.anInt1354;
					Static213.aBooleanArrayArray2[local74][local77] = Static423.aClass9_12.B(local104, local124, local108, local104, local144, local108);
				} else {
					Static213.aBooleanArrayArray2[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static278.anInt5506 + Static278.anInt5506 + 1; local77++) {
			for (local84 = 0; local84 < Static278.anInt5506 + Static278.anInt5506 + 1; local84++) {
				Static339.aBooleanArrayArray4[local77][local84] = Static213.aBooleanArrayArray2[local77][local84] || Static213.aBooleanArrayArray2[local77 + 1][local84] || Static213.aBooleanArrayArray2[local77][local84 + 1] || Static213.aBooleanArrayArray2[local77 + 1][local84 + 1];
			}
		}
		Static189.anIntArray307 = arg8;
		Static306.anIntArray417 = arg9;
		Static114.anIntArray539 = arg10;
		Static160.anIntArray275 = arg11;
		Static62.anIntArray161 = arg12;
		Static304.method5073();
		Static183.method3497(Static423.aClass9_12);
		for (@Pc(261) Class2_Sub6 local261 = (Class2_Sub6) Static314.aClass145_5.method3919(); local261 != null; local261 = (Class2_Sub6) Static314.aClass145_5.method3926()) {
			local261.method7890();
			Static285.method4842(local261);
		}
		if (Static144.aBoolean206) {
			for (local90 = 0; local90 < Static321.anInt6084; local90++) {
				Static172.aClass201Array3[local90].method5161(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static423.aClass9_12.method7584(0);
			if (Static128.aClass43_1 == null || Static128.aClass43_1 instanceof Class43_Sub1) {
				Static128.aClass43_1 = new Class43_Sub2();
			}
		} else if (Static128.aClass43_1 == null || Static128.aClass43_1 instanceof Class43_Sub2) {
			Static128.aClass43_1 = new Class43_Sub1();
		}
		Static128.aClass43_1.method3640(arg2);
		Static128.aClass43_1.method3636();
		if (Static406.aClass206ArrayArrayArray3 != null) {
			Static368.method5690(true);
			Static128.aClass43_1.method3639(22);
			Static231.method6236(arg2, null, 0, (byte) 0, arg15, arg16);
			Static128.aClass43_1.method3636();
			Static128.aClass43_1.method3639(23);
			Static368.method5690(false);
		}
		Static231.method6236(arg2, arg7, arg13, arg14, arg15, arg16);
		Static128.aClass43_1.method3636();
		Static128.aClass43_1.method3633();
		Static128.aClass43_1.method3636();
		if (arg2 > 1) {
			Static423.aClass9_12.method7596(0);
		}
		Static423.aClass9_12.method7588(0, null);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public static void method4152() {
		if (Static268.anInt5183 < 0) {
			return;
		}
		@Pc(7) long local7 = Static93.method2172();
		Static268.anInt5183 = (int) ((long) Static268.anInt5183 + Static41.aLong20 - local7);
		if (Static268.anInt5183 > 0) {
			@Pc(24) int local24 = (Static268.anInt5183 << 8) / Static390.anInt6801;
			@Pc(29) int local29 = 255 - local24;
			@Pc(34) float local34 = (float) local24 / 255.0F;
			@Pc(38) float local38 = 1.0F - local34;
			Static128.anInt3067 = (local29 * (Static530.aClass308_2.anInt8705 & 0xFF00) + local24 * (Static455.anInt7660 & 0xFF00) & 0xFF0000) + (local24 * (Static455.anInt7660 & 0xFF00FF) + (local29 * (Static530.aClass308_2.anInt8705 & 0xFF00FF)) & 0xFF00FF00) >>> 8;
			Static123.aFloat79 = Static291.aFloat109 + local38 * (Static530.aClass308_2.aFloat182 - Static291.aFloat109);
			Static55.anInt1551 = (local29 * (Static530.aClass308_2.anInt8701 & 0xFF00FF) + (Static500.anInt8480 & 0xFF00FF) * local24 & 0xFF00FF00) + ((Static500.anInt8480 & 0xFF00) * local24 + ((Static530.aClass308_2.anInt8701 & 0xFF00) * local29) & 0xFF0000) >>> 8;
			Static122.aFloat78 = (Static530.aClass308_2.aFloat179 - Static263.aFloat101) * local38 + Static263.aFloat101;
			Static261.aFloat100 = (Static530.aClass308_2.aFloat180 - Static304.aFloat112) * local38 + Static304.aFloat112;
			Static336.aFloat123 = (Static530.aClass308_2.aFloat178 - Static76.aFloat72) * local38 + Static76.aFloat72;
			anInt4758 = Static191.anInt8072 * local24 + local29 * Static530.aClass308_2.anInt8708 >> 8;
			Static354.aFloat126 = (Static530.aClass308_2.aFloat181 - Static49.aFloat57) * local38 + Static49.aFloat57;
			Static298.aFloat111 = local38 * (Static530.aClass308_2.aFloat177 - Static539.aFloat204) + Static539.aFloat204;
			if (Static365.aClass25_6 != Static530.aClass308_2.aClass25_5) {
				Static160.aClass25_3 = Static397.aClass9_6.method7609(Static365.aClass25_6, Static530.aClass308_2.aClass25_5, local38, Static160.aClass25_3);
			}
		} else {
			Static268.anInt5183 = -1;
			anInt4758 = Static530.aClass308_2.anInt8708;
			Static123.aFloat79 = Static530.aClass308_2.aFloat182;
			Static122.aFloat78 = Static530.aClass308_2.aFloat179;
			Static128.anInt3067 = Static530.aClass308_2.anInt8705;
			Static354.aFloat126 = Static530.aClass308_2.aFloat181;
			Static298.aFloat111 = Static530.aClass308_2.aFloat177;
			Static261.aFloat100 = Static530.aClass308_2.aFloat180;
			Static336.aFloat123 = Static530.aClass308_2.aFloat178;
			Static160.aClass25_3 = Static530.aClass308_2.aClass25_5;
			Static55.anInt1551 = Static530.aClass308_2.anInt8701;
		}
		Static41.aLong20 = local7;
	}
}
