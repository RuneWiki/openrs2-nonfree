import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static118 {

	@OriginalMember(owner = "client!id", name = "d", descriptor = "Lclient!fh;")
	public static Class58 aClass58_52;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "[I")
	public static int[] anIntArray196;

	@OriginalMember(owner = "client!id", name = "f", descriptor = "[I")
	public static int[] anIntArray197;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray16 = new String[100];

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)I")
	public static int method1849(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BLclient!fh;)V")
	public static void method1851(@OriginalArg(1) Class58 arg0) {
		Static63.aClass58_36 = arg0;
	}
}
