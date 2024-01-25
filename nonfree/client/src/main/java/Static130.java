import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static130 {

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
	public static int anInt2589;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
	public static int anInt2592;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString22 = "";

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Z")
	public static boolean method2281() {
		return Static266.aBoolean369;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([BB)Ljava/lang/String;")
	public static String method2282(@OriginalArg(0) byte[] arg0) {
		return Static522.method7235(0, arg0.length, arg0);
	}
}
