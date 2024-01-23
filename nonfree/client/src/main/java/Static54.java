import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "Lclient!pa;")
	public static Class86 aClass86_17;

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "[[Lclient!qh;")
	public static Class93[][] aClass93ArrayArray1;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "Lclient!ad;")
	public static Class4 aClass4_2 = new Class4(64);

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "Lclient!qh;")
	public static Class93 aClass93_35 = null;

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "Lclient!hh;")
	private static Class50 aClass50_382 = Static186.method3527("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "Lclient!hh;")
	public static Class50 aClass50_383 = aClass50_382;

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
	public static int anInt1079 = 0;

	@OriginalMember(owner = "client!eh", name = "o", descriptor = "Lclient!hh;")
	public static Class50 aClass50_384 = Static186.method3527(")1j");

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
	public static void method807() {
		if (Static226.anInt4351 == 0 || Static226.anInt4351 == 5) {
			return;
		}
		try {
			if (++Static8.anInt183 > 2000) {
				if (Static33.aClass26_2 != null) {
					Static33.aClass26_2.method776();
					Static33.aClass26_2 = null;
				}
				if (Static57.anInt1132 >= 1) {
					Static226.anInt4351 = 0;
					Static133.anInt2753 = -5;
					return;
				}
				Static8.anInt183 = 0;
				Static57.anInt1132++;
				if (Static14.anInt261 == Static8.anInt192) {
					Static14.anInt261 = Static8.anInt188;
				} else {
					Static14.anInt261 = Static8.anInt192;
				}
				Static226.anInt4351 = 1;
			}
			if (Static226.anInt4351 == 1) {
				Static153.aClass116_4 = Static4.aClass87_1.method2686(Static14.anInt261, Static20.aString1);
				Static226.anInt4351 = 2;
			}
			if (Static226.anInt4351 == 2) {
				if (Static153.aClass116_4.anInt4156 == 2) {
					throw new IOException();
				}
				if (Static153.aClass116_4.anInt4156 != 1) {
					return;
				}
				Static33.aClass26_2 = new Class26((Socket) Static153.aClass116_4.anObject5, Static4.aClass87_1);
				Static153.aClass116_4 = null;
				@Pc(99) long local99 = Static148.aLong122 = Static7.aClass50_67.method1221();
				@Pc(106) int local106 = (int) (local99 >> 16 & 0x1FL);
				Static32.aClass1_Sub17_Sub1_1.anInt2656 = 0;
				Static32.aClass1_Sub17_Sub1_1.method2175(14);
				Static32.aClass1_Sub17_Sub1_1.method2175(local106);
				Static33.aClass26_2.method781(Static32.aClass1_Sub17_Sub1_1.aByteArray40, 2);
				if (Static58.aClass48_1 != null) {
					Static58.aClass48_1.method3221();
				}
				if (Static132.aClass48_2 != null) {
					Static132.aClass48_2.method3221();
				}
				@Pc(142) int local142 = Static33.aClass26_2.method782();
				if (Static58.aClass48_1 != null) {
					Static58.aClass48_1.method3221();
				}
				if (Static132.aClass48_2 != null) {
					Static132.aClass48_2.method3221();
				}
				if (local142 != 0) {
					Static133.anInt2753 = local142;
					Static226.anInt4351 = 0;
					Static33.aClass26_2.method776();
					Static33.aClass26_2 = null;
					return;
				}
				Static226.anInt4351 = 3;
			}
			if (Static226.anInt4351 == 3) {
				if (Static33.aClass26_2.method777() < 8) {
					return;
				}
				@Pc(183) int[] local183 = new int[4];
				Static33.aClass26_2.method779(Static97.aClass1_Sub17_Sub1_2.aByteArray40, 8, 0);
				Static97.aClass1_Sub17_Sub1_2.anInt2656 = 0;
				Static133.aLong111 = Static97.aClass1_Sub17_Sub1_2.method2172();
				local183[3] = (int) Static133.aLong111;
				local183[1] = (int) (Math.random() * 9.9999999E7D);
				local183[2] = (int) (Static133.aLong111 >> 32);
				Static32.aClass1_Sub17_Sub1_1.anInt2656 = 0;
				local183[0] = (int) (Math.random() * 9.9999999E7D);
				Static32.aClass1_Sub17_Sub1_1.method2175(10);
				Static32.aClass1_Sub17_Sub1_1.method2124(local183[0]);
				Static32.aClass1_Sub17_Sub1_1.method2124(local183[1]);
				Static32.aClass1_Sub17_Sub1_1.method2124(local183[2]);
				Static32.aClass1_Sub17_Sub1_1.method2124(local183[3]);
				Static32.aClass1_Sub17_Sub1_1.method2171(Static7.aClass50_67.method1221());
				Static32.aClass1_Sub17_Sub1_1.method2174(Static7.aClass50_68);
				Static32.aClass1_Sub17_Sub1_1.method2170(Static34.aBigInteger1, Static201.aBigInteger4);
				Static225.aClass1_Sub17_Sub1_3.anInt2656 = 0;
				if (Static220.anInt4304 == 40) {
					Static225.aClass1_Sub17_Sub1_3.method2175(18);
				} else {
					Static225.aClass1_Sub17_Sub1_3.method2175(16);
				}
				Static225.aClass1_Sub17_Sub1_3.method2151(Static32.aClass1_Sub17_Sub1_1.anInt2656 + Static121.method1936(Static38.aClass50_302) + 150);
				Static225.aClass1_Sub17_Sub1_3.method2124(506);
				Static225.aClass1_Sub17_Sub1_3.method2175(Static22.anInt427);
				Static225.aClass1_Sub17_Sub1_3.method2175(0);
				Static225.aClass1_Sub17_Sub1_3.method2151(Static185.anInt3844);
				Static225.aClass1_Sub17_Sub1_3.method2151(Static48.anInt1023);
				Static193.method2473(Static225.aClass1_Sub17_Sub1_3);
				Static225.aClass1_Sub17_Sub1_3.method2174(Static38.aClass50_302);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static107.anInt2137);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static206.method3255());
				Static91.aBoolean192 = true;
				Static225.aClass1_Sub17_Sub1_3.method2124(Static109.aClass86_Sub1_25.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static60.aClass86_Sub1_10.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static64.aClass86_Sub1_12.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static65.aClass86_Sub1_38.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static38.aClass86_Sub1_6.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static136.aClass86_Sub1_16.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static58.aClass86_Sub1_9.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static92.aClass86_Sub1_20.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static141.aClass86_Sub1_33.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static27.aClass86_Sub1_4.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static66.aClass86_Sub1_14.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static212.aClass86_Sub1_41.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static197.aClass86_Sub1_43.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static25.aClass86_Sub1_2.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static32.aClass86_Sub1_5.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static221.aClass86_Sub1_42.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static119.aClass86_Sub1_26.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static25.aClass86_Sub1_3.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static13.aClass86_Sub1_1.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static166.aClass86_Sub1_32.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static92.aClass86_Sub1_21.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static120.aClass86_Sub1_27.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static206.aClass86_Sub1_37.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static204.aClass86_Sub1_36.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static190.aClass86_Sub1_34.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static104.aClass86_Sub1_22.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2124(Static209.aClass86_Sub1_40.anInt4243);
				Static225.aClass1_Sub17_Sub1_3.method2158(Static32.aClass1_Sub17_Sub1_1.aByteArray40, Static32.aClass1_Sub17_Sub1_1.anInt2656);
				Static33.aClass26_2.method781(Static225.aClass1_Sub17_Sub1_3.aByteArray40, Static225.aClass1_Sub17_Sub1_3.anInt2656);
				Static32.aClass1_Sub17_Sub1_1.method2191(local183);
				for (@Pc(521) int local521 = 0; local521 < 4; local521++) {
					local183[local521] += 50;
				}
				Static97.aClass1_Sub17_Sub1_2.method2191(local183);
				Static226.anInt4351 = 4;
			}
			if (Static226.anInt4351 == 4) {
				if (Static33.aClass26_2.method777() < 1) {
					return;
				}
				@Pc(555) int local555 = Static33.aClass26_2.method782();
				if (local555 == 21) {
					Static226.anInt4351 = 7;
				} else if (local555 == 1) {
					Static226.anInt4351 = 5;
					Static133.anInt2753 = local555;
					return;
				} else if (local555 == 2) {
					Static226.anInt4351 = 8;
				} else if (local555 == 15) {
					Static133.anInt2753 = local555;
					Static226.anInt4351 = 0;
					return;
				} else if (local555 == 23 && Static57.anInt1132 < 1) {
					Static8.anInt183 = 0;
					Static226.anInt4351 = 1;
					Static57.anInt1132++;
					Static33.aClass26_2.method776();
					Static33.aClass26_2 = null;
					return;
				} else {
					Static133.anInt2753 = local555;
					Static226.anInt4351 = 0;
					Static33.aClass26_2.method776();
					Static33.aClass26_2 = null;
					return;
				}
			}
			if (Static226.anInt4351 == 6) {
				Static32.aClass1_Sub17_Sub1_1.anInt2656 = 0;
				Static32.aClass1_Sub17_Sub1_1.method2182(17);
				Static33.aClass26_2.method781(Static32.aClass1_Sub17_Sub1_1.aByteArray40, Static32.aClass1_Sub17_Sub1_1.anInt2656);
				Static226.anInt4351 = 4;
				return;
			}
			if (Static226.anInt4351 == 7) {
				if (Static33.aClass26_2.method777() < 1) {
					return;
				}
				Static193.anInt3061 = Static33.aClass26_2.method782() * 60 + 180;
				Static226.anInt4351 = 0;
				Static133.anInt2753 = 21;
				Static33.aClass26_2.method776();
				Static33.aClass26_2 = null;
				return;
			}
			if (Static226.anInt4351 == 8) {
				if (Static33.aClass26_2.method777() < 11) {
					return;
				}
				Static33.aClass26_2.method779(Static97.aClass1_Sub17_Sub1_2.aByteArray40, 11, 0);
				Static97.aClass1_Sub17_Sub1_2.anInt2656 = 0;
				Static122.anInt2447 = Static97.aClass1_Sub17_Sub1_2.method2142();
				Static5.anInt101 = Static97.aClass1_Sub17_Sub1_2.method2142();
				Static138.anInt2817 = Static97.aClass1_Sub17_Sub1_2.method2142();
				if (Static138.anInt2817 == 1) {
					try {
						Static113.aClass50_783.method1217(Static4.aClass87_1.anApplet1);
					} catch (@Pc(713) Throwable local713) {
					}
				} else {
					try {
						Static125.aClass50_866.method1217(Static4.aClass87_1.anApplet1);
					} catch (@Pc(723) Throwable local723) {
					}
				}
				Static47.anInt979 = Static97.aClass1_Sub17_Sub1_2.method2142();
				Static223.aBoolean210 = Static97.aClass1_Sub17_Sub1_2.method2142() == 1;
				Static20.anInt417 = Static97.aClass1_Sub17_Sub1_2.method2178();
				Static65.anInt4126 = Static97.aClass1_Sub17_Sub1_2.method2142();
				Static157.anInt3267 = Static97.aClass1_Sub17_Sub1_2.method2187();
				Static217.anInt4289 = Static97.aClass1_Sub17_Sub1_2.method2178();
				Static226.anInt4351 = 9;
			}
			if (Static226.anInt4351 == 9) {
				if (Static33.aClass26_2.method777() < Static217.anInt4289) {
					return;
				}
				Static97.aClass1_Sub17_Sub1_2.anInt2656 = 0;
				Static33.aClass26_2.method779(Static97.aClass1_Sub17_Sub1_2.aByteArray40, Static217.anInt4289, 0);
				Static133.anInt2753 = 2;
				Static226.anInt4351 = 0;
				Static114.method1844();
				Static11.anInt230 = -1;
				Static63.method972(false);
				Static157.anInt3267 = -1;
				return;
			}
		} catch (@Pc(793) IOException local793) {
			if (Static33.aClass26_2 != null) {
				Static33.aClass26_2.method776();
				Static33.aClass26_2 = null;
			}
			if (Static57.anInt1132 >= 1) {
				Static133.anInt2753 = -4;
				Static226.anInt4351 = 0;
			} else {
				Static8.anInt183 = 0;
				Static57.anInt1132++;
				Static226.anInt4351 = 1;
				if (Static8.anInt192 == Static14.anInt261) {
					Static14.anInt261 = Static8.anInt188;
				} else {
					Static14.anInt261 = Static8.anInt192;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V")
	public static void method808() {
		for (@Pc(6) Class1_Sub1_Sub16 local6 = (Class1_Sub1_Sub16) Static156.aClass75_16.method2239(); local6 != null; local6 = (Class1_Sub1_Sub16) Static156.aClass75_16.method2238()) {
			@Pc(20) Class20_Sub6 local20 = local6.aClass20_Sub6_1;
			if (local20.anInt4031 != Static212.anInt4195 || local20.anInt4046 < Static107.anInt2132) {
				local6.method3525();
			} else if (local20.anInt4047 <= Static107.anInt2132) {
				if (local20.anInt4045 > 0) {
					@Pc(57) Class20_Sub3_Sub2 local57 = Static78.aClass20_Sub3_Sub2Array1[local20.anInt4045 - 1];
					if (local57 != null && local57.anInt3022 >= 0 && local57.anInt3022 < 13312 && local57.anInt3008 >= 0 && local57.anInt3008 < 13312) {
						local20.method3208(Static131.method2213(local57.anInt3008, local57.anInt3022, local20.anInt4031) - local20.anInt4044, Static107.anInt2132, local57.anInt3008, local57.anInt3022);
					}
				}
				if (local20.anInt4045 < 0) {
					@Pc(109) int local109 = -local20.anInt4045 - 1;
					@Pc(118) Class20_Sub3_Sub1 local118;
					if (local109 == Static20.anInt417) {
						local118 = Static230.aClass20_Sub3_Sub1_3;
					} else {
						local118 = Static232.aClass20_Sub3_Sub1Array1[local109];
					}
					if (local118 != null && local118.anInt3022 >= 0 && local118.anInt3022 < 13312 && local118.anInt3008 >= 0 && local118.anInt3008 < 13312) {
						local20.method3208(Static131.method2213(local118.anInt3008, local118.anInt3022, local20.anInt4031) - local20.anInt4044, Static107.anInt2132, local118.anInt3008, local118.anInt3022);
					}
				}
				local20.method3206(Static42.anInt921);
				Static229.method3476(Static212.anInt4195, (int) local20.aDouble9, (int) local20.aDouble2, (int) local20.aDouble6, 60, local20, local20.anInt4029, -1L, false);
			}
		}
	}
}
