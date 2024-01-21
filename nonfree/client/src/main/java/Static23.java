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

public final class Static23 {

	@OriginalMember(owner = "client!e", name = "h", descriptor = "Lclient!pa;")
	public static Class51 aClass51_13;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_4;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "Lclient!f;")
	public static Class19 aClass19_4;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "Lclient!ke;")
	public static Class39 aClass39_300 = Static2.method66(",Zffentlicher Chat");

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Lclient!ke;")
	private static Class39 aClass39_301 = Static2.method66("On");

	@OriginalMember(owner = "client!e", name = "e", descriptor = "[I")
	public static int[] anIntArray70 = new int[50];

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!ke;")
	public static Class39 aClass39_302 = aClass39_301;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Lclient!ke;")
	private static Class39 aClass39_303 = Static2.method66("Your account has been disabled)3");

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Lclient!ke;")
	public static Class39 aClass39_304 = null;

	@OriginalMember(owner = "client!e", name = "n", descriptor = "Lclient!ke;")
	public static Class39 aClass39_305 = aClass39_303;

	@OriginalMember(owner = "client!e", name = "q", descriptor = "Lclient!ke;")
	public static Class39 aClass39_306 = Static2.method66("headicons_prayer");

	@OriginalMember(owner = "client!e", name = "r", descriptor = "Lclient!ke;")
	public static Class39 aClass39_307 = Static2.method66("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IZ)Z")
	public static boolean method442(@OriginalArg(0) int arg0) {
		if (Static89.aBooleanArray12[arg0]) {
			return true;
		} else if (Static65.aClass36_44.method1772(arg0)) {
			@Pc(21) int local21 = Static65.aClass36_44.method1763(arg0);
			if (local21 == 0) {
				Static89.aBooleanArray12[arg0] = true;
				return true;
			}
			if (Static76.aClass2_Sub1_Sub6ArrayArray1[arg0] == null) {
				Static76.aClass2_Sub1_Sub6ArrayArray1[arg0] = new Class2_Sub1_Sub6[local21];
			}
			for (@Pc(40) int local40 = 0; local40 < local21; local40++) {
				if (Static76.aClass2_Sub1_Sub6ArrayArray1[arg0][local40] == null) {
					@Pc(53) byte[] local53 = Static65.aClass36_44.method1761(arg0, local40);
					if (local53 != null) {
						Static76.aClass2_Sub1_Sub6ArrayArray1[arg0][local40] = new Class2_Sub1_Sub6();
						Static76.aClass2_Sub1_Sub6ArrayArray1[arg0][local40].method511(new Class2_Sub5(local53));
					}
				}
			}
			Static89.aBooleanArray12[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)I")
	public static int method443(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public static void method444() {
		@Pc(7) int local7 = Static82.anInt2219;
		@Pc(9) int local9 = Static46.anInt1260;
		@Pc(11) int local11 = Static19.anInt568;
		@Pc(13) int local13 = Static92.anInt2405;
		Static91.method2013(local9, local7, local11, local13, 6116423);
		Static91.method2013(local9 + 1, local7 + 1, local11 - 2, 16, 0);
		Static91.method2011(local9 + 1, local7 + 18, local11 - 2, local13 + -19, 0);
		Static25.aClass2_Sub1_Sub4_Sub1_1.method234(Static68.aClass39_888, local9 + 3, local7 + 14, 6116423);
		@Pc(65) int local65 = Static45.anInt1237;
		@Pc(67) int local67 = Static80.anInt2188;
		if (Static7.anInt162 == 0) {
			local67 -= 4;
			local65 -= 4;
		}
		if (Static7.anInt162 == 1) {
			local65 -= 205;
			local67 -= 553;
		}
		if (Static7.anInt162 == 2) {
			local65 -= 357;
			local67 -= 17;
		}
		for (@Pc(86) int local86 = 0; local86 < Static101.anInt2753; local86++) {
			@Pc(101) int local101 = (Static101.anInt2753 - local86 - 1) * 15 + local7 + 31;
			@Pc(103) int local103 = 16777215;
			if (local67 > local9 && local67 < local9 + local11 && local65 > local101 - 13 && local65 < local101 + 3) {
				local103 = 16776960;
			}
			Static25.aClass2_Sub1_Sub4_Sub1_1.method235(Static26.aClass39Array7[local86], local9 + 3, local101, local103, true);
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
	public static void method445() {
		aClass51_13 = null;
		aClass39_301 = null;
		aClass39_300 = null;
		aClass39_305 = null;
		aClass39_307 = null;
		aClass39_303 = null;
		aClass2_Sub1_Sub4_Sub3_4 = null;
		aClass39_306 = null;
		anIntArray70 = null;
		aClass39_304 = null;
		aClass39_302 = null;
		aClass19_4 = null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public static void method446() {
		Static55.aClass51_34.method1970();
		Static55.aClass2_Sub1_Sub4_Sub3_10.method1946(0, 0);
		Static62.anIntArray234 = Static106.method2031(Static62.anIntArray234);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!mb;II)V")
	public static void method447(@OriginalArg(0) Class2_Sub5_Sub1 arg0) {
		while (true) {
			@Pc(18) Class2_Sub12 local18 = (Class2_Sub12) Static27.aClass34_16.method872();
			if (local18 == null) {
				return;
			}
			@Pc(23) boolean local23 = false;
			for (@Pc(25) int local25 = 0; local25 < local18.anInt2186; local25++) {
				if (local18.aClass19Array1[local25] != null) {
					if (local18.aClass19Array1[local25].anInt799 == 2) {
						local18.anIntArray291[local25] = -5;
					}
					if (local18.aClass19Array1[local25].anInt799 == 0) {
						local23 = true;
					}
				}
				if (local18.aClass19Array2[local25] != null) {
					if (local18.aClass19Array2[local25].anInt799 == 2) {
						local18.anIntArray291[local25] = -6;
					}
					if (local18.aClass19Array2[local25].anInt799 == 0) {
						local23 = true;
					}
				}
			}
			if (local23) {
				return;
			}
			arg0.method1302(40);
			arg0.method1252(0);
			@Pc(103) int local103 = arg0.anInt1772;
			arg0.method1298(local18.anInt2183);
			for (@Pc(110) int local110 = 0; local110 < local18.anInt2186; local110++) {
				if (local18.anIntArray291[local110] == 0) {
					try {
						@Pc(131) int local131 = local18.anIntArray290[local110];
						@Pc(151) Field local151;
						@Pc(154) int local154;
						if (local131 == 0) {
							local151 = (Field) local18.aClass19Array1[local110].anObject3;
							local154 = local151.getInt(null);
							arg0.method1252(0);
							arg0.method1298(local154);
						} else if (local131 == 1) {
							local151 = (Field) local18.aClass19Array1[local110].anObject3;
							local151.setInt(null, local18.anIntArray289[local110]);
							arg0.method1252(0);
						} else if (local131 == 2) {
							local151 = (Field) local18.aClass19Array1[local110].anObject3;
							local154 = local151.getModifiers();
							arg0.method1252(0);
							arg0.method1298(local154);
						}
						@Pc(218) Method local218;
						if (local131 == 3) {
							local218 = (Method) local18.aClass19Array2[local110].anObject3;
							@Pc(243) byte[][] local243 = local18.aByteArrayArrayArray5[local110];
							@Pc(247) Object[] local247 = new Object[local243.length];
							for (@Pc(249) int local249 = 0; local249 < local243.length; local249++) {
								@Pc(261) ObjectInputStream local261 = new ObjectInputStream(new ByteArrayInputStream(local243[local249]));
								local247[local249] = local261.readObject();
							}
							@Pc(280) Object local280 = local218.invoke(null, local247);
							if (local280 == null) {
								arg0.method1252(0);
							} else if (local280 instanceof Number) {
								arg0.method1252(1);
								arg0.method1270(((Number) local280).longValue());
							} else if (local280 instanceof Class39) {
								arg0.method1252(2);
								arg0.method1297((Class39) local280);
							} else {
								arg0.method1252(4);
							}
						} else if (local131 == 4) {
							local218 = (Method) local18.aClass19Array2[local110].anObject3;
							local154 = local218.getModifiers();
							arg0.method1252(0);
							arg0.method1298(local154);
						}
					} catch (@Pc(323) ClassNotFoundException local323) {
						arg0.method1252(-10);
					} catch (@Pc(329) InvalidClassException local329) {
						arg0.method1252(-11);
					} catch (@Pc(335) StreamCorruptedException local335) {
						arg0.method1252(-12);
					} catch (@Pc(341) OptionalDataException local341) {
						arg0.method1252(-13);
					} catch (@Pc(347) IllegalAccessException local347) {
						arg0.method1252(-14);
					} catch (@Pc(353) IllegalArgumentException local353) {
						arg0.method1252(-15);
					} catch (@Pc(359) InvocationTargetException local359) {
						arg0.method1252(-16);
					} catch (@Pc(365) SecurityException local365) {
						arg0.method1252(-17);
					} catch (@Pc(371) IOException local371) {
						arg0.method1252(-18);
					} catch (@Pc(377) NullPointerException local377) {
						arg0.method1252(-19);
					} catch (@Pc(383) Exception local383) {
						arg0.method1252(-20);
					} catch (@Pc(389) Throwable local389) {
						arg0.method1252(-21);
					}
				} else {
					arg0.method1252(local18.anIntArray291[local110]);
				}
			}
			arg0.method1265(local103);
			arg0.method1266(arg0.anInt1772 - local103);
			local18.method2045();
		}
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)I")
	public static int method448() {
		@Pc(17) int local17 = Static51.method1779(Static41.anInt1188, Static88.anInt1136, Static18.anInt560);
		return local17 - Static5.anInt100 >= 800 || (Static96.aByteArrayArrayArray8[Static18.anInt560][Static88.anInt1136 >> 7][Static41.anInt1188 >> 7] & 0x4) == 0 ? 3 : Static18.anInt560;
	}
}
