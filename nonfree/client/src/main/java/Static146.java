import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
	public static int anInt3006;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1397 = Static193.method3027(")4slr2)3ws?order=LPWM");

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "[Lclient!ij;")
	public static final Class26_Sub2_Sub1[] aClass26_Sub2_Sub1Array1 = new Class26_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1398 = Static193.method3027("(Z");

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1399 = Static193.method3027("");

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1400 = Static193.method3027("null");

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIBIIILclient!pd;)V")
	public static void method2123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class77 arg5) {
		@Pc(12) long local12 = 0L;
		if (arg2 == 0) {
			local12 = Static41.method681(arg3, arg0, arg1);
		}
		if (arg2 == 1) {
			local12 = Static32.method574(arg3, arg0, arg1);
		}
		if (arg2 == 2) {
			local12 = Static159.method2398(arg3, arg0, arg1);
		}
		if (arg2 == 3) {
			local12 = Static157.method2364(arg3, arg0, arg1);
		}
		if (local12 == 0L) {
			return;
		}
		@Pc(60) int local60 = (int) local12 >> 20 & 0x3;
		@Pc(67) int local67 = (int) local12 >> 14 & 0x1F;
		@Pc(74) int local74 = (int) (local12 >>> 32) & Integer.MAX_VALUE;
		@Pc(78) Class3_Sub3_Sub9 local78 = Static161.method2421(local74);
		if (arg2 == 0) {
			Static1.method1312(arg3, arg0, arg1);
			if (local78.anInt1014 != 0) {
				arg5.method2170(local67, local78.aBoolean61, arg1, arg0, local60);
			}
		}
		if (arg2 == 1) {
			Static15.method291(arg3, arg0, arg1);
		}
		if (arg2 == 2) {
			Static21.method347(arg3, arg0, arg1);
			if (local78.anInt1014 != 0 && local78.anInt1010 + arg0 < 104 && local78.anInt1010 + arg1 < 104 && arg0 + local78.anInt1002 < 104 && arg1 + local78.anInt1002 < 104) {
				arg5.method2177(arg1, local78.anInt1002, local60, local78.aBoolean61, local78.anInt1010, arg0);
			}
		}
		if (arg2 != 3) {
			return;
		}
		Static2.method10(arg3, arg0, arg1);
		if (local78.anInt1014 == 1) {
			arg5.method2171(arg0, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!oc;)Z")
	public static boolean method2124(@OriginalArg(1) Class70 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < Static61.anInt1297; local14++) {
			if (arg0.method2059(Static160.aClass70Array58[local14])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[B)V")
	public static void method2125(@OriginalArg(1) byte[] arg0) {
		@Pc(12) int local12 = 0;
		while (true) {
			while (local12 < arg0.length) {
				@Pc(26) int local26 = (arg0[local12++] & 0xFF) * 64 - Static157.anInt3260;
				@Pc(37) int local37 = (arg0[local12++] & 0xFF) * 64 - Static115.anInt2318;
				@Pc(77) byte local77;
				@Pc(55) int local55;
				if (local26 > 0 && local37 > 0 && Static65.anInt1364 > local26 + 64 && local37 + 64 < Static50.anInt1046) {
					local55 = local26 >> 6;
					@Pc(64) int local64 = Static50.anInt1046 - local37 - 1 >> 6;
					for (@Pc(66) int local66 = 0; local66 < 64; local66++) {
						for (@Pc(70) int local70 = -64; local70 < 0; local70++) {
							local77 = arg0[local12++];
							if (local77 != 0) {
								if (Static198.aByteArrayArrayArray17[local55][local64] == null) {
									Static198.aByteArrayArrayArray17[local55][local64] = new byte[4096];
								}
								Static198.aByteArrayArrayArray17[local55][local64][local66 + (-(local70 + 1) << 6)] = local77;
								@Pc(115) byte local115 = arg0[local12++];
								if (Static4.aByteArrayArrayArray1[local55][local64] == null) {
									Static4.aByteArrayArrayArray1[local55][local64] = new byte[4096];
								}
								Static4.aByteArrayArrayArray1[local55][local64][local66 + (-(local70 + 1) << 6)] = local115;
							}
						}
					}
				} else {
					for (local55 = -4096; local55 < 0; local55++) {
						local77 = arg0[local12++];
						if (local77 != 0) {
							local12++;
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!b;I)Lclient!oc;")
	public static Class70 method2126(@OriginalArg(0) Class6 arg0) {
		if (Static86.method1231(Static157.method2365(arg0)) == 0) {
			return null;
		} else if (arg0.aClass70_124 == null || arg0.aClass70_124.method2056().method2045() == 0) {
			return Static58.aBoolean74 ? Static103.aClass70_1034 : null;
		} else {
			return arg0.aClass70_124;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)Lclient!b;")
	public static Class6 method2127(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = arg0 >> 16;
		@Pc(22) int local22 = arg0 & 0xFFFF;
		if (Static49.aClass6ArrayArray1[local18] == null || Static49.aClass6ArrayArray1[local18][local22] == null) {
			@Pc(36) boolean local36 = Static126.method1762(local18);
			if (!local36) {
				return null;
			}
		}
		return Static49.aClass6ArrayArray1[local18][local22];
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!oc;I)Z")
	public static boolean method2128(@OriginalArg(0) Class70 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(9) int local9 = 0; local9 < Static13.anInt318; local9++) {
			if (arg0.method2059(Static52.aClass70Array24[local9])) {
				return true;
			}
		}
		return arg0.method2059(Static144.aClass26_Sub2_Sub1_1.aClass70_952);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BZ)V")
	public static void method2130(@OriginalArg(1) boolean arg0) {
		Static31.aBoolean41 = arg0;
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(153) int local153;
		@Pc(157) int local157;
		@Pc(161) int local161;
		if (!Static31.aBoolean41) {
			local13 = (Static192.anInt3908 - Static48.aClass3_Sub4_Sub1_43.anInt1758) / 16;
			Static160.anIntArrayArray25 = new int[local13][4];
			for (local17 = 0; local17 < local13; local17++) {
				for (local21 = 0; local21 < 4; local21++) {
					Static160.anIntArrayArray25[local17][local21] = Static48.aClass3_Sub4_Sub1_43.method1279();
				}
			}
			local21 = Static48.aClass3_Sub4_Sub1_43.method1295();
			local27 = Static48.aClass3_Sub4_Sub1_43.method1257();
			local32 = Static48.aClass3_Sub4_Sub1_43.method1270();
			local36 = Static48.aClass3_Sub4_Sub1_43.method1257();
			@Pc(389) boolean local389 = false;
			local40 = Static48.aClass3_Sub4_Sub1_43.method1243();
			Static82.anIntArray86 = new int[local13];
			Static150.anIntArray224 = new int[local13];
			Static212.aByteArrayArray11 = new byte[local13][];
			Static141.aByteArrayArray4 = new byte[local13][];
			Static159.anIntArray242 = new int[local13];
			local13 = 0;
			if ((local36 / 8 == 48 || local36 / 8 == 49) && local32 / 8 == 48) {
				local389 = true;
			}
			if (local36 / 8 == 48 && local32 / 8 == 148) {
				local389 = true;
			}
			for (local153 = (local36 - 6) / 8; local153 <= (local36 + 6) / 8; local153++) {
				for (local157 = (local32 - 6) / 8; local157 <= (local32 + 6) / 8; local157++) {
					local161 = (local153 << 8) + local157;
					if (!local389 || local157 != 49 && local157 != 149 && local157 != 147 && local153 != 50 && (local153 != 49 || local157 != 47)) {
						Static82.anIntArray86[local13] = local161;
						Static159.anIntArray242[local13] = Static92.aClass52_Sub1_14.method1560(Static207.method3296(new Class70[] { Static190.aClass70_1888, Static107.method2404(local153), Static33.aClass70_325, Static107.method2404(local157) }));
						Static150.anIntArray224[local13] = Static92.aClass52_Sub1_14.method1560(Static207.method3296(new Class70[] { Static35.aClass70_365, Static107.method2404(local153), Static33.aClass70_325, Static107.method2404(local157) }));
						local13++;
					}
				}
			}
			Static136.method1945(local36, local21, local40, local27, local32);
			return;
		}
		local13 = Static48.aClass3_Sub4_Sub1_43.method1286();
		local17 = Static48.aClass3_Sub4_Sub1_43.method1280();
		local21 = Static48.aClass3_Sub4_Sub1_43.method1280();
		local27 = Static48.aClass3_Sub4_Sub1_43.method1295();
		Static48.aClass3_Sub4_Sub1_43.method1302();
		@Pc(47) int local47;
		for (local32 = 0; local32 < 4; local32++) {
			for (local36 = 0; local36 < 13; local36++) {
				for (local40 = 0; local40 < 13; local40++) {
					local47 = Static48.aClass3_Sub4_Sub1_43.method1299(1);
					if (local47 == 1) {
						Static95.anIntArrayArrayArray8[local32][local36][local40] = Static48.aClass3_Sub4_Sub1_43.method1299(26);
					} else {
						Static95.anIntArrayArrayArray8[local32][local36][local40] = -1;
					}
				}
			}
		}
		Static48.aClass3_Sub4_Sub1_43.method1305();
		local36 = (Static192.anInt3908 - Static48.aClass3_Sub4_Sub1_43.anInt1758) / 16;
		Static160.anIntArrayArray25 = new int[local36][4];
		for (local40 = 0; local40 < local36; local40++) {
			for (local47 = 0; local47 < 4; local47++) {
				Static160.anIntArrayArray25[local40][local47] = Static48.aClass3_Sub4_Sub1_43.method1262();
			}
		}
		local47 = Static48.aClass3_Sub4_Sub1_43.method1257();
		Static150.anIntArray224 = new int[local36];
		Static82.anIntArray86 = new int[local36];
		Static141.aByteArrayArray4 = new byte[local36][];
		Static212.aByteArrayArray11 = new byte[local36][];
		Static159.anIntArray242 = new int[local36];
		local36 = 0;
		for (local153 = 0; local153 < 4; local153++) {
			for (local157 = 0; local157 < 13; local157++) {
				for (local161 = 0; local161 < 13; local161++) {
					@Pc(171) int local171 = Static95.anIntArrayArrayArray8[local153][local157][local161];
					if (local171 != -1) {
						@Pc(181) int local181 = local171 >> 14 & 0x3FF;
						@Pc(187) int local187 = local171 >> 3 & 0x7FF;
						@Pc(197) int local197 = local187 / 8 + (local181 / 8 << 8);
						for (@Pc(199) int local199 = 0; local199 < local36; local199++) {
							if (Static82.anIntArray86[local199] == local197) {
								local197 = -1;
								break;
							}
						}
						if (local197 != -1) {
							@Pc(227) int local227 = local197 >> 8 & 0xFF;
							@Pc(231) int local231 = local197 & 0xFF;
							Static82.anIntArray86[local36] = local197;
							Static159.anIntArray242[local36] = Static92.aClass52_Sub1_14.method1560(Static207.method3296(new Class70[] { Static190.aClass70_1888, Static107.method2404(local227), Static33.aClass70_325, Static107.method2404(local231) }));
							Static150.anIntArray224[local36] = Static92.aClass52_Sub1_14.method1560(Static207.method3296(new Class70[] { Static35.aClass70_365, Static107.method2404(local227), Static33.aClass70_325, Static107.method2404(local231) }));
							local36++;
						}
					}
				}
			}
		}
		Static136.method1945(local21, local27, local13, local17, local47);
	}
}
