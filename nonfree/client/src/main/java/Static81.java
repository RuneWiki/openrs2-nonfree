import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!ne", name = "tb", descriptor = "Lclient!df;")
	public static Class11 aClass11_1;

	@OriginalMember(owner = "client!ne", name = "ub", descriptor = "Lclient!ia;")
	public static Class27 aClass27_4;

	@OriginalMember(owner = "client!ne", name = "yb", descriptor = "I")
	public static int anInt2248;

	@OriginalMember(owner = "client!ne", name = "Z", descriptor = "Lclient!se;")
	public static Class65 aClass65_56 = new Class65();

	@OriginalMember(owner = "client!ne", name = "bb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1144 = Static6.method100("<col=c0ff00>");

	@OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
	public static int anInt2237 = 0;

	@OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
	public static int anInt2238 = 0;

	@OriginalMember(owner = "client!ne", name = "jb", descriptor = "Z")
	public static boolean aBoolean125 = false;

	@OriginalMember(owner = "client!ne", name = "nb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1145 = Static6.method100("Fallen lassen");

	@OriginalMember(owner = "client!ne", name = "pb", descriptor = "[I")
	public static int[] anIntArray225 = new int[128];

	@OriginalMember(owner = "client!ne", name = "rb", descriptor = "[Z")
	private static boolean[] aBooleanArray20 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!ne", name = "xb", descriptor = "[I")
	public static int[] anIntArray226 = new int[] { 2, 26, 57, 17, 34, 16, 48, 18 };

	@OriginalMember(owner = "client!ne", name = "zb", descriptor = "I")
	public static int anInt2249 = 0;

	@OriginalMember(owner = "client!ne", name = "Ab", descriptor = "[I")
	public static int[] anIntArray227 = new int[128];

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIII)V")
	public static void method1415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub14 local8 = Static89.method1642(arg1, arg2);
		if (local8 != null && local8.anObjectArray9 != null) {
			@Pc(22) Class3_Sub15 local22 = new Class3_Sub15();
			local22.aClass3_Sub14_11 = local8;
			local22.anObjectArray28 = local8.anObjectArray9;
			Static28.method595(local22);
		}
		Static117.aBoolean169 = true;
		Static100.anInt3233 = arg1;
		Static72.anInt2055 = arg2;
		Static57.anInt1731 = arg0;
		Static110.method2004(local8);
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
	public static void method1416() {
		aClass27_4 = null;
		anIntArray225 = null;
		aClass11_1 = null;
		aBooleanArray20 = null;
		aClass26_1144 = null;
		aClass65_56 = null;
		anIntArray226 = null;
		aClass26_1145 = null;
		anIntArray227 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILclient!nc;)I")
	public static int method1418(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub14 arg1) {
		if (arg1.anIntArrayArray18 == null || arg1.anIntArrayArray18.length <= arg0) {
			return -2;
		}
		try {
			@Pc(25) int[] local25 = arg1.anIntArrayArray18[arg0];
			@Pc(27) int local27 = 0;
			@Pc(29) byte local29 = 0;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(36) int local36 = local25[local31++];
				@Pc(38) byte local38 = 0;
				@Pc(40) int local40 = 0;
				if (local36 == 0) {
					return local27;
				}
				if (local36 == 1) {
					local40 = Static124.anIntArray385[local25[local31++]];
				}
				if (local36 == 15) {
					local38 = 1;
				}
				if (local36 == 16) {
					local38 = 2;
				}
				if (local36 == 17) {
					local38 = 3;
				}
				if (local36 == 2) {
					local40 = Static52.anIntArray160[local25[local31++]];
				}
				if (local36 == 3) {
					local40 = Static74.anIntArray202[local25[local31++]];
				}
				@Pc(112) int local112;
				@Pc(123) Class3_Sub14 local123;
				@Pc(128) int local128;
				@Pc(140) int local140;
				if (local36 == 4) {
					local112 = local25[local31++] << 16;
					@Pc(119) int local119 = local112 + local25[local31++];
					local123 = Static100.method2212(local119);
					local128 = local25[local31++];
					if (local128 != -1 && (!Static117.method2099(local128).aBoolean90 || Static125.aBoolean179)) {
						for (local140 = 0; local140 < local123.anIntArray214.length; local140++) {
							if (local123.anIntArray214[local140] == local128 + 1) {
								local40 += local123.anIntArray215[local140];
							}
						}
					}
				}
				if (local36 == 5) {
					local40 = Static52.anIntArray159[local25[local31++]];
				}
				if (local36 == 6) {
					local40 = Class34.anIntArray164[Static52.anIntArray160[local25[local31++]] - 1];
				}
				if (local36 == 7) {
					local40 = Static52.anIntArray159[local25[local31++]] * 100 / 46875;
				}
				if (local36 == 8) {
					local40 = Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt823;
				}
				if (local36 == 9) {
					for (local112 = 0; local112 < 25; local112++) {
						if (aBooleanArray20[local112]) {
							local40 += Static52.anIntArray160[local112];
						}
					}
				}
				if (local36 == 10) {
					local112 = local25[local31++] << 16;
					local112 += local25[local31++];
					local123 = Static100.method2212(local112);
					local128 = local25[local31++];
					if (local128 != -1 && (!Static117.method2099(local128).aBoolean90 || Static125.aBoolean179)) {
						for (local140 = 0; local140 < local123.anIntArray214.length; local140++) {
							if (local123.anIntArray214[local140] == local128 + 1) {
								local40 = 999999999;
								break;
							}
						}
					}
				}
				if (local36 == 11) {
					local40 = Static31.anInt2715;
				}
				if (local36 == 12) {
					local40 = Static125.anInt3206;
				}
				if (local36 == 13) {
					local112 = Static52.anIntArray159[local25[local31++]];
					@Pc(322) int local322 = local25[local31++];
					local40 = (0x1 << local322 & local112) == 0 ? 0 : 1;
				}
				if (local36 == 14) {
					local112 = local25[local31++];
					local40 = Static93.method1693(local112);
				}
				if (local36 == 18) {
					local40 = Static10.anInt286 + (Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2733 >> 7);
				}
				if (local36 == 19) {
					local40 = Static56.anInt1700 + (Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2731 >> 7);
				}
				if (local36 == 20) {
					local40 = local25[local31++];
				}
				if (local38 == 0) {
					if (local29 == 0) {
						local27 += local40;
					}
					if (local29 == 1) {
						local27 -= local40;
					}
					if (local29 == 2 && local40 != 0) {
						local27 /= local40;
					}
					if (local29 == 3) {
						local27 *= local40;
					}
					local29 = 0;
				} else {
					local29 = local38;
				}
			}
		} catch (@Pc(426) Exception local426) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(Z)V")
	public static void method1421() {
		for (@Pc(4) Class3_Sub22 local4 = (Class3_Sub22) Static70.aClass65_38.method1958(); local4 != null; local4 = (Class3_Sub22) Static70.aClass65_38.method1962()) {
			if (local4.aClass3_Sub1_Sub1_1 != null) {
				local4.method2075();
			}
		}
	}
}
