import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!hh", name = "gb", descriptor = "[I")
	public static int[] anIntArray136;

	@OriginalMember(owner = "client!hh", name = "kb", descriptor = "I")
	public static int anInt1714;

	@OriginalMember(owner = "client!hh", name = "W", descriptor = "I")
	public static int anInt1706 = 0;

	@OriginalMember(owner = "client!hh", name = "Z", descriptor = "[I")
	public static final int[] anIntArray135 = new int[5];

	@OriginalMember(owner = "client!hh", name = "cb", descriptor = "Z")
	public static boolean aBoolean105 = false;

	@OriginalMember(owner = "client!hh", name = "db", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_716 = Static187.method3089("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!hh", name = "pb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_721 = Static187.method3089("Unable to find ");

	@OriginalMember(owner = "client!hh", name = "eb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_717 = aClass92_721;

	@OriginalMember(owner = "client!hh", name = "mb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_719 = Static187.method3089("wave:");

	@OriginalMember(owner = "client!hh", name = "jb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_718 = aClass92_719;

	@OriginalMember(owner = "client!hh", name = "nb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_720 = aClass92_719;

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "(I)Z")
	public static boolean method1167() {
		return Static52.anInt1299 == 0 ? Static16.aClass1_Sub12_Sub3_2.method2237() : true;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(III)V")
	public static void method1169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass48_1 = null;
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)V")
	public static void method1170() {
		Static79.anInt1768 = -1;
		Static52.anInt1299 = 1;
		Static41.anInt1087 = 2;
		Static154.anInt3199 = -1;
		Static37.aClass3_5 = null;
		Static154.anInt3195 = 0;
		Static98.aBoolean123 = false;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!ff;IIIIII)V")
	public static void method1171(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = Static174.anInt3748;
		@Pc(3) int local3 = Static174.anInt3747;
		@Pc(7) int local7 = arg0.anIntArray94.length;
		@Pc(17) int local17;
		@Pc(24) int local24;
		@Pc(31) int local31;
		@Pc(41) int local41;
		for (@Pc(9) int local9 = 0; local9 < local7; local9++) {
			local17 = arg0.anIntArray94[local9] - Static59.anInt1427;
			local24 = arg0.anIntArray104[local9] - Static20.anInt538;
			local31 = arg0.anIntArray101[local9] - Static205.anInt4447;
			local41 = local31 * arg3 + local17 * arg4 >> 16;
			@Pc(51) int local51 = local31 * arg4 - local17 * arg3 >> 16;
			@Pc(63) int local63 = local24 * arg2 - local51 * arg1 >> 16;
			@Pc(73) int local73 = local24 * arg1 + local51 * arg2 >> 16;
			if (local73 < 50) {
				return;
			}
			if (arg0.anIntArray100 != null) {
				Static54.anIntArray103[local9] = local41;
				Static54.anIntArray102[local9] = local63;
				Static54.anIntArray96[local9] = local73;
			}
			Static54.anIntArray105[local9] = local1 + (local41 << 9) / local73;
			Static54.anIntArray93[local9] = local3 + (local63 << 9) / local73;
		}
		Static174.anInt3751 = 0;
		local7 = arg0.anIntArray99.length;
		for (local17 = 0; local17 < local7; local17++) {
			local24 = arg0.anIntArray99[local17];
			local31 = arg0.anIntArray97[local17];
			local41 = arg0.anIntArray106[local17];
			@Pc(146) int local146 = Static54.anIntArray105[local24];
			@Pc(150) int local150 = Static54.anIntArray105[local31];
			@Pc(154) int local154 = Static54.anIntArray105[local41];
			@Pc(158) int local158 = Static54.anIntArray93[local24];
			@Pc(162) int local162 = Static54.anIntArray93[local31];
			@Pc(166) int local166 = Static54.anIntArray93[local41];
			if ((local146 - local150) * (local166 - local162) - (local158 - local162) * (local154 - local150) > 0) {
				if (Static119.aBoolean148 && Static160.method2510(Static45.anInt1167, Static179.anInt3908, local158, local162, local166, local146, local150, local154)) {
					Static64.anInt1510 = arg5;
					Static74.anInt1650 = arg6;
				}
				Static174.aBoolean209 = false;
				if (local146 < 0 || local150 < 0 || local154 < 0 || local146 > Static174.anInt3750 || local150 > Static174.anInt3750 || local154 > Static174.anInt3750) {
					Static174.aBoolean209 = true;
				}
				if (arg0.anIntArray100 == null || arg0.anIntArray100[local17] == -1) {
					if (arg0.anIntArray107[local17] != 12345678) {
						Static174.method2848(local158, local162, local166, local146, local150, local154, arg0.anIntArray107[local17], arg0.anIntArray98[local17], arg0.anIntArray95[local17]);
					}
				} else if (Static65.aBoolean45) {
					@Pc(367) int local367 = Static174.anInterface3_2.method2592(arg0.anIntArray100[local17]);
					Static174.method2848(local158, local162, local166, local146, local150, local154, Static154.method2360(local367, arg0.anIntArray107[local17]), Static154.method2360(local367, arg0.anIntArray98[local17]), Static154.method2360(local367, arg0.anIntArray95[local17]));
				} else if (arg0.aBoolean82) {
					Static174.method2834(local158, local162, local166, local146, local150, local154, arg0.anIntArray107[local17], arg0.anIntArray98[local17], arg0.anIntArray95[local17], Static54.anIntArray103[0], Static54.anIntArray103[1], Static54.anIntArray103[3], Static54.anIntArray102[0], Static54.anIntArray102[1], Static54.anIntArray102[3], Static54.anIntArray96[0], Static54.anIntArray96[1], Static54.anIntArray96[3], arg0.anIntArray100[local17]);
				} else {
					Static174.method2834(local158, local162, local166, local146, local150, local154, arg0.anIntArray107[local17], arg0.anIntArray98[local17], arg0.anIntArray95[local17], Static54.anIntArray103[local24], Static54.anIntArray103[local31], Static54.anIntArray103[local41], Static54.anIntArray102[local24], Static54.anIntArray102[local31], Static54.anIntArray102[local41], Static54.anIntArray96[local24], Static54.anIntArray96[local31], Static54.anIntArray96[local41], arg0.anIntArray100[local17]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "(I)V")
	public static void method1172() {
		@Pc(7) boolean local7 = false;
		while (!local7) {
			local7 = true;
			for (@Pc(13) int local13 = 0; local13 < Static152.anInt3135 - 1; local13++) {
				if (Static120.aShortArray21[local13] < 1000 && Static120.aShortArray21[local13 + 1] > 1000) {
					@Pc(35) Class92 local35 = Static65.aClass92Array9[local13];
					local7 = false;
					Static65.aClass92Array9[local13] = Static65.aClass92Array9[local13 + 1];
					Static65.aClass92Array9[local13 + 1] = local35;
					@Pc(55) Class92 local55 = Static158.aClass92Array23[local13];
					Static158.aClass92Array23[local13] = Static158.aClass92Array23[local13 + 1];
					Static158.aClass92Array23[local13 + 1] = local55;
					@Pc(73) int local73 = Static119.anIntArray192[local13];
					Static119.anIntArray192[local13] = Static119.anIntArray192[local13 + 1];
					Static119.anIntArray192[local13 + 1] = local73;
					@Pc(91) int local91 = Static184.anIntArray327[local13];
					Static184.anIntArray327[local13] = Static184.anIntArray327[local13 + 1];
					Static184.anIntArray327[local13 + 1] = local91;
					@Pc(109) short local109 = Static120.aShortArray21[local13];
					Static120.aShortArray21[local13] = Static120.aShortArray21[local13 + 1];
					Static120.aShortArray21[local13 + 1] = local109;
					@Pc(127) long local127 = Static142.aLongArray8[local13];
					Static142.aLongArray8[local13] = Static142.aLongArray8[local13 + 1];
					Static142.aLongArray8[local13 + 1] = local127;
				}
			}
		}
	}
}
