import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static40 {

	@OriginalMember(owner = "client!br", name = "A", descriptor = "I")
	public static int anInt698;

	@OriginalMember(owner = "client!br", name = "s", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_29 = new Class103(70, 2);

	@OriginalMember(owner = "client!br", name = "M", descriptor = "I")
	public static int anInt703 = 0;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BF)F")
	public static float method580(@OriginalArg(1) float arg0) {
		return arg0 * arg0 * arg0 * (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BI)Z")
	public static boolean method585(@OriginalArg(1) int arg0) {
		return arg0 == 6 || arg0 == 7 || arg0 == 8;
	}
}
