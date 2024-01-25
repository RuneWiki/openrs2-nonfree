import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!je", name = "F", descriptor = "I")
	public static int anInt5147;

	@OriginalMember(owner = "client!je", name = "G", descriptor = "I")
	public static int anInt5148;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_58 = new Class341(90, 8);

	@OriginalMember(owner = "client!je", name = "J", descriptor = "F")
	public static float aFloat108 = 0.0F;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BLclient!ea;Z)V")
	public static void method4675(@OriginalArg(1) Class15_Sub3_Sub3_Sub1_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static276.anInt5124 >= 400) {
			return;
		}
		if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2 != arg0) {
			@Pc(160) String local160;
			if (arg0.anInt2405 == 0) {
				@Pc(61) boolean local61 = true;
				if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt2384 != -1 && arg0.anInt2384 != -1) {
					@Pc(81) int local81 = arg0.anInt2384 <= Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt2384 ? arg0.anInt2384 : Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt2384;
					@Pc(87) int local87 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt2403 - arg0.anInt2403;
					if (local87 < 0) {
						local87 = -local87;
					}
					if (local87 > local81) {
						local61 = false;
					}
				}
				@Pc(116) String local116 = Static551.aClass229_15 == Static534.aClass229_16 ? Static205.aClass134_30.method3906(Static204.anInt8130) : Static205.aClass134_28.method3906(Static204.anInt8130);
				if (arg0.anInt2385 > arg0.anInt2403) {
					local160 = arg0.method2222() + (local61 ? Static413.method6773(arg0.anInt2403, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt2403) : "<col=ffffff>") + " (" + local116 + arg0.anInt2403 + "+" + (arg0.anInt2385 - arg0.anInt2403) + ")";
				} else {
					local160 = arg0.method2222() + (local61 ? Static413.method6773(arg0.anInt2403, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt2403) : "<col=ffffff>") + " (" + local116 + arg0.anInt2403 + ")";
				}
			} else if (arg0.anInt2405 == -1) {
				local160 = arg0.method2222();
			} else {
				local160 = arg0.method2222() + " (" + Static205.aClass134_29.method3906(Static204.anInt8130) + arg0.anInt2405 + ")";
			}
			if (Static537.aBoolean683 && !arg1 && (Static156.anInt3415 & 0x8) != 0) {
				Static335.method5521(-1, false, (long) arg0.anInt3977, Static13.aString100 + " -> <col=ffffff>" + local160, 0, 0, false, true, Static397.anInt11031, (long) arg0.anInt3977, 16, Static526.aString109);
			}
			if (arg1) {
				Static335.method5521(0, false, 0L, "", 0, 0, true, false, -1, (long) arg0.anInt3977, -1, "<col=cccccc>" + local160);
			} else {
				for (@Pc(299) int local299 = 7; local299 >= 0; local299--) {
					if (Static294.aStringArray33[local299] != null) {
						@Pc(307) short local307 = 0;
						if (Static551.aClass229_15 == Static19.aClass229_3 && Static294.aStringArray33[local299].equalsIgnoreCase(Static205.aClass134_23.method3906(Static204.anInt8130))) {
							if (Static63.aBoolean68 && arg0.anInt2403 > Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt2403) {
								local307 = 2000;
							}
							if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt2371 == 0 || arg0.anInt2371 == 0) {
								if (arg0.aBoolean173) {
									local307 = 2000;
								}
							} else if (arg0.anInt2371 == Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt2371) {
								local307 = 2000;
							} else {
								local307 = 0;
							}
						} else if (Static93.aBooleanArray66[local299]) {
							local307 = 2000;
						}
						@Pc(374) short local374 = (short) (Static538.aShortArray120[local299] + local307);
						@Pc(386) int local386 = Static21.anIntArray34[local299] == -1 ? Static373.anInt7103 : Static21.anIntArray34[local299];
						Static335.method5521(-1, false, (long) arg0.anInt3977, "<col=ffffff>" + local160, 0, 0, false, true, local386, (long) arg0.anInt3977, local374, Static294.aStringArray33[local299]);
					}
				}
			}
			if (!arg1) {
				for (@Pc(429) Class2_Sub1_Sub13 local429 = (Class2_Sub1_Sub13) Static61.aClass271_6.method7177(); local429 != null; local429 = (Class2_Sub1_Sub13) Static61.aClass271_6.method7175()) {
					if (local429.anInt6866 == 2) {
						local429.aString81 = "<col=ffffff>" + local160;
						break;
					}
				}
			}
		} else if (Static537.aBoolean683 && (Static156.anInt3415 & 0x10) != 0) {
			Static335.method5521(-1, false, 0L, Static13.aString100 + " -> <col=ffffff>" + Static205.aClass134_37.method3906(Static204.anInt8130), 0, 0, false, true, Static397.anInt11031, (long) arg0.anInt3977, 18, Static526.aString109);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public static void method4677() {
		Static595.aClass101_14.xa(((float) Static230.aClass2_Sub54_15.aClass4_Sub1_1.method89() * 0.1F + 0.7F) * 1.1523438F);
		Static595.aClass101_14.ZA(Static440.anInt8006, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static595.aClass101_14.L(Static201.anInt4209, -1, 0);
		Static595.aClass101_14.method8068(Static218.aClass3_1);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)B")
	public static byte method4680(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZB)V")
	public static void method4684(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static567.anInt9844 != -1) {
				Static647.method9533(Static567.anInt9844);
			}
			for (@Pc(16) Class2_Sub20 local16 = (Class2_Sub20) Static507.aClass335_33.method8358(); local16 != null; local16 = (Class2_Sub20) Static507.aClass335_33.method8355()) {
				if (!local16.method9823()) {
					local16 = (Class2_Sub20) Static507.aClass335_33.method8358();
					if (local16 == null) {
						break;
					}
				}
				Static349.method6045(false, local16, true);
			}
			Static567.anInt9844 = -1;
			Static507.aClass335_33 = new Class335(8);
			Static540.method8292();
			Static567.anInt9844 = Static640.anInt11084;
			Static94.method1626(false);
			Static403.method6620();
			Static518.method8028(Static567.anInt9844);
		}
		Static436.aBoolean589 = false;
		Static332.aString71 = "";
		Static470.aString67 = "";
		Static45.method946();
		Static113.anInt2045 = -1;
		Static626.method9302(Static303.anInt5522);
		Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2 = new Class15_Sub3_Sub3_Sub1_Sub1();
		Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11024 = Static668.anInt11370 * 512 / 2;
		Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anIntArray189[0] = Static222.anInt4533 / 2;
		Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11022 = Static222.anInt4533 * 512 / 2;
		Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anIntArray188[0] = Static668.anInt11370 / 2;
		Static598.anInt10387 = 0;
		Static108.anInt1987 = 0;
		if (Static484.anInt8685 == 2) {
			Static108.anInt1987 = Static99.anInt1769 << 9;
			Static598.anInt10387 = Static362.anInt9575 << 9;
		} else {
			Static460.method9469();
		}
		Static593.method7276();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method4686(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(9) byte[] local9 = new byte[local6];
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(23) char local23 = arg0.charAt(local11);
			if (local23 > '\u0000' && local23 < '\u0080' || !(local23 < ' ' || local23 > 'ÿ')) {
				local9[local11] = (byte) local23;
			} else if (local23 == '€') {
				local9[local11] = -128;
			} else if (local23 == '‚') {
				local9[local11] = -126;
			} else if (local23 == 'ƒ') {
				local9[local11] = -125;
			} else if (local23 == '„') {
				local9[local11] = -124;
			} else if (local23 == '…') {
				local9[local11] = -123;
			} else if (local23 == '†') {
				local9[local11] = -122;
			} else if (local23 == '‡') {
				local9[local11] = -121;
			} else if (local23 == 'ˆ') {
				local9[local11] = -120;
			} else if (local23 == '‰') {
				local9[local11] = -119;
			} else if (local23 == 'Š') {
				local9[local11] = -118;
			} else if (local23 == '‹') {
				local9[local11] = -117;
			} else if (local23 == 'Œ') {
				local9[local11] = -116;
			} else if (local23 == 'Ž') {
				local9[local11] = -114;
			} else if (local23 == '‘') {
				local9[local11] = -111;
			} else if (local23 == '’') {
				local9[local11] = -110;
			} else if (local23 == '“') {
				local9[local11] = -109;
			} else if (local23 == '”') {
				local9[local11] = -108;
			} else if (local23 == '•') {
				local9[local11] = -107;
			} else if (local23 == '–') {
				local9[local11] = -106;
			} else if (local23 == '—') {
				local9[local11] = -105;
			} else if (local23 == '˜') {
				local9[local11] = -104;
			} else if (local23 == '™') {
				local9[local11] = -103;
			} else if (local23 == 'š') {
				local9[local11] = -102;
			} else if (local23 == '›') {
				local9[local11] = -101;
			} else if (local23 == 'œ') {
				local9[local11] = -100;
			} else if (local23 == 'ž') {
				local9[local11] = -98;
			} else if (local23 == 'Ÿ') {
				local9[local11] = -97;
			} else {
				local9[local11] = 63;
			}
		}
		return local9;
	}
}
