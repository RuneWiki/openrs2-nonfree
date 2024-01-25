import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!ma", name = "O", descriptor = "I")
	public static int anInt3945 = 0;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIII)V")
	public static void method3595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static342.aClass1_Sub8_Sub1_7.anInt5182 = 0;
		Static342.aClass1_Sub8_Sub1_7.method4562(20);
		Static342.aClass1_Sub8_Sub1_7.method4562(arg0);
		Static342.aClass1_Sub8_Sub1_7.method4562(arg2);
		Static342.aClass1_Sub8_Sub1_7.method4542(arg1);
		Static342.aClass1_Sub8_Sub1_7.method4542(arg3);
		Static292.anInt4644 = -3;
		Static64.anInt1799 = 0;
		Static278.anInt5664 = 0;
		Static130.anInt2868 = 1;
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(B)V")
	public static void method3596() {
		Static64.aByteArrayArrayArray2 = null;
		Static3.anIntArray17 = null;
		Static299.anIntArray107 = null;
		Static189.aByteArrayArrayArray6 = null;
		Static192.anIntArray375 = null;
		Static332.aByteArrayArrayArray11 = null;
		Static231.aByteArrayArrayArray9 = null;
		Static130.aByteArrayArrayArray5 = null;
		Static225.anIntArray419 = null;
		Static340.anIntArray521 = null;
		Static133.anIntArray263 = null;
		Static251.anIntArrayArrayArray15 = null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBIIII)V")
	public static void method3597(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg4 - arg0;
		@Pc(14) int local14 = arg3 - arg1;
		if (local9 == 0) {
			if (local14 != 0) {
				Static159.method3230(arg1, arg0, arg2, arg3);
			}
		} else if (local14 == 0) {
			Static38.method914(arg4, arg0, arg2, arg1);
		} else {
			@Pc(43) int local43 = (local14 << 12) / local9;
			@Pc(52) int local52 = arg1 - (arg0 * local43 >> 12);
			@Pc(69) int local69;
			@Pc(67) int local67;
			if (Static268.anInt5477 > arg4) {
				local67 = local52 + (local43 * Static268.anInt5477 >> 12);
				local69 = Static268.anInt5477;
			} else if (arg4 > Static342.anInt3000) {
				local69 = Static342.anInt3000;
				local67 = (Static342.anInt3000 * local43 >> 12) + local52;
			} else {
				local69 = arg4;
				local67 = arg3;
			}
			@Pc(104) int local104;
			@Pc(102) int local102;
			if (Static268.anInt5477 > arg0) {
				local102 = (local43 * Static268.anInt5477 >> 12) + local52;
				local104 = Static268.anInt5477;
			} else if (arg0 <= Static342.anInt3000) {
				local102 = arg1;
				local104 = arg0;
			} else {
				local102 = local52 + (local43 * Static342.anInt3000 >> 12);
				local104 = Static342.anInt3000;
			}
			if (Static197.anInt4211 > local67) {
				local69 = (Static197.anInt4211 - local52 << 12) / local43;
				local67 = Static197.anInt4211;
			} else if (local67 > Static326.anInt2469) {
				local67 = Static326.anInt2469;
				local69 = (Static326.anInt2469 - local52 << 12) / local43;
			}
			if (Static197.anInt4211 > local102) {
				local102 = Static197.anInt4211;
				local104 = (Static197.anInt4211 - local52 << 12) / local43;
			} else if (Static326.anInt2469 < local102) {
				local102 = Static326.anInt2469;
				local104 = (Static326.anInt2469 - local52 << 12) / local43;
			}
			Static82.method1813(local69, local104, local102, arg2, local67);
		}
	}

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "(I)V")
	public static void method3598() {
		if (Static64.anInt1792 == 0 || Static64.anInt1792 == 5) {
			return;
		}
		try {
			if (++Static135.anInt2979 > 2000) {
				if (Static7.aClass148_1 != null) {
					Static7.aClass148_1.method4123();
					Static7.aClass148_1 = null;
				}
				if (Static342.anInt2999 >= 1) {
					Static353.anInt6727 = -5;
					Static64.anInt1792 = 0;
					return;
				}
				Static64.anInt1792 = 1;
				if (Static274.anInt5608 == Static266.anInt5404) {
					Static274.anInt5608 = Static286.anInt5727;
				} else {
					Static274.anInt5608 = Static266.anInt5404;
				}
				Static342.anInt2999++;
				Static135.anInt2979 = 0;
			}
			if (Static64.anInt1792 == 1) {
				Static7.aClass162_1 = Static15.aClass143_1.method3889(Static274.anInt5608, Static114.aString46);
				Static64.anInt1792 = 2;
			}
			if (Static64.anInt1792 == 2) {
				if (Static7.aClass162_1.anInt4801 == 2) {
					throw new IOException();
				}
				if (Static7.aClass162_1.anInt4801 != 1) {
					return;
				}
				Static7.aClass148_1 = new Class148((Socket) Static7.aClass162_1.anObject5, Static15.aClass143_1);
				Static7.aClass162_1 = null;
				@Pc(107) long local107 = Static234.aLong143 = Static261.method1470(Static129.aString27);
				Static342.aClass1_Sub8_Sub1_7.anInt5182 = 0;
				@Pc(117) int local117 = (int) (local107 >> 16 & 0x1FL);
				Static342.aClass1_Sub8_Sub1_7.method4562(14);
				Static342.aClass1_Sub8_Sub1_7.method4562(local117);
				Static7.aClass148_1.method4122(2, Static342.aClass1_Sub8_Sub1_7.aByteArray81);
				if (Static129.aClass7_2 != null) {
					Static129.aClass7_2.method5559();
				}
				if (Static88.aClass7_1 != null) {
					Static88.aClass7_1.method5559();
				}
				@Pc(148) int local148 = Static7.aClass148_1.method4127();
				if (Static129.aClass7_2 != null) {
					Static129.aClass7_2.method5559();
				}
				if (Static88.aClass7_1 != null) {
					Static88.aClass7_1.method5559();
				}
				if (local148 != 0) {
					Static64.anInt1792 = 0;
					Static353.anInt6727 = local148;
					Static7.aClass148_1.method4123();
					Static7.aClass148_1 = null;
					return;
				}
				Static64.anInt1792 = 3;
			}
			if (Static64.anInt1792 == 3) {
				if (Static7.aClass148_1.method4125() < 8) {
					return;
				}
				Static7.aClass148_1.method4124(0, 8, Static311.aClass1_Sub8_Sub1_8.aByteArray81);
				Static311.aClass1_Sub8_Sub1_8.anInt5182 = 0;
				Static301.aLong178 = Static311.aClass1_Sub8_Sub1_8.method4511();
				@Pc(202) int[] local202 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static301.aLong178 >> 32), (int) Static301.aLong178 };
				Static342.aClass1_Sub8_Sub1_7.anInt5182 = 0;
				Static342.aClass1_Sub8_Sub1_7.method4562(10);
				Static342.aClass1_Sub8_Sub1_7.method4529(local202[0]);
				Static342.aClass1_Sub8_Sub1_7.method4529(local202[1]);
				Static342.aClass1_Sub8_Sub1_7.method4529(local202[2]);
				Static342.aClass1_Sub8_Sub1_7.method4529(local202[3]);
				Static342.aClass1_Sub8_Sub1_7.method4560(Static261.method1470(Static129.aString27));
				Static342.aClass1_Sub8_Sub1_7.method4531(Static145.aString29);
				Static342.aClass1_Sub8_Sub1_7.method4563(Static42.aBigInteger1, Static309.aBigInteger2);
				Static26.aClass1_Sub8_Sub1_3.anInt5182 = 0;
				if (Static295.anInt5811 == 40) {
					Static26.aClass1_Sub8_Sub1_3.method4562(18);
				} else {
					Static26.aClass1_Sub8_Sub1_3.method4562(16);
				}
				Static26.aClass1_Sub8_Sub1_3.method4542(Static342.aClass1_Sub8_Sub1_7.anInt5182 + Static321.method5243(Static158.aString33) + 161);
				Static26.aClass1_Sub8_Sub1_3.method4529(568);
				Static26.aClass1_Sub8_Sub1_3.method4562(Static21.anInt832);
				Static26.aClass1_Sub8_Sub1_3.method4562(Static44.method1024());
				Static26.aClass1_Sub8_Sub1_3.method4542(Static194.anInt4145);
				Static26.aClass1_Sub8_Sub1_3.method4542(Static271.anInt5530);
				Static26.aClass1_Sub8_Sub1_3.method4562(Static322.anInt6180);
				Static332.method5393(Static26.aClass1_Sub8_Sub1_3);
				Static26.aClass1_Sub8_Sub1_3.method4531(Static158.aString33);
				Static26.aClass1_Sub8_Sub1_3.method4529(Static163.anInt3550);
				Static26.aClass1_Sub8_Sub1_3.method4529(Static286.method4905());
				Static269.aBoolean537 = true;
				Static26.aClass1_Sub8_Sub1_3.method4542(Static190.anInt4079);
				Static26.aClass1_Sub8_Sub1_3.method4529(Static344.aClass216_96.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static203.aClass216_67.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static191.aClass216_62.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static14.aClass216_1.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static309.aClass216_93.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static24.aClass216_6.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static228.aClass216_78.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static56.aClass216_17.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static193.aClass216_64.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static47.aClass216_12.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static260.aClass216_88.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static44.aClass216_10.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static124.aClass216_43.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static34.aClass216_8.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static31.aClass216_7.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static75.aClass216_29.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static99.aClass216_33.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static121.aClass216_41.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static53.aClass216_14.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static208.aClass216_69.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static261.aClass216_19.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static88.aClass216_32.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static16.aClass216_4.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static312.aClass216_74.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static271.aClass216_86.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static211.aClass216_70.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static351.aClass216_98.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static297.aClass216_91.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4529(Static232.aClass216_81.method5670());
				Static26.aClass1_Sub8_Sub1_3.method4513(Static342.aClass1_Sub8_Sub1_7.anInt5182, Static342.aClass1_Sub8_Sub1_7.aByteArray81);
				Static7.aClass148_1.method4122(Static26.aClass1_Sub8_Sub1_3.anInt5182, Static26.aClass1_Sub8_Sub1_3.aByteArray81);
				Static342.aClass1_Sub8_Sub1_7.method3231(local202);
				for (@Pc(574) int local574 = 0; local574 < 4; local574++) {
					local202[local574] += 50;
				}
				Static311.aClass1_Sub8_Sub1_8.method3231(local202);
				Static64.anInt1792 = 4;
			}
			if (Static64.anInt1792 == 4) {
				if (Static7.aClass148_1.method4125() < 1) {
					return;
				}
				@Pc(610) int local610 = Static7.aClass148_1.method4127();
				if (local610 == 21) {
					Static64.anInt1792 = 7;
				} else if (local610 == 29) {
					Static64.anInt1792 = 10;
				} else if (local610 == 1) {
					Static353.anInt6727 = local610;
					Static64.anInt1792 = 5;
					return;
				} else if (local610 == 2) {
					Static64.anInt1792 = 8;
				} else if (local610 == 15) {
					Static64.anInt1792 = 0;
					Static353.anInt6727 = local610;
					return;
				} else if (local610 == 23 && Static342.anInt2999 < 1) {
					Static64.anInt1792 = 1;
					Static135.anInt2979 = 0;
					Static342.anInt2999++;
					Static7.aClass148_1.method4123();
					Static7.aClass148_1 = null;
					return;
				} else {
					Static353.anInt6727 = local610;
					Static64.anInt1792 = 0;
					Static7.aClass148_1.method4123();
					Static7.aClass148_1 = null;
					return;
				}
			}
			if (Static64.anInt1792 == 6) {
				Static342.aClass1_Sub8_Sub1_7.anInt5182 = 0;
				Static342.aClass1_Sub8_Sub1_7.method3229(17);
				Static7.aClass148_1.method4122(Static342.aClass1_Sub8_Sub1_7.anInt5182, Static342.aClass1_Sub8_Sub1_7.aByteArray81);
				Static64.anInt1792 = 4;
			} else if (Static64.anInt1792 == 7) {
				if (Static7.aClass148_1.method4125() >= 1) {
					Static191.anInt4097 = Static7.aClass148_1.method4127() * 60 + 180;
					Static64.anInt1792 = 0;
					Static353.anInt6727 = 21;
					Static7.aClass148_1.method4123();
					Static7.aClass148_1 = null;
				}
			} else if (Static64.anInt1792 != 10) {
				if (Static64.anInt1792 == 8) {
					if (Static7.aClass148_1.method4125() < 13) {
						return;
					}
					Static7.aClass148_1.method4124(0, 13, Static311.aClass1_Sub8_Sub1_8.aByteArray81);
					Static311.aClass1_Sub8_Sub1_8.anInt5182 = 0;
					Static342.anInt2998 = Static311.aClass1_Sub8_Sub1_8.method4532();
					Static208.anInt4377 = Static311.aClass1_Sub8_Sub1_8.method4532();
					Static87.aBoolean206 = Static311.aClass1_Sub8_Sub1_8.method4532() == 1;
					Static278.aBoolean548 = Static311.aClass1_Sub8_Sub1_8.method4532() == 1;
					Static80.aBoolean191 = Static311.aClass1_Sub8_Sub1_8.method4532() == 1;
					Static145.aBoolean302 = Static311.aClass1_Sub8_Sub1_8.method4532() == 1;
					Static16.anInt527 = Static311.aClass1_Sub8_Sub1_8.method4556();
					Static297.aBoolean560 = Static311.aClass1_Sub8_Sub1_8.method4532() == 1;
					Static349.aBoolean659 = Static311.aClass1_Sub8_Sub1_8.method4532() == 1;
					Static208.method3956(Static349.aBoolean659);
					Static354.method5641(Static349.aBoolean659);
					Static139.method4232(Static349.aBoolean659);
					if (Static87.aBoolean206 && !Static80.aBoolean191 || Static297.aBoolean560) {
						try {
							Static359.method1280(Static15.aClass143_1.anApplet1, "zap");
						} catch (@Pc(891) Throwable local891) {
						}
					} else {
						try {
							Static359.method1280(Static15.aClass143_1.anApplet1, "unzap");
						} catch (@Pc(903) Throwable local903) {
						}
					}
					if (Static63.anInt5669 == 0) {
						try {
							Static359.method1280(Static15.aClass143_1.anApplet1, "loggedin");
						} catch (@Pc(917) Throwable local917) {
						}
					}
					Static74.anInt1958 = Static311.aClass1_Sub8_Sub1_8.method3233();
					Static85.anInt5393 = Static311.aClass1_Sub8_Sub1_8.method4556();
					Static64.anInt1792 = 9;
				}
				if (Static64.anInt1792 == 9 && Static7.aClass148_1.method4125() >= Static85.anInt5393) {
					Static311.aClass1_Sub8_Sub1_8.anInt5182 = 0;
					Static7.aClass148_1.method4124(0, Static85.anInt5393, Static311.aClass1_Sub8_Sub1_8.aByteArray81);
					Static353.anInt6727 = 2;
					Static64.anInt1792 = 0;
					Static238.method4346();
					Static224.anInt4654 = -1;
					Static294.method4960(false);
					Static74.anInt1958 = -1;
				}
			} else if (Static7.aClass148_1.method4125() >= 1) {
				Static129.anInt2840 = Static7.aClass148_1.method4127();
				Static64.anInt1792 = 0;
				Static353.anInt6727 = 29;
				Static7.aClass148_1.method4123();
				Static7.aClass148_1 = null;
			}
		} catch (@Pc(970) IOException local970) {
			if (Static7.aClass148_1 != null) {
				Static7.aClass148_1.method4123();
				Static7.aClass148_1 = null;
			}
			if (Static342.anInt2999 < 1) {
				Static342.anInt2999++;
				Static135.anInt2979 = 0;
				if (Static274.anInt5608 == Static266.anInt5404) {
					Static274.anInt5608 = Static286.anInt5727;
				} else {
					Static274.anInt5608 = Static266.anInt5404;
				}
				Static64.anInt1792 = 1;
			} else {
				Static353.anInt6727 = -4;
				Static64.anInt1792 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!uo;I)V")
	public static void method3599(@OriginalArg(0) Class32 arg0) {
		if (Static115.anInt2635 < 2 && !Static91.aBoolean214 || Static28.aClass12_3 != null) {
			return;
		}
		@Pc(40) String local40;
		if (Static91.aBoolean214 && Static115.anInt2635 < 2) {
			local40 = Static24.aString15 + Static27.aClass34_20.method1285(Static259.anInt2907) + Static281.aString56 + " ->";
		} else if (Static39.aBoolean120 && Static57.aClass171_1.method4638(81) && Static115.anInt2635 > 2) {
			local40 = Static247.method4448((Class1_Sub23) Static188.aClass16_22.aClass1_25.aClass1_251.aClass1_251);
		} else {
			@Pc(47) Class1_Sub23 local47 = (Class1_Sub23) Static188.aClass16_22.aClass1_25.aClass1_251;
			local40 = Static247.method4448(local47);
			@Pc(53) int[] local53 = null;
			if (Static63.method4864(local47.anInt3588)) {
				local53 = Static20.method561((int) local47.aLong121).anIntArray273;
			} else if (Static90.method1960(local47.anInt3588)) {
				@Pc(77) Class17_Sub1_Sub1_Sub2 local77 = Static140.aClass17_Sub1_Sub1_Sub2Array1[(int) local47.aLong121];
				if (local77 != null) {
					local53 = local77.aClass213_1.anIntArray520;
				}
			} else if (Static324.method5276(local47.anInt3588)) {
				if (local47.anInt3588 == 1011) {
					local53 = Static119.method2548((int) local47.aLong121).anIntArray390;
				} else {
					local53 = Static119.method2548((int) (local47.aLong121 >>> 32 & 0x7FFFFFFFL)).anIntArray390;
				}
			}
			if (local53 != null) {
				local40 = local40 + Static229.method757(local53);
			}
		}
		if (Static115.anInt2635 > 2) {
			local40 = local40 + "<col=ffffff> / " + (Static115.anInt2635 - 2) + Static12.aClass34_13.method1285(Static259.anInt2907);
		}
		if (Static243.aClass12_14 != null) {
			@Pc(175) Class9 local175 = Static243.aClass12_14.method362(arg0);
			if (local175 == null) {
				local175 = Static49.aClass9_1;
			}
			local175.method5020(Static243.aClass12_14.anInt405, Static243.aClass12_14.lb, Static329.aRandom1, Static238.anInt4919, Static243.aClass12_14.anInt466, Static243.aClass12_14.anInt418, Static243.aClass12_14.anInt446, Static279.anIntArray476, Static243.aClass12_14.anInt463, Static148.anInt3246, Static197.aClass5Array16, Static280.anIntArray478, Static334.anInt6416, local40);
			Static8.method5018(Static280.anIntArray478[3], Static280.anIntArray478[2], Static280.anIntArray478[1], Static280.anIntArray478[0]);
		} else if (Static3.aClass12_1 != null && Static8.anInt5875 == 0) {
			@Pc(245) int local245 = Static49.aClass9_1.method5015(Static28.anInt1033 + 16, Static280.anInt5700 + 4, Static197.aClass5Array16, Static279.anIntArray476, Static329.aRandom1, local40, Static148.anInt3246);
			Static8.method5018(16, local245 + Static90.aClass63_3.method1746(local40), Static28.anInt1033, Static280.anInt5700 + 4);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I[IIZIII[IILclient!g;IIIII)I")
	public static int method3600(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class71 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static252.anIntArrayArray55[local3][local7] = 0;
				Static109.anIntArrayArray27[local3][local7] = 99999999;
			}
		}
		@Pc(78) boolean local78;
		if (arg10 == 1) {
			local78 = Static188.method3683(arg4, arg9, arg7, arg2, arg0, arg12, arg13, arg11, arg8, arg5);
		} else if (arg10 == 2) {
			local78 = Static320.method4634(arg2, arg4, arg12, arg11, arg7, arg13, arg8, arg5, arg9, arg0);
		} else {
			local78 = Static156.method3146(arg8, arg12, arg0, arg11, arg7, arg9, arg13, arg4, arg2, arg10, arg5);
		}
		@Pc(113) int local113 = arg4 - 64;
		@Pc(117) int local117 = arg9 - 64;
		@Pc(119) int local119 = Static228.anInt4746;
		@Pc(121) int local121 = Static129.anInt2839;
		@Pc(129) int local129;
		@Pc(131) int local131;
		@Pc(138) int local138;
		if (!local78) {
			if (!arg3) {
				return -1;
			}
			local129 = Integer.MAX_VALUE;
			local131 = Integer.MAX_VALUE;
			for (local138 = arg12 - 10; local138 <= arg12 + 10; local138++) {
				for (@Pc(145) int local145 = arg11 - 10; local145 <= arg11 + 10; local145++) {
					@Pc(152) int local152 = local138 - local113;
					@Pc(157) int local157 = local145 - local117;
					if (local152 >= 0 && local157 >= 0 && local152 < 128 && local157 < 128 && Static109.anIntArrayArray27[local152][local157] < 100) {
						@Pc(183) int local183 = 0;
						if (local138 < arg12) {
							local183 = arg12 - local138;
						} else if (arg5 + arg12 - 1 < local138) {
							local183 = local138 + 1 - arg12 - arg5;
						}
						@Pc(216) int local216 = 0;
						if (arg11 > local145) {
							local216 = arg11 - local145;
						} else if (local145 > arg11 + arg0 - 1) {
							local216 = local145 + 1 - arg11 - arg0;
						}
						@Pc(251) int local251 = local183 * local183 + local216 * local216;
						if (local129 > local251 || local129 == local251 && Static109.anIntArrayArray27[local152][local157] < local131) {
							local119 = local138;
							local131 = Static109.anIntArrayArray27[local152][local157];
							local129 = local251;
							local121 = local145;
						}
					}
				}
			}
			if (local129 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (arg4 == local119 && arg9 == local121) {
			return 0;
		}
		@Pc(323) byte local323 = 0;
		Static45.anIntArray113[0] = local119;
		local129 = local323 + 1;
		Static57.anIntArray162[0] = local121;
		@Pc(345) int local345;
		local131 = local345 = Static252.anIntArrayArray55[local119 - local113][local121 - local117];
		while (local119 != arg4 || arg9 != local121) {
			if (local131 != local345) {
				Static45.anIntArray113[local129] = local119;
				local345 = local131;
				Static57.anIntArray162[local129++] = local121;
			}
			if ((local131 & 0x1) != 0) {
				local121++;
			} else if ((local131 & 0x4) != 0) {
				local121--;
			}
			if ((local131 & 0x2) != 0) {
				local119++;
			} else if ((local131 & 0x8) != 0) {
				local119--;
			}
			local131 = Static252.anIntArrayArray55[local119 - local113][local121 - local117];
		}
		local138 = 0;
		while (local129-- > 0) {
			arg1[local138] = Static45.anIntArray113[local129];
			arg6[local138++] = Static57.anIntArray162[local129];
			if (local138 >= arg1.length) {
				break;
			}
		}
		return local138;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIII)V")
	public static void method3601(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(15) Class8_Sub1 local15 = (Class8_Sub1) Static64.aClass217_2.method5683(); local15 != null; local15 = (Class8_Sub1) Static64.aClass217_2.method5679()) {
			if (Static5.anInt208 >= local15.anInt271) {
				local15.method4763();
			} else {
				Static147.method2934(arg3 >> 1, (local15.anInt278 << 7) + 64, (local15.anInt276 << 7) + 64, local15.anInt277 * 2, arg0 >> 1);
				Static49.aClass9_1.method5019(0, arg1 + Static22.anIntArray444[0], local15.anInt272 | 0xFF000000, arg2 + Static22.anIntArray444[1], local15.aString1);
			}
		}
	}
}
