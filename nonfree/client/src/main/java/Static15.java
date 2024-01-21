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

public final class Static15 {

	@OriginalMember(owner = "client!cf", name = "Vc", descriptor = "Lclient!jb;")
	public static Class25 aClass25_2;

	@OriginalMember(owner = "client!cf", name = "fd", descriptor = "[I")
	public static int[] anIntArray74;

	@OriginalMember(owner = "client!cf", name = "Wc", descriptor = "I")
	public static int anInt627 = 0;

	@OriginalMember(owner = "client!cf", name = "Zc", descriptor = "Lclient!qf;")
	private static Class60 aClass60_243 = Static59.method1195("Type");

	@OriginalMember(owner = "client!cf", name = "cd", descriptor = "Lclient!qf;")
	public static Class60 aClass60_244 = Static59.method1195("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!cf", name = "ld", descriptor = "Lclient!qf;")
	public static Class60 aClass60_246 = aClass60_243;

	@OriginalMember(owner = "client!cf", name = "md", descriptor = "Lclient!qf;")
	public static Class60 aClass60_247 = Static59.method1195(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!cf", name = "nd", descriptor = "I")
	public static int anInt636 = 99;

	@OriginalMember(owner = "client!cf", name = "pd", descriptor = "Lclient!qf;")
	public static Class60 aClass60_248 = Static59.method1195("backright2");

	@OriginalMember(owner = "client!cf", name = "td", descriptor = "Lclient!qf;")
	private static Class60 aClass60_249 = Static59.method1195("Loading)3)3)3");

	@OriginalMember(owner = "client!cf", name = "ud", descriptor = "Lclient!qf;")
	public static Class60 aClass60_250 = aClass60_249;

	@OriginalMember(owner = "client!cf", name = "wd", descriptor = "Lclient!qf;")
	public static Class60 aClass60_251 = Static59.method1195("ams");

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)V")
	public static void method432(@OriginalArg(1) int arg0) {
		Static96.anInt2744 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!ra;Z)V")
	public static void method433(@OriginalArg(1) Class3_Sub12_Sub1 arg0) {
		while (true) {
			@Pc(15) Class3_Sub19 local15 = (Class3_Sub19) Static51.aClass5_12.method92();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt2776; local22++) {
				if (local15.aClass7Array1[local22] != null) {
					if (local15.aClass7Array1[local22].anInt148 == 2) {
						local15.anIntArray300[local22] = -5;
					}
					if (local15.aClass7Array1[local22].anInt148 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass7Array2[local22] != null) {
					if (local15.aClass7Array2[local22].anInt148 == 2) {
						local15.anIntArray300[local22] = -6;
					}
					if (local15.aClass7Array2[local22].anInt148 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method1980(67);
			arg0.method1937(0);
			@Pc(99) int local99 = arg0.anInt2886;
			arg0.method1966(local15.anInt2767);
			for (@Pc(106) int local106 = 0; local106 < local15.anInt2776; local106++) {
				if (local15.anIntArray300[local106] == 0) {
					try {
						@Pc(127) int local127 = local15.anIntArray301[local106];
						@Pc(146) Field local146;
						@Pc(149) int local149;
						if (local127 == 0) {
							local146 = (Field) local15.aClass7Array1[local106].anObject1;
							local149 = local146.getInt(null);
							arg0.method1937(0);
							arg0.method1966(local149);
						} else if (local127 == 1) {
							local146 = (Field) local15.aClass7Array1[local106].anObject1;
							local146.setInt(null, local15.anIntArray299[local106]);
							arg0.method1937(0);
						} else if (local127 == 2) {
							local146 = (Field) local15.aClass7Array1[local106].anObject1;
							local149 = local146.getModifiers();
							arg0.method1937(0);
							arg0.method1966(local149);
						}
						@Pc(215) Method local215;
						if (local127 == 3) {
							local215 = (Method) local15.aClass7Array2[local106].anObject1;
							@Pc(240) byte[][] local240 = local15.aByteArrayArrayArray5[local106];
							@Pc(244) Object[] local244 = new Object[local240.length];
							for (@Pc(246) int local246 = 0; local246 < local240.length; local246++) {
								@Pc(258) ObjectInputStream local258 = new ObjectInputStream(new ByteArrayInputStream(local240[local246]));
								local244[local246] = local258.readObject();
							}
							@Pc(277) Object local277 = local215.invoke(null, local244);
							if (local277 == null) {
								arg0.method1937(0);
							} else if (local277 instanceof Number) {
								arg0.method1937(1);
								arg0.method1972(((Number) local277).longValue());
							} else if (local277 instanceof Class60) {
								arg0.method1937(2);
								arg0.method1929((Class60) local277);
							} else {
								arg0.method1937(4);
							}
						} else if (local127 == 4) {
							local215 = (Method) local15.aClass7Array2[local106].anObject1;
							local149 = local215.getModifiers();
							arg0.method1937(0);
							arg0.method1966(local149);
						}
					} catch (@Pc(320) ClassNotFoundException local320) {
						arg0.method1937(-10);
					} catch (@Pc(326) InvalidClassException local326) {
						arg0.method1937(-11);
					} catch (@Pc(332) StreamCorruptedException local332) {
						arg0.method1937(-12);
					} catch (@Pc(338) OptionalDataException local338) {
						arg0.method1937(-13);
					} catch (@Pc(344) IllegalAccessException local344) {
						arg0.method1937(-14);
					} catch (@Pc(350) IllegalArgumentException local350) {
						arg0.method1937(-15);
					} catch (@Pc(356) InvocationTargetException local356) {
						arg0.method1937(-16);
					} catch (@Pc(362) SecurityException local362) {
						arg0.method1937(-17);
					} catch (@Pc(368) IOException local368) {
						arg0.method1937(-18);
					} catch (@Pc(374) NullPointerException local374) {
						arg0.method1937(-19);
					} catch (@Pc(380) Exception local380) {
						arg0.method1937(-20);
					} catch (@Pc(386) Throwable local386) {
						arg0.method1937(-21);
					}
				} else {
					arg0.method1937(local15.anIntArray300[local106]);
				}
			}
			arg0.method1959(local99);
			arg0.method1935(arg0.anInt2886 - local99);
			local15.method2264();
		}
	}

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(B)V")
	public static void method434() {
		aClass60_244 = null;
		aClass60_249 = null;
		aClass60_243 = null;
		aClass60_247 = null;
		aClass60_250 = null;
		anIntArray74 = null;
		aClass60_248 = null;
		aClass60_251 = null;
		aClass25_2 = null;
		aClass60_246 = null;
	}
}
