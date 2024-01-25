import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
	public static int anInt9073;

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "[I")
	public static int[] anIntArray667;

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "[Lclient!jd;")
	public static Class20[] aClass20Array13;

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString85 = "";

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_156 = new Class44(3, 11);

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString86 = null;

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "Z")
	public static boolean aBoolean635 = true;

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)J")
	public static synchronized long method7499() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static161.aLong88 > local5) {
			Static136.aLong71 += Static161.aLong88 - local5;
		}
		Static161.aLong88 = local5;
		return Static136.aLong71 + local5;
	}
}
