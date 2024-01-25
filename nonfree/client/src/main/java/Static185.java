import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
	public static int anInt3178;

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "Lclient!oo;")
	public static Class207 aClass207_13;

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "Lclient!ee;")
	public static Class81 aClass81_5;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[B)Z")
	public static boolean method2652(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class6_Sub23 local13 = new Class6_Sub23(arg0);
		@Pc(17) int local17 = local13.method8374();
		if (local17 != 2) {
			return false;
		}
		@Pc(33) boolean local33 = local13.method8374() == 1;
		if (local33) {
			Static321.method4602(local13);
		}
		Static583.method8068(local13);
		return true;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(CB)Z")
	public static boolean method2654(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
