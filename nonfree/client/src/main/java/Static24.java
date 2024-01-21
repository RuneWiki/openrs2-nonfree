import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!f", name = "g", descriptor = "Lclient!ja;")
	public static Class33 aClass33_8;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "I")
	public static int anInt716;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "Lclient!p;")
	public static Class33_Sub1 aClass33_Sub1_9;

	@OriginalMember(owner = "client!f", name = "o", descriptor = "I")
	public static int anInt719;

	@OriginalMember(owner = "client!f", name = "q", descriptor = "J")
	public static long aLong18;

	@OriginalMember(owner = "client!f", name = "s", descriptor = "Lclient!na;")
	public static Class44 aClass44_3;

	@OriginalMember(owner = "client!f", name = "u", descriptor = "[I")
	public static int[] anIntArray70;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "Lclient!fa;")
	public static Class22 aClass22_6 = new Class22();

	@OriginalMember(owner = "client!f", name = "j", descriptor = "Lclient!mc;")
	private static Class42 aClass42_383 = Static23.method501("Loaded wordpack");

	@OriginalMember(owner = "client!f", name = "k", descriptor = "I")
	public static int anInt717 = 0;

	@OriginalMember(owner = "client!f", name = "l", descriptor = "Lclient!mc;")
	public static Class42 aClass42_384 = Static23.method501("Name des Gegenstands eingeben:");

	@OriginalMember(owner = "client!f", name = "m", descriptor = "I")
	public static int anInt718 = 0;

	@OriginalMember(owner = "client!f", name = "n", descriptor = "Lclient!mc;")
	public static Class42 aClass42_385 = Static23.method501("Okay");

	@OriginalMember(owner = "client!f", name = "p", descriptor = "I")
	public static int anInt720 = 0;

	@OriginalMember(owner = "client!f", name = "r", descriptor = "Lclient!mc;")
	public static Class42 aClass42_386 = aClass42_383;

	@OriginalMember(owner = "client!f", name = "t", descriptor = "Lclient!mc;")
	public static Class42 aClass42_387 = Static23.method501("chatback");

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V")
	public static void method507(@OriginalArg(1) int arg0) {
		Static5.anInt128 = arg0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public static void method508() {
		if (Static21.anInt665 == 0) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(18) Class1_Sub1_Sub1_Sub3 local18 = Static95.aClass1_Sub1_Sub1_Sub3_3;
		if (Static25.anInt732 != 0) {
			local16 = 1;
		}
		for (@Pc(27) int local27 = 0; local27 < 100; local27++) {
			if (Static15.aClass42Array4[local27] != null) {
				@Pc(37) int local37 = Static52.anIntArray209[local27];
				@Pc(39) byte local39 = 0;
				@Pc(43) Class42 local43 = Static97.aClass42Array13[local27];
				if (local43 != null && local43.method1061(Static49.aClass42_696)) {
					local39 = 1;
					local43 = local43.method1051(5);
				}
				if (local43 != null && local43.method1061(Static17.aClass42_318)) {
					local39 = 2;
					local43 = local43.method1051(5);
				}
				@Pc(106) int local106;
				if ((local37 == 3 || local37 == 7) && (local37 == 7 || Static30.anInt834 == 0 || Static30.anInt834 == 1 && Static71.method1287(local43))) {
					local106 = 329 - local16 * 13;
					local16++;
					local18.method818(Static60.aClass42_785, 4, local106, 0);
					local18.method818(Static60.aClass42_785, 4, local106 - 1, 65535);
					@Pc(127) int local127 = local18.method805(Static60.aClass42_785) + 4;
					local127 += local18.method820(32);
					if (local39 == 1) {
						Static90.aClass1_Sub1_Sub1_Sub4Array6[0].method1147(local127, local106 - 12);
						local127 += 14;
					}
					if (local39 == 2) {
						Static90.aClass1_Sub1_Sub1_Sub4Array6[1].method1147(local127, local106 - 12);
						local127 += 14;
					}
					local18.method818(Static57.method1822(new Class42[] { local43, Static54.aClass42_754, Static15.aClass42Array4[local27] }), local127, local106, 0);
					local18.method818(Static57.method1822(new Class42[] { local43, Static54.aClass42_754, Static15.aClass42Array4[local27] }), local127, local106 - 1, 65535);
					if (local16 >= 5) {
						return;
					}
				}
				if (local37 == 5 && Static30.anInt834 < 2) {
					local106 = 329 - local16 * 13;
					local16++;
					local18.method818(Static15.aClass42Array4[local27], 4, local106, 0);
					local18.method818(Static15.aClass42Array4[local27], 4, local106 - 1, 65535);
					if (local16 >= 5) {
						return;
					}
				}
				if (local37 == 6 && Static30.anInt834 < 2) {
					local106 = 329 - local16 * 13;
					local18.method818(Static57.method1822(new Class42[] { Static12.aClass42_206, Static59.aClass42_1048, local43, Static54.aClass42_754, Static15.aClass42Array4[local27] }), 4, local106, 0);
					local18.method818(Static57.method1822(new Class42[] { Static12.aClass42_206, Static59.aClass42_1048, local43, Static54.aClass42_754, Static15.aClass42Array4[local27] }), 4, local106 - 1, 65535);
					local16++;
					if (local16 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!mc;IILclient!mc;)V")
	public static void method509(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class42 arg2) {
		if (Static108.anInt2745 == -1) {
			Static28.aBoolean41 = true;
		}
		if (arg1 == 0 && Static45.anInt1850 != -1) {
			Static80.anInt2104 = 0;
			Static25.aClass42_396 = arg2;
		}
		for (@Pc(25) int local25 = 99; local25 > 0; local25--) {
			Static52.anIntArray209[local25] = Static52.anIntArray209[local25 - 1];
			Static97.aClass42Array13[local25] = Static97.aClass42Array13[local25 - 1];
			Static15.aClass42Array4[local25] = Static15.aClass42Array4[local25 - 1];
		}
		Static52.anIntArray209[0] = arg1;
		Static97.aClass42Array13[0] = arg0;
		Static15.aClass42Array4[0] = arg2;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IBI)Lclient!mc;")
	public static Class42 method510(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 - arg0;
		if (local7 < -9) {
			return Static21.aClass42_374;
		} else if (local7 < -6) {
			return Static34.aClass42_464;
		} else if (local7 < -3) {
			return Static73.aClass42_965;
		} else if (local7 < 0) {
			return Static57.aClass42_1418;
		} else if (local7 > 9) {
			return Static45.aClass42_961;
		} else if (local7 > 6) {
			return Static31.aClass42_1211;
		} else if (local7 > 3) {
			return Static20.aClass42_357;
		} else if (local7 > 0) {
			return Static13.aClass42_244;
		} else {
			return Static99.aClass42_1353;
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
	public static void method511() {
		aClass44_3 = null;
		aClass42_383 = null;
		aClass22_6 = null;
		aClass42_384 = null;
		aClass42_387 = null;
		aClass42_386 = null;
		anIntArray70 = null;
		aClass33_Sub1_9 = null;
		aClass42_385 = null;
		aClass33_8 = null;
	}
}
