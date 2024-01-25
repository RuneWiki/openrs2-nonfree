import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!io", name = "J", descriptor = "I")
	public static int anInt2483;

	@OriginalMember(owner = "client!io", name = "P", descriptor = "Lclient!cj;")
	public static Interface2 anInterface2_3;

	@OriginalMember(owner = "client!io", name = "V", descriptor = "I")
	public static int anInt2494 = -1;

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(II)V")
	public static void method2625() {
		Static232.aClass70_77.method1397(5);
	}

	@OriginalMember(owner = "client!io", name = "e", descriptor = "(B)Ljava/lang/String;")
	public static String method2626() {
		@Pc(5) String local5 = "www";
		if (Static189.anInt3601 != 0) {
			local5 = "www-wtqa";
		}
		@Pc(11) String local11 = "";
		if (Static106.aString74 != null) {
			local11 = "/p=" + Static106.aString74;
		}
		return Static105.anInt1941 == 1 ? "http://" + local5 + ".stellardawn.com/l=" + Static247.anInt4265 + "/a=" + Static41.anInt6384 + local11 + "/" : "http://" + local5 + ".runescape.com/l=" + Static247.anInt4265 + "/a=" + Static41.anInt6384 + local11 + "/";
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZILclient!bc;)V")
	public static void method2627(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1) {
		if (Static238.aBoolean357) {
			Static238.aBoolean357 = false;
			arg0 = 0;
		}
		if (Static133.aClass14_2 != null && Static133.aClass14_2.method293(arg1)) {
			return;
		}
		Static133.aClass14_2 = arg1;
		Static316.aLong196 = Static245.method4300();
		Static213.anInt3921 = arg0;
		Static56.anInt2420 = arg0;
		if (Static56.anInt2420 == 0) {
			Static306.method5246();
			return;
		}
		Static122.aFloat59 = Static329.aFloat85;
		Static228.aFloat73 = Static158.aFloat82;
		Static34.aFloat13 = Static209.aFloat71;
		Static323.aFloat84 = Static68.aFloat72;
		Static159.aFloat67 = Static311.aFloat83;
		Static113.anInt2100 = Static226.anInt4209;
		Static34.anInt615 = Static292.anInt5494;
		Static349.aClass19_4 = Static201.aClass19_2;
		Static246.aFloat74 = Static12.aFloat1;
		Static203.anInt3733 = Static352.anInt6322;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method2628(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static71.anInt1344; local19++) {
			if (arg0.equalsIgnoreCase(Static238.aStringArray34[local19])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static76.aStringArray18[local19])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!io", name = "f", descriptor = "(I)I")
	public static int method2629() {
		if (Static90.aFrame1 == null) {
			return Static291.aBoolean378 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILclient!qa;Lclient!rr;Lclient!ja;IB)Z")
	public static boolean method2630(@OriginalArg(1) Class165 arg0, @OriginalArg(2) Class6_Sub35 arg1, @OriginalArg(3) Class81 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(17) int local17 = Integer.MIN_VALUE;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(21) int local21 = Integer.MIN_VALUE;
		if (arg0.anIntArray509 != null) {
			local17 = Static307.anInt1196 + (Static307.anInt1199 - Static307.anInt1196) * (arg0.anInt4671 + arg1.anInt5320 - Static307.anInt1201) / (Static307.anInt1193 - Static307.anInt1201);
			local21 = Static307.anInt1203 - (Static307.anInt1203 - Static307.anInt1194) * (arg0.anInt4677 + arg1.anInt5324 - Static307.anInt1204) / (Static307.anInt1197 - Static307.anInt1204);
			local19 = Static307.anInt1203 - (arg0.anInt4668 + arg1.anInt5324 - Static307.anInt1204) * (Static307.anInt1203 + -Static307.anInt1194) / (Static307.anInt1197 - Static307.anInt1204);
			local7 = Static307.anInt1196 + (arg0.anInt4691 + arg1.anInt5320 - Static307.anInt1201) * (Static307.anInt1199 - Static307.anInt1196) / (Static307.anInt1193 - Static307.anInt1201);
		}
		@Pc(110) Class40 local110 = null;
		@Pc(112) int local112 = 0;
		@Pc(114) int local114 = 0;
		@Pc(116) int local116 = 0;
		@Pc(118) int local118 = 0;
		if (arg0.anInt4689 != -1) {
			if (arg1.aBoolean367 && arg0.anInt4681 != -1) {
				local110 = arg0.method4329(arg2, true);
			} else {
				local110 = arg0.method4329(arg2, false);
			}
			if (local110 != null) {
				local112 = arg1.anInt5322 - (local110.method5083() + 1 >> 1);
				if (local7 > local112) {
					local7 = local112;
				}
				local114 = arg1.anInt5322 + (local110.method5083() + 1 >> 1);
				local116 = arg1.anInt5323 - (local110.method5084() + 1 >> 1);
				if (local114 > local17) {
					local17 = local114;
				}
				if (local116 < local19) {
					local19 = local116;
				}
				local118 = arg1.anInt5323 + (local110.method5084() + 1 >> 1);
				if (local118 > local21) {
					local21 = local118;
				}
			}
		}
		@Pc(216) Class49 local216 = null;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(230) int local230 = 0;
		@Pc(279) int local279;
		@Pc(306) int local306;
		if (arg0.aString196 != null) {
			local216 = Static338.method5592(arg0.anInt4694);
			if (local216 != null) {
				local218 = Static139.aClass26_5.method500(Static73.aStringArray7, null, null, arg0.aString196);
				local220 = arg1.anInt5323;
				if (local110 == null) {
					local220 -= local218 * local216.method977() / 2;
				} else {
					local220 -= (local110.method5084() >> 1) + local218 * local216.method973();
				}
				for (local279 = 0; local279 < local218; local279++) {
					@Pc(285) String local285 = Static73.aStringArray7[local279];
					if (local279 < local218 - 1) {
						local285 = local285.substring(0, local285.length() - 4);
					}
					local306 = local216.method972(local285);
					if (local222 < local306) {
						local222 = local306;
					}
				}
				local224 = arg1.anInt5322 - local222 / 2;
				local226 = local222 / 2 + arg1.anInt5322;
				if (local224 < local7) {
					local7 = local224;
				}
				local228 = local220;
				if (local226 > local17) {
					local17 = local226;
				}
				if (local19 > local228) {
					local19 = local228;
				}
				local230 = local216.method973() * local218 + local220;
				if (local21 < local230) {
					local21 = local230;
				}
			}
		}
		if (local17 < Static307.anInt1196 || local7 > Static307.anInt1199 || Static307.anInt1194 > local21 || Static307.anInt1203 < local19) {
			return true;
		}
		@Pc(412) int local412;
		if (arg0.anIntArray509 != null) {
			@Pc(410) int[] local410 = new int[arg0.anIntArray509.length];
			for (local412 = 0; local412 < local410.length / 2; local412++) {
				local306 = arg1.anInt5320 + arg0.anIntArray509[local412 * 2];
				@Pc(436) int local436 = arg1.anInt5324 + arg0.anIntArray509[local412 * 2 + 1];
				local410[local412 * 2] = Static307.anInt1196 + (Static307.anInt1199 - Static307.anInt1196) * (local306 + -Static307.anInt1201) / (Static307.anInt1193 - Static307.anInt1201);
				local410[local412 * 2 + 1] = Static307.anInt1203 - (local436 - Static307.anInt1204) * (-Static307.anInt1194 + Static307.anInt1203) / (Static307.anInt1197 - Static307.anInt1204);
			}
			Static123.method2440(arg2, local410, arg0.anInt4696);
			for (local306 = 0; local306 < local410.length / 2 - 1; local306++) {
				arg2.method3004(local410[(local306 + 1) * 2 + 1], local410[local306 * 2 + 1], local410[local306 * 2], local410[(local306 + 1) * 2], arg0.anInt4687);
			}
			arg2.method3004(local410[1], local410[local410.length - 1], local410[local410.length - 2], local410[0], arg0.anInt4687);
		}
		if (local110 != null) {
			if (Static41.anInt6388 > 0 && (Static151.anInt2868 != -1 && Static151.anInt2868 == arg1.anInt5312 || Static204.anInt3768 != -1 && Static204.anInt3768 == arg0.anInt4700)) {
				if (Static297.anInt5578 <= 50) {
					local279 = Static297.anInt5578 * 2;
				} else {
					local279 = 200 - Static297.anInt5578 * 2;
				}
				local412 = local279 << 24 | 0xFFFF00;
				arg2.method3014(arg1.anInt5323, local110.method5071() / 2 + 7, arg1.anInt5322, local412);
				arg2.method3014(arg1.anInt5323, local110.method5071() / 2 + 5, arg1.anInt5322, local412);
				arg2.method3014(arg1.anInt5323, local110.method5071() / 2 + 3, arg1.anInt5322, local412);
				arg2.method3014(arg1.anInt5323, local110.method5071() / 2 + 1, arg1.anInt5322, local412);
				arg2.method3014(arg1.anInt5323, local110.method5071() / 2, arg1.anInt5322, local412);
			}
			local110.method5077(arg1.anInt5322 - (local110.method5083() >> 1), arg1.anInt5323 + -(local110.method5084() >> 1));
		}
		if (arg0.aString196 != null && local216 != null) {
			Static159.method3148(local218, arg2, local216, arg0, local222, local220, arg1);
		}
		if (arg0.anInt4689 != -1 || arg0.aString196 != null) {
			@Pc(732) Class6_Sub41 local732 = new Class6_Sub41(arg1);
			local732.anInt6046 = local228;
			local732.anInt6051 = local112;
			local732.anInt6058 = local118;
			local732.anInt6054 = local114;
			local732.anInt6048 = local226;
			local732.anInt6049 = local224;
			local732.anInt6050 = local230;
			local732.anInt6052 = local116;
			Static225.aClass211_25.method5585(local732);
		}
		return false;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZLclient!mb;)Lclient!mb;")
	public static Class132 method2631(@OriginalArg(1) Class132 arg0) {
		@Pc(13) Class132 local13 = Static43.method755(arg0);
		if (local13 == null) {
			local13 = arg0.aClass132_12;
		}
		return local13;
	}
}
