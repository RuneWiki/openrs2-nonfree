import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
	public static int anInt736;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "[Z")
	public static boolean[] aBooleanArray1 = new boolean[8];

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
	public static void method523() {
		Static144.aClass82_52.method2698();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLclient!qf;II)V")
	public static void method524(@OriginalArg(1) Class66 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt3225 == 1) {
			Static147.method2486(Static41.aClass77_468, arg0.anInt3229, 0, arg0.aClass77_1163, 44, 0);
		}
		if (arg0.anInt3225 == 2 && !Static16.aBoolean25) {
			@Pc(43) Class77 local43 = Static130.method2229(arg0);
			if (local43 != null) {
				Static147.method2486(Static146.method2168(new Class77[] { Static100.aClass77_334, arg0.aClass77_1158 }), arg0.anInt3229, -1, local43, 18, 0);
			}
		}
		if (arg0.anInt3225 == 3) {
			Static147.method2486(Static41.aClass77_468, arg0.anInt3229, 0, Static46.aClass77_482, 17, 0);
		}
		if (arg0.anInt3225 == 4) {
			Static147.method2486(Static41.aClass77_468, arg0.anInt3229, 0, arg0.aClass77_1163, 22, 0);
		}
		if (arg0.anInt3225 == 5) {
			Static147.method2486(Static41.aClass77_468, arg0.anInt3229, 0, arg0.aClass77_1163, 37, 0);
		}
		if (arg0.anInt3225 == 6 && Static49.aClass66_6 == null) {
			Static147.method2486(Static41.aClass77_468, arg0.anInt3229, -1, arg0.aClass77_1163, 11, 0);
		}
		@Pc(163) int local163;
		@Pc(157) int local157;
		if (arg0.anInt3230 == 2) {
			local157 = 0;
			for (@Pc(159) int local159 = 0; local159 < arg0.anInt3168; local159++) {
				for (local163 = 0; local163 < arg0.anInt3227; local163++) {
					@Pc(172) int local172 = local163 * (arg0.anInt3236 + 32);
					@Pc(179) int local179 = (arg0.anInt3172 + 32) * local159;
					if (local157 < 20) {
						local172 += arg0.anIntArray470[local157];
						local179 += arg0.anIntArray466[local157];
					}
					if (arg2 >= local172 && local179 <= arg1 && arg2 < local172 + 32 && arg1 < local179 + 32) {
						Static58.anInt1522 = local157;
						Static139.aClass66_11 = arg0;
						if (arg0.anIntArray468[local157] > 0) {
							@Pc(234) Class2_Sub2_Sub9 local234 = Static158.method2689(arg0.anIntArray468[local157] - 1);
							if (Static124.anInt3041 == 1 && Static132.method2242(Static63.method1160(arg0))) {
								if (Static154.anInt3837 != arg0.anInt3229 || local157 != Static80.anInt2087) {
									Static147.method2486(Static146.method2168(new Class77[] { Static15.aClass77_233, Static64.aClass77_713, local234.aClass77_717 }), arg0.anInt3229, local157, Static64.aClass77_714, 13, local234.anInt1783);
								}
							} else if (!Static16.aBoolean25 || !Static132.method2242(Static63.method1160(arg0))) {
								@Pc(334) Class77[] local334 = local234.aClass77Array15;
								if (Static78.aBoolean91) {
									local334 = Static119.method2127(local334);
								}
								@Pc(348) int local348;
								@Pc(365) byte local365;
								if (Static132.method2242(Static63.method1160(arg0))) {
									for (local348 = 4; local348 >= 3; local348--) {
										if (local334 != null && local334[local348] != null) {
											if (local348 == 3) {
												local365 = 9;
											} else {
												local365 = 43;
											}
											Static147.method2486(Static146.method2168(new Class77[] { Static98.aClass77_960, local234.aClass77_717 }), arg0.anInt3229, local157, local334[local348], local365, local234.anInt1783);
										} else if (local348 == 4) {
											Static147.method2486(Static146.method2168(new Class77[] { Static98.aClass77_960, local234.aClass77_717 }), arg0.anInt3229, local157, Static118.aClass77_1092, 43, local234.anInt1783);
										}
									}
								}
								if (Static37.method742(Static63.method1160(arg0))) {
									Static147.method2486(Static146.method2168(new Class77[] { Static98.aClass77_960, local234.aClass77_717 }), arg0.anInt3229, local157, Static64.aClass77_714, 19, local234.anInt1783);
								}
								if (Static132.method2242(Static63.method1160(arg0)) && local334 != null) {
									for (local348 = 2; local348 >= 0; local348--) {
										if (local334[local348] != null) {
											local365 = 0;
											if (local348 == 0) {
												local365 = 41;
											}
											if (local348 == 1) {
												local365 = 23;
											}
											if (local348 == 2) {
												local365 = 39;
											}
											Static147.method2486(Static146.method2168(new Class77[] { Static98.aClass77_960, local234.aClass77_717 }), arg0.anInt3229, local157, local334[local348], local365, local234.anInt1783);
										}
									}
								}
								local334 = arg0.aClass77Array18;
								if (Static78.aBoolean91) {
									local334 = Static119.method2127(local334);
								}
								if (local334 != null) {
									for (local348 = 4; local348 >= 0; local348--) {
										if (local334[local348] != null) {
											local365 = 0;
											if (local348 == 0) {
												local365 = 36;
											}
											if (local348 == 1) {
												local365 = 12;
											}
											if (local348 == 2) {
												local365 = 48;
											}
											if (local348 == 3) {
												local365 = 29;
											}
											if (local348 == 4) {
												local365 = 30;
											}
											Static147.method2486(Static146.method2168(new Class77[] { Static98.aClass77_960, local234.aClass77_717 }), arg0.anInt3229, local157, local334[local348], local365, local234.anInt1783);
										}
									}
								}
								Static147.method2486(Static146.method2168(new Class77[] { Static98.aClass77_960, local234.aClass77_717 }), arg0.anInt3229, local157, Static133.aClass77_1171, 1002, local234.anInt1783);
							} else if ((Static11.anInt307 & 0x10) == 16) {
								Static147.method2486(Static146.method2168(new Class77[] { Static19.aClass77_275, Static64.aClass77_713, local234.aClass77_717 }), arg0.anInt3229, local157, Static120.aClass77_405, 2, local234.anInt1783);
							}
						}
					}
					local157++;
				}
			}
		}
		if (!arg0.aBoolean131) {
			return;
		}
		if (Static16.aBoolean25) {
			if (Static5.method98(Static63.method1160(arg0)) && (Static11.anInt307 & 0x20) == 32) {
				Static147.method2486(Static146.method2168(new Class77[] { Static19.aClass77_275, Static46.aClass77_481, arg0.aClass77_1164 }), arg0.anInt3229, arg0.anInt3212, Static120.aClass77_405, 57, 0);
				return;
			}
			return;
		}
		@Pc(706) Class77 local706;
		for (local157 = 9; local157 >= 5; local157--) {
			local706 = Static84.method2226(arg0, local157);
			if (local706 != null) {
				Static147.method2486(arg0.aClass77_1164, arg0.anInt3229, arg0.anInt3212, local706, 1004, local157 + 1);
			}
		}
		local706 = Static130.method2229(arg0);
		if (local706 != null) {
			Static147.method2486(arg0.aClass77_1164, arg0.anInt3229, arg0.anInt3212, local706, 18, 0);
		}
		for (local163 = 4; local163 >= 0; local163--) {
			@Pc(761) Class77 local761 = Static84.method2226(arg0, local163);
			if (local761 != null) {
				Static147.method2486(arg0.aClass77_1164, arg0.anInt3229, arg0.anInt3212, local761, 26, local163 + 1);
			}
		}
		if (Static67.method1344(Static63.method1160(arg0))) {
			Static147.method2486(Static41.aClass77_468, arg0.anInt3229, arg0.anInt3212, Static4.aClass77_1499, 11, 0);
			return;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
	public static void method525() {
		if (Static146.aBooleanArray12[96]) {
			Static153.anInt3788 += (-Static153.anInt3788 - 24) / 2;
		} else if (Static146.aBooleanArray12[97]) {
			Static153.anInt3788 += (24 - Static153.anInt3788) / 2;
		} else {
			Static153.anInt3788 /= 2;
		}
		if (Static146.aBooleanArray12[98]) {
			Static71.anInt1925 += (12 - Static71.anInt1925) / 2;
		} else if (Static146.aBooleanArray12[99]) {
			Static71.anInt1925 += (-Static71.anInt1925 - 12) / 2;
		} else {
			Static71.anInt1925 /= 2;
		}
		Static146.anInt3057 += Static71.anInt1925 / 2;
		Static28.anInt832 = Static153.anInt3788 / 2 + Static28.anInt832 & 0x7FF;
		if (Static146.anInt3057 < 128) {
			Static146.anInt3057 = 128;
		}
		@Pc(94) int local94 = Static4.anInt4368 + Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4400;
		if (Static146.anInt3057 > 383) {
			Static146.anInt3057 = 383;
		}
		@Pc(104) int local104 = Static6.anInt175 + Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4385;
		if (Static96.anInt2437 - local94 < -500 || Static96.anInt2437 - local94 > 500 || Static100.anInt779 - local104 < -500 || Static100.anInt779 - local104 > 500) {
			Static96.anInt2437 = local94;
			Static100.anInt779 = local104;
		}
		if (Static96.anInt2437 != local94) {
			Static96.anInt2437 += (local94 - Static96.anInt2437) / 16;
		}
		if (local104 != Static100.anInt779) {
			Static100.anInt779 += (local104 - Static100.anInt779) / 16;
		}
		@Pc(166) int local166 = Static96.anInt2437 >> 7;
		@Pc(170) int local170 = Static100.anInt779 >> 7;
		@Pc(176) int local176 = Static161.method2725(Static96.anInt2437, Static54.anInt1472, Static100.anInt779);
		@Pc(178) int local178 = 0;
		@Pc(194) int local194;
		if (local166 > 3 && local170 > 3 && local166 < 100 && local170 < 100) {
			for (local194 = local166 - 4; local194 <= local166 + 4; local194++) {
				for (@Pc(200) int local200 = local170 - 4; local200 <= local170 + 4; local200++) {
					@Pc(204) int local204 = Static54.anInt1472;
					if (local204 < 3 && (Static140.aByteArrayArrayArray6[1][local194][local200] & 0x2) == 2) {
						local204++;
					}
					@Pc(231) int local231 = local176 - Static122.anIntArrayArrayArray2[local204][local194][local200];
					if (local178 < local231) {
						local178 = local231;
					}
				}
			}
		}
		local194 = local178 * 192;
		if (local194 > 98048) {
			local194 = 98048;
		}
		if (local194 < 32768) {
			local194 = 32768;
		}
		if (Static33.anInt970 < local194) {
			Static33.anInt970 += (local194 - Static33.anInt970) / 24;
		} else if (local194 < Static33.anInt970) {
			Static33.anInt970 += (local194 - Static33.anInt970) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
	public static void method526() {
		aBooleanArray1 = null;
	}
}
