import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static496 {

	@OriginalMember(owner = "client!un", name = "y", descriptor = "Lclient!cu;")
	public static Class60 aClass60_3;

	@OriginalMember(owner = "client!un", name = "u", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_103 = new Class45(45, -1);

	@OriginalMember(owner = "client!un", name = "x", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray42 = new String[100];

	@OriginalMember(owner = "client!un", name = "A", descriptor = "[I")
	public static final int[] anIntArray465 = new int[2048];

	@OriginalMember(owner = "client!un", name = "B", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_194 = new Class88("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)I")
	public static int method5621(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(CI)Z")
	public static boolean method5624(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
