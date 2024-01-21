import java.util.Calendar;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
	public static int anInt1354;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "Lclient!lf;")
	public static Class7 aClass7_8;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "Lclient!fc;")
	public static Class25 aClass25_585 = Static78.method1313(" <col=ffffff>(X");

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
	public static int anInt1355 = 0;

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "Lclient!fc;")
	public static Class25 aClass25_586 = Static78.method1313(" ");

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "Lclient!fc;")
	private static Class25 aClass25_587 = Static78.method1313("Hide");

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "Lclient!fc;")
	public static Class25 aClass25_588 = aClass25_587;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
	public static int anInt1356 = 0;

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "Lclient!fc;")
	private static Class25 aClass25_589 = Static78.method1313("Loading config )2 ");

	@OriginalMember(owner = "client!jf", name = "t", descriptor = "Lclient!fc;")
	private static Class25 aClass25_590 = Static78.method1313("Loading game screen )2 ");

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "Lclient!fc;")
	public static Class25 aClass25_591 = aClass25_589;

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "Lclient!fc;")
	public static Class25 aClass25_592 = aClass25_590;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI[BI)Z")
	public static boolean method1058(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class1_Sub5 local15 = new Class1_Sub5(arg1);
		@Pc(17) int local17 = -1;
		@Pc(19) boolean local19 = true;
		label70: while (true) {
			@Pc(23) int local23 = local15.method674();
			if (local23 == 0) {
				return local19;
			}
			local17 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(69) int local69;
				@Pc(96) Class1_Sub2_Sub6 local96;
				do {
					@Pc(77) int local77;
					@Pc(73) int local73;
					do {
						do {
							do {
								do {
									@Pc(42) int local42;
									while (local36) {
										local42 = local15.method674();
										if (local42 == 0) {
											continue label70;
										}
										local15.method672();
									}
									local42 = local15.method674();
									if (local42 == 0) {
										continue label70;
									}
									local34 += local42 - 1;
									@Pc(59) int local59 = local34 >> 6 & 0x3F;
									@Pc(63) int local63 = local34 & 0x3F;
									local69 = local15.method672() >> 2;
									local73 = local63 + arg2;
									local77 = arg0 + local59;
								} while (local77 <= 0);
							} while (local73 <= 0);
						} while (local77 >= 103);
					} while (local73 >= 103);
					local96 = Static78.method1315(local17);
				} while (local69 == 22 && Static63.aBoolean55 && local96.anInt877 == 0 && local96.anInt871 != 1 && !local96.aBoolean35);
				if (!local96.method712()) {
					local19 = false;
					Static105.anInt2381++;
				}
				local36 = true;
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public static void method1059() {
		if (Static11.anInt277 != 1) {
			return;
		}
		if (Static30.anInt815 >= 6 && Static30.anInt815 <= 106 && Static23.anInt675 >= 467 && Static23.anInt675 <= 499) {
			Static82.anInt1811 = (Static82.anInt1811 + 1) % 4;
			Static18.aBoolean18 = true;
			Static110.aBoolean113 = true;
			Static68.aClass1_Sub5_Sub1_2.method688(11);
			Static68.aClass1_Sub5_Sub1_2.method676(Static82.anInt1811);
			Static68.aClass1_Sub5_Sub1_2.method676(Static80.anInt1785);
			Static68.aClass1_Sub5_Sub1_2.method676(Static11.anInt279);
		}
		if (Static30.anInt815 >= 135 && Static30.anInt815 <= 235 && Static23.anInt675 >= 467 && Static23.anInt675 <= 499) {
			Static80.anInt1785 = (Static80.anInt1785 + 1) % 3;
			Static110.aBoolean113 = true;
			Static18.aBoolean18 = true;
			Static68.aClass1_Sub5_Sub1_2.method688(11);
			Static68.aClass1_Sub5_Sub1_2.method676(Static82.anInt1811);
			Static68.aClass1_Sub5_Sub1_2.method676(Static80.anInt1785);
			Static68.aClass1_Sub5_Sub1_2.method676(Static11.anInt279);
		}
		if (Static30.anInt815 >= 273 && Static30.anInt815 <= 373 && Static23.anInt675 >= 467 && Static23.anInt675 <= 499) {
			Static110.aBoolean113 = true;
			Static11.anInt279 = (Static11.anInt279 + 1) % 3;
			Static18.aBoolean18 = true;
			Static68.aClass1_Sub5_Sub1_2.method688(11);
			Static68.aClass1_Sub5_Sub1_2.method676(Static82.anInt1811);
			Static68.aClass1_Sub5_Sub1_2.method676(Static80.anInt1785);
			Static68.aClass1_Sub5_Sub1_2.method676(Static11.anInt279);
		}
		if (Static30.anInt815 < 412 || Static30.anInt815 > 512 || Static23.anInt675 < 467 || Static23.anInt675 > 499) {
			return;
		}
		if (Static108.anInt2497 != -1) {
			Static25.method584(0, Static3.aClass25_44, Static92.aClass25_985);
			if (Static115.aClass25_1289 != null) {
				Static25.method584(0, Static115.aClass25_1289, Static92.aClass25_985);
			}
			return;
		}
		Static9.method238();
		if (Static9.anInt244 != -1) {
			Static89.aBoolean17 = false;
			Static52.anInt1260 = Static108.anInt2497 = Static9.anInt244;
			Static92.aClass25_979 = Static92.aClass25_985;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)V")
	public static void method1060(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static2.aBooleanArray1[arg0]) {
			return;
		}
		Static45.aClass56_42.method1272(arg0);
		if (Static56.aClass1_Sub2_Sub14ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(28) int local28 = 0; local28 < Static56.aClass1_Sub2_Sub14ArrayArray1[arg0].length; local28++) {
			if (Static56.aClass1_Sub2_Sub14ArrayArray1[arg0][local28] != null) {
				if (Static56.aClass1_Sub2_Sub14ArrayArray1[arg0][local28].anInt1960 == 2) {
					local26 = false;
				} else {
					Static56.aClass1_Sub2_Sub14ArrayArray1[arg0][local28] = null;
				}
			}
		}
		if (local26) {
			Static56.aClass1_Sub2_Sub14ArrayArray1[arg0] = null;
		}
		Static2.aBooleanArray1[arg0] = false;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)Z")
	public static boolean method1061(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0 && arg0 == Static28.anInt746) {
			return true;
		} else if (arg1 == 1 && Static126.anInt2933 == arg0) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && Static99.anInt2315 == arg0;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIII)I")
	public static int method1062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(23) int local23 = 65536 - Class1_Sub2_Sub2_Sub2.anIntArray185[arg0 * 1024 / arg2] >> 1;
		return ((65536 - local23) * arg1 >> 16) + (local23 * arg3 >> 16);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public static void method1063() {
		aClass25_589 = null;
		aClass25_591 = null;
		aClass7_8 = null;
		aCalendar1 = null;
		aClass25_590 = null;
		aClass25_585 = null;
		aClass25_587 = null;
		aClass25_592 = null;
		aCRC32_2 = null;
		aClass25_588 = null;
		aClass25_586 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)Lclient!fc;")
	public static Class25 method1064(@OriginalArg(1) int arg0) {
		return Static116.method1859(new Class25[] { Static74.method1214(arg0 >> 24 & 0xFF), Static53.aClass25_1236, Static74.method1214(arg0 >> 16 & 0xFF), Static53.aClass25_1236, Static74.method1214(arg0 >> 8 & 0xFF), Static53.aClass25_1236, Static74.method1214(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BILclient!q;)V")
	public static void method1065(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub2_Sub3_Sub4 arg1) {
		Static107.method1733(arg1.anInt2832, arg0, arg1.anInt2827);
	}
}
