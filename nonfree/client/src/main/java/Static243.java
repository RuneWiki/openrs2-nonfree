import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II)Z")
	public static boolean method6088(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class6_Sub48 local10 = (Class6_Sub48) Static445.aClass275_162.method6366(); local10 != null; local10 = (Class6_Sub48) Static445.aClass275_162.method6364()) {
			if (Static197.method2979(local10.anInt8333) && local10.aLong215 == (long) arg0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BI)Z")
	public static boolean method6089(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}
}
