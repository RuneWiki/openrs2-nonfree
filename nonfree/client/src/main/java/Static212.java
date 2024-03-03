import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public static int anInt4041;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIII)V", line = 35)
	public static void method3996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Class28.anInt751;
		client.anInt1195 = 0;
		@Pc(11) int[] local11 = Class64.anIntArray121;
		@Pc(194) int local194;
		@Pc(217) int local217;
		@Pc(261) int local261;
		@Pc(435) int local435;
		@Pc(546) int local546;
		@Pc(663) int local663;
		@Pc(322) int local322;
		for (@Pc(13) int local13 = 0; local13 < Class117.anInt3183 + local7; local13++) {
			@Pc(17) Class71 local17 = null;
			@Pc(33) Class11_Sub5_Sub2 local33;
			if (local7 <= local13) {
				local33 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[Class149.anIntArray230[local13 - local7]];
				local17 = ((Class11_Sub5_Sub2_Sub2) local33).aClass71_1;
				if (local17.anIntArray129 != null) {
					local17 = local17.method2095(Static199.aClass226_1);
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local33 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local11[local13]];
			}
			if (local33.anInt4629 >= 0 && (Class2_Sub2_Sub10_Sub1.anInt3082 == local33.anInt4595 || Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 == local33.aByte78)) {
				Static231.method4345(local33.method4324(), local33, arg1 >> 1, arg2 >> 1);
				if (Class153.anIntArray231[0] >= 0) {
					if (local33.aString50 != null && (local13 >= local7 || Class17.anInt545 == 0 || Class17.anInt545 == 3 || Class17.anInt545 == 1 && Static365.method6452(((Class11_Sub5_Sub2_Sub1) local33).aString41)) && Class214.anInt5965 > client.anInt1195) {
						Class214.anIntArray398[client.anInt1195] = Static106.aClass239_2.method6127(local33.aString50) / 2;
						Class214.anIntArray397[client.anInt1195] = Class153.anIntArray231[0];
						Class214.anIntArray402[client.anInt1195] = Class153.anIntArray231[1];
						Class214.anIntArray399[client.anInt1195] = local33.anInt4609;
						Class214.anIntArray400[client.anInt1195] = local33.anInt4592;
						Class214.anIntArray401[client.anInt1195] = local33.anInt4627;
						Class214.aStringArray55[client.anInt1195] = local33.aString50;
						client.anInt1195++;
					}
					@Pc(180) Class13 local180 = Static58.aClass13Array9[0];
					local194 = arg3 + Class153.anIntArray231[1] - Math.max(Static106.aClass239_2.anInt6823, local180.method6383());
					@Pc(209) Class13 local209;
					@Pc(310) int local310;
					if (!local33.aBoolean320 && Class83.anInt2345 < local33.anInt4598) {
						local209 = Static58.aClass13Array9[1];
						if (local33 instanceof Class11_Sub5_Sub2_Sub2) {
							local217 = local17.anInt2026;
							if (local217 == -1) {
								local217 = local33.method4333().anInt6292;
							}
						} else {
							local217 = local33.method4333().anInt6292;
						}
						if (local217 != -1) {
							@Pc(246) Class13[] local246 = (Class13[]) Class2_Sub24_Sub1.aClass98_49.method2614((long) local217);
							if (local246 == null) {
								@Pc(253) Class48[] local253 = Static372.method1690(Static29.aClass197_5, local217);
								if (local253 != null) {
									local246 = new Class13[local253.length];
									for (local261 = 0; local261 < local253.length; local261++) {
										local246[local261] = Static177.aClass19_8.method2893(local253[local261]);
									}
									Class2_Sub24_Sub1.aClass98_49.method2626((long) local217, local246);
								}
							}
							if (local246 != null && local246.length == 2) {
								local180 = local246[0];
								local209 = local246[1];
							}
						}
						local310 = arg0 + Class153.anIntArray231[0] - (local180.method6390() >> 1);
						local180.method6386(local310, local194);
						local322 = local180.method6390() * local33.anInt4622 / 255;
						if (local33.anInt4622 > 0 && local322 < 2) {
							local322 = 2;
						}
						Static177.aClass19_8.method2819(local310, local194, local322 + local310, local194 + local180.method6383());
						local209.method6386(local310, local194);
						Static177.aClass19_8.method2897(arg0, arg3, arg0 + arg1, arg3 - -arg2);
					}
					local194 -= 2;
					if (!local33.aBoolean320) {
						if (Class83.anInt2345 < local33.anInt4612) {
							local209 = Static309.aClass13Array23[local33.aBoolean319 ? 2 : 0];
							@Pc(386) Class13 local386 = Static309.aClass13Array23[local33.aBoolean319 ? 3 : 1];
							if (local33 instanceof Class11_Sub5_Sub2_Sub2) {
								local310 = local17.anInt2039;
								if (local310 == -1) {
									local310 = local33.method4333().anInt6276;
								}
							} else {
								local310 = local33.method4333().anInt6276;
							}
							if (local310 != -1) {
								@Pc(420) Class13[] local420 = (Class13[]) Class97.aClass98_18.method2614((long) local310);
								if (local420 == null) {
									@Pc(427) Class48[] local427 = Static372.method1690(Static29.aClass197_5, local310);
									if (local427 != null) {
										local420 = new Class13[local427.length];
										for (local435 = 0; local435 < local427.length; local435++) {
											local420[local435] = Static177.aClass19_8.method2893(local427[local435]);
										}
										Class97.aClass98_18.method2626((long) local310, local420);
									}
								}
								if (local420 != null && local420.length == 4) {
									local386 = local420[local33.aBoolean319 ? 3 : 1];
									local209 = local420[local33.aBoolean319 ? 2 : 0];
								}
							}
							local322 = local33.anInt4612 - Class83.anInt2345;
							if (local322 > local33.anInt4570) {
								local322 -= local33.anInt4570;
								local435 = local33.anInt4583 == 0 ? 0 : (local33.anInt4614 - local322) / local33.anInt4583 * local33.anInt4583;
								local261 = local209.method6390() * local435 / local33.anInt4614;
							} else {
								local261 = local209.method6390();
							}
							local435 = local209.method6383();
							local194 -= local435;
							local546 = Class153.anIntArray231[0] + arg0 - (local209.method6390() >> 1);
							local209.method6386(local546, local194);
							Static177.aClass19_8.method2819(local546, local194, local261 + local546, local194 - -local435);
							local386.method6386(local546, local194);
							local194 -= 2;
							Static177.aClass19_8.method2897(arg0, arg3, arg1 + arg0, arg3 - -arg2);
						}
						if (local13 < local7) {
							@Pc(587) Class11_Sub5_Sub2_Sub1 local587 = (Class11_Sub5_Sub2_Sub1) local33;
							if (local587.anInt4182 != -1) {
								local194 -= 25;
								Static215.aClass13Array17[local587.anInt4182].method6386(Class153.anIntArray231[0] + arg0 - 12, local194);
								local194 -= 2;
							}
							if (local587.anInt4192 != -1) {
								local194 -= 25;
								Static128.aClass13Array13[local587.anInt4192].method6386(arg0 + Class153.anIntArray231[0] - 12, local194);
								local194 -= 2;
							}
						} else if (local17.anInt2047 >= 0 && local17.anInt2047 < Static128.aClass13Array13.length) {
							local209 = Static128.aClass13Array13[local17.anInt2047];
							local194 -= 25;
							local209.method6386(arg0 + Class153.anIntArray231[0] - (local209.method6390() >> 1), local194);
							local194 -= 2;
						}
					}
					@Pc(665) Class84[] local665;
					@Pc(673) Class84 local673;
					@Pc(695) Class13 local695;
					if (!(local33 instanceof Class11_Sub5_Sub2_Sub1)) {
						local663 = 0;
						local665 = Class41.aClass84Array1;
						for (local310 = 0; local310 < local665.length; local310++) {
							local673 = local665[local310];
							if (local673 != null && local673.anInt2352 == 1 && Class149.anIntArray230[local13 - local7] == local673.anInt2351) {
								local695 = Static213.aClass13Array16[local673.anInt2360];
								if (local695.method6383() > local663) {
									local663 = local695.method6383();
								}
								if (Class83.anInt2345 % 20 < 10) {
									local695.method6386(Class153.anIntArray231[0] + arg0 - 12, local194 - local695.method6383());
								}
							}
						}
						if (local663 > 0) {
						}
					} else if (local13 >= 0) {
						local663 = 0;
						local665 = Class41.aClass84Array1;
						for (local310 = 0; local310 < local665.length; local310++) {
							local673 = local665[local310];
							if (local673 != null && local673.anInt2352 == 10 && local11[local13] == local673.anInt2351) {
								local695 = Static213.aClass13Array16[local673.anInt2360];
								if (local663 < local695.method6383()) {
									local663 = local695.method6383();
								}
								local695.method6386(Class153.anIntArray231[0] + arg0 - 12, -local695.method6383() + local194);
							}
						}
						if (local663 > 0) {
						}
					}
					for (local663 = 0; local663 < 4; local663++) {
						if (local33.anIntArray315[local663] > Class83.anInt2345) {
							local217 = local33.method4324() / 2;
							Static231.method4345(local217, local33, arg1 >> 1, arg2 >> 1);
							if (Class153.anIntArray231[0] > -1) {
								if (local663 == 1) {
									Class153.anIntArray231[1] -= 20;
								}
								if (local663 == 2) {
									Class153.anIntArray231[1] -= 10;
									Class153.anIntArray231[0] -= 15;
								}
								if (local663 == 3) {
									Class153.anIntArray231[0] += 15;
									Class153.anIntArray231[1] -= 10;
								}
								Static15.aClass13Array3[local33.anIntArray312[local663]].method6386(Class153.anIntArray231[0] + arg0 - 12, arg3 - -Class153.anIntArray231[1] + -12);
								Static187.aClass130_3.method5901(Integer.toString(local33.anIntArray313[local663]), 0, arg3 + Class153.anIntArray231[1] + 3, -1, arg0 - -Class153.anIntArray231[0] + -1);
							}
						}
					}
				}
			}
		}
		@Pc(965) int local965;
		for (@Pc(959) int local959 = 0; local959 < Class2_Sub7.anInt1367; local959++) {
			local965 = Class2_Sub3_Sub16.anIntArray175[local959];
			@Pc(974) Class11_Sub5_Sub2 local974;
			if (local965 >= 2048) {
				local974 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local965 - 2048];
			} else {
				local974 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local965];
			}
			local194 = Class114.anIntArray186[local959];
			@Pc(991) Class11_Sub5_Sub2 local991;
			if (local194 < 2048) {
				local991 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local194];
			} else {
				local991 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local194 - 2048];
			}
			Static225.method4196(local991, arg3, arg0, local974, arg1, arg2, --local974.anInt4616);
		}
		local965 = Static106.aClass239_2.anInt6833 + Static106.aClass239_2.anInt6823 + 2;
		for (@Pc(1030) int local1030 = 0; local1030 < client.anInt1195; local1030++) {
			local194 = Class214.anIntArray397[local1030];
			local663 = Class214.anIntArray402[local1030];
			local217 = Class214.anIntArray398[local1030];
			@Pc(1046) boolean local1046 = true;
			while (local1046) {
				local1046 = false;
				for (local322 = 0; local322 < local1030; local322++) {
					if (local663 + 2 > -local965 + Class214.anIntArray402[local322] && local663 - local965 < Class214.anIntArray402[local322] + 2 && Class214.anIntArray397[local322] + Class214.anIntArray398[local322] > -local217 + local194 && local194 + local217 > -Class214.anIntArray398[local322] + Class214.anIntArray397[local322] && Class214.anIntArray402[local322] - local965 < local663) {
						local663 = Class214.anIntArray402[local322] - local965;
						local1046 = true;
					}
				}
			}
			Class214.anIntArray402[local1030] = local663;
			@Pc(1134) String local1134 = Class214.aStringArray55[local1030];
			if (Class177.anInt4886 == 0) {
				local261 = 16776960;
				if (Class214.anIntArray399[local1030] < 6) {
					local261 = Class11_Sub5.anIntArray476[Class214.anIntArray399[local1030]];
				}
				if (Class214.anIntArray399[local1030] == 6) {
					local261 = Class2_Sub2_Sub10_Sub1.anInt3082 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Class214.anIntArray399[local1030] == 7) {
					local261 = Class2_Sub2_Sub10_Sub1.anInt3082 % 20 >= 10 ? 65535 : 255;
				}
				if (Class214.anIntArray399[local1030] == 8) {
					local261 = Class2_Sub2_Sub10_Sub1.anInt3082 % 20 < 10 ? 45056 : 8454016;
				}
				if (Class214.anIntArray399[local1030] == 9) {
					local435 = 150 - Class214.anIntArray401[local1030];
					if (local435 < 50) {
						local261 = local435 * 1280 + 16711680;
					} else if (local435 < 100) {
						local261 = 16776960 - (local435 - 50) * 327680;
					} else if (local435 < 150) {
						local261 = (local435 - 100) * 5 + 65280;
					}
				}
				if (Class214.anIntArray399[local1030] == 10) {
					local435 = 150 - Class214.anIntArray401[local1030];
					if (local435 < 50) {
						local261 = local435 * 5 + 16711680;
					} else if (local435 < 100) {
						local261 = 33095935 - local435 * 327680;
					} else if (local435 < 150) {
						local261 = local435 * 327680 + 255 - (local435 + -100) * 5 - 32768000;
					}
				}
				if (Class214.anIntArray399[local1030] == 11) {
					local435 = 150 - Class214.anIntArray401[local1030];
					if (local435 < 50) {
						local261 = 16777215 - local435 * 327685;
					} else if (local435 < 100) {
						local261 = local435 * 327685 + 65280 - 16384250;
					} else if (local435 < 150) {
						local261 = 32768000 + 16777215 - local435 * 327680;
					}
				}
				local435 = local261 | 0xFF000000;
				if (Class214.anIntArray400[local1030] == 0) {
					Static49.aClass130_1.method5901(local1134, -16777216, local663 + arg3, local435, arg0 + local194);
				}
				if (Class214.anIntArray400[local1030] == 1) {
					Static49.aClass130_1.method5906(local435, Class2_Sub2_Sub10_Sub1.anInt3082, local1134, arg3 + local663, arg0 + local194);
				}
				if (Class214.anIntArray400[local1030] == 2) {
					Static49.aClass130_1.method5890(local435, local1134, local663 + arg3, local194 + arg0, Class2_Sub2_Sub10_Sub1.anInt3082);
				}
				if (Class214.anIntArray400[local1030] == 3) {
					Static49.aClass130_1.method5896(Class2_Sub2_Sub10_Sub1.anInt3082, local194 + arg0, -Class214.anIntArray401[local1030] + 150, local1134, local435, local663 + arg3);
				}
				if (Class214.anIntArray400[local1030] == 4) {
					local546 = (150 - Class214.anIntArray401[local1030]) * (Static106.aClass239_2.method6127(local1134) + 100) / 150;
					Static177.aClass19_8.method2819(local194 + arg0 - 50, arg3, arg0 + local194 + 50, arg3 - -arg2);
					Static49.aClass130_1.method5898(local194 + arg0 + 50 - local546, -16777216, local663 + arg3, local435, local1134);
					Static177.aClass19_8.method2897(arg0, arg3, arg1 + arg0, arg3 - -arg2);
				}
				if (Class214.anIntArray400[local1030] == 5) {
					local546 = 150 - Class214.anIntArray401[local1030];
					@Pc(1549) int local1549 = 0;
					if (local546 < 25) {
						local1549 = local546 - 25;
					} else if (local546 > 125) {
						local1549 = local546 - 125;
					}
					@Pc(1571) int local1571 = Static106.aClass239_2.anInt6833 + Static106.aClass239_2.anInt6823;
					Static177.aClass19_8.method2819(arg0, arg3 + local663 - local1571 - 1, arg0 - -arg1, arg3 + local663 + 5);
					Static49.aClass130_1.method5901(local1134, -16777216, local1549 + arg3 + local663, local435, local194 + arg0);
					Static177.aClass19_8.method2897(arg0, arg3, arg0 + arg1, arg3 + arg2);
				}
			} else {
				Static49.aClass130_1.method5901(local1134, -16777216, arg3 + local663, -256, local194 + arg0);
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)Lclient!mr;", line = 663)
	public static Class11_Sub5_Sub2 method3998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class67 local16 = Static307.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		if (local16 == null) {
			return null;
		}
		@Pc(22) Class11_Sub5_Sub2 local22 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class22 local27 = local16.aClass22_2; local27 != null; local27 = local27.aClass22_1) {
			@Pc(31) Class11_Sub5 local31 = local27.aClass11_Sub5_1;
			if (local31 instanceof Class11_Sub5_Sub2) {
				@Pc(37) Class11_Sub5_Sub2 local37 = (Class11_Sub5_Sub2) local31;
				@Pc(47) int local47 = (local37.method4329() - 1) * 64 + 60;
				@Pc(55) int local55 = local37.anInt6768 - local47 >> 7;
				@Pc(63) int local63 = local37.anInt6770 - local47 >> 7;
				@Pc(70) int local70 = local47 + local37.anInt6768 >> 7;
				@Pc(77) int local77 = local37.anInt6770 + local47 >> 7;
				if (arg1 >= local55 && local63 <= arg2 && arg1 <= local70 && local77 >= arg2) {
					@Pc(106) int local106 = (local70 + 1 - arg1) * (local77 + 1 + -arg2);
					if (local24 < local106) {
						local22 = local37;
						local24 = local106;
					}
				}
			}
		}
		return local22;
	}
}
