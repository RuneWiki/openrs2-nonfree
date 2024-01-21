import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!me", name = "ab", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1217 = Static193.method3027("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!me", name = "jb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1218 = Static193.method3027("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!me", name = "lb", descriptor = "I")
	public static int anInt2541 = 0;

	@OriginalMember(owner = "client!me", name = "ob", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1219 = Static193.method3027("cookieprefix");

	@OriginalMember(owner = "client!me", name = "pb", descriptor = "J")
	public static long aLong76 = 0L;

	@OriginalMember(owner = "client!me", name = "rb", descriptor = "I")
	public static int anInt2544 = 0;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(I)Lclient!a;")
	public static Class1 method1820() {
		try {
			return (Class1) Class.forName("Class1_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(13) Throwable local13) {
			return new Class1_Sub2();
		}
	}

	@OriginalMember(owner = "client!me", name = "g", descriptor = "(B)V")
	public static void method1821() {
		if (Static52.aClass44_1 != null) {
			@Pc(3) Class44 local3 = Static52.aClass44_1;
			synchronized (Static52.aClass44_1) {
				Static52.aClass44_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!fg;ZB)V")
	public static void method1822(@OriginalArg(0) Class33 arg0, @OriginalArg(1) boolean arg1) {
		if (Static167.aClass33_3 != null) {
			try {
				Static167.aClass33_3.method925();
			} catch (@Pc(8) Exception local8) {
			}
			Static167.aClass33_3 = null;
		}
		Static167.aClass33_3 = arg0;
		Static185.method2900(arg1);
		Static33.aClass3_Sub3_Sub3_1 = null;
		Static80.aClass3_Sub4_2 = null;
		anInt2541 = 0;
		Static116.aClass3_Sub4_6.anInt1758 = 0;
		while (true) {
			@Pc(33) Class3_Sub3_Sub3 local33 = (Class3_Sub3_Sub3) Static150.aClass40_11.method1026();
			if (local33 == null) {
				while (true) {
					local33 = (Class3_Sub3_Sub3) Static119.aClass40_6.method1026();
					if (local33 == null) {
						if (Static56.aByte8 != 0) {
							try {
								@Pc(85) Class3_Sub4 local85 = new Class3_Sub4(4);
								local85.method1239(4);
								local85.method1239(Static56.aByte8);
								local85.method1252(0);
								Static167.aClass33_3.method924(4, local85.aByteArray12);
							} catch (@Pc(106) IOException local106) {
								try {
									Static167.aClass33_3.method925();
								} catch (@Pc(111) Exception local111) {
								}
								Static54.anInt1163++;
								Static167.aClass33_3 = null;
							}
						}
						Static29.anInt601 = 0;
						Static83.aLong52 = Static210.method3307();
						return;
					}
					Static11.aClass23_1.method677(local33);
					Static41.aClass40_3.method1027(local33, local33.aLong147);
					Static203.anInt4149--;
					Static45.anInt952++;
				}
			}
			Static151.aClass40_12.method1027(local33, local33.aLong147);
			Static64.anInt1359++;
			Static143.anInt2941--;
		}
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(I)V")
	public static void method1824() {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = -1; local3 < Static80.anInt1607; local3++) {
			if (local3 == -1) {
				local11 = 2047;
			} else {
				local11 = Static76.anIntArray81[local3];
			}
			@Pc(21) Class26_Sub2_Sub1 local21 = Static146.aClass26_Sub2_Sub1Array1[local11];
			if (local21 != null && local21.anInt2632 > 0) {
				local21.anInt2632--;
				if (local21.anInt2632 == 0) {
					local21.aClass70_1235 = null;
				}
			}
		}
		for (local11 = 0; local11 < Static201.anInt4110; local11++) {
			@Pc(61) int local61 = Static80.anIntArray85[local11];
			@Pc(65) Class26_Sub2_Sub2 local65 = Static8.aClass26_Sub2_Sub2Array1[local61];
			if (local65 != null && local65.anInt2632 > 0) {
				local65.anInt2632--;
				if (local65.anInt2632 == 0) {
					local65.aClass70_1235 = null;
				}
			}
		}
	}
}
