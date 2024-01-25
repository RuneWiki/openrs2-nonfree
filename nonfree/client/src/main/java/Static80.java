import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static80 {

	@OriginalMember(owner = "client!db", name = "l", descriptor = "Lclient!oj;")
	public static Class243 aClass243_2;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "I")
	public static int anInt1738 = 100;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIZ)Z")
	public static boolean method1266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method1272() {
		return Static167.aBoolean291 || Static542.aClass2_Sub5_3 == null ? "" : Static542.aClass2_Sub5_3.aString7;
	}
}
