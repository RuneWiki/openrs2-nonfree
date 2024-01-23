import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "F")
	public static float aFloat17;

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
	public static int anInt1441;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString91 = "Loaded wordpack";

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
	public static int anInt1438 = 0;

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
	public static int anInt1442 = 0;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)Lclient!k;")
	public static Class69 method1172() {
		try {
			return (Class69) Class.forName("Class69_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
	public static void method1173() {
		@Pc(4) Class24 local4 = Static78.aClass24_1;
		synchronized (Static78.aClass24_1) {
			Static46.anInt1109 = Static137.anInt2297;
			Static18.anInt505++;
			@Pc(15) int local15;
			if (Static299.anInt5939 < 0) {
				for (local15 = 0; local15 < 112; local15++) {
					Static23.aBooleanArray3[local15] = false;
				}
				Static299.anInt5939 = Static302.anInt5998;
			} else {
				while (Static302.anInt5998 != Static299.anInt5939) {
					local15 = Static122.anIntArray270[Static302.anInt5998];
					Static302.anInt5998 = Static302.anInt5998 + 1 & 0x7F;
					if (local15 < 0) {
						Static23.aBooleanArray3[~local15] = false;
					} else {
						Static23.aBooleanArray3[local15] = true;
					}
				}
			}
			Static137.anInt2297 = Static188.anInt4159;
		}
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V")
	public static void method1175() {
		if (Static78.aClass24_1 != null) {
			@Pc(5) Class24 local5 = Static78.aClass24_1;
			synchronized (Static78.aClass24_1) {
				Static78.aClass24_1 = null;
			}
		}
	}
}
