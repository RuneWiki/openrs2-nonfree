import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!qd", name = "vb", descriptor = "Lclient!a;")
	private static Class1 aClass1_2330 = Static94.method1596("glow2:");

	@OriginalMember(owner = "client!qd", name = "dc", descriptor = "Lclient!a;")
	public static Class1 aClass1_2334 = aClass1_2330;

	@OriginalMember(owner = "client!qd", name = "sc", descriptor = "Lclient!a;")
	private static Class1 aClass1_2339 = Static94.method1596("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!qd", name = "gc", descriptor = "Lclient!a;")
	public static Class1 aClass1_2335 = aClass1_2339;

	@OriginalMember(owner = "client!qd", name = "kc", descriptor = "Lclient!a;")
	private static Class1 aClass1_2337 = Static94.method1596("Enter name of friend to add to list");

	@OriginalMember(owner = "client!qd", name = "Mc", descriptor = "Lclient!a;")
	private static Class1 aClass1_2341 = Static94.method1596("Choose Option");

	@OriginalMember(owner = "client!qd", name = "qc", descriptor = "Lclient!a;")
	public static Class1 aClass1_2338 = aClass1_2341;

	@OriginalMember(owner = "client!qd", name = "xc", descriptor = "Lclient!a;")
	public static Class1 aClass1_2340 = Static94.method1596("::errortest");

	@OriginalMember(owner = "client!qd", name = "Wc", descriptor = "Lclient!a;")
	public static Class1 aClass1_2343 = Static94.method1596("Fehler beim Laden Ihres Charakter)2Profils");

	@OriginalMember(owner = "client!qd", name = "jd", descriptor = "Lclient!a;")
	public static Class1 aClass1_2344 = Static94.method1596("@cr2@");

	@OriginalMember(owner = "client!qd", name = "ud", descriptor = "Lclient!a;")
	public static Class1 aClass1_2345 = aClass1_2337;

	@OriginalMember(owner = "client!qd", name = "vd", descriptor = "I")
	public static int anInt2224 = 0;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V")
	public static void method1511() {
		@Pc(7) Class55 local7 = Static98.aClass55_1;
		synchronized (Static98.aClass55_1) {
			Static98.anInt2515 = Static87.anInt2289;
			@Pc(15) int local15;
			if (Static44.anInt1506 < 0) {
				for (local15 = 0; local15 < 112; local15++) {
					Static51.aBooleanArray12[local15] = false;
				}
				Static44.anInt1506 = Static106.anInt2663;
			} else {
				while (Static106.anInt2663 != Static44.anInt1506) {
					local15 = Static1.anIntArray1[Static106.anInt2663];
					Static106.anInt2663 = Static106.anInt2663 + 1 & 0x7F;
					if (local15 < 0) {
						Static51.aBooleanArray12[~local15] = false;
					} else {
						Static51.aBooleanArray12[local15] = true;
					}
				}
			}
			Static87.anInt2289 = Static79.anInt2098;
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
	public static void method1512() {
		Static113.aClass11_20.method435();
	}

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "(I)V")
	public static void method1513() {
		aClass1_2343 = null;
		aClass1_2334 = null;
		aClass1_2337 = null;
		aClass1_2341 = null;
		aClass1_2339 = null;
		aClass1_2340 = null;
		aClass1_2344 = null;
		aClass1_2330 = null;
		aClass1_2335 = null;
		aClass1_2345 = null;
		aClass1_2338 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1514(@OriginalArg(0) Component arg0) {
		@Pc(6) Method local6 = Static58.aMethod2;
		if (local6 != null) {
			try {
				local6.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(20) Throwable local20) {
			}
		}
		arg0.addKeyListener(Static98.aClass55_1);
		arg0.addFocusListener(Static98.aClass55_1);
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V")
	public static void method1517() {
		Static94.aClass11_24.method435();
		Static77.aClass11_18.method435();
		Static32.aClass11_10.method435();
		Static82.aClass11_19.method435();
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(IB)Lclient!a;")
	public static Class1 method1520(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static43.method994(arg0);
		} else if (arg0 < 10000000) {
			return Static97.method1655(new Class1[] { Static43.method994(arg0 / 1000), Static79.aClass1_2212 });
		} else {
			return Static97.method1655(new Class1[] { Static43.method994(arg0 / 1000000), Static40.aClass1_1580 });
		}
	}
}
