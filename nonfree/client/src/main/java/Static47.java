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

public final class Static47 {

	@OriginalMember(owner = "client!ff", name = "Z", descriptor = "Lclient!mb;")
	public static Class10_Sub1 aClass10_Sub1_6;

	@OriginalMember(owner = "client!ff", name = "S", descriptor = "Lclient!ai;")
	private static Class6 aClass6_363 = Static38.method685("Service unavailable)3");

	@OriginalMember(owner = "client!ff", name = "T", descriptor = "Lclient!ai;")
	public static Class6 aClass6_364 = Static38.method685("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!ff", name = "U", descriptor = "Lclient!ai;")
	public static Class6 aClass6_365 = Static38.method685(")3");

	@OriginalMember(owner = "client!ff", name = "V", descriptor = "Lclient!ai;")
	public static Class6 aClass6_366 = aClass6_363;

	@OriginalMember(owner = "client!ff", name = "Y", descriptor = "Lclient!ai;")
	public static Class6 aClass6_367 = Static38.method685("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIII)I")
	public static int method878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg5 & 0x1) == 1) {
			@Pc(19) int local19 = arg4;
			arg4 = arg3;
			arg3 = local19;
		}
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 + 1 - arg0 - arg4;
		} else {
			return 7 + 1 - arg1 - arg3;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILclient!ke;)V")
	public static void method879(@OriginalArg(2) Class2_Sub13_Sub1 arg0) {
		while (true) {
			@Pc(15) Class2_Sub11 local15 = (Class2_Sub11) Static72.aClass84_3.method2694();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt1571; local22++) {
				if (local15.aClass11Array2[local22] != null) {
					if (local15.aClass11Array2[local22].anInt467 == 2) {
						local15.anIntArray102[local22] = -5;
					}
					if (local15.aClass11Array2[local22].anInt467 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass11Array1[local22] != null) {
					if (local15.aClass11Array1[local22].anInt467 == 2) {
						local15.anIntArray102[local22] = -6;
					}
					if (local15.aClass11Array1[local22].anInt467 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method1455(126);
			arg0.method1416(0);
			@Pc(99) int local99 = arg0.anInt2154;
			arg0.method1421(local15.anInt1572);
			for (@Pc(106) int local106 = 0; local106 < local15.anInt1571; local106++) {
				if (local15.anIntArray102[local106] == 0) {
					try {
						@Pc(127) int local127 = local15.anIntArray101[local106];
						@Pc(139) Field local139;
						@Pc(143) int local143;
						if (local127 == 0) {
							local139 = (Field) local15.aClass11Array2[local106].anObject2;
							local143 = local139.getInt(null);
							arg0.method1416(0);
							arg0.method1421(local143);
						} else if (local127 == 1) {
							local139 = (Field) local15.aClass11Array2[local106].anObject2;
							local139.setInt(null, local15.anIntArray103[local106]);
							arg0.method1416(0);
						} else if (local127 == 2) {
							local139 = (Field) local15.aClass11Array2[local106].anObject2;
							local143 = local139.getModifiers();
							arg0.method1416(0);
							arg0.method1421(local143);
						}
						@Pc(216) Method local216;
						if (local127 == 3) {
							local216 = (Method) local15.aClass11Array1[local106].anObject2;
							@Pc(241) byte[][] local241 = local15.aByteArrayArrayArray3[local106];
							@Pc(245) Object[] local245 = new Object[local241.length];
							for (@Pc(247) int local247 = 0; local247 < local241.length; local247++) {
								@Pc(259) ObjectInputStream local259 = new ObjectInputStream(new ByteArrayInputStream(local241[local247]));
								local245[local247] = local259.readObject();
							}
							@Pc(278) Object local278 = local216.invoke(null, local245);
							if (local278 == null) {
								arg0.method1416(0);
							} else if (local278 instanceof Number) {
								arg0.method1416(1);
								arg0.method1418(((Number) local278).longValue());
							} else if (local278 instanceof Class6) {
								arg0.method1416(2);
								arg0.method1404((Class6) local278);
							} else {
								arg0.method1416(4);
							}
						} else if (local127 == 4) {
							local216 = (Method) local15.aClass11Array1[local106].anObject2;
							local143 = local216.getModifiers();
							arg0.method1416(0);
							arg0.method1421(local143);
						}
					} catch (@Pc(321) ClassNotFoundException local321) {
						arg0.method1416(-10);
					} catch (@Pc(327) InvalidClassException local327) {
						arg0.method1416(-11);
					} catch (@Pc(333) StreamCorruptedException local333) {
						arg0.method1416(-12);
					} catch (@Pc(339) OptionalDataException local339) {
						arg0.method1416(-13);
					} catch (@Pc(345) IllegalAccessException local345) {
						arg0.method1416(-14);
					} catch (@Pc(351) IllegalArgumentException local351) {
						arg0.method1416(-15);
					} catch (@Pc(357) InvocationTargetException local357) {
						arg0.method1416(-16);
					} catch (@Pc(363) SecurityException local363) {
						arg0.method1416(-17);
					} catch (@Pc(369) IOException local369) {
						arg0.method1416(-18);
					} catch (@Pc(375) NullPointerException local375) {
						arg0.method1416(-19);
					} catch (@Pc(381) Exception local381) {
						arg0.method1416(-20);
					} catch (@Pc(387) Throwable local387) {
						arg0.method1416(-21);
					}
				} else {
					arg0.method1416(local15.anIntArray102[local106]);
				}
			}
			arg0.method1414(local99);
			arg0.method1424(arg0.anInt2154 - local99);
			local15.method2808();
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V")
	public static void method880() {
		aClass6_365 = null;
		aClass6_363 = null;
		aClass6_366 = null;
		aClass10_Sub1_6 = null;
		aClass6_364 = null;
		aClass6_367 = null;
	}
}
