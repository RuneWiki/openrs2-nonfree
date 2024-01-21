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

public final class Static129 {

	@OriginalMember(owner = "client!wa", name = "w", descriptor = "Lclient!ub;")
	public static Class8_Sub1_Sub3_Sub4_Sub1 aClass8_Sub1_Sub3_Sub4_Sub1_4;

	@OriginalMember(owner = "client!wa", name = "z", descriptor = "Lclient!md;")
	public static Class14_Sub1 aClass14_Sub1_19;

	@OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
	public static int anInt3030 = -1;

	@OriginalMember(owner = "client!wa", name = "x", descriptor = "[I")
	public static int[] anIntArray403 = new int[2000];

	@OriginalMember(owner = "client!wa", name = "A", descriptor = "Z")
	public static boolean aBoolean111 = false;

	@OriginalMember(owner = "client!wa", name = "E", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1402 = Static56.method816(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!wa", name = "I", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1403 = Static56.method816("http:)4)4");

	@OriginalMember(owner = "client!wa", name = "M", descriptor = "Lclient!lf;")
	private static Class48 aClass48_57 = new Class48(64);

	@OriginalMember(owner = "client!wa", name = "Q", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1404 = Static56.method816("<col=c0ff00>");

	@OriginalMember(owner = "client!wa", name = "R", descriptor = "I")
	public static int anInt3042 = 0;

	@OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
	public static int anInt3044 = 0;

	@OriginalMember(owner = "client!wa", name = "V", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1405 = Static56.method816("Cabbage");

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!ud;IB)V")
	public static void method1994(@OriginalArg(0) Class8_Sub20_Sub1 arg0) {
		while (true) {
			@Pc(14) Class8_Sub4 local14 = (Class8_Sub4) Static2.aClass49_1.method1107();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt362; local21++) {
				if (local14.aClass10Array2[local21] != null) {
					if (local14.aClass10Array2[local21].anInt295 == 2) {
						local14.anIntArray52[local21] = -5;
					}
					if (local14.aClass10Array2[local21].anInt295 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass10Array1[local21] != null) {
					if (local14.aClass10Array1[local21].anInt295 == 2) {
						local14.anIntArray52[local21] = -6;
					}
					if (local14.aClass10Array1[local21].anInt295 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method1907(232);
			arg0.method1883(0);
			@Pc(97) int local97 = arg0.anInt2853;
			arg0.method1873(local14.anInt365);
			for (@Pc(104) int local104 = 0; local104 < local14.anInt362; local104++) {
				if (local14.anIntArray52[local104] == 0) {
					try {
						@Pc(128) int local128 = local14.anIntArray49[local104];
						@Pc(142) Field local142;
						@Pc(170) int local170;
						if (local128 == 0) {
							local142 = (Field) local14.aClass10Array2[local104].anObject1;
							local170 = local142.getInt(null);
							arg0.method1883(0);
							arg0.method1873(local170);
						} else if (local128 == 1) {
							local142 = (Field) local14.aClass10Array2[local104].anObject1;
							local142.setInt(null, local14.anIntArray50[local104]);
							arg0.method1883(0);
						} else if (local128 == 2) {
							local142 = (Field) local14.aClass10Array2[local104].anObject1;
							local170 = local142.getModifiers();
							arg0.method1883(0);
							arg0.method1873(local170);
						}
						@Pc(216) Method local216;
						if (local128 == 3) {
							local216 = (Method) local14.aClass10Array1[local104].anObject1;
							@Pc(241) byte[][] local241 = local14.aByteArrayArrayArray2[local104];
							@Pc(245) Object[] local245 = new Object[local241.length];
							for (@Pc(247) int local247 = 0; local247 < local241.length; local247++) {
								@Pc(259) ObjectInputStream local259 = new ObjectInputStream(new ByteArrayInputStream(local241[local247]));
								local245[local247] = local259.readObject();
							}
							@Pc(278) Object local278 = local216.invoke(null, local245);
							if (local278 == null) {
								arg0.method1883(0);
							} else if (local278 instanceof Number) {
								arg0.method1883(1);
								arg0.method1879(((Number) local278).longValue());
							} else if (local278 instanceof Class34) {
								arg0.method1883(2);
								arg0.method1865((Class34) local278);
							} else {
								arg0.method1883(4);
							}
						} else if (local128 == 4) {
							local216 = (Method) local14.aClass10Array1[local104].anObject1;
							local170 = local216.getModifiers();
							arg0.method1883(0);
							arg0.method1873(local170);
						}
					} catch (@Pc(321) ClassNotFoundException local321) {
						arg0.method1883(-10);
					} catch (@Pc(327) InvalidClassException local327) {
						arg0.method1883(-11);
					} catch (@Pc(333) StreamCorruptedException local333) {
						arg0.method1883(-12);
					} catch (@Pc(339) OptionalDataException local339) {
						arg0.method1883(-13);
					} catch (@Pc(345) IllegalAccessException local345) {
						arg0.method1883(-14);
					} catch (@Pc(351) IllegalArgumentException local351) {
						arg0.method1883(-15);
					} catch (@Pc(357) InvocationTargetException local357) {
						arg0.method1883(-16);
					} catch (@Pc(363) SecurityException local363) {
						arg0.method1883(-17);
					} catch (@Pc(369) IOException local369) {
						arg0.method1883(-18);
					} catch (@Pc(375) NullPointerException local375) {
						arg0.method1883(-19);
					} catch (@Pc(381) Exception local381) {
						arg0.method1883(-20);
					} catch (@Pc(387) Throwable local387) {
						arg0.method1883(-21);
					}
				} else {
					arg0.method1883(local14.anIntArray52[local104]);
				}
			}
			arg0.method1859(local97);
			arg0.method1893(arg0.anInt2853 - local97);
			local14.method2013();
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)Lclient!ga;")
	public static Class8_Sub1_Sub9 method1996(@OriginalArg(1) int arg0) {
		@Pc(15) Class8_Sub1_Sub9 local15 = (Class8_Sub1_Sub9) aClass48_57.method1100((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static30.aClass14_8.method1156(arg0, 8);
		local15 = new Class8_Sub1_Sub9();
		if (local25 != null) {
			local15.method640(new Class8_Sub20(local25));
		}
		aClass48_57.method1097(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
	public static void method1997() {
		aClass48_57 = null;
		aClass34_1402 = null;
		aClass34_1403 = null;
		aClass8_Sub1_Sub3_Sub4_Sub1_4 = null;
		anIntArray403 = null;
		aClass14_Sub1_19 = null;
		aClass34_1404 = null;
		aClass34_1405 = null;
	}
}
