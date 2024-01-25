import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cca", name = "d", descriptor = "Lclient!cr;")
	public static Class51 aClass51_34;

	@OriginalMember(owner = "client!cca", name = "e", descriptor = "Lclient!pq;")
	public static Class265 aClass265_33;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method8559(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static644.anInt10532; local16++) {
			if (arg0.equalsIgnoreCase(Static552.aStringArray39[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static330.aStringArray27[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(III)Lclient!wn;")
	public static Class3_Sub1_Sub21 method8561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Class3_Sub1_Sub21 local20 = (Class3_Sub1_Sub21) Static631.aClass307_53.method7424((long) arg1 << 32 | (long) arg0);
		if (local20 == null) {
			local20 = new Class3_Sub1_Sub21(arg1, arg0);
			Static631.aClass307_53.method7425(local20.aLong277, local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lclient!ha;II)Z")
	public static boolean method8562(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = (Static394.anInt7540 - 104) / 2;
		@Pc(17) int local17 = (Static462.anInt8391 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(42) int local42;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static394.method6311(local21, arg1, local29, local25)) {
						local42 = local29;
						if (Static525.method7485(local25, local21)) {
							local42 = local29 - 1;
						}
						if (local42 >= 0) {
							local19 &= Static587.method8066(local21, local25, local42);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(90) int[] local90 = new int[262144];
		for (local29 = 0; local29 < local90.length; local29++) {
			local90[local29] = -16777216;
		}
		Static497.aClass5_36 = arg0.method6204(512, 512, local90, 512);
		Static141.method3161();
		local42 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + 238 - 10 | 0xFF000000;
		@Pc(159) int local159 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xCB9EFF00) << 16;
		@Pc(178) int local178 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
		@Pc(195) boolean[][] local195 = new boolean[Static231.anInt5228 + 2 + 1][Static231.anInt5228 + 1 + 2];
		@Pc(201) int local201;
		@Pc(205) int local205;
		@Pc(207) int local207;
		@Pc(209) int local209;
		@Pc(215) int local215;
		@Pc(222) int local222;
		@Pc(233) int local233;
		@Pc(258) int local258;
		@Pc(262) int local262;
		@Pc(316) int local316;
		@Pc(323) int local323;
		@Pc(327) int local327;
		@Pc(352) int local352;
		for (@Pc(197) int local197 = local11; local197 < local11 + 104; local197 += Static231.anInt5228) {
			for (local201 = local17; local201 < local17 + 104; local201 += Static231.anInt5228) {
				local205 = 0;
				local207 = 0;
				local209 = local197;
				if (local197 > 0) {
					local205 += 4;
					local209 = local197 - 1;
				}
				local215 = local201;
				if (local201 > 0) {
					local215 = local201 - 1;
				}
				local222 = Static231.anInt5228 + local197;
				if (local222 < 104) {
					local222++;
				}
				local233 = local201 + Static231.anInt5228;
				if (local233 < 104) {
					local207 += 4;
					local233++;
				}
				arg0.KA(0, 0, Static231.anInt5228 * 4 + local205, local207 - -(Static231.anInt5228 * 4));
				arg0.GA(-16777216);
				@Pc(266) int local266;
				for (local258 = arg1; local258 <= 3; local258++) {
					for (local262 = 0; local262 <= Static231.anInt5228; local262++) {
						for (local266 = 0; local266 <= Static231.anInt5228; local266++) {
							local195[local262][local266] = Static394.method6311(local209 + local262, arg1, local258, local215 + local266);
						}
					}
					Static445.aClass274Array1[local258].method8036(local209, local215, local222, local233, local195);
					if (!Static539.aBoolean784) {
						for (local266 = -4; local266 < Static231.anInt5228; local266++) {
							for (local316 = -4; local316 < Static231.anInt5228; local316++) {
								local323 = local197 + local266;
								local327 = local201 + local316;
								if (local11 <= local323 && local17 <= local327 && Static394.method6311(local323, arg1, local258, local327)) {
									local352 = local258;
									if (Static525.method7485(local327, local323)) {
										local352 = local258 - 1;
									}
									if (local352 >= 0) {
										Static103.method2561(arg0, local207 + (Static231.anInt5228 - local316) * 4 - 4, local159, local352, local323, local327, local42, local205 + local266 * 4);
									}
								}
							}
						}
					}
				}
				if (Static539.aBoolean784) {
					@Pc(408) Class291 local408 = Static334.aClass291Array20[arg1];
					for (local266 = 0; local266 < Static231.anInt5228; local266++) {
						for (local316 = 0; local316 < Static231.anInt5228; local316++) {
							local323 = local197 + local266;
							local327 = local201 + local316;
							local352 = local408.anIntArrayArray89[local323 - local408.anInt8721][local327 - local408.anInt8715];
							if ((local352 & 0x40240000) != 0) {
								arg0.method6209(local207 + (Static231.anInt5228 - local316) * 4 - 4, 4, 4, local205 + local266 * 4, -1713569622);
							} else if ((local352 & 0x800000) != 0) {
								arg0.method6162(4, local207 + (Static231.anInt5228 - local316) * 4 - 4, -1713569622, local266 * 4 + local205);
							} else if ((local352 & 0x2000000) != 0) {
								arg0.method6208(local205 + local266 * 4 + 3, (-local316 + Static231.anInt5228) * 4 + -4 + local207, -1713569622, 4);
							} else if ((local352 & 0x8000000) != 0) {
								arg0.method6162(4, (Static231.anInt5228 - local316) * 4 + local207 - 1, -1713569622, local266 * 4 + local205);
							} else if ((local352 & 0x20000000) != 0) {
								arg0.method6208(local266 * 4 + local205, (-local316 + Static231.anInt5228) * 4 + -4 + local207, -1713569622, 4);
							}
						}
					}
				}
				arg0.aa(local205, local207, Static231.anInt5228 * 4, Static231.anInt5228 * 4, local178, 2);
				Static497.aClass5_36.method7578((local197 - local11) * 4 + 48, -((local201 + -local17) * 4) + 464 - Static231.anInt5228 * 4, Static231.anInt5228 * 4, Static231.anInt5228 * 4, local205, local207);
			}
		}
		arg0.la();
		arg0.GA(-16777215);
		Static594.method8139();
		Static359.anInt9618 = 0;
		Static609.aClass276_63.method6910();
		if (!Static539.aBoolean784) {
			for (local201 = local11; local201 < local11 + 104; local201++) {
				for (local205 = local17; local205 < local17 + 104; local205++) {
					for (local207 = arg1; local207 <= arg1 + 1 && local207 <= 3; local207++) {
						if (Static394.method6311(local201, arg1, local207, local205)) {
							@Pc(702) Interface18 local702 = (Interface18) Static439.method6676(local207, local201, local205);
							if (local702 == null) {
								local702 = (Interface18) Static17.method258(local207, local201, local205, op.class);
							}
							if (local702 == null) {
								local702 = (Interface18) Static639.method8624(local207, local201, local205);
							}
							if (local702 == null) {
								local702 = (Interface18) Static359.method7955(local207, local201, local205);
							}
							if (local702 != null) {
								@Pc(743) Class272 local743 = Static541.aClass349_4.method8123(local702.method8587());
								if (!local743.aBoolean704 || Static87.aBoolean195) {
									local222 = local743.anInt8291;
									if (local743.anIntArray523 != null) {
										for (local233 = 0; local233 < local743.anIntArray523.length; local233++) {
											if (local743.anIntArray523[local233] != -1) {
												@Pc(772) Class272 local772 = Static541.aClass349_4.method8123(local743.anIntArray523[local233]);
												if (local772.anInt8291 >= 0) {
													local222 = local772.anInt8291;
												}
											}
										}
									}
									if (local222 >= 0) {
										@Pc(795) boolean local795 = false;
										if (local222 >= 0) {
											@Pc(802) Class269 local802 = Static34.aClass115_1.method3752(local222);
											if (local802 != null && local802.aBoolean695) {
												local795 = true;
											}
										}
										local258 = local201;
										local262 = local205;
										if (local795) {
											@Pc(820) int[][] local820 = Static334.aClass291Array20[local207].anIntArrayArray89;
											local316 = Static334.aClass291Array20[local207].anInt8721;
											local323 = Static334.aClass291Array20[local207].anInt8715;
											for (local327 = 0; local327 < 10; local327++) {
												local352 = (int) (Math.random() * 4.0D);
												if (local352 == 0 && local258 > local11 && local258 > local201 - 3 && (local820[local258 - local316 - 1][local262 - local323] & 0x2C0108) == 0) {
													local258--;
												}
												if (local352 == 1 && local11 + 104 - 1 > local258 && local258 < local201 + 3 && (local820[local258 + 1 - local316][local262 - local323] & 0x2C0180) == 0) {
													local258++;
												}
												if (local352 == 2 && local262 > local17 && local205 - 3 < local262 && (local820[local258 - local316][local262 - local323 - 1] & 0x2C0102) == 0) {
													local262--;
												}
												if (local352 == 3 && local262 < local17 + 104 - 1 && local205 + 3 > local262 && (local820[local258 - local316][local262 + 1 - local323] & 0x2C0120) == 0) {
													local262++;
												}
											}
										}
										Static514.anIntArray565[Static359.anInt9618] = local743.anInt8290;
										Static321.anIntArray321[Static359.anInt9618] = local258;
										Static460.anIntArray527[Static359.anInt9618] = local262;
										Static359.anInt9618++;
									}
								}
							}
						}
					}
				}
			}
			if (Static236.aClass57_3 != null) {
				Static187.aClass181_36.anInt5947 = 1;
				Static34.aClass115_1.method3755(1024, 64);
				for (local205 = 0; local205 < Static236.aClass57_3.anInt2284; local205++) {
					local207 = Static236.aClass57_3.anIntArray92[local205];
					if (local207 >> 28 == Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128) {
						local209 = (local207 >> 14 & 0x3FFF) - Static446.anInt8090;
						local215 = (local207 & 0x3FFF) - Static124.anInt3150;
						if (local209 >= 0 && Static394.anInt7540 > local209 && local215 >= 0 && Static462.anInt8391 > local215) {
							Static609.aClass276_63.method6906(new Class3_Sub8(local205));
						} else {
							@Pc(1099) Class269 local1099 = Static34.aClass115_1.method3752(Static236.aClass57_3.anIntArray93[local205]);
							if (local1099.anIntArray511 != null && local1099.anInt8172 + local209 >= 0 && Static394.anInt7540 > local209 + local1099.anInt8143 && local215 + local1099.anInt8147 >= 0 && Static462.anInt8391 > local215 + local1099.anInt8164) {
								Static609.aClass276_63.method6906(new Class3_Sub8(local205));
							}
						}
					}
				}
				Static34.aClass115_1.method3755(128, 64);
				Static187.aClass181_36.anInt5947 = 2;
				Static187.aClass181_36.method5048();
			}
		}
		return true;
	}
}
