import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static41 {

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
	public static int anInt1019;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!pl;I)V")
	public static void method699(@OriginalArg(0) Class259 arg0) {
		Static282.aClass259_85 = arg0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)Z")
	public static boolean method700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static176.method3014(arg1, arg0) & (Static64.method1032(arg0, arg1) | (arg1 & 0x2000) != 0 | Static58.method949(arg0, arg1));
	}
}
