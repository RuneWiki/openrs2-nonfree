import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!in", name = "a", descriptor = "Lclient!ja;")
	public static Class56 aClass56_1;

	@OriginalMember(owner = "client!in", name = "b", descriptor = "Lclient!nk;")
	public static Class121 aClass121_57;

	@OriginalMember(owner = "client!in", name = "d", descriptor = "I")
	public static int anInt2529;

	@OriginalMember(owner = "client!in", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!in", name = "c", descriptor = "Z")
	public static boolean aBoolean160 = true;

	@OriginalMember(owner = "client!in", name = "e", descriptor = "I")
	public static int anInt2530 = 1;

	@OriginalMember(owner = "client!in", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString143 = "glow1:";

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)Z")
	public static boolean method2169() {
		@Pc(6) Class111 local6 = Static16.aClass111_115;
		synchronized (Static16.aClass111_115) {
			if (Static96.anInt1957 == Static293.anInt5261) {
				return false;
			} else {
				Static142.anInt2853 = Static178.anIntArray288[Static293.anInt5261];
				Static117.aChar3 = Static297.aCharArray5[Static293.anInt5261];
				Static293.anInt5261 = Static293.anInt5261 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(I)Lclient!te;")
	public static Class75 method2171() {
		try {
			return (Class75) Class.forName("Class75_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
