import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "I")
	public static int anInt5726;

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "Ljava/lang/Object;")
	public static Object anObject10;

	@OriginalMember(owner = "client!mba", name = "e", descriptor = "Lclient!vfa;")
	public static Class329 aClass329_6;

	@OriginalMember(owner = "client!mba", name = "f", descriptor = "[I")
	public static final int[] anIntArray432 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIIIIII)V")
	public static void method4667(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		@Pc(12) int local12 = Static333.anInt6355;
		@Pc(14) int[] local14 = Static354.anIntArray461;
		Static147.anInt2782 = 0;
		@Pc(190) int local190;
		@Pc(207) int local207;
		@Pc(261) int local261;
		@Pc(337) int local337;
		@Pc(425) int local425;
		@Pc(868) int local868;
		@Pc(556) int local556;
		for (@Pc(18) int local18 = 0; local18 < Static429.anInt7650 + local12; local18++) {
			@Pc(22) Class88 local22 = null;
			@Pc(38) Class15_Sub2_Sub4 local38;
			if (local12 <= local18) {
				local38 = ((Class6_Sub49) Static251.aClass234_29.method5464((long) Static46.anIntArray36[local18 - local12])).aClass15_Sub2_Sub4_Sub1_2;
				local22 = ((Class15_Sub2_Sub4_Sub1) local38).aClass88_1;
				if (local22.anIntArray182 != null) {
					local22 = local22.method1940(Static65.aClass51_1);
					if (local22 == null) {
						continue;
					}
				}
			} else {
				local38 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local14[local18]];
			}
			if (local38.anInt8945 >= 0 && (Static114.anInt1963 == local38.anInt8957 || local38.aByte98 == Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98)) {
				Static52.method1024(local38, arg0 >> 1, arg3 >> 1, local38.method7133());
				if (Static10.anIntArray8[0] >= 0) {
					if (local38.aString81 != null && (local12 <= local18 || Static319.anInt3808 == 0 || Static319.anInt3808 == 3 || Static319.anInt3808 == 1 && Static439.method6213(((Class15_Sub2_Sub4_Sub2) local38).aString82)) && Static528.anInt9131 > Static147.anInt2782) {
						Static528.anIntArray646[Static147.anInt2782] = Static479.aClass202_13.method4970(local38.aString81) / 2;
						Static528.anIntArray645[Static147.anInt2782] = Static10.anIntArray8[0];
						Static528.anIntArray650[Static147.anInt2782] = Static10.anIntArray8[1];
						Static528.anIntArray648[Static147.anInt2782] = local38.anInt8960;
						Static528.anIntArray647[Static147.anInt2782] = local38.anInt8953;
						Static528.anIntArray649[Static147.anInt2782] = local38.anInt8994;
						Static528.aStringArray37[Static147.anInt2782] = local38.aString81;
						Static147.anInt2782++;
					}
					local190 = arg2 + Static10.anIntArray8[1];
					@Pc(246) Class71[] local246;
					@Pc(253) Class177[] local253;
					@Pc(309) Class71 local309;
					if (local38.aBoolean581 || local38.anInt8987 <= Static363.anInt6671) {
						local190 -= Math.max(Static479.aClass202_13.anInt6139, Static280.aClass71Array34[0].b());
					} else {
						@Pc(201) byte local201 = 1;
						if (local18 >= local12) {
							local207 = local22.anInt2146;
							if (local207 == -1) {
								local207 = local38.method7131().anInt4525;
							}
						} else {
							@Pc(223) Class15_Sub2_Sub4_Sub2 local223 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local14[local18]];
							local207 = local38.method7131().anInt4525;
							if (local223.aBoolean586) {
								local201 = 2;
							}
						}
						@Pc(235) Class71[] local235 = Static280.aClass71Array34;
						if (local207 != -1) {
							local246 = (Class71[]) Static32.aClass330_8.method7677((long) local207);
							if (local246 == null) {
								local253 = Static593.method4140(Static114.aClass248_20, local207);
								if (local253 != null) {
									local246 = new Class71[local253.length];
									for (local261 = 0; local261 < local253.length; local261++) {
										local246[local261] = Static554.aClass90_12.method7522(local253[local261]);
									}
									Static32.aClass330_8.method7676(local246, (long) local207);
								}
							}
							if (local246 != null && local246.length >= 2) {
								local235 = local246;
							}
						}
						if (local235.length <= local201) {
							local201 = 1;
						}
						@Pc(305) Class71 local305 = local235[0];
						local309 = local235[local201];
						local190 -= Math.max(Static479.aClass202_13.anInt6139, local305.b());
						local261 = arg1 + Static10.anIntArray8[0] - (local305.QA() >> 1);
						local337 = local305.QA() * local38.anInt8938 / 255;
						if (local38.anInt8938 > 0 && local337 < 2) {
							local337 = 2;
						}
						local305.method7775(local261, local190);
						Static554.aClass90_12.Q(local261, local190, local337 + local261, local190 + local305.b());
						local309.method7775(local261, local190);
						Static554.aClass90_12.ca(arg1, arg2, arg1 + arg0, arg3 + arg2);
					}
					local190 -= 2;
					if (!local38.aBoolean581) {
						@Pc(408) Class71 local408;
						if (local38.anInt8962 > Static363.anInt6671) {
							local408 = Static357.aClass71Array41[local38.aBoolean578 ? 2 : 0];
							@Pc(417) Class71 local417 = Static357.aClass71Array41[local38.aBoolean578 ? 3 : 1];
							if (local38 instanceof Class15_Sub2_Sub4_Sub1) {
								local425 = local22.anInt2162;
								if (local425 == -1) {
									local425 = local38.method7131().anInt4536;
								}
							} else {
								local425 = local38.method7131().anInt4536;
							}
							if (local425 != -1) {
								local246 = (Class71[]) Static32.aClass330_7.method7677((long) local425);
								if (local246 == null) {
									local253 = Static593.method4140(Static114.aClass248_20, local425);
									if (local253 != null) {
										local246 = new Class71[local253.length];
										for (local261 = 0; local261 < local253.length; local261++) {
											local246[local261] = Static554.aClass90_12.method7522(local253[local261]);
										}
										Static32.aClass330_7.method7676(local246, (long) local425);
									}
								}
								if (local246 != null && local246.length == 4) {
									local408 = local246[local38.aBoolean578 ? 2 : 0];
									local417 = local246[local38.aBoolean578 ? 3 : 1];
								}
							}
							@Pc(522) int local522 = local38.anInt8962 - Static363.anInt6671;
							if (local522 > local38.anInt8920) {
								local522 -= local38.anInt8920;
								local261 = local38.anInt8937 == 0 ? 0 : local38.anInt8937 * ((local38.anInt8950 - local522) / local38.anInt8937);
								local556 = local261 * local408.QA() / local38.anInt8950;
							} else {
								local556 = local408.QA();
							}
							local261 = local408.b();
							local190 -= local261;
							local337 = Static10.anIntArray8[0] + arg1 - (local408.QA() >> 1);
							local408.method7775(local337, local190);
							Static554.aClass90_12.Q(local337, local190, local556 + local337, local190 - -local261);
							local417.method7775(local337, local190);
							Static554.aClass90_12.ca(arg1, arg2, arg1 + arg0, arg3 + arg2);
							local190 -= 2;
						}
						if (local12 > local18) {
							@Pc(657) Class15_Sub2_Sub4_Sub2 local657 = (Class15_Sub2_Sub4_Sub2) local38;
							if (local657.anInt9023 != -1) {
								local190 -= 25;
								Static230.aClass71Array27[local657.anInt9023].method7775(arg1 + Static10.anIntArray8[0] - 12, local190);
								local190 -= 2;
							}
							if (local657.anInt9012 != -1) {
								local190 -= 25;
								Static187.aClass71Array23[local657.anInt9012].method7775(Static10.anIntArray8[0] + arg1 - 12, local190);
								local190 -= 2;
							}
						} else if (local22.anInt2179 >= 0 && local22.anInt2179 < Static187.aClass71Array23.length) {
							local408 = Static187.aClass71Array23[local22.anInt2179];
							local190 -= 25;
							local408.method7775(arg1 + Static10.anIntArray8[0] - (local408.QA() >> 1), local190);
							local190 -= 2;
						}
					}
					@Pc(707) Class279[] local707;
					@Pc(715) Class279 local715;
					if (!(local38 instanceof Class15_Sub2_Sub4_Sub2)) {
						local207 = 0;
						local707 = Static168.aClass279Array1;
						for (local425 = 0; local425 < local707.length; local425++) {
							local715 = local707[local425];
							if (local715 != null && local715.anInt7966 == 1 && Static46.anIntArray36[local18 - local12] == local715.anInt7964) {
								local309 = Static544.aClass71Array44[local715.anInt7965];
								if (local207 < local309.b()) {
									local207 = local309.b();
								}
								if (Static363.anInt6671 % 20 < 10) {
									local309.method7775(Static10.anIntArray8[0] + arg1 - 12, -local309.b() + local190);
								}
							}
						}
						if (local207 > 0) {
						}
					} else if (local18 >= 0) {
						local207 = 0;
						local707 = Static168.aClass279Array1;
						for (local425 = 0; local425 < local707.length; local425++) {
							local715 = local707[local425];
							if (local715 != null && local715.anInt7966 == 10 && local715.anInt7964 == local14[local18]) {
								local309 = Static544.aClass71Array44[local715.anInt7965];
								if (local309.b() > local207) {
									local207 = local309.b();
								}
								local309.method7775(arg1 + Static10.anIntArray8[0] - 12, local190 - local309.b());
							}
						}
						if (local207 > 0) {
						}
					}
					for (local207 = 0; local207 < 4; local207++) {
						if (local38.anIntArray635[local207] > Static363.anInt6671) {
							local868 = local38.method7133() / 2;
							Static52.method1024(local38, arg0 >> 1, arg3 >> 1, local868);
							if (Static10.anIntArray8[0] > -1) {
								local425 = Static118.aClass71Array57[local38.anIntArray634[local207]].QA();
								if (local207 == 1) {
									Static10.anIntArray8[1] -= 20;
								}
								if (local207 == 2) {
									Static10.anIntArray8[1] -= 10;
									Static10.anIntArray8[0] -= local425 - 9;
								}
								if (local207 == 3) {
									Static10.anIntArray8[0] += local425 - 9;
									Static10.anIntArray8[1] -= 10;
								}
								Static118.aClass71Array57[local38.anIntArray634[local207]].method7775(Static10.anIntArray8[0] + arg1 - (local425 >> 1), Static10.anIntArray8[1] + -12 + arg2);
								Static266.aClass82_4.method7873(-1, Static10.anIntArray8[1] + arg2 + 3, Integer.toString(local38.anIntArray636[local207]), Static10.anIntArray8[0] + arg1 - 1, 0);
							}
						}
					}
				}
			}
		}
		@Pc(1018) int local1018;
		for (@Pc(1012) int local1012 = 0; local1012 < Static413.anInt7396; local1012++) {
			local1018 = Static161.anIntArray289[local1012];
			@Pc(1025) Class15_Sub2_Sub4 local1025;
			if (local1018 < 2048) {
				local1025 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local1018];
			} else {
				local1025 = ((Class6_Sub49) Static251.aClass234_29.method5464((long) (local1018 - 2048))).aClass15_Sub2_Sub4_Sub1_2;
			}
			local207 = Static443.anIntArray561[local1012];
			@Pc(1048) Class15_Sub2_Sub4 local1048;
			if (local207 < 2048) {
				local1048 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local207];
			} else {
				local1048 = ((Class6_Sub49) Static251.aClass234_29.method5464((long) (local207 - 2048))).aClass15_Sub2_Sub4_Sub1_2;
			}
			Static347.method5278(arg3, local1048, --local1025.anInt8933, arg1, local1025, arg2, arg0);
		}
		local1018 = Static479.aClass202_13.anInt6135 + Static479.aClass202_13.anInt6139 + 2;
		for (local190 = 0; local190 < Static147.anInt2782; local190++) {
			local207 = Static528.anIntArray645[local190];
			local868 = Static528.anIntArray650[local190];
			local425 = Static528.anIntArray646[local190];
			@Pc(1113) boolean local1113 = true;
			while (local1113) {
				local1113 = false;
				for (local556 = 0; local556 < local190; local556++) {
					if (Static528.anIntArray650[local556] - local1018 < local868 + 2 && Static528.anIntArray650[local556] + 2 > -local1018 + local868 && Static528.anIntArray646[local556] + Static528.anIntArray645[local556] > local207 - local425 && Static528.anIntArray645[local556] - Static528.anIntArray646[local556] < local207 - -local425 && local868 > Static528.anIntArray650[local556] - local1018) {
						local868 = Static528.anIntArray650[local556] - local1018;
						local1113 = true;
					}
				}
			}
			Static528.anIntArray650[local190] = local868;
			@Pc(1204) String local1204 = Static528.aStringArray37[local190];
			if (Static105.anInt1767 == 0) {
				local261 = 16776960;
				if (Static528.anIntArray648[local190] < 6) {
					local261 = Static430.anIntArray542[Static528.anIntArray648[local190]];
				}
				if (Static528.anIntArray648[local190] == 6) {
					local261 = Static114.anInt1963 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static528.anIntArray648[local190] == 7) {
					local261 = Static114.anInt1963 % 20 < 10 ? 255 : 65535;
				}
				if (Static528.anIntArray648[local190] == 8) {
					local261 = Static114.anInt1963 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static528.anIntArray648[local190] == 9) {
					local337 = 150 - Static528.anIntArray649[local190];
					if (local337 < 50) {
						local261 = local337 * 1280 + 16711680;
					} else if (local337 < 100) {
						local261 = 33160960 - local337 * 327680;
					} else if (local337 < 150) {
						local261 = local337 * 5 + 65280 - 500;
					}
				}
				if (Static528.anIntArray648[local190] == 10) {
					local337 = 150 - Static528.anIntArray649[local190];
					if (local337 < 50) {
						local261 = local337 * 5 + 16711680;
					} else if (local337 < 100) {
						local261 = 16711935 - (local337 - 50) * 327680;
					} else if (local337 < 150) {
						local261 = local337 * 327680 + 255 - (local337 - 100) * 5 - 32768000;
					}
				}
				if (Static528.anIntArray648[local190] == 11) {
					local337 = 150 - Static528.anIntArray649[local190];
					if (local337 < 50) {
						local261 = 16777215 - local337 * 327685;
					} else if (local337 < 100) {
						local261 = local337 * 327685 + 65280 - 16384250;
					} else if (local337 < 150) {
						local261 = 16777215 + 32768000 - local337 * 327680;
					}
				}
				local337 = local261 | 0xFF000000;
				if (Static528.anIntArray647[local190] == 0) {
					Static264.aClass82_3.method7873(local337, arg2 + local868, local1204, arg1 + local207, -16777216);
				}
				if (Static528.anIntArray647[local190] == 1) {
					Static264.aClass82_3.method7872(local207 + arg1, local1204, local337, local868 + arg2, Static114.anInt1963);
				}
				if (Static528.anIntArray647[local190] == 2) {
					Static264.aClass82_3.method7877(local337, Static114.anInt1963, local868 + arg2, local1204, local207 + arg1);
				}
				if (Static528.anIntArray647[local190] == 3) {
					Static264.aClass82_3.method7885(150 - Static528.anIntArray649[local190], local207 + arg1, Static114.anInt1963, arg2 + local868, local337, local1204);
				}
				@Pc(1544) int local1544;
				if (Static528.anIntArray647[local190] == 4) {
					local1544 = (150 - Static528.anIntArray649[local190]) * (Static479.aClass202_13.method4970(local1204) + 100) / 150;
					Static554.aClass90_12.Q(arg1 + local207 - 50, arg2, arg1 + local207 + 50, arg3 + arg2);
					Static264.aClass82_3.method7875(arg2 + local868, -16777216, local337, local1204, local207 + arg1 + 50 - local1544);
					Static554.aClass90_12.ca(arg1, arg2, arg0 + arg1, arg2 + arg3);
				}
				if (Static528.anIntArray647[local190] == 5) {
					local1544 = 150 - Static528.anIntArray649[local190];
					@Pc(1606) int local1606 = 0;
					if (local1544 < 25) {
						local1606 = local1544 - 25;
					} else if (local1544 > 125) {
						local1606 = local1544 - 125;
					}
					@Pc(1630) int local1630 = Static479.aClass202_13.anInt6139 + Static479.aClass202_13.anInt6135;
					Static554.aClass90_12.Q(arg1, arg2 + local868 - local1630 - 1, arg0 + arg1, arg2 + local868 + 5);
					Static264.aClass82_3.method7873(local337, local1606 + local868 + arg2, local1204, arg1 + local207, -16777216);
					Static554.aClass90_12.ca(arg1, arg2, arg0 + arg1, arg2 - -arg3);
				}
			} else {
				Static264.aClass82_3.method7873(-256, local868 + arg2, local1204, arg1 + local207, -16777216);
			}
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(II)V")
	public static void method4668(@OriginalArg(1) int arg0) {
		@Pc(1) Class6_Sub5_Sub10 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class46 local8 = Static496.aClass46Array4[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static20.anInt358; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static547.anInt9363; local15++) {
						local1 = local8.c(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static23.anInt420;
							@Pc(32) int local32 = local12 << Static23.anInt420;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class46 local41 = Static496.aClass46Array4[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.JA(local15, local12) - local41.JA(local15, local12);
									@Pc(67) int local67 = local8.JA(local15 + 1, local12) - local41.JA(local15 + 1, local12);
									@Pc(85) int local85 = local8.JA(local15 + 1, local12 + 1) - local41.JA(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.JA(local15, local12 + 1) - local41.JA(local15, local12 + 1);
									local41.aa(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZILclient!pj;I)Lclient!hn;")
	public static Class134 method4670(@OriginalArg(2) Class248 arg0, @OriginalArg(3) int arg1) {
		@Pc(9) byte[] local9 = arg0.method5797(arg1, 0);
		return local9 == null ? null : new Class134(local9);
	}
}
