import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!m", name = "b", descriptor = "Lclient!sj;")
	public static Class181 aClass181_32;

	@OriginalMember(owner = "client!m", name = "r", descriptor = "[Lclient!pg;")
	public static Class158[] aClass158Array2;

	@OriginalMember(owner = "client!m", name = "w", descriptor = "[Lclient!um;")
	public static Class204[] aClass204Array1;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "[I")
	public static final int[] anIntArray303 = new int[128];

	@OriginalMember(owner = "client!m", name = "x", descriptor = "Lclient!bo;")
	public static Class24 aClass24_21 = new Class24(8);

	@OriginalMember(owner = "client!m", name = "y", descriptor = "[I")
	public static final int[] anIntArray304 = new int[13];

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I[II)[I")
	public static int[] method3388(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(8) int[] local8 = new int[1152];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			for (@Pc(19) int local19 = 0; local19 < 36; local19++) {
				@Pc(25) int local25 = arg1[local10];
				if (local25 == 0) {
					if (local19 > 0 && arg1[local10 - 1] != 0) {
						local25 = arg0;
					} else if (local12 > 0 && arg1[local10 - 36] != 0) {
						local25 = arg0;
					} else if (local19 < 35 && arg1[local10 + 1] != 0) {
						local25 = arg0;
					} else if (local12 < 31 && arg1[local10 + 36] != 0) {
						local25 = arg0;
					}
				}
				local8[local10++] = local25;
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([III[II)V")
	public static void method3392(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(11) int local11 = (arg1 + arg2) / 2;
		@Pc(13) int local13 = arg1;
		@Pc(17) int local17 = arg3[local11];
		arg3[local11] = arg3[arg2];
		arg3[arg2] = local17;
		@Pc(31) int local31 = arg0[local11];
		arg0[local11] = arg0[arg2];
		arg0[arg2] = local31;
		for (@Pc(43) int local43 = arg1; local43 < arg2; local43++) {
			if (arg3[local43] < local17 + (local43 & 0x1)) {
				@Pc(63) int local63 = arg3[local43];
				arg3[local43] = arg3[local13];
				arg3[local13] = local63;
				@Pc(77) int local77 = arg0[local43];
				arg0[local43] = arg0[local13];
				arg0[local13++] = local77;
			}
		}
		arg3[arg2] = arg3[local13];
		arg3[local13] = local17;
		arg0[arg2] = arg0[local13];
		arg0[local13] = local31;
		method3392(arg0, arg1, local13 - 1, arg3);
		method3392(arg0, local13 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)I")
	public static int method3394(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
	public static void method3399() {
		if (Static71.anInt5326 == 0 || Static71.anInt5326 == 5) {
			return;
		}
		try {
			if (++Static266.anInt5363 > 2000) {
				if (Static76.aClass16_2 != null) {
					Static76.aClass16_2.method392();
					Static76.aClass16_2 = null;
				}
				if (Static110.anInt2318 >= 1) {
					Static71.anInt5326 = 0;
					Static84.anInt1683 = -5;
					return;
				}
				if (Static47.anInt1037 == Static342.anInt6677) {
					Static342.anInt6677 = Static230.anInt6570;
				} else {
					Static342.anInt6677 = Static47.anInt1037;
				}
				Static110.anInt2318++;
				Static266.anInt5363 = 0;
				Static71.anInt5326 = 1;
			}
			if (Static71.anInt5326 == 1) {
				Static277.aClass207_7 = Static353.aClass42_5.method960(Static342.anInt6677, Static346.aString255);
				Static71.anInt5326 = 2;
			}
			if (Static71.anInt5326 == 2) {
				if (Static277.aClass207_7.anInt6346 == 2) {
					throw new IOException();
				}
				if (Static277.aClass207_7.anInt6346 != 1) {
					return;
				}
				Static76.aClass16_2 = new Class16((Socket) Static277.aClass207_7.anObject7, Static353.aClass42_5);
				Static277.aClass207_7 = null;
				@Pc(120) long local120 = Static46.aLong37 = Static334.method5497(Static88.aString59);
				@Pc(127) int local127 = (int) (local120 >> 16 & 0x1FL);
				Static291.aClass3_Sub4_Sub2_3.anInt4268 = 0;
				Static291.aClass3_Sub4_Sub2_3.method3614(14);
				Static291.aClass3_Sub4_Sub2_3.method3614(local127);
				Static76.aClass16_2.method397(Static291.aClass3_Sub4_Sub2_3.aByteArray70, 2);
				if (Static348.aClass30_2 != null) {
					Static348.aClass30_2.method4515();
				}
				if (Static194.aClass30_1 != null) {
					Static194.aClass30_1.method4515();
				}
				@Pc(161) int local161 = Static76.aClass16_2.method394();
				if (Static348.aClass30_2 != null) {
					Static348.aClass30_2.method4515();
				}
				if (Static194.aClass30_1 != null) {
					Static194.aClass30_1.method4515();
				}
				if (local161 != 0) {
					Static71.anInt5326 = 0;
					Static84.anInt1683 = local161;
					Static76.aClass16_2.method392();
					Static76.aClass16_2 = null;
					return;
				}
				Static71.anInt5326 = 3;
			}
			if (Static71.anInt5326 == 3) {
				if (Static76.aClass16_2.method391() < 8) {
					return;
				}
				Static76.aClass16_2.method398(Static20.aClass3_Sub4_Sub2_1.aByteArray70, 0, 8);
				Static20.aClass3_Sub4_Sub2_1.anInt4268 = 0;
				Static338.aLong206 = Static20.aClass3_Sub4_Sub2_1.method3641();
				@Pc(216) int[] local216 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static338.aLong206 >> 32), (int) Static338.aLong206 };
				Static291.aClass3_Sub4_Sub2_3.anInt4268 = 0;
				Static291.aClass3_Sub4_Sub2_3.method3614(10);
				Static291.aClass3_Sub4_Sub2_3.method3650(local216[0]);
				Static291.aClass3_Sub4_Sub2_3.method3650(local216[1]);
				Static291.aClass3_Sub4_Sub2_3.method3650(local216[2]);
				Static291.aClass3_Sub4_Sub2_3.method3650(local216[3]);
				Static291.aClass3_Sub4_Sub2_3.method3668(Static334.method5497(Static88.aString59));
				Static291.aClass3_Sub4_Sub2_3.method3624(Static15.aString7);
				Static291.aClass3_Sub4_Sub2_3.method3626(Static248.aBigInteger2, Static41.aBigInteger1);
				Static58.aClass3_Sub4_Sub2_2.anInt4268 = 0;
				if (Static266.anInt5370 == 40) {
					Static58.aClass3_Sub4_Sub2_2.method3614(18);
				} else {
					Static58.aClass3_Sub4_Sub2_2.method3614(16);
				}
				Static58.aClass3_Sub4_Sub2_2.method3660(Static291.aClass3_Sub4_Sub2_3.anInt4268 + Static54.method909(Static230.aString248) + 161);
				Static58.aClass3_Sub4_Sub2_2.method3650(556);
				Static58.aClass3_Sub4_Sub2_2.method3614(Static57.anInt1247);
				Static58.aClass3_Sub4_Sub2_2.method3614(Static205.method34());
				Static58.aClass3_Sub4_Sub2_2.method3660(Static298.anInt5944);
				Static58.aClass3_Sub4_Sub2_2.method3660(Static171.anInt3583);
				Static58.aClass3_Sub4_Sub2_2.method3614(Static135.anInt2792);
				Static112.method1933(Static58.aClass3_Sub4_Sub2_2);
				Static58.aClass3_Sub4_Sub2_2.method3624(Static230.aString248);
				Static58.aClass3_Sub4_Sub2_2.method3650(Static329.anInt6344);
				Static58.aClass3_Sub4_Sub2_2.method3650(Static192.method3421());
				Static137.aBoolean143 = true;
				Static58.aClass3_Sub4_Sub2_2.method3660(Static214.anInt4356);
				Static58.aClass3_Sub4_Sub2_2.method3650(Static192.aClass100_84.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static44.aClass100_17.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static296.aClass100_115.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static178.aClass100_75.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static3.aClass100_1.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static50.aClass100_20.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static244.aClass100_98.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static100.aClass100_38.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static317.aClass100_112.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static118.aClass100_51.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static185.aClass100_82.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static293.aClass100_121.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static69.aClass100_25.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static86.aClass100_86.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static90.aClass100_34.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static102.aClass100_39.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static227.aClass100_95.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static277.aClass100_111.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static175.aClass100_74.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static107.aClass100_45.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static147.aClass100_63.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static38.aClass100_14.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static72.aClass100_26.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static124.aClass100_58.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static185.aClass100_83.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static179.aClass100_80.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static179.aClass100_81.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static102.aClass100_40.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3650(Static125.aClass100_60.method2283());
				Static58.aClass3_Sub4_Sub2_2.method3662(Static291.aClass3_Sub4_Sub2_3.anInt4268, Static291.aClass3_Sub4_Sub2_3.aByteArray70);
				Static76.aClass16_2.method397(Static58.aClass3_Sub4_Sub2_2.aByteArray70, Static58.aClass3_Sub4_Sub2_2.anInt4268);
				Static291.aClass3_Sub4_Sub2_3.method3687(local216);
				for (@Pc(573) int local573 = 0; local573 < 4; local573++) {
					local216[local573] += 50;
				}
				Static20.aClass3_Sub4_Sub2_1.method3687(local216);
				Static71.anInt5326 = 4;
			}
			if (Static71.anInt5326 == 4) {
				if (Static76.aClass16_2.method391() < 1) {
					return;
				}
				@Pc(607) int local607 = Static76.aClass16_2.method394();
				if (local607 == 21) {
					Static71.anInt5326 = 7;
				} else if (local607 == 29) {
					Static71.anInt5326 = 10;
				} else if (local607 == 1) {
					Static71.anInt5326 = 5;
					Static84.anInt1683 = local607;
					return;
				} else if (local607 == 2) {
					Static71.anInt5326 = 8;
				} else if (local607 == 15) {
					Static71.anInt5326 = 0;
					Static84.anInt1683 = local607;
					return;
				} else if (local607 == 23 && Static110.anInt2318 < 1) {
					Static110.anInt2318++;
					Static71.anInt5326 = 1;
					Static266.anInt5363 = 0;
					Static76.aClass16_2.method392();
					Static76.aClass16_2 = null;
					return;
				} else {
					Static71.anInt5326 = 0;
					Static84.anInt1683 = local607;
					Static76.aClass16_2.method392();
					Static76.aClass16_2 = null;
					return;
				}
			}
			if (Static71.anInt5326 == 6) {
				Static291.aClass3_Sub4_Sub2_3.anInt4268 = 0;
				Static291.aClass3_Sub4_Sub2_3.method3682(17);
				Static76.aClass16_2.method397(Static291.aClass3_Sub4_Sub2_3.aByteArray70, Static291.aClass3_Sub4_Sub2_3.anInt4268);
				Static71.anInt5326 = 4;
			} else if (Static71.anInt5326 == 7) {
				if (Static76.aClass16_2.method391() >= 1) {
					Static10.anInt249 = Static76.aClass16_2.method394() * 60 + 180;
					Static71.anInt5326 = 0;
					Static84.anInt1683 = 21;
					Static76.aClass16_2.method392();
					Static76.aClass16_2 = null;
				}
			} else if (Static71.anInt5326 != 10) {
				if (Static71.anInt5326 == 8) {
					if (Static76.aClass16_2.method391() < 14) {
						return;
					}
					Static76.aClass16_2.method398(Static20.aClass3_Sub4_Sub2_1.aByteArray70, 0, 14);
					Static20.aClass3_Sub4_Sub2_1.anInt4268 = 0;
					Static350.anInt6800 = Static20.aClass3_Sub4_Sub2_1.method3643();
					Static234.anInt5172 = Static20.aClass3_Sub4_Sub2_1.method3643();
					Static284.aBoolean376 = Static20.aClass3_Sub4_Sub2_1.method3643() == 1;
					Static161.aBoolean170 = Static20.aClass3_Sub4_Sub2_1.method3643() == 1;
					Static218.aBoolean253 = Static20.aClass3_Sub4_Sub2_1.method3643() == 1;
					Static160.aBoolean168 = Static20.aClass3_Sub4_Sub2_1.method3643() == 1;
					Static9.aBoolean19 = Static20.aClass3_Sub4_Sub2_1.method3643() == 1;
					Static312.anInt6280 = Static20.aClass3_Sub4_Sub2_1.method3649();
					Static110.aBoolean121 = Static20.aClass3_Sub4_Sub2_1.method3643() == 1;
					Static126.aBoolean251 = Static20.aClass3_Sub4_Sub2_1.method3643() == 1;
					Static257.method4346(Static126.aBoolean251);
					Static106.method1814(Static126.aBoolean251);
					Static258.method4377(Static126.aBoolean251);
					if (Static284.aBoolean376 && !Static218.aBoolean253 || Static110.aBoolean121) {
						try {
							Static361.method2055("zap", Static353.aClass42_5.anApplet1);
						} catch (@Pc(886) Throwable local886) {
						}
					} else {
						try {
							Static361.method2055("unzap", Static353.aClass42_5.anApplet1);
						} catch (@Pc(898) Throwable local898) {
						}
					}
					if (Static113.anInt6411 == 0) {
						try {
							Static361.method2055("loggedin", Static353.aClass42_5.anApplet1);
						} catch (@Pc(909) Throwable local909) {
						}
					}
					Static92.anInt1818 = Static20.aClass3_Sub4_Sub2_1.method3686();
					Static306.anInt6046 = Static20.aClass3_Sub4_Sub2_1.method3649();
					Static71.anInt5326 = 9;
				}
				if (Static71.anInt5326 == 9 && Static76.aClass16_2.method391() >= Static306.anInt6046) {
					Static20.aClass3_Sub4_Sub2_1.anInt4268 = 0;
					Static76.aClass16_2.method398(Static20.aClass3_Sub4_Sub2_1.aByteArray70, 0, Static306.anInt6046);
					Static84.anInt1683 = 2;
					Static71.anInt5326 = 0;
					Static167.method2703();
					Static16.anInt512 = -1;
					Static329.method5376(false);
					Static92.anInt1818 = -1;
				}
			} else if (Static76.aClass16_2.method391() >= 1) {
				Static182.anInt3880 = Static76.aClass16_2.method394();
				Static71.anInt5326 = 0;
				Static84.anInt1683 = 29;
				Static76.aClass16_2.method392();
				Static76.aClass16_2 = null;
			}
		} catch (@Pc(960) IOException local960) {
			if (Static76.aClass16_2 != null) {
				Static76.aClass16_2.method392();
				Static76.aClass16_2 = null;
			}
			if (Static110.anInt2318 < 1) {
				if (Static342.anInt6677 == Static47.anInt1037) {
					Static342.anInt6677 = Static230.anInt6570;
				} else {
					Static342.anInt6677 = Static47.anInt1037;
				}
				Static71.anInt5326 = 1;
				Static110.anInt2318++;
				Static266.anInt5363 = 0;
			} else {
				Static84.anInt1683 = -4;
				Static71.anInt5326 = 0;
			}
		}
	}
}
