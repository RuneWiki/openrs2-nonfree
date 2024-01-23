import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "[S")
	public static short[] aShortArray6;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "[I")
	public static int[] anIntArray48;

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
	public static int anInt730 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
	public static void method639() {
		Static198.anImage4 = null;
		Static66.aFont1 = null;
		Static177.aFontMetrics1 = null;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 == arg0 && arg7 == arg8 && arg1 == arg3 && arg5 == arg4) {
			Static10.method248(arg5, arg7, arg0, arg2, arg1);
			return;
		}
		@Pc(24) int local24 = arg0;
		@Pc(26) int local26 = arg7;
		@Pc(30) int local30 = arg7 * 3;
		@Pc(34) int local34 = arg0 * 3;
		@Pc(38) int local38 = arg8 * 3;
		@Pc(42) int local42 = arg3 * 3;
		@Pc(46) int local46 = arg6 * 3;
		@Pc(50) int local50 = arg4 * 3;
		@Pc(60) int local60 = arg1 + local46 - arg0 - local42;
		@Pc(71) int local71 = arg5 + local38 - local50 - arg7;
		@Pc(82) int local82 = local50 + local30 - local38 - local38;
		@Pc(87) int local87 = local38 - local30;
		@Pc(96) int local96 = local42 + local34 - local46 - local46;
		@Pc(101) int local101 = local46 - local34;
		for (@Pc(103) int local103 = 128; local103 <= 4096; local103 += 128) {
			@Pc(112) int local112 = local103 * local103 >> 12;
			@Pc(118) int local118 = local112 * local103 >> 12;
			@Pc(122) int local122 = local71 * local118;
			@Pc(126) int local126 = local103 * local101;
			@Pc(130) int local130 = local118 * local60;
			@Pc(134) int local134 = local112 * local96;
			@Pc(138) int local138 = local112 * local82;
			@Pc(149) int local149 = arg0 + (local126 + local134 + local130 >> 12);
			@Pc(153) int local153 = local87 * local103;
			@Pc(163) int local163 = (local153 + local138 + local122 >> 12) + arg7;
			Static10.method248(local163, local26, local24, arg2, local149);
			local24 = local149;
			local26 = local163;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method641(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) byte local10 = 2;
		@Pc(18) char[] local18 = new char[local8];
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			@Pc(31) char local31 = arg0.charAt(local20);
			if (local10 == 0) {
				local31 = Character.toLowerCase(local31);
			} else if (local10 == 2 || Character.isUpperCase(local31)) {
				local31 = Static155.method4931(local31);
			}
			if (Character.isLetter(local31)) {
				local10 = 0;
			} else if (local31 == '.' || local31 == '?' || local31 == '!') {
				local10 = 2;
			} else if (!Character.isSpaceChar(local31)) {
				local10 = 1;
			} else if (local10 != 2) {
				local10 = 1;
			}
			local18[local20] = local31;
		}
		return new String(local18);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(SIJIIILjava/lang/String;Ljava/lang/String;)V")
	public static void method642(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6) {
		if (Static299.aBoolean203 || Static216.anInt4481 >= 500) {
			return;
		}
		Static250.aStringArray28[Static216.anInt4481] = arg6;
		Static214.aStringArray22[Static216.anInt4481] = arg5;
		Static77.anIntArray116[Static216.anInt4481] = arg3 == -1 ? Static260.anInt5409 : arg3;
		Static289.aShortArray93[Static216.anInt4481] = arg0;
		Static232.aLongArray18[Static216.anInt4481] = arg2;
		Static163.anIntArray262[Static216.anInt4481] = arg4;
		Static55.anIntArray97[Static216.anInt4481] = arg1;
		Static216.anInt4481++;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!cm;BII)V")
	public static void method643(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static216.anInt4481 >= 400) {
			return;
		}
		if (arg1.anIntArray55 != null) {
			arg1 = arg1.method719();
		}
		if (arg1 == null || !arg1.aBoolean64) {
			return;
		}
		@Pc(37) String local37 = arg1.aString44;
		if (arg1.anInt872 != 0) {
			@Pc(49) String local49 = Static84.anInt825 == 1 ? Static110.aString123 : Static293.aString295;
			local37 = local37 + Static219.method3702(Static111.aClass36_Sub3_Sub2_1.anInt5159, arg1.anInt872) + " (" + local49 + arg1.anInt872 + ")";
		}
		if (Static106.anInt2305 == 1) {
			method642((short) 19, arg2, (long) arg0, Static124.anInt2629, arg3, Static8.aString13 + " -> <col=ffff00>" + local37, Static212.aString224);
		} else if (Static133.aBoolean219) {
			@Pc(355) Class2_Sub3_Sub8 local355 = Static251.anInt5008 == -1 ? null : Static268.method4459(Static251.anInt5008);
			if ((Static212.anInt4455 & 0x2) != 0 && (local355 == null || arg1.method709(local355.anInt2217, Static251.anInt5008) != local355.anInt2217)) {
				method642((short) 58, arg2, (long) arg0, Static112.anInt2421, arg3, Static150.aString153 + " -> <col=ffff00>" + local37, Static296.aString299);
			}
		} else {
			@Pc(109) String[] local109 = arg1.aStringArray4;
			if (Static92.aBoolean156) {
				local109 = Static171.method2955(local109);
			}
			@Pc(121) int local121;
			if (local109 != null) {
				for (local121 = 4; local121 >= 0; local121--) {
					if (local109[local121] != null && (Static84.anInt825 != 0 || !local109[local121].equalsIgnoreCase(Static203.aString210))) {
						@Pc(144) byte local144 = 0;
						if (local121 == 0) {
							local144 = 12;
						}
						@Pc(157) int local157 = -1;
						if (local121 == 1) {
							local144 = 24;
						}
						if (local121 == 2) {
							local144 = 42;
						}
						if (local121 == 3) {
							local144 = 39;
						}
						if (local121 == arg1.anInt881) {
							local157 = arg1.anInt870;
						}
						if (local121 == 4) {
							local144 = 8;
						}
						if (local121 == arg1.anInt875) {
							local157 = arg1.anInt893;
						}
						method642(local144, arg2, (long) arg0, local157, arg3, "<col=ffff00>" + local37, local109[local121]);
					}
				}
			}
			if (Static84.anInt825 == 0 && local109 != null) {
				for (local121 = 4; local121 >= 0; local121--) {
					if (local109[local121] != null && local109[local121].equalsIgnoreCase(Static203.aString210)) {
						@Pc(252) short local252 = 0;
						@Pc(254) short local254 = 0;
						if (Static111.aClass36_Sub3_Sub2_1.anInt5159 < arg1.anInt872) {
							local252 = 2000;
						}
						if (local121 == 0) {
							local254 = 12;
						}
						if (local121 == 1) {
							local254 = 24;
						}
						if (local121 == 2) {
							local254 = 42;
						}
						if (local121 == 3) {
							local254 = 39;
						}
						if (local121 == 4) {
							local254 = 8;
						}
						if (local254 != 0) {
							local254 += local252;
						}
						method642(local254, arg2, (long) arg0, arg1.anInt890, arg3, "<col=ffff00>" + local37, local109[local121]);
					}
				}
			}
			method642((short) 1004, arg2, (long) arg0, Static188.anInt3950, arg3, "<col=ffff00>" + local37, Static30.aString43);
		}
	}
}
