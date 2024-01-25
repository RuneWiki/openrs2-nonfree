import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static301 {

	@OriginalMember(owner = "client!la", name = "O", descriptor = "Lclient!cn;")
	public static Class59 aClass59_1;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)Z")
	public static boolean method4667(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(IZ)Z")
	public static boolean method4687(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}
}
