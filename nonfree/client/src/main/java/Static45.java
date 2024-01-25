import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static45 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!ac;B)Lclient!nga;")
	public static Class62_Sub2 method760(@OriginalArg(0) Class1_Sub3 arg0) {
		return new Class62_Sub2(arg0.method7975(), arg0.method7975(), arg0.method7975(), arg0.method7975(), arg0.method7919(), arg0.method7919(), arg0.method7974());
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Z")
	public static boolean method761(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}
}
