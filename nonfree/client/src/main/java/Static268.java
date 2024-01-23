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

public final class Static268 {

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
	public static int anInt4955 = 20;

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "Lclient!jo;")
	public static Class96 aClass96_26 = new Class96();

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILclient!ha;)V")
	public static void method4135(@OriginalArg(2) Class1_Sub13_Sub1 arg0) {
		while (true) {
			@Pc(16) Class1_Sub17 local16 = (Class1_Sub17) Static45.aClass96_3.method2340();
			if (local16 == null) {
				return;
			}
			@Pc(22) boolean local22 = false;
			@Pc(24) int local24;
			for (local24 = 0; local24 < local16.anInt2670; local24++) {
				if (local16.aClass153Array1[local24] != null) {
					if (local16.aClass153Array1[local24].anInt4614 == 2) {
						local16.anIntArray216[local24] = -5;
					}
					if (local16.aClass153Array1[local24].anInt4614 == 0) {
						local22 = true;
					}
				}
				if (local16.aClass153Array2[local24] != null) {
					if (local16.aClass153Array2[local24].anInt4614 == 2) {
						local16.anIntArray216[local24] = -6;
					}
					if (local16.aClass153Array2[local24].anInt4614 == 0) {
						local22 = true;
					}
				}
			}
			if (local22) {
				return;
			}
			arg0.method1887(175);
			arg0.method1822(0);
			local24 = arg0.anInt2018;
			arg0.method1851(local16.anInt2667);
			for (@Pc(118) int local118 = 0; local118 < local16.anInt2670; local118++) {
				if (local16.anIntArray216[local118] == 0) {
					try {
						@Pc(146) int local146 = local16.anIntArray215[local118];
						@Pc(156) Field local156;
						@Pc(160) int local160;
						if (local146 == 0) {
							local156 = (Field) local16.aClass153Array1[local118].anObject6;
							local160 = local156.getInt(null);
							arg0.method1822(0);
							arg0.method1851(local160);
						} else if (local146 == 1) {
							local156 = (Field) local16.aClass153Array1[local118].anObject6;
							local156.setInt(null, local16.anIntArray214[local118]);
							arg0.method1822(0);
						} else if (local146 == 2) {
							local156 = (Field) local16.aClass153Array1[local118].anObject6;
							local160 = local156.getModifiers();
							arg0.method1822(0);
							arg0.method1851(local160);
						}
						@Pc(225) Method local225;
						if (local146 == 3) {
							local225 = (Method) local16.aClass153Array2[local118].anObject6;
							@Pc(230) byte[][] local230 = local16.aByteArrayArrayArray5[local118];
							@Pc(234) Object[] local234 = new Object[local230.length];
							for (@Pc(236) int local236 = 0; local236 < local230.length; local236++) {
								@Pc(254) ObjectInputStream local254 = new ObjectInputStream(new ByteArrayInputStream(local230[local236]));
								local234[local236] = local254.readObject();
							}
							@Pc(267) Object local267 = local225.invoke(null, local234);
							if (local267 == null) {
								arg0.method1822(0);
							} else if (local267 instanceof Number) {
								arg0.method1822(1);
								arg0.method1857(((Number) local267).longValue());
							} else if (local267 instanceof String) {
								arg0.method1822(2);
								arg0.method1852((String) local267);
							} else {
								arg0.method1822(4);
							}
						} else if (local146 == 4) {
							local225 = (Method) local16.aClass153Array2[local118].anObject6;
							local160 = local225.getModifiers();
							arg0.method1822(0);
							arg0.method1851(local160);
						}
					} catch (@Pc(339) ClassNotFoundException local339) {
						arg0.method1822(-10);
					} catch (@Pc(345) InvalidClassException local345) {
						arg0.method1822(-11);
					} catch (@Pc(351) StreamCorruptedException local351) {
						arg0.method1822(-12);
					} catch (@Pc(357) OptionalDataException local357) {
						arg0.method1822(-13);
					} catch (@Pc(363) IllegalAccessException local363) {
						arg0.method1822(-14);
					} catch (@Pc(369) IllegalArgumentException local369) {
						arg0.method1822(-15);
					} catch (@Pc(375) InvocationTargetException local375) {
						arg0.method1822(-16);
					} catch (@Pc(381) SecurityException local381) {
						arg0.method1822(-17);
					} catch (@Pc(387) IOException local387) {
						arg0.method1822(-18);
					} catch (@Pc(393) NullPointerException local393) {
						arg0.method1822(-19);
					} catch (@Pc(399) Exception local399) {
						arg0.method1822(-20);
					} catch (@Pc(405) Throwable local405) {
						arg0.method1822(-21);
					}
				} else {
					arg0.method1822(local16.anIntArray216[local118]);
				}
			}
			arg0.method1873(local24);
			arg0.method1869(arg0.anInt2018 - local24);
			local16.method4573();
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)I")
	public static int method4137() {
		return Static100.aClass175_44.method4290();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILjava/awt/Component;I)Lclient!pa;")
	public static Class130 method4138(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class130_Sub2");
			@Pc(16) Class130 local16 = (Class130) local6.getDeclaredConstructor().newInstance();
			local16.method4489(arg2, arg0, arg1);
			return local16;
		} catch (@Pc(25) Throwable local25) {
			@Pc(29) Class130_Sub1 local29 = new Class130_Sub1();
			local29.method4489(arg2, arg0, arg1);
			return local29;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4139(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
