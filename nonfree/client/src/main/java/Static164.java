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

public final class Static164 {

	@OriginalMember(owner = "client!qh", name = "D", descriptor = "B")
	public static byte aByte8;

	@OriginalMember(owner = "client!qh", name = "z", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1232 = Static151.method2243("slide:");

	@OriginalMember(owner = "client!qh", name = "A", descriptor = "I")
	public static int anInt3460 = -1;

	@OriginalMember(owner = "client!qh", name = "E", descriptor = "Lclient!kg;")
	public static final Class53 aClass53_21 = new Class53(200);

	@OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
	public static int anInt3465 = -1;

	@OriginalMember(owner = "client!qh", name = "J", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1233 = aClass62_1232;

	@OriginalMember(owner = "client!qh", name = "K", descriptor = "Z")
	public static boolean aBoolean148 = false;

	@OriginalMember(owner = "client!qh", name = "L", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1234 = aClass62_1232;

	@OriginalMember(owner = "client!qh", name = "O", descriptor = "[Lclient!qi;")
	public static final Class84[] aClass84Array1 = new Class84[500];

	@OriginalMember(owner = "client!qh", name = "P", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1235 = Static151.method2243("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!qh", name = "Q", descriptor = "[Lclient!tf;")
	public static final Class95[] aClass95Array1 = new Class95[4];

	@OriginalMember(owner = "client!qh", name = "R", descriptor = "Z")
	public static boolean aBoolean149 = true;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
	public static void method2405() {
		if (Static7.aBooleanArray15[96]) {
			Static11.anInt308 += (-Static11.anInt308 - 24) / 2;
		} else if (Static7.aBooleanArray15[97]) {
			Static11.anInt308 += (24 - Static11.anInt308) / 2;
		} else {
			Static11.anInt308 /= 2;
		}
		Static203.anInt4219 += Static11.anInt308 / 2;
		@Pc(54) int local54 = Static196.anInt4044 + Static186.aClass7_Sub2_Sub2_1.anInt3046;
		@Pc(60) int local60 = Static186.aClass7_Sub2_Sub2_1.anInt3085 + Static128.anInt149;
		if (Static7.aBooleanArray15[98]) {
			Static125.anInt2767 += (12 - Static125.anInt2767) / 2;
		} else if (Static7.aBooleanArray15[99]) {
			Static125.anInt2767 += (-Static125.anInt2767 - 12) / 2;
		} else {
			Static125.anInt2767 /= 2;
		}
		Static202.anInt4179 += Static125.anInt2767 / 2;
		if (Static169.anInt3578 - local54 < -500 || Static169.anInt3578 - local54 > 500 || Static17.anInt446 - local60 < -500 || Static17.anInt446 - local60 > 500) {
			Static169.anInt3578 = local54;
			Static17.anInt446 = local60;
		}
		if (local60 != Static17.anInt446) {
			Static17.anInt446 += (local60 - Static17.anInt446) / 16;
		}
		if (Static169.anInt3578 != local54) {
			Static169.anInt3578 += (local54 - Static169.anInt3578) / 16;
		}
		Static196.method2789();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!jh;I)V")
	public static void method2407(@OriginalArg(1) Class2_Sub11_Sub1 arg0) {
		while (true) {
			@Pc(15) Class2_Sub3 local15 = (Class2_Sub3) Static187.aClass13_16.method303();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt204; local22++) {
				if (local15.aClass56Array2[local22] != null) {
					if (local15.aClass56Array2[local22].anInt2418 == 2) {
						local15.anIntArray21[local22] = -5;
					}
					if (local15.aClass56Array2[local22].anInt2418 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass56Array1[local22] != null) {
					if (local15.aClass56Array1[local22].anInt2418 == 2) {
						local15.anIntArray21[local22] = -6;
					}
					if (local15.aClass56Array1[local22].anInt2418 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method1595(22);
			arg0.method1565(0);
			@Pc(102) int local102 = arg0.anInt2235;
			arg0.method1544(local15.anInt202);
			for (@Pc(109) int local109 = 0; local109 < local15.anInt204; local109++) {
				if (local15.anIntArray21[local109] == 0) {
					try {
						@Pc(133) int local133 = local15.anIntArray20[local109];
						@Pc(145) Field local145;
						@Pc(149) int local149;
						if (local133 == 0) {
							local145 = (Field) local15.aClass56Array2[local109].anObject2;
							local149 = local145.getInt(null);
							arg0.method1565(0);
							arg0.method1544(local149);
						} else if (local133 == 1) {
							local145 = (Field) local15.aClass56Array2[local109].anObject2;
							local145.setInt(null, local15.anIntArray19[local109]);
							arg0.method1565(0);
						} else if (local133 == 2) {
							local145 = (Field) local15.aClass56Array2[local109].anObject2;
							local149 = local145.getModifiers();
							arg0.method1565(0);
							arg0.method1544(local149);
						}
						@Pc(224) Method local224;
						if (local133 == 3) {
							local224 = (Method) local15.aClass56Array1[local109].anObject2;
							@Pc(249) byte[][] local249 = local15.aByteArrayArrayArray1[local109];
							@Pc(253) Object[] local253 = new Object[local249.length];
							for (@Pc(255) int local255 = 0; local255 < local249.length; local255++) {
								@Pc(267) ObjectInputStream local267 = new ObjectInputStream(new ByteArrayInputStream(local249[local255]));
								local253[local255] = local267.readObject();
							}
							@Pc(282) Object local282 = local224.invoke(null, local253);
							if (local282 == null) {
								arg0.method1565(0);
							} else if (local282 instanceof Number) {
								arg0.method1565(1);
								arg0.method1527(((Number) local282).longValue());
							} else if (local282 instanceof Class62) {
								arg0.method1565(2);
								arg0.method1540((Class62) local282);
							} else {
								arg0.method1565(4);
							}
						} else if (local133 == 4) {
							local224 = (Method) local15.aClass56Array1[local109].anObject2;
							local149 = local224.getModifiers();
							arg0.method1565(0);
							arg0.method1544(local149);
						}
					} catch (@Pc(327) ClassNotFoundException local327) {
						arg0.method1565(-10);
					} catch (@Pc(333) InvalidClassException local333) {
						arg0.method1565(-11);
					} catch (@Pc(339) StreamCorruptedException local339) {
						arg0.method1565(-12);
					} catch (@Pc(345) OptionalDataException local345) {
						arg0.method1565(-13);
					} catch (@Pc(351) IllegalAccessException local351) {
						arg0.method1565(-14);
					} catch (@Pc(357) IllegalArgumentException local357) {
						arg0.method1565(-15);
					} catch (@Pc(363) InvocationTargetException local363) {
						arg0.method1565(-16);
					} catch (@Pc(369) SecurityException local369) {
						arg0.method1565(-17);
					} catch (@Pc(375) IOException local375) {
						arg0.method1565(-18);
					} catch (@Pc(381) NullPointerException local381) {
						arg0.method1565(-19);
					} catch (@Pc(387) Exception local387) {
						arg0.method1565(-20);
					} catch (@Pc(393) Throwable local393) {
						arg0.method1565(-21);
					}
				} else {
					arg0.method1565(local15.anIntArray21[local109]);
				}
			}
			arg0.method1558(local102);
			arg0.method1549(arg0.anInt2235 - local102);
			local15.method3183();
		}
	}
}
