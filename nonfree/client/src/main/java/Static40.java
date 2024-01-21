import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ed", name = "X", descriptor = "I")
	public static int anInt1276;

	@OriginalMember(owner = "client!ed", name = "eb", descriptor = "[Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3[] aClass1_Sub2_Sub1_Sub3Array7;

	@OriginalMember(owner = "client!ed", name = "T", descriptor = "Lclient!ld;")
	public static Class47 aClass47_10 = new Class47(100);

	@OriginalMember(owner = "client!ed", name = "W", descriptor = "Lclient!dd;")
	public static Class13 aClass13_447 = Static161.method2971("me");

	@OriginalMember(owner = "client!ed", name = "bb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_451 = Static161.method2971(" seconds)3");

	@OriginalMember(owner = "client!ed", name = "Y", descriptor = "Lclient!dd;")
	public static Class13 aClass13_448 = aClass13_451;

	@OriginalMember(owner = "client!ed", name = "Z", descriptor = "Lclient!dd;")
	public static Class13 aClass13_449 = Static161.method2971(")3runescape)3com");

	@OriginalMember(owner = "client!ed", name = "ab", descriptor = "Lclient!dd;")
	public static Class13 aClass13_450 = Static161.method2971("Untersuchen");

	@OriginalMember(owner = "client!ed", name = "cb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_452 = Static161.method2971("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!ed", name = "db", descriptor = "Lclient!dd;")
	public static Class13 aClass13_453 = null;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)V")
	public static void method1043() {
		aClass47_10 = null;
		aClass13_447 = null;
		aClass13_453 = null;
		aClass13_451 = null;
		aClass13_449 = null;
		aClass13_450 = null;
		aClass13_452 = null;
		aClass13_448 = null;
		aClass1_Sub2_Sub1_Sub3Array7 = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)V")
	public static void method1044(@OriginalArg(1) boolean arg0) {
		Static90.aBoolean192 = arg0;
		@Pc(15) int local15;
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(43) int local43;
		@Pc(49) int local49;
		@Pc(53) int local53;
		@Pc(137) int local137;
		@Pc(145) int local145;
		@Pc(153) int local153;
		if (!Static90.aBoolean192) {
			local15 = Static153.aClass1_Sub8_Sub1_2.method1636();
			local19 = Static153.aClass1_Sub8_Sub1_2.method1636();
			local25 = Static153.aClass1_Sub8_Sub1_2.method1636();
			local31 = Static153.aClass1_Sub8_Sub1_2.method1638();
			local35 = Static153.aClass1_Sub8_Sub1_2.method1634();
			local43 = (Static89.anInt2506 - Static153.aClass1_Sub8_Sub1_2.anInt2195) / 16;
			Static121.anIntArrayArray25 = new int[local43][4];
			for (local49 = 0; local49 < local43; local49++) {
				for (local53 = 0; local53 < 4; local53++) {
					Static121.anIntArrayArray25[local49][local53] = Static153.aClass1_Sub8_Sub1_2.method1617();
				}
			}
			Static149.anIntArray352 = new int[local43];
			Static106.aByteArrayArray8 = new byte[local43][];
			Static66.anIntArray201 = new int[local43];
			Static98.anIntArray391 = new int[local43];
			Static117.aByteArrayArray9 = new byte[local43][];
			@Pc(92) boolean local92 = false;
			if ((local25 / 8 == 48 || local25 / 8 == 49) && (local19 / 8) == 48) {
				local92 = true;
			}
			if (local25 / 8 == 48 && local19 / 8 == 148) {
				local92 = true;
			}
			local43 = 0;
			for (local137 = (local25 - 6) / 8; local137 <= (local25 + 6) / 8; local137++) {
				for (local145 = (local19 - 6) / 8; local145 <= (local19 + 6) / 8; local145++) {
					local153 = local145 + (local137 << 8);
					if (!local92 || local145 != 49 && local145 != 149 && local145 != 147 && local137 != 50 && (local137 != 49 || local145 != 47)) {
						Static149.anIntArray352[local43] = local153;
						Static98.anIntArray391[local43] = Static42.aClass4_Sub1_21.method2241(Static57.method1349(new Class13[] { Static16.aClass13_254, Static3.method75(local137), Static95.aClass13_880, Static3.method75(local145) }));
						Static66.anIntArray201[local43] = Static42.aClass4_Sub1_21.method2241(Static57.method1349(new Class13[] { Static98.aClass13_1289, Static3.method75(local137), Static95.aClass13_880, Static3.method75(local145) }));
						local43++;
					}
				}
			}
			Static66.method1446(local35, local31, local15, local25, local19);
			return;
		}
		local15 = Static153.aClass1_Sub8_Sub1_2.method1607();
		local19 = Static153.aClass1_Sub8_Sub1_2.method1636();
		local25 = Static153.aClass1_Sub8_Sub1_2.method1634();
		Static153.aClass1_Sub8_Sub1_2.method1657();
		for (local31 = 0; local31 < 4; local31++) {
			for (local35 = 0; local35 < 13; local35++) {
				for (local43 = 0; local43 < 13; local43++) {
					local49 = Static153.aClass1_Sub8_Sub1_2.method1656(1);
					if (local49 == 1) {
						Static39.anIntArrayArrayArray1[local31][local35][local43] = Static153.aClass1_Sub8_Sub1_2.method1656(26);
					} else {
						Static39.anIntArrayArrayArray1[local31][local35][local43] = -1;
					}
				}
			}
		}
		Static153.aClass1_Sub8_Sub1_2.method1662();
		local35 = (Static89.anInt2506 - Static153.aClass1_Sub8_Sub1_2.anInt2195) / 16;
		Static121.anIntArrayArray25 = new int[local35][4];
		for (local43 = 0; local43 < local35; local43++) {
			for (local49 = 0; local49 < 4; local49++) {
				Static121.anIntArrayArray25[local43][local49] = Static153.aClass1_Sub8_Sub1_2.method1602();
			}
		}
		local49 = Static153.aClass1_Sub8_Sub1_2.method1636();
		local53 = Static153.aClass1_Sub8_Sub1_2.method1642();
		Static106.aByteArrayArray8 = new byte[local35][];
		Static98.anIntArray391 = new int[local35];
		Static149.anIntArray352 = new int[local35];
		Static117.aByteArrayArray9 = new byte[local35][];
		Static66.anIntArray201 = new int[local35];
		local35 = 0;
		for (local137 = 0; local137 < 4; local137++) {
			for (local145 = 0; local145 < 13; local145++) {
				for (local153 = 0; local153 < 13; local153++) {
					@Pc(435) int local435 = Static39.anIntArrayArrayArray1[local137][local145][local153];
					if (local435 != -1) {
						@Pc(444) int local444 = local435 >> 3 & 0x7FF;
						@Pc(450) int local450 = local435 >> 14 & 0x3FF;
						@Pc(460) int local460 = local444 / 8 + (local450 / 8 << 8);
						for (@Pc(462) int local462 = 0; local462 < local35; local462++) {
							if (local460 == Static149.anIntArray352[local462]) {
								local460 = -1;
								break;
							}
						}
						if (local460 != -1) {
							Static149.anIntArray352[local35] = local460;
							@Pc(496) int local496 = local460 & 0xFF;
							@Pc(502) int local502 = local460 >> 8 & 0xFF;
							Static98.anIntArray391[local35] = Static42.aClass4_Sub1_21.method2241(Static57.method1349(new Class13[] { Static16.aClass13_254, Static3.method75(local502), Static95.aClass13_880, Static3.method75(local496) }));
							Static66.anIntArray201[local35] = Static42.aClass4_Sub1_21.method2241(Static57.method1349(new Class13[] { Static98.aClass13_1289, Static3.method75(local502), Static95.aClass13_880, Static3.method75(local496) }));
							local35++;
						}
					}
				}
			}
		}
		Static66.method1446(local53, local15, local25, local19, local49);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BIIIIIII)V")
	public static void method1045(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static171.method2892(arg6)) {
			Static178.method2943(-1, Static145.aClass20ArrayArray1[arg6], arg3, arg2, arg0, arg1, arg4, arg5);
		}
	}
}
