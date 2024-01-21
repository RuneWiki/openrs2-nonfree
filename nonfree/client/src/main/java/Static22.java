import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!e", name = "pb", descriptor = "[B")
	public static byte[] aByteArray7;

	@OriginalMember(owner = "client!e", name = "rb", descriptor = "I")
	public static int anInt582;

	@OriginalMember(owner = "client!e", name = "Nb", descriptor = "Lclient!qd;")
	public static Class54_Sub1 aClass54_Sub1_10;

	@OriginalMember(owner = "client!e", name = "ob", descriptor = "Lclient!hb;")
	public static Class27 aClass27_295 = Static87.method1648("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!e", name = "qb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_296 = Static87.method1648("@whi@");

	@OriginalMember(owner = "client!e", name = "wb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_297 = Static87.method1648("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!e", name = "yb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_298 = Static87.method1648("Chat panel redrawn");

	@OriginalMember(owner = "client!e", name = "Bb", descriptor = "Lclient!hb;")
	private static Class27 aClass27_300 = Static87.method1648("glow2:");

	@OriginalMember(owner = "client!e", name = "zb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_299 = aClass27_300;

	@OriginalMember(owner = "client!e", name = "Hb", descriptor = "[I")
	public static int[] anIntArray116 = new int[200];

	@OriginalMember(owner = "client!e", name = "Mb", descriptor = "[I")
	public static int[] anIntArray117 = new int[] { 0, 5, 0, 0, 1, 6, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, -2, 0, 4, 1, -1, 3, 0, 0, 0, 0, 7, 0, 0, 3, 7, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, -2, 2, 5, 0, 0, 0, -2, 4, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 15, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 4, 6, 0, 0, 0, 0, 3, 0, 2, 2, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 6, -2, -1, 2, 0, 0, 1, 4, 0, 6, 0, 0, 0, 0, 3, 0, 0, 2, 0, 0, 6, 0, 0, 0, 0, 0, 8, 0, -2, 0, 0, 0, 0, 2, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 6, 0, 0, 0, 0, 5, 0, 0, 6, -2, 0, 0, -1, 0, 0, 0, 0, 8, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 6, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 1, 2, 0, 0, 0, 6, 0, 0, 0, 14, 0, 8, -2, -1, 1, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, -2, 0, 0, 0, -2, 6, 0, 0, 0, 2 };

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!ob;I)V")
	public static void method445(@OriginalArg(1) Class3_Sub11_Sub1 arg0) {
		while (true) {
			@Pc(13) Class3_Sub6 local13 = (Class3_Sub6) Static2.aClass28_1.method884();
			if (local13 == null) {
				return;
			}
			@Pc(18) boolean local18 = false;
			for (@Pc(20) int local20 = 0; local20 < local13.anInt1277; local20++) {
				if (local13.aClass64Array1[local20] != null) {
					if (local13.aClass64Array1[local20].anInt2678 == 2) {
						local13.anIntArray211[local20] = -5;
					}
					if (local13.aClass64Array1[local20].anInt2678 == 0) {
						local18 = true;
					}
				}
				if (local13.aClass64Array2[local20] != null) {
					if (local13.aClass64Array2[local20].anInt2678 == 2) {
						local13.anIntArray211[local20] = -6;
					}
					if (local13.aClass64Array2[local20].anInt2678 == 0) {
						local18 = true;
					}
				}
			}
			if (local18) {
				return;
			}
			arg0.method1478(239);
			arg0.method1443(0);
			@Pc(98) int local98 = arg0.anInt2060;
			arg0.method1425(local13.anInt1272);
			for (@Pc(105) int local105 = 0; local105 < local13.anInt1277; local105++) {
				if (local13.anIntArray211[local105] == 0) {
					try {
						@Pc(131) int local131 = local13.anIntArray209[local105];
						@Pc(146) Field local146;
						@Pc(176) int local176;
						if (local131 == 0) {
							local146 = (Field) local13.aClass64Array1[local105].anObject6;
							local176 = local146.getInt(null);
							arg0.method1443(0);
							arg0.method1425(local176);
						} else if (local131 == 1) {
							local146 = (Field) local13.aClass64Array1[local105].anObject6;
							local146.setInt(null, local13.anIntArray210[local105]);
							arg0.method1443(0);
						} else if (local131 == 2) {
							local146 = (Field) local13.aClass64Array1[local105].anObject6;
							local176 = local146.getModifiers();
							arg0.method1443(0);
							arg0.method1425(local176);
						}
						@Pc(220) Method local220;
						if (local131 == 3) {
							local220 = (Method) local13.aClass64Array2[local105].anObject6;
							@Pc(247) byte[][] local247 = local13.aByteArrayArrayArray3[local105];
							@Pc(251) Object[] local251 = new Object[local247.length];
							for (@Pc(253) int local253 = 0; local253 < local247.length; local253++) {
								@Pc(265) ObjectInputStream local265 = new ObjectInputStream(new ByteArrayInputStream(local247[local253]));
								local251[local253] = local265.readObject();
							}
							@Pc(280) Object local280 = local220.invoke(null, local251);
							if (local280 == null) {
								arg0.method1443(0);
							} else if (local280 instanceof Number) {
								arg0.method1443(1);
								arg0.method1468(((Number) local280).longValue());
							} else if (local280 instanceof Class27) {
								arg0.method1443(2);
								arg0.method1430((Class27) local280);
							} else {
								arg0.method1443(4);
							}
						} else if (local131 == 4) {
							local220 = (Method) local13.aClass64Array2[local105].anObject6;
							local176 = local220.getModifiers();
							arg0.method1443(0);
							arg0.method1425(local176);
						}
					} catch (@Pc(323) ClassNotFoundException local323) {
						arg0.method1443(-10);
					} catch (@Pc(329) InvalidClassException local329) {
						arg0.method1443(-11);
					} catch (@Pc(335) StreamCorruptedException local335) {
						arg0.method1443(-12);
					} catch (@Pc(341) OptionalDataException local341) {
						arg0.method1443(-13);
					} catch (@Pc(349) IllegalAccessException local349) {
						arg0.method1443(-14);
					} catch (@Pc(355) IllegalArgumentException local355) {
						arg0.method1443(-15);
					} catch (@Pc(363) InvocationTargetException local363) {
						arg0.method1443(-16);
					} catch (@Pc(369) SecurityException local369) {
						arg0.method1443(-17);
					} catch (@Pc(375) IOException local375) {
						arg0.method1443(-18);
					} catch (@Pc(381) NullPointerException local381) {
						arg0.method1443(-19);
					} catch (@Pc(389) Exception local389) {
						arg0.method1443(-20);
					} catch (@Pc(397) Throwable local397) {
						arg0.method1443(-21);
					}
				} else {
					arg0.method1443(local13.anIntArray211[local105]);
				}
			}
			arg0.method1464(local98);
			arg0.method1436(arg0.anInt2060 - local98);
			local13.method1883();
		}
	}

	@OriginalMember(owner = "client!e", name = "j", descriptor = "(I)V")
	public static void method446() {
		Static70.anInt1829 = 0;
		Static18.anInt427 = 0;
		Static43.method900();
		Static38.method717();
		Static64.method1182();
		Static50.method973();
		@Pc(29) int local29;
		for (@Pc(23) int local23 = 0; local23 < Static18.anInt427; local23++) {
			local29 = Static55.anIntArray240[local23];
			if (Static2.anInt38 != Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local29].anInt2382) {
				Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local29] = null;
			}
		}
		if (Static47.aClass3_Sub11_Sub1_1.anInt2060 != Static11.anInt2733) {
			throw new RuntimeException("gpp1 pos:" + Static47.aClass3_Sub11_Sub1_1.anInt2060 + " psize:" + Static11.anInt2733);
		}
		for (local29 = 0; local29 < Static104.anInt2718; local29++) {
			if (Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[Static99.anIntArray387[local29]] == null) {
				throw new RuntimeException("gpp2 pos:" + local29 + " size:" + Static104.anInt2718);
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIILclient!ha;)V")
	public static void method447(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub3_Sub3 arg3) {
		if (Static61.anInt1553 >= 400) {
			return;
		}
		if (arg3.anIntArray166 != null) {
			arg3 = arg3.method720();
		}
		if (arg3 == null || !arg3.aBoolean49) {
			return;
		}
		@Pc(28) Class27 local28 = arg3.aClass27_468;
		if (arg3.anInt933 != 0) {
			local28 = Static98.method1779(new Class27[] { local28, Static42.method898(Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2438, arg3.anInt933), Static109.aClass27_962, Static31.aClass27_389, Static97.method1616(arg3.anInt933), Static71.aClass27_909 });
		}
		if (Static42.anInt1235 == 1) {
			Static46.method925(arg2, 27, arg1, arg0, Static98.method1779(new Class27[] { Static81.aClass27_1046, Static25.aClass27_326, local28 }), Static8.aClass27_115);
		} else if (Static39.anInt964 != 1) {
			@Pc(84) Class27[] local84 = arg3.aClass27Array2;
			if (Static92.aBoolean122) {
				local84 = Static8.method179(local84);
			}
			@Pc(94) int local94;
			if (local84 != null) {
				for (local94 = 4; local94 >= 0; local94--) {
					if (local84[local94] != null && !local84[local94].method763(Static108.aClass27_1345)) {
						@Pc(113) byte local113 = 0;
						if (local94 == 0) {
							local113 = 47;
						}
						if (local94 == 1) {
							local113 = 22;
						}
						if (local94 == 2) {
							local113 = 19;
						}
						if (local94 == 3) {
							local113 = 25;
						}
						if (local94 == 4) {
							local113 = 52;
						}
						Static46.method925(arg2, local113, arg1, arg0, Static98.method1779(new Class27[] { Static85.aClass27_1086, local28 }), local84[local94]);
					}
				}
			}
			if (local84 != null) {
				for (local94 = 4; local94 >= 0; local94--) {
					if (local84[local94] != null && local84[local94].method763(Static108.aClass27_1345)) {
						@Pc(191) short local191 = 0;
						if (arg3.anInt933 > Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2438) {
							local191 = 2000;
						}
						@Pc(200) int local200 = 0;
						if (local94 == 0) {
							local200 = local191 + 47;
						}
						if (local94 == 1) {
							local200 = local191 + 22;
						}
						if (local94 == 2) {
							local200 = local191 + 19;
						}
						if (local94 == 3) {
							local200 = local191 + 25;
						}
						if (local94 == 4) {
							local200 = local191 + 52;
						}
						Static46.method925(arg2, local200, arg1, arg0, Static98.method1779(new Class27[] { Static85.aClass27_1086, local28 }), local84[local94]);
					}
				}
			}
			Static46.method925(arg2, 1002, arg1, arg0, Static98.method1779(new Class27[] { Static85.aClass27_1086, local28 }), Static36.aClass27_435);
			return;
		} else if ((Static68.anInt1748 & 0x2) == 2) {
			Static46.method925(arg2, 15, arg1, arg0, Static98.method1779(new Class27[] { Static16.aClass27_189, Static25.aClass27_326, local28 }), Static10.aClass27_130);
			return;
		}
	}

	@OriginalMember(owner = "client!e", name = "k", descriptor = "(I)V")
	public static void method448() {
		anIntArray116 = null;
		aClass27_295 = null;
		aClass27_299 = null;
		anIntArray117 = null;
		aClass27_298 = null;
		aClass27_300 = null;
		aClass27_297 = null;
		aClass27_296 = null;
		aByteArray7 = null;
		aClass54_Sub1_10 = null;
	}
}
