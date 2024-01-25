import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static459 {

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIB)Z")
	public static boolean method6821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static334.method5163(arg1, arg0) || Static89.method1391(arg0, arg1);
	}
}
