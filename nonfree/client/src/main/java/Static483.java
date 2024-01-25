import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_194 = new Class81(109, -1);

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "[S")
	private static final short[] aShortArray91 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "[S")
	private static final short[] aShortArray92 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "[S")
	private static final short[] aShortArray93 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
	public static int anInt8133 = 765;

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "[S")
	private static final short[] aShortArray94 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "[[S")
	public static final short[][] aShortArrayArray9 = new short[][] { aShortArray91, aShortArray93, aShortArray94, aShortArray92 };

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBIIIII)V")
	public static void method6763(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static60.anInt1505;
		@Pc(9) int[] local9 = Static346.anIntArray413;
		Static349.anInt6142 = 0;
		@Pc(168) int local168;
		@Pc(189) int local189;
		@Pc(245) int local245;
		@Pc(318) int local318;
		@Pc(410) int local410;
		@Pc(852) int local852;
		@Pc(512) int local512;
		for (@Pc(13) int local13 = 0; local13 < Static480.anInt8097 + local7; local13++) {
			@Pc(17) Class162 local17 = null;
			@Pc(33) Class20_Sub2_Sub4_Sub1 local33;
			if (local7 <= local13) {
				local33 = ((Class1_Sub39) Static131.aClass356_32.method7796((long) Static542.anIntArray599[local13 - local7])).aClass20_Sub2_Sub4_Sub1_Sub2_2;
				local17 = ((Class20_Sub2_Sub4_Sub1_Sub2) local33).aClass162_1;
				if (local17.anIntArray267 != null) {
					local17 = local17.method3802(Static121.aClass148_1);
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local33 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local9[local13]];
			}
			if (local33.anInt6424 >= 0 && (local33.anInt6418 == Static473.anInt8020 || local33.aByte116 == Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116)) {
				Static114.method1980(arg1 >> 1, local33.method5347(), local33, arg2 >> 1);
				if (Static480.anIntArray537[0] >= 0) {
					if (local33.aString66 != null && (local13 >= local7 || Static502.anInt8424 == 0 || Static502.anInt8424 == 3 || Static502.anInt8424 == 1 && Static535.method7306(((Class20_Sub2_Sub4_Sub1_Sub1) local33).aString49)) && Static349.anInt6142 < Static441.anInt7701) {
						Static441.anIntArray509[Static349.anInt6142] = Static566.aClass13_15.method463(local33.aString66) / 2;
						Static441.anIntArray508[Static349.anInt6142] = Static480.anIntArray537[0];
						Static441.anIntArray513[Static349.anInt6142] = Static480.anIntArray537[1];
						Static441.anIntArray511[Static349.anInt6142] = local33.anInt6414;
						Static441.anIntArray510[Static349.anInt6142] = local33.anInt6458;
						Static441.anIntArray512[Static349.anInt6142] = local33.anInt6463;
						Static441.aStringArray30[Static349.anInt6142] = local33.aString66;
						Static349.anInt6142++;
					}
					local168 = Static480.anIntArray537[1] + arg0;
					@Pc(230) Class10[] local230;
					@Pc(237) Class318[] local237;
					@Pc(291) Class10 local291;
					if (local33.aBoolean458 || local33.anInt6425 <= Static81.anInt1910) {
						local168 -= Math.max(Static566.aClass13_15.anInt517, Static384.aClass10Array19[0].u());
					} else {
						@Pc(183) byte local183 = 1;
						if (local7 <= local13) {
							local189 = local17.anInt4394;
							if (local189 == -1) {
								local189 = local33.method5346().anInt3977;
							}
						} else {
							@Pc(208) Class20_Sub2_Sub4_Sub1_Sub1 local208 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local9[local13]];
							local189 = local33.method5346().anInt3977;
							if (local208.aBoolean378) {
								local183 = 2;
							}
						}
						@Pc(220) Class10[] local220 = Static384.aClass10Array19;
						if (local189 != -1) {
							local230 = (Class10[]) Static390.aClass326_36.method7238((long) local189);
							if (local230 == null) {
								local237 = Static604.method7068(Static141.aClass111_32, local189);
								if (local237 != null) {
									local230 = new Class10[local237.length];
									for (local245 = 0; local245 < local237.length; local245++) {
										local230[local245] = Static136.aClass12_8.method6434(local237[local245], true);
									}
									Static390.aClass326_36.method7236(local230, (long) local189);
								}
							}
							if (local230 != null && local230.length >= 2) {
								local220 = local230;
							}
						}
						if (local220.length <= local183) {
							local183 = 1;
						}
						@Pc(287) Class10 local287 = local220[0];
						local291 = local220[local183];
						local168 -= Math.max(Static566.aClass13_15.anInt517, local287.u());
						local245 = arg3 + Static480.anIntArray537[0] - (local287.E() >> 1);
						local318 = local287.E() * local33.anInt6395 / 255;
						if (local33.anInt6395 > 0 && local318 < 2) {
							local318 = 2;
						}
						local287.method7679(local245, local168);
						Static136.aClass12_8.V(local245, local168, local245 + local318, local168 + local287.u());
						local291.method7679(local245, local168);
						Static136.aClass12_8.da(arg3, arg0, arg3 + arg1, arg0 - -arg2);
					}
					local168 -= 2;
					if (!local33.aBoolean458) {
						@Pc(393) Class10 local393;
						if (Static81.anInt1910 < local33.anInt6390) {
							local393 = Static484.aClass10Array22[local33.aBoolean459 ? 2 : 0];
							@Pc(402) Class10 local402 = Static484.aClass10Array22[local33.aBoolean459 ? 3 : 1];
							if (local33 instanceof Class20_Sub2_Sub4_Sub1_Sub2) {
								local410 = local17.anInt4404;
								if (local410 == -1) {
									local410 = local33.method5346().anInt3962;
								}
							} else {
								local410 = local33.method5346().anInt3962;
							}
							if (local410 != -1) {
								local230 = (Class10[]) Static492.aClass326_49.method7238((long) local410);
								if (local230 == null) {
									local237 = Static604.method7068(Static141.aClass111_32, local410);
									if (local237 != null) {
										local230 = new Class10[local237.length];
										for (local245 = 0; local245 < local237.length; local245++) {
											local230[local245] = Static136.aClass12_8.method6434(local237[local245], true);
										}
										Static492.aClass326_49.method7236(local230, (long) local410);
									}
								}
								if (local230 != null && local230.length == 4) {
									local393 = local230[local33.aBoolean459 ? 2 : 0];
									local402 = local230[local33.aBoolean459 ? 3 : 1];
								}
							}
							@Pc(505) int local505 = local33.anInt6390 - Static81.anInt1910;
							if (local505 <= local33.anInt6462) {
								local512 = local393.E();
							} else {
								local505 -= local33.anInt6462;
								local245 = local33.anInt6464 == 0 ? 0 : local33.anInt6464 * ((local33.anInt6437 - local505) / local33.anInt6464);
								local512 = local393.E() * local245 / local33.anInt6437;
							}
							local245 = local393.u();
							local168 -= local245;
							local318 = arg3 + Static480.anIntArray537[0] - (local393.E() >> 1);
							local393.method7679(local318, local168);
							Static136.aClass12_8.V(local318, local168, local318 + local512, local168 - -local245);
							local402.method7679(local318, local168);
							Static136.aClass12_8.da(arg3, arg0, arg1 + arg3, arg0 - -arg2);
							local168 -= 2;
						}
						if (local7 > local13) {
							@Pc(643) Class20_Sub2_Sub4_Sub1_Sub1 local643 = (Class20_Sub2_Sub4_Sub1_Sub1) local33;
							if (local643.anInt4926 != -1) {
								local168 -= 25;
								Static192.aClass10Array12[local643.anInt4926].method7679(Static480.anIntArray537[0] + arg3 - 12, local168);
								local168 -= 2;
							}
							if (local643.anInt4925 != -1) {
								local168 -= 25;
								Static114.aClass10Array9[local643.anInt4925].method7679(Static480.anIntArray537[0] + arg3 - 12, local168);
								local168 -= 2;
							}
						} else if (local17.anInt4412 >= 0 && local17.anInt4412 < Static114.aClass10Array9.length) {
							local393 = Static114.aClass10Array9[local17.anInt4412];
							local168 -= 25;
							local393.method7679(arg3 + Static480.anIntArray537[0] - (local393.E() >> 1), local168);
							local168 -= 2;
						}
					}
					@Pc(688) Class221[] local688;
					@Pc(696) Class221 local696;
					if (!(local33 instanceof Class20_Sub2_Sub4_Sub1_Sub1)) {
						local189 = 0;
						local688 = Static276.aClass221Array1;
						for (local410 = 0; local410 < local688.length; local410++) {
							local696 = local688[local410];
							if (local696 != null && local696.anInt6039 == 1 && Static542.anIntArray599[local13 - local7] == local696.anInt6044) {
								local291 = Static30.aClass10Array1[local696.anInt6041];
								if (local291.u() > local189) {
									local189 = local291.u();
								}
								if (Static81.anInt1910 % 20 < 10) {
									local291.method7679(Static480.anIntArray537[0] + arg3 - 12, -local291.u() + local168);
								}
							}
						}
						if (local189 > 0) {
						}
					} else if (local13 >= 0) {
						local189 = 0;
						local688 = Static276.aClass221Array1;
						for (local410 = 0; local410 < local688.length; local410++) {
							local696 = local688[local410];
							if (local696 != null && local696.anInt6039 == 10 && local9[local13] == local696.anInt6044) {
								local291 = Static30.aClass10Array1[local696.anInt6041];
								if (local189 < local291.u()) {
									local189 = local291.u();
								}
								local291.method7679(Static480.anIntArray537[0] + arg3 - 12, -local291.u() + local168);
							}
						}
						if (local189 > 0) {
						}
					}
					for (local189 = 0; local189 < 4; local189++) {
						if (Static81.anInt1910 < local33.anIntArray433[local189]) {
							local852 = local33.method5347() / 2;
							Static114.method1980(arg1 >> 1, local852, local33, arg2 >> 1);
							if (Static480.anIntArray537[0] > -1) {
								local410 = Static344.aClass10Array16[local33.anIntArray432[local189]].E();
								if (local189 == 1) {
									Static480.anIntArray537[1] -= 20;
								}
								if (local189 == 2) {
									Static480.anIntArray537[1] -= 10;
									Static480.anIntArray537[0] -= local410 - 9;
								}
								if (local189 == 3) {
									Static480.anIntArray537[0] += local410 - 9;
									Static480.anIntArray537[1] -= 10;
								}
								Static344.aClass10Array16[local33.anIntArray432[local189]].method7679(Static480.anIntArray537[0] + arg3 - (local410 >> 1), Static480.anIntArray537[1] + -12 + arg0);
								Static443.aClass35_11.method4942(0, arg3 + Static480.anIntArray537[0] - 1, -1, Integer.toString(local33.anIntArray430[local189]), Static480.anIntArray537[1] + arg0 + 3);
							}
						}
					}
				}
			}
		}
		@Pc(993) int local993;
		for (@Pc(987) int local987 = 0; local987 < Static565.anInt9242; local987++) {
			local993 = Static63.anIntArray83[local987];
			@Pc(1002) Class20_Sub2_Sub4_Sub1 local1002;
			if (local993 < 2048) {
				local1002 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local993];
			} else {
				local1002 = ((Class1_Sub39) Static131.aClass356_32.method7796((long) (local993 - 2048))).aClass20_Sub2_Sub4_Sub1_Sub2_2;
			}
			local189 = Static453.anIntArray515[local987];
			@Pc(1027) Class20_Sub2_Sub4_Sub1 local1027;
			if (local189 < 2048) {
				local1027 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local189];
			} else {
				local1027 = ((Class1_Sub39) Static131.aClass356_32.method7796((long) (local189 - 2048))).aClass20_Sub2_Sub4_Sub1_Sub2_2;
			}
			Static539.method7335(local1027, arg3, arg2, arg0, local1002, arg1, --local1002.anInt6433);
		}
		local993 = Static566.aClass13_15.anInt510 + Static566.aClass13_15.anInt517 + 2;
		for (local168 = 0; local168 < Static349.anInt6142; local168++) {
			local189 = Static441.anIntArray508[local168];
			local852 = Static441.anIntArray513[local168];
			local410 = Static441.anIntArray509[local168];
			@Pc(1092) boolean local1092 = true;
			while (local1092) {
				local1092 = false;
				for (local512 = 0; local512 < local168; local512++) {
					if (local852 + 2 > -local993 + Static441.anIntArray513[local512] && Static441.anIntArray513[local512] + 2 > -local993 + local852 && local189 - local410 < Static441.anIntArray509[local512] + Static441.anIntArray508[local512] && Static441.anIntArray508[local512] - Static441.anIntArray509[local512] < local410 + local189 && local852 > Static441.anIntArray513[local512] - local993) {
						local1092 = true;
						local852 = Static441.anIntArray513[local512] - local993;
					}
				}
			}
			Static441.anIntArray513[local168] = local852;
			@Pc(1194) String local1194 = Static441.aStringArray30[local168];
			if (Static365.anInt6483 == 0) {
				local245 = 16776960;
				if (Static441.anIntArray511[local168] < 6) {
					local245 = Static35.anIntArray34[Static441.anIntArray511[local168]];
				}
				if (Static441.anIntArray511[local168] == 6) {
					local245 = Static473.anInt8020 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static441.anIntArray511[local168] == 7) {
					local245 = Static473.anInt8020 % 20 >= 10 ? 65535 : 255;
				}
				if (Static441.anIntArray511[local168] == 8) {
					local245 = Static473.anInt8020 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static441.anIntArray511[local168] == 9) {
					local318 = 150 - Static441.anIntArray512[local168];
					if (local318 < 50) {
						local245 = local318 * 1280 + 16711680;
					} else if (local318 < 100) {
						local245 = 16384000 + 16776960 - local318 * 327680;
					} else if (local318 < 150) {
						local245 = (local318 - 100) * 5 + 65280;
					}
				}
				if (Static441.anIntArray511[local168] == 10) {
					local318 = 150 - Static441.anIntArray512[local168];
					if (local318 < 50) {
						local245 = local318 * 5 + 16711680;
					} else if (local318 < 100) {
						local245 = 16711935 + 16384000 - local318 * 327680;
					} else if (local318 < 150) {
						local245 = local318 * 327680 + 255 - (local318 - 100) * 5 - 32768000;
					}
				}
				if (Static441.anIntArray511[local168] == 11) {
					local318 = 150 - Static441.anIntArray512[local168];
					if (local318 < 50) {
						local245 = 16777215 - local318 * 327685;
					} else if (local318 < 100) {
						local245 = local318 * 327685 - 16318970;
					} else if (local318 < 150) {
						local245 = 32768000 + 16777215 - local318 * 327680;
					}
				}
				local318 = local245 | 0xFF000000;
				if (Static441.anIntArray510[local168] == 0) {
					Static260.aClass35_7.method4942(-16777216, arg3 + local189, local318, local1194, local852 + arg0);
				}
				if (Static441.anIntArray510[local168] == 1) {
					Static260.aClass35_7.method4941(local318, local1194, Static473.anInt8020, arg3 + local189, local852 + arg0);
				}
				if (Static441.anIntArray510[local168] == 2) {
					Static260.aClass35_7.method4951(local189 + arg3, Static473.anInt8020, local852 + arg0, local1194, local318);
				}
				if (Static441.anIntArray510[local168] == 3) {
					Static260.aClass35_7.method4948(arg0 + local852, Static473.anInt8020, 150 - Static441.anIntArray512[local168], local189 + arg3, local318, local1194);
				}
				@Pc(1533) int local1533;
				if (Static441.anIntArray510[local168] == 4) {
					local1533 = (150 - Static441.anIntArray512[local168]) * (Static566.aClass13_15.method463(local1194) + 100) / 150;
					Static136.aClass12_8.V(local189 + arg3 - 50, arg0, local189 + arg3 + 50, arg0 + arg2);
					Static260.aClass35_7.method4935(local189 + arg3 + 50 - local1533, local318, arg0 + local852, local1194, -16777216);
					Static136.aClass12_8.da(arg3, arg0, arg3 + arg1, arg0 + arg2);
				}
				if (Static441.anIntArray510[local168] == 5) {
					local1533 = 150 - Static441.anIntArray512[local168];
					@Pc(1593) int local1593 = 0;
					if (local1533 < 25) {
						local1593 = local1533 - 25;
					} else if (local1533 > 125) {
						local1593 = local1533 - 125;
					}
					@Pc(1617) int local1617 = Static566.aClass13_15.anInt510 + Static566.aClass13_15.anInt517;
					Static136.aClass12_8.V(arg3, local852 + arg0 - local1617 - 1, arg3 - -arg1, arg0 + local852 + 5);
					Static260.aClass35_7.method4942(-16777216, arg3 + local189, local318, local1194, local1593 + arg0 + local852);
					Static136.aClass12_8.da(arg3, arg0, arg3 + arg1, arg0 - -arg2);
				}
			} else {
				Static260.aClass35_7.method4942(-16777216, local189 + arg3, -256, local1194, arg0 + local852);
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method6765(@OriginalArg(0) String arg0) {
		if (Static254.aClass69Array1 != null) {
			@Pc(15) Class1_Sub48 local15 = Static320.method4867(Static442.aClass170_2, Static87.aClass319_39);
			local15.aClass1_Sub20_Sub1_2.method4378(Static419.method5867(arg0));
			local15.aClass1_Sub20_Sub1_2.method4399(arg0);
			Static34.method813(local15);
		}
	}
}
