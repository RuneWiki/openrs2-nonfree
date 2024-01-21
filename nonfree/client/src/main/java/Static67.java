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

public final class Static67 {

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
	public static int anInt2918;

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1266 = Static51.method932("button near the top of that page)3");

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1264 = aClass10_1266;

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
	public static int anInt2916 = -1;

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1265 = Static51.method932("(U2");

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!kg;I)V")
	public static void method2097(@OriginalArg(1) Class2_Sub11_Sub1 arg0) {
		while (true) {
			@Pc(15) Class2_Sub23 local15 = (Class2_Sub23) Static10.aClass12_1.method384();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt3341; local22++) {
				if (local15.aClass15Array2[local22] != null) {
					if (local15.aClass15Array2[local22].anInt821 == 2) {
						local15.anIntArray356[local22] = -5;
					}
					if (local15.aClass15Array2[local22].anInt821 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass15Array1[local22] != null) {
					if (local15.aClass15Array1[local22].anInt821 == 2) {
						local15.anIntArray356[local22] = -6;
					}
					if (local15.aClass15Array1[local22].anInt821 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method1495(187);
			arg0.method1439(0);
			@Pc(102) int local102 = arg0.anInt2077;
			arg0.method1445(local15.anInt3338);
			for (@Pc(109) int local109 = 0; local109 < local15.anInt3341; local109++) {
				if (local15.anIntArray356[local109] == 0) {
					try {
						@Pc(130) int local130 = local15.anIntArray357[local109];
						@Pc(147) Field local147;
						@Pc(150) int local150;
						if (local130 == 0) {
							local147 = (Field) local15.aClass15Array2[local109].anObject2;
							local150 = local147.getInt(null);
							arg0.method1439(0);
							arg0.method1445(local150);
						} else if (local130 == 1) {
							local147 = (Field) local15.aClass15Array2[local109].anObject2;
							local147.setInt(null, local15.anIntArray355[local109]);
							arg0.method1439(0);
						} else if (local130 == 2) {
							local147 = (Field) local15.aClass15Array2[local109].anObject2;
							local150 = local147.getModifiers();
							arg0.method1439(0);
							arg0.method1445(local150);
						}
						@Pc(214) Method local214;
						if (local130 == 3) {
							@Pc(207) byte[][] local207 = local15.aByteArrayArrayArray10[local109];
							local214 = (Method) local15.aClass15Array1[local109].anObject2;
							@Pc(218) Object[] local218 = new Object[local207.length];
							for (@Pc(220) int local220 = 0; local220 < local207.length; local220++) {
								@Pc(232) ObjectInputStream local232 = new ObjectInputStream(new ByteArrayInputStream(local207[local220]));
								local218[local220] = local232.readObject();
							}
							@Pc(251) Object local251 = local214.invoke(null, local218);
							if (local251 == null) {
								arg0.method1439(0);
							} else if (local251 instanceof Number) {
								arg0.method1439(1);
								arg0.method1458(((Number) local251).longValue());
							} else if (local251 instanceof Class10) {
								arg0.method1439(2);
								arg0.method1450((Class10) local251);
							} else {
								arg0.method1439(4);
							}
						} else if (local130 == 4) {
							local214 = (Method) local15.aClass15Array1[local109].anObject2;
							local150 = local214.getModifiers();
							arg0.method1439(0);
							arg0.method1445(local150);
						}
					} catch (@Pc(319) ClassNotFoundException local319) {
						arg0.method1439(-10);
					} catch (@Pc(325) InvalidClassException local325) {
						arg0.method1439(-11);
					} catch (@Pc(331) StreamCorruptedException local331) {
						arg0.method1439(-12);
					} catch (@Pc(337) OptionalDataException local337) {
						arg0.method1439(-13);
					} catch (@Pc(343) IllegalAccessException local343) {
						arg0.method1439(-14);
					} catch (@Pc(349) IllegalArgumentException local349) {
						arg0.method1439(-15);
					} catch (@Pc(355) InvocationTargetException local355) {
						arg0.method1439(-16);
					} catch (@Pc(361) SecurityException local361) {
						arg0.method1439(-17);
					} catch (@Pc(367) IOException local367) {
						arg0.method1439(-18);
					} catch (@Pc(373) NullPointerException local373) {
						arg0.method1439(-19);
					} catch (@Pc(379) Exception local379) {
						arg0.method1439(-20);
					} catch (@Pc(385) Throwable local385) {
						arg0.method1439(-21);
					}
				} else {
					arg0.method1439(local15.anIntArray356[local109]);
				}
			}
			arg0.method1448(local102);
			arg0.method1465(arg0.anInt2077 - local102);
			local15.method2705();
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!kh;Ljava/awt/Component;Lclient!kh;B)V")
	public static void method2099(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) Class29 arg2) {
		if (Static93.aBoolean92) {
			return;
		}
		Static172.method2014();
		@Pc(15) byte[] local15 = arg2.method1038(Static95.aClass10_949, Static58.aClass10_641);
		Static163.aClass2_Sub1_Sub4_Sub2_42 = new Class2_Sub1_Sub4_Sub2(local15, arg1);
		Static177.aClass2_Sub1_Sub4_Sub2_44 = Static163.aClass2_Sub1_Sub4_Sub2_42.method720();
		Static145.aClass2_Sub1_Sub4_Sub3_6 = Static2.method33(arg0, Static107.aClass10_1069, Static95.aClass10_949);
		Static105.aClass2_Sub1_Sub4_Sub3_5 = Static2.method33(arg0, Static2.aClass10_29, Static95.aClass10_949);
		Static53.aClass2_Sub1_Sub4_Sub3_2 = Static2.method33(arg0, Static96.aClass10_1584, Static95.aClass10_949);
		Static96.aClass2_Sub1_Sub4_Sub3Array21 = Static41.method794(Static95.aClass10_949, arg0, Static139.aClass10_1346);
		Static30.aClass2_Sub1_Sub4_Sub3Array9 = Static41.method794(Static95.aClass10_949, arg0, Static88.aClass10_608);
		Static111.anIntArray258 = new int[256];
		for (@Pc(64) int local64 = 0; local64 < 64; local64++) {
			Static111.anIntArray258[local64] = local64 * 262144;
		}
		for (@Pc(78) int local78 = 0; local78 < 64; local78++) {
			Static111.anIntArray258[local78 + 64] = local78 * 1024 + 16711680;
		}
		for (@Pc(97) int local97 = 0; local97 < 64; local97++) {
			Static111.anIntArray258[local97 + 128] = local97 * 4 + 16776960;
		}
		for (@Pc(115) int local115 = 0; local115 < 64; local115++) {
			Static111.anIntArray258[local115 + 192] = 16777215;
		}
		Static138.anIntArray328 = new int[256];
		for (@Pc(132) int local132 = 0; local132 < 64; local132++) {
			Static138.anIntArray328[local132] = local132 * 1024;
		}
		for (@Pc(148) int local148 = 0; local148 < 64; local148++) {
			Static138.anIntArray328[local148 + 64] = local148 * 4 + 65280;
		}
		for (@Pc(169) int local169 = 0; local169 < 64; local169++) {
			Static138.anIntArray328[local169 + 128] = local169 * 262144 + 65535;
		}
		for (@Pc(189) int local189 = 0; local189 < 64; local189++) {
			Static138.anIntArray328[local189 + 192] = 16777215;
		}
		Static32.anIntArray66 = new int[256];
		for (@Pc(206) int local206 = 0; local206 < 64; local206++) {
			Static32.anIntArray66[local206] = local206 * 4;
		}
		for (@Pc(220) int local220 = 0; local220 < 64; local220++) {
			Static32.anIntArray66[local220 + 64] = local220 * 262144 + 255;
		}
		for (@Pc(238) int local238 = 0; local238 < 64; local238++) {
			Static32.anIntArray66[local238 + 128] = local238 * 1024 + 16711935;
		}
		for (@Pc(259) int local259 = 0; local259 < 64; local259++) {
			Static32.anIntArray66[local259 + 192] = 16777215;
		}
		Static102.anIntArray378 = new int[32768];
		Static145.anIntArray280 = new int[256];
		Static93.anIntArray228 = new int[32768];
		Static46.method875(null);
		Static33.anIntArray68 = new int[32768];
		Static133.aBoolean132 = false;
		Static95.aClass10_951 = Static95.aClass10_949;
		Static11.anIntArray368 = new int[32768];
		Static95.aClass10_945 = Static95.aClass10_949;
		Static20.anInt499 = 0;
		if (Static37.anInt932 == 0) {
			Static155.aBoolean149 = true;
		} else {
			Static155.aBoolean149 = false;
		}
		if (Static155.aBoolean149) {
			Static109.method1751();
		} else {
			Static41.method793(Static170.aClass29_Sub1_51, Static95.aClass10_949, Static97.aClass10_966);
		}
		Static104.method1689(false);
		Static93.aBoolean92 = true;
		Static163.aClass2_Sub1_Sub4_Sub2_42.method716(0, 0);
		Static177.aClass2_Sub1_Sub4_Sub2_44.method716(382, 0);
		Static145.aClass2_Sub1_Sub4_Sub3_6.method1874(382 - Static145.aClass2_Sub1_Sub4_Sub3_6.anInt2635 / 2, 18);
		Static51.aClass2_Sub1_Sub4_Sub2_13 = new Class2_Sub1_Sub4_Sub2(128, 254);
		Static123.aClass2_Sub1_Sub4_Sub2_31 = new Class2_Sub1_Sub4_Sub2(128, 254);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZIILclient!kh;)Lclient!ea;")
	public static Class2_Sub1_Sub4_Sub2 method2100(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class29 arg2) {
		return Static111.method1762(arg0, arg1, arg2) ? Static57.method1067() : null;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
	public static void method2102() {
		aClass10_1266 = null;
		aClass10_1265 = null;
		aClass10_1264 = null;
	}
}
