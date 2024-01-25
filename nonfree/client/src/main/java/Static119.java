import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static119 {

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "F")
	public static float aFloat43;

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
	public static int anInt2409;

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "Lclient!gh;")
	public static Class89 aClass89_6 = null;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BII)Z")
	public static boolean method2055(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method2056(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}
}
