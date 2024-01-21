import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	public static int anInt1301;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_13;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
	public static int anInt1299 = 0;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Lclient!va;")
	private static Class61 aClass61_539 = Static88.method1421("Enter amount:");

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "Lclient!va;")
	private static Class61 aClass61_540 = Static88.method1421("Report abuse");

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	public static int anInt1303 = -1;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "Lclient!va;")
	private static Class61 aClass61_541 = Static88.method1421("white:");

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	public static int anInt1307 = 0;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
	public static int anInt1308 = 0;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "Lclient!va;")
	public static Class61 aClass61_542 = aClass61_539;

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "Lclient!va;")
	public static Class61 aClass61_543 = aClass61_541;

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "Lclient!va;")
	public static Class61 aClass61_544 = aClass61_540;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public static void method738() {
		aClass10_Sub1_Sub1_Sub2_13 = null;
		aClass61_539 = null;
		aClass61_544 = null;
		aClass61_540 = null;
		aClass61_541 = null;
		aByteArrayArray8 = null;
		aClass61_542 = null;
		aClass61_543 = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
	public static void method739() {
		while (true) {
			if (Static55.aClass10_Sub10_Sub1_4.method1164(Static5.anInt34) >= 11) {
				@Pc(18) int local18 = Static55.aClass10_Sub10_Sub1_4.method1171(11);
				if (local18 != 2047) {
					if (Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local18] == null) {
						Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local18] = new Class10_Sub1_Sub5_Sub2_Sub2();
						if (Static11.aClass10_Sub10Array1[local18] != null) {
							Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local18].method930(Static11.aClass10_Sub10Array1[local18]);
						}
					}
					Static58.anIntArray170[Static10.anInt305++] = local18;
					@Pc(55) Class10_Sub1_Sub5_Sub2_Sub2 local55 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local18];
					local55.anInt1631 = Static95.anInt2442;
					@Pc(63) int local63 = Static55.aClass10_Sub10_Sub1_4.method1171(1);
					if (local63 == 1) {
						Static12.anIntArray46[Static76.anInt2030++] = local18;
					}
					@Pc(81) int local81 = Static55.aClass10_Sub10_Sub1_4.method1171(5);
					if (local81 > 15) {
						local81 -= 32;
					}
					@Pc(92) int local92 = Static55.aClass10_Sub10_Sub1_4.method1171(1);
					@Pc(97) int local97 = Static55.aClass10_Sub10_Sub1_4.method1171(5);
					if (local97 > 15) {
						local97 -= 32;
					}
					local55.method928(Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0] + local97, local92 == 1, local81 + Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0]);
					continue;
				}
			}
			Static55.aClass10_Sub10_Sub1_4.method1165();
			return;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!he;IB)Lclient!bc;")
	public static Class10_Sub1_Sub1_Sub1 method740(@OriginalArg(0) int arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2) {
		return Static5.method36(arg0, arg1, arg2) ? Static4.method29() : null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)Lclient!hd;")
	public static Class10_Sub1_Sub7 method741(@OriginalArg(1) int arg0) {
		@Pc(10) Class10_Sub1_Sub7 local10 = (Class10_Sub1_Sub7) Static107.aClass29_67.method644((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static48.method753(Static43.aClass11_31, Static93.aClass11_49, arg0);
		if (local10 != null) {
			Static107.aClass29_67.method649(local10, (long) arg0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	public static void method742() {
		Static79.method1254(false);
		@Pc(10) boolean local10 = true;
		Static57.anInt1515 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static39.aByteArrayArray3.length; local14++) {
			if (Static79.anIntArray240[local14] != -1 && Static39.aByteArrayArray3[local14] == null) {
				Static39.aByteArrayArray3[local14] = Static57.aClass11_Sub1_10.method203(Static79.anIntArray240[local14], 0);
				if (Static39.aByteArrayArray3[local14] == null) {
					Static57.anInt1515++;
					local10 = false;
				}
			}
			if (Static17.anIntArray67[local14] != -1 && Static65.aByteArrayArray9[local14] == null) {
				Static65.aByteArrayArray9[local14] = Static57.aClass11_Sub1_10.method211(0, Static98.anIntArrayArray23[local14], Static17.anIntArray67[local14]);
				if (Static65.aByteArrayArray9[local14] == null) {
					local10 = false;
					Static57.anInt1515++;
				}
			}
		}
		if (!local10) {
			Static64.anInt1737 = 1;
			return;
		}
		Static58.anInt1533 = 0;
		local10 = true;
		@Pc(118) int local118;
		@Pc(129) int local129;
		for (@Pc(99) int local99 = 0; local99 < Static39.aByteArrayArray3.length; local99++) {
			@Pc(105) byte[] local105 = Static65.aByteArrayArray9[local99];
			if (local105 != null) {
				local118 = (Static37.anIntArray118[local99] >> 8) * 64 - Static107.anInt2431;
				local129 = (Static37.anIntArray118[local99] & 0xFF) * 64 - Static7.anInt80;
				if (Static71.aBoolean88) {
					local129 = 10;
					local118 = 10;
				}
				local10 &= Static106.method1670(local105, local129, local118);
			}
		}
		if (!local10) {
			Static64.anInt1737 = 2;
			return;
		}
		if (Static64.anInt1737 != 0) {
			Static58.method840(true, Static43.aClass61_501, Static95.aClass61_975);
		}
		Static80.method1256();
		Static48.aClass54_1.method1379();
		System.gc();
		for (@Pc(175) int local175 = 0; local175 < 4; local175++) {
			Static15.aClass12Array1[local175].method262();
		}
		@Pc(196) int local196;
		for (local118 = 0; local118 < 4; local118++) {
			for (local129 = 0; local129 < 104; local129++) {
				for (local196 = 0; local196 < 104; local196++) {
					Static21.aByteArrayArrayArray4[local118][local129][local196] = 0;
				}
			}
		}
		Static57.method835();
		local129 = Static39.aByteArrayArray3.length;
		Static79.method1254(true);
		@Pc(246) int local246;
		@Pc(257) int local257;
		@Pc(370) int local370;
		@Pc(302) int local302;
		@Pc(360) int local360;
		if (!Static71.aBoolean88) {
			@Pc(261) byte[] local261;
			for (local196 = 0; local196 < local129; local196++) {
				local246 = (Static37.anIntArray118[local196] >> 8) * 64 - Static107.anInt2431;
				local257 = (Static37.anIntArray118[local196] & 0xFF) * 64 - Static7.anInt80;
				local261 = Static39.aByteArrayArray3[local196];
				if (local261 != null) {
					Static65.method951(Static82.anInt2199 * 8 - 48, Static15.aClass12Array1, local261, local257, Static50.anInt1408 * 8 - 48, local246);
				}
			}
			for (local246 = 0; local246 < local129; local246++) {
				local302 = (Static37.anIntArray118[local246] & 0xFF) * 64 - Static7.anInt80;
				local257 = (Static37.anIntArray118[local246] >> 8) * 64 - Static107.anInt2431;
				@Pc(317) byte[] local317 = Static39.aByteArrayArray3[local246];
				if (local317 == null && Static82.anInt2199 < 800) {
					Static22.method470(64, local302, local257, 64);
				}
			}
			Static79.method1254(true);
			for (local257 = 0; local257 < local129; local257++) {
				local261 = Static65.aByteArrayArray9[local257];
				if (local261 != null) {
					local360 = (Static37.anIntArray118[local257] >> 8) * 64 - Static107.anInt2431;
					local370 = (Static37.anIntArray118[local257] & 0xFF) * 64 - Static7.anInt80;
					Static94.method1493(local370, Static48.aClass54_1, local261, local360, Static15.aClass12Array1);
				}
			}
		}
		@Pc(424) int local424;
		@Pc(430) int local430;
		if (Static71.aBoolean88) {
			@Pc(436) int local436;
			@Pc(447) int local447;
			@Pc(449) int local449;
			for (local196 = 0; local196 < 4; local196++) {
				for (local246 = 0; local246 < 13; local246++) {
					for (local257 = 0; local257 < 13; local257++) {
						@Pc(401) boolean local401 = false;
						local360 = Static38.anIntArrayArrayArray2[local196][local246][local257];
						if (local360 != -1) {
							local370 = local360 >> 24 & 0x3;
							local424 = local360 >> 1 & 0x3;
							local430 = local360 >> 14 & 0x3FF;
							local436 = local360 >> 3 & 0x7FF;
							local447 = (local430 / 8 << 8) + (local436 / 8);
							for (local449 = 0; local449 < Static37.anIntArray118.length; local449++) {
								if (local447 == Static37.anIntArray118[local449] && Static39.aByteArrayArray3[local449] != null) {
									Static66.method957(local196, (local430 & 0x7) * 8, Static15.aClass12Array1, local424, (local436 & 0x7) * 8, local370, local246 * 8, local257 * 8, Static39.aByteArrayArray3[local449]);
									local401 = true;
									break;
								}
							}
						}
						if (!local401) {
							Static43.method692(local196, local257 * 8, local246 * 8);
						}
					}
				}
			}
			for (local246 = 0; local246 < 13; local246++) {
				for (local257 = 0; local257 < 13; local257++) {
					local302 = Static38.anIntArrayArrayArray2[0][local246][local257];
					if (local302 == -1) {
						Static22.method470(8, local257 * 8, local246 * 8, 8);
					}
				}
			}
			Static79.method1254(true);
			for (local257 = 0; local257 < 4; local257++) {
				for (local302 = 0; local302 < 13; local302++) {
					for (local360 = 0; local360 < 13; local360++) {
						local370 = Static38.anIntArrayArrayArray2[local257][local302][local360];
						if (local370 != -1) {
							local430 = local370 >> 1 & 0x3;
							local436 = local370 >> 14 & 0x3FF;
							local424 = local370 >> 24 & 0x3;
							local447 = local370 >> 3 & 0x7FF;
							local449 = local447 / 8 + (local436 / 8 << 8);
							for (@Pc(638) int local638 = 0; local638 < Static37.anIntArray118.length; local638++) {
								if (Static37.anIntArray118[local638] == local449 && Static65.aByteArrayArray9[local638] != null) {
									Static106.method1668(local424, (local447 & 0x7) * 8, local257, Static65.aByteArrayArray9[local638], local430, local360 * 8, Static15.aClass12Array1, (local436 & 0x7) * 8, Static48.aClass54_1, local302 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static79.method1254(true);
		Static80.method1256();
		Static9.method236(Static15.aClass12Array1, Static48.aClass54_1);
		Static79.method1254(true);
		local196 = Static9.anInt290;
		if (local196 > Static101.anInt2582) {
			local196 = Static101.anInt2582;
		}
		if (Static101.anInt2582 - 1 > local196) {
		}
		if (Static31.aBoolean43) {
			Static48.aClass54_1.method1384(Static9.anInt290);
		} else {
			Static48.aClass54_1.method1384(0);
		}
		for (local246 = 0; local246 < 104; local246++) {
			for (local257 = 0; local257 < 104; local257++) {
				Static78.method1241(local246, local257);
			}
		}
		Static44.method704();
		Static27.aClass29_21.method646();
		if (Static104.aFrame1 != null) {
			Static50.aClass10_Sub10_Sub1_3.method1167(171);
			Static50.aClass10_Sub10_Sub1_3.method1157(1057001181);
		}
		if (!Static71.aBoolean88) {
			local257 = (Static50.anInt1408 - 6) / 8;
			local360 = (Static82.anInt2199 - 6) / 8;
			local302 = (Static50.anInt1408 + 6) / 8;
			local370 = (Static82.anInt2199 + 6) / 8;
			for (local424 = local257 - 1; local424 <= local302 + 1; local424++) {
				for (local430 = local360 - 1; local430 <= local370 + 1; local430++) {
					if (local424 < local257 || local302 < local424 || local430 < local360 || local430 > local370) {
						Static57.aClass11_Sub1_10.method204(Static93.method1156(new Class61[] { Static57.aClass61_630, Static29.method529(local424), Static95.aClass61_979, Static29.method529(local430) }));
						Static57.aClass11_Sub1_10.method204(Static93.method1156(new Class61[] { Static12.aClass61_92, Static29.method529(local424), Static95.aClass61_979, Static29.method529(local430) }));
					}
				}
			}
		}
		if (Static53.anInt1448 == -1) {
			Static50.method780(30);
		} else {
			Static50.method780(35);
		}
		Static21.method444();
		Static50.aClass10_Sub10_Sub1_3.method1167(140);
		Static105.method1645();
	}
}
