import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static224 {

	@OriginalMember(owner = "client!li", name = "G", descriptor = "[I")
	public static int[] anIntArray303;

	@OriginalMember(owner = "client!li", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString38 = "";

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BI)I")
	public static int method3458(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static74.method1331(arg0);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III)Z")
	public static boolean method3459(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
