import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!kp", name = "P", descriptor = "Lclient!tj;")
	public static Class193 aClass193_62;

	@OriginalMember(owner = "client!kp", name = "M", descriptor = "I")
	public static int anInt3660 = 10;

	@OriginalMember(owner = "client!kp", name = "O", descriptor = "[I")
	public static final int[] anIntArray313 = new int[5];

	@OriginalMember(owner = "client!kp", name = "Q", descriptor = "I")
	public static int anInt3662 = 0;

	@OriginalMember(owner = "client!kp", name = "W", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_132 = new Class198(128);

	@OriginalMember(owner = "client!kp", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString34 = null;

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(Z)Z")
	public static boolean method3322() {
		try {
			if (Static261.anInt5280 == 2) {
				if (Static209.aClass4_Sub43_2 == null) {
					Static209.aClass4_Sub43_2 = Static369.method5290(Static317.aClass193_100, Static235.anInt4754, Static23.anInt458);
					if (Static209.aClass4_Sub43_2 == null) {
						return false;
					}
				}
				if (Static342.aClass96_1 == null) {
					Static342.aClass96_1 = new Class96(Static158.aClass193_59, Static243.aClass193_97);
				}
				if (Static229.aClass4_Sub1_Sub4_3.method3818(Static193.aClass193_74, Static209.aClass4_Sub43_2, Static342.aClass96_1)) {
					Static229.aClass4_Sub1_Sub4_3.method3810();
					Static229.aClass4_Sub1_Sub4_3.method3794(Static16.anInt334);
					Static229.aClass4_Sub1_Sub4_3.method3799(Static209.aClass4_Sub43_2, Static51.aBoolean100);
					Static317.aClass193_100 = null;
					Static261.anInt5280 = 0;
					Static342.aClass96_1 = null;
					Static209.aClass4_Sub43_2 = null;
					return true;
				}
			}
		} catch (@Pc(64) Exception local64) {
			local64.printStackTrace();
			Static229.aClass4_Sub1_Sub4_3.method3797();
			Static317.aClass193_100 = null;
			Static342.aClass96_1 = null;
			Static209.aClass4_Sub43_2 = null;
			Static261.anInt5280 = 0;
		}
		return false;
	}
}
