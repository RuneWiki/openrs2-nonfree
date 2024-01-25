import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static103 {

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "Z")
	public static boolean aBoolean181 = true;

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "[Lclient!hi;")
	public static final Class81[] aClass81Array1 = new Class81[50];

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString81 = "Loading title screen - ";

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZI)B")
	public static byte method1922(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
