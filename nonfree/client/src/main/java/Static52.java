import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "Lclient!re;")
	public static Class56_Sub1 aClass56_Sub1_15;

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "[Lclient!k;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array4;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "[I")
	public static int[] anIntArray159 = new int[32];

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Lclient!pe;")
	private static Class65 aClass65_551 = Static119.method1462("shake:");

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "Lclient!pe;")
	public static Class65 aClass65_550 = aClass65_551;

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "Lclient!wa;")
	public static Class2_Sub22 aClass2_Sub22_6 = null;

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "Lclient!pe;")
	public static Class65 aClass65_552 = aClass65_551;

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
	public static int anInt1253 = 0;

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "Lclient!pe;")
	public static Class65 aClass65_553 = Static119.method1462("swe");

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method877(@OriginalArg(1) int arg0) {
		@Pc(24) byte[] local24;
		if (arg0 == 100 && Static77.anInt1725 > 0) {
			local24 = Static42.aByteArrayArray3[--Static77.anInt1725];
			Static42.aByteArrayArray3[Static77.anInt1725] = null;
			return local24;
		} else if (arg0 == 5000 && Static105.anInt2362 > 0) {
			local24 = Static126.aByteArrayArray9[--Static105.anInt2362];
			Static126.aByteArrayArray9[Static105.anInt2362] = null;
			return local24;
		} else if (arg0 == 30000 && Static70.anInt1629 > 0) {
			local24 = Static117.aByteArrayArray8[--Static70.anInt1629];
			Static117.aByteArrayArray8[Static70.anInt1629] = null;
			return local24;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)I")
	public static int method878(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public static void method879() {
		aClass65_552 = null;
		aClass2_Sub22_6 = null;
		aClass2_Sub1_Sub4_Sub2Array4 = null;
		anIntArray159 = null;
		aClass65_551 = null;
		aClass65_550 = null;
		aClass56_Sub1_15 = null;
		aClass65_553 = null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLclient!ta;)V")
	public static void method880(@OriginalArg(1) Class2_Sub18 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0.anInt2503 == 0) {
			local1 = Static124.aClass49_1.method1175(arg0.anInt2496, arg0.anInt2499, arg0.anInt2501);
		}
		if (arg0.anInt2503 == 1) {
			local1 = Static124.aClass49_1.method1152(arg0.anInt2496, arg0.anInt2499, arg0.anInt2501);
		}
		if (arg0.anInt2503 == 2) {
			local1 = Static124.aClass49_1.method1176(arg0.anInt2496, arg0.anInt2499, arg0.anInt2501);
		}
		@Pc(47) int local47 = -1;
		@Pc(49) int local49 = 0;
		if (arg0.anInt2503 == 3) {
			local1 = Static124.aClass49_1.method1170(arg0.anInt2496, arg0.anInt2499, arg0.anInt2501);
		}
		@Pc(66) int local66 = 0;
		if (local1 != 0) {
			local47 = local1 >> 14 & 0x7FFF;
			@Pc(84) int local84 = Static124.aClass49_1.method1159(arg0.anInt2496, arg0.anInt2499, arg0.anInt2501, local1);
			local49 = local84 & 0x1F;
			local66 = local84 >> 6 & 0x3;
		}
		arg0.anInt2494 = local47;
		arg0.anInt2493 = local66;
		arg0.anInt2497 = local49;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BIIII)I")
	public static int method881(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class2_Sub1_Sub4_Sub4.anIntArray248[arg1 * 1024 / arg3] >> 1;
		return (local16 * arg0 >> 16) + (arg2 * (65536 - local16) >> 16);
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public static void method882() {
		try {
			if (Static1.anInt16 == 0) {
				if (Static129.aClass7_6 != null) {
					Static129.aClass7_6.method157();
					Static129.aClass7_6 = null;
				}
				Static12.anInt342 = 0;
				Static1.anInt16 = 1;
				Static78.aClass15_7 = null;
				Static129.aBoolean116 = false;
			}
			if (Static1.anInt16 == 1) {
				if (Static78.aClass15_7 == null) {
					Static78.aClass15_7 = Static28.aClass20_2.method371(Static114.anInt2537, Static43.aString5);
				}
				if (Static78.aClass15_7.anInt404 == 2) {
					throw new IOException();
				}
				if (Static78.aClass15_7.anInt404 == 1) {
					Static129.aClass7_6 = new Class7((Socket) Static78.aClass15_7.anObject9, Static28.aClass20_2);
					Static1.anInt16 = 2;
					Static78.aClass15_7 = null;
				}
			}
			if (Static1.anInt16 == 2) {
				@Pc(71) long local71 = Static110.aLong82 = Static57.aClass65_627.method1493();
				Static49.aClass2_Sub4_Sub1_1.anInt1298 = 0;
				@Pc(81) int local81 = (int) (local71 >> 16 & 0x1FL);
				Static49.aClass2_Sub4_Sub1_1.method926(14);
				Static49.aClass2_Sub4_Sub1_1.method926(local81);
				Static129.aClass7_6.method161(Static49.aClass2_Sub4_Sub1_1.aByteArray20, 2);
				Static66.aClass2_Sub4_Sub1_2.anInt1298 = 0;
				Static1.anInt16 = 3;
			}
			@Pc(122) int local122;
			if (Static1.anInt16 == 3) {
				if (Static40.aClass4_1 != null) {
					Static40.aClass4_1.method862();
				}
				if (Static124.aClass4_2 != null) {
					Static124.aClass4_2.method862();
				}
				local122 = Static129.aClass7_6.method160();
				if (Static40.aClass4_1 != null) {
					Static40.aClass4_1.method862();
				}
				if (Static124.aClass4_2 != null) {
					Static124.aClass4_2.method862();
				}
				if (local122 != 0) {
					Static69.method1229(local122);
					return;
				}
				Static1.anInt16 = 4;
				Static66.aClass2_Sub4_Sub1_2.anInt1298 = 0;
			}
			if (Static1.anInt16 == 4) {
				if (Static66.aClass2_Sub4_Sub1_2.anInt1298 < 8) {
					local122 = Static129.aClass7_6.method155();
					if (8 - Static66.aClass2_Sub4_Sub1_2.anInt1298 < local122) {
						local122 = 8 - Static66.aClass2_Sub4_Sub1_2.anInt1298;
					}
					if (local122 > 0) {
						Static129.aClass7_6.method154(Static66.aClass2_Sub4_Sub1_2.anInt1298, local122, Static66.aClass2_Sub4_Sub1_2.aByteArray20);
						Static66.aClass2_Sub4_Sub1_2.anInt1298 += local122;
					}
				}
				if (Static66.aClass2_Sub4_Sub1_2.anInt1298 == 8) {
					Static66.aClass2_Sub4_Sub1_2.anInt1298 = 0;
					Static14.aLong16 = Static66.aClass2_Sub4_Sub1_2.method907();
					Static1.anInt16 = 5;
				}
			}
			if (Static1.anInt16 == 5) {
				Static49.aClass2_Sub4_Sub1_1.anInt1298 = 0;
				@Pc(218) int[] local218 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static14.aLong16 >> 32), (int) Static14.aLong16 };
				Static49.aClass2_Sub4_Sub1_1.method926(10);
				Static49.aClass2_Sub4_Sub1_1.method914(local218[0]);
				Static49.aClass2_Sub4_Sub1_1.method914(local218[1]);
				Static49.aClass2_Sub4_Sub1_1.method914(local218[2]);
				Static49.aClass2_Sub4_Sub1_1.method914(local218[3]);
				Static49.aClass2_Sub4_Sub1_1.method948(Static57.aClass65_627.method1493());
				Static49.aClass2_Sub4_Sub1_1.method943(Static57.aClass65_634);
				Static49.aClass2_Sub4_Sub1_1.method912(Static99.aBigInteger1, Static124.aBigInteger2);
				Static73.aClass2_Sub4_Sub1_3.anInt1298 = 0;
				if (Static129.anInt2753 == 40) {
					Static73.aClass2_Sub4_Sub1_3.method926(18);
				} else {
					Static73.aClass2_Sub4_Sub1_3.method926(16);
				}
				Static73.aClass2_Sub4_Sub1_3.method926(Static49.aClass2_Sub4_Sub1_1.anInt1298 + 93);
				Static73.aClass2_Sub4_Sub1_3.method914(466);
				Static73.aClass2_Sub4_Sub1_3.method926(Static48.aBoolean47 ? 1 : 0);
				Static77.method1295(Static73.aClass2_Sub4_Sub1_3);
				Static73.aClass2_Sub4_Sub1_3.method914(Static15.aClass56_Sub1_7.anInt2325);
				Static73.aClass2_Sub4_Sub1_3.method914(Static68.aClass56_Sub1_31.anInt2325);
				Static73.aClass2_Sub4_Sub1_3.method914(aClass56_Sub1_15.anInt2325);
				Static73.aClass2_Sub4_Sub1_3.method914(Static90.aClass56_Sub1_21.anInt2325);
				Static73.aClass2_Sub4_Sub1_3.method914(Static16.aClass56_Sub1_25.anInt2325);
				Static73.aClass2_Sub4_Sub1_3.method914(Static95.aClass56_Sub1_22.anInt2325);
				Static73.aClass2_Sub4_Sub1_3.method914(Static88.aClass56_Sub1_19.anInt2325);
				Static73.aClass2_Sub4_Sub1_3.method914(Static57.aClass56_Sub1_16.anInt2325);
				Static73.aClass2_Sub4_Sub1_3.method914(Static16.aClass56_Sub1_24.anInt2325);
				Static73.aClass2_Sub4_Sub1_3.method914(Static41.aClass56_Sub1_14.anInt2325);
				Static73.aClass2_Sub4_Sub1_3.method914(Static17.aClass56_Sub1_8.anInt2325);
				Static73.aClass2_Sub4_Sub1_3.method914(Static83.aClass56_Sub1_17.anInt2325);
				Static73.aClass2_Sub4_Sub1_3.method914(Static35.aClass56_Sub1_11.anInt2325);
				Static73.aClass2_Sub4_Sub1_3.method914(Static86.aClass56_Sub1_18.anInt2325);
				Static73.aClass2_Sub4_Sub1_3.method914(Static105.aClass56_Sub1_26.anInt2325);
				Static73.aClass2_Sub4_Sub1_3.method914(Static115.aClass56_Sub1_29.anInt2325);
				Static73.aClass2_Sub4_Sub1_3.method936(Static49.aClass2_Sub4_Sub1_1.anInt1298, Static49.aClass2_Sub4_Sub1_1.aByteArray20);
				Static129.aClass7_6.method161(Static73.aClass2_Sub4_Sub1_3.aByteArray20, Static73.aClass2_Sub4_Sub1_3.anInt1298);
				Static49.aClass2_Sub4_Sub1_1.method958(local218);
				for (@Pc(439) int local439 = 0; local439 < 4; local439++) {
					local218[local439] += 50;
				}
				Static66.aClass2_Sub4_Sub1_2.method958(local218);
				Static1.anInt16 = 6;
			}
			if (Static1.anInt16 == 6 && Static129.aClass7_6.method155() > 0) {
				local122 = Static129.aClass7_6.method160();
				if (local122 == 21 && Static129.anInt2753 == 20) {
					Static1.anInt16 = 7;
				} else if (local122 == 2) {
					Static1.anInt16 = 9;
				} else if (local122 == 15 && Static129.anInt2753 == 40) {
					Static84.method1364();
					return;
				} else if (local122 == 23 && Static130.anInt2837 < 1) {
					Static130.anInt2837++;
					Static1.anInt16 = 0;
				} else {
					Static69.method1229(local122);
					return;
				}
			}
			if (Static1.anInt16 == 7 && Static129.aClass7_6.method155() > 0) {
				Static67.anInt1593 = Static129.aClass7_6.method160() * 60 + 180;
				Static1.anInt16 = 8;
			}
			if (Static1.anInt16 == 8) {
				Static12.anInt342 = 0;
				Static40.method674(Static61.aClass65_652, Static35.method647(new Class65[] { Static120.method1871(Static67.anInt1593 / 60), Static105.aClass65_990 }), Static57.aClass65_630);
				if (--Static67.anInt1593 <= 0) {
					Static1.anInt16 = 0;
				}
			} else {
				if (Static1.anInt16 == 9 && Static129.aClass7_6.method155() >= 8) {
					Static4.anInt1223 = Static129.aClass7_6.method160();
					Static123.aBoolean106 = Static129.aClass7_6.method160() == 1;
					Static93.anInt2098 = Static129.aClass7_6.method160();
					Static93.anInt2098 <<= 0x8;
					Static93.anInt2098 += Static129.aClass7_6.method160();
					anInt1253 = Static129.aClass7_6.method160();
					Static129.aClass7_6.method154(0, 1, Static66.aClass2_Sub4_Sub1_2.aByteArray20);
					Static66.aClass2_Sub4_Sub1_2.anInt1298 = 0;
					Static15.anInt365 = Static66.aClass2_Sub4_Sub1_2.method951();
					Static129.aClass7_6.method154(0, 2, Static66.aClass2_Sub4_Sub1_2.aByteArray20);
					Static66.aClass2_Sub4_Sub1_2.anInt1298 = 0;
					Static90.anInt1997 = Static66.aClass2_Sub4_Sub1_2.method896();
					Static1.anInt16 = 10;
				}
				if (Static1.anInt16 != 10) {
					Static12.anInt342++;
					if (Static12.anInt342 > 2000) {
						if (Static130.anInt2837 < 1) {
							Static1.anInt16 = 0;
							if (Static114.anInt2537 == Static57.anInt1439) {
								Static114.anInt2537 = Static73.anInt1663;
							} else {
								Static114.anInt2537 = Static57.anInt1439;
							}
							Static130.anInt2837++;
						} else {
							Static69.method1229(-3);
						}
					}
				} else if (Static129.aClass7_6.method155() >= Static90.anInt1997) {
					Static66.aClass2_Sub4_Sub1_2.anInt1298 = 0;
					Static129.aClass7_6.method154(0, Static90.anInt1997, Static66.aClass2_Sub4_Sub1_2.aByteArray20);
					Static73.method1245();
					Static42.anInt1052 = -1;
					Static126.method1928(false);
					Static15.anInt365 = -1;
				}
			}
		} catch (@Pc(730) IOException local730) {
			if (Static130.anInt2837 < 1) {
				Static1.anInt16 = 0;
				Static130.anInt2837++;
				if (Static57.anInt1439 == Static114.anInt2537) {
					Static114.anInt2537 = Static73.anInt1663;
				} else {
					Static114.anInt2537 = Static57.anInt1439;
				}
			} else {
				Static69.method1229(-2);
			}
		}
	}
}
