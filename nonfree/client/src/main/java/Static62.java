import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "Lclient!dh;")
	public static Class52 aClass52_3;

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "[I")
	public static final int[] anIntArray85 = new int[1000];

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)Z")
	public static boolean method1101() throws IOException {
		if (Static372.aClass161_6 == null) {
			return false;
		}
		@Pc(13) int local13 = Static372.aClass161_6.method3765();
		if (local13 == 0) {
			return false;
		}
		@Pc(67) int local67;
		if (Static329.aClass237_97 == null) {
			if (Static380.aBoolean424) {
				Static372.aClass161_6.method3769(1, 0, Static173.aClass1_Sub1_Sub1_1.aByteArray66);
				local13--;
				Static293.anInt5154++;
				Static380.aBoolean424 = false;
			}
			Static173.aClass1_Sub1_Sub1_1.anInt5056 = 0;
			if (Static173.aClass1_Sub1_Sub1_1.method152()) {
				if (local13 == 0) {
					return false;
				}
				local13--;
				Static372.aClass161_6.method3769(1, 1, Static173.aClass1_Sub1_Sub1_1.aByteArray66);
				Static293.anInt5154++;
			}
			Static380.aBoolean424 = true;
			@Pc(63) Class237[] local63 = Static281.method4023();
			local67 = Static173.aClass1_Sub1_Sub1_1.method153();
			if (local67 < 0 || local67 >= local63.length) {
				throw new IOException("invo:" + local67 + " ip:" + Static173.aClass1_Sub1_Sub1_1.anInt5056);
			}
			Static329.aClass237_97 = local63[local67];
			Static283.anInt4985 = Static329.aClass237_97.anInt6945;
		}
		if (Static283.anInt4985 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static372.aClass161_6.method3769(1, 0, Static173.aClass1_Sub1_Sub1_1.aByteArray66);
			Static293.anInt5154++;
			Static283.anInt4985 = Static173.aClass1_Sub1_Sub1_1.aByteArray66[0] & 0xFF;
			local13--;
		}
		if (Static283.anInt4985 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static372.aClass161_6.method3769(2, 0, Static173.aClass1_Sub1_Sub1_1.aByteArray66);
			Static173.aClass1_Sub1_Sub1_1.anInt5056 = 0;
			local13 -= 2;
			Static283.anInt4985 = Static173.aClass1_Sub1_Sub1_1.method4093();
			Static293.anInt5154 += 2;
		}
		if (local13 < Static283.anInt4985) {
			return false;
		}
		Static173.aClass1_Sub1_Sub1_1.anInt5056 = 0;
		Static372.aClass161_6.method3769(Static283.anInt4985, 0, Static173.aClass1_Sub1_Sub1_1.aByteArray66);
		Static95.anInt1785 = 0;
		Static411.aClass237_119 = Static264.aClass237_82;
		Static293.anInt5154 += Static283.anInt4985;
		Static264.aClass237_82 = Static85.aClass237_23;
		Static85.aClass237_23 = Static329.aClass237_97;
		@Pc(198) int local198;
		@Pc(202) int local202;
		@Pc(190) int local190;
		if (Static329.aClass237_97 == Static166.aClass237_107) {
			local190 = Static173.aClass1_Sub1_Sub1_1.method4088();
			local67 = Static173.aClass1_Sub1_Sub1_1.method4133();
			local198 = Static173.aClass1_Sub1_Sub1_1.method4124();
			local202 = Static173.aClass1_Sub1_Sub1_1.method4087();
			if (Static359.method4943(local198)) {
				Static414.method5597(local190, local67, 5, local202);
			}
			Static329.aClass237_97 = null;
			return true;
		} else if (Static329.aClass237_97 == Static13.aClass237_1) {
			Static79.anInt1568 = Static173.aClass1_Sub1_Sub1_1.method4093() * 30;
			Static329.aClass237_97 = null;
			Static367.anInt6237 = Static337.anInt7419;
			return true;
		} else {
			@Pc(263) int local263;
			@Pc(271) int local271;
			@Pc(275) int local275;
			@Pc(287) int local287;
			@Pc(267) int local267;
			if (Static329.aClass237_97 == Static398.aClass237_115) {
				local190 = Static173.aClass1_Sub1_Sub1_1.method4093();
				if (local190 == 65535) {
					local190 = -1;
				}
				local67 = Static173.aClass1_Sub1_Sub1_1.method4126();
				local198 = local67 >> 28 & 0x3;
				local202 = local67 >> 14 & 0x3FFF;
				local263 = local67 & 0x3FFF;
				local267 = Static173.aClass1_Sub1_Sub1_1.method4086();
				local271 = local267 >> 2;
				local275 = local267 & 0x3;
				local263 -= Static134.anInt5502;
				local202 -= Static437.anInt7555;
				local287 = Static127.anIntArray286[local271];
				Static378.method5177(local198, local263, local190, local275, local202, local271, local287);
				Static329.aClass237_97 = null;
				return true;
			} else if (Static110.aClass237_48 == Static329.aClass237_97) {
				Static223.anInt4015 = Static173.aClass1_Sub1_Sub1_1.method4130();
				Static329.aClass237_97 = null;
				Static367.anInt6237 = Static337.anInt7419;
				return true;
			} else if (Static329.aClass237_97 == Static25.aClass237_7) {
				local190 = Static173.aClass1_Sub1_Sub1_1.method4093();
				local67 = Static173.aClass1_Sub1_Sub1_1.method4093();
				local198 = Static173.aClass1_Sub1_Sub1_1.method4087();
				if (Static359.method4943(local67)) {
					Static322.method4528(local190, local198);
				}
				Static329.aClass237_97 = null;
				return true;
			} else if (Static329.aClass237_97 == Static102.aClass237_29) {
				Static22.aClass87_7 = Static280.method4019(Static173.aClass1_Sub1_Sub1_1.method4130());
				Static329.aClass237_97 = null;
				return true;
			} else {
				@Pc(404) int local404;
				@Pc(367) boolean local367;
				@Pc(373) String local373;
				@Pc(371) String local371;
				@Pc(384) long local384;
				@Pc(389) long local389;
				if (Static320.aClass237_95 == Static329.aClass237_97) {
					local367 = Static173.aClass1_Sub1_Sub1_1.method4130() == 1;
					local371 = Static173.aClass1_Sub1_Sub1_1.method4137();
					local373 = local371;
					if (local367) {
						local373 = Static173.aClass1_Sub1_Sub1_1.method4137();
					}
					local384 = Static173.aClass1_Sub1_Sub1_1.method4093();
					local389 = Static173.aClass1_Sub1_Sub1_1.method4142();
					local275 = Static173.aClass1_Sub1_Sub1_1.method4130();
					@Pc(400) long local400 = (local384 << 32) + local389;
					@Pc(402) boolean local402 = false;
					local404 = 0;
					while (true) {
						if (local404 >= 100) {
							if (local275 <= 1) {
								if (Static273.aBoolean326 && !Static411.aBoolean461 || Static443.aBoolean484) {
									local402 = true;
								} else if (Static149.method2259(local373)) {
									local402 = true;
								}
							}
							break;
						}
						if (local400 == Static26.aLongArray4[local404]) {
							local402 = true;
							break;
						}
						local404++;
					}
					if (!local402 && Static372.anInt7405 == 0) {
						Static26.aLongArray4[Static161.anInt2765] = local400;
						Static161.anInt2765 = (Static161.anInt2765 + 1) % 100;
						@Pc(463) String local463 = Static118.method3303(Static259.method5040(Static173.aClass1_Sub1_Sub1_1));
						if (local275 == 2) {
							Static27.method486(0, "<img=1>" + local373, "<img=1>" + local371, null, -1, local463, 7);
						} else if (local275 == 1) {
							Static27.method486(0, "<img=0>" + local373, "<img=0>" + local371, null, -1, local463, 7);
						} else {
							Static27.method486(0, local373, local371, null, -1, local463, 3);
						}
					}
					Static329.aClass237_97 = null;
					return true;
				} else if (Static43.aClass237_89 == Static329.aClass237_97) {
					Static42.anInt754 = Static173.aClass1_Sub1_Sub1_1.method4121() << 3;
					Static9.anInt245 = Static173.aClass1_Sub1_Sub1_1.method4121() << 3;
					Static167.anInt3119 = Static173.aClass1_Sub1_Sub1_1.method4086();
					while (Static173.aClass1_Sub1_Sub1_1.anInt5056 < Static283.anInt4985) {
						@Pc(560) Class146 local560 = Static422.method5645()[Static173.aClass1_Sub1_Sub1_1.method4130()];
						Static216.method3269(local560);
					}
					Static329.aClass237_97 = null;
					return true;
				} else if (Static262.aClass237_79 == Static329.aClass237_97) {
					Static216.method3269(Static437.aClass146_16);
					Static329.aClass237_97 = null;
					return true;
				} else if (Static60.aClass237_18 == Static329.aClass237_97) {
					if (Static421.aFrame2 != null) {
						Static267.method3900(-1, false, -1, Static389.aClass128_Sub1_1.anInt3566);
					}
					@Pc(596) byte[] local596 = new byte[Static283.anInt4985];
					Static173.aClass1_Sub1_Sub1_1.method143(Static283.anInt4985, local596);
					local371 = Static365.method5027(local596, 0, Static283.anInt4985);
					Static209.method6068(true, Static119.aClass138_7, local371, Static285.anInt7839 == 1);
					Static329.aClass237_97 = null;
					return true;
				} else if (Static329.aClass237_97 == Static106.aClass237_31) {
					Static216.method3269(Static384.aClass146_12);
					Static329.aClass237_97 = null;
					return true;
				} else if (Static329.aClass237_97 == Static146.aClass237_46) {
					local190 = Static173.aClass1_Sub1_Sub1_1.method4134();
					local67 = Static173.aClass1_Sub1_Sub1_1.method4095();
					local198 = Static173.aClass1_Sub1_Sub1_1.method4118();
					if (Static359.method4943(local67)) {
						Static371.method5093(local198, local190);
					}
					Static329.aClass237_97 = null;
					return true;
				} else if (Static161.aClass237_56 == Static329.aClass237_97) {
					local190 = Static173.aClass1_Sub1_Sub1_1.method4093();
					if (local190 == 65535) {
						local190 = -1;
					}
					local67 = Static173.aClass1_Sub1_Sub1_1.method4130();
					local198 = Static173.aClass1_Sub1_Sub1_1.method4093();
					local202 = Static173.aClass1_Sub1_Sub1_1.method4130();
					Static161.method2442(local202, local67, local190, local198);
					Static329.aClass237_97 = null;
					return true;
				} else if (Static355.aClass237_105 == Static329.aClass237_97) {
					local190 = Static173.aClass1_Sub1_Sub1_1.method4095();
					if (local190 == 65535) {
						local190 = -1;
					}
					local67 = Static173.aClass1_Sub1_Sub1_1.method4126();
					local198 = Static173.aClass1_Sub1_Sub1_1.method4088();
					if (Static359.method4943(local198)) {
						Static9.method240(local190, local67);
					}
					Static329.aClass237_97 = null;
					return true;
				} else if (Static347.aClass237_104 == Static329.aClass237_97) {
					Static87.anInt1697 = Static173.aClass1_Sub1_Sub1_1.method4130();
					for (local190 = 0; local190 < Static87.anInt1697; local190++) {
						Static32.aStringArray5[local190] = Static173.aClass1_Sub1_Sub1_1.method4137();
						Static349.aStringArray14[local190] = Static173.aClass1_Sub1_Sub1_1.method4137();
						if (Static349.aStringArray14[local190].equals("")) {
							Static349.aStringArray14[local190] = Static32.aStringArray5[local190];
						}
						Static113.aStringArray47[local190] = Static173.aClass1_Sub1_Sub1_1.method4137();
						Static329.aStringArray45[local190] = Static173.aClass1_Sub1_Sub1_1.method4137();
						if (Static329.aStringArray45[local190].equals("")) {
							Static329.aStringArray45[local190] = Static113.aStringArray47[local190];
						}
						Static230.aBooleanArray14[local190] = false;
					}
					Static151.anInt2580 = Static337.anInt7419;
					Static329.aClass237_97 = null;
					return true;
				} else if (Static248.aClass237_75 == Static329.aClass237_97) {
					local190 = Static173.aClass1_Sub1_Sub1_1.method4124();
					local67 = Static173.aClass1_Sub1_Sub1_1.method4133();
					local198 = Static173.aClass1_Sub1_Sub1_1.method4088();
					if (Static359.method4943(local198)) {
						Static168.method2678(local67, local190);
					}
					Static329.aClass237_97 = null;
					return true;
				} else if (Static329.aClass237_97 == Static211.aClass237_67) {
					Static216.method3269(Static286.aClass146_7);
					Static329.aClass237_97 = null;
					return true;
				} else if (Static296.aClass237_54 == Static329.aClass237_97) {
					local190 = Static173.aClass1_Sub1_Sub1_1.method4129();
					local67 = Static173.aClass1_Sub1_Sub1_1.method4124();
					if (local67 == 65535) {
						local67 = -1;
					}
					local198 = Static173.aClass1_Sub1_Sub1_1.method4118();
					Static340.method4801(local190, local67, local198);
					Static329.aClass237_97 = null;
					return true;
				} else if (Static329.aClass237_97 == Static115.aClass237_35) {
					local190 = Static173.aClass1_Sub1_Sub1_1.method4099();
					local67 = Static173.aClass1_Sub1_Sub1_1.method4124();
					if (local67 == 65535) {
						local67 = -1;
					}
					local198 = Static173.aClass1_Sub1_Sub1_1.method4130();
					Static75.method1283(local198, local190, local67);
					Static329.aClass237_97 = null;
					return true;
				} else if (Static329.aClass237_97 == Static20.aClass237_2) {
					Static329.aClass237_97 = null;
					Static325.anInt5702 = 1;
					Static151.anInt2580 = Static337.anInt7419;
					return true;
				} else {
					@Pc(939) String local939;
					@Pc(949) String local949;
					@Pc(953) String local953;
					if (Static435.aClass237_126 == Static329.aClass237_97) {
						local190 = Static173.aClass1_Sub1_Sub1_1.method4130();
						@Pc(931) boolean local931 = (local190 & 0x1) == 1;
						local373 = Static173.aClass1_Sub1_Sub1_1.method4137();
						local939 = Static173.aClass1_Sub1_Sub1_1.method4137();
						if (local939.equals("")) {
							local939 = local373;
						}
						local949 = Static173.aClass1_Sub1_Sub1_1.method4137();
						local953 = Static173.aClass1_Sub1_Sub1_1.method4137();
						if (local953.equals("")) {
							local953 = local949;
						}
						if (local931) {
							for (local271 = 0; local271 < Static87.anInt1697; local271++) {
								if (Static349.aStringArray14[local271].equals(local953)) {
									Static32.aStringArray5[local271] = local373;
									Static349.aStringArray14[local271] = local939;
									Static113.aStringArray47[local271] = local949;
									Static329.aStringArray45[local271] = local953;
									break;
								}
							}
						} else {
							Static32.aStringArray5[Static87.anInt1697] = local373;
							Static349.aStringArray14[Static87.anInt1697] = local939;
							Static113.aStringArray47[Static87.anInt1697] = local949;
							Static329.aStringArray45[Static87.anInt1697] = local953;
							Static230.aBooleanArray14[Static87.anInt1697] = (local190 & 0x2) == 2;
							Static87.anInt1697++;
						}
						Static151.anInt2580 = Static337.anInt7419;
						Static329.aClass237_97 = null;
						return true;
					} else if (Static329.aClass237_97 == Static335.aClass237_17) {
						Static273.aString37 = Static283.anInt4985 <= 2 ? Static208.aClass84_51.method1678(Static167.anInt3118) : Static173.aClass1_Sub1_Sub1_1.method4137();
						Static188.anInt3449 = Static283.anInt4985 <= 0 ? -1 : Static173.aClass1_Sub1_Sub1_1.method4093();
						Static329.aClass237_97 = null;
						if (Static188.anInt3449 == 65535) {
							Static188.anInt3449 = -1;
						}
						return true;
					} else if (Static329.aClass237_97 == Static145.aClass237_45) {
						Static216.method3269(Static126.aClass146_3);
						Static329.aClass237_97 = null;
						return true;
					} else if (Static206.aClass237_66 == Static329.aClass237_97) {
						local190 = Static173.aClass1_Sub1_Sub1_1.method4095();
						local67 = Static173.aClass1_Sub1_Sub1_1.method4095();
						local198 = Static173.aClass1_Sub1_Sub1_1.method4134();
						if (Static359.method4943(local67)) {
							Static400.method5425(local190, local198);
						}
						Static329.aClass237_97 = null;
						return true;
					} else if (Static329.aClass237_97 == Static147.aClass237_49) {
						Static216.method3269(Static445.aClass146_17);
						Static329.aClass237_97 = null;
						return true;
					} else if (Static204.aClass237_65 == Static329.aClass237_97) {
						local190 = Static173.aClass1_Sub1_Sub1_1.method4133();
						local67 = Static173.aClass1_Sub1_Sub1_1.method4093();
						if (Static359.method4943(local67)) {
							Static414.method5597(Static453.anInt7845, local190, 5, 0);
						}
						Static329.aClass237_97 = null;
						return true;
					} else {
						@Pc(1320) int local1320;
						@Pc(1341) Class254 local1341;
						@Pc(1317) boolean local1317;
						if (Static329.aClass237_97 == Static307.aClass237_94) {
							Static327.anInt5733 = Static337.anInt7419;
							if (Static283.anInt4985 == 0) {
								Static98.aString13 = null;
								Static214.anInt3899 = 0;
								Static329.aClass237_97 = null;
								Static74.aString9 = null;
								Static413.aClass254Array27 = null;
								return true;
							}
							Static98.aString13 = Static173.aClass1_Sub1_Sub1_1.method4137();
							local367 = Static173.aClass1_Sub1_Sub1_1.method4130() == 1;
							if (local367) {
								Static173.aClass1_Sub1_Sub1_1.method4137();
							}
							@Pc(1186) long local1186 = Static173.aClass1_Sub1_Sub1_1.method4094();
							Static74.aString9 = Static402.method5431(local1186);
							Static198.aByte42 = Static173.aClass1_Sub1_Sub1_1.method4112();
							local202 = Static173.aClass1_Sub1_Sub1_1.method4130();
							if (local202 == 255) {
								Static329.aClass237_97 = null;
								return true;
							}
							Static214.anInt3899 = local202;
							@Pc(1210) Class254[] local1210 = new Class254[100];
							for (local267 = 0; local267 < Static214.anInt3899; local267++) {
								local1210[local267] = new Class254();
								local1210[local267].aString58 = Static173.aClass1_Sub1_Sub1_1.method4137();
								local367 = Static173.aClass1_Sub1_Sub1_1.method4130() == 1;
								if (local367) {
									local1210[local267].aString59 = Static173.aClass1_Sub1_Sub1_1.method4137();
								} else {
									local1210[local267].aString59 = local1210[local267].aString58;
								}
								local1210[local267].aString61 = Static22.method3265(local1210[local267].aString59);
								local1210[local267].anInt7389 = Static173.aClass1_Sub1_Sub1_1.method4093();
								local1210[local267].aByte102 = Static173.aClass1_Sub1_Sub1_1.method4112();
								local1210[local267].aString60 = Static173.aClass1_Sub1_Sub1_1.method4137();
								if (local1210[local267].aString59.equals(Static196.aClass26_Sub2_Sub2_Sub1_1.aString51)) {
									Static270.aByte59 = local1210[local267].aByte102;
								}
							}
							local287 = Static214.anInt3899;
							while (local287 > 0) {
								local1317 = true;
								local287--;
								for (local1320 = 0; local1320 < local287; local1320++) {
									if (local1210[local1320].aString61.compareTo(local1210[local1320 + 1].aString61) > 0) {
										local1341 = local1210[local1320];
										local1210[local1320] = local1210[local1320 + 1];
										local1317 = false;
										local1210[local1320 + 1] = local1341;
									}
								}
								if (local1317) {
									break;
								}
							}
							Static329.aClass237_97 = null;
							Static413.aClass254Array27 = local1210;
							return true;
						} else if (Static329.aClass237_97 == Static33.aClass237_8) {
							Static288.anInt5036 = Static173.aClass1_Sub1_Sub1_1.method4130();
							Static329.aClass237_97 = null;
							return true;
						} else if (Static54.aClass237_14 == Static329.aClass237_97) {
							Static216.method3269(Static4.aClass146_1);
							Static329.aClass237_97 = null;
							return true;
						} else {
							@Pc(1430) Class1_Sub36 local1430;
							if (Static329.aClass237_97 == Static249.aClass237_77) {
								local190 = Static173.aClass1_Sub1_Sub1_1.method4095();
								local67 = Static173.aClass1_Sub1_Sub1_1.method4133();
								local198 = Static173.aClass1_Sub1_Sub1_1.method4134();
								if (Static359.method4943(local190)) {
									@Pc(1423) Class1_Sub36 local1423 = (Class1_Sub36) Static445.aClass27_42.method553((long) local67);
									local1430 = (Class1_Sub36) Static445.aClass27_42.method553((long) local198);
									if (local1430 != null) {
										Static225.method3382(local1423 == null || local1430.anInt5680 != local1423.anInt5680, local1430, false);
									}
									if (local1423 != null) {
										local1423.method6071();
										Static445.aClass27_42.method564((long) local198, local1423);
									}
									@Pc(1465) Class219 local1465 = Static103.method1572(local67);
									if (local1465 != null) {
										Static355.method4895(local1465);
									}
									local1465 = Static103.method1572(local198);
									if (local1465 != null) {
										Static355.method4895(local1465);
										Static251.method3698(true, local1465);
									}
									if (Static273.anInt4878 != -1) {
										Static313.method4475(1, Static273.anInt4878);
									}
								}
								Static329.aClass237_97 = null;
								return true;
							} else if (Static329.aClass237_97 == Static169.aClass237_59) {
								local190 = Static173.aClass1_Sub1_Sub1_1.method4093();
								if (Static359.method4943(local190)) {
									Static242.method3588();
								}
								Static329.aClass237_97 = null;
								return true;
							} else if (Static420.aClass237_121 == Static329.aClass237_97) {
								local190 = Static173.aClass1_Sub1_Sub1_1.method4093();
								local67 = Static173.aClass1_Sub1_Sub1_1.method4087();
								if (Static359.method4943(local190)) {
									@Pc(1534) Class1_Sub36 local1534 = (Class1_Sub36) Static445.aClass27_42.method553((long) local67);
									if (local1534 != null) {
										Static225.method3382(true, local1534, false);
									}
									if (Static419.aClass219_18 != null) {
										Static355.method4895(Static419.aClass219_18);
										Static419.aClass219_18 = null;
									}
								}
								Static329.aClass237_97 = null;
								return true;
							} else if (Static96.aClass237_26 == Static329.aClass237_97) {
								Static234.method3459();
								Static329.aClass237_97 = null;
								return false;
							} else if (Static329.aClass237_97 == Static448.aClass237_130) {
								local190 = Static173.aClass1_Sub1_Sub1_1.method4087();
								local67 = Static173.aClass1_Sub1_Sub1_1.method4093();
								local198 = Static173.aClass1_Sub1_Sub1_1.method4088();
								if (local198 == 65535) {
									local198 = -1;
								}
								if (Static359.method4943(local67)) {
									Static414.method5597(local198, local190, 2, -1);
								}
								Static329.aClass237_97 = null;
								return true;
							} else if (Static329.aClass237_97 == Static44.aClass237_12) {
								local190 = Static173.aClass1_Sub1_Sub1_1.method4126();
								local67 = Static173.aClass1_Sub1_Sub1_1.method4093();
								local198 = Static173.aClass1_Sub1_Sub1_1.method4111();
								if (Static359.method4943(local67)) {
									Static438.method5868(local198, local190);
								}
								Static329.aClass237_97 = null;
								return true;
							} else if (Static263.aClass237_80 == Static329.aClass237_97) {
								local190 = Static173.aClass1_Sub1_Sub1_1.method4126();
								local67 = Static173.aClass1_Sub1_Sub1_1.method4093();
								Static51.aClass79_1.method1575(local190, local67);
								Static329.aClass237_97 = null;
								return true;
							} else if (Static347.aClass237_103 == Static329.aClass237_97) {
								Static153.method5064(Static173.aClass1_Sub1_Sub1_1.method4137());
								Static329.aClass237_97 = null;
								return true;
							} else if (Static329.aClass237_97 == Static264.aClass237_81) {
								local190 = Static173.aClass1_Sub1_Sub1_1.method4088();
								local67 = Static173.aClass1_Sub1_Sub1_1.method4124();
								local198 = Static173.aClass1_Sub1_Sub1_1.method4124();
								if (Static359.method4943(local190)) {
									Static403.method5454(local198, local67);
								}
								Static329.aClass237_97 = null;
								return true;
							} else if (Static381.aClass237_91 == Static329.aClass237_97) {
								local190 = Static173.aClass1_Sub1_Sub1_1.method4093();
								local67 = Static173.aClass1_Sub1_Sub1_1.method4130();
								local198 = Static173.aClass1_Sub1_Sub1_1.method4130();
								local202 = Static173.aClass1_Sub1_Sub1_1.method4130();
								local263 = Static173.aClass1_Sub1_Sub1_1.method4130();
								local267 = Static173.aClass1_Sub1_Sub1_1.method4093();
								if (Static359.method4943(local190)) {
									Static193.aBooleanArray3[local67] = true;
									Static361.anIntArray493[local67] = local198;
									Static129.anIntArray212[local67] = local202;
									Static58.anIntArray81[local67] = local263;
									Static206.anIntArray315[local67] = local267;
								}
								Static329.aClass237_97 = null;
								return true;
							} else if (Static445.aClass237_128 == Static329.aClass237_97) {
								Static173.aClass1_Sub1_Sub1_1.anInt5056 += 28;
								if (Static173.aClass1_Sub1_Sub1_1.method4114()) {
									Static97.method1528(Static173.aClass1_Sub1_Sub1_1.anInt5056 - 28, Static173.aClass1_Sub1_Sub1_1);
								}
								Static329.aClass237_97 = null;
								return true;
							} else {
								@Pc(1783) boolean local1783;
								if (Static329.aClass237_97 == Static248.aClass237_76) {
									local190 = Static173.aClass1_Sub1_Sub1_1.method4093();
									local67 = Static173.aClass1_Sub1_Sub1_1.method4130();
									local1783 = (local67 & 0x1) == 1;
									while (Static283.anInt4985 > Static173.aClass1_Sub1_Sub1_1.anInt5056) {
										local202 = Static173.aClass1_Sub1_Sub1_1.method4096();
										local263 = Static173.aClass1_Sub1_Sub1_1.method4093();
										local267 = 0;
										if (local263 != 0) {
											local267 = Static173.aClass1_Sub1_Sub1_1.method4130();
											if (local267 == 255) {
												local267 = Static173.aClass1_Sub1_Sub1_1.method4087();
											}
										}
										Static320.method4514(local267, local263 - 1, local202, local1783, local190);
									}
									Static373.anIntArray521[Static51.anInt963++ & 0x1F] = local190;
									Static329.aClass237_97 = null;
									return true;
								}
								@Pc(2145) String local2145;
								@Pc(2181) boolean local2181;
								if (Static329.aClass237_97 == Static202.aClass237_63) {
									while (Static283.anInt4985 > Static173.aClass1_Sub1_Sub1_1.anInt5056) {
										local367 = Static173.aClass1_Sub1_Sub1_1.method4130() == 1;
										local371 = Static173.aClass1_Sub1_Sub1_1.method4137();
										local373 = Static173.aClass1_Sub1_Sub1_1.method4137();
										local202 = Static173.aClass1_Sub1_Sub1_1.method4093();
										local263 = Static173.aClass1_Sub1_Sub1_1.method4130();
										local953 = "";
										local1317 = false;
										if (local202 > 0) {
											local953 = Static173.aClass1_Sub1_Sub1_1.method4137();
											local1317 = Static173.aClass1_Sub1_Sub1_1.method4130() == 1;
										}
										for (local275 = 0; local275 < Static193.anInt1026; local275++) {
											if (local367) {
												if (local373.equals(Static397.aStringArray53[local275])) {
													Static397.aStringArray53[local275] = local371;
													Static282.aStringArray41[local275] = local373;
													local371 = null;
													break;
												}
											} else if (local371.equals(Static397.aStringArray53[local275])) {
												if (Static409.anIntArray592[local275] != local202) {
													Static409.anIntArray592[local275] = local202;
													if (local202 > 0) {
														Static130.method1888("", 0, 5, local371 + Static352.aClass84_83.method1678(Static167.anInt3118), "");
													}
													if (local202 == 0) {
														Static130.method1888("", 0, 5, local371 + Static449.aClass84_105.method1678(Static167.anInt3118), "");
													}
												}
												Static282.aStringArray41[local275] = local373;
												Static329.aStringArray46[local275] = local953;
												Static407.anIntArray584[local275] = local263;
												local371 = null;
												Static215.aBooleanArray13[local275] = local1317;
												break;
											}
										}
										if (local371 != null && Static193.anInt1026 < 200) {
											Static397.aStringArray53[Static193.anInt1026] = local371;
											Static282.aStringArray41[Static193.anInt1026] = local373;
											Static409.anIntArray592[Static193.anInt1026] = local202;
											Static329.aStringArray46[Static193.anInt1026] = local953;
											Static407.anIntArray584[Static193.anInt1026] = local263;
											Static215.aBooleanArray13[Static193.anInt1026] = local1317;
											Static193.anInt1026++;
										}
									}
									Static325.anInt5702 = 2;
									Static151.anInt2580 = Static337.anInt7419;
									local67 = Static193.anInt1026;
									while (local67 > 0) {
										local67--;
										local367 = true;
										for (local198 = 0; local198 < local67; local198++) {
											if (Static409.anIntArray592[local198] != Static193.anInt1052 && Static193.anInt1052 == Static409.anIntArray592[local198 + 1] || Static409.anIntArray592[local198] == 0 && Static409.anIntArray592[local198 + 1] != 0) {
												local202 = Static409.anIntArray592[local198];
												Static409.anIntArray592[local198] = Static409.anIntArray592[local198 + 1];
												Static409.anIntArray592[local198 + 1] = local202;
												local949 = Static329.aStringArray46[local198];
												Static329.aStringArray46[local198] = Static329.aStringArray46[local198 + 1];
												Static329.aStringArray46[local198 + 1] = local949;
												local953 = Static397.aStringArray53[local198];
												Static397.aStringArray53[local198] = Static397.aStringArray53[local198 + 1];
												Static397.aStringArray53[local198 + 1] = local953;
												local2145 = Static282.aStringArray41[local198];
												Static282.aStringArray41[local198] = Static282.aStringArray41[local198 + 1];
												Static282.aStringArray41[local198 + 1] = local2145;
												local275 = Static407.anIntArray584[local198];
												Static407.anIntArray584[local198] = Static407.anIntArray584[local198 + 1];
												Static407.anIntArray584[local198 + 1] = local275;
												local2181 = Static215.aBooleanArray13[local198];
												Static215.aBooleanArray13[local198] = Static215.aBooleanArray13[local198 + 1];
												Static215.aBooleanArray13[local198 + 1] = local2181;
												local367 = false;
											}
										}
										if (local367) {
											break;
										}
									}
									Static329.aClass237_97 = null;
									return true;
								}
								@Pc(2222) String local2222;
								if (Static329.aClass237_97 == Static175.aClass237_61) {
									local2222 = Static173.aClass1_Sub1_Sub1_1.method4137();
									local67 = Static173.aClass1_Sub1_Sub1_1.method4124();
									local198 = Static173.aClass1_Sub1_Sub1_1.method4124();
									if (Static359.method4943(local67)) {
										Static351.method4850(local198, local2222);
									}
									Static329.aClass237_97 = null;
									return true;
								} else if (Static329.aClass237_97 == Static63.aClass237_19) {
									local190 = Static173.aClass1_Sub1_Sub1_1.method4089();
									local67 = Static173.aClass1_Sub1_Sub1_1.method4133();
									local198 = Static173.aClass1_Sub1_Sub1_1.method4089();
									local202 = Static173.aClass1_Sub1_Sub1_1.method4088();
									if (Static359.method4943(local202)) {
										Static188.method2889(local198, local67, local190);
									}
									Static329.aClass237_97 = null;
									return true;
								} else if (Static364.aClass237_108 == Static329.aClass237_97) {
									Static167.anInt3119 = Static173.aClass1_Sub1_Sub1_1.method4118();
									Static9.anInt245 = Static173.aClass1_Sub1_Sub1_1.method4112() << 3;
									Static42.anInt754 = Static173.aClass1_Sub1_Sub1_1.method4112() << 3;
									Static329.aClass237_97 = null;
									return true;
								} else if (Static329.aClass237_97 == Static378.aClass237_110) {
									for (local190 = 0; local190 < Static311.aClass26_Sub2_Sub2_Sub1Array1.length; local190++) {
										if (Static311.aClass26_Sub2_Sub2_Sub1Array1[local190] != null) {
											Static311.aClass26_Sub2_Sub2_Sub1Array1[local190].anInt7073 = -1;
										}
									}
									for (local67 = 0; local67 < Static410.aClass26_Sub2_Sub2_Sub2Array1.length; local67++) {
										if (Static410.aClass26_Sub2_Sub2_Sub2Array1[local67] != null) {
											Static410.aClass26_Sub2_Sub2_Sub2Array1[local67].anInt7073 = -1;
										}
									}
									Static329.aClass237_97 = null;
									return true;
								} else {
									@Pc(2376) boolean local2376;
									if (Static121.aClass237_37 == Static329.aClass237_97) {
										local2222 = Static173.aClass1_Sub1_Sub1_1.method4137();
										local1783 = Static173.aClass1_Sub1_Sub1_1.method4130() == 1;
										if (local1783) {
											local371 = Static173.aClass1_Sub1_Sub1_1.method4137();
										} else {
											local371 = local2222;
										}
										local202 = Static173.aClass1_Sub1_Sub1_1.method4093();
										@Pc(2374) byte local2374 = Static173.aClass1_Sub1_Sub1_1.method4112();
										local2376 = false;
										if (local2374 == -128) {
											local2376 = true;
										}
										if (local2376) {
											if (Static214.anInt3899 == 0) {
												Static329.aClass237_97 = null;
												return true;
											}
											for (local271 = 0; Static214.anInt3899 > local271 && (!Static413.aClass254Array27[local271].aString59.equals(local371) || local202 != Static413.aClass254Array27[local271].anInt7389); local271++) {
											}
											if (local271 < Static214.anInt3899) {
												while (local271 < Static214.anInt3899 - 1) {
													Static413.aClass254Array27[local271] = Static413.aClass254Array27[local271 + 1];
													local271++;
												}
												Static214.anInt3899--;
												Static413.aClass254Array27[Static214.anInt3899] = null;
											}
										} else {
											local2145 = Static173.aClass1_Sub1_Sub1_1.method4137();
											local1341 = new Class254();
											local1341.aString58 = local2222;
											local1341.aString59 = local371;
											local1341.aString61 = Static22.method3265(local1341.aString59);
											local1341.aByte102 = local2374;
											local1341.anInt7389 = local202;
											local1341.aString60 = local2145;
											for (local287 = Static214.anInt3899 - 1; local287 >= 0; local287--) {
												local1320 = Static413.aClass254Array27[local287].aString61.compareTo(local1341.aString61);
												if (local1320 == 0) {
													Static413.aClass254Array27[local287].anInt7389 = local202;
													Static413.aClass254Array27[local287].aByte102 = local2374;
													Static413.aClass254Array27[local287].aString60 = local2145;
													if (local371.equals(Static196.aClass26_Sub2_Sub2_Sub1_1.aString51)) {
														Static270.aByte59 = local2374;
													}
													Static327.anInt5733 = Static337.anInt7419;
													Static329.aClass237_97 = null;
													return true;
												}
												if (local1320 < 0) {
													break;
												}
											}
											if (Static413.aClass254Array27.length <= Static214.anInt3899) {
												Static329.aClass237_97 = null;
												return true;
											}
											for (local1320 = Static214.anInt3899 - 1; local1320 > local287; local1320--) {
												Static413.aClass254Array27[local1320 + 1] = Static413.aClass254Array27[local1320];
											}
											if (Static214.anInt3899 == 0) {
												Static413.aClass254Array27 = new Class254[100];
											}
											Static413.aClass254Array27[local287 + 1] = local1341;
											Static214.anInt3899++;
											if (local371.equals(Static196.aClass26_Sub2_Sub2_Sub1_1.aString51)) {
												Static270.aByte59 = local2374;
											}
										}
										Static329.aClass237_97 = null;
										Static327.anInt5733 = Static337.anInt7419;
										return true;
									}
									@Pc(2646) long local2646;
									@Pc(2652) Class1_Sub43 local2652;
									@Pc(2668) Class1_Sub43 local2668;
									if (Static329.aClass237_97 == Static281.aClass237_84) {
										local190 = Static173.aClass1_Sub1_Sub1_1.method4095();
										if (local190 == 65535) {
											local190 = -1;
										}
										local67 = Static173.aClass1_Sub1_Sub1_1.method4133();
										local198 = Static173.aClass1_Sub1_Sub1_1.method4095();
										local202 = Static173.aClass1_Sub1_Sub1_1.method4088();
										local263 = Static173.aClass1_Sub1_Sub1_1.method4088();
										if (local263 == 65535) {
											local263 = -1;
										}
										if (Static359.method4943(local202)) {
											for (local267 = local190; local267 <= local263; local267++) {
												local2646 = (long) local267 + ((long) local67 << 32);
												local2652 = (Class1_Sub43) Static427.aClass27_41.method553(local2646);
												if (local2652 != null) {
													local2668 = new Class1_Sub43(local2652.anInt7461, local198);
													local2652.method6071();
												} else if (local267 == -1) {
													local2668 = new Class1_Sub43(Static103.method1572(local67).aClass1_Sub43_1.anInt7461, local198);
												} else {
													local2668 = new Class1_Sub43(0, local198);
												}
												Static427.aClass27_41.method564(local2646, local2668);
											}
										}
										Static329.aClass237_97 = null;
										return true;
									} else if (Static152.aClass237_50 == Static329.aClass237_97) {
										Static204.method3123(Static173.aClass1_Sub1_Sub1_1, Static283.anInt4985);
										Static329.aClass237_97 = null;
										return true;
									} else if (Static356.aClass237_106 == Static329.aClass237_97) {
										local190 = Static173.aClass1_Sub1_Sub1_1.method4093();
										if (local190 == 65535) {
											local190 = -1;
										}
										local67 = Static173.aClass1_Sub1_Sub1_1.method4088();
										local198 = Static173.aClass1_Sub1_Sub1_1.method4126();
										if (Static359.method4943(local67)) {
											Static414.method5597(local190, local198, 1, -1);
										}
										Static329.aClass237_97 = null;
										return true;
									} else if (Static329.aClass237_97 == Static260.aClass237_78) {
										local2222 = Static173.aClass1_Sub1_Sub1_1.method4137();
										local67 = Static173.aClass1_Sub1_Sub1_1.method4093();
										local373 = Static21.aClass245_1.method5566(local67).method4411(Static173.aClass1_Sub1_Sub1_1);
										Static27.method486(0, local2222, local2222, null, local67, local373, 19);
										Static329.aClass237_97 = null;
										return true;
									} else if (Static169.aClass237_58 == Static329.aClass237_97) {
										local2222 = Static173.aClass1_Sub1_Sub1_1.method4137();
										local371 = Static118.method3303(Static259.method5040(Static173.aClass1_Sub1_Sub1_1));
										Static130.method1888(local2222, 0, 6, local371, local2222);
										Static329.aClass237_97 = null;
										return true;
									} else if (Static329.aClass237_97 == Static346.aClass237_102) {
										local190 = Static173.aClass1_Sub1_Sub1_1.method4133();
										local67 = Static173.aClass1_Sub1_Sub1_1.method4134();
										local198 = Static173.aClass1_Sub1_Sub1_1.method4088();
										if (local198 == 65535) {
											local198 = -1;
										}
										local202 = Static173.aClass1_Sub1_Sub1_1.method4124();
										if (local202 == 65535) {
											local202 = -1;
										}
										local263 = Static173.aClass1_Sub1_Sub1_1.method4124();
										if (Static359.method4943(local263)) {
											for (local267 = local198; local267 <= local202; local267++) {
												local2646 = (long) local267 + ((long) local190 << 32);
												local2652 = (Class1_Sub43) Static427.aClass27_41.method553(local2646);
												if (local2652 != null) {
													local2668 = new Class1_Sub43(local67, local2652.anInt7463);
													local2652.method6071();
												} else if (local267 == -1) {
													local2668 = new Class1_Sub43(local67, Static103.method1572(local190).aClass1_Sub43_1.anInt7463);
												} else {
													local2668 = new Class1_Sub43(local67, -1);
												}
												Static427.aClass27_41.method564(local2646, local2668);
											}
										}
										Static329.aClass237_97 = null;
										return true;
									} else if (Static129.aClass237_40 == Static329.aClass237_97) {
										local190 = Static173.aClass1_Sub1_Sub1_1.method4134();
										local67 = Static173.aClass1_Sub1_Sub1_1.method4124();
										if (Static359.method4943(local67)) {
											Static414.method5597(-1, local190, 3, -1);
										}
										Static329.aClass237_97 = null;
										return true;
									} else if (Static329.aClass237_97 == Static23.aClass237_6) {
										local2222 = Static173.aClass1_Sub1_Sub1_1.method4137();
										local67 = Static173.aClass1_Sub1_Sub1_1.method4093();
										local198 = Static173.aClass1_Sub1_Sub1_1.method4095();
										if (Static359.method4943(local198)) {
											Static351.method4850(local67, local2222);
										}
										Static329.aClass237_97 = null;
										return true;
									} else if (Static159.aClass237_55 == Static329.aClass237_97) {
										local190 = Static173.aClass1_Sub1_Sub1_1.method4086();
										local67 = Static173.aClass1_Sub1_Sub1_1.method4086();
										local198 = Static173.aClass1_Sub1_Sub1_1.method4134();
										Static379.anIntArray539[local190] = local198;
										Static108.anIntArray175[local190] = local67;
										Static261.anIntArray678[local190] = 1;
										local202 = Static273.anIntArray393[local190] - 1;
										for (local263 = 0; local263 < local202; local263++) {
											if (Class128_Sub1.anIntArray292[local263] <= local198) {
												Static261.anIntArray678[local190] = local263 + 2;
											}
										}
										Static350.anIntArray477[Static113.anInt5770++ & 0x1F] = local190;
										Static329.aClass237_97 = null;
										return true;
									} else if (Static79.aClass237_22 == Static329.aClass237_97) {
										Static216.method3269(Static327.aClass146_9);
										Static329.aClass237_97 = null;
										return true;
									} else if (Static204.aClass237_64 == Static329.aClass237_97) {
										local2222 = Static173.aClass1_Sub1_Sub1_1.method4137();
										local67 = Static173.aClass1_Sub1_Sub1_1.method4124();
										local198 = Static173.aClass1_Sub1_Sub1_1.method4133();
										if (Static359.method4943(local67)) {
											Static54.method964(local198, local2222);
										}
										Static329.aClass237_97 = null;
										return true;
									} else if (Static175.aClass237_60 == Static329.aClass237_97) {
										Static95.anInt1783 = Static173.aClass1_Sub1_Sub1_1.method4100();
										Static367.anInt6237 = Static337.anInt7419;
										Static329.aClass237_97 = null;
										return true;
									} else if (Static97.aClass237_27 == Static329.aClass237_97) {
										local190 = Static173.aClass1_Sub1_Sub1_1.method4093();
										if (local190 == 65535) {
											local190 = -1;
										}
										local67 = Static173.aClass1_Sub1_Sub1_1.method4130();
										local198 = Static173.aClass1_Sub1_Sub1_1.method4093();
										local202 = Static173.aClass1_Sub1_Sub1_1.method4130();
										Static329.method4613(local198, local202, local67, local190);
										Static329.aClass237_97 = null;
										return true;
									} else {
										@Pc(3156) long local3156;
										if (Static329.aClass237_97 == Static337.aClass237_124) {
											local367 = Static173.aClass1_Sub1_Sub1_1.method4130() == 1;
											local371 = Static173.aClass1_Sub1_Sub1_1.method4137();
											local373 = local371;
											if (local367) {
												local373 = Static173.aClass1_Sub1_Sub1_1.method4137();
											}
											local384 = Static173.aClass1_Sub1_Sub1_1.method4094();
											local389 = Static173.aClass1_Sub1_Sub1_1.method4093();
											local3156 = Static173.aClass1_Sub1_Sub1_1.method4142();
											local1320 = Static173.aClass1_Sub1_Sub1_1.method4130();
											@Pc(3166) long local3166 = local3156 + (local389 << 32);
											@Pc(3168) boolean local3168 = false;
											@Pc(3170) int local3170 = 0;
											while (true) {
												if (local3170 >= 100) {
													if (local1320 <= 1) {
														if (Static273.aBoolean326 && !Static411.aBoolean461 || Static443.aBoolean484) {
															local3168 = true;
														} else if (Static149.method2259(local373)) {
															local3168 = true;
														}
													}
													break;
												}
												if (local3166 == Static26.aLongArray4[local3170]) {
													local3168 = true;
													break;
												}
												local3170++;
											}
											if (!local3168 && Static372.anInt7405 == 0) {
												Static26.aLongArray4[Static161.anInt2765] = local3166;
												Static161.anInt2765 = (Static161.anInt2765 + 1) % 100;
												@Pc(3236) String local3236 = Static118.method3303(Static259.method5040(Static173.aClass1_Sub1_Sub1_1));
												if (local1320 == 2 || local1320 == 3) {
													Static27.method486(0, "<img=1>" + local373, "<img=1>" + local371, Static379.method5191(local384), -1, local3236, 9);
												} else if (local1320 == 1) {
													Static27.method486(0, "<img=0>" + local373, "<img=0>" + local371, Static379.method5191(local384), -1, local3236, 9);
												} else {
													Static27.method486(0, local373, local371, Static379.method5191(local384), -1, local3236, 9);
												}
											}
											Static329.aClass237_97 = null;
											return true;
										} else if (Static329.aClass237_97 == Static405.aClass237_120) {
											local190 = Static173.aClass1_Sub1_Sub1_1.method4095();
											local67 = Static173.aClass1_Sub1_Sub1_1.method4129();
											local198 = Static173.aClass1_Sub1_Sub1_1.method4095();
											@Pc(3331) Class26_Sub2_Sub2_Sub2 local3331 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local190];
											if (local3331 != null) {
												Static175.method2736(local198, local67, local3331);
											}
											Static329.aClass237_97 = null;
											return true;
										} else if (Static109.aClass237_32 == Static329.aClass237_97) {
											local2222 = Static173.aClass1_Sub1_Sub1_1.method4137();
											local67 = Static173.aClass1_Sub1_Sub1_1.method4086();
											local198 = Static173.aClass1_Sub1_Sub1_1.method4086();
											local202 = Static173.aClass1_Sub1_Sub1_1.method4124();
											if (local202 == 65535) {
												local202 = -1;
											}
											if (local198 >= 1 && local198 <= 8) {
												if (local2222.equalsIgnoreCase("null")) {
													local2222 = null;
												}
												Static386.aStringArray50[local198 - 1] = local2222;
												Static266.anIntArray387[local198 - 1] = local202;
												Static271.aBooleanArray17[local198 - 1] = local67 == 0;
											}
											Static329.aClass237_97 = null;
											return true;
										} else if (Static329.aClass237_97 == Static21.aClass237_3) {
											local367 = Static173.aClass1_Sub1_Sub1_1.method4130() == 1;
											local371 = Static173.aClass1_Sub1_Sub1_1.method4137();
											local373 = local371;
											if (local367) {
												local373 = Static173.aClass1_Sub1_Sub1_1.method4137();
											}
											local202 = Static173.aClass1_Sub1_Sub1_1.method4130();
											local263 = Static173.aClass1_Sub1_Sub1_1.method4093();
											local2376 = false;
											if (local202 <= 1 && Static149.method2259(local373)) {
												local2376 = true;
											}
											if (!local2376 && Static372.anInt7405 == 0) {
												local2145 = Static21.aClass245_1.method5566(local263).method4411(Static173.aClass1_Sub1_Sub1_1);
												if (local202 == 2) {
													Static27.method486(0, "<img=1>" + local373, "<img=1>" + local371, null, local263, local2145, 25);
												} else if (local202 == 1) {
													Static27.method486(0, "<img=0>" + local373, "<img=0>" + local371, null, local263, local2145, 25);
												} else {
													Static27.method486(0, local373, local371, null, local263, local2145, 25);
												}
											}
											Static329.aClass237_97 = null;
											return true;
										} else if (Static425.aClass237_123 == Static329.aClass237_97) {
											Static216.method3269(Static437.aClass146_15);
											Static329.aClass237_97 = null;
											return true;
										} else if (Static329.aClass237_97 == Static53.aClass237_13) {
											Static9.method241(false);
											Static329.aClass237_97 = null;
											return true;
										} else if (Static146.aClass237_47 == Static329.aClass237_97) {
											Static216.method3269(Static136.aClass146_4);
											Static329.aClass237_97 = null;
											return true;
										} else if (Static329.aClass237_97 == Static135.aClass237_43) {
											local190 = Static173.aClass1_Sub1_Sub1_1.method4088();
											local67 = Static173.aClass1_Sub1_Sub1_1.method4087();
											Static51.aClass79_1.method1578(local190, local67);
											Static329.aClass237_97 = null;
											return true;
										} else if (Static219.aClass237_70 == Static329.aClass237_97) {
											local190 = Static173.aClass1_Sub1_Sub1_1.method4093();
											local67 = Static173.aClass1_Sub1_Sub1_1.method4093();
											local198 = Static173.aClass1_Sub1_Sub1_1.method4093();
											local202 = Static173.aClass1_Sub1_Sub1_1.method4093();
											if (Static359.method4943(local190) && Static448.aClass219ArrayArray2[local67] != null) {
												for (local263 = local198; local263 < local202; local263++) {
													local267 = Static173.aClass1_Sub1_Sub1_1.method4142();
													if (local263 < Static448.aClass219ArrayArray2[local67].length && Static448.aClass219ArrayArray2[local67][local263] != null) {
														Static448.aClass219ArrayArray2[local67][local263].anInt6355 = local267;
													}
												}
											}
											Static329.aClass237_97 = null;
											return true;
										} else if (Static329.aClass237_97 == Static153.aClass237_109) {
											local190 = Static173.aClass1_Sub1_Sub1_1.method4093();
											local67 = Static173.aClass1_Sub1_Sub1_1.method4088();
											local198 = Static173.aClass1_Sub1_Sub1_1.method4133();
											local202 = Static173.aClass1_Sub1_Sub1_1.method4095();
											if (Static359.method4943(local190)) {
												Static321.method4522((local202 << 16) + local67, local198);
											}
											Static329.aClass237_97 = null;
											return true;
										} else if (Static382.aClass237_112 == Static329.aClass237_97) {
											local190 = Static173.aClass1_Sub1_Sub1_1.method4088();
											local67 = Static173.aClass1_Sub1_Sub1_1.method4093();
											local198 = Static173.aClass1_Sub1_Sub1_1.method4126();
											local202 = Static173.aClass1_Sub1_Sub1_1.method4086();
											if (Static359.method4943(local67)) {
												local1430 = (Class1_Sub36) Static445.aClass27_42.method553((long) local198);
												if (local1430 != null) {
													Static225.method3382(local190 != local1430.anInt5680, local1430, false);
												}
												Static273.method3956(false, local198, local190, local202);
											}
											Static329.aClass237_97 = null;
											return true;
										} else if (Static329.aClass237_97 == Static447.aClass237_129) {
											local190 = Static173.aClass1_Sub1_Sub1_1.method4093();
											local371 = Static173.aClass1_Sub1_Sub1_1.method4137();
											@Pc(3760) Object[] local3760 = new Object[local371.length() + 1];
											for (local202 = local371.length() - 1; local202 >= 0; local202--) {
												if (local371.charAt(local202) == 's') {
													local3760[local202 + 1] = Static173.aClass1_Sub1_Sub1_1.method4137();
												} else {
													local3760[local202 + 1] = Integer.valueOf(Static173.aClass1_Sub1_Sub1_1.method4087());
												}
											}
											local3760[0] = Integer.valueOf(Static173.aClass1_Sub1_Sub1_1.method4087());
											if (Static359.method4943(local190)) {
												@Pc(3818) Class1_Sub6 local3818 = new Class1_Sub6();
												local3818.anObjectArray3 = local3760;
												Static104.method1608(local3818);
											}
											Static329.aClass237_97 = null;
											return true;
										} else if (Static329.aClass237_97 == Static120.aClass237_36) {
											local190 = Static173.aClass1_Sub1_Sub1_1.method4088();
											@Pc(3838) byte local3838 = Static173.aClass1_Sub1_Sub1_1.method4090();
											local198 = Static173.aClass1_Sub1_Sub1_1.method4124();
											if (Static359.method4943(local190)) {
												Static150.method2263(local198, local3838);
											}
											Static329.aClass237_97 = null;
											return true;
										} else if (Static329.aClass237_97 == Static98.aClass237_28) {
											Static216.method3269(Static371.aClass146_10);
											Static329.aClass237_97 = null;
											return true;
										} else if (Static380.aClass237_111 == Static329.aClass237_97) {
											local190 = Static173.aClass1_Sub1_Sub1_1.method4095();
											local67 = Static173.aClass1_Sub1_Sub1_1.method4095();
											local198 = Static173.aClass1_Sub1_Sub1_1.method4133();
											if (Static359.method4943(local190)) {
												Static150.method2263(local67, local198);
											}
											Static329.aClass237_97 = null;
											return true;
										} else if (Static326.aClass237_96 == Static329.aClass237_97) {
											Static383.method5218();
											Static329.aClass237_97 = null;
											return true;
										} else if (Static329.aClass237_97 == Static122.aClass237_38) {
											Static118.anInt3959 = Static173.aClass1_Sub1_Sub1_1.method4118();
											Static368.anInt6276 = Static173.aClass1_Sub1_Sub1_1.method4118();
											Static329.aClass237_97 = null;
											return true;
										} else if (Static276.aClass237_83 == Static329.aClass237_97) {
											Static216.method3269(Static455.aClass146_8);
											Static329.aClass237_97 = null;
											return true;
										} else if (Static329.aClass237_97 == Static289.aClass237_87) {
											Static49.method4791();
											Static329.aClass237_97 = null;
											return false;
										} else if (Static35.aClass237_30 == Static329.aClass237_97) {
											Static222.method5417(Static173.aClass1_Sub1_Sub1_1, Static119.aClass138_7, Static283.anInt4985);
											Static329.aClass237_97 = null;
											return true;
										} else if (Static329.aClass237_97 == Static282.aClass237_85) {
											local190 = Static173.aClass1_Sub1_Sub1_1.method4130();
											if (Static173.aClass1_Sub1_Sub1_1.method4130() == 0) {
												Static146.aClass202Array1[local190] = new Class202();
											} else {
												Static173.aClass1_Sub1_Sub1_1.anInt5056--;
												Static146.aClass202Array1[local190] = new Class202(Static173.aClass1_Sub1_Sub1_1);
											}
											Static329.aClass237_97 = null;
											Static448.anInt7686 = Static337.anInt7419;
											return true;
										} else if (Static329.aClass237_97 == Static398.aClass237_116) {
											local190 = Static173.aClass1_Sub1_Sub1_1.method4093();
											local67 = Static173.aClass1_Sub1_Sub1_1.method4087();
											local198 = Static173.aClass1_Sub1_Sub1_1.method4088();
											local202 = Static173.aClass1_Sub1_Sub1_1.method4095();
											local263 = Static173.aClass1_Sub1_Sub1_1.method4124();
											if (Static359.method4943(local190)) {
												Static32.method560(local202, local67, local198, local263);
											}
											Static329.aClass237_97 = null;
											return true;
										} else if (Static191.aClass237_62 == Static329.aClass237_97) {
											if (Static273.anInt4878 != -1) {
												Static313.method4475(0, Static273.anInt4878);
											}
											Static329.aClass237_97 = null;
											return true;
										} else if (Static329.aClass237_97 == Static337.aClass237_125) {
											local190 = Static173.aClass1_Sub1_Sub1_1.method4118();
											local67 = Static173.aClass1_Sub1_Sub1_1.method4124();
											local1783 = (local190 & 0x1) == 1;
											Static54.method967(local67, local1783);
											Static373.anIntArray521[Static51.anInt963++ & 0x1F] = local67;
											Static329.aClass237_97 = null;
											return true;
										} else if (Static329.aClass237_97 == Static54.aClass237_15) {
											Static216.method3269(Static18.aClass146_2);
											Static329.aClass237_97 = null;
											return true;
										} else if (Static136.aClass237_44 == Static329.aClass237_97) {
											Static442.method4063();
											Static329.aClass237_97 = null;
											return false;
										} else if (Static329.aClass237_97 == Static298.aClass237_90) {
											local190 = Static173.aClass1_Sub1_Sub1_1.method4088();
											local67 = Static173.aClass1_Sub1_Sub1_1.method4087();
											local198 = Static173.aClass1_Sub1_Sub1_1.method4093();
											if (local198 == 65535) {
												local198 = -1;
											}
											local202 = Static173.aClass1_Sub1_Sub1_1.method4087();
											if (Static359.method4943(local190)) {
												Static384.method5261(local67, local198, local202);
												@Pc(4135) Class268 local4135 = Static196.aClass139_1.method3228(local198);
												Static32.method560(local4135.anInt7764, local202, local4135.anInt7759, local4135.anInt7741);
												Static319.method4499(local4135.anInt7762, local202, local4135.anInt7725, local4135.anInt7776);
											}
											Static329.aClass237_97 = null;
											return true;
										} else if (Static114.aClass237_34 == Static329.aClass237_97) {
											local190 = Static173.aClass1_Sub1_Sub1_1.method4087();
											Static161.aClass100_2 = Static119.aClass138_7.method3221(local190);
											Static329.aClass237_97 = null;
											return true;
										} else if (Static437.aClass237_127 == Static329.aClass237_97) {
											@Pc(4180) byte local4180 = Static173.aClass1_Sub1_Sub1_1.method4112();
											local67 = Static173.aClass1_Sub1_Sub1_1.method4093();
											Static51.aClass79_1.method1575(local4180, local67);
											Static329.aClass237_97 = null;
											return true;
										} else if (Static329.aClass237_97 == Static454.aClass237_131) {
											local190 = Static173.aClass1_Sub1_Sub1_1.method4093();
											local67 = Static173.aClass1_Sub1_Sub1_1.method4130();
											local1783 = (local67 & 0x1) == 1;
											Static256.method3767(local190, local1783);
											local202 = Static173.aClass1_Sub1_Sub1_1.method4093();
											for (local263 = 0; local263 < local202; local263++) {
												local267 = Static173.aClass1_Sub1_Sub1_1.method4093();
												local271 = Static173.aClass1_Sub1_Sub1_1.method4129();
												if (local271 == 255) {
													local271 = Static173.aClass1_Sub1_Sub1_1.method4087();
												}
												Static320.method4514(local271, local267 - 1, local263, local1783, local190);
											}
											Static373.anIntArray521[Static51.anInt963++ & 0x1F] = local190;
											Static329.aClass237_97 = null;
											return true;
										} else if (Static425.aClass237_122 == Static329.aClass237_97) {
											local367 = Static173.aClass1_Sub1_Sub1_1.method4130() == 1;
											local371 = Static173.aClass1_Sub1_Sub1_1.method4137();
											local373 = local371;
											if (local367) {
												local373 = Static173.aClass1_Sub1_Sub1_1.method4137();
											}
											local202 = Static173.aClass1_Sub1_Sub1_1.method4130();
											@Pc(4299) boolean local4299 = false;
											if (local202 <= 1) {
												if (Static273.aBoolean326 && !Static411.aBoolean461 || Static443.aBoolean484) {
													local4299 = true;
												} else if (local202 <= 1 && Static149.method2259(local373)) {
													local4299 = true;
												}
											}
											if (!local4299 && Static372.anInt7405 == 0) {
												local953 = Static118.method3303(Static259.method5040(Static173.aClass1_Sub1_Sub1_1));
												if (local202 == 2) {
													Static27.method486(0, "<img=1>" + local373, "<img=1>" + local371, null, -1, local953, 24);
												} else if (local202 == 1) {
													Static27.method486(0, "<img=0>" + local373, "<img=0>" + local371, null, -1, local953, 24);
												} else {
													Static27.method486(0, local373, local371, null, -1, local953, 24);
												}
											}
											Static329.aClass237_97 = null;
											return true;
										} else if (Static329.aClass237_97 == Static152.aClass237_51) {
											local190 = Static173.aClass1_Sub1_Sub1_1.method4130();
											local67 = local190 >> 5;
											local198 = local190 & 0x1F;
											if (local198 == 0) {
												Static444.aClass3Array1[local67] = null;
												Static329.aClass237_97 = null;
												return true;
											}
											@Pc(4435) Class3 local4435 = new Class3();
											local4435.anInt171 = local198;
											local4435.anInt165 = Static173.aClass1_Sub1_Sub1_1.method4130();
											if (local4435.anInt165 >= 0 && local4435.anInt165 < Static233.aClass80Array10.length) {
												if (local4435.anInt171 == 1 || local4435.anInt171 == 10) {
													local4435.anInt164 = Static173.aClass1_Sub1_Sub1_1.method4093();
													Static173.aClass1_Sub1_Sub1_1.anInt5056 += 6;
												} else if (local4435.anInt171 >= 2 && local4435.anInt171 <= 6) {
													if (local4435.anInt171 == 2) {
														local4435.anInt168 = 64;
														local4435.anInt172 = 64;
													}
													if (local4435.anInt171 == 3) {
														local4435.anInt168 = 0;
														local4435.anInt172 = 64;
													}
													if (local4435.anInt171 == 4) {
														local4435.anInt168 = 128;
														local4435.anInt172 = 64;
													}
													if (local4435.anInt171 == 5) {
														local4435.anInt168 = 64;
														local4435.anInt172 = 0;
													}
													if (local4435.anInt171 == 6) {
														local4435.anInt168 = 64;
														local4435.anInt172 = 128;
													}
													local4435.anInt171 = 2;
													local4435.anInt167 = Static173.aClass1_Sub1_Sub1_1.method4130();
													local4435.anInt168 += Static173.aClass1_Sub1_Sub1_1.method4093() - Static437.anInt7555 << 7;
													local4435.anInt172 += Static173.aClass1_Sub1_Sub1_1.method4093() - Static134.anInt5502 << 7;
													local4435.anInt174 = Static173.aClass1_Sub1_Sub1_1.method4130();
													local4435.anInt163 = Static173.aClass1_Sub1_Sub1_1.method4093();
												}
												local4435.anInt173 = Static173.aClass1_Sub1_Sub1_1.method4093();
												if (local4435.anInt173 == 65535) {
													local4435.anInt173 = -1;
												}
												Static444.aClass3Array1[local67] = local4435;
											}
											Static329.aClass237_97 = null;
											return true;
										} else if (Static70.aClass237_20 == Static329.aClass237_97) {
											local190 = Static173.aClass1_Sub1_Sub1_1.method4124();
											local67 = Static173.aClass1_Sub1_Sub1_1.method4129();
											local198 = Static173.aClass1_Sub1_Sub1_1.method4093();
											if (Static359.method4943(local190)) {
												if (local67 == 2) {
													Static134.method4396();
												}
												Static273.anInt4878 = local198;
												Static15.method2739(local198);
												Static189.method2894(false);
												Static104.method1597(Static273.anInt4878);
												for (local202 = 0; local202 < 100; local202++) {
													Static22.aBooleanArray12[local202] = true;
												}
											}
											Static329.aClass237_97 = null;
											return true;
										} else if (Static329.aClass237_97 == Static88.aClass237_24) {
											Static216.method3269(Static395.aClass146_13);
											Static329.aClass237_97 = null;
											return true;
										} else if (Static329.aClass237_97 == Static283.aClass237_86) {
											local190 = Static173.aClass1_Sub1_Sub1_1.method4130();
											local67 = Static173.aClass1_Sub1_Sub1_1.method4130();
											if (local190 == 255) {
												local190 = -1;
												local67 = -1;
											}
											Static427.method5723(local67, local190);
											Static329.aClass237_97 = null;
											return true;
										} else if (Static329.aClass237_97 == Static397.aClass237_114) {
											local190 = Static173.aClass1_Sub1_Sub1_1.method4088();
											local67 = Static173.aClass1_Sub1_Sub1_1.method4088();
											local198 = Static173.aClass1_Sub1_Sub1_1.method4087();
											local202 = Static173.aClass1_Sub1_Sub1_1.method4124();
											local263 = Static173.aClass1_Sub1_Sub1_1.method4093();
											if (Static359.method4943(local202)) {
												Static414.method5597(local67 << 16 | local190, local198, 7, local263);
											}
											Static329.aClass237_97 = null;
											return true;
										} else if (Static329.aClass237_97 == Static134.aClass237_93) {
											local190 = Static173.aClass1_Sub1_Sub1_1.method4124();
											local67 = Static173.aClass1_Sub1_Sub1_1.method4118();
											if (Static359.method4943(local190)) {
												Static267.anInt4802 = local67;
											}
											Static329.aClass237_97 = null;
											return true;
										} else if (Static125.aClass237_39 == Static329.aClass237_97) {
											local190 = Static173.aClass1_Sub1_Sub1_1.method4093();
											local67 = Static173.aClass1_Sub1_Sub1_1.method4130();
											local198 = Static173.aClass1_Sub1_Sub1_1.method4130();
											local202 = Static173.aClass1_Sub1_Sub1_1.method4093() << 0;
											local263 = Static173.aClass1_Sub1_Sub1_1.method4130();
											local267 = Static173.aClass1_Sub1_Sub1_1.method4130();
											if (Static359.method4943(local190)) {
												Static268.method4071(local267, local198, true, local202, local67, local263);
											}
											Static329.aClass237_97 = null;
											return true;
										} else if (Static329.aClass237_97 == Static89.aClass237_25) {
											local190 = Static173.aClass1_Sub1_Sub1_1.method4093();
											local67 = Static173.aClass1_Sub1_Sub1_1.method4130();
											local198 = Static173.aClass1_Sub1_Sub1_1.method4130();
											local202 = Static173.aClass1_Sub1_Sub1_1.method4093() << 0;
											local263 = Static173.aClass1_Sub1_Sub1_1.method4130();
											local267 = Static173.aClass1_Sub1_Sub1_1.method4130();
											if (Static359.method4943(local190)) {
												Static255.method3756(local67, local267, local202, local263, local198);
											}
											Static329.aClass237_97 = null;
											return true;
										} else {
											@Pc(4901) int local4901;
											if (Static329.aClass237_97 == Static238.aClass237_73) {
												local367 = Static173.aClass1_Sub1_Sub1_1.method4130() == 1;
												local371 = Static173.aClass1_Sub1_Sub1_1.method4137();
												local373 = local371;
												if (local367) {
													local373 = Static173.aClass1_Sub1_Sub1_1.method4137();
												}
												local384 = Static173.aClass1_Sub1_Sub1_1.method4094();
												local389 = Static173.aClass1_Sub1_Sub1_1.method4093();
												local3156 = Static173.aClass1_Sub1_Sub1_1.method4142();
												local1320 = Static173.aClass1_Sub1_Sub1_1.method4130();
												local4901 = Static173.aClass1_Sub1_Sub1_1.method4093();
												@Pc(4908) long local4908 = (local389 << 32) + local3156;
												@Pc(4910) boolean local4910 = false;
												@Pc(4912) int local4912 = 0;
												while (true) {
													if (local4912 >= 100) {
														if (local1320 <= 1 && Static149.method2259(local373)) {
															local4910 = true;
														}
														break;
													}
													if (local4908 == Static26.aLongArray4[local4912]) {
														local4910 = true;
														break;
													}
													local4912++;
												}
												if (!local4910 && Static372.anInt7405 == 0) {
													Static26.aLongArray4[Static161.anInt2765] = local4908;
													Static161.anInt2765 = (Static161.anInt2765 + 1) % 100;
													@Pc(4964) String local4964 = Static21.aClass245_1.method5566(local4901).method4411(Static173.aClass1_Sub1_Sub1_1);
													if (local1320 == 2) {
														Static27.method486(0, "<img=1>" + local373, "<img=1>" + local371, Static379.method5191(local384), local4901, local4964, 20);
													} else if (local1320 == 1) {
														Static27.method486(0, "<img=0>" + local373, "<img=0>" + local371, Static379.method5191(local384), local4901, local4964, 20);
													} else {
														Static27.method486(0, local373, local371, Static379.method5191(local384), local4901, local4964, 20);
													}
												}
												Static329.aClass237_97 = null;
												return true;
											} else if (Static329.aClass237_97 == Static404.aClass237_117) {
												Static216.method3269(Static430.aClass146_14);
												Static329.aClass237_97 = null;
												return true;
											} else if (Static329.aClass237_97 == Static391.aClass237_113) {
												Static216.method3269(Static375.aClass146_11);
												Static329.aClass237_97 = null;
												return true;
											} else if (Static232.aClass237_72 == Static329.aClass237_97) {
												Static9.anInt245 = Static173.aClass1_Sub1_Sub1_1.method4128() << 3;
												Static42.anInt754 = Static173.aClass1_Sub1_Sub1_1.method4112() << 3;
												Static167.anInt3119 = Static173.aClass1_Sub1_Sub1_1.method4086();
												for (@Pc(5081) Class1_Sub20 local5081 = (Class1_Sub20) Static184.aClass27_23.method555(); local5081 != null; local5081 = (Class1_Sub20) Static184.aClass27_23.method563()) {
													local67 = (int) (local5081.aLong227 & 0x3FFFL);
													local198 = (int) (local5081.aLong227 >> 14 & 0x3FFFL);
													local202 = (int) (local5081.aLong227 >> 28 & 0x3L);
													if (local202 == Static167.anInt3119 && local67 >= Static9.anInt245 && local67 < Static9.anInt245 + 8 && Static42.anInt754 <= local198 && local198 < Static42.anInt754 + 8) {
														local5081.method6071();
														Static377.method5162(Static167.anInt3119, local67, local198);
													}
												}
												for (@Pc(5160) Class1_Sub19 local5160 = (Class1_Sub19) Static225.aClass266_35.method6000(); local5160 != null; local5160 = (Class1_Sub19) Static225.aClass266_35.method5994()) {
													if (Static9.anInt245 <= local5160.anInt3387 && local5160.anInt3387 < Static9.anInt245 + 8 && Static42.anInt754 <= local5160.anInt3386 && Static42.anInt754 + 8 > local5160.anInt3386 && local5160.anInt3385 == Static167.anInt3119) {
														local5160.anInt3375 = 0;
													}
												}
												Static329.aClass237_97 = null;
												return true;
											} else if (Static329.aClass237_97 == Static227.aClass237_71) {
												local190 = Static173.aClass1_Sub1_Sub1_1.method4096();
												local67 = Static173.aClass1_Sub1_Sub1_1.method4087();
												local198 = Static173.aClass1_Sub1_Sub1_1.method4130();
												local939 = "";
												local949 = local939;
												if ((local198 & 0x1) != 0) {
													local939 = Static173.aClass1_Sub1_Sub1_1.method4137();
													if ((local198 & 0x2) == 0) {
														local949 = local939;
													} else {
														local949 = Static173.aClass1_Sub1_Sub1_1.method4137();
													}
												}
												local953 = Static173.aClass1_Sub1_Sub1_1.method4137();
												if (local190 == 99) {
													Static391.method5338(local953);
												} else if (local949.equals("") || !Static149.method2259(local949)) {
													Static130.method1888(local939, local67, local190, local953, local949);
												} else {
													Static329.aClass237_97 = null;
													return true;
												}
												Static329.aClass237_97 = null;
												return true;
											} else {
												@Pc(5341) int local5341;
												if (Static329.aClass237_97 == Static343.aClass237_100) {
													local367 = Static173.aClass1_Sub1_Sub1_1.method4130() == 1;
													local371 = Static173.aClass1_Sub1_Sub1_1.method4137();
													local373 = local371;
													if (local367) {
														local373 = Static173.aClass1_Sub1_Sub1_1.method4137();
													}
													local384 = Static173.aClass1_Sub1_Sub1_1.method4093();
													local389 = Static173.aClass1_Sub1_Sub1_1.method4142();
													local275 = Static173.aClass1_Sub1_Sub1_1.method4130();
													local287 = Static173.aClass1_Sub1_Sub1_1.method4093();
													@Pc(5337) long local5337 = local389 + (local384 << 32);
													@Pc(5339) boolean local5339 = false;
													local5341 = 0;
													while (true) {
														if (local5341 >= 100) {
															if (local275 <= 1 && Static149.method2259(local373)) {
																local5339 = true;
															}
															break;
														}
														if (Static26.aLongArray4[local5341] == local5337) {
															local5339 = true;
															break;
														}
														local5341++;
													}
													if (!local5339 && Static372.anInt7405 == 0) {
														Static26.aLongArray4[Static161.anInt2765] = local5337;
														Static161.anInt2765 = (Static161.anInt2765 + 1) % 100;
														@Pc(5391) String local5391 = Static21.aClass245_1.method5566(local287).method4411(Static173.aClass1_Sub1_Sub1_1);
														if (local275 == 2) {
															Static27.method486(0, "<img=1>" + local373, "<img=1>" + local371, null, local287, local5391, 18);
														} else if (local275 == 1) {
															Static27.method486(0, "<img=0>" + local373, "<img=0>" + local371, null, local287, local5391, 18);
														} else {
															Static27.method486(0, local373, local371, null, local287, local5391, 18);
														}
													}
													Static329.aClass237_97 = null;
													return true;
												} else if (Static132.aClass237_41 == Static329.aClass237_97) {
													local190 = Static173.aClass1_Sub1_Sub1_1.method4093();
													if (Static359.method4943(local190)) {
														Static421.method5641();
													}
													Static329.aClass237_97 = null;
													return true;
												} else if (Static329.aClass237_97 == Static343.aClass237_101) {
													Static51.aClass79_1.method1579();
													Static329.aClass237_97 = null;
													Static193.anInt1051 += 32;
													return true;
												} else if (Static241.aClass237_74 == Static329.aClass237_97) {
													local190 = Static173.aClass1_Sub1_Sub1_1.method4088();
													local67 = Static173.aClass1_Sub1_Sub1_1.method4095();
													local198 = Static173.aClass1_Sub1_Sub1_1.method4093();
													local202 = Static173.aClass1_Sub1_Sub1_1.method4087();
													local263 = Static173.aClass1_Sub1_Sub1_1.method4130();
													local2376 = (local263 & 0x80) != 0;
													if (local202 >> 30 == 0) {
														@Pc(5751) Class191 local5751;
														@Pc(5682) Class45 local5682;
														@Pc(5731) Class45 local5731;
														@Pc(5695) Class191 local5695;
														@Pc(5745) Class191 local5745;
														if (local202 >> 29 != 0) {
															local271 = local202 & 0xFFFF;
															@Pc(5954) Class26_Sub2_Sub2_Sub2 local5954 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local271];
															if (local5954 != null) {
																if (local67 == 65535) {
																	local67 = -1;
																}
																local2181 = true;
																local1320 = local2376 ? local5954.anInt7102 : local5954.anInt7119;
																if (local67 != -1 && local1320 != -1) {
																	if (local1320 == local67) {
																		local5682 = Static168.aClass115_2.method2718(local67);
																		if (local5682.aBoolean62 && local5682.anInt1316 != -1) {
																			local5695 = Static191.aClass28_1.method567(local5682.anInt1316);
																			local5341 = local5695.anInt5751;
																			if (local5341 == 0 || local5341 == 2) {
																				local2181 = false;
																			} else if (local5341 == 1) {
																				local2181 = true;
																			}
																		}
																	} else {
																		local5682 = Static168.aClass115_2.method2718(local67);
																		local5731 = Static168.aClass115_2.method2718(local1320);
																		if (local5682.anInt1316 != -1 && local5731.anInt1316 != -1) {
																			local5745 = Static191.aClass28_1.method567(local5682.anInt1316);
																			local5751 = Static191.aClass28_1.method567(local5731.anInt1316);
																			if (local5745.anInt5740 < local5751.anInt5740) {
																				local2181 = false;
																			}
																		}
																	}
																}
																if (local2181) {
																	if (local2376) {
																		local5954.anInt7092 = local190;
																		local5954.anInt7081 = local263 & 0x7;
																		local5954.anInt7108 = 1;
																		local5954.anInt7100 = 0;
																		local5954.anInt7079 = 0;
																		local5954.anInt7102 = local67;
																		local5954.anInt7085 = local198 + Static403.anInt6978;
																		if (Static403.anInt6978 < local5954.anInt7085) {
																			local5954.anInt7100 = -1;
																		}
																		if (local5954.anInt7102 != -1 && Static403.anInt6978 == local5954.anInt7085) {
																			local4901 = Static168.aClass115_2.method2718(local5954.anInt7102).anInt1316;
																			if (local4901 != -1) {
																				local5695 = Static191.aClass28_1.method567(local4901);
																				if (local5695 != null && local5695.anIntArray452 != null) {
																					Static228.method3411(local5954.anInt7065, false, local5954.anInt7068, local5695, 0, local5954.aByte95);
																				}
																			}
																		}
																	} else {
																		local5954.anInt7128 = 1;
																		local5954.anInt7111 = local190;
																		local5954.anInt7119 = local67;
																		local5954.anInt7123 = local263 & 0x7;
																		local5954.anInt7076 = 0;
																		local5954.anInt7131 = local198 + Static403.anInt6978;
																		local5954.anInt7107 = 0;
																		if (local5954.anInt7131 > Static403.anInt6978) {
																			local5954.anInt7107 = -1;
																		}
																		if (local5954.anInt7119 != -1 && local5954.anInt7131 == Static403.anInt6978) {
																			local4901 = Static168.aClass115_2.method2718(local5954.anInt7119).anInt1316;
																			if (local4901 != -1) {
																				local5695 = Static191.aClass28_1.method567(local4901);
																				if (local5695 != null && local5695.anIntArray452 != null) {
																					Static228.method3411(local5954.anInt7065, false, local5954.anInt7068, local5695, 0, local5954.aByte95);
																				}
																			}
																		}
																	}
																}
															}
														} else if (local202 >> 28 != 0) {
															local271 = local202 & 0xFFFF;
															@Pc(5641) Class26_Sub2_Sub2_Sub1 local5641;
															if (local271 == Static453.anInt7845) {
																local5641 = Static196.aClass26_Sub2_Sub2_Sub1_1;
															} else {
																local5641 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local271];
															}
															if (local5641 != null) {
																if (local67 == 65535) {
																	local67 = -1;
																}
																local2181 = true;
																local1320 = local2376 ? local5641.anInt7102 : local5641.anInt7119;
																if (local67 != -1 && local1320 != -1) {
																	if (local1320 == local67) {
																		local5682 = Static168.aClass115_2.method2718(local67);
																		if (local5682.aBoolean62 && local5682.anInt1316 != -1) {
																			local5695 = Static191.aClass28_1.method567(local5682.anInt1316);
																			local5341 = local5695.anInt5751;
																			if (local5341 == 0 || local5341 == 2) {
																				local2181 = false;
																			} else if (local5341 == 1) {
																				local2181 = true;
																			}
																		}
																	} else {
																		local5682 = Static168.aClass115_2.method2718(local67);
																		local5731 = Static168.aClass115_2.method2718(local1320);
																		if (local5682.anInt1316 != -1 && local5731.anInt1316 != -1) {
																			local5745 = Static191.aClass28_1.method567(local5682.anInt1316);
																			local5751 = Static191.aClass28_1.method567(local5731.anInt1316);
																			if (local5745.anInt5740 < local5751.anInt5740) {
																				local2181 = false;
																			}
																		}
																	}
																}
																if (local2181) {
																	if (local2376) {
																		local5641.anInt7102 = local67;
																		local5641.anInt7108 = 1;
																		local5641.anInt7079 = 0;
																		local5641.anInt7081 = local263 & 0x7;
																		local5641.anInt7085 = Static403.anInt6978 + local198;
																		local5641.anInt7100 = 0;
																		local5641.anInt7092 = local190;
																		if (Static403.anInt6978 < local5641.anInt7085) {
																			local5641.anInt7100 = -1;
																		}
																		if (local5641.anInt7102 == 65535) {
																			local5641.anInt7102 = -1;
																		}
																		if (local5641.anInt7102 != -1 && Static403.anInt6978 == local5641.anInt7085) {
																			local4901 = Static168.aClass115_2.method2718(local5641.anInt7102).anInt1316;
																			if (local4901 != -1) {
																				local5695 = Static191.aClass28_1.method567(local4901);
																				if (local5695 != null && local5695.anIntArray452 != null) {
																					Static228.method3411(local5641.anInt7065, local5641 == Static196.aClass26_Sub2_Sub2_Sub1_1, local5641.anInt7068, local5695, 0, local5641.aByte95);
																				}
																			}
																		}
																	} else {
																		local5641.anInt7123 = local263 & 0x7;
																		local5641.anInt7128 = 1;
																		local5641.anInt7107 = 0;
																		local5641.anInt7131 = Static403.anInt6978 + local198;
																		local5641.anInt7119 = local67;
																		local5641.anInt7111 = local190;
																		local5641.anInt7076 = 0;
																		if (local5641.anInt7119 == 65535) {
																			local5641.anInt7119 = -1;
																		}
																		if (local5641.anInt7131 > Static403.anInt6978) {
																			local5641.anInt7107 = -1;
																		}
																		if (local5641.anInt7119 != -1 && Static403.anInt6978 == local5641.anInt7131) {
																			local4901 = Static168.aClass115_2.method2718(local5641.anInt7119).anInt1316;
																			if (local4901 != -1) {
																				local5695 = Static191.aClass28_1.method567(local4901);
																				if (local5695 != null && local5695.anIntArray452 != null) {
																					Static228.method3411(local5641.anInt7065, Static196.aClass26_Sub2_Sub2_Sub1_1 == local5641, local5641.anInt7068, local5695, 0, local5641.aByte95);
																				}
																			}
																		}
																	}
																}
															}
														}
													} else {
														local271 = local202 >> 28 & 0x3;
														local275 = (local202 >> 14 & 0x3FFF) - Static437.anInt7555;
														local287 = (local202 & 0x3FFF) - Static134.anInt5502;
														if (local275 >= 0 && local287 >= 0 && Static135.anInt2314 > local275 && Static352.anInt6022 > local287) {
															local1320 = local275 * 128 + 64;
															local4901 = local287 * 128 + 64;
															local404 = local271;
															if (local271 < 3 && Static340.method4799(local287, local275)) {
																local404 = local271 + 1;
															}
															@Pc(5610) Class26_Sub2_Sub3 local5610 = new Class26_Sub2_Sub3(local67, 0, Static403.anInt6978, local271, local404, local1320, Static289.method4078(local1320, local4901, local271) - local190, local4901, local275, local275, local287, local287, local263);
															Static136.aClass266_16.method5998(new Class1_Sub2_Sub15(local5610));
														}
													}
													Static329.aClass237_97 = null;
													return true;
												} else if (Static329.aClass237_97 == Static162.aClass237_57) {
													local190 = Static173.aClass1_Sub1_Sub1_1.method4124();
													local67 = Static173.aClass1_Sub1_Sub1_1.method4130();
													Static51.aClass79_1.method1578(local190, local67);
													Static329.aClass237_97 = null;
													return true;
												} else if (Static329.aClass237_97 == Static33.aClass237_9) {
													Static9.method241(true);
													Static329.aClass237_97 = null;
													return true;
												} else {
													Static315.method4700(null, "T1 - " + (Static329.aClass237_97 == null ? -1 : Static329.aClass237_97.method5430()) + "," + (Static264.aClass237_82 == null ? -1 : Static264.aClass237_82.method5430()) + "," + (Static411.aClass237_119 == null ? -1 : Static411.aClass237_119.method5430()) + " - " + Static283.anInt4985);
													Static234.method3459();
													return true;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
