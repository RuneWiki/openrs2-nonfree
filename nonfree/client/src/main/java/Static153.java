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

public final class Static153 {

	@OriginalMember(owner = "client!sg", name = "O", descriptor = "I")
	public static int anInt3490;

	@OriginalMember(owner = "client!sg", name = "ab", descriptor = "I")
	public static int anInt3499;

	@OriginalMember(owner = "client!sg", name = "Q", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1260 = Static120.method2057(" <col=00ff80>");

	@OriginalMember(owner = "client!sg", name = "R", descriptor = "I")
	public static int anInt3492 = 0;

	@OriginalMember(owner = "client!sg", name = "T", descriptor = "Lclient!ah;")
	public static Class5 aClass5_10 = new Class5(4096);

	@OriginalMember(owner = "client!sg", name = "Z", descriptor = "I")
	public static int anInt3498 = 0;

	@OriginalMember(owner = "client!sg", name = "db", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1261 = Static120.method2057("::fpsoff");

	@OriginalMember(owner = "client!sg", name = "eb", descriptor = "[Z")
	public static boolean[] aBooleanArray16 = new boolean[100];

	@OriginalMember(owner = "client!sg", name = "fb", descriptor = "I")
	public static int anInt3502 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!vb;BLclient!vb;)V")
	public static void method2673(@OriginalArg(0) Class82 arg0, @OriginalArg(2) Class82 arg1) {
		Static42.aClass82_20 = arg0;
		Static171.aClass82_68 = arg1;
		Static157.anInt3571 = Static171.aClass82_68.method2966(3);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZI)Lclient!tg;")
	public static Class81 method2674(@OriginalArg(0) int arg0) {
		return Static92.method1574(true, arg0);
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(B)V")
	public static void method2675() {
		aClass5_10 = null;
		aClass81_1261 = null;
		aClass81_1260 = null;
		aBooleanArray16 = null;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!bg;I)V")
	public static void method2676(@OriginalArg(1) Class1_Sub8_Sub1 arg0) {
		while (true) {
			@Pc(17) Class1_Sub16 local17 = (Class1_Sub16) Static157.aClass30_15.method1115();
			if (local17 == null) {
				return;
			}
			@Pc(22) boolean local22 = false;
			for (@Pc(24) int local24 = 0; local24 < local17.anInt1711; local24++) {
				if (local17.aClass47Array1[local24] != null) {
					if (local17.aClass47Array1[local24].anInt1949 == 2) {
						local17.anIntArray146[local24] = -5;
					}
					if (local17.aClass47Array1[local24].anInt1949 == 0) {
						local22 = true;
					}
				}
				if (local17.aClass47Array2[local24] != null) {
					if (local17.aClass47Array2[local24].anInt1949 == 2) {
						local17.anIntArray146[local24] = -6;
					}
					if (local17.aClass47Array2[local24].anInt1949 == 0) {
						local22 = true;
					}
				}
			}
			if (local22) {
				return;
			}
			arg0.method366(117);
			arg0.method331(0);
			@Pc(102) int local102 = arg0.anInt446;
			arg0.method328(local17.anInt1708);
			for (@Pc(109) int local109 = 0; local109 < local17.anInt1711; local109++) {
				if (local17.anIntArray146[local109] == 0) {
					try {
						@Pc(133) int local133 = local17.anIntArray147[local109];
						@Pc(145) Field local145;
						@Pc(149) int local149;
						if (local133 == 0) {
							local145 = (Field) local17.aClass47Array1[local109].anObject1;
							local149 = local145.getInt(null);
							arg0.method331(0);
							arg0.method328(local149);
						} else if (local133 == 1) {
							local145 = (Field) local17.aClass47Array1[local109].anObject1;
							local145.setInt(null, local17.anIntArray145[local109]);
							arg0.method331(0);
						} else if (local133 == 2) {
							local145 = (Field) local17.aClass47Array1[local109].anObject1;
							local149 = local145.getModifiers();
							arg0.method331(0);
							arg0.method328(local149);
						}
						@Pc(222) Method local222;
						if (local133 == 3) {
							@Pc(240) byte[][] local240 = local17.aByteArrayArrayArray5[local109];
							local222 = (Method) local17.aClass47Array2[local109].anObject1;
							@Pc(251) Object[] local251 = new Object[local240.length];
							for (@Pc(253) int local253 = 0; local253 < local240.length; local253++) {
								@Pc(265) ObjectInputStream local265 = new ObjectInputStream(new ByteArrayInputStream(local240[local253]));
								local251[local253] = local265.readObject();
							}
							@Pc(284) Object local284 = local222.invoke(null, local251);
							if (local284 == null) {
								arg0.method331(0);
							} else if (local284 instanceof Number) {
								arg0.method331(1);
								arg0.method355(((Number) local284).longValue());
							} else if (local284 instanceof Class81) {
								arg0.method331(2);
								arg0.method348((Class81) local284);
							} else {
								arg0.method331(4);
							}
						} else if (local133 == 4) {
							local222 = (Method) local17.aClass47Array2[local109].anObject1;
							local149 = local222.getModifiers();
							arg0.method331(0);
							arg0.method328(local149);
						}
					} catch (@Pc(327) ClassNotFoundException local327) {
						arg0.method331(-10);
					} catch (@Pc(333) InvalidClassException local333) {
						arg0.method331(-11);
					} catch (@Pc(339) StreamCorruptedException local339) {
						arg0.method331(-12);
					} catch (@Pc(345) OptionalDataException local345) {
						arg0.method331(-13);
					} catch (@Pc(351) IllegalAccessException local351) {
						arg0.method331(-14);
					} catch (@Pc(357) IllegalArgumentException local357) {
						arg0.method331(-15);
					} catch (@Pc(363) InvocationTargetException local363) {
						arg0.method331(-16);
					} catch (@Pc(369) SecurityException local369) {
						arg0.method331(-17);
					} catch (@Pc(375) IOException local375) {
						arg0.method331(-18);
					} catch (@Pc(381) NullPointerException local381) {
						arg0.method331(-19);
					} catch (@Pc(387) Exception local387) {
						arg0.method331(-20);
					} catch (@Pc(393) Throwable local393) {
						arg0.method331(-21);
					}
				} else {
					arg0.method331(local17.anIntArray146[local109]);
				}
			}
			arg0.method329(local102);
			arg0.method341(arg0.anInt446 - local102);
			local17.method3134();
		}
	}
}
