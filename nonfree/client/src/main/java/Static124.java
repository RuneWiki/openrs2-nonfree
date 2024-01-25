import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
	public static int anInt2566;

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "Lclient!um;")
	public static final Class244 aClass244_13 = new Class244();

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "[[S")
	public static final short[][] aShortArrayArray5 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZI)V")
	public static void method2122(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static7.aClass6_Sub2_Sub15_2 != null) {
			Static242.anInt4489 = Static7.aClass6_Sub2_Sub15_2.anInt7184;
		} else {
			Static242.anInt4489 = -1;
		}
		Static263.anInt4747 = 0;
		Static396.aClass239_10 = null;
		Static173.aClass244_15 = null;
		Static7.aClass6_Sub2_Sub15_2 = null;
		Static7.method940();
		Static7.aClass244_7.method5969();
		Static244.aClass116_33 = null;
		Static76.aClass116_34 = null;
		Static305.aClass116_24 = null;
		Static96.anInt5951 = -1;
		Static435.aClass116_32 = null;
		Static42.aClass116_6 = null;
		Static358.anInt6379 = -1;
		Static431.aClass116_31 = null;
		Static7.aClass202_2 = null;
		Static78.aClass87_6 = null;
		Static20.aClass116_5 = null;
		Static44.aClass116_7 = null;
		Static7.aClass169_6.method3947();
		Static7.aClass108_2.method2646(64, 64);
		Static7.aClass169_6.method3951(128, 64);
		Static7.aClass104_2.method2614(64);
		Static69.aClass103_1.method2609(64);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)Z")
	public static boolean method2124() throws IOException {
		if (Static177.aClass73_6 == null) {
			return false;
		}
		@Pc(13) int local13 = Static177.aClass73_6.method1872();
		if (local13 == 0) {
			return false;
		}
		@Pc(73) int local73;
		if (Static73.aClass123_88 == null) {
			if (Static367.aBoolean426) {
				Static177.aClass73_6.method1877(1, Static232.aClass6_Sub1_Sub1_4.aByteArray96, 0);
				local13--;
				Static367.aBoolean426 = false;
				Static57.anInt1544++;
			}
			Static232.aClass6_Sub1_Sub1_4.anInt7898 = 0;
			if (Static232.aClass6_Sub1_Sub1_4.method3793()) {
				if (local13 == 0) {
					return false;
				}
				Static177.aClass73_6.method1877(1, Static232.aClass6_Sub1_Sub1_4.aByteArray96, 1);
				local13--;
				Static57.anInt1544++;
			}
			Static367.aBoolean426 = true;
			@Pc(69) Class123[] local69 = Static368.method4873();
			local73 = Static232.aClass6_Sub1_Sub1_4.method3796();
			if (local73 < 0 || local73 >= local69.length) {
				throw new IOException("invo:" + local73 + " ip:" + Static232.aClass6_Sub1_Sub1_4.anInt7898);
			}
			Static73.aClass123_88 = local69[local73];
			Static334.anInt5833 = Static73.aClass123_88.anInt3564;
		}
		if (Static334.anInt5833 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static177.aClass73_6.method1877(1, Static232.aClass6_Sub1_Sub1_4.aByteArray96, 0);
			Static57.anInt1544++;
			Static334.anInt5833 = Static232.aClass6_Sub1_Sub1_4.aByteArray96[0] & 0xFF;
			local13--;
		}
		if (Static334.anInt5833 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static177.aClass73_6.method1877(2, Static232.aClass6_Sub1_Sub1_4.aByteArray96, 0);
			Static232.aClass6_Sub1_Sub1_4.anInt7898 = 0;
			local13 -= 2;
			Static334.anInt5833 = Static232.aClass6_Sub1_Sub1_4.method6485();
			Static57.anInt1544 += 2;
		}
		if (Static334.anInt5833 > local13) {
			return false;
		}
		Static232.aClass6_Sub1_Sub1_4.anInt7898 = 0;
		Static177.aClass73_6.method1877(Static334.anInt5833, Static232.aClass6_Sub1_Sub1_4.aByteArray96, 0);
		Static40.anInt1173 = 0;
		Static57.anInt1544 += Static334.anInt5833;
		Static25.aClass123_44 = Static210.aClass123_197;
		Static210.aClass123_197 = Static26.aClass123_46;
		Static26.aClass123_46 = Static73.aClass123_88;
		@Pc(221) int local221;
		@Pc(225) int local225;
		@Pc(209) int local209;
		@Pc(217) int local217;
		if (Static283.aClass123_425 == Static73.aClass123_88) {
			local209 = Static232.aClass6_Sub1_Sub1_4.method6455();
			local73 = Static232.aClass6_Sub1_Sub1_4.method6485();
			local217 = Static232.aClass6_Sub1_Sub1_4.method6491();
			local221 = Static232.aClass6_Sub1_Sub1_4.method6477();
			local225 = Static232.aClass6_Sub1_Sub1_4.method6455();
			if (Static409.method6045(local221)) {
				Static114.method4753(local73, local225, local217, local209);
			}
			Static73.aClass123_88 = null;
			return true;
		}
		@Pc(268) int local268;
		if (Static141.aClass123_66 == Static73.aClass123_88) {
			local209 = Static232.aClass6_Sub1_Sub1_4.method6485();
			local73 = Static232.aClass6_Sub1_Sub1_4.method6433();
			local217 = Static232.aClass6_Sub1_Sub1_4.method6433();
			local221 = Static232.aClass6_Sub1_Sub1_4.method6485() << 0;
			local225 = Static232.aClass6_Sub1_Sub1_4.method6433();
			local268 = Static232.aClass6_Sub1_Sub1_4.method6433();
			if (Static409.method6045(local209)) {
				Static414.method5832(local217, true, local73, local268, local221, local225);
			}
			Static73.aClass123_88 = null;
			return true;
		} else if (Static73.aClass123_88 == Static263.aClass123_253) {
			Static406.method6002(Static292.aClass238_21);
			Static73.aClass123_88 = null;
			return true;
		} else if (Static122.aClass123_132 == Static73.aClass123_88) {
			local209 = Static232.aClass6_Sub1_Sub1_4.method6491();
			local73 = Static232.aClass6_Sub1_Sub1_4.method6455();
			if (Static409.method6045(local73)) {
				Static444.method6492(-1, 3, local209, -1);
			}
			Static73.aClass123_88 = null;
			return true;
		} else {
			@Pc(356) Class6_Sub9 local356;
			if (Static30.aClass123_49 == Static73.aClass123_88) {
				local209 = Static232.aClass6_Sub1_Sub1_4.method6442();
				local73 = Static232.aClass6_Sub1_Sub1_4.method6442();
				local217 = Static232.aClass6_Sub1_Sub1_4.method6477();
				if (Static409.method6045(local217)) {
					@Pc(349) Class6_Sub9 local349 = (Class6_Sub9) Static432.aClass74_33.method1883((long) local209);
					local356 = (Class6_Sub9) Static432.aClass74_33.method1883((long) local73);
					if (local356 != null) {
						Static37.method917(local349 == null || local349.anInt1505 != local356.anInt1505, false, local356);
					}
					if (local349 != null) {
						local349.method6525();
						Static432.aClass74_33.method1890((long) local73, local349);
					}
					@Pc(393) Class239 local393 = Static121.method2092(local209);
					if (local393 != null) {
						Static437.method6328(local393);
					}
					local393 = Static121.method2092(local73);
					if (local393 != null) {
						Static437.method6328(local393);
						Static141.method1120(true, local393);
					}
					if (Static36.anInt1129 != -1) {
						Static101.method1824(1, Static36.anInt1129);
					}
				}
				Static73.aClass123_88 = null;
				return true;
			} else if (Static73.aClass123_88 == Static85.aClass123_103) {
				Static406.method6002(Static306.aClass238_22);
				Static73.aClass123_88 = null;
				return true;
			} else {
				@Pc(612) boolean local612;
				@Pc(615) int local615;
				@Pc(469) boolean local469;
				@Pc(636) Class128 local636;
				@Pc(608) int local608;
				if (Static436.aClass123_407 == Static73.aClass123_88) {
					Static32.anInt6596 = Static144.anInt2943;
					if (Static334.anInt5833 == 0) {
						Static73.aClass123_88 = null;
						Static157.aString23 = null;
						Static55.aString6 = null;
						Static338.anInt5890 = 0;
						Static57.aClass128Array1 = null;
						return true;
					}
					Static55.aString6 = Static232.aClass6_Sub1_Sub1_4.method6473();
					local469 = Static232.aClass6_Sub1_Sub1_4.method6433() == 1;
					if (local469) {
						Static232.aClass6_Sub1_Sub1_4.method6473();
					}
					@Pc(479) long local479 = Static232.aClass6_Sub1_Sub1_4.method6467();
					Static157.aString23 = Static9.method305(local479);
					Static62.aByte27 = Static232.aClass6_Sub1_Sub1_4.method6438();
					local221 = Static232.aClass6_Sub1_Sub1_4.method6433();
					if (local221 == 255) {
						Static73.aClass123_88 = null;
						return true;
					}
					Static338.anInt5890 = local221;
					@Pc(503) Class128[] local503 = new Class128[100];
					for (local268 = 0; local268 < Static338.anInt5890; local268++) {
						local503[local268] = new Class128();
						local503[local268].aString27 = Static232.aClass6_Sub1_Sub1_4.method6473();
						local469 = Static232.aClass6_Sub1_Sub1_4.method6433() == 1;
						if (local469) {
							local503[local268].aString25 = Static232.aClass6_Sub1_Sub1_4.method6473();
						} else {
							local503[local268].aString25 = local503[local268].aString27;
						}
						local503[local268].aString24 = Static442.method6404(local503[local268].aString25);
						local503[local268].anInt3638 = Static232.aClass6_Sub1_Sub1_4.method6485();
						local503[local268].aByte58 = Static232.aClass6_Sub1_Sub1_4.method6438();
						local503[local268].aString26 = Static232.aClass6_Sub1_Sub1_4.method6473();
						if (local503[local268].aString25.equals(Static302.aClass3_Sub2_Sub1_Sub2_2.aString54)) {
							Static359.aByte83 = local503[local268].aByte58;
						}
					}
					local608 = Static338.anInt5890;
					while (local608 > 0) {
						local612 = true;
						local608--;
						for (local615 = 0; local615 < local608; local615++) {
							if (local503[local615].aString24.compareTo(local503[local615 + 1].aString24) > 0) {
								local636 = local503[local615];
								local503[local615] = local503[local615 + 1];
								local503[local615 + 1] = local636;
								local612 = false;
							}
						}
						if (local612) {
							break;
						}
					}
					Static57.aClass128Array1 = local503;
					Static73.aClass123_88 = null;
					return true;
				} else if (Static73.aClass123_88 == Static374.aClass123_345) {
					local209 = Static232.aClass6_Sub1_Sub1_4.method6485();
					if (local209 == 65535) {
						local209 = -1;
					}
					local73 = Static232.aClass6_Sub1_Sub1_4.method6433();
					local217 = Static232.aClass6_Sub1_Sub1_4.method6485();
					local221 = Static232.aClass6_Sub1_Sub1_4.method6433();
					Static89.method1610(local217, local221, local209, local73);
					Static73.aClass123_88 = null;
					return true;
				} else if (Static73.aClass123_88 == Static433.aClass123_403) {
					local209 = Static232.aClass6_Sub1_Sub1_4.method6446();
					local73 = Static232.aClass6_Sub1_Sub1_4.method6455();
					local217 = Static232.aClass6_Sub1_Sub1_4.method6491();
					local221 = Static232.aClass6_Sub1_Sub1_4.method6451();
					if (Static409.method6045(local73)) {
						Static315.method4590(local221, local209, local217);
					}
					Static73.aClass123_88 = null;
					return true;
				} else if (Static73.aClass123_88 == Static57.aClass123_77) {
					local209 = Static232.aClass6_Sub1_Sub1_4.method6433();
					local73 = local209 >> 5;
					local217 = local209 & 0x1F;
					if (local217 == 0) {
						Static122.aClass17Array1[local73] = null;
						Static73.aClass123_88 = null;
						return true;
					}
					@Pc(768) Class17 local768 = new Class17();
					local768.anInt532 = local217;
					local768.anInt537 = Static232.aClass6_Sub1_Sub1_4.method6433();
					if (local768.anInt537 >= 0 && Static227.aClass87Array13.length > local768.anInt537) {
						if (local768.anInt532 == 1 || local768.anInt532 == 10) {
							local768.anInt531 = Static232.aClass6_Sub1_Sub1_4.method6485();
							Static232.aClass6_Sub1_Sub1_4.anInt7898 += 6;
						} else if (local768.anInt532 >= 2 && local768.anInt532 <= 6) {
							if (local768.anInt532 == 2) {
								local768.anInt535 = 64;
								local768.anInt533 = 64;
							}
							if (local768.anInt532 == 3) {
								local768.anInt535 = 64;
								local768.anInt533 = 0;
							}
							if (local768.anInt532 == 4) {
								local768.anInt533 = 128;
								local768.anInt535 = 64;
							}
							if (local768.anInt532 == 5) {
								local768.anInt535 = 0;
								local768.anInt533 = 64;
							}
							if (local768.anInt532 == 6) {
								local768.anInt535 = 128;
								local768.anInt533 = 64;
							}
							local768.anInt532 = 2;
							local768.anInt538 = Static232.aClass6_Sub1_Sub1_4.method6433();
							local768.anInt533 += Static232.aClass6_Sub1_Sub1_4.method6485() - Static2.anInt6396 << 7;
							local768.anInt535 += Static232.aClass6_Sub1_Sub1_4.method6485() - Static348.anInt6273 << 7;
							local768.anInt540 = Static232.aClass6_Sub1_Sub1_4.method6433();
							local768.anInt536 = Static232.aClass6_Sub1_Sub1_4.method6485();
						}
						local768.anInt539 = Static232.aClass6_Sub1_Sub1_4.method6485();
						if (local768.anInt539 == 65535) {
							local768.anInt539 = -1;
						}
						Static122.aClass17Array1[local73] = local768;
					}
					Static73.aClass123_88 = null;
					return true;
				} else {
					@Pc(955) boolean local955;
					if (Static16.aClass123_28 == Static73.aClass123_88) {
						local209 = Static232.aClass6_Sub1_Sub1_4.method6433();
						local73 = Static232.aClass6_Sub1_Sub1_4.method6447();
						local955 = (local209 & 0x1) == 1;
						Static137.method2416(local955, local73);
						Static235.anIntArray306[Static338.anInt5882++ & 0x1F] = local73;
						Static73.aClass123_88 = null;
						return true;
					} else if (Static74.aClass123_91 == Static73.aClass123_88) {
						local209 = Static232.aClass6_Sub1_Sub1_4.method6455();
						local73 = Static232.aClass6_Sub1_Sub1_4.method6455();
						local217 = Static232.aClass6_Sub1_Sub1_4.method6472();
						@Pc(996) Class3_Sub2_Sub1_Sub1 local996 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local73];
						if (local996 != null) {
							Static99.method4913(local209, local996, local217);
						}
						Static73.aClass123_88 = null;
						return true;
					} else {
						@Pc(1029) String local1029;
						@Pc(1047) String local1047;
						@Pc(1033) String local1033;
						@Pc(1043) String local1043;
						@Pc(1057) int local1057;
						if (Static73.aClass123_88 == Static211.aClass123_198) {
							local209 = Static232.aClass6_Sub1_Sub1_4.method6433();
							@Pc(1025) boolean local1025 = (local209 & 0x1) == 1;
							local1029 = Static232.aClass6_Sub1_Sub1_4.method6473();
							local1033 = Static232.aClass6_Sub1_Sub1_4.method6473();
							if (local1033.equals("")) {
								local1033 = local1029;
							}
							local1043 = Static232.aClass6_Sub1_Sub1_4.method6473();
							local1047 = Static232.aClass6_Sub1_Sub1_4.method6473();
							if (local1047.equals("")) {
								local1047 = local1043;
							}
							if (local1025) {
								for (local1057 = 0; local1057 < Static125.anInt2592; local1057++) {
									if (Static22.aStringArray3[local1057].equals(local1047)) {
										Static186.aStringArray25[local1057] = local1029;
										Static22.aStringArray3[local1057] = local1033;
										Static85.aStringArray9[local1057] = local1043;
										Static147.aStringArray14[local1057] = local1047;
										break;
									}
								}
							} else {
								Static186.aStringArray25[Static125.anInt2592] = local1029;
								Static22.aStringArray3[Static125.anInt2592] = local1033;
								Static85.aStringArray9[Static125.anInt2592] = local1043;
								Static147.aStringArray14[Static125.anInt2592] = local1047;
								Static286.aBooleanArray19[Static125.anInt2592] = (local209 & 0x2) == 2;
								Static125.anInt2592++;
							}
							Static185.anInt3634 = Static144.anInt2943;
							Static73.aClass123_88 = null;
							return true;
						} else if (Static375.aClass123_348 == Static73.aClass123_88) {
							Static76.method6393();
							Static73.aClass123_88 = null;
							return true;
						} else if (Static244.aClass123_411 == Static73.aClass123_88) {
							local209 = Static232.aClass6_Sub1_Sub1_4.method6485();
							local73 = Static232.aClass6_Sub1_Sub1_4.method6433();
							local217 = Static232.aClass6_Sub1_Sub1_4.method6433();
							local221 = Static232.aClass6_Sub1_Sub1_4.method6485() << 0;
							local225 = Static232.aClass6_Sub1_Sub1_4.method6433();
							local268 = Static232.aClass6_Sub1_Sub1_4.method6433();
							if (Static409.method6045(local209)) {
								Static384.method5694(local73, local217, local225, local221, local268);
							}
							Static73.aClass123_88 = null;
							return true;
						} else if (Static73.aClass123_88 == Static295.aClass123_291) {
							Static242.anInt4488 = Static232.aClass6_Sub1_Sub1_4.method6431();
							Static40.anInt1172 = Static232.aClass6_Sub1_Sub1_4.method6438() << 3;
							Static434.anInt7697 = Static232.aClass6_Sub1_Sub1_4.method6468() << 3;
							for (@Pc(1213) Class6_Sub22 local1213 = (Class6_Sub22) Static165.aClass74_15.method1889(); local1213 != null; local1213 = (Class6_Sub22) Static165.aClass74_15.method1881()) {
								local73 = (int) (local1213.aLong229 & 0x3FFFL);
								local217 = (int) (local1213.aLong229 >> 14 & 0x3FFFL);
								local221 = (int) (local1213.aLong229 >> 28 & 0x3L);
								if (local221 == Static242.anInt4488 && Static40.anInt1172 <= local73 && Static40.anInt1172 + 8 > local73 && local217 >= Static434.anInt7697 && local217 < Static434.anInt7697 + 8) {
									local1213.method6525();
									Static336.method4889(local73, local217, Static242.anInt4488);
								}
							}
							for (@Pc(1284) Class6_Sub23 local1284 = (Class6_Sub23) Static428.aClass244_45.method5976(); local1284 != null; local1284 = (Class6_Sub23) Static428.aClass244_45.method5964()) {
								if (Static40.anInt1172 <= local1284.anInt4218 && Static40.anInt1172 + 8 > local1284.anInt4218 && Static434.anInt7697 <= local1284.anInt4215 && local1284.anInt4215 < Static434.anInt7697 + 8 && local1284.anInt4211 == Static242.anInt4488) {
									local1284.anInt4208 = 0;
								}
							}
							Static73.aClass123_88 = null;
							return true;
						} else {
							@Pc(1339) String local1339;
							if (Static73.aClass123_88 == Static420.aClass123_391) {
								local1339 = Static232.aClass6_Sub1_Sub1_4.method6473();
								local73 = Static232.aClass6_Sub1_Sub1_4.method6488();
								local217 = Static232.aClass6_Sub1_Sub1_4.method6431();
								local221 = Static232.aClass6_Sub1_Sub1_4.method6447();
								if (local221 == 65535) {
									local221 = -1;
								}
								if (local217 >= 1 && local217 <= 8) {
									if (local1339.equalsIgnoreCase("null")) {
										local1339 = null;
									}
									Static438.aStringArray51[local217 - 1] = local1339;
									Static237.anIntArray310[local217 - 1] = local221;
									Static42.aBooleanArray3[local217 - 1] = local73 == 0;
								}
								Static73.aClass123_88 = null;
								return true;
							} else if (Static73.aClass123_88 == Static446.aClass123_423) {
								local209 = Static232.aClass6_Sub1_Sub1_4.method6485();
								if (Static409.method6045(local209)) {
									Static43.method976();
								}
								Static73.aClass123_88 = null;
								return true;
							} else if (Static148.aClass123_152 == Static73.aClass123_88) {
								Static443.method6411(Static334.anInt5833, Static232.aClass6_Sub1_Sub1_4);
								Static73.aClass123_88 = null;
								return true;
							} else {
								@Pc(1447) String local1447;
								if (Static157.aClass123_158 == Static73.aClass123_88) {
									local469 = Static232.aClass6_Sub1_Sub1_4.method6433() == 1;
									local1447 = Static232.aClass6_Sub1_Sub1_4.method6473();
									local1029 = local1447;
									if (local469) {
										local1029 = Static232.aClass6_Sub1_Sub1_4.method6473();
									}
									local221 = Static232.aClass6_Sub1_Sub1_4.method6433();
									@Pc(1461) boolean local1461 = false;
									if (local221 <= 1) {
										if (Static18.aBoolean26 && !Static225.aBoolean270 || Static421.aBoolean475) {
											local1461 = true;
										} else if (local221 <= 1 && Static38.method944(local1029)) {
											local1461 = true;
										}
									}
									if (!local1461 && Static214.anInt3921 == 0) {
										local1047 = Static195.method5951(Static131.method2329(Static232.aClass6_Sub1_Sub1_4));
										if (local221 == 2) {
											Static143.method2456(local1047, null, 24, "<img=1>" + local1029, -1, "<img=1>" + local1447, 0);
										} else if (local221 == 1) {
											Static143.method2456(local1047, null, 24, "<img=0>" + local1029, -1, "<img=0>" + local1447, 0);
										} else {
											Static143.method2456(local1047, null, 24, local1029, -1, local1447, 0);
										}
									}
									Static73.aClass123_88 = null;
									return true;
								} else if (Static73.aClass123_88 == Static316.aClass123_290) {
									Static63.method1343();
									Static73.aClass123_88 = null;
									return false;
								} else if (Static73.aClass123_88 == Static356.aClass123_331) {
									local209 = Static232.aClass6_Sub1_Sub1_4.method6455();
									local73 = Static232.aClass6_Sub1_Sub1_4.method6491();
									Static393.aClass207_1.method4643(local209, local73);
									Static73.aClass123_88 = null;
									return true;
								} else {
									@Pc(1644) int local1644;
									if (Static105.aClass123_115 == Static73.aClass123_88) {
										local209 = Static232.aClass6_Sub1_Sub1_4.method6455();
										if (local209 == 65535) {
											local209 = -1;
										}
										local73 = Static232.aClass6_Sub1_Sub1_4.method6478();
										local217 = local73 >> 28 & 0x3;
										local221 = local73 >> 14 & 0x3FFF;
										local225 = local73 & 0x3FFF;
										local268 = Static232.aClass6_Sub1_Sub1_4.method6431();
										local1057 = local268 >> 2;
										local1644 = local268 & 0x3;
										local221 -= Static2.anInt6396;
										local225 -= Static348.anInt6273;
										local608 = Static414.anIntArray487[local1057];
										Static108.method1916(local221, local1057, local209, local608, local225, local1644, local217);
										Static73.aClass123_88 = null;
										return true;
									}
									@Pc(1742) Class6_Sub8 local1742;
									@Pc(1720) long local1720;
									@Pc(1726) Class6_Sub8 local1726;
									if (Static388.aClass123_357 == Static73.aClass123_88) {
										local209 = Static232.aClass6_Sub1_Sub1_4.method6469();
										local73 = Static232.aClass6_Sub1_Sub1_4.method6478();
										local217 = Static232.aClass6_Sub1_Sub1_4.method6455();
										if (local217 == 65535) {
											local217 = -1;
										}
										local221 = Static232.aClass6_Sub1_Sub1_4.method6447();
										if (local221 == 65535) {
											local221 = -1;
										}
										local225 = Static232.aClass6_Sub1_Sub1_4.method6485();
										if (Static409.method6045(local225)) {
											for (local268 = local217; local268 <= local221; local268++) {
												local1720 = (long) local268 + ((long) local209 << 32);
												local1726 = (Class6_Sub8) Static172.aClass74_18.method1883(local1720);
												if (local1726 != null) {
													local1742 = new Class6_Sub8(local73, local1726.anInt1488);
													local1726.method6525();
												} else if (local268 == -1) {
													local1742 = new Class6_Sub8(local73, Static121.method2092(local209).aClass6_Sub8_2.anInt1488);
												} else {
													local1742 = new Class6_Sub8(local73, -1);
												}
												Static172.aClass74_18.method1890(local1720, local1742);
											}
										}
										Static73.aClass123_88 = null;
										return true;
									}
									@Pc(1809) long local1809;
									@Pc(1819) long local1819;
									@Pc(1814) long local1814;
									if (Static73.aClass123_88 == Static120.aClass123_164) {
										local469 = Static232.aClass6_Sub1_Sub1_4.method6433() == 1;
										local1447 = Static232.aClass6_Sub1_Sub1_4.method6473();
										local1029 = local1447;
										if (local469) {
											local1029 = Static232.aClass6_Sub1_Sub1_4.method6473();
										}
										local1809 = Static232.aClass6_Sub1_Sub1_4.method6467();
										local1814 = Static232.aClass6_Sub1_Sub1_4.method6485();
										local1819 = Static232.aClass6_Sub1_Sub1_4.method6435();
										local615 = Static232.aClass6_Sub1_Sub1_4.method6433();
										@Pc(1829) long local1829 = (local1814 << 32) + local1819;
										@Pc(1831) boolean local1831 = false;
										@Pc(1833) int local1833 = 0;
										while (true) {
											if (local1833 >= 100) {
												if (local615 <= 1) {
													if (Static18.aBoolean26 && !Static225.aBoolean270 || Static421.aBoolean475) {
														local1831 = true;
													} else if (Static38.method944(local1029)) {
														local1831 = true;
													}
												}
												break;
											}
											if (Static47.aLongArray3[local1833] == local1829) {
												local1831 = true;
												break;
											}
											local1833++;
										}
										if (!local1831 && Static214.anInt3921 == 0) {
											Static47.aLongArray3[Static422.anInt7557] = local1829;
											Static422.anInt7557 = (Static422.anInt7557 + 1) % 100;
											@Pc(1890) String local1890 = Static195.method5951(Static131.method2329(Static232.aClass6_Sub1_Sub1_4));
											if (local615 == 2 || local615 == 3) {
												Static143.method2456(local1890, Static52.method1204(local1809), 9, "<img=1>" + local1029, -1, "<img=1>" + local1447, 0);
											} else if (local615 == 1) {
												Static143.method2456(local1890, Static52.method1204(local1809), 9, "<img=0>" + local1029, -1, "<img=0>" + local1447, 0);
											} else {
												Static143.method2456(local1890, Static52.method1204(local1809), 9, local1029, -1, local1447, 0);
											}
										}
										Static73.aClass123_88 = null;
										return true;
									} else if (Static73.aClass123_88 == Static372.aClass123_342) {
										Static381.anInt6821 = Static232.aClass6_Sub1_Sub1_4.method6485() * 30;
										Static24.anInt781 = Static144.anInt2943;
										Static73.aClass123_88 = null;
										return true;
									} else if (Static73.aClass123_88 == Static430.aClass123_402) {
										Static232.aClass6_Sub1_Sub1_4.anInt7898 += 28;
										if (Static232.aClass6_Sub1_Sub1_4.method6430()) {
											Static215.method3237(Static232.aClass6_Sub1_Sub1_4.anInt7898 - 28, Static232.aClass6_Sub1_Sub1_4);
										}
										Static73.aClass123_88 = null;
										return true;
									} else if (Static73.aClass123_88 == Static45.aClass123_422) {
										Static406.method6002(Static84.aClass238_9);
										Static73.aClass123_88 = null;
										return true;
									} else {
										@Pc(2074) int local2074;
										if (Static73.aClass123_88 == Static190.aClass123_38) {
											local469 = Static232.aClass6_Sub1_Sub1_4.method6433() == 1;
											local1447 = Static232.aClass6_Sub1_Sub1_4.method6473();
											local1029 = local1447;
											if (local469) {
												local1029 = Static232.aClass6_Sub1_Sub1_4.method6473();
											}
											local1809 = Static232.aClass6_Sub1_Sub1_4.method6485();
											local1814 = Static232.aClass6_Sub1_Sub1_4.method6435();
											local1644 = Static232.aClass6_Sub1_Sub1_4.method6433();
											@Pc(2070) long local2070 = (local1809 << 32) + local1814;
											@Pc(2072) boolean local2072 = false;
											local2074 = 0;
											while (true) {
												if (local2074 >= 100) {
													if (local1644 <= 1) {
														if (Static18.aBoolean26 && !Static225.aBoolean270 || Static421.aBoolean475) {
															local2072 = true;
														} else if (Static38.method944(local1029)) {
															local2072 = true;
														}
													}
													break;
												}
												if (Static47.aLongArray3[local2074] == local2070) {
													local2072 = true;
													break;
												}
												local2074++;
											}
											if (!local2072 && Static214.anInt3921 == 0) {
												Static47.aLongArray3[Static422.anInt7557] = local2070;
												Static422.anInt7557 = (Static422.anInt7557 + 1) % 100;
												@Pc(2140) String local2140 = Static195.method5951(Static131.method2329(Static232.aClass6_Sub1_Sub1_4));
												if (local1644 == 2) {
													Static143.method2456(local2140, null, 7, "<img=1>" + local1029, -1, "<img=1>" + local1447, 0);
												} else if (local1644 == 1) {
													Static143.method2456(local2140, null, 7, "<img=0>" + local1029, -1, "<img=0>" + local1447, 0);
												} else {
													Static143.method2456(local2140, null, 3, local1029, -1, local1447, 0);
												}
											}
											Static73.aClass123_88 = null;
											return true;
										} else if (Static49.aClass123_64 == Static73.aClass123_88) {
											Static406.method6002(Static421.aClass238_32);
											Static73.aClass123_88 = null;
											return true;
										} else {
											@Pc(2308) boolean local2308;
											@Pc(2472) int local2472;
											@Pc(2390) int local2390;
											@Pc(2260) boolean local2260;
											if (Static73.aClass123_88 == Static219.aClass123_202) {
												local209 = Static232.aClass6_Sub1_Sub1_4.method6455();
												local73 = Static232.aClass6_Sub1_Sub1_4.method6433();
												local217 = Static232.aClass6_Sub1_Sub1_4.method6485();
												local221 = Static232.aClass6_Sub1_Sub1_4.method6491();
												local225 = Static232.aClass6_Sub1_Sub1_4.method6455();
												local2260 = (local73 & 0x80) != 0;
												if (local221 >> 30 == 0) {
													@Pc(2334) Class58 local2334;
													@Pc(2387) Class131 local2387;
													@Pc(2339) Class58 local2339;
													@Pc(2354) Class131 local2354;
													@Pc(2360) Class131 local2360;
													if (local221 >> 29 != 0) {
														local1057 = local221 & 0xFFFF;
														@Pc(2604) Class3_Sub2_Sub1_Sub1 local2604 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local1057];
														if (local2604 != null) {
															if (local225 == 65535) {
																local225 = -1;
															}
															local2308 = true;
															local615 = local2260 ? local2604.anInt6603 : local2604.anInt6609;
															if (local225 != -1 && local615 != -1) {
																if (local615 == local225) {
																	local2334 = Static141.aClass141_2.method3177(local225);
																	if (local2334.aBoolean141 && local2334.anInt2019 != -1) {
																		local2387 = Static5.aClass217_1.method5234(local2334.anInt2019);
																		local2390 = local2387.anInt3702;
																		if (local2390 == 0 || local2390 == 2) {
																			local2308 = false;
																		} else if (local2390 == 1) {
																			local2308 = true;
																		}
																	}
																} else {
																	local2334 = Static141.aClass141_2.method3177(local225);
																	local2339 = Static141.aClass141_2.method3177(local615);
																	if (local2334.anInt2019 != -1 && local2339.anInt2019 != -1) {
																		local2354 = Static5.aClass217_1.method5234(local2334.anInt2019);
																		local2360 = Static5.aClass217_1.method5234(local2339.anInt2019);
																		if (local2354.anInt3701 < local2360.anInt3701) {
																			local2308 = false;
																		}
																	}
																}
															}
															if (local2308) {
																if (local2260) {
																	local2604.anInt6603 = local225;
																	local2604.anInt6550 = 0;
																	local2604.anInt6547 = local73 & 0x7;
																	local2604.anInt6579 = Static66.anInt1741 + local209;
																	local2604.anInt6606 = local217;
																	local2604.anInt6567 = 1;
																	local2604.anInt6565 = 0;
																	if (local2604.anInt6579 > Static66.anInt1741) {
																		local2604.anInt6550 = -1;
																	}
																	if (local2604.anInt6603 != -1 && local2604.anInt6579 == Static66.anInt1741) {
																		local2472 = Static141.aClass141_2.method3177(local2604.anInt6603).anInt2019;
																		if (local2472 != -1) {
																			local2387 = Static5.aClass217_1.method5234(local2472);
																			if (local2387 != null && local2387.anIntArray235 != null) {
																				Static160.method2664(0, local2604.anInt7202, false, local2387, local2604.anInt7207, local2604.aByte103);
																			}
																		}
																	}
																} else {
																	local2604.anInt6609 = local225;
																	local2604.anInt6538 = 0;
																	local2604.anInt6541 = 0;
																	local2604.anInt6544 = local73 & 0x7;
																	local2604.anInt6545 = local209 + Static66.anInt1741;
																	local2604.anInt6543 = local217;
																	local2604.anInt6599 = 1;
																	if (local2604.anInt6545 > Static66.anInt1741) {
																		local2604.anInt6538 = -1;
																	}
																	if (local2604.anInt6609 != -1 && local2604.anInt6545 == Static66.anInt1741) {
																		local2472 = Static141.aClass141_2.method3177(local2604.anInt6609).anInt2019;
																		if (local2472 != -1) {
																			local2387 = Static5.aClass217_1.method5234(local2472);
																			if (local2387 != null && local2387.anIntArray235 != null) {
																				Static160.method2664(0, local2604.anInt7202, false, local2387, local2604.anInt7207, local2604.aByte103);
																			}
																		}
																	}
																}
															}
														}
													} else if (local221 >> 28 != 0) {
														local1057 = local221 & 0xFFFF;
														@Pc(2291) Class3_Sub2_Sub1_Sub2 local2291;
														if (local1057 == Static4.anInt7923) {
															local2291 = Static302.aClass3_Sub2_Sub1_Sub2_2;
														} else {
															local2291 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local1057];
														}
														if (local2291 != null) {
															if (local225 == 65535) {
																local225 = -1;
															}
															local2308 = true;
															local615 = local2260 ? local2291.anInt6603 : local2291.anInt6609;
															if (local225 != -1 && local615 != -1) {
																if (local225 == local615) {
																	local2334 = Static141.aClass141_2.method3177(local225);
																	if (local2334.aBoolean141 && local2334.anInt2019 != -1) {
																		local2387 = Static5.aClass217_1.method5234(local2334.anInt2019);
																		local2390 = local2387.anInt3702;
																		if (local2390 == 0 || local2390 == 2) {
																			local2308 = false;
																		} else if (local2390 == 1) {
																			local2308 = true;
																		}
																	}
																} else {
																	local2334 = Static141.aClass141_2.method3177(local225);
																	local2339 = Static141.aClass141_2.method3177(local615);
																	if (local2334.anInt2019 != -1 && local2339.anInt2019 != -1) {
																		local2354 = Static5.aClass217_1.method5234(local2334.anInt2019);
																		local2360 = Static5.aClass217_1.method5234(local2339.anInt2019);
																		if (local2354.anInt3701 < local2360.anInt3701) {
																			local2308 = false;
																		}
																	}
																}
															}
															if (local2308) {
																if (local2260) {
																	local2291.anInt6606 = local217;
																	local2291.anInt6567 = 1;
																	local2291.anInt6565 = 0;
																	local2291.anInt6550 = 0;
																	local2291.anInt6579 = Static66.anInt1741 + local209;
																	local2291.anInt6547 = local73 & 0x7;
																	local2291.anInt6603 = local225;
																	if (local2291.anInt6579 > Static66.anInt1741) {
																		local2291.anInt6550 = -1;
																	}
																	if (local2291.anInt6603 == 65535) {
																		local2291.anInt6603 = -1;
																	}
																	if (local2291.anInt6603 != -1 && Static66.anInt1741 == local2291.anInt6579) {
																		local2472 = Static141.aClass141_2.method3177(local2291.anInt6603).anInt2019;
																		if (local2472 != -1) {
																			local2387 = Static5.aClass217_1.method5234(local2472);
																			if (local2387 != null && local2387.anIntArray235 != null) {
																				Static160.method2664(0, local2291.anInt7202, local2291 == Static302.aClass3_Sub2_Sub1_Sub2_2, local2387, local2291.anInt7207, local2291.aByte103);
																			}
																		}
																	}
																} else {
																	local2291.anInt6544 = local73 & 0x7;
																	local2291.anInt6538 = 0;
																	local2291.anInt6609 = local225;
																	local2291.anInt6543 = local217;
																	local2291.anInt6545 = local209 + Static66.anInt1741;
																	local2291.anInt6599 = 1;
																	local2291.anInt6541 = 0;
																	if (local2291.anInt6545 > Static66.anInt1741) {
																		local2291.anInt6538 = -1;
																	}
																	if (local2291.anInt6609 == 65535) {
																		local2291.anInt6609 = -1;
																	}
																	if (local2291.anInt6609 != -1 && local2291.anInt6545 == Static66.anInt1741) {
																		local2472 = Static141.aClass141_2.method3177(local2291.anInt6609).anInt2019;
																		if (local2472 != -1) {
																			local2387 = Static5.aClass217_1.method5234(local2472);
																			if (local2387 != null && local2387.anIntArray235 != null) {
																				Static160.method2664(0, local2291.anInt7202, local2291 == Static302.aClass3_Sub2_Sub1_Sub2_2, local2387, local2291.anInt7207, local2291.aByte103);
																			}
																		}
																	}
																}
															}
														}
													}
												} else {
													local1057 = local221 >> 28 & 0x3;
													local1644 = (local221 >> 14 & 0x3FFF) - Static2.anInt6396;
													local608 = (local221 & 0x3FFF) - Static348.anInt6273;
													if (local1644 >= 0 && local608 >= 0 && Static181.anInt3574 > local1644 && Static117.anInt2450 > local608) {
														local615 = local1644 * 128 + 64;
														local2472 = local608 * 128 + 64;
														local2074 = local1057;
														if (local1057 < 3 && Static313.method4558(local608, local1644)) {
															local2074 = local1057 + 1;
														}
														@Pc(2966) Class3_Sub2_Sub6 local2966 = new Class3_Sub2_Sub6(local225, 0, Static66.anInt1741, local1057, local2074, local615, Static221.method3331(local1057, local2472, local615) - local217, local2472, local1644, local1644, local608, local608, local73);
														Static446.aClass244_47.method5966(new Class6_Sub2_Sub13(local2966));
													}
												}
												Static73.aClass123_88 = null;
												return true;
											} else if (Static73.aClass123_88 == Static301.aClass123_281) {
												Static185.aClass195_1 = Static114.method4752(Static232.aClass6_Sub1_Sub1_4.method6433());
												Static73.aClass123_88 = null;
												return true;
											} else if (Static73.aClass123_88 == Static404.aClass123_373) {
												local209 = Static232.aClass6_Sub1_Sub1_4.method6485();
												local73 = Static232.aClass6_Sub1_Sub1_4.method6491();
												local217 = Static232.aClass6_Sub1_Sub1_4.method6477();
												if (Static409.method6045(local217)) {
													Static373.method5589(local73, local209);
												}
												Static73.aClass123_88 = null;
												return true;
											} else if (Static73.aClass123_88 == Static71.aClass123_87) {
												Static121.method2094();
												Static73.aClass123_88 = null;
												return false;
											} else if (Static73.aClass123_88 == Static447.aClass123_382) {
												local209 = Static232.aClass6_Sub1_Sub1_4.method6485();
												if (Static409.method6045(local209)) {
													Static194.method3066();
												}
												Static73.aClass123_88 = null;
												return true;
											} else if (Static349.aClass123_325 == Static73.aClass123_88) {
												Static406.method6002(Static172.aClass238_16);
												Static73.aClass123_88 = null;
												return true;
											} else if (Static227.aClass123_214 == Static73.aClass123_88) {
												local209 = Static232.aClass6_Sub1_Sub1_4.method6469();
												local73 = Static232.aClass6_Sub1_Sub1_4.method6485();
												local217 = Static232.aClass6_Sub1_Sub1_4.method6431();
												local221 = Static232.aClass6_Sub1_Sub1_4.method6447();
												if (Static409.method6045(local73)) {
													local356 = (Class6_Sub9) Static432.aClass74_33.method1883((long) local209);
													if (local356 != null) {
														Static37.method917(local221 != local356.anInt1505, false, local356);
													}
													Static133.method5721(false, local221, local217, local209);
												}
												Static73.aClass123_88 = null;
												return true;
											} else if (Static73.aClass123_88 == Static352.aClass123_326) {
												local209 = Static232.aClass6_Sub1_Sub1_4.method6447();
												local73 = Static232.aClass6_Sub1_Sub1_4.method6485();
												local217 = Static232.aClass6_Sub1_Sub1_4.method6469();
												if (Static409.method6045(local73)) {
													Static251.method5355(local209, local217);
												}
												Static73.aClass123_88 = null;
												return true;
											} else if (Static369.aClass123_227 == Static73.aClass123_88) {
												local209 = Static232.aClass6_Sub1_Sub1_4.method6442();
												local1447 = Static232.aClass6_Sub1_Sub1_4.method6473();
												local217 = Static232.aClass6_Sub1_Sub1_4.method6455();
												if (Static409.method6045(local217)) {
													Static207.method3180(local209, local1447);
												}
												Static73.aClass123_88 = null;
												return true;
											} else if (Static73.aClass123_88 == Static50.aClass123_67) {
												Static427.anInt7603 = Static232.aClass6_Sub1_Sub1_4.method6433();
												Static164.anInt3290 = Static232.aClass6_Sub1_Sub1_4.method6472();
												Static73.aClass123_88 = null;
												return true;
											} else if (Static349.aClass123_324 == Static73.aClass123_88) {
												local209 = Static232.aClass6_Sub1_Sub1_4.method6485();
												local73 = Static232.aClass6_Sub1_Sub1_4.method6469();
												if (Static409.method6045(local209)) {
													Static444.method6492(0, 5, local73, Static4.anInt7923);
												}
												Static73.aClass123_88 = null;
												return true;
											} else if (Static73.aClass123_88 == Static368.aClass123_312) {
												local209 = Static232.aClass6_Sub1_Sub1_4.method6455();
												local73 = Static232.aClass6_Sub1_Sub1_4.method6485();
												local217 = Static232.aClass6_Sub1_Sub1_4.method6485();
												local221 = Static232.aClass6_Sub1_Sub1_4.method6491();
												if (Static409.method6045(local73)) {
													Static381.method5680(local217 + (local209 << 16), local221);
												}
												Static73.aClass123_88 = null;
												return true;
											} else if (Static336.aClass123_313 == Static73.aClass123_88) {
												local209 = Static232.aClass6_Sub1_Sub1_4.method6433();
												local73 = Static232.aClass6_Sub1_Sub1_4.method6431();
												if (local73 == 255) {
													local73 = -1;
													local209 = -1;
												}
												Static402.method5956(local209, local73);
												Static73.aClass123_88 = null;
												return true;
											} else if (Static73.aClass123_88 == Static110.aClass123_359) {
												local469 = Static232.aClass6_Sub1_Sub1_4.method6433() == 1;
												local1447 = Static232.aClass6_Sub1_Sub1_4.method6473();
												local1029 = local1447;
												if (local469) {
													local1029 = Static232.aClass6_Sub1_Sub1_4.method6473();
												}
												local1809 = Static232.aClass6_Sub1_Sub1_4.method6467();
												local1814 = Static232.aClass6_Sub1_Sub1_4.method6485();
												local1819 = Static232.aClass6_Sub1_Sub1_4.method6435();
												local615 = Static232.aClass6_Sub1_Sub1_4.method6433();
												local2472 = Static232.aClass6_Sub1_Sub1_4.method6485();
												@Pc(3328) long local3328 = local1819 + (local1814 << 32);
												@Pc(3330) boolean local3330 = false;
												@Pc(3332) int local3332 = 0;
												while (true) {
													if (local3332 >= 100) {
														if (local615 <= 1 && Static38.method944(local1029)) {
															local3330 = true;
														}
														break;
													}
													if (local3328 == Static47.aLongArray3[local3332]) {
														local3330 = true;
														break;
													}
													local3332++;
												}
												if (!local3330 && Static214.anInt3921 == 0) {
													Static47.aLongArray3[Static422.anInt7557] = local3328;
													Static422.anInt7557 = (Static422.anInt7557 + 1) % 100;
													@Pc(3390) String local3390 = Static426.aClass149_2.method3356(local2472).method4356(Static232.aClass6_Sub1_Sub1_4);
													if (local615 == 2) {
														Static143.method2456(local3390, Static52.method1204(local1809), 20, "<img=1>" + local1029, local2472, "<img=1>" + local1447, 0);
													} else if (local615 == 1) {
														Static143.method2456(local3390, Static52.method1204(local1809), 20, "<img=0>" + local1029, local2472, "<img=0>" + local1447, 0);
													} else {
														Static143.method2456(local3390, Static52.method1204(local1809), 20, local1029, local2472, local1447, 0);
													}
												}
												Static73.aClass123_88 = null;
												return true;
											} else if (Static73.aClass123_88 == Static201.aClass123_250) {
												Static406.method6002(Static3.aClass238_1);
												Static73.aClass123_88 = null;
												return true;
											} else if (Static73.aClass123_88 == Static100.aClass123_113) {
												Static368.method4869(Static45.aClass209_127, Static334.anInt5833, Static232.aClass6_Sub1_Sub1_4);
												Static73.aClass123_88 = null;
												return true;
											} else if (Static167.aClass123_374 == Static73.aClass123_88) {
												local209 = Static232.aClass6_Sub1_Sub1_4.method6477();
												@Pc(3502) byte local3502 = Static232.aClass6_Sub1_Sub1_4.method6486();
												Static393.aClass207_1.method4643(local209, local3502);
												Static73.aClass123_88 = null;
												return true;
											} else if (Static73.aClass123_88 == Static63.aClass123_82) {
												local209 = Static232.aClass6_Sub1_Sub1_4.method6433();
												local73 = Static232.aClass6_Sub1_Sub1_4.method6442();
												local217 = Static232.aClass6_Sub1_Sub1_4.method6472();
												Static70.anIntArray107[local209] = local73;
												Static256.anIntArray320[local209] = local217;
												Static292.anIntArray349[local209] = 1;
												local221 = Static445.anIntArray549[local209] - 1;
												for (local225 = 0; local225 < local221; local225++) {
													if (Class120_Sub1.anIntArray398[local225] <= local73) {
														Static292.anIntArray349[local209] = local225 + 2;
													}
												}
												Static30.anIntArray52[Static127.anInt2704++ & 0x1F] = local209;
												Static73.aClass123_88 = null;
												return true;
											} else if (Static187.aClass123_184 == Static73.aClass123_88) {
												Static242.anInt4488 = Static232.aClass6_Sub1_Sub1_4.method6433();
												Static40.anInt1172 = Static232.aClass6_Sub1_Sub1_4.method6441() << 3;
												Static434.anInt7697 = Static232.aClass6_Sub1_Sub1_4.method6441() << 3;
												Static73.aClass123_88 = null;
												return true;
											} else if (Static409.aClass123_377 == Static73.aClass123_88) {
												Static406.method6002(Static265.aClass238_20);
												Static73.aClass123_88 = null;
												return true;
											} else if (Static232.aClass123_219 == Static73.aClass123_88) {
												local209 = Static232.aClass6_Sub1_Sub1_4.method6442();
												Static245.aClass122_5 = Static45.aClass209_127.method4680(local209);
												Static73.aClass123_88 = null;
												return true;
											} else if (Static205.aClass123_194 == Static73.aClass123_88) {
												local1339 = Static232.aClass6_Sub1_Sub1_4.method6473();
												local73 = Static232.aClass6_Sub1_Sub1_4.method6485();
												local1029 = Static426.aClass149_2.method3356(local73).method4356(Static232.aClass6_Sub1_Sub1_4);
												Static143.method2456(local1029, null, 19, local1339, local73, local1339, 0);
												Static73.aClass123_88 = null;
												return true;
											} else if (Static73.aClass123_88 == Static251.aClass123_339) {
												local209 = Static232.aClass6_Sub1_Sub1_4.method6433();
												local73 = Static232.aClass6_Sub1_Sub1_4.method6477();
												local217 = Static232.aClass6_Sub1_Sub1_4.method6477();
												if (Static409.method6045(local73)) {
													if (local209 == 2) {
														Static257.method3945();
													}
													Static36.anInt1129 = local217;
													Static85.method1589(local217);
													Static26.method687(false);
													Static166.method2750(Static36.anInt1129);
													for (local221 = 0; local221 < 100; local221++) {
														Static180.aBooleanArray8[local221] = true;
													}
												}
												Static73.aClass123_88 = null;
												return true;
											} else if (Static73.aClass123_88 == Static126.aClass123_137) {
												local1339 = Static232.aClass6_Sub1_Sub1_4.method6473();
												local73 = Static232.aClass6_Sub1_Sub1_4.method6485();
												local217 = Static232.aClass6_Sub1_Sub1_4.method6477();
												if (Static409.method6045(local217)) {
													Static440.method6360(local73, local1339);
												}
												Static73.aClass123_88 = null;
												return true;
											} else if (Static45.aClass123_421 == Static73.aClass123_88) {
												Static406.method6002(Static447.aClass238_30);
												Static73.aClass123_88 = null;
												return true;
											} else if (Static73.aClass123_88 == Static146.aClass123_148) {
												Static406.method6002(Static16.aClass238_4);
												Static73.aClass123_88 = null;
												return true;
											} else if (Static73.aClass123_88 == Static237.aClass123_228) {
												local209 = Static232.aClass6_Sub1_Sub1_4.method6485();
												local73 = Static232.aClass6_Sub1_Sub1_4.method6485();
												local217 = Static232.aClass6_Sub1_Sub1_4.method6485();
												local221 = Static232.aClass6_Sub1_Sub1_4.method6485();
												if (Static409.method6045(local209) && Static35.aClass239ArrayArray1[local73] != null) {
													for (local225 = local217; local225 < local221; local225++) {
														local268 = Static232.aClass6_Sub1_Sub1_4.method6435();
														if (Static35.aClass239ArrayArray1[local73].length > local225 && Static35.aClass239ArrayArray1[local73][local225] != null) {
															Static35.aClass239ArrayArray1[local73][local225].anInt6913 = local268;
														}
													}
												}
												Static73.aClass123_88 = null;
												return true;
											} else if (Static73.aClass123_88 == Static332.aClass123_305) {
												local209 = Static232.aClass6_Sub1_Sub1_4.method6485();
												if (local209 == 65535) {
													local209 = -1;
												}
												local73 = Static232.aClass6_Sub1_Sub1_4.method6433();
												local217 = Static232.aClass6_Sub1_Sub1_4.method6485();
												local221 = Static232.aClass6_Sub1_Sub1_4.method6433();
												Static235.method3639(local221, local73, local217, local209);
												Static73.aClass123_88 = null;
												return true;
											} else if (Static150.aClass123_157 == Static73.aClass123_88) {
												Static406.method6002(Static116.aClass238_11);
												Static73.aClass123_88 = null;
												return true;
											} else {
												@Pc(3946) String local3946;
												if (Static73.aClass123_88 == Static63.aClass123_81) {
													local469 = Static232.aClass6_Sub1_Sub1_4.method6433() == 1;
													local1447 = Static232.aClass6_Sub1_Sub1_4.method6473();
													local1029 = local1447;
													if (local469) {
														local1029 = Static232.aClass6_Sub1_Sub1_4.method6473();
													}
													local221 = Static232.aClass6_Sub1_Sub1_4.method6433();
													local225 = Static232.aClass6_Sub1_Sub1_4.method6485();
													local2260 = false;
													if (local221 <= 1 && Static38.method944(local1029)) {
														local2260 = true;
													}
													if (!local2260 && Static214.anInt3921 == 0) {
														local3946 = Static426.aClass149_2.method3356(local225).method4356(Static232.aClass6_Sub1_Sub1_4);
														if (local221 == 2) {
															Static143.method2456(local3946, null, 25, "<img=1>" + local1029, local225, "<img=1>" + local1447, 0);
														} else if (local221 == 1) {
															Static143.method2456(local3946, null, 25, "<img=0>" + local1029, local225, "<img=0>" + local1447, 0);
														} else {
															Static143.method2456(local3946, null, 25, local1029, local225, local1447, 0);
														}
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static379.aClass123_351 == Static73.aClass123_88) {
													Static428.anInt7608 = Static232.aClass6_Sub1_Sub1_4.method6428();
													Static24.anInt781 = Static144.anInt2943;
													Static73.aClass123_88 = null;
													return true;
												} else if (Static73.aClass123_88 == Static310.aClass123_289) {
													Static406.method6002(Static401.aClass238_29);
													Static73.aClass123_88 = null;
													return true;
												} else if (Static73.aClass123_88 == Static436.aClass123_408) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6447();
													local73 = Static232.aClass6_Sub1_Sub1_4.method6469();
													local217 = Static232.aClass6_Sub1_Sub1_4.method6485();
													if (Static409.method6045(local217)) {
														Static392.method4241(local209, local73);
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static186.aClass123_182 == Static73.aClass123_88) {
													Static214.aString30 = Static334.anInt5833 > 2 ? Static232.aClass6_Sub1_Sub1_4.method6473() : Static384.aClass267_91.method6581(Static161.anInt3239);
													Static297.anInt5269 = Static334.anInt5833 > 0 ? Static232.aClass6_Sub1_Sub1_4.method6485() : -1;
													Static73.aClass123_88 = null;
													if (Static297.anInt5269 == 65535) {
														Static297.anInt5269 = -1;
													}
													return true;
												} else if (Static73.aClass123_88 == Static62.aClass123_80) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6447();
													if (local209 == 65535) {
														local209 = -1;
													}
													local73 = Static232.aClass6_Sub1_Sub1_4.method6442();
													local217 = Static232.aClass6_Sub1_Sub1_4.method6477();
													if (local217 == 65535) {
														local217 = -1;
													}
													local221 = Static232.aClass6_Sub1_Sub1_4.method6455();
													local225 = Static232.aClass6_Sub1_Sub1_4.method6447();
													if (Static409.method6045(local221)) {
														for (local268 = local217; local268 <= local209; local268++) {
															local1720 = (long) local268 + ((long) local73 << 32);
															local1726 = (Class6_Sub8) Static172.aClass74_18.method1883(local1720);
															if (local1726 != null) {
																local1742 = new Class6_Sub8(local1726.anInt1492, local225);
																local1726.method6525();
															} else if (local268 == -1) {
																local1742 = new Class6_Sub8(Static121.method2092(local73).aClass6_Sub8_2.anInt1492, local225);
															} else {
																local1742 = new Class6_Sub8(0, local225);
															}
															Static172.aClass74_18.method1890(local1720, local1742);
														}
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static69.aClass123_86 == Static73.aClass123_88) {
													local1339 = Static232.aClass6_Sub1_Sub1_4.method6473();
													local1447 = Static195.method5951(Static131.method2329(Static232.aClass6_Sub1_Sub1_4));
													Static247.method3826(local1447, 0, local1339, 6, local1339);
													Static73.aClass123_88 = null;
													return true;
												} else if (Static73.aClass123_88 == Static417.aClass123_383) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6442();
													local73 = Static232.aClass6_Sub1_Sub1_4.method6447();
													local217 = Static232.aClass6_Sub1_Sub1_4.method6447();
													local221 = Static232.aClass6_Sub1_Sub1_4.method6477();
													local225 = Static232.aClass6_Sub1_Sub1_4.method6455();
													if (Static409.method6045(local73)) {
														Static444.method6492(local221, 7, local209, local217 << 16 | local225);
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static73.aClass123_88 == Static348.aClass123_323) {
													local469 = Static232.aClass6_Sub1_Sub1_4.method6433() == 1;
													local1447 = Static232.aClass6_Sub1_Sub1_4.method6473();
													local1029 = local1447;
													if (local469) {
														local1029 = Static232.aClass6_Sub1_Sub1_4.method6473();
													}
													local1809 = Static232.aClass6_Sub1_Sub1_4.method6485();
													local1814 = Static232.aClass6_Sub1_Sub1_4.method6435();
													local1644 = Static232.aClass6_Sub1_Sub1_4.method6433();
													local608 = Static232.aClass6_Sub1_Sub1_4.method6485();
													@Pc(4332) long local4332 = local1814 + (local1809 << 32);
													@Pc(4334) boolean local4334 = false;
													local2390 = 0;
													while (true) {
														if (local2390 >= 100) {
															if (local1644 <= 1 && Static38.method944(local1029)) {
																local4334 = true;
															}
															break;
														}
														if (Static47.aLongArray3[local2390] == local4332) {
															local4334 = true;
															break;
														}
														local2390++;
													}
													if (!local4334 && Static214.anInt3921 == 0) {
														Static47.aLongArray3[Static422.anInt7557] = local4332;
														Static422.anInt7557 = (Static422.anInt7557 + 1) % 100;
														@Pc(4393) String local4393 = Static426.aClass149_2.method3356(local608).method4356(Static232.aClass6_Sub1_Sub1_4);
														if (local1644 == 2) {
															Static143.method2456(local4393, null, 18, "<img=1>" + local1029, local608, "<img=1>" + local1447, 0);
														} else if (local1644 == 1) {
															Static143.method2456(local4393, null, 18, "<img=0>" + local1029, local608, "<img=0>" + local1447, 0);
														} else {
															Static143.method2456(local4393, null, 18, local1029, local608, local1447, 0);
														}
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static73.aClass123_88 == Static393.aClass123_363) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6485();
													local1447 = Static232.aClass6_Sub1_Sub1_4.method6473();
													@Pc(4477) Object[] local4477 = new Object[local1447.length() + 1];
													for (local221 = local1447.length() - 1; local221 >= 0; local221--) {
														if (local1447.charAt(local221) == 's') {
															local4477[local221 + 1] = Static232.aClass6_Sub1_Sub1_4.method6473();
														} else {
															local4477[local221 + 1] = Integer.valueOf(Static232.aClass6_Sub1_Sub1_4.method6442());
														}
													}
													local4477[0] = Integer.valueOf(Static232.aClass6_Sub1_Sub1_4.method6442());
													if (Static409.method6045(local209)) {
														@Pc(4535) Class6_Sub42 local4535 = new Class6_Sub42();
														local4535.anObjectArray36 = local4477;
														Static166.method2744(local4535);
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static375.aClass123_347 == Static73.aClass123_88) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6485();
													local73 = Static232.aClass6_Sub1_Sub1_4.method6433();
													local217 = Static232.aClass6_Sub1_Sub1_4.method6433();
													local221 = Static232.aClass6_Sub1_Sub1_4.method6433();
													local225 = Static232.aClass6_Sub1_Sub1_4.method6433();
													local268 = Static232.aClass6_Sub1_Sub1_4.method6485();
													if (Static409.method6045(local209)) {
														Static412.aBooleanArray26[local73] = true;
														Static383.anIntArray469[local73] = local217;
														Static29.anIntArray48[local73] = local221;
														Static21.anIntArray26[local73] = local225;
														Static194.anIntArray237[local73] = local268;
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static276.aClass123_260 == Static73.aClass123_88) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6485();
													if (local209 == 65535) {
														local209 = -1;
													}
													local73 = Static232.aClass6_Sub1_Sub1_4.method6442();
													local217 = Static232.aClass6_Sub1_Sub1_4.method6447();
													if (Static409.method6045(local217)) {
														Static444.method6492(-1, 2, local73, local209);
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static73.aClass123_88 == Static295.aClass123_292) {
													Static406.method6002(Static425.aClass238_25);
													Static73.aClass123_88 = null;
													return true;
												} else if (Static73.aClass123_88 == Static6.aClass123_5) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6485();
													local73 = Static232.aClass6_Sub1_Sub1_4.method6433();
													local955 = (local73 & 0x1) == 1;
													while (Static232.aClass6_Sub1_Sub1_4.anInt7898 < Static334.anInt5833) {
														local221 = Static232.aClass6_Sub1_Sub1_4.method6445();
														local225 = Static232.aClass6_Sub1_Sub1_4.method6485();
														local268 = 0;
														if (local225 != 0) {
															local268 = Static232.aClass6_Sub1_Sub1_4.method6433();
															if (local268 == 255) {
																local268 = Static232.aClass6_Sub1_Sub1_4.method6442();
															}
														}
														Static22.method648(local225 - 1, local268, local221, local955, local209);
													}
													Static235.anIntArray306[Static338.anInt5882++ & 0x1F] = local209;
													Static73.aClass123_88 = null;
													return true;
												} else if (Static284.aClass123_268 == Static73.aClass123_88) {
													Static91.method1637(true);
													Static73.aClass123_88 = null;
													return true;
												} else if (Static262.aClass123_134 == Static73.aClass123_88) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6485();
													local73 = Static232.aClass6_Sub1_Sub1_4.method6485();
													local217 = Static232.aClass6_Sub1_Sub1_4.method6455();
													if (Static409.method6045(local73)) {
														Static179.method2950(local217, local209);
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static65.aClass123_114 == Static73.aClass123_88) {
													if (Static36.anInt1129 != -1) {
														Static101.method1824(0, Static36.anInt1129);
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static118.aClass123_129 == Static73.aClass123_88) {
													Static48.anInt1247 = Static232.aClass6_Sub1_Sub1_4.method6433();
													Static73.aClass123_88 = null;
													Static24.anInt781 = Static144.anInt2943;
													return true;
												} else if (Static12.aClass123_21 == Static73.aClass123_88) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6485();
													local73 = Static232.aClass6_Sub1_Sub1_4.method6433();
													local955 = (local73 & 0x1) == 1;
													Static417.method6116(local209, local955);
													local221 = Static232.aClass6_Sub1_Sub1_4.method6485();
													for (local225 = 0; local225 < local221; local225++) {
														local268 = Static232.aClass6_Sub1_Sub1_4.method6477();
														local1057 = Static232.aClass6_Sub1_Sub1_4.method6488();
														if (local1057 == 255) {
															local1057 = Static232.aClass6_Sub1_Sub1_4.method6478();
														}
														Static22.method648(local268 - 1, local1057, local225, local955, local209);
													}
													Static235.anIntArray306[Static338.anInt5882++ & 0x1F] = local209;
													Static73.aClass123_88 = null;
													return true;
												} else if (Static73.aClass123_88 == Static386.aClass123_356) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6477();
													local73 = Static232.aClass6_Sub1_Sub1_4.method6442();
													local217 = Static232.aClass6_Sub1_Sub1_4.method6431();
													if (Static409.method6045(local209)) {
														Static173.method2865(local217, local73);
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static73.aClass123_88 == Static19.aClass123_30) {
													Static283.method6587(Static232.aClass6_Sub1_Sub1_4.method6473());
													Static73.aClass123_88 = null;
													return true;
												} else if (Static310.aClass123_288 == Static73.aClass123_88) {
													Static434.anInt7697 = Static232.aClass6_Sub1_Sub1_4.method6441() << 3;
													Static242.anInt4488 = Static232.aClass6_Sub1_Sub1_4.method6472();
													Static40.anInt1172 = Static232.aClass6_Sub1_Sub1_4.method6438() << 3;
													while (Static334.anInt5833 > Static232.aClass6_Sub1_Sub1_4.anInt7898) {
														@Pc(4943) Class238 local4943 = Static51.method1175()[Static232.aClass6_Sub1_Sub1_4.method6433()];
														Static406.method6002(local4943);
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static148.aClass123_151 == Static73.aClass123_88) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6485();
													local73 = Static232.aClass6_Sub1_Sub1_4.method6442();
													if (Static409.method6045(local209)) {
														@Pc(4982) Class6_Sub9 local4982 = (Class6_Sub9) Static432.aClass74_33.method1883((long) local73);
														if (local4982 != null) {
															Static37.method917(true, false, local4982);
														}
														if (Static100.aClass239_4 != null) {
															Static437.method6328(Static100.aClass239_4);
															Static100.aClass239_4 = null;
														}
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static76.aClass123_415 == Static73.aClass123_88) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6491();
													local73 = Static232.aClass6_Sub1_Sub1_4.method6447();
													local217 = Static232.aClass6_Sub1_Sub1_4.method6491();
													local221 = Static232.aClass6_Sub1_Sub1_4.method6485();
													if (local221 == 65535) {
														local221 = -1;
													}
													if (Static409.method6045(local73)) {
														Static266.method1445(local217, local209, local221);
														@Pc(5042) Class4 local5042 = Static380.aClass231_2.method5648(local221);
														Static114.method4753(local5042.anInt87, local5042.anInt82, local217, local5042.anInt116);
														Static49.method1094(local217, local5042.anInt76, local5042.anInt117, local5042.anInt104);
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static87.aClass123_104 == Static73.aClass123_88) {
													local1339 = Static232.aClass6_Sub1_Sub1_4.method6473();
													local955 = Static232.aClass6_Sub1_Sub1_4.method6433() == 1;
													if (local955) {
														local1447 = Static232.aClass6_Sub1_Sub1_4.method6473();
													} else {
														local1447 = local1339;
													}
													local221 = Static232.aClass6_Sub1_Sub1_4.method6485();
													@Pc(5100) byte local5100 = Static232.aClass6_Sub1_Sub1_4.method6438();
													local2260 = false;
													if (local5100 == -128) {
														local2260 = true;
													}
													if (local2260) {
														if (Static338.anInt5890 == 0) {
															Static73.aClass123_88 = null;
															return true;
														}
														for (local1057 = 0; local1057 < Static338.anInt5890 && (!Static57.aClass128Array1[local1057].aString25.equals(local1447) || Static57.aClass128Array1[local1057].anInt3638 != local221); local1057++) {
														}
														if (local1057 < Static338.anInt5890) {
															while (local1057 < Static338.anInt5890 - 1) {
																Static57.aClass128Array1[local1057] = Static57.aClass128Array1[local1057 + 1];
																local1057++;
															}
															Static338.anInt5890--;
															Static57.aClass128Array1[Static338.anInt5890] = null;
														}
													} else {
														local3946 = Static232.aClass6_Sub1_Sub1_4.method6473();
														local636 = new Class128();
														local636.aString27 = local1339;
														local636.aString25 = local1447;
														local636.aString24 = Static442.method6404(local636.aString25);
														local636.anInt3638 = local221;
														local636.aByte58 = local5100;
														local636.aString26 = local3946;
														for (local608 = Static338.anInt5890 - 1; local608 >= 0; local608--) {
															local615 = Static57.aClass128Array1[local608].aString24.compareTo(local636.aString24);
															if (local615 == 0) {
																Static57.aClass128Array1[local608].anInt3638 = local221;
																Static57.aClass128Array1[local608].aByte58 = local5100;
																Static57.aClass128Array1[local608].aString26 = local3946;
																if (local1447.equals(Static302.aClass3_Sub2_Sub1_Sub2_2.aString54)) {
																	Static359.aByte83 = local5100;
																}
																Static32.anInt6596 = Static144.anInt2943;
																Static73.aClass123_88 = null;
																return true;
															}
															if (local615 < 0) {
																break;
															}
														}
														if (Static57.aClass128Array1.length <= Static338.anInt5890) {
															Static73.aClass123_88 = null;
															return true;
														}
														for (local615 = Static338.anInt5890 - 1; local615 > local608; local615--) {
															Static57.aClass128Array1[local615 + 1] = Static57.aClass128Array1[local615];
														}
														if (Static338.anInt5890 == 0) {
															Static57.aClass128Array1 = new Class128[100];
														}
														Static57.aClass128Array1[local608 + 1] = local636;
														Static338.anInt5890++;
														if (local1447.equals(Static302.aClass3_Sub2_Sub1_Sub2_2.aString54)) {
															Static359.aByte83 = local5100;
														}
													}
													Static32.anInt6596 = Static144.anInt2943;
													Static73.aClass123_88 = null;
													return true;
												} else if (Static73.aClass123_88 == Static290.aClass123_273) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6445();
													local73 = Static232.aClass6_Sub1_Sub1_4.method6442();
													local217 = Static232.aClass6_Sub1_Sub1_4.method6433();
													local1033 = "";
													local1043 = local1033;
													if ((local217 & 0x1) != 0) {
														local1033 = Static232.aClass6_Sub1_Sub1_4.method6473();
														if ((local217 & 0x2) == 0) {
															local1043 = local1033;
														} else {
															local1043 = Static232.aClass6_Sub1_Sub1_4.method6473();
														}
													}
													local1047 = Static232.aClass6_Sub1_Sub1_4.method6473();
													if (local209 == 99) {
														Static36.method908(local1047);
													} else if (local1043.equals("") || !Static38.method944(local1043)) {
														Static247.method3826(local1047, local73, local1043, local209, local1033);
													} else {
														Static73.aClass123_88 = null;
														return true;
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static73.aClass123_88 == Static107.aClass123_116) {
													Static420.anInt7505 = Static232.aClass6_Sub1_Sub1_4.method6433();
													Static73.aClass123_88 = null;
													return true;
												} else if (Static446.aClass123_424 == Static73.aClass123_88) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6455();
													local73 = Static232.aClass6_Sub1_Sub1_4.method6469();
													local217 = Static232.aClass6_Sub1_Sub1_4.method6469();
													local221 = Static232.aClass6_Sub1_Sub1_4.method6485();
													if (Static409.method6045(local209)) {
														Static444.method6492(local217, 5, local73, local221);
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static43.aClass123_54 == Static73.aClass123_88) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6428();
													local73 = Static232.aClass6_Sub1_Sub1_4.method6447();
													local217 = Static232.aClass6_Sub1_Sub1_4.method6469();
													if (Static409.method6045(local73)) {
														Static42.method966(local217, local209);
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static73.aClass123_88 == Static256.aClass123_246) {
													Static406.method6002(Static388.aClass238_28);
													Static73.aClass123_88 = null;
													return true;
												} else if (Static73.aClass123_88 == Static279.aClass123_265) {
													Static406.method6002(Static91.aClass238_10);
													Static73.aClass123_88 = null;
													return true;
												} else if (Static73.aClass123_88 == Static359.aClass123_336) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6491();
													local73 = Static232.aClass6_Sub1_Sub1_4.method6485();
													if (local73 == 65535) {
														local73 = -1;
													}
													local217 = Static232.aClass6_Sub1_Sub1_4.method6455();
													if (Static409.method6045(local217)) {
														Static444.method6492(-1, 1, local209, local73);
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static73.aClass123_88 == Static129.aClass123_140) {
													Static91.method1637(false);
													Static73.aClass123_88 = null;
													return true;
												} else if (Static388.aClass123_358 == Static73.aClass123_88) {
													Static393.aClass207_1.method4641();
													Static73.aClass123_88 = null;
													Static383.anInt6834 += 32;
													return true;
												} else if (Static73.aClass123_88 == Static95.aClass123_112) {
													if (Static264.aFrame2 != null) {
														Static21.method609(Static291.aClass28_Sub1_1.anInt1023, -1, -1, false);
													}
													@Pc(5576) byte[] local5576 = new byte[Static334.anInt5833];
													Static232.aClass6_Sub1_Sub1_4.method3794(local5576, Static334.anInt5833);
													local1447 = Static55.method1238(Static334.anInt5833, 0, local5576);
													Static84.method1576(Static45.aClass209_127, Static294.anInt5208 == 1, true, local1447);
													Static73.aClass123_88 = null;
													return true;
												} else if (Static243.aClass123_236 == Static73.aClass123_88) {
													Static226.anInt5623 = 1;
													Static73.aClass123_88 = null;
													Static185.anInt3634 = Static144.anInt2943;
													return true;
												} else if (Static422.aClass123_394 == Static73.aClass123_88) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6477();
													local73 = Static232.aClass6_Sub1_Sub1_4.method6477();
													local217 = Static232.aClass6_Sub1_Sub1_4.method6469();
													if (Static409.method6045(local73)) {
														Static361.method5344(local209, local217);
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static22.aClass123_41 == Static73.aClass123_88) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6433();
													if (Static232.aClass6_Sub1_Sub1_4.method6433() == 0) {
														Static1.aClass13Array1[local209] = new Class13();
													} else {
														Static232.aClass6_Sub1_Sub1_4.anInt7898--;
														Static1.aClass13Array1[local209] = new Class13(Static232.aClass6_Sub1_Sub1_4);
													}
													Static73.aClass123_88 = null;
													Static326.anInt5609 = Static144.anInt2943;
													return true;
												} else if (Static73.aClass123_88 == Static375.aClass123_346) {
													for (local209 = 0; local209 < Static374.aClass3_Sub2_Sub1_Sub2Array1.length; local209++) {
														if (Static374.aClass3_Sub2_Sub1_Sub2Array1[local209] != null) {
															Static374.aClass3_Sub2_Sub1_Sub2Array1[local209].lb = -1;
														}
													}
													for (local73 = 0; local73 < Static308.aClass3_Sub2_Sub1_Sub1Array1.length; local73++) {
														if (Static308.aClass3_Sub2_Sub1_Sub1Array1[local73] != null) {
															Static308.aClass3_Sub2_Sub1_Sub1Array1[local73].lb = -1;
														}
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static257.aClass123_247 == Static73.aClass123_88) {
													@Pc(5744) byte local5744 = Static232.aClass6_Sub1_Sub1_4.method6441();
													local73 = Static232.aClass6_Sub1_Sub1_4.method6447();
													local217 = Static232.aClass6_Sub1_Sub1_4.method6447();
													if (Static409.method6045(local217)) {
														Static373.method5589(local5744, local73);
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static73.aClass123_88 == Static111.aClass123_122) {
													Static125.anInt2592 = Static232.aClass6_Sub1_Sub1_4.method6433();
													for (local209 = 0; local209 < Static125.anInt2592; local209++) {
														Static186.aStringArray25[local209] = Static232.aClass6_Sub1_Sub1_4.method6473();
														Static22.aStringArray3[local209] = Static232.aClass6_Sub1_Sub1_4.method6473();
														if (Static22.aStringArray3[local209].equals("")) {
															Static22.aStringArray3[local209] = Static186.aStringArray25[local209];
														}
														Static85.aStringArray9[local209] = Static232.aClass6_Sub1_Sub1_4.method6473();
														Static147.aStringArray14[local209] = Static232.aClass6_Sub1_Sub1_4.method6473();
														if (Static147.aStringArray14[local209].equals("")) {
															Static147.aStringArray14[local209] = Static85.aStringArray9[local209];
														}
														Static286.aBooleanArray19[local209] = false;
													}
													Static73.aClass123_88 = null;
													Static185.anInt3634 = Static144.anInt2943;
													return true;
												} else if (Static241.aClass123_412 == Static73.aClass123_88) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6447();
													local73 = Static232.aClass6_Sub1_Sub1_4.method6488();
													if (Static409.method6045(local209)) {
														Static421.anInt7523 = local73;
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static73.aClass123_88 == Static183.aClass123_245) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6477();
													local73 = Static232.aClass6_Sub1_Sub1_4.method6469();
													local217 = Static232.aClass6_Sub1_Sub1_4.method6477();
													if (local217 == 65535) {
														local217 = -1;
													}
													if (Static409.method6045(local209)) {
														Static81.method1550(local217, local73);
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static73.aClass123_88 == Static18.aClass123_29) {
													while (Static334.anInt5833 > Static232.aClass6_Sub1_Sub1_4.anInt7898) {
														local469 = Static232.aClass6_Sub1_Sub1_4.method6433() == 1;
														local1447 = Static232.aClass6_Sub1_Sub1_4.method6473();
														local1029 = Static232.aClass6_Sub1_Sub1_4.method6473();
														local221 = Static232.aClass6_Sub1_Sub1_4.method6485();
														local225 = Static232.aClass6_Sub1_Sub1_4.method6433();
														local1047 = "";
														local612 = false;
														if (local221 > 0) {
															local1047 = Static232.aClass6_Sub1_Sub1_4.method6473();
															local612 = Static232.aClass6_Sub1_Sub1_4.method6433() == 1;
														}
														for (local1644 = 0; local1644 < Static398.anInt2169; local1644++) {
															if (local469) {
																if (local1029.equals(Static314.aStringArray32[local1644])) {
																	Static314.aStringArray32[local1644] = local1447;
																	local1447 = null;
																	Static185.aStringArray24[local1644] = local1029;
																	break;
																}
															} else if (local1447.equals(Static314.aStringArray32[local1644])) {
																if (Static137.anIntArray174[local1644] != local221) {
																	Static137.anIntArray174[local1644] = local221;
																	if (local221 > 0) {
																		Static247.method3826(local1447 + Static213.aClass267_77.method6581(Static161.anInt3239), 0, "", 5, "");
																	}
																	if (local221 == 0) {
																		Static247.method3826(local1447 + Static14.aClass267_6.method6581(Static161.anInt3239), 0, "", 5, "");
																	}
																}
																Static185.aStringArray24[local1644] = local1029;
																Static88.aStringArray29[local1644] = local1047;
																Static198.anIntArray239[local1644] = local225;
																Static156.aBooleanArray7[local1644] = local612;
																local1447 = null;
																break;
															}
														}
														if (local1447 != null && Static398.anInt2169 < 200) {
															Static314.aStringArray32[Static398.anInt2169] = local1447;
															Static185.aStringArray24[Static398.anInt2169] = local1029;
															Static137.anIntArray174[Static398.anInt2169] = local221;
															Static88.aStringArray29[Static398.anInt2169] = local1047;
															Static198.anIntArray239[Static398.anInt2169] = local225;
															Static156.aBooleanArray7[Static398.anInt2169] = local612;
															Static398.anInt2169++;
														}
													}
													Static185.anInt3634 = Static144.anInt2943;
													Static226.anInt5623 = 2;
													local73 = Static398.anInt2169;
													while (local73 > 0) {
														local469 = true;
														local73--;
														for (local217 = 0; local217 < local73; local217++) {
															if (Static137.anIntArray174[local217] != Static118.anInt2485 && Static118.anInt2485 == Static137.anIntArray174[local217 + 1] || Static137.anIntArray174[local217] == 0 && Static137.anIntArray174[local217 + 1] != 0) {
																local221 = Static137.anIntArray174[local217];
																Static137.anIntArray174[local217] = Static137.anIntArray174[local217 + 1];
																Static137.anIntArray174[local217 + 1] = local221;
																local1043 = Static88.aStringArray29[local217];
																Static88.aStringArray29[local217] = Static88.aStringArray29[local217 + 1];
																Static88.aStringArray29[local217 + 1] = local1043;
																local1047 = Static314.aStringArray32[local217];
																Static314.aStringArray32[local217] = Static314.aStringArray32[local217 + 1];
																Static314.aStringArray32[local217 + 1] = local1047;
																local3946 = Static185.aStringArray24[local217];
																Static185.aStringArray24[local217] = Static185.aStringArray24[local217 + 1];
																Static185.aStringArray24[local217 + 1] = local3946;
																local1644 = Static198.anIntArray239[local217];
																Static198.anIntArray239[local217] = Static198.anIntArray239[local217 + 1];
																Static198.anIntArray239[local217 + 1] = local1644;
																local2308 = Static156.aBooleanArray7[local217];
																Static156.aBooleanArray7[local217] = Static156.aBooleanArray7[local217 + 1];
																Static156.aBooleanArray7[local217 + 1] = local2308;
																local469 = false;
															}
														}
														if (local469) {
															break;
														}
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static73.aClass123_88 == Static177.aClass123_381) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6472();
													local73 = Static232.aClass6_Sub1_Sub1_4.method6485();
													if (local73 == 65535) {
														local73 = -1;
													}
													local217 = Static232.aClass6_Sub1_Sub1_4.method6488();
													Static416.method6103(local209, local217, local73);
													Static73.aClass123_88 = null;
													return true;
												} else if (Static445.aClass123_420 == Static73.aClass123_88) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6485();
													if (local209 == 65535) {
														local209 = -1;
													}
													local73 = Static232.aClass6_Sub1_Sub1_4.method6472();
													local217 = Static232.aClass6_Sub1_Sub1_4.method6459();
													Static39.method945(local209, local73, local217);
													Static73.aClass123_88 = null;
													return true;
												} else if (Static73.aClass123_88 == Static270.aClass123_257) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6477();
													local73 = Static232.aClass6_Sub1_Sub1_4.method6447();
													local1029 = Static232.aClass6_Sub1_Sub1_4.method6473();
													if (Static409.method6045(local73)) {
														Static440.method6360(local209, local1029);
													}
													Static73.aClass123_88 = null;
													return true;
												} else if (Static73.aClass123_88 == Static8.aClass123_15) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6442();
													local73 = Static232.aClass6_Sub1_Sub1_4.method6447();
													Static393.aClass207_1.method4640(local73, local209);
													Static73.aClass123_88 = null;
													return true;
												} else if (Static173.aClass123_173 == Static73.aClass123_88) {
													local209 = Static232.aClass6_Sub1_Sub1_4.method6485();
													local73 = Static232.aClass6_Sub1_Sub1_4.method6488();
													Static393.aClass207_1.method4640(local209, local73);
													Static73.aClass123_88 = null;
													return true;
												} else if (Static435.aClass123_404 == Static73.aClass123_88) {
													Static406.method6002(Static68.aClass238_31);
													Static73.aClass123_88 = null;
													return true;
												} else if (Static73.aClass123_88 == Static165.aClass123_160) {
													Static63.method1342();
													Static73.aClass123_88 = null;
													return false;
												} else {
													Static390.method5741(null, "T1 - " + (Static73.aClass123_88 == null ? -1 : Static73.aClass123_88.method2952()) + "," + (Static210.aClass123_197 == null ? -1 : Static210.aClass123_197.method2952()) + "," + (Static25.aClass123_44 == null ? -1 : Static25.aClass123_44.method2952()) + " - " + Static334.anInt5833);
													Static63.method1342();
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

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(FBFF)I")
	public static int method2125(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(20) float local20 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(29) float local29 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(38) float local38 = arg2 < 0.0F ? -arg2 : arg2;
		if (local29 > local20 && local38 < local29) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local38 > local20 && local29 < local38) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
