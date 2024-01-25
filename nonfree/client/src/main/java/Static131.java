import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static131 {

	@OriginalMember(owner = "client!faa", name = "r", descriptor = "F")
	public static float aFloat67;

	@OriginalMember(owner = "client!faa", name = "s", descriptor = "Lclient!vo;")
	public static Class348 aClass348_30;

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "Lclient!jda;")
	public static final Class162 aClass162_3 = new Class162("", 16);

	@OriginalMember(owner = "client!faa", name = "w", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_40 = new Class90(26, 8);

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIB)Z")
	public static boolean method2389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}
}
