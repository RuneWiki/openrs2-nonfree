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

public final class Static125 {

	@OriginalMember(owner = "client!vb", name = "Vb", descriptor = "[I")
	public static int[] anIntArray378;

	@OriginalMember(owner = "client!vb", name = "Wb", descriptor = "[I")
	public static int[] anIntArray379;

	@OriginalMember(owner = "client!vb", name = "R", descriptor = "Lclient!r;")
	public static Class61 aClass61_992 = Static129.method2060("Hidden)2");

	@OriginalMember(owner = "client!vb", name = "X", descriptor = "[[S")
	public static short[][] aShortArrayArray7 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!vb", name = "ac", descriptor = "Lclient!r;")
	private static Class61 aClass61_1004 = Static129.method2060("glow3:");

	@OriginalMember(owner = "client!vb", name = "bb", descriptor = "Lclient!r;")
	public static Class61 aClass61_993 = aClass61_1004;

	@OriginalMember(owner = "client!vb", name = "kb", descriptor = "I")
	public static int anInt3132 = 0;

	@OriginalMember(owner = "client!vb", name = "Pb", descriptor = "Lclient!r;")
	private static Class61 aClass61_1001 = Static129.method2060("Create a free account");

	@OriginalMember(owner = "client!vb", name = "mb", descriptor = "Lclient!r;")
	public static Class61 aClass61_994 = aClass61_1001;

	@OriginalMember(owner = "client!vb", name = "gc", descriptor = "Lclient!r;")
	private static Class61 aClass61_1005 = Static129.method2060("wave2:");

	@OriginalMember(owner = "client!vb", name = "qb", descriptor = "Lclient!r;")
	public static Class61 aClass61_995 = aClass61_1005;

	@OriginalMember(owner = "client!vb", name = "tb", descriptor = "I")
	public static int anInt3138 = 0;

	@OriginalMember(owner = "client!vb", name = "Gb", descriptor = "Lclient!r;")
	private static Class61 aClass61_998 = Static129.method2060("wishes to duel with you)3");

	@OriginalMember(owner = "client!vb", name = "vb", descriptor = "Lclient!r;")
	public static Class61 aClass61_996 = aClass61_998;

	@OriginalMember(owner = "client!vb", name = "Bb", descriptor = "[Lclient!ba;")
	public static Class8[] aClass8Array1 = new Class8[16];

	@OriginalMember(owner = "client!vb", name = "Ib", descriptor = "Lclient!r;")
	public static Class61 aClass61_999 = Static129.method2060(": ");

	@OriginalMember(owner = "client!vb", name = "Lb", descriptor = "Lclient!r;")
	public static Class61 aClass61_1000 = Static129.method2060("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!vb", name = "Sb", descriptor = "Lclient!r;")
	public static Class61 aClass61_1002 = aClass61_1004;

	@OriginalMember(owner = "client!vb", name = "Tb", descriptor = "Lclient!r;")
	public static Class61 aClass61_1003 = aClass61_1005;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!na;II)V")
	public static void method1963(@OriginalArg(0) Class5_Sub14_Sub1 arg0) {
		while (true) {
			@Pc(18) Class5_Sub17 local18 = (Class5_Sub17) Static78.aClass58_40.method1669();
			if (local18 == null) {
				return;
			}
			@Pc(23) boolean local23 = false;
			for (@Pc(25) int local25 = 0; local25 < local18.anInt2418; local25++) {
				if (local18.aClass10Array1[local25] != null) {
					if (local18.aClass10Array1[local25].anInt242 == 2) {
						local18.anIntArray301[local25] = -5;
					}
					if (local18.aClass10Array1[local25].anInt242 == 0) {
						local23 = true;
					}
				}
				if (local18.aClass10Array2[local25] != null) {
					if (local18.aClass10Array2[local25].anInt242 == 2) {
						local18.anIntArray301[local25] = -6;
					}
					if (local18.aClass10Array2[local25].anInt242 == 0) {
						local23 = true;
					}
				}
			}
			if (local23) {
				return;
			}
			arg0.method1489(187);
			arg0.method1440(0);
			@Pc(105) int local105 = arg0.anInt2199;
			arg0.method1451(local18.anInt2421);
			for (@Pc(112) int local112 = 0; local112 < local18.anInt2418; local112++) {
				if (local18.anIntArray301[local112] == 0) {
					try {
						@Pc(138) int local138 = local18.anIntArray303[local112];
						@Pc(155) Field local155;
						@Pc(158) int local158;
						if (local138 == 0) {
							local155 = (Field) local18.aClass10Array1[local112].anObject1;
							local158 = local155.getInt(null);
							arg0.method1440(0);
							arg0.method1451(local158);
						} else if (local138 == 1) {
							local155 = (Field) local18.aClass10Array1[local112].anObject1;
							local155.setInt(null, local18.anIntArray302[local112]);
							arg0.method1440(0);
						} else if (local138 == 2) {
							local155 = (Field) local18.aClass10Array1[local112].anObject1;
							local158 = local155.getModifiers();
							arg0.method1440(0);
							arg0.method1451(local158);
						}
						@Pc(226) Method local226;
						if (local138 == 3) {
							@Pc(244) byte[][] local244 = local18.aByteArrayArrayArray6[local112];
							local226 = (Method) local18.aClass10Array2[local112].anObject1;
							@Pc(255) Object[] local255 = new Object[local244.length];
							for (@Pc(257) int local257 = 0; local257 < local244.length; local257++) {
								@Pc(269) ObjectInputStream local269 = new ObjectInputStream(new ByteArrayInputStream(local244[local257]));
								local255[local257] = local269.readObject();
							}
							@Pc(284) Object local284 = local226.invoke(null, local255);
							if (local284 == null) {
								arg0.method1440(0);
							} else if (local284 instanceof Number) {
								arg0.method1440(1);
								arg0.method1464(((Number) local284).longValue());
							} else if (local284 instanceof Class61) {
								arg0.method1440(2);
								arg0.method1483((Class61) local284);
							} else {
								arg0.method1440(4);
							}
						} else if (local138 == 4) {
							local226 = (Method) local18.aClass10Array2[local112].anObject1;
							local158 = local226.getModifiers();
							arg0.method1440(0);
							arg0.method1451(local158);
						}
					} catch (@Pc(327) ClassNotFoundException local327) {
						arg0.method1440(-10);
					} catch (@Pc(333) InvalidClassException local333) {
						arg0.method1440(-11);
					} catch (@Pc(339) StreamCorruptedException local339) {
						arg0.method1440(-12);
					} catch (@Pc(345) OptionalDataException local345) {
						arg0.method1440(-13);
					} catch (@Pc(351) IllegalAccessException local351) {
						arg0.method1440(-14);
					} catch (@Pc(357) IllegalArgumentException local357) {
						arg0.method1440(-15);
					} catch (@Pc(363) InvocationTargetException local363) {
						arg0.method1440(-16);
					} catch (@Pc(371) SecurityException local371) {
						arg0.method1440(-17);
					} catch (@Pc(379) IOException local379) {
						arg0.method1440(-18);
					} catch (@Pc(385) NullPointerException local385) {
						arg0.method1440(-19);
					} catch (@Pc(391) Exception local391) {
						arg0.method1440(-20);
					} catch (@Pc(397) Throwable local397) {
						arg0.method1440(-21);
					}
				} else {
					arg0.method1440(local18.anIntArray301[local112]);
				}
			}
			arg0.method1441(local105);
			arg0.method1485(arg0.anInt2199 - local105);
			local18.method2189();
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(II)Z")
	public static boolean method1964(@OriginalArg(0) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)V")
	public static void method1965() {
		anIntArray379 = null;
		aClass61_1000 = null;
		aClass61_1003 = null;
		aClass61_1002 = null;
		aShortArrayArray7 = null;
		aClass61_994 = null;
		aClass61_1001 = null;
		anIntArray378 = null;
		aClass61_995 = null;
		aClass61_1005 = null;
		aClass61_996 = null;
		aClass61_998 = null;
		aClass61_993 = null;
		aClass61_1004 = null;
		aClass61_992 = null;
		aClass61_999 = null;
		aClass8Array1 = null;
	}
}
