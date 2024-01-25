import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static212 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)Z")
	public static boolean method3350(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static66.method1324(arg1, arg0) & (Static266.method3896(arg1, arg0) | (arg0 & 0x2000) != 0 | Static653.method9075(arg0, arg1));
	}
}
