import java.awt.Component;
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

public final class Static39 {

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
	public static int anInt979;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Lclient!bb;")
	public static Class8 aClass8_2 = new Class8();

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Lclient!kc;")
	public static Class36 aClass36_497 = Static14.method2017("Stufe)2");

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
	public static int anInt980 = -1;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "Lclient!kc;")
	private static Class36 aClass36_500 = Static14.method2017("skill)2");

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "Lclient!kc;")
	public static Class36 aClass36_498 = aClass36_500;

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
	public static int anInt981 = 0;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "Lclient!kc;")
	public static Class36 aClass36_499 = Static14.method2017("Hier klicken)1 um fortzufahren)3)3)3");

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "Lclient!kc;")
	private static Class36 aClass36_501 = Static14.method2017("M");

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "Lclient!kc;")
	public static Class36 aClass36_502 = aClass36_501;

	@OriginalMember(owner = "client!hc", name = "u", descriptor = "Lclient!kc;")
	public static Class36 aClass36_503 = Static14.method2017("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BIILjava/awt/Component;)Lclient!ta;")
	public static Class14 method751(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class14_Sub2");
			@Pc(15) Class14 local15 = (Class14) local11.getDeclaredConstructor().newInstance();
			local15.method1474(arg2, arg0, arg1);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class14_Sub1 local28 = new Class14_Sub1();
			local28.method1474(arg2, arg0, arg1);
			return local28;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!oc;II)V")
	public static void method752(@OriginalArg(0) Class2_Sub12_Sub1 arg0) {
		while (true) {
			@Pc(15) Class2_Sub10 local15 = (Class2_Sub10) Static90.aClass8_6.method175();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt1710; local22++) {
				if (local15.aClass34Array2[local22] != null) {
					if (local15.aClass34Array2[local22].anInt1269 == 2) {
						local15.anIntArray216[local22] = -5;
					}
					if (local15.aClass34Array2[local22].anInt1269 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass34Array1[local22] != null) {
					if (local15.aClass34Array1[local22].anInt1269 == 2) {
						local15.anIntArray216[local22] = -6;
					}
					if (local15.aClass34Array1[local22].anInt1269 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method1422(136);
			arg0.method1409(0);
			@Pc(96) int local96 = arg0.anInt1939;
			arg0.method1394(local15.anInt1711);
			for (@Pc(103) int local103 = 0; local103 < local15.anInt1710; local103++) {
				if (local15.anIntArray216[local103] == 0) {
					try {
						@Pc(124) int local124 = local15.anIntArray217[local103];
						@Pc(138) Field local138;
						@Pc(166) int local166;
						if (local124 == 0) {
							local138 = (Field) local15.aClass34Array2[local103].anObject2;
							local166 = local138.getInt(null);
							arg0.method1409(0);
							arg0.method1394(local166);
						} else if (local124 == 1) {
							local138 = (Field) local15.aClass34Array2[local103].anObject2;
							local138.setInt(null, local15.anIntArray219[local103]);
							arg0.method1409(0);
						} else if (local124 == 2) {
							local138 = (Field) local15.aClass34Array2[local103].anObject2;
							local166 = local138.getModifiers();
							arg0.method1409(0);
							arg0.method1394(local166);
						}
						@Pc(207) Method local207;
						if (local124 == 3) {
							local207 = (Method) local15.aClass34Array1[local103].anObject2;
							@Pc(212) byte[][] local212 = local15.aByteArrayArrayArray7[local103];
							@Pc(216) Object[] local216 = new Object[local212.length];
							for (@Pc(218) int local218 = 0; local218 < local212.length; local218++) {
								@Pc(230) ObjectInputStream local230 = new ObjectInputStream(new ByteArrayInputStream(local212[local218]));
								local216[local218] = local230.readObject();
							}
							@Pc(245) Object local245 = local207.invoke(null, local216);
							if (local245 == null) {
								arg0.method1409(0);
							} else if (local245 instanceof Number) {
								arg0.method1409(1);
								arg0.method1377(((Number) local245).longValue());
							} else if (local245 instanceof Class36) {
								arg0.method1409(2);
								arg0.method1384((Class36) local245);
							} else {
								arg0.method1409(4);
							}
						} else if (local124 == 4) {
							local207 = (Method) local15.aClass34Array1[local103].anObject2;
							local166 = local207.getModifiers();
							arg0.method1409(0);
							arg0.method1394(local166);
						}
					} catch (@Pc(313) ClassNotFoundException local313) {
						arg0.method1409(-10);
					} catch (@Pc(319) InvalidClassException local319) {
						arg0.method1409(-11);
					} catch (@Pc(325) StreamCorruptedException local325) {
						arg0.method1409(-12);
					} catch (@Pc(331) OptionalDataException local331) {
						arg0.method1409(-13);
					} catch (@Pc(337) IllegalAccessException local337) {
						arg0.method1409(-14);
					} catch (@Pc(343) IllegalArgumentException local343) {
						arg0.method1409(-15);
					} catch (@Pc(349) InvocationTargetException local349) {
						arg0.method1409(-16);
					} catch (@Pc(355) SecurityException local355) {
						arg0.method1409(-17);
					} catch (@Pc(361) IOException local361) {
						arg0.method1409(-18);
					} catch (@Pc(367) NullPointerException local367) {
						arg0.method1409(-19);
					} catch (@Pc(373) Exception local373) {
						arg0.method1409(-20);
					} catch (@Pc(379) Throwable local379) {
						arg0.method1409(-21);
					}
				} else {
					arg0.method1409(local15.anIntArray216[local103]);
				}
			}
			arg0.method1393(local96);
			arg0.method1402(arg0.anInt1939 - local96);
			local15.method2073();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([Lclient!kc;I)[Lclient!kc;")
	public static Class36[] method753(@OriginalArg(0) Class36[] arg0) {
		@Pc(13) Class36[] local13 = new Class36[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = Static49.method949(new Class36[] { Static57.method1055(local15), Static118.aClass36_1463 });
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = Static49.method949(new Class36[] { local13[local15], arg0[local15] });
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method754() {
		if (Static95.anInt2522 != 1) {
			return;
		}
		if (Static59.anInt1578 >= 539 && Static59.anInt1578 <= 573 && Static90.anInt2349 >= 169 && Static90.anInt2349 < 205 && Static101.anIntArray323[0] != -1) {
			Static109.anInt2825 = 0;
			Static100.aBoolean118 = true;
			Static78.aBoolean85 = true;
		}
		if (Static59.anInt1578 >= 569 && Static59.anInt1578 <= 599 && Static90.anInt2349 >= 168 && Static90.anInt2349 < 205 && Static101.anIntArray323[1] != -1) {
			Static78.aBoolean85 = true;
			Static100.aBoolean118 = true;
			Static109.anInt2825 = 1;
		}
		if (Static59.anInt1578 >= 597 && Static59.anInt1578 <= 627 && Static90.anInt2349 >= 168 && Static90.anInt2349 < 205 && Static101.anIntArray323[2] != -1) {
			Static109.anInt2825 = 2;
			Static100.aBoolean118 = true;
			Static78.aBoolean85 = true;
		}
		if (Static59.anInt1578 >= 625 && Static59.anInt1578 <= 669 && Static90.anInt2349 >= 168 && Static90.anInt2349 < 203 && Static101.anIntArray323[3] != -1) {
			Static78.aBoolean85 = true;
			Static109.anInt2825 = 3;
			Static100.aBoolean118 = true;
		}
		if (Static59.anInt1578 >= 666 && Static59.anInt1578 <= 696 && Static90.anInt2349 >= 168 && Static90.anInt2349 < 205 && Static101.anIntArray323[4] != -1) {
			Static78.aBoolean85 = true;
			Static100.aBoolean118 = true;
			Static109.anInt2825 = 4;
		}
		if (Static59.anInt1578 >= 694 && Static59.anInt1578 <= 724 && Static90.anInt2349 >= 168 && Static90.anInt2349 < 205 && Static101.anIntArray323[5] != -1) {
			Static109.anInt2825 = 5;
			Static100.aBoolean118 = true;
			Static78.aBoolean85 = true;
		}
		if (Static59.anInt1578 >= 722 && Static59.anInt1578 <= 756 && Static90.anInt2349 >= 169 && Static90.anInt2349 < 205 && Static101.anIntArray323[6] != -1) {
			Static109.anInt2825 = 6;
			Static78.aBoolean85 = true;
			Static100.aBoolean118 = true;
		}
		if (Static59.anInt1578 >= 540 && Static59.anInt1578 <= 574 && Static90.anInt2349 >= 466 && Static90.anInt2349 < 502 && Static101.anIntArray323[7] != -1) {
			Static100.aBoolean118 = true;
			Static78.aBoolean85 = true;
			Static109.anInt2825 = 7;
		}
		if (Static59.anInt1578 >= 572 && Static59.anInt1578 <= 602 && Static90.anInt2349 >= 466 && Static90.anInt2349 < 503 && Static101.anIntArray323[8] != -1) {
			Static100.aBoolean118 = true;
			Static109.anInt2825 = 8;
			Static78.aBoolean85 = true;
		}
		if (Static59.anInt1578 >= 599 && Static59.anInt1578 <= 629 && Static90.anInt2349 >= 466 && Static90.anInt2349 < 503 && Static101.anIntArray323[9] != -1) {
			Static109.anInt2825 = 9;
			Static100.aBoolean118 = true;
			Static78.aBoolean85 = true;
		}
		if (Static59.anInt1578 >= 627 && Static59.anInt1578 <= 671 && Static90.anInt2349 >= 467 && Static90.anInt2349 < 502 && Static101.anIntArray323[10] != -1) {
			Static78.aBoolean85 = true;
			Static100.aBoolean118 = true;
			Static109.anInt2825 = 10;
		}
		if (Static59.anInt1578 >= 669 && Static59.anInt1578 <= 699 && Static90.anInt2349 >= 466 && Static90.anInt2349 < 503 && Static101.anIntArray323[11] != -1) {
			Static109.anInt2825 = 11;
			Static78.aBoolean85 = true;
			Static100.aBoolean118 = true;
		}
		if (Static59.anInt1578 >= 696 && Static59.anInt1578 <= 726 && Static90.anInt2349 >= 466 && Static90.anInt2349 < 503 && Static101.anIntArray323[12] != -1) {
			Static100.aBoolean118 = true;
			Static109.anInt2825 = 12;
			Static78.aBoolean85 = true;
		}
		if (Static59.anInt1578 >= 724 && Static59.anInt1578 <= 758 && Static90.anInt2349 >= 466 && Static90.anInt2349 < 502 && Static101.anIntArray323[13] != -1) {
			Static78.aBoolean85 = true;
			Static100.aBoolean118 = true;
			Static109.anInt2825 = 13;
			return;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)I")
	public static int method755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class2_Sub13 local10 = (Class2_Sub13) Static66.aClass31_3.method905((long) arg1);
		if (local10 == null) {
			return -1;
		} else if (arg0 >= 0 && local10.anIntArray249.length > arg0) {
			return local10.anIntArray249[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIII)I")
	public static int method756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg1 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(21) int local21 = arg0;
			arg0 = arg4;
			arg4 = local21;
		}
		if (local7 == 0) {
			return arg3;
		} else if (local7 == 1) {
			return 1 + 7 - arg0 - arg5;
		} else if (local7 == 2) {
			return 7 + 1 - arg3 - arg4;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)I")
	public static int method757() {
		return 5;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public static void method758() {
		Static55.anInt2714 = 0;
		Static27.anInt747 = 0;
		Static105.method1937();
		Static79.method1482();
		Static19.method2030();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static27.anInt747; local17++) {
			local23 = Static47.anIntArray169[local17];
			if (Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local23].anInt2169 != Static113.anInt2952) {
				Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local23].aClass2_Sub1_Sub9_1 = null;
				Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local23] = null;
			}
		}
		if (Static111.anInt2876 != Static92.aClass2_Sub12_Sub1_3.anInt1939) {
			throw new RuntimeException("gnp1 pos:" + Static92.aClass2_Sub12_Sub1_3.anInt1939 + " psize:" + Static111.anInt2876);
		}
		for (local23 = 0; local23 < Static108.anInt2775; local23++) {
			if (Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[Static51.anIntArray316[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static108.anInt2775);
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
	public static void method759() {
		aClass36_501 = null;
		aClass36_498 = null;
		aClass36_497 = null;
		aClass8_2 = null;
		aClass36_503 = null;
		aClass36_502 = null;
		aClass36_499 = null;
		aClass36_500 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!ac;Lclient!ac;)V")
	public static void method760(@OriginalArg(1) Class3 arg0, @OriginalArg(2) Class3 arg1) {
		Static52.aClass3_14 = arg1;
		Static69.aClass3_17 = arg0;
	}
}
