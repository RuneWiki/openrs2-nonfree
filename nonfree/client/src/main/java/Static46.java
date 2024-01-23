import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!da", name = "b", descriptor = "I")
	public static int anInt1155;

	@OriginalMember(owner = "client!da", name = "h", descriptor = "[Lclient!bn;")
	public static Class2_Sub8_Sub1[] aClass2_Sub8_Sub1Array1;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "Lclient!cf;")
	public static Class26 aClass26_1 = Static54.method983();

	@OriginalMember(owner = "client!da", name = "j", descriptor = "[S")
	public static short[] aShortArray6 = new short[] { 38, 34, 45, 17, 57, 14, 43, 30 };

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V")
	public static void method853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static130.method2394(arg0);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg0 - arg4;
		@Pc(17) int local17 = arg0;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(25) int local25 = -arg0;
		@Pc(28) int local28 = -local15;
		@Pc(51) int local51;
		@Pc(59) int local59;
		@Pc(68) int local68;
		@Pc(77) int local77;
		if (arg3 >= Static148.anInt3245 && Static166.anInt3675 >= arg3) {
			@Pc(43) int[] local43 = Static275.anIntArrayArray37[arg3];
			local51 = Static30.method572(Static53.anInt1319, arg2 - arg0, Static81.anInt1915);
			local59 = Static30.method572(Static53.anInt1319, arg0 + arg2, Static81.anInt1915);
			local68 = Static30.method572(Static53.anInt1319, arg2 - local15, Static81.anInt1915);
			local77 = Static30.method572(Static53.anInt1319, arg2 + local15, Static81.anInt1915);
			Static25.method486(local43, local51, local68, arg5);
			Static25.method486(local43, local68, local77, arg1);
			Static25.method486(local43, local77, local59, arg5);
		}
		@Pc(97) int local97 = -1;
		@Pc(99) int local99 = local15;
		@Pc(101) int local101 = -1;
		while (local17 > local10) {
			local101 += 2;
			local97 += 2;
			local28 += local97;
			if (local28 >= 0 && local99 >= 1) {
				local99--;
				local28 -= local99 << 1;
				Static188.anIntArray567[local99] = local10;
			}
			local10++;
			local25 += local101;
			@Pc(251) int local251;
			@Pc(259) int local259;
			@Pc(271) int[] local271;
			@Pc(152) int local152;
			if (local25 >= 0) {
				local17--;
				local25 -= local17 << 1;
				local152 = arg3 - local17;
				local51 = local17 + arg3;
				if (local51 >= Static148.anInt3245 && local152 <= Static166.anInt3675) {
					if (local17 >= local15) {
						local59 = Static30.method572(Static53.anInt1319, arg2 + local10, Static81.anInt1915);
						local68 = Static30.method572(Static53.anInt1319, arg2 - local10, Static81.anInt1915);
						if (Static166.anInt3675 >= local51) {
							Static25.method486(Static275.anIntArrayArray37[local51], local68, local59, arg5);
						}
						if (local152 >= Static148.anInt3245) {
							Static25.method486(Static275.anIntArrayArray37[local152], local68, local59, arg5);
						}
					} else {
						local59 = Static188.anIntArray567[local17];
						local68 = Static30.method572(Static53.anInt1319, arg2 + local10, Static81.anInt1915);
						local77 = Static30.method572(Static53.anInt1319, arg2 - local10, Static81.anInt1915);
						local251 = Static30.method572(Static53.anInt1319, local59 + arg2, Static81.anInt1915);
						local259 = Static30.method572(Static53.anInt1319, arg2 - local59, Static81.anInt1915);
						if (Static166.anInt3675 >= local51) {
							local271 = Static275.anIntArrayArray37[local51];
							Static25.method486(local271, local77, local259, arg5);
							Static25.method486(local271, local259, local251, arg1);
							Static25.method486(local271, local251, local68, arg5);
						}
						if (local152 >= Static148.anInt3245) {
							local271 = Static275.anIntArrayArray37[local152];
							Static25.method486(local271, local77, local259, arg5);
							Static25.method486(local271, local259, local251, arg1);
							Static25.method486(local271, local251, local68, arg5);
						}
					}
				}
			}
			local152 = arg3 - local10;
			local51 = local10 + arg3;
			if (Static148.anInt3245 <= local51 && local152 <= Static166.anInt3675) {
				local68 = arg2 - local17;
				local59 = local17 + arg2;
				if (local59 >= Static53.anInt1319 && local68 <= Static81.anInt1915) {
					local59 = Static30.method572(Static53.anInt1319, local59, Static81.anInt1915);
					local68 = Static30.method572(Static53.anInt1319, local68, Static81.anInt1915);
					if (local15 <= local10) {
						if (local51 <= Static166.anInt3675) {
							Static25.method486(Static275.anIntArrayArray37[local51], local68, local59, arg5);
						}
						if (Static148.anInt3245 <= local152) {
							Static25.method486(Static275.anIntArrayArray37[local152], local68, local59, arg5);
						}
					} else {
						local77 = local99 >= local10 ? local99 : Static188.anIntArray567[local10];
						local251 = Static30.method572(Static53.anInt1319, local77 + arg2, Static81.anInt1915);
						local259 = Static30.method572(Static53.anInt1319, arg2 - local77, Static81.anInt1915);
						if (Static166.anInt3675 >= local51) {
							local271 = Static275.anIntArrayArray37[local51];
							Static25.method486(local271, local68, local259, arg5);
							Static25.method486(local271, local259, local251, arg1);
							Static25.method486(local271, local251, local59, arg5);
						}
						if (Static148.anInt3245 <= local152) {
							local271 = Static275.anIntArrayArray37[local152];
							Static25.method486(local271, local68, local259, arg5);
							Static25.method486(local271, local259, local251, arg1);
							Static25.method486(local271, local251, local59, arg5);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
	public static void method854() {
		if (Static225.anInt5298 == 0 || Static225.anInt5298 == 5) {
			return;
		}
		try {
			if (++Static44.anInt1141 > 2000) {
				if (Static253.aClass34_3 != null) {
					Static253.aClass34_3.method1077();
					Static253.aClass34_3 = null;
				}
				if (Static279.anInt5494 >= 1) {
					Static225.anInt5298 = 0;
					Static93.anInt2262 = -5;
					return;
				}
				Static225.anInt5298 = 1;
				Static279.anInt5494++;
				Static44.anInt1141 = 0;
				if (Static259.anInt5136 == Static166.anInt3677) {
					Static166.anInt3677 = Static285.anInt5646;
				} else {
					Static166.anInt3677 = Static259.anInt5136;
				}
			}
			if (Static225.anInt5298 == 1) {
				Static146.aClass111_3 = Static164.aClass102_2.method2881(Static166.anInt3677, Static122.aString96);
				Static225.anInt5298 = 2;
			}
			if (Static225.anInt5298 == 2) {
				if (Static146.aClass111_3.anInt3788 == 2) {
					throw new IOException();
				}
				if (Static146.aClass111_3.anInt3788 != 1) {
					return;
				}
				Static253.aClass34_3 = new Class34((Socket) Static146.aClass111_3.anObject4, Static164.aClass102_2);
				Static146.aClass111_3 = null;
				@Pc(116) long local116 = Static64.aLong55 = Static228.method3719(Static242.aString165);
				Static211.aClass2_Sub16_Sub1_2.anInt2789 = 0;
				Static211.aClass2_Sub16_Sub1_2.method2168(14);
				@Pc(130) int local130 = (int) (local116 >> 16 & 0x1FL);
				Static211.aClass2_Sub16_Sub1_2.method2168(local130);
				Static253.aClass34_3.method1076(Static211.aClass2_Sub16_Sub1_2.aByteArray17, 2);
				if (Static48.aClass43_2 != null) {
					Static48.aClass43_2.method2443();
				}
				if (Static22.aClass43_1 != null) {
					Static22.aClass43_1.method2443();
				}
				@Pc(158) int local158 = Static253.aClass34_3.method1070();
				if (Static48.aClass43_2 != null) {
					Static48.aClass43_2.method2443();
				}
				if (Static22.aClass43_1 != null) {
					Static22.aClass43_1.method2443();
				}
				if (local158 != 0) {
					Static225.anInt5298 = 0;
					Static93.anInt2262 = local158;
					Static253.aClass34_3.method1077();
					Static253.aClass34_3 = null;
					return;
				}
				Static225.anInt5298 = 3;
			}
			if (Static225.anInt5298 == 3) {
				if (Static253.aClass34_3.method1073() < 8) {
					return;
				}
				@Pc(201) int[] local201 = new int[4];
				Static253.aClass34_3.method1074(0, 8, Static91.aClass2_Sub16_Sub1_1.aByteArray17);
				Static91.aClass2_Sub16_Sub1_1.anInt2789 = 0;
				Static128.aLong97 = Static91.aClass2_Sub16_Sub1_1.method2132();
				local201[1] = (int) (Math.random() * 9.9999999E7D);
				local201[2] = (int) (Static128.aLong97 >> 32);
				local201[3] = (int) Static128.aLong97;
				Static211.aClass2_Sub16_Sub1_2.anInt2789 = 0;
				local201[0] = (int) (Math.random() * 9.9999999E7D);
				Static211.aClass2_Sub16_Sub1_2.method2168(10);
				Static211.aClass2_Sub16_Sub1_2.method2186(local201[0]);
				Static211.aClass2_Sub16_Sub1_2.method2186(local201[1]);
				Static211.aClass2_Sub16_Sub1_2.method2186(local201[2]);
				Static211.aClass2_Sub16_Sub1_2.method2186(local201[3]);
				Static211.aClass2_Sub16_Sub1_2.method2144(Static228.method3719(Static242.aString165));
				Static211.aClass2_Sub16_Sub1_2.method2153(Static67.aString59);
				Static211.aClass2_Sub16_Sub1_2.method2136(Static119.aBigInteger5, Static210.aBigInteger4);
				Static258.aClass2_Sub16_Sub1_3.anInt2789 = 0;
				if (Static64.anInt1561 == 40) {
					Static258.aClass2_Sub16_Sub1_3.method2168(18);
				} else {
					Static258.aClass2_Sub16_Sub1_3.method2168(16);
				}
				Static258.aClass2_Sub16_Sub1_3.method2143(Static211.aClass2_Sub16_Sub1_2.anInt2789 + Static223.method3684(Static6.aString4) + 163);
				Static258.aClass2_Sub16_Sub1_3.method2186(553);
				Static258.aClass2_Sub16_Sub1_3.method2168(Static303.anInt5848);
				Static258.aClass2_Sub16_Sub1_3.method2168(Static115.aBoolean396 ? 1 : 0);
				Static258.aClass2_Sub16_Sub1_3.method2168(1);
				Static258.aClass2_Sub16_Sub1_3.method2168(Static141.method2503());
				Static258.aClass2_Sub16_Sub1_3.method2143(Static60.anInt1510);
				Static258.aClass2_Sub16_Sub1_3.method2143(Static120.anInt2649);
				Static258.aClass2_Sub16_Sub1_3.method2168(Static214.anInt4370);
				Static40.method740(Static258.aClass2_Sub16_Sub1_3);
				Static258.aClass2_Sub16_Sub1_3.method2153(Static6.aString4);
				Static258.aClass2_Sub16_Sub1_3.method2186(Static21.anInt460);
				Static258.aClass2_Sub16_Sub1_3.method2186(Static108.method1849());
				Static38.aBoolean61 = true;
				Static258.aClass2_Sub16_Sub1_3.method2143(Static281.anInt5563);
				Static258.aClass2_Sub16_Sub1_3.method2186(Static101.aClass42_27.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static281.aClass42_102.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static161.aClass42_47.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static269.aClass42_90.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static185.aClass42_101.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static200.aClass42_61.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static251.aClass42_77.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static290.aClass42_105.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static121.aClass42_32.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static70.aClass42_20.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static274.aClass42_93.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static277.aClass42_96.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static170.aClass42_48.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static256.aClass42_79.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static19.aClass42_6.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static183.aClass42_53.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static189.aClass42_58.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static285.aClass42_103.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static199.aClass42_64.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static153.aClass42_43.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static151.aClass42_41.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static64.aClass42_17.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static312.aClass42_81.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static278.aClass42_98.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static239.aClass42_76.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static39.aClass42_12.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static195.aClass42_107.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static230.aClass42_73.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2186(Static234.aClass42_74.method1258());
				Static258.aClass2_Sub16_Sub1_3.method2178(Static211.aClass2_Sub16_Sub1_2.aByteArray17, Static211.aClass2_Sub16_Sub1_2.anInt2789);
				Static253.aClass34_3.method1076(Static258.aClass2_Sub16_Sub1_3.aByteArray17, Static258.aClass2_Sub16_Sub1_3.anInt2789);
				Static211.aClass2_Sub16_Sub1_2.method2206(local201);
				for (@Pc(572) int local572 = 0; local572 < 4; local572++) {
					local201[local572] += 50;
				}
				Static91.aClass2_Sub16_Sub1_1.method2206(local201);
				Static225.anInt5298 = 4;
			}
			if (Static225.anInt5298 == 4) {
				if (Static253.aClass34_3.method1073() < 1) {
					return;
				}
				@Pc(608) int local608 = Static253.aClass34_3.method1070();
				if (local608 == 21) {
					Static225.anInt5298 = 7;
				} else if (local608 == 29) {
					Static225.anInt5298 = 10;
				} else if (local608 == 1) {
					Static93.anInt2262 = local608;
					Static225.anInt5298 = 5;
					return;
				} else if (local608 == 2) {
					Static225.anInt5298 = 8;
				} else if (local608 == 15) {
					Static225.anInt5298 = 0;
					Static93.anInt2262 = local608;
					return;
				} else if (local608 == 23 && Static279.anInt5494 < 1) {
					Static225.anInt5298 = 1;
					Static44.anInt1141 = 0;
					Static279.anInt5494++;
					Static253.aClass34_3.method1077();
					Static253.aClass34_3 = null;
					return;
				} else {
					Static225.anInt5298 = 0;
					Static93.anInt2262 = local608;
					Static253.aClass34_3.method1077();
					Static253.aClass34_3 = null;
					return;
				}
			}
			if (Static225.anInt5298 == 6) {
				Static211.aClass2_Sub16_Sub1_2.anInt2789 = 0;
				Static211.aClass2_Sub16_Sub1_2.method2198(17);
				Static253.aClass34_3.method1076(Static211.aClass2_Sub16_Sub1_2.aByteArray17, Static211.aClass2_Sub16_Sub1_2.anInt2789);
				Static225.anInt5298 = 4;
				return;
			}
			label297: {
				if (Static225.anInt5298 != 7) {
					if (Static225.anInt5298 == 10) {
						if (Static253.aClass34_3.method1073() >= 1) {
							Static287.anInt5652 = Static253.aClass34_3.method1070();
							Static93.anInt2262 = 29;
							Static225.anInt5298 = 0;
							Static253.aClass34_3.method1077();
							Static253.aClass34_3 = null;
							return;
						}
						return;
					}
					if (Static225.anInt5298 != 8) {
						break label297;
					}
					if (Static253.aClass34_3.method1073() >= 14) {
						Static253.aClass34_3.method1074(0, 14, Static91.aClass2_Sub16_Sub1_1.aByteArray17);
						Static91.aClass2_Sub16_Sub1_1.anInt2789 = 0;
						Static175.anInt3864 = Static91.aClass2_Sub16_Sub1_1.method2146();
						Static189.anInt3994 = Static91.aClass2_Sub16_Sub1_1.method2146();
						Static294.aBoolean381 = Static91.aClass2_Sub16_Sub1_1.method2146() == 1;
						Static11.aBoolean21 = Static91.aClass2_Sub16_Sub1_1.method2146() == 1;
						Static61.aBoolean98 = Static91.aClass2_Sub16_Sub1_1.method2146() == 1;
						Static63.aBoolean103 = Static91.aClass2_Sub16_Sub1_1.method2146() == 1;
						Static71.aBoolean114 = Static91.aClass2_Sub16_Sub1_1.method2146() == 1;
						Static22.anInt504 = Static91.aClass2_Sub16_Sub1_1.method2130();
						Static41.aBoolean67 = Static91.aClass2_Sub16_Sub1_1.method2146() == 1;
						Static108.aBoolean163 = Static91.aClass2_Sub16_Sub1_1.method2146() == 1;
						Static173.method3140(Static108.aBoolean163);
						Static102.method1747(Static108.aBoolean163);
						Static279.method4343(Static108.aBoolean163);
						if (!Static115.aBoolean396) {
							if (Static294.aBoolean381 && !Static61.aBoolean98 || Static41.aBoolean67) {
								try {
									Static322.method2907(Static164.aClass102_2.anApplet1, "zap");
								} catch (@Pc(903) Throwable local903) {
								}
							} else {
								try {
									Static322.method2907(Static164.aClass102_2.anApplet1, "unzap");
								} catch (@Pc(893) Throwable local893) {
								}
							}
						}
						try {
							Static322.method2907(Static164.aClass102_2.anApplet1, "loggedin");
						} catch (@Pc(911) Throwable local911) {
						}
						Static259.anInt5137 = Static91.aClass2_Sub16_Sub1_1.method2200();
						Static218.anInt4451 = Static91.aClass2_Sub16_Sub1_1.method2130();
						Static225.anInt5298 = 9;
						break label297;
					}
					return;
				}
				if (Static253.aClass34_3.method1073() < 1) {
					return;
				}
				Static241.anInt4807 = (Static253.aClass34_3.method1070() + 3) * 60;
				Static93.anInt2262 = 21;
				Static225.anInt5298 = 0;
				Static253.aClass34_3.method1077();
				Static253.aClass34_3 = null;
				return;
			}
			if (Static225.anInt5298 == 9) {
				if (Static253.aClass34_3.method1073() >= Static218.anInt4451) {
					Static91.aClass2_Sub16_Sub1_1.anInt2789 = 0;
					Static253.aClass34_3.method1074(0, Static218.anInt4451, Static91.aClass2_Sub16_Sub1_1.aByteArray17);
					Static93.anInt2262 = 2;
					Static225.anInt5298 = 0;
					Static47.method880();
					Static180.anInt3907 = -1;
					Static284.method4439(false);
					Static259.anInt5137 = -1;
					return;
				}
				return;
			}
		} catch (@Pc(963) IOException local963) {
			if (Static253.aClass34_3 != null) {
				Static253.aClass34_3.method1077();
				Static253.aClass34_3 = null;
			}
			if (Static279.anInt5494 >= 1) {
				Static93.anInt2262 = -4;
				Static225.anInt5298 = 0;
			} else {
				Static279.anInt5494++;
				if (Static259.anInt5136 == Static166.anInt3677) {
					Static166.anInt3677 = Static285.anInt5646;
				} else {
					Static166.anInt3677 = Static259.anInt5136;
				}
				Static225.anInt5298 = 1;
				Static44.anInt1141 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Lclient!po;")
	public static Class140 method855(@OriginalArg(1) int arg0) {
		@Pc(11) Class140 local11 = (Class140) Static296.aClass157_44.method4031((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(26) byte[] local26 = Static103.aClass42_29.method1256(34, arg0);
		local11 = new Class140();
		if (local26 != null) {
			local11.method3674(new Class2_Sub16(local26), arg0);
		}
		Static296.aClass157_44.method4026((long) arg0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([JI[I)V")
	public static void method856(@OriginalArg(0) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static248.method1588(0, arg0, arg0.length - 1, arg1);
	}
}
