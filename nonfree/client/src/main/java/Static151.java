import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!he", name = "q", descriptor = "I")
	public static int anInt2353;

	@OriginalMember(owner = "client!he", name = "o", descriptor = "I")
	public static int anInt2351 = 0;

	@OriginalMember(owner = "client!he", name = "s", descriptor = "Z")
	public static boolean aBoolean244 = false;

	@OriginalMember(owner = "client!he", name = "t", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!he", name = "u", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BIII)I")
	public static int method1902(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
	public static void method1903(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static306.anInt5095 = arg0;
	}
}
