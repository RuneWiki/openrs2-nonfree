import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!ke", name = "ab", descriptor = "Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_11;

	@OriginalMember(owner = "client!ke", name = "bb", descriptor = "I")
	public static int anInt1612;

	@OriginalMember(owner = "client!ke", name = "t", descriptor = "Z")
	public static boolean aBoolean86 = true;

	@OriginalMember(owner = "client!ke", name = "G", descriptor = "Lclient!ke;")
	private static Class39 aClass39_698 = Static2.method66("yellow:");

	@OriginalMember(owner = "client!ke", name = "z", descriptor = "Lclient!ke;")
	public static Class39 aClass39_697 = aClass39_698;

	@OriginalMember(owner = "client!ke", name = "F", descriptor = "Lclient!rc;")
	public static Class57 aClass57_1 = new Class57(4096);

	@OriginalMember(owner = "client!ke", name = "L", descriptor = "Lclient!ke;")
	public static Class39 aClass39_699 = Static2.method66("Wen m-Ochten Sie der Liste hinzuf-Ugen?");

	@OriginalMember(owner = "client!ke", name = "Y", descriptor = "Lclient!g;")
	public static Class2_Sub5 aClass2_Sub5_2 = new Class2_Sub5(8);

	@OriginalMember(owner = "client!ke", name = "Z", descriptor = "Lclient!ke;")
	private static Class39 aClass39_700 = Static2.method66("wave2:");

	@OriginalMember(owner = "client!ke", name = "cb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_701 = aClass39_700;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
	public static void method1092() {
		aClass2_Sub5_2 = null;
		aClass39_700 = null;
		aClass39_698 = null;
		aClass57_1 = null;
		aClass39_697 = null;
		aClass2_Sub1_Sub4_Sub3_11 = null;
		aClass39_699 = null;
		aClass39_701 = null;
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V")
	public static void method1097() {
		Static7.method110(false);
		@Pc(10) boolean local10 = true;
		Static9.anInt187 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static10.aByteArrayArray2.length; local14++) {
			if (Static63.anIntArray237[local14] != -1 && Static10.aByteArrayArray2[local14] == null) {
				Static10.aByteArrayArray2[local14] = Static19.aClass36_Sub1_5.method1761(Static63.anIntArray237[local14], 0);
				if (Static10.aByteArrayArray2[local14] == null) {
					local10 = false;
					Static9.anInt187++;
				}
			}
			if (Static39.anIntArray165[local14] != -1 && Static65.aByteArrayArray8[local14] == null) {
				Static65.aByteArrayArray8[local14] = Static19.aClass36_Sub1_5.method1759(0, Static39.anIntArray165[local14], Static54.anIntArrayArray15[local14]);
				if (Static65.aByteArrayArray8[local14] == null) {
					local10 = false;
					Static9.anInt187++;
				}
			}
		}
		if (!local10) {
			Static20.anInt577 = 1;
			return;
		}
		local10 = true;
		Static22.anInt591 = 0;
		@Pc(116) int local116;
		@Pc(127) int local127;
		for (@Pc(97) int local97 = 0; local97 < Static10.aByteArrayArray2.length; local97++) {
			@Pc(103) byte[] local103 = Static65.aByteArrayArray8[local97];
			if (local103 != null) {
				local116 = (Static37.anIntArray164[local97] >> 8) * 64 - Static19.anInt575;
				local127 = (Static37.anIntArray164[local97] & 0xFF) * 64 - Static75.anInt454;
				if (Static67.aBoolean95) {
					local116 = 10;
					local127 = 10;
				}
				local10 &= Static88.method808(local116, local127, local103);
			}
		}
		if (!local10) {
			Static20.anInt577 = 2;
			return;
		}
		if (Static20.anInt577 != 0) {
			Static16.method378(Static81.aClass39_995, Static109.aClass39_1339, true);
		}
		Static41.method831();
		Static77.aClass43_1.method1208();
		System.gc();
		for (@Pc(167) int local167 = 0; local167 < 4; local167++) {
			Static5.aClass47Array1[local167].method1458();
		}
		@Pc(190) int local190;
		for (local116 = 0; local116 < 4; local116++) {
			for (local127 = 0; local127 < 104; local127++) {
				for (local190 = 0; local190 < 104; local190++) {
					Static96.aByteArrayArrayArray8[local116][local127][local190] = 0;
				}
			}
		}
		Static35.method2068();
		local127 = Static10.aByteArrayArray2.length;
		Static60.method1125();
		Static7.method110(true);
		@Pc(243) int local243;
		@Pc(257) int local257;
		@Pc(368) int local368;
		@Pc(313) int local313;
		@Pc(357) int local357;
		if (!Static67.aBoolean95) {
			@Pc(247) byte[] local247;
			for (local190 = 0; local190 < local127; local190++) {
				local243 = (Static37.anIntArray164[local190] >> 8) * 64 - Static19.anInt575;
				local247 = Static10.aByteArrayArray2[local190];
				local257 = (Static37.anIntArray164[local190] & 0xFF) * 64 - Static75.anInt454;
				if (local247 != null) {
					Static41.method829(local257, local243, local247, Static5.aClass47Array1, Static71.anInt2025 * 8 - 48, Static2.anInt66 * 8 + -48);
				}
			}
			for (local243 = 0; local243 < local127; local243++) {
				local257 = (Static37.anIntArray164[local243] >> 8) * 64 - Static19.anInt575;
				@Pc(302) byte[] local302 = Static10.aByteArrayArray2[local243];
				local313 = (Static37.anIntArray164[local243] & 0xFF) * 64 - Static75.anInt454;
				if (local302 == null && Static71.anInt2025 < 800) {
					Static75.method374(local257, 64, 64, local313);
				}
			}
			Static7.method110(true);
			for (local257 = 0; local257 < local127; local257++) {
				local247 = Static65.aByteArrayArray8[local257];
				if (local247 != null) {
					local357 = (Static37.anIntArray164[local257] >> 8) * 64 - Static19.anInt575;
					local368 = (Static37.anIntArray164[local257] & 0xFF) * 64 - Static75.anInt454;
					Static47.method900(local368, Static5.aClass47Array1, Static77.aClass43_1, local247, local357);
				}
			}
		}
		@Pc(412) int local412;
		@Pc(430) int local430;
		if (Static67.aBoolean95) {
			@Pc(424) int local424;
			@Pc(440) int local440;
			@Pc(442) int local442;
			for (local190 = 0; local190 < 4; local190++) {
				for (local243 = 0; local243 < 13; local243++) {
					for (local257 = 0; local257 < 13; local257++) {
						@Pc(395) boolean local395 = false;
						local357 = Static57.anIntArrayArrayArray4[local190][local243][local257];
						if (local357 != -1) {
							local412 = local357 >> 1 & 0x3;
							local368 = local357 >> 24 & 0x3;
							local424 = local357 >> 3 & 0x7FF;
							local430 = local357 >> 14 & 0x3FF;
							local440 = (local430 / 8 << 8) + local424 / 8;
							for (local442 = 0; local442 < Static37.anIntArray164.length; local442++) {
								if (Static37.anIntArray164[local442] == local440 && Static10.aByteArrayArray2[local442] != null) {
									local395 = true;
									Static38.method816(local412, local243 * 8, local257 * 8, Static10.aByteArrayArray2[local442], local368, local190, (local430 & 0x7) * 8, (local424 & 0x7) * 8, Static5.aClass47Array1);
									break;
								}
							}
						}
						if (!local395) {
							Static35.method2065(local257 * 8, local190, local243 * 8);
						}
					}
				}
			}
			for (local243 = 0; local243 < 13; local243++) {
				for (local257 = 0; local257 < 13; local257++) {
					local313 = Static57.anIntArrayArrayArray4[0][local243][local257];
					if (local313 == -1) {
						Static75.method374(local243 * 8, 8, 8, local257 * 8);
					}
				}
			}
			Static7.method110(true);
			for (local257 = 0; local257 < 4; local257++) {
				for (local313 = 0; local313 < 13; local313++) {
					for (local357 = 0; local357 < 13; local357++) {
						local368 = Static57.anIntArrayArrayArray4[local257][local313][local357];
						if (local368 != -1) {
							local412 = local368 >> 24 & 0x3;
							local430 = local368 >> 1 & 0x3;
							local440 = local368 >> 3 & 0x7FF;
							local424 = local368 >> 14 & 0x3FF;
							local442 = local440 / 8 + (local424 / 8 << 8);
							for (@Pc(621) int local621 = 0; local621 < Static37.anIntArray164.length; local621++) {
								if (Static37.anIntArray164[local621] == local442 && Static65.aByteArrayArray8[local621] != null) {
									Static58.method1156((local440 & 0x7) * 8, Static65.aByteArrayArray8[local621], local357 * 8, (local424 & 0x7) * 8, local257, local313 * 8, Static5.aClass47Array1, local430, local412, Static77.aClass43_1);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static7.method110(true);
		Static41.method831();
		Static25.method515(Static5.aClass47Array1, Static77.aClass43_1);
		Static7.method110(true);
		local190 = Static83.anInt2274;
		if (Static18.anInt560 < local190) {
			local190 = Static18.anInt560;
		}
		if (local190 < Static18.anInt560 - 1) {
		}
		if (Static35.aBoolean136) {
			Static77.aClass43_1.method1207(Static83.anInt2274);
		} else {
			Static77.aClass43_1.method1207(0);
		}
		for (local243 = 0; local243 < 104; local243++) {
			for (local257 = 0; local257 < 104; local257++) {
				Static84.method2052(local257, local243);
			}
		}
		Static38.method813();
		Static64.aClass54_20.method1635();
		if (Static72.aFrame1 != null) {
			Static50.aClass2_Sub5_Sub1_2.method1302(68);
			Static50.aClass2_Sub5_Sub1_2.method1298(1057001181);
		}
		if (!Static67.aBoolean95) {
			local257 = (Static2.anInt66 - 6) / 8;
			local313 = (Static2.anInt66 + 6) / 8;
			local368 = (Static71.anInt2025 + 6) / 8;
			local357 = (Static71.anInt2025 - 6) / 8;
			for (local412 = local257 - 1; local412 <= local313 + 1; local412++) {
				for (local430 = local357 - 1; local430 <= local368 + 1; local430++) {
					if (local412 < local257 || local412 > local313 || local357 > local430 || local430 > local368) {
						Static19.aClass36_Sub1_5.method1766(Static20.method431(new Class39[] { Static4.aClass39_45, Static31.method1267(local412), Static79.aClass39_1264, Static31.method1267(local430) }));
						Static19.aClass36_Sub1_5.method1766(Static20.method431(new Class39[] { Static92.aClass39_1101, Static31.method1267(local412), Static79.aClass39_1264, Static31.method1267(local430) }));
					}
				}
			}
		}
		if (Static7.anInt161 == -1) {
			Static60.method1127(30);
		} else {
			Static60.method1127(35);
		}
		Static96.method1845();
		Static50.aClass2_Sub5_Sub1_2.method1302(224);
		Static25.method512();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIB)I")
	public static int method1114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(50) int local50 = Static88.method807(arg0 - 1, arg1 - 1) + Static88.method807(arg0 + 1, arg1 - 1) + Static88.method807(arg0 - 1, arg1 + 1) + Static88.method807(arg0 + 1, arg1 + 1);
		@Pc(79) int local79 = Static88.method807(arg0 - 1, arg1) + Static88.method807(arg0 + 1, arg1) + Static88.method807(arg0, arg1 - 1) + Static88.method807(arg0, arg1 + 1);
		@Pc(84) int local84 = Static88.method807(arg0, arg1);
		return local84 / 4 + local79 / 8 + local50 / 16;
	}
}
