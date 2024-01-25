import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
	public static int anInt263;

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
	public static int anInt256 = 0;

	@OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
	public static int anInt266 = -1;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!vm;B)V")
	public static void method259(@OriginalArg(0) Class92 arg0) {
		if (Static38.anInt830 < 0 || Static184.anInt4055 < 0 || Static186.anInt5635 == 0 || Static311.anInt6247 == 0) {
			return;
		}
		arg0.method4520(Static167.anInt3730, Static316.anInt5500, Static186.anInt5635, Static311.anInt6247);
		arg0.method4459(Static29.anInt465, Static150.anInt6595, Static186.anInt5635, Static311.anInt6247);
		@Pc(35) Class23 local35 = arg0.method4538();
		local35.method5096(Static181.anInt3977, Static239.anInt6165, Static235.anInt6708, Static264.anInt3386, Static109.anInt2409, Static335.anInt6656);
		arg0.method4530(local35);
		@Pc(66) int local66;
		@Pc(75) int local75;
		@Pc(78) int local78;
		@Pc(86) int local86;
		@Pc(95) int local95;
		if (Static315.anInt1642 == 0 && Static310.aClass26Array4 != null) {
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(57) int local57 = arg0.method4494();
			local66 = (Static38.anInt830 - Static167.anInt3730) * local57 / Static186.anInt5635;
			local75 = (Static184.anInt4055 - Static316.anInt5500) * local57 / Static311.anInt6247;
			local78 = arg0.method4484();
			local86 = local78 * (Static38.anInt830 - Static167.anInt3730) / Static186.anInt5635;
			local95 = local78 * (Static184.anInt4055 - Static316.anInt5500) / Static311.anInt6247;
			@Pc(110) int[] local110 = new int[] { local66, local75, local57 };
			local35.method5097(local110);
			@Pc(128) int[] local128 = new int[] { local86, local95, local78 };
			local35.method5097(local128);
			@Pc(133) float local133 = 0.0F;
			@Pc(142) int local142 = local128[0] - local110[0];
			@Pc(151) int local151 = local128[1] - local110[1];
			@Pc(160) int local160 = local128[2] - local110[2];
			while (local133 < 1.0F) {
				@Pc(173) int local173 = (int) (local133 * (float) local142 + (float) local110[0]);
				@Pc(177) int local177 = local173 >> 7;
				@Pc(188) int local188 = (int) ((float) local110[2] + (float) local160 * local133);
				@Pc(192) int local192 = local188 >> 7;
				if (local177 > 0 && local192 > 0 && local177 < Static92.anInt2048 && Static290.anInt5893 > local192) {
					@Pc(214) int local214 = Static279.anInt5645;
					if (local214 < 3 && (Static348.aByteArrayArrayArray11[1][local177][local192] & 0x2) != 0) {
						local214++;
					}
					if ((float) Static310.aClass26Array4[local214].method4990(local173, local188) < (float) local151 * local133 + (float) local110[1]) {
						local52 = Static110.aClass2_Sub2_Sub1_Sub1_1.method5425() * 64 + local173 - 64 >> 7;
						local54 = local188 + (Static110.aClass2_Sub2_Sub1_Sub1_1.method5425() - 1) * 64 >> 7;
						break;
					}
				}
				local133 = (float) ((double) local133 + 0.01D);
			}
			if (local52 != -1 && local54 != -1) {
				if (Static247.aBoolean436 && (Static184.anInt4052 & 0x40) != 0) {
					@Pc(333) Class72 local333 = Static289.method4934(Static301.anInt6084, Static58.anInt1259);
					if (local333 == null) {
						Static138.method2738();
					} else {
						Static285.method4888(local52, " ->", 0L, Static232.anInt4817, Static316.aString197, local54, 17);
					}
				} else {
					if (Static269.anInt5508 == 1) {
						Static285.method4888(local52, "", 0L, -1, Static167.aString122, local54, 23);
					}
					Static285.method4888(local52, "", 0L, -1, Static131.aString98, local54, 33);
				}
			}
		}
		@Pc(350) Class204 local350 = Static315.aClass204_4;
		for (@Pc(355) Class17_Sub2 local355 = (Class17_Sub2) local350.method5359(); local355 != null; local355 = (Class17_Sub2) local350.method5357()) {
			if (local355.method1055(arg0, Static38.anInt830, Static184.anInt4055) && Static279.anInt5645 == local355.anInt1285) {
				@Pc(479) int local479;
				@Pc(490) int local490;
				if (local355.aClass2_1 instanceof Class2_Sub2_Sub1_Sub1) {
					@Pc(376) Class2_Sub2_Sub1_Sub1 local376 = (Class2_Sub2_Sub1_Sub1) local355.aClass2_1;
					local66 = local376.method5425();
					if ((local66 & 0x1) == 0 && (local376.anInt6465 & 0x7F) == 0 && (local376.anInt6466 & 0x7F) == 0 || (local66 & 0x1) == 1 && (local376.anInt6465 & 0x7F) == 64 && (local376.anInt6466 & 0x7F) == 64) {
						local75 = local376.anInt6465 + 64 - local376.method5425() * 64;
						local78 = local376.anInt6466 - (local376.method5425() - 1) * 64;
						for (local86 = 0; local86 < Static282.anInt5712; local86++) {
							@Pc(452) Class2_Sub2_Sub1_Sub2 local452 = Static101.aClass2_Sub2_Sub1_Sub2Array6[Static332.anIntArray523[local86]];
							if (local452 != null && Static342.anInt6706 != local452.anInt6509 && local452.aBoolean568) {
								local479 = local452.anInt6465 + 64 - local452.aClass34_1.anInt842 * 64;
								local490 = local452.anInt6466 - (local452.aClass34_1.anInt842 - 1) * 64;
								if (local75 <= local479 && local452.aClass34_1.anInt842 <= local376.method5425() - (local479 - local75 >> 7) && local490 >= local78 && local452.aClass34_1.anInt842 <= local376.method5425() - (local490 - local78 >> 7)) {
									Static350.method5644(local452);
									local452.anInt6509 = Static342.anInt6706;
								}
							}
						}
						for (local95 = 0; local95 < Static156.anInt3506; local95++) {
							@Pc(554) Class2_Sub2_Sub1_Sub1 local554 = Static253.aClass2_Sub2_Sub1_Sub1Array1[Static39.anIntArray105[local95]];
							if (local554 != null && Static342.anInt6706 != local554.anInt6509 && local554 != local376 && local554.aBoolean568) {
								local490 = local554.anInt6465 - (local554.method5425() - 1) * 64;
								@Pc(595) int local595 = local554.anInt6466 + 64 - local554.method5425() * 64;
								if (local490 >= local75 && local554.method5425() <= local376.method5425() - (local490 - local75 >> 7) && local595 >= local78 && local554.method5425() <= local376.method5425() - (local595 - local78 >> 7)) {
									Static352.method5474(local554);
									local554.anInt6509 = Static342.anInt6706;
								}
							}
						}
					}
					if (Static342.anInt6706 == local376.anInt6509) {
						continue;
					}
					Static352.method5474(local376);
					local376.anInt6509 = Static342.anInt6706;
				}
				if (local355.aClass2_1 instanceof Class2_Sub2_Sub1_Sub2) {
					@Pc(681) Class2_Sub2_Sub1_Sub2 local681 = (Class2_Sub2_Sub1_Sub2) local355.aClass2_1;
					if (local681.aClass34_1 != null) {
						if ((local681.aClass34_1.anInt842 & 0x1) == 0 && (local681.anInt6465 & 0x7F) == 0 && (local681.anInt6466 & 0x7F) == 0 || (local681.aClass34_1.anInt842 & 0x1) == 1 && (local681.anInt6465 & 0x7F) == 64 && (local681.anInt6466 & 0x7F) == 64) {
							local66 = local681.anInt6465 + 64 - local681.aClass34_1.anInt842 * 64;
							local75 = local681.anInt6466 - (local681.aClass34_1.anInt842 - 1) * 64;
							for (local78 = 0; local78 < Static282.anInt5712; local78++) {
								@Pc(756) Class2_Sub2_Sub1_Sub2 local756 = Static101.aClass2_Sub2_Sub1_Sub2Array6[Static332.anIntArray523[local78]];
								if (local756 != null && Static342.anInt6706 != local756.anInt6509 && local681 != local756 && local756.aBoolean568) {
									local95 = local756.anInt6465 + 64 - local756.aClass34_1.anInt842 * 64;
									local479 = local756.anInt6466 - (local756.aClass34_1.anInt842 - 1) * 64;
									if (local66 <= local95 && local756.aClass34_1.anInt842 <= local681.aClass34_1.anInt842 - (local95 - local66 >> 7) && local75 <= local479 && local756.aClass34_1.anInt842 <= local681.aClass34_1.anInt842 - (local479 - local75 >> 7)) {
										Static350.method5644(local756);
										local756.anInt6509 = Static342.anInt6706;
									}
								}
							}
							for (local86 = 0; local86 < Static156.anInt3506; local86++) {
								@Pc(866) Class2_Sub2_Sub1_Sub1 local866 = Static253.aClass2_Sub2_Sub1_Sub1Array1[Static39.anIntArray105[local86]];
								if (local866 != null && Static342.anInt6706 != local866.anInt6509 && local866.aBoolean568) {
									local479 = local866.anInt6465 - (local866.method5425() - 1) * 64;
									local490 = local866.anInt6466 + 64 - local866.method5425() * 64;
									if (local66 <= local479 && local866.method5425() <= local681.aClass34_1.anInt842 - (local479 - local66 >> 7) && local75 <= local490 && local866.method5425() <= local681.aClass34_1.anInt842 - (local490 - local75 >> 7)) {
										Static352.method5474(local866);
										local866.anInt6509 = Static342.anInt6706;
									}
								}
							}
						}
						if (Static342.anInt6706 == local681.anInt6509) {
							continue;
						}
						Static350.method5644(local681);
						local681.anInt6509 = Static342.anInt6706;
					}
				}
				if (local355.aClass2_1 instanceof Class2_Sub3_Sub1) {
					@Pc(997) Class4_Sub21 local997 = (Class4_Sub21) Static178.aClass198_35.method5261((long) (local355.anInt1287 | local355.anInt1284 << 14 | local355.anInt1285 << 28));
					if (local997 != null) {
						for (@Pc(1005) Class4_Sub28 local1005 = (Class4_Sub28) local997.aClass130_65.method3506(); local1005 != null; local1005 = (Class4_Sub28) local997.aClass130_65.method3501()) {
							@Pc(1012) Class142 local1012 = Static247.method4270(local1005.anInt4053);
							if (Static315.anInt1642 == 1) {
								Static285.method4888(local355.anInt1287, Static243.aString186 + " -> <col=ff9040>" + local1012.aString165, (long) local1005.anInt4053, Static107.anInt6873, Static277.aString206, local355.anInt1284, 29);
							} else if (Static247.aBoolean436) {
								@Pc(1058) Class4_Sub1_Sub21 local1058 = Static81.anInt1731 == -1 ? null : Static98.method5502(Static81.anInt1731);
								if ((Static184.anInt4052 & 0x1) != 0 && (local1058 == null || local1012.method3729(local1058.anInt6695, Static81.anInt1731) != local1058.anInt6695)) {
									Static285.method4888(local355.anInt1287, Static195.aString145 + " -> <col=ff9040>" + local1012.aString165, (long) local1005.anInt4053, Static232.anInt4817, Static316.aString197, local355.anInt1284, 60);
								}
							} else {
								@Pc(1114) String[] local1114 = local1012.aStringArray36;
								for (local86 = 4; local86 >= 0; local86--) {
									if (local1114 != null && local1114[local86] != null) {
										@Pc(1126) byte local1126 = 0;
										local479 = Static98.anInt6645;
										if (local86 == 0) {
											local1126 = 28;
										}
										if (local86 == 1) {
											local1126 = 34;
										}
										if (local86 == 2) {
											local1126 = 39;
										}
										if (local86 == 3) {
											local1126 = 6;
										}
										if (local86 == 4) {
											local1126 = 57;
										}
										if (local86 == local1012.anInt4501) {
											local479 = local1012.anInt4485;
										}
										if (local86 == local1012.anInt4480) {
											local479 = local1012.anInt4460;
										}
										Static285.method4888(local355.anInt1287, "<col=ff9040>" + local1012.aString165, (long) local1005.anInt4053, local479, local1114[local86], local355.anInt1284, local1126);
									}
								}
								Static285.method4888(local355.anInt1287, "<col=ff9040>" + local1012.aString165, (long) local1005.anInt4053, Static225.anInt4711, Static8.aString8, local355.anInt1284, 1003);
							}
						}
					}
				}
				if (local355.aClass2_1 instanceof Interface5) {
					@Pc(1250) Interface5 local1250 = (Interface5) local355.aClass2_1;
					@Pc(1256) Class56 local1256 = Static320.method5290(local1250.method4729());
					if (local1256.anIntArray151 != null) {
						local1256 = local1256.method1093();
					}
					if (local1256 != null) {
						if (Static315.anInt1642 == 1) {
							Static285.method4888(local355.anInt1287, Static243.aString186 + " -> <col=00ffff>" + local1256.aString39, Static103.method2836(local355.anInt1287, local355.anInt1284, local1250), Static107.anInt6873, Static277.aString206, local355.anInt1284, 8);
						} else if (Static247.aBoolean436) {
							@Pc(1410) Class4_Sub1_Sub21 local1410 = Static81.anInt1731 == -1 ? null : Static98.method5502(Static81.anInt1731);
							if ((Static184.anInt4052 & 0x4) != 0 && (local1410 == null || local1256.method1085(local1410.anInt6695, Static81.anInt1731) != local1410.anInt6695)) {
								Static285.method4888(local355.anInt1287, Static195.aString145 + " -> <col=00ffff>" + local1256.aString39, Static103.method2836(local355.anInt1287, local355.anInt1284, local1250), Static232.anInt4817, Static316.aString197, local355.anInt1284, 7);
							}
						} else {
							@Pc(1275) String[] local1275 = local1256.lb;
							if (local1275 != null) {
								for (local78 = 4; local78 >= 0; local78--) {
									if (local1275[local78] != null) {
										@Pc(1287) short local1287 = 0;
										if (local78 == 0) {
											local1287 = 2;
										}
										local95 = Static98.anInt6645;
										if (local78 == 1) {
											local1287 = 58;
										}
										if (local78 == 2) {
											local1287 = 38;
										}
										if (local78 == 3) {
											local1287 = 9;
										}
										if (local78 == 4) {
											local1287 = 1002;
										}
										if (local78 == local1256.anInt1315) {
											local95 = local1256.anInt1321;
										}
										if (local1256.anInt1311 == local78) {
											local95 = local1256.anInt1319;
										}
										Static285.method4888(local355.anInt1287, "<col=00ffff>" + local1256.aString39, Static103.method2836(local355.anInt1287, local355.anInt1284, local1250), local95, local1275[local78], local355.anInt1284, local1287);
									}
								}
							}
							Static285.method4888(local355.anInt1287, "<col=00ffff>" + local1256.aString39, (long) local1256.anInt1346, Static225.anInt4711, Static8.aString8, local355.anInt1284, 1010);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "(B)I")
	public static int method265() {
		if (Static315.aFrame2 == null) {
			return Static257.aBoolean448 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
