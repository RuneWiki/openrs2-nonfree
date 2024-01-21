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

public final class Static79 {

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "Lclient!fd;")
	public static Class7_Sub1 aClass7_Sub1_11;

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "Lclient!ah;")
	public static Class7 aClass7_38;

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "Lclient!eh;")
	public static Class28 aClass28_732 = Static170.method3101("p11_full");

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
	public static int anInt2335 = 0;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!ib;B)V")
	public static void method1831(@OriginalArg(1) Class3_Sub8_Sub1 arg0) {
		while (true) {
			@Pc(16) Class3_Sub11 local16 = (Class3_Sub11) Static42.aClass23_7.method858();
			if (local16 == null) {
				return;
			}
			@Pc(21) boolean local21 = false;
			for (@Pc(23) int local23 = 0; local23 < local16.anInt2132; local23++) {
				if (local16.aClass61Array2[local23] != null) {
					if (local16.aClass61Array2[local23].anInt2845 == 2) {
						local16.anIntArray351[local23] = -5;
					}
					if (local16.aClass61Array2[local23].anInt2845 == 0) {
						local21 = true;
					}
				}
				if (local16.aClass61Array1[local23] != null) {
					if (local16.aClass61Array1[local23].anInt2845 == 2) {
						local16.anIntArray351[local23] = -6;
					}
					if (local16.aClass61Array1[local23].anInt2845 == 0) {
						local21 = true;
					}
				}
			}
			if (local21) {
				return;
			}
			arg0.method1559(148);
			arg0.method1550(0);
			@Pc(98) int local98 = arg0.anInt1948;
			arg0.method1547(local16.anInt2127);
			for (@Pc(105) int local105 = 0; local105 < local16.anInt2132; local105++) {
				if (local16.anIntArray351[local105] == 0) {
					try {
						@Pc(127) int local127 = local16.anIntArray350[local105];
						@Pc(136) Field local136;
						@Pc(140) int local140;
						if (local127 == 0) {
							local136 = (Field) local16.aClass61Array2[local105].anObject4;
							local140 = local136.getInt(null);
							arg0.method1550(0);
							arg0.method1547(local140);
						} else if (local127 == 1) {
							local136 = (Field) local16.aClass61Array2[local105].anObject4;
							local136.setInt(null, local16.anIntArray352[local105]);
							arg0.method1550(0);
						} else if (local127 == 2) {
							local136 = (Field) local16.aClass61Array2[local105].anObject4;
							local140 = local136.getModifiers();
							arg0.method1550(0);
							arg0.method1547(local140);
						}
						@Pc(211) Method local211;
						if (local127 == 3) {
							@Pc(228) byte[][] local228 = local16.aByteArrayArrayArray17[local105];
							local211 = (Method) local16.aClass61Array1[local105].anObject4;
							@Pc(239) Object[] local239 = new Object[local228.length];
							for (@Pc(241) int local241 = 0; local241 < local228.length; local241++) {
								@Pc(252) ObjectInputStream local252 = new ObjectInputStream(new ByteArrayInputStream(local228[local241]));
								local239[local241] = local252.readObject();
							}
							@Pc(271) Object local271 = local211.invoke(null, local239);
							if (local271 == null) {
								arg0.method1550(0);
							} else if (local271 instanceof Number) {
								arg0.method1550(1);
								arg0.method1541(((Number) local271).longValue());
							} else if (local271 instanceof Class28) {
								arg0.method1550(2);
								arg0.method1538((Class28) local271);
							} else {
								arg0.method1550(4);
							}
						} else if (local127 == 4) {
							local211 = (Method) local16.aClass61Array1[local105].anObject4;
							local140 = local211.getModifiers();
							arg0.method1550(0);
							arg0.method1547(local140);
						}
					} catch (@Pc(311) ClassNotFoundException local311) {
						arg0.method1550(-10);
					} catch (@Pc(317) InvalidClassException local317) {
						arg0.method1550(-11);
					} catch (@Pc(323) StreamCorruptedException local323) {
						arg0.method1550(-12);
					} catch (@Pc(329) OptionalDataException local329) {
						arg0.method1550(-13);
					} catch (@Pc(335) IllegalAccessException local335) {
						arg0.method1550(-14);
					} catch (@Pc(341) IllegalArgumentException local341) {
						arg0.method1550(-15);
					} catch (@Pc(347) InvocationTargetException local347) {
						arg0.method1550(-16);
					} catch (@Pc(353) SecurityException local353) {
						arg0.method1550(-17);
					} catch (@Pc(359) IOException local359) {
						arg0.method1550(-18);
					} catch (@Pc(365) NullPointerException local365) {
						arg0.method1550(-19);
					} catch (@Pc(371) Exception local371) {
						arg0.method1550(-20);
					} catch (@Pc(377) Throwable local377) {
						arg0.method1550(-21);
					}
				} else {
					arg0.method1550(local16.anIntArray351[local105]);
				}
			}
			arg0.method1548(local98);
			arg0.method1522(arg0.anInt1948 - local98);
			local16.method3167();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public static void method1832() {
		aClass7_Sub1_11 = null;
		aClass28_732 = null;
		aClass7_38 = null;
	}
}
