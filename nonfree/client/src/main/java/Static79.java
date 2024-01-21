import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!pb", name = "cb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1047 = Static75.method1216("Enter name of player to delete from list");

	@OriginalMember(owner = "client!pb", name = "db", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1048 = Static75.method1216("Loading friend list");

	@OriginalMember(owner = "client!pb", name = "eb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1049 = Static75.method1216("Connecting to update server");

	@OriginalMember(owner = "client!pb", name = "fb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1050 = aClass4_1047;

	@OriginalMember(owner = "client!pb", name = "jb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1051 = Static75.method1216("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!pb", name = "mb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1052 = aClass4_1049;

	@OriginalMember(owner = "client!pb", name = "ob", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1053 = Static75.method1216("null");

	@OriginalMember(owner = "client!pb", name = "qb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1054 = aClass4_1051;

	@OriginalMember(owner = "client!pb", name = "rb", descriptor = "I")
	public static int anInt1867 = 0;

	@OriginalMember(owner = "client!pb", name = "sb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1055 = Static75.method1216("l");

	@OriginalMember(owner = "client!pb", name = "ub", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1056 = Static75.method1216("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!pb", name = "vb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1057 = aClass4_1048;

	@OriginalMember(owner = "client!pb", name = "xb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1058 = Static75.method1216("backvmid2");

	@OriginalMember(owner = "client!pb", name = "Ab", descriptor = "I")
	public static int anInt1872 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)V")
	public static void method1257(@OriginalArg(1) int arg0) {
		Static96.anInt1721 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(BI)V")
	public static void method1258(@OriginalArg(1) int arg0) {
		@Pc(8) int[] local8 = Static5.aClass3_Sub1_Sub4_Sub2_6.anIntArray325;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 0;
		}
		@Pc(42) int local42;
		@Pc(44) int local44;
		for (@Pc(29) int local29 = 1; local29 < 103; local29++) {
			local42 = (52736 - local29 * 512) * 4 + 24628;
			for (local44 = 1; local44 < 103; local44++) {
				if ((Static11.aByteArrayArrayArray55[arg0][local44][local29] & 0x18) == 0) {
					Static38.aClass61_30.method1331(local8, local42, arg0, local44, local29);
				}
				if (arg0 < 3 && (Static11.aByteArrayArrayArray55[arg0 + 1][local44][local29] & 0x8) != 0) {
					Static38.aClass61_30.method1331(local8, local42, arg0 + 1, local44, local29);
				}
				local42 += 4;
			}
		}
		Static5.aClass3_Sub1_Sub4_Sub2_6.method1736();
		local42 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) - (10 - ((int) (Math.random() * 20.0D) + 238 - 10 << 8) - ((int) (Math.random() * 20.0D)) - 238);
		local44 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(160) int local160;
		for (@Pc(156) int local156 = 1; local156 < 103; local156++) {
			for (local160 = 1; local160 < 103; local160++) {
				if ((Static11.aByteArrayArrayArray55[arg0][local160][local156] & 0x18) == 0) {
					Static83.method1297(local44, local42, arg0, local160, local156);
				}
				if (arg0 < 3 && (Static11.aByteArrayArrayArray55[arg0 + 1][local160][local156] & 0x8) != 0) {
					Static83.method1297(local44, local42, arg0 + 1, local160, local156);
				}
			}
		}
		Static66.anInt1634 = 0;
		for (local160 = 0; local160 < 104; local160++) {
			for (@Pc(224) int local224 = 0; local224 < 104; local224++) {
				@Pc(232) int local232 = Static38.aClass61_30.method1335(Static49.anInt1203, local160, local224);
				if (local232 != 0) {
					local232 = local232 >> 14 & 0x7FFF;
					@Pc(248) int local248 = Static38.method1911(local232).anInt1533;
					if (local248 >= 0) {
						@Pc(252) int local252 = local160;
						@Pc(254) int local254 = local224;
						if (local248 != 22 && local248 != 29 && local248 != 34 && local248 != 36 && local248 != 46 && local248 != 47 && local248 != 48) {
							@Pc(292) int[][] local292 = Static12.aClass40Array1[Static49.anInt1203].anIntArrayArray16;
							for (@Pc(294) int local294 = 0; local294 < 10; local294++) {
								@Pc(301) int local301 = (int) (Math.random() * 4.0D);
								if (local301 == 0 && local252 > 0 && local252 > local160 - 3 && (local292[local252 - 1][local254] & 0x1280108) == 0) {
									local252--;
								}
								if (local301 == 1 && local252 < 103 && local160 + 3 > local252 && (local292[local252 + 1][local254] & 0x1280180) == 0) {
									local252++;
								}
								if (local301 == 2 && local254 > 0 && local224 - 3 < local254 && (local292[local252][local254 - 1] & 0x1280102) == 0) {
									local254--;
								}
								if (local301 == 3 && local254 < 103 && local254 < local224 + 3 && (local292[local252][local254 + 1] & 0x1280120) == 0) {
									local254++;
								}
							}
						}
						Static113.aClass3_Sub1_Sub4_Sub2Array11[Static66.anInt1634] = Static17.aClass3_Sub1_Sub4_Sub2Array1[local248];
						Static60.anIntArray212[Static66.anInt1634] = local252;
						Static106.anIntArray328[Static66.anInt1634] = local254;
						Static66.anInt1634++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)V")
	public static void method1261() {
		Static31.method624();
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (Static7.anInt279 == 2) {
			@Pc(13) byte[] local13 = Static82.aClass3_Sub1_Sub4_Sub3_30.aByteArray22;
			@Pc(15) int[] local15 = Static50.anIntArray332;
			local18 = local13.length;
			for (local20 = 0; local20 < local18; local20++) {
				if (local13[local20] == 0) {
					local15[local20] = 0;
				}
			}
			Static11.aClass3_Sub1_Sub4_Sub2_52.method1739(0, 0, 33, 33, 25, 25, Static109.anInt2749, 256, Static29.anIntArray83, Static64.anIntArray227);
			Static106.method1808();
			return;
		}
		@Pc(59) int local59 = Static109.anInt2749 + Static111.anInt2786 & 0x7FF;
		local18 = 464 - Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2348 / 32;
		@Pc(74) int local74 = Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2342 / 32 + 48;
		Static5.aClass3_Sub1_Sub4_Sub2_6.method1739(25, 5, 146, 151, local74, local18, local59, Static89.anInt2041 + 256, Static91.anIntArray265, Static4.anIntArray9);
		for (local20 = 0; local20 < Static66.anInt1634; local20++) {
			local18 = Static106.anIntArray328[local20] * 4 + 2 - Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2348 / 32;
			local74 = Static60.anIntArray212[local20] * 4 + 2 - Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2342 / 32;
			Static87.method988(local18, Static113.aClass3_Sub1_Sub4_Sub2Array11[local20], local74);
		}
		@Pc(137) int local137;
		for (@Pc(133) int local133 = 0; local133 < 104; local133++) {
			for (local137 = 0; local137 < 104; local137++) {
				@Pc(147) Class20 local147 = Static22.aClass20ArrayArrayArray1[Static49.anInt1203][local133][local137];
				if (local147 != null) {
					local74 = local133 * 4 + 2 - Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2342 / 32;
					local18 = local137 * 4 + 2 - Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2348 / 32;
					Static87.method988(local18, Static31.aClass3_Sub1_Sub4_Sub2Array7[0], local74);
				}
			}
		}
		for (local137 = 0; local137 < Static29.anInt905; local137++) {
			@Pc(201) Class3_Sub1_Sub1_Sub1_Sub1 local201 = Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[Static24.anIntArray40[local137]];
			if (local201 != null && local201.method1552()) {
				@Pc(210) Class3_Sub1_Sub17 local210 = local201.aClass3_Sub1_Sub17_1;
				if (local210.anIntArray307 != null) {
					local210 = local210.method1676();
				}
				if (local210 != null && local210.aBoolean215 && local210.aBoolean214) {
					local18 = local201.anInt2348 / 32 - Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2348 / 32;
					local74 = local201.anInt2342 / 32 - Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2342 / 32;
					Static87.method988(local18, Static31.aClass3_Sub1_Sub4_Sub2Array7[1], local74);
				}
			}
		}
		@Pc(267) Class3_Sub1_Sub1_Sub1_Sub2 local267;
		for (@Pc(259) int local259 = 0; local259 < Static11.anInt2841; local259++) {
			local267 = Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[Static92.anIntArray270[local259]];
			if (local267 != null && local267.method1552()) {
				local74 = local267.anInt2342 / 32 - Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2342 / 32;
				local18 = local267.anInt2348 / 32 - Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2348 / 32;
				@Pc(300) long local300 = local267.aClass4_1302.method149();
				@Pc(302) boolean local302 = false;
				for (@Pc(304) int local304 = 0; local304 < Static87.anInt1451; local304++) {
					if (local300 == Static31.aLongArray9[local304] && Static36.anIntArray101[local304] != 0) {
						local302 = true;
						break;
					}
				}
				@Pc(333) boolean local333 = false;
				if (Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2367 != 0 && local267.anInt2367 != 0 && local267.anInt2367 == Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2367) {
					local333 = true;
				}
				if (local302) {
					Static87.method988(local18, Static31.aClass3_Sub1_Sub4_Sub2Array7[3], local74);
				} else if (local333) {
					Static87.method988(local18, Static31.aClass3_Sub1_Sub4_Sub2Array7[4], local74);
				} else {
					Static87.method988(local18, Static31.aClass3_Sub1_Sub4_Sub2Array7[2], local74);
				}
			}
		}
		if (Static82.anInt1908 != 0 && Static60.anInt1489 % 20 < 10) {
			if (Static82.anInt1908 == 1 && Static23.anInt504 >= 0 && Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9.length > Static23.anInt504) {
				@Pc(414) Class3_Sub1_Sub1_Sub1_Sub1 local414 = Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[Static23.anInt504];
				if (local414 != null) {
					local74 = local414.anInt2342 / 32 - Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2342 / 32;
					local18 = local414.anInt2348 / 32 - Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2348 / 32;
					Static53.method1653(local18, local74, Static23.aClass3_Sub1_Sub4_Sub2Array4[1]);
				}
			}
			if (Static82.anInt1908 == 2) {
				local74 = (-Static43.anInt1144 + Static18.anInt456) * 4 + 2 - Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2342 / 32;
				local18 = (Static4.anInt203 - Static93.anInt2429) * 4 + 2 - Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2348 / 32;
				Static53.method1653(local18, local74, Static23.aClass3_Sub1_Sub4_Sub2Array4[1]);
			}
			if (Static82.anInt1908 == 10 && Static36.anInt1039 >= 0 && Static36.anInt1039 < Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1.length) {
				local267 = Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[Static36.anInt1039];
				if (local267 != null) {
					local18 = local267.anInt2348 / 32 - Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2348 / 32;
					local74 = local267.anInt2342 / 32 - Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2342 / 32;
					Static53.method1653(local18, local74, Static23.aClass3_Sub1_Sub4_Sub2Array4[1]);
				}
			}
		}
		if (Static31.anInt954 != 0) {
			local74 = Static31.anInt954 * 4 + 2 - Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2342 / 32;
			local18 = Static103.anInt2539 * 4 + 2 - Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2348 / 32;
			Static87.method988(local18, Static23.aClass3_Sub1_Sub4_Sub2Array4[0], local74);
		}
		Static50.method1840(97, 78, 3, 3, 16777215);
		Static11.aClass3_Sub1_Sub4_Sub2_52.method1739(0, 0, 33, 33, 25, 25, Static109.anInt2749, 256, Static29.anIntArray83, Static64.anIntArray227);
		Static106.method1808();
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V")
	public static void method1262() {
		aClass4_1048 = null;
		aClass4_1056 = null;
		aClass4_1050 = null;
		aClass4_1047 = null;
		aClass4_1055 = null;
		aClass4_1058 = null;
		aClass4_1052 = null;
		aClass4_1057 = null;
		aClass4_1049 = null;
		aClass4_1054 = null;
		aClass4_1051 = null;
		aClass4_1053 = null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[Lclient!ad;ZI)Lclient!ad;")
	public static Class4 method1263(@OriginalArg(0) int arg0, @OriginalArg(1) Class4[] arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg2; local9++) {
			if (arg1[local9 + arg0] == null) {
				arg1[local9 + arg0] = Static45.aClass4_589;
			}
			local3 += arg1[arg0 + local9].anInt238;
		}
		@Pc(42) byte[] local42 = new byte[local3];
		@Pc(44) int local44 = 0;
		@Pc(54) Class4 local54;
		for (@Pc(46) int local46 = 0; local46 < arg2; local46++) {
			local54 = arg1[local46 + arg0];
			Static116.method551(local54.aByteArray1, 0, local42, local44, local54.anInt238);
			local44 += local54.anInt238;
		}
		local54 = new Class4();
		local54.anInt238 = local3;
		local54.aByteArray1 = local42;
		return local54;
	}
}
