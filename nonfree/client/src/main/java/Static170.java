import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!g", name = "s", descriptor = "Lclient!jg;")
	public static Class174 aClass174_4;

	@OriginalMember(owner = "client!g", name = "u", descriptor = "F")
	public static float aFloat72;

	@OriginalMember(owner = "client!g", name = "o", descriptor = "Lclient!maa;")
	public static final Class215 aClass215_3 = new Class215(4, 5);

	@OriginalMember(owner = "client!g", name = "p", descriptor = "Lclient!cj;")
	public static final Class54 aClass54_1 = new Class54();

	@OriginalMember(owner = "client!g", name = "q", descriptor = "F")
	public static float aFloat71 = 0.0F;

	@OriginalMember(owner = "client!g", name = "t", descriptor = "Lclient!st;")
	public static final Class314 aClass314_55 = new Class314(45, 6);

	@OriginalMember(owner = "client!g", name = "v", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZII)Z")
	public static boolean method2821(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static630.method8524(arg0, arg1) | (arg0 & 0x60000) != 0 || Static505.method7347(arg0, arg1) || Static130.method2305(arg1, arg0);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
	public static void method2822(@OriginalArg(0) int arg0) {
		Static491.anInt8354 = arg0;
		Static503.aClass136_57.method3142();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!ha;BI)V")
	public static void method2823(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 0 || arg2 < 0 || Static200.anInt3737 == 0 || Static147.anInt3005 == 0) {
			return;
		}
		@Pc(33) Class31 local33;
		@Pc(52) int local52;
		@Pc(48) int local48;
		@Pc(44) int local44;
		@Pc(40) int local40;
		@Pc(58) int local58;
		@Pc(64) int local64;
		if (Static80.aBoolean118) {
			Static53.method975(false);
			local33 = arg1.method6174();
			@Pc(36) int[] local36 = arg1.Y();
			local40 = local36[3];
			local44 = local36[2];
			local48 = local36[1];
			local52 = local36[0];
			local58 = arg0 + Static629.method8522(false);
			local64 = arg2 + Static127.method2250(false);
		} else {
			arg1.DA(Static348.anInt6498, Static573.anInt6751, Static200.anInt3737, Static147.anInt3005);
			local40 = Static147.anInt3005;
			local48 = Static573.anInt6751;
			local44 = Static200.anInt3737;
			local52 = Static348.anInt6498;
			arg1.KA(Static291.anInt5615, Static518.anInt8728, Static200.anInt3737, Static147.anInt3005);
			local33 = arg1.method6170();
			local33.method7919(Static390.anInt6995, Static505.anInt8528, Static437.anInt7594, Static647.anInt10293, Static422.anInt7631, Static541.anInt9075);
			arg1.method6160(local33);
			local64 = arg2;
			local58 = arg0;
		}
		if (local44 == 0) {
			local44 = 1;
		}
		if (local40 == 0) {
			local40 = 1;
		}
		Static220.method3852(true);
		@Pc(142) int local142;
		@Pc(153) int local153;
		@Pc(162) int local162;
		@Pc(279) int local279;
		@Pc(288) int local288;
		@Pc(299) int local299;
		@Pc(310) int local310;
		@Pc(134) int local134;
		@Pc(360) int local360;
		if (Static518.aClass91Array2 != null && (!Static425.aBoolean536 || (Static95.anInt1910 & 0x40) != 0)) {
			local134 = -1;
			@Pc(136) int local136 = -1;
			@Pc(139) int local139 = arg1.i();
			local142 = arg1.XA();
			@Pc(179) int local179;
			@Pc(171) int local171;
			if (Static40.aBoolean34) {
				local179 = local162 = (local64 - local48) * Static562.anInt9327 / local40;
				local153 = local171 = (local58 - local52) * Static562.anInt9327 / local44;
			} else {
				local153 = local139 * (local58 - local52) / local44;
				local162 = (local64 - local48) * local142 / local40;
				local171 = local142 * (local58 - local52) / local44;
				local179 = local139 * (local64 - local48) / local40;
			}
			@Pc(217) int[] local217 = new int[] { local153, local179, local139 };
			local33.method7928(local217);
			@Pc(235) int[] local235 = new int[] { local171, local162, local142 };
			local33.method7928(local235);
			@Pc(266) float local266 = Static325.method1550((float) local235[2], 4, (float) local235[0], (float) local217[0], (float) local217[2], (float) local217[1], (float) local235[1]);
			if (local266 > 0.0F) {
				local279 = local235[0] - local217[0];
				local288 = local235[2] - local217[2];
				local299 = (int) ((float) local217[0] + local266 * (float) local279);
				local310 = (int) ((float) local288 * local266 + (float) local217[2]);
				local134 = (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.method8619() - 1 << 8) + local299 >> 9;
				local136 = (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.method8619() - 1 << 8) + local310 >> 9;
				@Pc(337) byte local337 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127;
				if (local337 < 3 && (Static546.aByteArrayArrayArray18[1][local299 >> 9][local310 >> 9] & 0x2) != 0) {
					local360 = local337 + 1;
				}
			}
			if (local134 != -1 && local136 != -1) {
				if (Static425.aBoolean536 && (Static95.anInt1910 & 0x40) != 0) {
					@Pc(430) Class344 local430 = Static258.method4328(Static491.anInt8353, Static260.anInt5074);
					if (local430 == null) {
						Static409.method6364();
					} else {
						Static139.method2380(true, Static551.anInt9151, false, -1, " ->", (long) (local136 | local134 << 0), true, local136, 0L, local134, 58, Static323.aString46);
					}
				} else {
					if (Static142.aBoolean696) {
						Static139.method2380(true, -1, false, -1, "", (long) (local136 | local134 << 0), true, local136, 0L, local134, 59, Static369.aClass235_30.method5893(Static455.anInt7738));
					}
					Static139.method2380(true, Static90.anInt8334, false, -1, "", (long) (local136 | local134 << 0), true, local136, 0L, local134, 8, Static461.aString68);
				}
			}
		}
		if (Static80.aBoolean118) {
			Static645.method8655();
		}
		for (local134 = 0; (Static80.aBoolean118 ? 2 : 1) > local134; local134++) {
			@Pc(472) boolean local472 = local134 == 0;
			@Pc(478) Class47 local478 = local472 ? Static460.aClass47_3 : Static172.aClass47_1;
			local142 = arg0;
			local153 = arg2;
			if (Static80.aBoolean118) {
				Static53.method975(local472);
				local142 = arg0 + Static629.method8522(local472);
				local153 = arg2 + Static127.method2250(local472);
			}
			@Pc(502) Class139 local502 = local478.aClass139_1;
			for (@Pc(507) Class9_Sub10 local507 = (Class9_Sub10) local502.method3198(); local507 != null; local507 = (Class9_Sub10) local502.method3205()) {
				if ((Static226.aBoolean336 || Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127 == local507.aClass9_Sub2_22.aByte127) && local507.method7967(local142, arg1, local153)) {
					@Pc(538) int local538;
					if (local507.aClass9_Sub2_22 instanceof Class9_Sub2_Sub1) {
						local162 = ((Class9_Sub2_Sub1) local507.aClass9_Sub2_22).aShort126;
						local538 = ((Class9_Sub2_Sub1) local507.aClass9_Sub2_22).aShort124;
					} else {
						local538 = local507.aClass9_Sub2_22.anInt10158 >> 9;
						local162 = local507.aClass9_Sub2_22.anInt10152 >> 9;
					}
					@Pc(668) int local668;
					@Pc(680) int local680;
					@Pc(785) int local785;
					@Pc(568) int local568;
					if (local507.aClass9_Sub2_22 instanceof Class9_Sub2_Sub1_Sub2_Sub1) {
						@Pc(564) Class9_Sub2_Sub1_Sub2_Sub1 local564 = (Class9_Sub2_Sub1_Sub2_Sub1) local507.aClass9_Sub2_22;
						local568 = local564.method8619();
						if ((local568 & 0x1) == 0 && (local564.anInt10152 & 0x1FF) == 0 && (local564.anInt10158 & 0x1FF) == 0 || (local568 & 0x1) == 1 && (local564.anInt10152 & 0x1FF) == 256 && (local564.anInt10158 & 0x1FF) == 256) {
							local279 = local564.anInt10152 - (local564.method8619() - 1 << 8);
							local288 = local564.anInt10158 - (local564.method8619() - 1 << 8);
							for (local299 = 0; local299 < Static596.anInt9702; local299++) {
								@Pc(642) Class3_Sub43 local642 = (Class3_Sub43) Static545.aClass25_40.method426((long) Static43.anIntArray50[local299]);
								if (local642 != null) {
									@Pc(647) Class9_Sub2_Sub1_Sub2_Sub2 local647 = local642.aClass9_Sub2_Sub1_Sub2_Sub2_2;
									if (Static304.anInt8391 != local647.anInt10205 && local647.aBoolean772) {
										local668 = local647.anInt10152 - (local647.aClass309_1.anInt8833 - 1 << 8);
										local680 = local647.anInt10158 - (local647.aClass309_1.anInt8833 - 1 << 8);
										if (local279 <= local668 && local647.aClass309_1.anInt8833 <= local564.method8619() - (local668 - local279 >> 9) && local288 <= local680 && local647.aClass309_1.anInt8833 <= local564.method8619() - (local680 - local288 >> 9)) {
											Static647.method8676(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127 != local507.aClass9_Sub2_22.aByte127, local647);
											local647.anInt10205 = Static304.anInt8391;
										}
									}
								}
							}
							local310 = Static174.anInt3362;
							@Pc(750) int[] local750 = Static495.anIntArray529;
							for (local668 = 0; local668 < local310; local668++) {
								@Pc(760) Class9_Sub2_Sub1_Sub2_Sub1 local760 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local750[local668]];
								if (local760 != null && local760.anInt10205 != Static304.anInt8391 && local760 != local564 && local760.aBoolean772) {
									local785 = local760.anInt10152 - (local760.method8619() - 1 << 8);
									@Pc(796) int local796 = local760.anInt10158 - (local760.method8619() - 1 << 8);
									if (local279 <= local785 && local760.method8619() <= local564.method8619() - (local785 - local279 >> 9) && local796 >= local288 && local760.method8619() <= local564.method8619() - (local796 - local288 >> 9)) {
										Static102.method1713(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127 != local507.aClass9_Sub2_22.aByte127, local760);
										local760.anInt10205 = Static304.anInt8391;
									}
								}
							}
						}
						if (Static304.anInt8391 == local564.anInt10205) {
							continue;
						}
						Static102.method1713(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127 != local507.aClass9_Sub2_22.aByte127, local564);
						local564.anInt10205 = Static304.anInt8391;
					}
					if (local507.aClass9_Sub2_22 instanceof Class9_Sub2_Sub1_Sub2_Sub2) {
						@Pc(892) Class9_Sub2_Sub1_Sub2_Sub2 local892 = (Class9_Sub2_Sub1_Sub2_Sub2) local507.aClass9_Sub2_22;
						if (local892.aClass309_1 != null) {
							if ((local892.aClass309_1.anInt8833 & 0x1) == 0 && (local892.anInt10152 & 0x1FF) == 0 && (local892.anInt10158 & 0x1FF) == 0 || (local892.aClass309_1.anInt8833 & 0x1) == 1 && (local892.anInt10152 & 0x1FF) == 256 && (local892.anInt10158 & 0x1FF) == 256) {
								local568 = local892.anInt10152 - (local892.aClass309_1.anInt8833 - 1 << 8);
								local279 = local892.anInt10158 - (local892.aClass309_1.anInt8833 - 1 << 8);
								for (local288 = 0; local288 < Static596.anInt9702; local288++) {
									@Pc(975) Class3_Sub43 local975 = (Class3_Sub43) Static545.aClass25_40.method426((long) Static43.anIntArray50[local288]);
									if (local975 != null) {
										@Pc(980) Class9_Sub2_Sub1_Sub2_Sub2 local980 = local975.aClass9_Sub2_Sub1_Sub2_Sub2_2;
										if (local980.anInt10205 != Static304.anInt8391 && local980 != local892 && local980.aBoolean772) {
											local360 = local980.anInt10152 - (local980.aClass309_1.anInt8833 - 1 << 8);
											local668 = local980.anInt10158 - (local980.aClass309_1.anInt8833 - 1 << 8);
											if (local360 >= local568 && local980.aClass309_1.anInt8833 <= local892.aClass309_1.anInt8833 - (local360 - local568 >> 9) && local279 <= local668 && local980.aClass309_1.anInt8833 <= local892.aClass309_1.anInt8833 - (local668 - local279 >> 9)) {
												Static647.method8676(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127 != local507.aClass9_Sub2_22.aByte127, local980);
												local980.anInt10205 = Static304.anInt8391;
											}
										}
									}
								}
								local299 = Static174.anInt3362;
								@Pc(1093) int[] local1093 = Static495.anIntArray529;
								for (local360 = 0; local360 < local299; local360++) {
									@Pc(1103) Class9_Sub2_Sub1_Sub2_Sub1 local1103 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local1093[local360]];
									if (local1103 != null && local1103.anInt10205 != Static304.anInt8391 && local1103.aBoolean772) {
										local680 = local1103.anInt10152 - (local1103.method8619() - 1 << 8);
										local785 = local1103.anInt10158 - (local1103.method8619() - 1 << 8);
										if (local680 >= local568 && local1103.method8619() <= local892.aClass309_1.anInt8833 - (local680 - local568 >> 9) && local279 <= local785 && local1103.method8619() <= local892.aClass309_1.anInt8833 - (local785 - local279 >> 9)) {
											Static102.method1713(local507.aClass9_Sub2_22.aByte127 != Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127, local1103);
											local1103.anInt10205 = Static304.anInt8391;
										}
									}
								}
							}
							if (Static304.anInt8391 == local892.anInt10205) {
								continue;
							}
							Static647.method8676(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127 != local507.aClass9_Sub2_22.aByte127, local892);
							local892.anInt10205 = Static304.anInt8391;
						}
					}
					if (local507.aClass9_Sub2_22 instanceof Class9_Sub2_Sub2_Sub1) {
						@Pc(1239) int local1239 = Static427.anInt7462 + local162;
						local568 = local538 + Static22.anInt329;
						@Pc(1261) Class3_Sub25 local1261 = (Class3_Sub25) Static39.aClass25_8.method426((long) (local1239 | local507.aClass9_Sub2_22.aByte127 << 28 | local568 << 14));
						if (local1261 != null) {
							local288 = 0;
							for (@Pc(1271) Class3_Sub32 local1271 = (Class3_Sub32) local1261.aClass216_44.method5456(); local1271 != null; local1271 = (Class3_Sub32) local1261.aClass216_44.method5459()) {
								@Pc(1279) Class259 local1279 = Static298.aClass132_1.method3062(local1271.anInt5954);
								if (Static425.aBoolean536 && local507.aClass9_Sub2_22.aByte127 == Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127) {
									@Pc(1297) Class108 local1297 = Static632.anInt10065 == -1 ? null : Static220.aClass214_2.method5419(Static632.anInt10065);
									if ((Static95.anInt1910 & 0x1) != 0 && (local1297 == null || local1279.method6450(local1297.anInt3158, Static632.anInt10065) != local1297.anInt3158)) {
										Static139.method2380(true, Static551.anInt9151, false, -1, Static372.aString48 + " -> <col=ff9040>" + local1279.aString63, (long) local288, false, local538, (long) local1271.anInt5954, local162, 46, Static323.aString46);
									}
								}
								if (local507.aClass9_Sub2_22.aByte127 == Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127) {
									@Pc(1359) String[] local1359 = local1279.aStringArray59;
									for (local668 = 4; local668 >= 0; local668--) {
										if (local1359 != null && local1359[local668] != null) {
											@Pc(1371) byte local1371 = 0;
											if (local668 == 0) {
												local1371 = 12;
											}
											local785 = Static299.anInt5924;
											if (local668 == 1) {
												local1371 = 47;
											}
											if (local668 == 2) {
												local1371 = 6;
											}
											if (local668 == 3) {
												local1371 = 25;
											}
											if (local1279.anInt7348 == local668) {
												local785 = local1279.anInt7387;
											}
											if (local668 == 4) {
												local1371 = 49;
											}
											if (local1279.anInt7351 == local668) {
												local785 = local1279.anInt7383;
											}
											Static139.method2380(true, local785, false, -1, "<col=ff9040>" + local1279.aString63, (long) local288, false, local538, (long) local1271.anInt5954, local162, local1371, local1359[local668]);
										}
									}
								}
								Static139.method2380(true, Static135.anInt2826, local507.aClass9_Sub2_22.aByte127 != Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127, -1, "<col=ff9040>" + local1279.aString63, (long) local288, false, local538, (long) local1271.anInt5954, local162, 1003, Static369.aClass235_25.method5893(Static455.anInt7738));
								local288++;
							}
						}
					}
					if (local507.aClass9_Sub2_22 instanceof Interface2) {
						@Pc(1512) Interface2 local1512 = (Interface2) local507.aClass9_Sub2_22;
						@Pc(1519) Class330 local1519 = Static370.aClass284_3.method6915(local1512.method7500());
						if (local1519.anIntArray581 != null) {
							local1519 = local1519.method7892(Static183.aClass285_1);
						}
						if (local1519 != null) {
							if (Static425.aBoolean536 && Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127 == local507.aClass9_Sub2_22.aByte127) {
								@Pc(1552) Class108 local1552 = Static632.anInt10065 == -1 ? null : Static220.aClass214_2.method5419(Static632.anInt10065);
								if ((Static95.anInt1910 & 0x4) != 0 && (local1552 == null || local1519.method7896(local1552.anInt3158, Static632.anInt10065) != local1552.anInt3158)) {
									Static139.method2380(true, Static551.anInt9151, false, -1, Static372.aString48 + " -> <col=00ffff>" + local1519.aString87, (long) local1512.hashCode(), false, local538, Static185.method3034(local162, local538, local1512), local162, 20, Static323.aString46);
								}
							}
							if (local507.aClass9_Sub2_22.aByte127 == Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127) {
								@Pc(1614) String[] local1614 = local1519.aStringArray74;
								if (local1614 != null) {
									for (local288 = 4; local288 >= 0; local288--) {
										if (local1614[local288] != null) {
											@Pc(1626) short local1626 = 0;
											local310 = Static299.anInt5924;
											if (local288 == 0) {
												local1626 = 23;
											}
											if (local288 == 1) {
												local1626 = 19;
											}
											if (local288 == 2) {
												local1626 = 16;
											}
											if (local288 == 3) {
												local1626 = 57;
											}
											if (local288 == local1519.anInt9204) {
												local310 = local1519.anInt9196;
											}
											if (local288 == 4) {
												local1626 = 1001;
											}
											if (local1519.anInt9241 == local288) {
												local310 = local1519.anInt9198;
											}
											Static139.method2380(true, local310, false, -1, "<col=00ffff>" + local1519.aString87, (long) local1512.hashCode(), false, local538, Static185.method3034(local162, local538, local1512), local162, local1626, local1614[local288]);
										}
									}
								}
								Static139.method2380(true, Static135.anInt2826, local507.aClass9_Sub2_22.aByte127 != Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127, -1, "<col=00ffff>" + local1519.aString87, (long) local1512.hashCode(), false, local538, (long) local1519.anInt9240, local162, 1009, Static369.aClass235_25.method5893(Static455.anInt7738));
							}
						}
					}
				}
			}
			if (Static80.aBoolean118) {
				Static645.method8655();
			}
		}
		Static220.method3852(false);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2824(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static474.anInt8118 <= arg3 && arg1 <= Static576.anInt9425 && arg0 >= Static298.anInt5919 && arg6 <= Static596.anInt9703) {
			Static66.method1165(arg0, arg5, arg1, arg4, arg3, arg6, arg2);
		} else {
			Static180.method2955(arg3, arg2, arg1, arg5, arg6, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!d;Lclient!uu;I)V")
	public static void method2825(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Class343 arg1) {
		Static549.anInterface5_11 = arg0;
		Static82.aClass343_46 = arg1;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	public static void method2827() {
		Static229.anInt4626 = 0;
		Static38.anInt732 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static515.anInt8713; local11++) {
			@Pc(17) int local17 = Static492.anInt8358 * local11;
			for (@Pc(19) int local19 = 0; local19 < Static492.anInt8358; local19++) {
				@Pc(26) int local26 = local17 + local19;
				Static494.anInterface7Array1[local26].method8436(local19 * Static557.anInt9256, Static126.anInt2688 * local11, Static557.anInt9256, Static126.anInt2688, true);
			}
		}
	}
}
