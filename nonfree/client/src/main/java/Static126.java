import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static126 {

	@OriginalMember(owner = "client!fw", name = "l", descriptor = "I")
	public static int anInt2092 = 0;

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(III)Z")
	public static boolean method1971(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(BI)Z")
	public static boolean method1972(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
	}
}
