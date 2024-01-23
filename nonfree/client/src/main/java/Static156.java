import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!ld", name = "bb", descriptor = "I")
	public static int anInt3068;

	@OriginalMember(owner = "client!ld", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString187 = "Loading - please wait.";

	@OriginalMember(owner = "client!ld", name = "Cb", descriptor = "I")
	public static int anInt3086 = 0;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)Lclient!eg;")
	public static Class46 method2501(@OriginalArg(0) int arg0) {
		@Pc(10) Class46 local10 = (Class46) Static263.aClass26_53.method518((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static92.aClass58_44.method1372(Static80.method1397(arg0), Static278.method4336(arg0));
		local10 = new Class46();
		local10.anInt1223 = arg0;
		if (local25 != null) {
			local10.method1016(new Class4_Sub10(local25));
		}
		local10.method1022();
		Static263.aClass26_53.method510(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void method2515(@OriginalArg(0) Class58 arg0) {
		Static107.aClass58_100 = arg0;
	}
}
