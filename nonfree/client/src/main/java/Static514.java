import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static514 {

	@OriginalMember(owner = "client!to", name = "a", descriptor = "[Lclient!ul;")
	public static final Class4_Sub24[] aClass4_Sub24Array6 = new Class4_Sub24[8];

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II)Z")
	public static boolean method7508(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(III)Z")
	public static boolean method7512(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static224.method3664(arg1, arg0) || Static544.method7890(arg1, arg0);
	}
}
