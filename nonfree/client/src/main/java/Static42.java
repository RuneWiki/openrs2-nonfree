import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bga", name = "e", descriptor = "Lclient!ofa;")
	public static Class252 aClass252_1;

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_47 = new Class179(13, 0);

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "I")
	public static int anInt937 = 0;

	@OriginalMember(owner = "client!bga", name = "f", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_48 = new Class179(29, 9);

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lclient!ha;III)V")
	public static void method909(@OriginalArg(0) Class132 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg1 < 0 || Static145.anInt2480 == 0 || Static280.anInt4829 == 0) {
			return;
		}
		@Pc(53) Class207 local53;
		@Pc(38) int local38;
		@Pc(40) int local40;
		@Pc(42) int local42;
		@Pc(44) int local44;
		@Pc(63) int local63;
		@Pc(65) int local65;
		if (Static594.aBoolean693) {
			Static614.method8490(false);
			local53 = arg0.method7496();
			@Pc(79) int[] local79 = arg0.Y();
			local38 = local79[0];
			local42 = local79[2];
			local44 = local79[3];
			local40 = local79[1];
			local63 = Static101.method1661(false) + arg2;
			local65 = arg1 + Static665.method9028(false);
		} else {
			arg0.DA(Static26.anInt607, Static345.anInt5929, Static145.anInt2480, Static280.anInt4829);
			local38 = Static26.anInt607;
			local40 = Static345.anInt5929;
			local42 = Static145.anInt2480;
			local44 = Static280.anInt4829;
			arg0.KA(Static575.anInt9484, Static187.anInt3188, Static145.anInt2480, Static280.anInt4829);
			local53 = arg0.method7467();
			local53.method8201(Static242.anInt4298, Static359.anInt6155, Static308.anInt5227, Static302.anInt5166, Static16.anInt451, Static526.anInt8690);
			local63 = arg2;
			local65 = arg1;
			arg0.method7517(local53);
		}
		if (local44 == 0) {
			local44 = 1;
		}
		if (local42 == 0) {
			local42 = 1;
		}
		Static340.method5000(true);
		@Pc(143) int local143;
		@Pc(153) int local153;
		@Pc(162) int local162;
		@Pc(281) int local281;
		@Pc(290) int local290;
		@Pc(301) int local301;
		@Pc(312) int local312;
		@Pc(135) int local135;
		@Pc(361) int local361;
		if (Static64.aClass12Array1 != null && (!Static291.aBoolean314 || (Static255.anInt5389 & 0x40) != 0)) {
			local135 = -1;
			@Pc(137) int local137 = -1;
			@Pc(140) int local140 = arg0.i();
			local143 = arg0.XA();
			@Pc(180) int local180;
			@Pc(171) int local171;
			if (Static487.aBoolean565) {
				local153 = local171 = (local63 - local38) * Static472.anInt8136 / local42;
				local180 = local162 = Static472.anInt8136 * (local65 - local40) / local44;
			} else {
				local153 = (local63 - local38) * local140 / local42;
				local162 = (local65 - local40) * local143 / local44;
				local171 = local143 * (local63 - local38) / local42;
				local180 = local140 * (local65 - local40) / local44;
			}
			@Pc(219) int[] local219 = new int[] { local153, local180, local140 };
			@Pc(234) int[] local234 = new int[] { local171, local162, local143 };
			local53.method8196(local219);
			local53.method8196(local234);
			@Pc(268) float local268 = Static277.method4079((float) local234[0], (float) local219[0], (float) local219[2], 4, (float) local219[1], (float) local234[2], (float) local234[1]);
			if (local268 > 0.0F) {
				local281 = local234[0] - local219[0];
				local290 = local234[2] - local219[2];
				local301 = (int) (local268 * (float) local281 + (float) local219[0]);
				local312 = (int) ((float) local219[2] + local268 * (float) local290);
				local135 = (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.method4326() - 1 << 8) + local301 >> 9;
				local137 = local312 + (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.method4326() - 1 << 8) >> 9;
				@Pc(340) byte local340 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140;
				if (local340 < 3 && (Static90.aByteArrayArrayArray2[1][local301 >> 9][local312 >> 9] & 0x2) != 0) {
					local361 = local340 + 1;
				}
			}
			if (local135 != -1 && local137 != -1) {
				if (Static291.aBoolean314 && (Static255.anInt5389 & 0x40) != 0) {
					@Pc(427) Class321 local427 = Static640.method8748(Static663.anInt9822, Static672.anInt10372);
					if (local427 == null) {
						Static221.method3209();
					} else {
						Static200.method2916((long) (local135 << 0 | local137), Static355.aString75, local137, false, 0L, " ->", 15, Static478.anInt8213, -1, true, local135, true);
					}
				} else {
					if (Static178.aBoolean188) {
						Static200.method2916((long) (local137 | local135 << 0), Static52.aClass41_27.method1007(Static616.anInt10077), local137, false, 0L, "", 59, -1, -1, true, local135, true);
					}
					Static200.method2916((long) (local137 | local135 << 0), Static239.aString48, local137, false, 0L, "", 45, Static206.anInt3564, -1, true, local135, true);
				}
			}
		}
		if (Static594.aBoolean693) {
			Static260.method8777();
		}
		for (local135 = 0; local135 < (Static594.aBoolean693 ? 2 : 1); local135++) {
			@Pc(470) boolean local470 = local135 == 0;
			@Pc(476) Class115 local476 = local470 ? Static663.aClass115_12 : Static502.aClass115_11;
			local143 = arg2;
			local153 = arg1;
			if (Static594.aBoolean693) {
				Static614.method8490(local470);
				local143 = arg2 + Static101.method1661(local470);
				local153 = arg1 + Static665.method9028(local470);
			}
			@Pc(502) Class43 local502 = local476.aClass43_5;
			for (@Pc(507) Class2_Sub9 local507 = (Class2_Sub9) local502.method1087(); local507 != null; local507 = (Class2_Sub9) local502.method1088()) {
				if ((Static624.aBoolean712 || local507.aClass2_Sub1_20.aByte140 == Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140) && local507.method7266(local143, local153, arg0)) {
					@Pc(542) int local542;
					if (local507.aClass2_Sub1_20 instanceof Class2_Sub1_Sub1) {
						local162 = ((Class2_Sub1_Sub1) local507.aClass2_Sub1_20).aShort118;
						local542 = ((Class2_Sub1_Sub1) local507.aClass2_Sub1_20).aShort121;
					} else {
						local542 = local507.aClass2_Sub1_20.anInt10001 >> 9;
						local162 = local507.aClass2_Sub1_20.anInt10006 >> 9;
					}
					@Pc(674) int local674;
					@Pc(686) int local686;
					@Pc(798) int local798;
					@Pc(568) int local568;
					if (local507.aClass2_Sub1_20 instanceof Class2_Sub1_Sub1_Sub3_Sub1) {
						@Pc(564) Class2_Sub1_Sub1_Sub3_Sub1 local564 = (Class2_Sub1_Sub1_Sub3_Sub1) local507.aClass2_Sub1_20;
						local568 = local564.method4326();
						if ((local568 & 0x1) == 0 && (local564.anInt10006 & 0x1FF) == 0 && (local564.anInt10001 & 0x1FF) == 0 || (local568 & 0x1) == 1 && (local564.anInt10006 & 0x1FF) == 256 && (local564.anInt10001 & 0x1FF) == 256) {
							local281 = local564.anInt10006 - (local564.method4326() - 1 << 8);
							local290 = local564.anInt10001 - (local564.method4326() - 1 << 8);
							for (local301 = 0; local301 < Static133.anInt2316; local301++) {
								@Pc(644) Class6_Sub44 local644 = (Class6_Sub44) Static349.aClass209_32.method5038((long) Static74.anIntArray80[local301]);
								if (local644 != null) {
									@Pc(649) Class2_Sub1_Sub1_Sub3_Sub2 local649 = local644.aClass2_Sub1_Sub1_Sub3_Sub2_2;
									if (local649.anInt5104 != Static90.anInt1698 && local649.aBoolean329) {
										local674 = local649.anInt10006 - (local649.aClass91_1.anInt2346 - 1 << 8);
										local686 = local649.anInt10001 - (local649.aClass91_1.anInt2346 - 1 << 8);
										if (local674 >= local281 && local649.aClass91_1.anInt2346 <= local564.method4326() - (local674 - local281 >> 9) && local686 >= local290 && local649.aClass91_1.anInt2346 <= local564.method4326() - (local686 - local290 >> 9)) {
											Static438.method2190(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140 != local507.aClass2_Sub1_20.aByte140, local649);
											local649.anInt5104 = Static90.anInt1698;
										}
									}
								}
							}
							local312 = Static475.anInt8165;
							@Pc(762) int[] local762 = Static75.anIntArray82;
							for (local674 = 0; local674 < local312; local674++) {
								@Pc(772) Class2_Sub1_Sub1_Sub3_Sub1 local772 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local762[local674]];
								if (local772 != null && Static90.anInt1698 != local772.anInt5104 && local772 != local564 && local772.aBoolean329) {
									local798 = local772.anInt10006 - (local772.method4326() - 1 << 8);
									@Pc(809) int local809 = local772.anInt10001 - (local772.method4326() - 1 << 8);
									if (local798 >= local281 && local772.method4326() <= local564.method4326() - (local798 - local281 >> 9) && local809 >= local290 && local772.method4326() <= local564.method4326() - (local809 - local290 >> 9)) {
										Static78.method1361(local507.aClass2_Sub1_20.aByte140 != Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140, local772);
										local772.anInt5104 = Static90.anInt1698;
									}
								}
							}
						}
						if (Static90.anInt1698 == local564.anInt5104) {
							continue;
						}
						Static78.method1361(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140 != local507.aClass2_Sub1_20.aByte140, local564);
						local564.anInt5104 = Static90.anInt1698;
					}
					if (local507.aClass2_Sub1_20 instanceof Class2_Sub1_Sub1_Sub3_Sub2) {
						@Pc(902) Class2_Sub1_Sub1_Sub3_Sub2 local902 = (Class2_Sub1_Sub1_Sub3_Sub2) local507.aClass2_Sub1_20;
						if (local902.aClass91_1 != null) {
							if ((local902.aClass91_1.anInt2346 & 0x1) == 0 && (local902.anInt10006 & 0x1FF) == 0 && (local902.anInt10001 & 0x1FF) == 0 || (local902.aClass91_1.anInt2346 & 0x1) == 1 && (local902.anInt10006 & 0x1FF) == 256 && (local902.anInt10001 & 0x1FF) == 256) {
								local568 = local902.anInt10006 - (local902.aClass91_1.anInt2346 - 1 << 8);
								local281 = local902.anInt10001 - (local902.aClass91_1.anInt2346 - 1 << 8);
								for (local290 = 0; local290 < Static133.anInt2316; local290++) {
									@Pc(985) Class6_Sub44 local985 = (Class6_Sub44) Static349.aClass209_32.method5038((long) Static74.anIntArray80[local290]);
									if (local985 != null) {
										@Pc(990) Class2_Sub1_Sub1_Sub3_Sub2 local990 = local985.aClass2_Sub1_Sub1_Sub3_Sub2_2;
										if (local990.anInt5104 != Static90.anInt1698 && local990 != local902 && local990.aBoolean329) {
											local361 = local990.anInt10006 - (local990.aClass91_1.anInt2346 - 1 << 8);
											local674 = local990.anInt10001 - (local990.aClass91_1.anInt2346 - 1 << 8);
											if (local361 >= local568 && local990.aClass91_1.anInt2346 <= local902.aClass91_1.anInt2346 - (local361 - local568 >> 9) && local674 >= local281 && local990.aClass91_1.anInt2346 <= local902.aClass91_1.anInt2346 - (local674 - local281 >> 9)) {
												Static438.method2190(local507.aClass2_Sub1_20.aByte140 != Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140, local990);
												local990.anInt5104 = Static90.anInt1698;
											}
										}
									}
								}
								local301 = Static475.anInt8165;
								@Pc(1113) int[] local1113 = Static75.anIntArray82;
								for (local361 = 0; local361 < local301; local361++) {
									@Pc(1123) Class2_Sub1_Sub1_Sub3_Sub1 local1123 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local1113[local361]];
									if (local1123 != null && Static90.anInt1698 != local1123.anInt5104 && local1123.aBoolean329) {
										local686 = local1123.anInt10006 - (local1123.method4326() - 1 << 8);
										local798 = local1123.anInt10001 - (local1123.method4326() - 1 << 8);
										if (local568 <= local686 && local1123.method4326() <= local902.aClass91_1.anInt2346 - (local686 - local568 >> 9) && local281 <= local798 && local1123.method4326() <= local902.aClass91_1.anInt2346 - (local798 - local281 >> 9)) {
											Static78.method1361(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140 != local507.aClass2_Sub1_20.aByte140, local1123);
											local1123.anInt5104 = Static90.anInt1698;
										}
									}
								}
							}
							if (local902.anInt5104 == Static90.anInt1698) {
								continue;
							}
							Static438.method2190(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140 != local507.aClass2_Sub1_20.aByte140, local902);
							local902.anInt5104 = Static90.anInt1698;
						}
					}
					if (local507.aClass2_Sub1_20 instanceof Class2_Sub1_Sub5_Sub1) {
						@Pc(1267) int local1267 = Static534.anInt8753 + local162;
						local568 = Static234.anInt4239 + local542;
						@Pc(1288) Class6_Sub52 local1288 = (Class6_Sub52) Static33.aClass209_3.method5038((long) (local507.aClass2_Sub1_20.aByte140 << 28 | local568 << 14 | local1267));
						if (local1288 != null) {
							local290 = 0;
							@Pc(1298) Class6_Sub3 local1298 = (Class6_Sub3) local1288.aClass362_61.method8542();
							while (local1298 != null) {
								@Pc(1306) Class216 local1306 = Static340.aClass121_1.method2647(local1298.anInt439);
								if (Static291.aBoolean314 && Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140 == local507.aClass2_Sub1_20.aByte140) {
									@Pc(1325) Class325 local1325 = Static127.anInt1401 == -1 ? null : Static280.aClass349_2.method8157(Static127.anInt1401);
									if ((Static255.anInt5389 & 0x1) != 0 && (local1325 == null || local1306.method5149(local1325.anInt9243, Static127.anInt1401) != local1325.anInt9243)) {
										Static200.method2916((long) local290, Static355.aString75, local542, false, (long) local1298.anInt439, Static172.aString32 + " -> <col=ff9040>" + local1306.aString77, 46, Static478.anInt8213, -1, true, local162, false);
									}
								}
								if (local507.aClass2_Sub1_20.aByte140 == Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140) {
									@Pc(1383) String[] local1383 = local1306.aStringArray44;
									for (local674 = 4; local674 >= 0; local674--) {
										if (local1383 != null && local1383[local674] != null) {
											@Pc(1395) byte local1395 = 0;
											if (local674 == 0) {
												local1395 = 18;
											}
											local798 = Static80.anInt1521;
											if (local674 == 1) {
												local1395 = 10;
											}
											if (local674 == 2) {
												local1395 = 16;
											}
											if (local674 == 3) {
												local1395 = 21;
											}
											if (local674 == 4) {
												local1395 = 9;
											}
											if (local1306.anInt6095 == local674) {
												local798 = local1306.anInt6062;
											}
											if (local674 == local1306.anInt6058) {
												local798 = local1306.anInt6100;
											}
											Static200.method2916((long) local290, local1383[local674], local542, false, (long) local1298.anInt439, "<col=ff9040>" + local1306.aString77, local1395, local798, -1, true, local162, false);
										}
									}
								}
								Static200.method2916((long) local290, Static52.aClass41_22.method1007(Static616.anInt10077), local542, local507.aClass2_Sub1_20.aByte140 != Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140, (long) local1298.anInt439, "<col=ff9040>" + local1306.aString77, 1011, Static658.anInt10577, -1, true, local162, false);
								local1298 = (Class6_Sub3) local1288.aClass362_61.method8532();
								local290++;
							}
						}
					}
					if (local507.aClass2_Sub1_20 instanceof Interface18) {
						@Pc(1550) Interface18 local1550 = (Interface18) local507.aClass2_Sub1_20;
						@Pc(1559) Class308 local1559 = Static411.aClass88_3.method2024(local1550.method8469());
						if (local1559.anIntArray566 != null) {
							local1559 = local1559.method7297(Static659.aClass363_3);
						}
						if (local1559 != null) {
							if (Static291.aBoolean314 && Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140 == local507.aClass2_Sub1_20.aByte140) {
								@Pc(1591) Class325 local1591 = Static127.anInt1401 == -1 ? null : Static280.aClass349_2.method8157(Static127.anInt1401);
								if ((Static255.anInt5389 & 0x4) != 0 && (local1591 == null || local1559.method7302(Static127.anInt1401, local1591.anInt9243) != local1591.anInt9243)) {
									Static200.method2916((long) local1550.hashCode(), Static355.aString75, local542, false, Static670.method9087(local542, local1550, local162), Static172.aString32 + " -> <col=00ffff>" + local1559.aString118, 12, Static478.anInt8213, -1, true, local162, false);
								}
							}
							if (local507.aClass2_Sub1_20.aByte140 == Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140) {
								@Pc(1657) String[] local1657 = local1559.aStringArray53;
								if (local1657 != null) {
									for (local290 = 4; local290 >= 0; local290--) {
										if (local1657[local290] != null) {
											@Pc(1669) short local1669 = 0;
											if (local290 == 0) {
												local1669 = 44;
											}
											local312 = Static80.anInt1521;
											if (local290 == 1) {
												local1669 = 50;
											}
											if (local290 == 2) {
												local1669 = 60;
											}
											if (local290 == 3) {
												local1669 = 5;
											}
											if (local290 == 4) {
												local1669 = 1001;
											}
											if (local1559.anInt8611 == local290) {
												local312 = local1559.anInt8599;
											}
											if (local1559.anInt8573 == local290) {
												local312 = local1559.anInt8588;
											}
											Static200.method2916((long) local1550.hashCode(), local1657[local290], local542, false, Static670.method9087(local542, local1550, local162), "<col=00ffff>" + local1559.aString118, local1669, local312, -1, true, local162, false);
										}
									}
								}
								Static200.method2916((long) local1550.hashCode(), Static52.aClass41_22.method1007(Static616.anInt10077), local542, local507.aClass2_Sub1_20.aByte140 != Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140, (long) local1559.anInt8569, "<col=00ffff>" + local1559.aString118, 1003, Static658.anInt10577, -1, true, local162, false);
							}
						}
					}
				}
			}
			if (Static594.aBoolean693) {
				Static260.method8777();
			}
		}
		Static340.method5000(false);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lclient!lm;Lclient!lm;I)V")
	public static void method910(@OriginalArg(0) Class6_Sub4 arg0, @OriginalArg(1) Class6_Sub4 arg1) {
		if (arg1.aClass6_Sub4_66 != null) {
			arg1.method9043();
		}
		arg1.aClass6_Sub4_66 = arg0.aClass6_Sub4_66;
		arg1.aClass6_Sub4_67 = arg0;
		arg1.aClass6_Sub4_66.aClass6_Sub4_67 = arg1;
		arg1.aClass6_Sub4_67.aClass6_Sub4_66 = arg1;
	}
}
