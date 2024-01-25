import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!eba", name = "i", descriptor = "[Lclient!f;")
	public static Class73[] aClass73Array3;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "[B")
	public static final byte[] aByteArray56 = new byte[2048];

	@OriginalMember(owner = "client!eba", name = "h", descriptor = "I")
	public static int anInt2687 = 0;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)Z")
	public static boolean method2262() {
		@Pc(10) Class3_Sub47 local10 = (Class3_Sub47) Static431.aClass244_56.method5572();
		if (local10 == null) {
			return false;
		}
		for (@Pc(21) int local21 = 0; local21 < local10.anInt8339; local21++) {
			if (local10.aClass309Array1[local21] != null && local10.aClass309Array1[local21].anInt8650 == 0) {
				return false;
			}
			if (local10.aClass309Array2[local21] != null && local10.aClass309Array2[local21].anInt8650 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(BLclient!r;II)V")
	public static void method2263(@OriginalArg(1) Class31 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg1 < 0 || Static263.anInt5058 == 0 || Static280.anInt5293 == 0) {
			return;
		}
		arg0.la(Static232.anInt5900, Static117.anInt2730, Static263.anInt5058, Static280.anInt5293);
		arg0.da(Static429.anInt7992, Static234.anInt10332, Static263.anInt5058, Static280.anInt5293);
		@Pc(35) Class42 local35 = arg0.method8031();
		local35.na(Static337.anInt6075, Static181.anInt3975, Static290.anInt5404, Static111.anInt2679, Static378.anInt6564, Static586.anInt10135);
		arg0.method8062(local35);
		@Pc(55) int local55;
		@Pc(64) int local64;
		@Pc(73) int local73;
		@Pc(76) int local76;
		@Pc(85) int local85;
		@Pc(94) int local94;
		@Pc(127) int[] local127;
		@Pc(141) int local141;
		@Pc(149) int local149;
		@Pc(158) int local158;
		@Pc(171) int local171;
		if (Static420.aClass127Array6 != null) {
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			local55 = arg0.BA();
			local64 = (arg2 - Static232.anInt5900) * local55 / Static263.anInt5058;
			local73 = (arg1 - Static117.anInt2730) * local55 / Static280.anInt5293;
			local76 = arg0.U();
			local85 = (arg2 - Static232.anInt5900) * local76 / Static263.anInt5058;
			local94 = local76 * (arg1 - Static117.anInt2730) / Static280.anInt5293;
			@Pc(109) int[] local109 = new int[] { local64, local73, local55 };
			local35.YA(local109);
			local127 = new int[] { local85, local94, local76 };
			local35.YA(local127);
			@Pc(132) float local132 = 0.0F;
			local141 = local127[0] - local109[0];
			local149 = local127[1] - local109[1];
			local158 = local127[2] - local109[2];
			while (local132 < 1.0F) {
				local171 = (int) ((float) local109[0] + (float) local141 * local132);
				@Pc(175) int local175 = local171 >> 9;
				@Pc(186) int local186 = (int) ((float) local158 * local132 + (float) local109[2]);
				@Pc(190) int local190 = local186 >> 9;
				if (local175 > 0 && local190 > 0 && local175 < Static345.anInt6228 && local190 < Static535.anInt9341) {
					@Pc(210) int local210 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117;
					if (local210 < 3 && (Static428.aByteArrayArrayArray4[1][local175][local190] & 0x2) != 0) {
						local210++;
					}
					if ((float) Static420.aClass127Array6[local210].method7860(local186, local171) < (float) local109[1] + local132 * (float) local149) {
						local50 = (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.method6668() - 1 << 8) + local171 >> 9;
						local52 = local186 + (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.method6668() - 1 << 8) >> 9;
						break;
					}
				}
				local132 = (float) ((double) local132 + 0.01D);
			}
			if (local50 != -1 && local52 != -1) {
				if (Static253.aBoolean325 && (Static182.anInt3987 & 0x40) != 0) {
					@Pc(331) Class251 local331 = Static137.method2669(Static164.anInt3670, Static149.anInt3464);
					if (local331 == null) {
						Static213.method3571();
					} else {
						Static367.method5215(local52, -1, Static421.aString201, " ->", true, 15, false, 0L, local50, Static455.anInt7961);
					}
				} else {
					if (Static100.aBoolean637) {
						Static367.method5215(local52, -1, Static573.aClass350_31.method7730(Static201.anInt4321), "", true, 3, false, 0L, local50, -1);
					}
					Static367.method5215(local52, -1, Static19.aString10, "", true, 6, false, 0L, local50, Static580.anInt10050);
				}
			}
		}
		@Pc(355) Class269 local355 = Static545.aClass269_10;
		for (@Pc(360) Class25_Sub10 local360 = (Class25_Sub10) local355.method5974(); local360 != null; local360 = (Class25_Sub10) local355.method5979()) {
			if ((Static98.aBoolean176 || Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117 == local360.aClass25_Sub2_2.aByte117) && local360.method5310(arg1, arg2, arg0)) {
				if (local360.aClass25_Sub2_2 instanceof Class25_Sub2_Sub2) {
					local64 = ((Class25_Sub2_Sub2) local360.aClass25_Sub2_2).aShort107;
					local55 = ((Class25_Sub2_Sub2) local360.aClass25_Sub2_2).aShort106;
				} else {
					local55 = local360.aClass25_Sub2_2.anInt8476 >> 9;
					local64 = local360.aClass25_Sub2_2.anInt8482 >> 9;
				}
				@Pc(484) int local484;
				@Pc(599) int local599;
				if (local360.aClass25_Sub2_2 instanceof Class25_Sub2_Sub2_Sub5_Sub1) {
					@Pc(421) Class25_Sub2_Sub2_Sub5_Sub1 local421 = (Class25_Sub2_Sub2_Sub5_Sub1) local360.aClass25_Sub2_2;
					local76 = local421.method6668();
					if ((local76 & 0x1) == 0 && (local421.anInt8476 & 0x1FF) == 0 && (local421.anInt8482 & 0x1FF) == 0 || (local76 & 0x1) == 1 && (local421.anInt8476 & 0x1FF) == 256 && (local421.anInt8482 & 0x1FF) == 256) {
						local85 = local421.anInt8476 - (local421.method6668() - 1 << 8);
						local94 = local421.anInt8482 - (local421.method6668() - 1 << 8);
						for (local484 = 0; local484 < Static60.anInt1599; local484++) {
							@Pc(495) Class3_Sub39 local495 = (Class3_Sub39) Static581.aClass297_39.method6531((long) Static529.anIntArray535[local484]);
							if (local495 != null) {
								@Pc(500) Class25_Sub2_Sub2_Sub5_Sub2 local500 = local495.aClass25_Sub2_Sub2_Sub5_Sub2_2;
								if (Static397.anInt6998 != local500.anInt8554 && local500.aBoolean578) {
									local141 = local500.anInt8476 - (local500.aClass213_1.anInt6196 - 1 << 8);
									local149 = local500.anInt8482 - (local500.aClass213_1.anInt6196 - 1 << 8);
									if (local85 <= local141 && local500.aClass213_1.anInt6196 <= local421.method6668() - (local141 - local85 >> 9) && local94 <= local149 && local500.aClass213_1.anInt6196 <= local421.method6668() - (local149 - local94 >> 9)) {
										Static145.method2772(local500, local360.aClass25_Sub2_2.aByte117 != Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117);
										local500.anInt8554 = Static397.anInt6998;
									}
								}
							}
						}
						local599 = Static31.anInt499;
						@Pc(601) int[] local601 = Static315.anIntArray279;
						for (local141 = 0; local141 < local599; local141++) {
							@Pc(611) Class25_Sub2_Sub2_Sub5_Sub1 local611 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local601[local141]];
							if (local611 != null && Static397.anInt6998 != local611.anInt8554 && local421 != local611 && local611.aBoolean578) {
								local158 = local611.anInt8476 - (local611.method6668() - 1 << 8);
								local171 = local611.anInt8482 - (local611.method6668() - 1 << 8);
								if (local85 <= local158 && local611.method6668() <= local421.method6668() - (local158 - local85 >> 9) && local171 >= local94 && local611.method6668() <= local421.method6668() - (local171 - local94 >> 9)) {
									Static483.method6565(local360.aClass25_Sub2_2.aByte117 != Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117, local611);
									local611.anInt8554 = Static397.anInt6998;
								}
							}
						}
					}
					if (local421.anInt8554 == Static397.anInt6998) {
						continue;
					}
					Static483.method6565(Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117 != local360.aClass25_Sub2_2.aByte117, local421);
					local421.anInt8554 = Static397.anInt6998;
				}
				@Pc(863) int local863;
				if (local360.aClass25_Sub2_2 instanceof Class25_Sub2_Sub2_Sub5_Sub2) {
					@Pc(746) Class25_Sub2_Sub2_Sub5_Sub2 local746 = (Class25_Sub2_Sub2_Sub5_Sub2) local360.aClass25_Sub2_2;
					if (local746.aClass213_1 != null) {
						if ((local746.aClass213_1.anInt6196 & 0x1) == 0 && (local746.anInt8476 & 0x1FF) == 0 && (local746.anInt8482 & 0x1FF) == 0 || (local746.aClass213_1.anInt6196 & 0x1) == 1 && (local746.anInt8476 & 0x1FF) == 256 && (local746.anInt8482 & 0x1FF) == 256) {
							local76 = local746.anInt8476 - (local746.aClass213_1.anInt6196 - 1 << 8);
							local85 = local746.anInt8482 - (local746.aClass213_1.anInt6196 - 1 << 8);
							for (local94 = 0; local94 < Static60.anInt1599; local94++) {
								@Pc(831) Class3_Sub39 local831 = (Class3_Sub39) Static581.aClass297_39.method6531((long) Static529.anIntArray535[local94]);
								if (local831 != null) {
									@Pc(836) Class25_Sub2_Sub2_Sub5_Sub2 local836 = local831.aClass25_Sub2_Sub2_Sub5_Sub2_2;
									if (local836.anInt8554 != Static397.anInt6998 && local836 != local746 && local836.aBoolean578) {
										local863 = local836.anInt8476 - (local836.aClass213_1.anInt6196 - 1 << 8);
										local141 = local836.anInt8482 - (local836.aClass213_1.anInt6196 - 1 << 8);
										if (local863 >= local76 && local746.aClass213_1.anInt6196 - (local863 - local76 >> 9) >= local836.aClass213_1.anInt6196 && local85 <= local141 && local836.aClass213_1.anInt6196 <= local746.aClass213_1.anInt6196 - (local141 - local85 >> 9)) {
											Static145.method2772(local836, local360.aClass25_Sub2_2.aByte117 != Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117);
											local836.anInt8554 = Static397.anInt6998;
										}
									}
								}
							}
							local484 = Static31.anInt499;
							local127 = Static315.anIntArray279;
							for (local863 = 0; local863 < local484; local863++) {
								@Pc(950) Class25_Sub2_Sub2_Sub5_Sub1 local950 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local127[local863]];
								if (local950 != null && Static397.anInt6998 != local950.anInt8554 && local950.aBoolean578) {
									local149 = local950.anInt8476 - (local950.method6668() - 1 << 8);
									local158 = local950.anInt8482 - (local950.method6668() - 1 << 8);
									if (local76 <= local149 && local950.method6668() <= local746.aClass213_1.anInt6196 - (local149 - local76 >> 9) && local85 <= local158 && local950.method6668() <= local746.aClass213_1.anInt6196 - (local158 - local85 >> 9)) {
										Static483.method6565(local360.aClass25_Sub2_2.aByte117 != Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117, local950);
										local950.anInt8554 = Static397.anInt6998;
									}
								}
							}
						}
						if (Static397.anInt6998 == local746.anInt8554) {
							continue;
						}
						Static145.method2772(local746, Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117 != local360.aClass25_Sub2_2.aByte117);
						local746.anInt8554 = Static397.anInt6998;
					}
				}
				if (local360.aClass25_Sub2_2 instanceof Class25_Sub2_Sub4_Sub1) {
					local73 = local55 + Static321.anInt5874;
					local76 = local64 + Static137.anInt3293;
					@Pc(1115) Class3_Sub4 local1115 = (Class3_Sub4) Static537.aClass297_34.method6531((long) (local76 << 14 | local360.aClass25_Sub2_2.aByte117 << 28 | local73));
					if (local1115 != null) {
						for (@Pc(1123) Class3_Sub31 local1123 = (Class3_Sub31) local1115.aClass244_1.method5577(); local1123 != null; local1123 = (Class3_Sub31) local1115.aClass244_1.method5574()) {
							@Pc(1131) Class133 local1131 = Static272.aClass121_2.method3327(local1123.anInt5292);
							if (Static253.aBoolean325 && local360.aClass25_Sub2_2.aByte117 == Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117) {
								@Pc(1153) Class41 local1153 = Static191.anInt4131 == -1 ? null : Static106.aClass27_1.method483(Static191.anInt4131);
								if ((Static182.anInt3987 & 0x1) != 0 && (local1153 == null || local1131.method3549(local1153.anInt1311, Static191.anInt4131) != local1153.anInt1311)) {
									Static367.method5215(local64, -1, Static421.aString201, Static238.aString114 + " -> <col=ff9040>" + local1131.aString106, true, 23, false, (long) local1123.anInt5292, local55, Static455.anInt7961);
								}
							}
							if (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117 == local360.aClass25_Sub2_2.aByte117) {
								@Pc(1212) String[] local1212 = local1131.aStringArray18;
								for (local863 = 4; local863 >= 0; local863--) {
									if (local1212 != null && local1212[local863] != null) {
										@Pc(1224) byte local1224 = 0;
										if (local863 == 0) {
											local1224 = 44;
										}
										local149 = Static473.anInt8220;
										if (local863 == 1) {
											local1224 = 21;
										}
										if (local863 == 2) {
											local1224 = 13;
										}
										if (local863 == 3) {
											local1224 = 30;
										}
										if (local863 == local1131.anInt4430) {
											local149 = local1131.anInt4406;
										}
										if (local863 == 4) {
											local1224 = 11;
										}
										if (local1131.anInt4400 == local863) {
											local149 = local1131.anInt4416;
										}
										Static367.method5215(local64, -1, local1212[local863], "<col=ff9040>" + local1131.aString106, true, local1224, false, (long) local1123.anInt5292, local55, local149);
									}
								}
							}
							Static367.method5215(local64, -1, Static573.aClass350_26.method7730(Static201.anInt4321), "<col=ff9040>" + local1131.aString106, true, 1009, Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117 != local360.aClass25_Sub2_2.aByte117, (long) local1123.anInt5292, local55, Static496.anInt8607);
						}
					}
				}
				if (local360.aClass25_Sub2_2 instanceof Interface14) {
					@Pc(1355) Interface14 local1355 = (Interface14) local360.aClass25_Sub2_2;
					@Pc(1362) Class194 local1362 = Static536.aClass146_4.method3721(local1355.method4958());
					if (local1362.anIntArray286 != null) {
						local1362 = local1362.method4696(Static206.aClass143_3);
					}
					if (local1362 != null) {
						if (Static253.aBoolean325 && Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117 == local360.aClass25_Sub2_2.aByte117) {
							@Pc(1391) Class41 local1391 = Static191.anInt4131 == -1 ? null : Static106.aClass27_1.method483(Static191.anInt4131);
							if ((Static182.anInt3987 & 0x4) != 0 && (local1391 == null || local1362.method4694(Static191.anInt4131, local1391.anInt1311) != local1391.anInt1311)) {
								Static367.method5215(local64, -1, Static421.aString201, Static238.aString114 + " -> <col=00ffff>" + local1362.aString154, true, 50, false, Static561.method7673(local1355, local64, local55), local55, Static455.anInt7961);
							}
						}
						if (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117 == local360.aClass25_Sub2_2.aByte117) {
							@Pc(1445) String[] local1445 = local1362.aStringArray25;
							if (local1445 != null) {
								for (local94 = 4; local94 >= 0; local94--) {
									if (local1445[local94] != null) {
										@Pc(1457) short local1457 = 0;
										local599 = Static473.anInt8220;
										if (local94 == 0) {
											local1457 = 10;
										}
										if (local94 == 1) {
											local1457 = 48;
										}
										if (local94 == 2) {
											local1457 = 17;
										}
										if (local94 == 3) {
											local1457 = 20;
										}
										if (local94 == 4) {
											local1457 = 1007;
										}
										if (local1362.anInt5798 == local94) {
											local599 = local1362.anInt5846;
										}
										if (local94 == local1362.anInt5802) {
											local599 = local1362.anInt5801;
										}
										Static367.method5215(local64, -1, local1445[local94], "<col=00ffff>" + local1362.aString154, true, local1457, false, Static561.method7673(local1355, local64, local55), local55, local599);
									}
								}
							}
						}
						Static367.method5215(local64, -1, Static573.aClass350_26.method7730(Static201.anInt4321), "<col=00ffff>" + local1362.aString154, true, 1002, Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117 != local360.aClass25_Sub2_2.aByte117, (long) local1362.anInt5827, local55, Static496.anInt8607);
					}
				}
			}
		}
	}
}
