import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static391 {

	@OriginalMember(owner = "client!ns", name = "nb", descriptor = "I")
	public static int anInt6747;

	@OriginalMember(owner = "client!ns", name = "fb", descriptor = "Lclient!av;")
	public static final Class25 aClass25_3 = new Class25(true);

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(CI)Z")
	public static boolean method5796(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
