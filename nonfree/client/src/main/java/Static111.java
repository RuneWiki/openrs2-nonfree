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

public final class Static111 {

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
	public static int anInt3019;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1002 = Static161.method2971("sl_flags");

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
	public static final int anInt3024 = 7759444;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ID)V")
	public static void method2158(@OriginalArg(1) double arg0) {
		if (Static42.aDouble9 == arg0) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(24) int local24 = (int) (Math.pow((double) local12 / 255.0D, arg0) * 255.0D);
			Static12.anIntArray50[local12] = local24 <= 255 ? local24 : 255;
		}
		Static42.aDouble9 = arg0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public static void method2159() {
		aClass13_1002 = null;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!ja;Z)V")
	public static void method2160(@OriginalArg(1) Class1_Sub8_Sub1 arg0) {
		while (true) {
			@Pc(17) Class1_Sub9 local17 = (Class1_Sub9) Static153.aClass82_15.method2849();
			if (local17 == null) {
				return;
			}
			@Pc(22) boolean local22 = false;
			for (@Pc(24) int local24 = 0; local24 < local17.anInt1212; local24++) {
				if (local17.aClass32Array1[local24] != null) {
					if (local17.aClass32Array1[local24].anInt1974 == 2) {
						local17.anIntArray130[local24] = -5;
					}
					if (local17.aClass32Array1[local24].anInt1974 == 0) {
						local22 = true;
					}
				}
				if (local17.aClass32Array2[local24] != null) {
					if (local17.aClass32Array2[local24].anInt1974 == 2) {
						local17.anIntArray130[local24] = -6;
					}
					if (local17.aClass32Array2[local24].anInt1974 == 0) {
						local22 = true;
					}
				}
			}
			if (local22) {
				return;
			}
			arg0.method1654(96);
			arg0.method1643(0);
			@Pc(103) int local103 = arg0.anInt2195;
			arg0.method1635(local17.anInt1213);
			for (@Pc(110) int local110 = 0; local110 < local17.anInt1212; local110++) {
				if (local17.anIntArray130[local110] == 0) {
					try {
						@Pc(134) int local134 = local17.anIntArray129[local110];
						@Pc(143) Field local143;
						@Pc(147) int local147;
						if (local134 == 0) {
							local143 = (Field) local17.aClass32Array1[local110].anObject2;
							local147 = local143.getInt(null);
							arg0.method1643(0);
							arg0.method1635(local147);
						} else if (local134 == 1) {
							local143 = (Field) local17.aClass32Array1[local110].anObject2;
							local143.setInt(null, local17.anIntArray131[local110]);
							arg0.method1643(0);
						} else if (local134 == 2) {
							local143 = (Field) local17.aClass32Array1[local110].anObject2;
							local147 = local143.getModifiers();
							arg0.method1643(0);
							arg0.method1635(local147);
						}
						@Pc(214) Method local214;
						if (local134 == 3) {
							local214 = (Method) local17.aClass32Array2[local110].anObject2;
							@Pc(239) byte[][] local239 = local17.aByteArrayArrayArray21[local110];
							@Pc(243) Object[] local243 = new Object[local239.length];
							for (@Pc(245) int local245 = 0; local245 < local239.length; local245++) {
								@Pc(257) ObjectInputStream local257 = new ObjectInputStream(new ByteArrayInputStream(local239[local245]));
								local243[local245] = local257.readObject();
							}
							@Pc(272) Object local272 = local214.invoke(null, local243);
							if (local272 == null) {
								arg0.method1643(0);
							} else if (local272 instanceof Number) {
								arg0.method1643(1);
								arg0.method1625(((Number) local272).longValue());
							} else if (local272 instanceof Class13) {
								arg0.method1643(2);
								arg0.method1639((Class13) local272);
							} else {
								arg0.method1643(4);
							}
						} else if (local134 == 4) {
							local214 = (Method) local17.aClass32Array2[local110].anObject2;
							local147 = local214.getModifiers();
							arg0.method1643(0);
							arg0.method1635(local147);
						}
					} catch (@Pc(315) ClassNotFoundException local315) {
						arg0.method1643(-10);
					} catch (@Pc(321) InvalidClassException local321) {
						arg0.method1643(-11);
					} catch (@Pc(327) StreamCorruptedException local327) {
						arg0.method1643(-12);
					} catch (@Pc(333) OptionalDataException local333) {
						arg0.method1643(-13);
					} catch (@Pc(339) IllegalAccessException local339) {
						arg0.method1643(-14);
					} catch (@Pc(345) IllegalArgumentException local345) {
						arg0.method1643(-15);
					} catch (@Pc(351) InvocationTargetException local351) {
						arg0.method1643(-16);
					} catch (@Pc(357) SecurityException local357) {
						arg0.method1643(-17);
					} catch (@Pc(363) IOException local363) {
						arg0.method1643(-18);
					} catch (@Pc(369) NullPointerException local369) {
						arg0.method1643(-19);
					} catch (@Pc(375) Exception local375) {
						arg0.method1643(-20);
					} catch (@Pc(381) Throwable local381) {
						arg0.method1643(-21);
					}
				} else {
					arg0.method1643(local17.anIntArray130[local110]);
				}
			}
			arg0.method1615(local103);
			arg0.method1612(arg0.anInt2195 - local103);
			local17.method3056();
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)Z")
	public static boolean method2161(@OriginalArg(0) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "([BII)I")
	public static int method2162(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static85.method1822(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
	public static void method2163() {
		Static130.anIntArray324 = null;
		Static180.aByteArrayArray10 = null;
		Static12.anIntArray51 = null;
		Static184.anIntArray449 = null;
		Static106.anIntArray285 = null;
		Static104.anIntArray268 = null;
	}
}
