import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static258 {

	@OriginalMember(owner = "client!qn", name = "N", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!qn", name = "R", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_48 = new Class198(4);

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZZ)V")
	public static void method4377(@OriginalArg(1) boolean arg0) {
		if (arg0 != Static8.aBoolean17) {
			Static8.aBoolean17 = arg0;
			Static85.method1380();
		}
	}

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "(I)V")
	public static void method4379() {
		if (Static212.aClass122_2.method4730()) {
			Static16.method393();
			Static212.aClass122_2.method4749(Static295.aCanvas4);
			Static203.method3543();
		} else {
			Static276.method4628(Static352.anInt6827);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BI)I")
	public static int method4380(@OriginalArg(1) int arg0) {
		if (Static76.aClass16_2 != null) {
			Static76.aClass16_2.method392();
			Static76.aClass16_2 = null;
		}
		Static267.anInt5393++;
		if (Static267.anInt5393 > 4) {
			Static267.anInt5393 = 0;
			Static115.anInt2462 = 0;
			return arg0;
		}
		Static115.anInt2462 = 0;
		if (Static147.anInt2909 == Static86.anInt4277) {
			Static147.anInt2909 = Static7.anInt203;
		} else {
			Static147.anInt2909 = Static86.anInt4277;
		}
		return -1;
	}
}
