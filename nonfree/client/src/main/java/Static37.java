import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static37 {

	@OriginalMember(owner = "client!bea", name = "o", descriptor = "I")
	public static int anInt990;

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "[I")
	public static final int[] anIntArray75 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_22 = new Class44(123, 6);

	@OriginalMember(owner = "client!bea", name = "e", descriptor = "I")
	public static int anInt981 = 0;

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IZ)V")
	public static void method841(@OriginalArg(1) boolean arg0) {
		if (Static76.aString15.length() == 0) {
			return;
		}
		Static466.method6830("--> " + Static76.aString15);
		Static507.method7426(Static76.aString15, arg0, false);
		Static166.anInt3247 = 0;
		Static76.aString15 = "";
		Static283.anInt4865 = 0;
	}
}
