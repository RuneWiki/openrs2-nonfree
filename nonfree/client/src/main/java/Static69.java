import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!mb", name = "K", descriptor = "[I")
	public static int[] anIntArray195;

	@OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
	public static int anInt1610;

	@OriginalMember(owner = "client!mb", name = "U", descriptor = "Lclient!wf;")
	public static Class2_Sub1_Sub4_Sub3_Sub1 aClass2_Sub1_Sub4_Sub3_Sub1_2;

	@OriginalMember(owner = "client!mb", name = "bb", descriptor = "[Lclient!e;")
	public static Class2_Sub1_Sub4_Sub1[] aClass2_Sub1_Sub4_Sub1Array7;

	@OriginalMember(owner = "client!mb", name = "S", descriptor = "Lclient!pe;")
	public static Class65 aClass65_688 = Static119.method1462("leuchten1:");

	@OriginalMember(owner = "client!mb", name = "T", descriptor = "Lclient!pe;")
	public static Class65 aClass65_689 = Static119.method1462("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!mb", name = "eb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_690 = Static119.method1462("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!mb", name = "hb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_691 = aClass65_690;

	@OriginalMember(owner = "client!mb", name = "ib", descriptor = "[[S")
	public static short[][] aShortArrayArray3 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!mb", name = "kb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_692 = Static119.method1462(" loggt sich ein)3");

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	public static void method1226() {
		for (@Pc(3) int local3 = 0; local3 < Static50.anInt1215; local3++) {
			@Pc(9) int local9 = Static110.anIntArray327[local3]--;
			if (Static110.anIntArray327[local3] >= -10) {
				@Pc(76) Class44 local76 = Static130.aClass44Array1[local3];
				if (local76 == null) {
					local76 = Static140.method1081(Static16.aClass56_Sub1_25, Static128.anIntArray360[local3], 0);
					if (local76 == null) {
						continue;
					}
					Static110.anIntArray327[local3] += local76.method1082();
					Static130.aClass44Array1[local3] = local76;
				}
				if (Static110.anIntArray327[local3] < 0) {
					@Pc(113) int local113;
					if (Static115.anIntArray336[local3] == 0) {
						local113 = Static106.anInt2390;
					} else {
						@Pc(123) int local123 = (Static115.anIntArray336[local3] & 0xFF) * 128;
						@Pc(131) int local131 = Static115.anIntArray336[local3] >> 16 & 0xFF;
						@Pc(141) int local141 = local131 * 128 + 64 - Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1948;
						@Pc(149) int local149 = Static115.anIntArray336[local3] >> 8 & 0xFF;
						if (local141 < 0) {
							local141 = -local141;
						}
						@Pc(166) int local166 = local149 * 128 + 64 - Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1958;
						if (local166 < 0) {
							local166 = -local166;
						}
						@Pc(178) int local178 = local141 + local166 - 128;
						if (local123 < local178) {
							Static110.anIntArray327[local3] = -100;
							continue;
						}
						if (local178 < 0) {
							local178 = 0;
						}
						local113 = (local123 - local178) * Static7.anInt221 / local123;
					}
					if (local113 > 0) {
						@Pc(210) Class2_Sub5_Sub1 local210 = local76.method1084().method737(Static72.aClass64_1);
						@Pc(215) Class2_Sub2_Sub1 local215 = Static137.method508(local210, local113);
						local215.method511(Static34.anIntArray99[local3] - 1);
						Static104.aClass2_Sub2_Sub4_33.method1770(local215);
					}
					Static110.anIntArray327[local3] = -100;
				}
			} else {
				Static50.anInt1215--;
				for (@Pc(23) int local23 = local3; local23 < Static50.anInt1215; local23++) {
					Static128.anIntArray360[local23] = Static128.anIntArray360[local23 + 1];
					Static130.aClass44Array1[local23] = Static130.aClass44Array1[local23 + 1];
					Static34.anIntArray99[local23] = Static34.anIntArray99[local23 + 1];
					Static110.anIntArray327[local23] = Static110.anIntArray327[local23 + 1];
					Static115.anIntArray336[local23] = Static115.anIntArray336[local23 + 1];
				}
				local3--;
			}
		}
		if (Static100.aBoolean92 && !Static123.method1887()) {
			if (Static39.anInt840 != 0 && Static105.anInt2364 != -1) {
				Static107.method1736(0, Static105.anInt2364, Static88.aClass56_Sub1_19, Static39.anInt840);
			}
			Static100.aBoolean92 = false;
		}
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)V")
	public static void method1227() {
		aClass2_Sub1_Sub4_Sub3_Sub1_2 = null;
		aClass2_Sub1_Sub4_Sub1Array7 = null;
		aClass65_688 = null;
		anIntArray195 = null;
		aClass65_691 = null;
		aClass65_692 = null;
		aShortArrayArray3 = null;
		aClass65_689 = null;
		aClass65_690 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)Lclient!mb;")
	public static Class2_Sub1_Sub9 method1228(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub1_Sub9 local15 = (Class2_Sub1_Sub9) Static70.aClass8_37.method172((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static130.aClass56_39.method1666(arg0, 13);
		local15 = new Class2_Sub1_Sub9();
		local15.anInt1612 = arg0;
		if (local25 != null) {
			local15.method1225(new Class2_Sub4(local25));
		}
		Static70.aClass8_37.method176((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)V")
	public static void method1229(@OriginalArg(1) int arg0) {
		if (arg0 == -3) {
			Static40.method674(Static114.aClass65_1076, Static60.aClass65_201, Static78.aClass65_749);
		} else if (arg0 == -2) {
			Static40.method674(Static86.aClass65_807, Static60.aClass65_203, Static60.aClass65_216);
		} else if (arg0 == -1) {
			Static40.method674(Static114.aClass65_1081, Static60.aClass65_194, Static107.aClass65_1012);
		} else if (arg0 == 3) {
			Static40.method674(Static61.aClass65_648, Static60.aClass65_193, Static60.aClass65_215);
		} else if (arg0 == 4) {
			Static40.method674(Static50.aClass65_542, Static60.aClass65_228, Static33.aClass65_364);
		} else if (arg0 == 5) {
			Static40.method674(Static45.aClass65_502, Static60.aClass65_199, Static99.aClass65_944);
		} else if (arg0 == 6) {
			Static40.method674(Static119.aClass65_837, Static60.aClass65_198, Static127.aClass65_1188);
		} else if (arg0 == 7) {
			Static40.method674(Static76.aClass65_721, Static60.aClass65_209, Static2.aClass65_43);
		} else if (arg0 == 8) {
			Static40.method674(Static66.aClass65_674, Static60.aClass65_200, Static104.aClass65_1285);
		} else if (arg0 == 9) {
			Static40.method674(Static95.aClass65_905, Static60.aClass65_217, Static23.aClass65_761);
		} else if (arg0 == 10) {
			Static40.method674(Static4.aClass65_549, Static60.aClass65_211, Static104.aClass65_1282);
		} else if (arg0 == 11) {
			Static40.method674(Static35.aClass65_376, Static60.aClass65_197, Static71.aClass65_708);
		} else if (arg0 == 12) {
			Static40.method674(Static43.aClass65_479, Static60.aClass65_192, Static132.aClass65_1258);
		} else if (arg0 == 13) {
			Static40.method674(Static114.aClass65_1084, Static60.aClass65_205, Static48.aClass65_524);
		} else if (arg0 == 14) {
			Static40.method674(Static110.aClass65_1040, Static60.aClass65_214, Static76.aClass65_727);
		} else if (arg0 == 16) {
			Static40.method674(Static53.aClass65_554, Static60.aClass65_196, Static33.aClass65_367);
		} else if (arg0 == 17) {
			Static40.method674(Static40.aClass65_411, Static60.aClass65_208, Static20.aClass65_249);
		} else if (arg0 == 18) {
			Static40.method674(Static45.aClass65_501, Static60.aClass65_212, Static15.aClass65_130);
		} else if (arg0 == 19) {
			Static40.method674(Static134.aClass65_1276, Static76.aClass65_726, Static15.aClass65_133);
		} else if (arg0 == 20) {
			Static40.method674(Static114.aClass65_1078, Static60.aClass65_206, Static128.aClass65_1207);
		} else if (arg0 == 22) {
			Static40.method674(Static117.aClass65_1114, Static60.aClass65_229, Static10.aClass65_1277);
		} else if (arg0 == 23) {
			Static40.method674(Static110.aClass65_1042, Static60.aClass65_227, Static4.aClass65_545);
		} else if (arg0 == 24) {
			Static40.method674(Static43.aClass65_471, Static60.aClass65_219, Static125.aClass65_1167);
		} else if (arg0 == 25) {
			Static40.method674(Static114.aClass65_1080, Static60.aClass65_191, Static58.aClass65_636);
		} else if (arg0 == 26) {
			Static40.method674(Static77.aClass65_740, Static60.aClass65_207, Static81.aClass65_764);
		} else if (arg0 == 27) {
			Static40.method674(Static115.aClass65_1086, Static60.aClass65_224, Static60.aClass65_190);
		} else {
			Static40.method674(Static114.aClass65_1083, Static60.aClass65_210, Static83.aClass65_784);
		}
		Static98.method1604(10);
	}
}
