import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!h", name = "bb", descriptor = "Lclient!cb;")
	public static Class13_Sub1 aClass13_Sub1_7;

	@OriginalMember(owner = "client!h", name = "L", descriptor = "Lclient!sd;")
	public static Class73 aClass73_751 = Static122.method531("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!h", name = "M", descriptor = "Lclient!sd;")
	public static Class73 aClass73_752 = Static122.method531("<col=ff0000>");

	@OriginalMember(owner = "client!h", name = "R", descriptor = "I")
	public static int anInt1360 = 0;

	@OriginalMember(owner = "client!h", name = "S", descriptor = "Lclient!vd;")
	public static Class83 aClass83_8 = null;

	@OriginalMember(owner = "client!h", name = "Z", descriptor = "Lclient!sd;")
	private static Class73 aClass73_753 = Static122.method531("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!h", name = "fb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_754 = aClass73_753;

	@OriginalMember(owner = "client!h", name = "hb", descriptor = "I")
	public static int anInt1368 = 1;

	@OriginalMember(owner = "client!h", name = "kb", descriptor = "I")
	public static int anInt1371 = -1;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	public static void method1012() {
		if (Static139.aClass83_11 != null || Static16.aClass83_5 != null) {
			return;
		}
		@Pc(18) int local18 = Static2.anInt7;
		@Pc(34) int local34;
		@Pc(90) int local90;
		@Pc(84) int local84;
		if (Static169.aBoolean245) {
			if (local18 != 1) {
				local34 = Static37.anInt899;
				local90 = Static5.anInt107;
				if (local34 < Static116.anInt2761 - 10 || local34 > Static116.anInt2761 + Static133.anInt3045 + 10 || Static138.anInt3195 - 10 > local90 || local90 > Static138.anInt3195 + Static53.anInt3959 + 10) {
					Static169.aBoolean245 = false;
					Static23.method500(Static53.anInt3959, Static116.anInt2761, Static138.anInt3195, Static133.anInt3045);
				}
			}
			if (local18 != 1) {
				return;
			}
			local34 = Static116.anInt2761;
			local90 = Static138.anInt3195;
			local84 = Static133.anInt3045;
			@Pc(233) int local233 = Static61.anInt1463;
			@Pc(235) int local235 = Static51.anInt1243;
			@Pc(237) int local237 = -1;
			for (@Pc(239) int local239 = 0; local239 < Static142.anInt3262; local239++) {
				@Pc(254) int local254 = (Static142.anInt3262 - local239 - 1) * 15 + local90 + 31;
				if (local34 < local233 && local233 < local34 + local84 && local235 > local254 - 13 && local235 < local254 + 3) {
					local237 = local239;
				}
			}
			if (local237 != -1) {
				Static74.method1286(local237);
			}
			Static169.aBoolean245 = false;
			Static23.method500(Static53.anInt3959, Static116.anInt2761, Static138.anInt3195, Static133.anInt3045);
			return;
		}
		if (local18 == 1 && Static142.anInt3262 > 0) {
			local34 = Static176.anIntArray419[Static142.anInt3262 - 1];
			if (local34 == 2 || local34 == 29 || local34 == 35 || local34 == 22 || local34 == 48 || local34 == 51 || local34 == 46 || local34 == 33 || local34 == 45 || local34 == 16 || local34 == 32 || local34 == 1002) {
				local84 = Static50.anIntArray120[Static142.anInt3262 - 1];
				local90 = Static14.anIntArray18[Static142.anInt3262 - 1];
				@Pc(94) Class83 local94 = Static80.method1396(local84);
				if (Static6.method103(Static127.method484(local94)) || Static17.method2686(Static127.method484(local94))) {
					Static113.aBoolean181 = false;
					Static121.anInt2850 = 0;
					if (Static139.aClass83_11 != null) {
						Static60.method1104(Static139.aClass83_11);
					}
					Static139.aClass83_11 = Static80.method1396(local84);
					Static31.anInt817 = Static61.anInt1463;
					Static33.anInt825 = Static51.anInt1243;
					Static79.anInt1737 = local90;
					Static60.method1104(Static139.aClass83_11);
					return;
				}
			}
		}
		if (local18 == 1 && (Static127.anInt605 == 1 && Static142.anInt3262 > 2 || Static156.method2509(Static142.anInt3262 - 1))) {
			local18 = 2;
		}
		if (local18 == 1 && Static142.anInt3262 > 0) {
			Static74.method1286(Static142.anInt3262 - 1);
		}
		if (local18 == 2 && Static142.anInt3262 > 0) {
			Static175.method2699();
			return;
		}
	}

	@OriginalMember(owner = "client!h", name = "i", descriptor = "(I)V")
	public static void method1013() {
		Static92.aClass7_12.method190();
		Static103.aClass7_16.method190();
		Static78.aClass7_10.method190();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!re;IIIII)V")
	public static void method1015(@OriginalArg(0) Class3_Sub1_Sub3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(19) int local19 = arg1 * arg1 + arg2 * arg2;
		if (local19 <= 4225 || local19 >= 90000) {
			Static4.method47(arg1, arg0, arg3, arg2, arg4);
			return;
		}
		@Pc(41) int local41 = Static120.anInt2841 + Static25.anInt716 & 0x7FF;
		@Pc(45) int local45 = Class3_Sub1_Sub3_Sub2.anIntArray87[local41];
		@Pc(53) int local53 = local45 * 256 / (Static170.anInt3687 + 256);
		@Pc(57) int local57 = Class3_Sub1_Sub3_Sub2.anIntArray88[local41];
		@Pc(65) int local65 = local57 * 256 / (Static170.anInt3687 + 256);
		@Pc(76) int local76 = arg2 * local53 + local65 * arg1 >> 16;
		@Pc(87) int local87 = local65 * arg2 - arg1 * local53 >> 16;
		@Pc(93) double local93 = Math.atan2((double) local76, (double) local87);
		@Pc(99) int local99 = (int) (Math.sin(local93) * 63.0D);
		@Pc(105) int local105 = (int) (Math.cos(local93) * 57.0D);
		Static110.aClass3_Sub1_Sub3_Sub4_32.method2329(arg4 + local99 + 94 + 4 - 10, -local105 + arg3 - -63, local93);
	}

	@OriginalMember(owner = "client!h", name = "l", descriptor = "(I)V")
	public static void method1020() {
		aClass83_8 = null;
		aClass73_753 = null;
		aClass73_752 = null;
		aClass73_751 = null;
		aClass73_754 = null;
		aClass13_Sub1_7 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!ih;ILclient!ff;)V")
	public static void method1022(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) Class3_Sub12 arg2) {
		@Pc(5) Class3_Sub22 local5 = new Class3_Sub22();
		local5.anInt3476 = arg2.method1354();
		local5.anInt3478 = arg2.method1373();
		local5.anIntArray375 = new int[local5.anInt3476];
		local5.aByteArrayArrayArray7 = new byte[local5.anInt3476][][];
		local5.aClass29Array2 = new Class29[local5.anInt3476];
		local5.anIntArray374 = new int[local5.anInt3476];
		local5.aClass29Array1 = new Class29[local5.anInt3476];
		local5.anIntArray373 = new int[local5.anInt3476];
		for (@Pc(55) int local55 = 0; local55 < local5.anInt3476; local55++) {
			try {
				@Pc(63) int local63 = arg2.method1354();
				@Pc(92) String local92;
				@Pc(103) String local103;
				@Pc(107) int local107;
				if (local63 == 0 || local63 == 1 || local63 == 2) {
					local92 = new String(arg2.method1390().method2416());
					local103 = new String(arg2.method1390().method2416());
					local107 = 0;
					if (local63 == 1) {
						local107 = arg2.method1373();
					}
					local5.anIntArray375[local55] = local63;
					local5.anIntArray373[local55] = local107;
					local5.aClass29Array2[local55] = arg1.method1231(Static71.method1255(local92), local103);
				} else if (local63 == 3 || local63 == 4) {
					local92 = new String(arg2.method1390().method2416());
					local103 = new String(arg2.method1390().method2416());
					local107 = arg2.method1354();
					@Pc(110) String[] local110 = new String[local107];
					for (@Pc(112) int local112 = 0; local112 < local107; local112++) {
						local110[local112] = new String(arg2.method1390().method2416());
					}
					@Pc(132) byte[][] local132 = new byte[local107][];
					@Pc(145) int local145;
					if (local63 == 3) {
						for (@Pc(139) int local139 = 0; local139 < local107; local139++) {
							local145 = arg2.method1373();
							local132[local139] = new byte[local145];
							arg2.method1374(local132[local139], local145);
						}
					}
					local5.anIntArray375[local55] = local63;
					@Pc(174) Class[] local174 = new Class[local107];
					for (local145 = 0; local145 < local107; local145++) {
						local174[local145] = Static71.method1255(local110[local145]);
					}
					local5.aClass29Array1[local55] = arg1.method1236(local103, local174, Static71.method1255(local92));
					local5.aByteArrayArrayArray7[local55] = local132;
				}
			} catch (@Pc(265) ClassNotFoundException local265) {
				local5.anIntArray374[local55] = -1;
			} catch (@Pc(272) SecurityException local272) {
				local5.anIntArray374[local55] = -2;
			} catch (@Pc(279) NullPointerException local279) {
				local5.anIntArray374[local55] = -3;
			} catch (@Pc(286) Exception local286) {
				local5.anIntArray374[local55] = -4;
			} catch (@Pc(293) Throwable local293) {
				local5.anIntArray374[local55] = -5;
			}
		}
		Static151.aClass72_46.method2404(local5);
	}
}
