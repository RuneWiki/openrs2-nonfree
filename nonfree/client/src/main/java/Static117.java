import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!na", name = "C", descriptor = "I")
	public static int anInt966;

	@OriginalMember(owner = "client!na", name = "O", descriptor = "Z")
	private static boolean aBoolean39;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "I")
	public static final int anInt941 = 7759444;

	@OriginalMember(owner = "client!na", name = "m", descriptor = "I")
	public static int anInt951 = 100;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_220 = Static158.method3034("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!na", name = "G", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_221 = Static158.method3034(" <col=ffff00>");

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIZIII)V")
	public static void method745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg1;
		@Pc(21) int local21 = arg0 - arg1;
		@Pc(25) int local25 = arg0 * arg0;
		@Pc(29) int local29 = local21 * local21;
		@Pc(33) int local33 = arg5 * arg5;
		@Pc(37) int local37 = local16 * local16;
		@Pc(41) int local41 = local33 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local29 << 1;
		@Pc(53) int local53 = local37 << 1;
		@Pc(57) int local57 = arg5 << 1;
		@Pc(66) int local66 = local25 * (1 - local57) + local41;
		@Pc(70) int local70 = local16 << 1;
		@Pc(79) int local79 = local33 - (local57 - 1) * local45;
		@Pc(88) int local88 = local37 - (local70 - 1) * local49;
		@Pc(92) int local92 = local25 << 2;
		@Pc(96) int local96 = local33 << 2;
		@Pc(106) int local106 = local29 * (1 - local70) + local53;
		@Pc(110) int local110 = local29 << 2;
		@Pc(114) int local114 = local37 << 2;
		@Pc(118) int local118 = local41 * 3;
		@Pc(124) int local124 = (local57 - 3) * local45;
		@Pc(134) int local134 = local49 * (local70 - 3);
		@Pc(138) int local138 = local53 * 3;
		@Pc(140) int local140 = local96;
		@Pc(142) int local142 = local114;
		@Pc(148) int local148 = local110 * (local16 - 1);
		@Pc(154) int local154 = (arg5 - 1) * local92;
		@Pc(158) int[] local158 = Static42.anIntArrayArray8[arg2];
		Static163.method3070(arg4 - local21, arg4 + -arg0, arg3, local158);
		Static163.method3070(local21 + arg4, arg4 - local21, arg6, local158);
		Static163.method3070(arg0 + arg4, arg4 + local21, arg3, local158);
		while (local9 > 0) {
			if (local66 < 0) {
				while (local66 < 0) {
					local11++;
					local66 += local118;
					local118 += local96;
					local79 += local140;
					local140 += local96;
				}
			}
			if (local79 < 0) {
				local11++;
				local66 += local118;
				local79 += local140;
				local140 += local96;
				local118 += local96;
			}
			local79 += -local124;
			local66 += -local154;
			local154 -= local92;
			local124 -= local92;
			@Pc(261) int local261 = local11 + arg4;
			@Pc(266) int local266 = arg4 - local11;
			@Pc(273) boolean local273 = local16 >= local9;
			if (local273) {
				if (local106 < 0) {
					while (local106 < 0) {
						local88 += local142;
						local3++;
						local142 += local114;
						local106 += local138;
						local138 += local114;
					}
				}
				if (local88 < 0) {
					local3++;
					local106 += local138;
					local138 += local114;
					local88 += local142;
					local142 += local114;
				}
				local106 += -local148;
				local88 += -local134;
				local134 -= local110;
				local148 -= local110;
			}
			local9--;
			@Pc(343) int local343 = local9 + arg2;
			@Pc(348) int local348 = arg2 - local9;
			if (local273) {
				@Pc(372) int local372 = arg4 - local3;
				Static163.method3070(local372, local266, arg3, Static42.anIntArrayArray8[local348]);
				@Pc(384) int local384 = local3 + arg4;
				Static163.method3070(local384, local372, arg6, Static42.anIntArrayArray8[local348]);
				Static163.method3070(local261, local384, arg3, Static42.anIntArrayArray8[local348]);
				Static163.method3070(local372, local266, arg3, Static42.anIntArrayArray8[local343]);
				Static163.method3070(local384, local372, arg6, Static42.anIntArrayArray8[local343]);
				Static163.method3070(local261, local384, arg3, Static42.anIntArrayArray8[local343]);
			} else {
				Static163.method3070(local261, local266, arg3, Static42.anIntArrayArray8[local348]);
				Static163.method3070(local261, local266, arg3, Static42.anIntArrayArray8[local343]);
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BJ)V")
	public static void method755(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static81.anInt2399 >= 100 && Static116.anInt3222 != 1 || Static81.anInt2399 >= 200) {
			Static118.method2563(0, Static101.aClass60_807, Static70.aClass60_518);
			return;
		}
		@Pc(37) Class60 local37 = Static182.method3394(arg0).method2663();
		for (@Pc(39) int local39 = 0; local39 < Static81.anInt2399; local39++) {
			if (Static118.aLongArray5[local39] == arg0) {
				Static118.method2563(0, Static101.aClass60_807, Static193.method3536(new Class60[] { local37, Static58.aClass60_424 }));
				return;
			}
		}
		for (@Pc(76) int local76 = 0; local76 < Static88.anInt2600; local76++) {
			if (arg0 == Static138.aLongArray2[local76]) {
				Static118.method2563(0, Static101.aClass60_807, Static193.method3536(new Class60[] { Static172.aClass60_1157, local37, Static141.aClass60_1008 }));
				return;
			}
		}
		if (local37.method2687(Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.aClass60_288)) {
			Static118.method2563(0, Static101.aClass60_807, Static193.aClass60_1306);
			return;
		}
		Static169.aClass60Array25[Static81.anInt2399] = local37;
		Static118.aLongArray5[Static81.anInt2399] = arg0;
		Static93.anIntArray313[Static81.anInt2399] = 0;
		Static25.aClass60Array6[Static81.anInt2399] = Static101.aClass60_807;
		Static180.anIntArray373[Static81.anInt2399] = 0;
		Static1.anInt4 = Static157.anInt3990;
		Static81.anInt2399++;
		Static7.aClass2_Sub3_Sub1_43.method244(231);
		Static7.aClass2_Sub3_Sub1_43.method205(arg0);
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(B)V")
	public static void method758() {
		for (@Pc(6) Class2_Sub20 local6 = (Class2_Sub20) Static156.aClass51_11.method2465(); local6 != null; local6 = (Class2_Sub20) Static156.aClass51_11.method2462()) {
			@Pc(11) int local11 = local6.anInt3986;
			if (Static62.method1443(local11)) {
				@Pc(17) boolean local17 = true;
				@Pc(21) Class72[] local21 = Static197.aClass72ArrayArray1[local11];
				for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
					if (local21[local23] != null) {
						local17 = local21[local23].aBoolean151;
						break;
					}
				}
				if (!local17) {
					@Pc(51) int local51 = (int) local6.aLong151;
					@Pc(55) Class72 local55 = Static173.method3201(local51);
					if (local55 != null) {
						Static39.method900(local55);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!ob;)Z")
	public static boolean method759(@OriginalArg(1) Class60 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static88.anInt2600; local16++) {
			if (arg0.method2698(Static149.aClass60Array21[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!kb;IIIIII)V")
	public static void method761(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray299.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray299[local5] - Static18.anInt4397;
			local20 = arg0.anIntArray302[local5] - Static145.anInt3794;
			local27 = arg0.anIntArray295[local5] - Static36.anInt1081;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray307 != null) {
				Static92.anIntArray305[local5] = local37;
				Static92.anIntArray296[local5] = local59;
				Static92.anIntArray306[local5] = local69;
			}
			Static92.anIntArray297[local5] = Static45.anInt1423 + (local37 << 9) / local69;
			Static92.anIntArray304[local5] = Static45.anInt1421 + (local59 << 9) / local69;
		}
		Static45.anInt1422 = 0;
		local3 = arg0.anIntArray294.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray294[local13];
			local27 = arg0.anIntArray301[local13];
			local37 = arg0.anIntArray298[local13];
			@Pc(142) int local142 = Static92.anIntArray297[local20];
			@Pc(146) int local146 = Static92.anIntArray297[local27];
			@Pc(150) int local150 = Static92.anIntArray297[local37];
			@Pc(154) int local154 = Static92.anIntArray304[local20];
			@Pc(158) int local158 = Static92.anIntArray304[local27];
			@Pc(162) int local162 = Static92.anIntArray304[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static27.aBoolean30 && Static162.method3068(Static33.anInt1074, Static31.anInt988, local154, local158, local162, local142, local146, local150)) {
					Static179.anInt4364 = arg5;
					Static27.anInt829 = arg6;
				}
				Static45.aBoolean49 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static45.anInt1424 || local146 > Static45.anInt1424 || local150 > Static45.anInt1424) {
					Static45.aBoolean49 = true;
				}
				if (arg0.anIntArray307 == null || arg0.anIntArray307[local13] == -1) {
					if (arg0.anIntArray300[local13] != 12345678) {
						Static45.method1052(local154, local158, local162, local142, local146, local150, arg0.anIntArray300[local13], arg0.anIntArray303[local13], arg0.anIntArray293[local13]);
					}
				} else if (Static29.aBoolean35) {
					@Pc(363) int local363 = Static45.anInterface1_2.method2884(arg0.anIntArray307[local13]);
					Static45.method1052(local154, local158, local162, local142, local146, local150, Static26.method639(local363, arg0.anIntArray300[local13]), Static26.method639(local363, arg0.anIntArray303[local13]), Static26.method639(local363, arg0.anIntArray293[local13]));
				} else if (arg0.aBoolean105) {
					Static45.method1047(local154, local158, local162, local142, local146, local150, arg0.anIntArray300[local13], arg0.anIntArray303[local13], arg0.anIntArray293[local13], Static92.anIntArray305[0], Static92.anIntArray305[1], Static92.anIntArray305[3], Static92.anIntArray296[0], Static92.anIntArray296[1], Static92.anIntArray296[3], Static92.anIntArray306[0], Static92.anIntArray306[1], Static92.anIntArray306[3], arg0.anIntArray307[local13]);
				} else {
					Static45.method1047(local154, local158, local162, local142, local146, local150, arg0.anIntArray300[local13], arg0.anIntArray303[local13], arg0.anIntArray293[local13], Static92.anIntArray305[local20], Static92.anIntArray305[local27], Static92.anIntArray305[local37], Static92.anIntArray296[local20], Static92.anIntArray296[local27], Static92.anIntArray296[local37], Static92.anIntArray306[local20], Static92.anIntArray306[local27], Static92.anIntArray306[local37], arg0.anIntArray307[local13]);
				}
			}
		}
	}
}
