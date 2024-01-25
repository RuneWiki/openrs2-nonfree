import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!mha", name = "p", descriptor = "I")
	public static int anInt7093;

	@OriginalMember(owner = "client!mha", name = "q", descriptor = "Lclient!tb;")
	public static Class343 aClass343_1;

	@OriginalMember(owner = "client!mha", name = "t", descriptor = "Lclient!iia;")
	public static Class165 aClass165_2;

	@OriginalMember(owner = "client!mha", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!mha", name = "n", descriptor = "Z")
	public static boolean aBoolean537 = false;

	@OriginalMember(owner = "client!mha", name = "r", descriptor = "I")
	public static final int anInt7094 = 1400;

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(Lclient!ha;III)V")
	public static void method6350(@OriginalArg(0) Class101 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg1 < 0 || Static193.anInt4099 == 0 || Static206.anInt4305 == 0) {
			return;
		}
		@Pc(56) Class76 local56;
		@Pc(43) int local43;
		@Pc(41) int local41;
		@Pc(47) int local47;
		@Pc(45) int local45;
		@Pc(66) int local66;
		@Pc(71) int local71;
		if (Static450.aBoolean606) {
			Static634.method9356(false);
			local56 = arg0.method8112();
			@Pc(82) int[] local82 = arg0.Y();
			local41 = local82[1];
			local45 = local82[3];
			local43 = local82[0];
			local47 = local82[2];
			local66 = Static434.method5184(false) + arg2;
			local71 = Static266.method4573(false) + arg1;
		} else {
			arg0.DA(Static438.anInt7970, Static57.anInt1107, Static193.anInt4099, Static206.anInt4305);
			local41 = Static57.anInt1107;
			local43 = Static438.anInt7970;
			local45 = Static206.anInt4305;
			local47 = Static193.anInt4099;
			arg0.KA(Static294.anInt5370, Static309.anInt5583, Static193.anInt4099, Static206.anInt4305);
			local56 = arg0.method8141();
			local56.method9628(Static574.anInt10017, Static17.anInt8631, Static607.anInt10630, Static58.anInt1127, Static236.anInt4713, Static475.anInt8500);
			local66 = arg2;
			arg0.method8067(local56);
			local71 = arg1;
		}
		Static102.method1769(true);
		if (local47 == 0) {
			local47 = 1;
		}
		if (local45 == 0) {
			local45 = 1;
		}
		@Pc(142) int local142;
		@Pc(164) int local164;
		@Pc(153) int local153;
		@Pc(277) int local277;
		@Pc(285) int local285;
		@Pc(296) int local296;
		@Pc(307) int local307;
		@Pc(134) int local134;
		@Pc(357) int local357;
		if (Static549.aClass18Array30 != null && (!Static537.aBoolean683 || (Static156.anInt3415 & 0x40) != 0)) {
			local134 = -1;
			@Pc(136) int local136 = -1;
			@Pc(139) int local139 = arg0.i();
			local142 = arg0.XA();
			@Pc(154) int local154;
			@Pc(163) int local163;
			if (Static110.aBoolean800) {
				local154 = local153 = (local71 - local41) * Static165.anInt3552 / local45;
				local164 = local163 = Static165.anInt3552 * (local66 - local43) / local47;
			} else {
				local153 = local142 * (local71 - local41) / local45;
				local164 = (local66 - local43) * local139 / local47;
				local163 = (local66 - local43) * local142 / local47;
				local154 = local139 * (local71 - local41) / local45;
			}
			@Pc(215) int[] local215 = new int[] { local164, local154, local139 };
			@Pc(230) int[] local230 = new int[] { local163, local153, local142 };
			local56.method9638(local215);
			local56.method9638(local230);
			@Pc(264) float local264 = Static25.method455((float) local230[1], (float) local215[2], (float) local230[2], 4, (float) local215[1], (float) local215[0], (float) local230[0]);
			if (local264 > 0.0F) {
				local277 = local230[0] - local215[0];
				local285 = local230[2] - local215[2];
				local296 = (int) (local264 * (float) local277 + (float) local215[0]);
				local307 = (int) ((float) local215[2] + (float) local285 * local264);
				local134 = (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.method3690() - 1 << 8) + local296 >> 9;
				local136 = local307 + (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.method3690() - 1 << 8) >> 9;
				@Pc(334) byte local334 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142;
				if (local334 < 3 && (Static96.aByteArrayArrayArray10[1][local296 >> 9][local307 >> 9] & 0x2) != 0) {
					local357 = local334 + 1;
				}
			}
			if (local134 != -1 && local136 != -1) {
				if (Static537.aBoolean683 && (Static156.anInt3415 & 0x40) != 0) {
					@Pc(423) Class357 local423 = Static226.method4160(Static590.anInt10293, Static135.anInt2564);
					if (local423 == null) {
						Static417.method6895();
					} else {
						Static335.method5521(-1, true, 0L, " ->", local136, local134, false, true, Static397.anInt11031, (long) (local134 << 0 | local136), 48, Static526.aString109);
					}
				} else {
					if (Static107.aBoolean133) {
						Static335.method5521(-1, true, 0L, "", local136, local134, false, true, -1, (long) (local134 << 0 | local136), 45, Static205.aClass134_27.method3906(Static204.anInt8130));
					}
					Static335.method5521(-1, true, 0L, "", local136, local134, false, true, Static103.anInt1838, (long) (local134 << 0 | local136), 2, Static249.aString59);
				}
			}
		}
		if (Static450.aBoolean606) {
			Static560.method8530();
		}
		for (local134 = 0; local134 < (Static450.aBoolean606 ? 2 : 1); local134++) {
			@Pc(465) boolean local465 = local134 == 0;
			@Pc(471) Class217 local471 = local465 ? Static212.aClass217_1 : Static480.aClass217_3;
			local142 = arg2;
			local164 = arg1;
			if (Static450.aBoolean606) {
				Static634.method9356(local465);
				local142 = arg2 + Static434.method5184(local465);
				local164 = arg1 + Static266.method4573(local465);
			}
			@Pc(495) Class60 local495 = local471.aClass60_7;
			for (@Pc(500) Class15_Sub9 local500 = (Class15_Sub9) local495.method1547(); local500 != null; local500 = (Class15_Sub9) local495.method1546()) {
				if ((Static645.aBoolean735 || Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142 == local500.aClass15_Sub3_22.aByte142) && local500.method9027(local164, local142, arg0)) {
					@Pc(539) int local539;
					if (local500.aClass15_Sub3_22 instanceof Class15_Sub3_Sub3) {
						local153 = ((Class15_Sub3_Sub3) local500.aClass15_Sub3_22).aShort62;
						local539 = ((Class15_Sub3_Sub3) local500.aClass15_Sub3_22).aShort64;
					} else {
						local539 = local500.aClass15_Sub3_22.anInt11024 >> 9;
						local153 = local500.aClass15_Sub3_22.anInt11022 >> 9;
					}
					@Pc(668) int local668;
					@Pc(679) int local679;
					@Pc(778) int local778;
					@Pc(565) int local565;
					if (local500.aClass15_Sub3_22 instanceof Class15_Sub3_Sub3_Sub1_Sub1) {
						@Pc(561) Class15_Sub3_Sub3_Sub1_Sub1 local561 = (Class15_Sub3_Sub3_Sub1_Sub1) local500.aClass15_Sub3_22;
						local565 = local561.method3690();
						if ((local565 & 0x1) == 0 && (local561.anInt11022 & 0x1FF) == 0 && (local561.anInt11024 & 0x1FF) == 0 || (local565 & 0x1) == 1 && (local561.anInt11022 & 0x1FF) == 256 && (local561.anInt11024 & 0x1FF) == 256) {
							local277 = local561.anInt11022 - (local561.method3690() - 1 << 8);
							local285 = local561.anInt11024 - (local561.method3690() - 1 << 8);
							for (local296 = 0; local296 < Static532.anInt9330; local296++) {
								@Pc(638) Class2_Sub6 local638 = (Class2_Sub6) Static630.aClass335_29.method8357((long) Static84.anIntArray73[local296]);
								if (local638 != null) {
									@Pc(643) Class15_Sub3_Sub3_Sub1_Sub2 local643 = local638.aClass15_Sub3_Sub3_Sub1_Sub2_1;
									if (Static62.anInt1184 != local643.anInt3990 && local643.aBoolean315) {
										local668 = local643.anInt11022 - (local643.aClass312_1.anInt9095 - 1 << 8);
										local679 = local643.anInt11024 - (local643.aClass312_1.anInt9095 - 1 << 8);
										if (local277 <= local668 && local643.aClass312_1.anInt9095 <= local561.method3690() - (local668 - local277 >> 9) && local679 >= local285 && local643.aClass312_1.anInt9095 <= local561.method3690() - (local679 - local285 >> 9)) {
											Static177.method3491(local643, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142 != local500.aClass15_Sub3_22.aByte142);
											local643.anInt3990 = Static62.anInt1184;
										}
									}
								}
							}
							local307 = Static383.anInt7249;
							@Pc(743) int[] local743 = Static404.anIntArray362;
							for (local668 = 0; local668 < local307; local668++) {
								@Pc(753) Class15_Sub3_Sub3_Sub1_Sub1 local753 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local743[local668]];
								if (local753 != null && local753.anInt3990 != Static62.anInt1184 && local561 != local753 && local753.aBoolean315) {
									local778 = local753.anInt11022 - (local753.method3690() - 1 << 8);
									@Pc(790) int local790 = local753.anInt11024 - (local753.method3690() - 1 << 8);
									if (local778 >= local277 && local753.method3690() <= local561.method3690() - (local778 - local277 >> 9) && local285 <= local790 && local753.method3690() <= local561.method3690() - (local790 - local285 >> 9)) {
										Static278.method4675(local753, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142 != local500.aClass15_Sub3_22.aByte142);
										local753.anInt3990 = Static62.anInt1184;
									}
								}
							}
						}
						if (local561.anInt3990 == Static62.anInt1184) {
							continue;
						}
						Static278.method4675(local561, local500.aClass15_Sub3_22.aByte142 != Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142);
						local561.anInt3990 = Static62.anInt1184;
					}
					if (local500.aClass15_Sub3_22 instanceof Class15_Sub3_Sub3_Sub1_Sub2) {
						@Pc(878) Class15_Sub3_Sub3_Sub1_Sub2 local878 = (Class15_Sub3_Sub3_Sub1_Sub2) local500.aClass15_Sub3_22;
						if (local878.aClass312_1 != null) {
							if ((local878.aClass312_1.anInt9095 & 0x1) == 0 && (local878.anInt11022 & 0x1FF) == 0 && (local878.anInt11024 & 0x1FF) == 0 || (local878.aClass312_1.anInt9095 & 0x1) == 1 && (local878.anInt11022 & 0x1FF) == 256 && (local878.anInt11024 & 0x1FF) == 256) {
								local565 = local878.anInt11022 - (local878.aClass312_1.anInt9095 - 1 << 8);
								local277 = local878.anInt11024 - (local878.aClass312_1.anInt9095 - 1 << 8);
								for (local285 = 0; local285 < Static532.anInt9330; local285++) {
									@Pc(963) Class2_Sub6 local963 = (Class2_Sub6) Static630.aClass335_29.method8357((long) Static84.anIntArray73[local285]);
									if (local963 != null) {
										@Pc(968) Class15_Sub3_Sub3_Sub1_Sub2 local968 = local963.aClass15_Sub3_Sub3_Sub1_Sub2_1;
										if (local968.anInt3990 != Static62.anInt1184 && local968 != local878 && local968.aBoolean315) {
											local357 = local968.anInt11022 - (local968.aClass312_1.anInt9095 - 1 << 8);
											local668 = local968.anInt11024 - (local968.aClass312_1.anInt9095 - 1 << 8);
											if (local565 <= local357 && local968.aClass312_1.anInt9095 <= local878.aClass312_1.anInt9095 - (local357 - local565 >> 9) && local668 >= local277 && local968.aClass312_1.anInt9095 <= local878.aClass312_1.anInt9095 - (local668 - local277 >> 9)) {
												Static177.method3491(local968, local500.aClass15_Sub3_22.aByte142 != Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142);
												local968.anInt3990 = Static62.anInt1184;
											}
										}
									}
								}
								local296 = Static383.anInt7249;
								@Pc(1077) int[] local1077 = Static404.anIntArray362;
								for (local357 = 0; local357 < local296; local357++) {
									@Pc(1087) Class15_Sub3_Sub3_Sub1_Sub1 local1087 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local1077[local357]];
									if (local1087 != null && local1087.anInt3990 != Static62.anInt1184 && local1087.aBoolean315) {
										local679 = local1087.anInt11022 - (local1087.method3690() - 1 << 8);
										local778 = local1087.anInt11024 - (local1087.method3690() - 1 << 8);
										if (local679 >= local565 && local1087.method3690() <= local878.aClass312_1.anInt9095 - (local679 - local565 >> 9) && local277 <= local778 && local1087.method3690() <= local878.aClass312_1.anInt9095 - (local778 - local277 >> 9)) {
											Static278.method4675(local1087, local500.aClass15_Sub3_22.aByte142 != Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142);
											local1087.anInt3990 = Static62.anInt1184;
										}
									}
								}
							}
							if (local878.anInt3990 == Static62.anInt1184) {
								continue;
							}
							Static177.method3491(local878, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142 != local500.aClass15_Sub3_22.aByte142);
							local878.anInt3990 = Static62.anInt1184;
						}
					}
					if (local500.aClass15_Sub3_22 instanceof Class15_Sub3_Sub2_Sub1) {
						@Pc(1222) int local1222 = Static640.anInt11085 + local153;
						local565 = local539 + Static490.anInt8763;
						@Pc(1244) Class2_Sub47 local1244 = (Class2_Sub47) Static18.aClass335_2.method8357((long) (local565 << 14 | local500.aClass15_Sub3_22.aByte142 << 28 | local1222));
						if (local1244 != null) {
							local285 = 0;
							for (@Pc(1254) Class2_Sub41 local1254 = (Class2_Sub41) local1244.aClass271_57.method7170(); local1254 != null; local1254 = (Class2_Sub41) local1244.aClass271_57.method7179()) {
								@Pc(1262) Class351 local1262 = aClass343_1.method8549(local1254.anInt7375);
								if (Static537.aBoolean683 && local500.aClass15_Sub3_22.aByte142 == Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142) {
									@Pc(1284) Class204 local1284 = Static125.anInt2444 == -1 ? null : Static142.aClass367_1.method9243(Static125.anInt2444);
									if ((Static156.anInt3415 & 0x1) != 0 && (local1284 == null || local1262.method8822(Static125.anInt2444, local1284.anInt5933) != local1284.anInt5933)) {
										Static335.method5521(-1, false, (long) local1254.anInt7375, Static13.aString100 + " -> <col=ff9040>" + local1262.aString119, local539, local153, false, true, Static397.anInt11031, (long) local285, 13, Static526.aString109);
									}
								}
								if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142 == local500.aClass15_Sub3_22.aByte142) {
									@Pc(1347) String[] local1347 = local1262.aStringArray72;
									for (local668 = 4; local668 >= 0; local668--) {
										if (local1347 != null && local1347[local668] != null) {
											@Pc(1359) byte local1359 = 0;
											if (local668 == 0) {
												local1359 = 23;
											}
											local778 = Static373.anInt7103;
											if (local668 == 1) {
												local1359 = 25;
											}
											if (local668 == 2) {
												local1359 = 6;
											}
											if (local668 == 3) {
												local1359 = 47;
											}
											if (local668 == local1262.anInt10201) {
												local778 = local1262.anInt10184;
											}
											if (local668 == 4) {
												local1359 = 60;
											}
											if (local668 == local1262.anInt10208) {
												local778 = local1262.anInt10161;
											}
											Static335.method5521(-1, false, (long) local1254.anInt7375, "<col=ff9040>" + local1262.aString119, local539, local153, false, true, local778, (long) local285, local1359, local1347[local668]);
										}
									}
								}
								Static335.method5521(-1, false, (long) local1254.anInt7375, "<col=ff9040>" + local1262.aString119, local539, local153, local500.aClass15_Sub3_22.aByte142 != Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142, true, Static198.anInt4183, (long) local285, 1007, Static205.aClass134_22.method3906(Static204.anInt8130));
								local285++;
							}
						}
					}
					if (local500.aClass15_Sub3_22 instanceof Interface23) {
						@Pc(1495) Interface23 local1495 = (Interface23) local500.aClass15_Sub3_22;
						@Pc(1502) Class331 local1502 = Static251.aClass328_1.method8261(local1495.method9451());
						if (local1502.anIntArray486 != null) {
							local1502 = local1502.method8304(Static113.aClass282_1);
						}
						if (local1502 != null) {
							if (Static537.aBoolean683 && Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142 == local500.aClass15_Sub3_22.aByte142) {
								@Pc(1534) Class204 local1534 = Static125.anInt2444 == -1 ? null : Static142.aClass367_1.method9243(Static125.anInt2444);
								if ((Static156.anInt3415 & 0x4) != 0 && (local1534 == null || local1502.method8296(local1534.anInt5933, Static125.anInt2444) != local1534.anInt5933)) {
									Static335.method5521(-1, false, Static248.method4407(local539, local153, local1495), Static13.aString100 + " -> <col=00ffff>" + local1502.aString110, local539, local153, false, true, Static397.anInt11031, (long) local1495.hashCode(), 44, Static526.aString109);
								}
							}
							if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142 == local500.aClass15_Sub3_22.aByte142) {
								@Pc(1599) String[] local1599 = local1502.aStringArray60;
								if (local1599 != null) {
									for (local285 = 4; local285 >= 0; local285--) {
										if (local1599[local285] != null) {
											@Pc(1611) short local1611 = 0;
											if (local285 == 0) {
												local1611 = 4;
											}
											local307 = Static373.anInt7103;
											if (local285 == 1) {
												local1611 = 52;
											}
											if (local285 == 2) {
												local1611 = 8;
											}
											if (local285 == 3) {
												local1611 = 46;
											}
											if (local285 == local1502.anInt9429) {
												local307 = local1502.anInt9450;
											}
											if (local285 == 4) {
												local1611 = 1008;
											}
											if (local1502.anInt9407 == local285) {
												local307 = local1502.anInt9424;
											}
											Static335.method5521(-1, false, Static248.method4407(local539, local153, local1495), "<col=00ffff>" + local1502.aString110, local539, local153, false, true, local307, (long) local1495.hashCode(), local1611, local1599[local285]);
										}
									}
								}
								Static335.method5521(-1, false, (long) local1502.anInt9434, "<col=00ffff>" + local1502.aString110, local539, local153, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142 != local500.aClass15_Sub3_22.aByte142, true, Static198.anInt4183, (long) local1495.hashCode(), 1006, Static205.aClass134_22.method3906(Static204.anInt8130));
							}
						}
					}
				}
			}
			if (Static450.aBoolean606) {
				Static560.method8530();
			}
		}
		Static102.method1769(false);
	}
}
