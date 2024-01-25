import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "Z")
	public static boolean aBoolean503;

	@OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
	public static int anInt6949 = 0;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
	public static void method5385(@OriginalArg(1) int arg0) {
		Static133.anInt2394 = arg0;
		Static92.aClass132_12.method2698();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method5386(@OriginalArg(1) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static415.aStringArray37.length; local7++) {
			if (Static415.aStringArray37[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)Z")
	public static boolean method5387(@OriginalArg(0) int arg0) {
		Static17.aBoolean20 = true;
		Static302.anInt4872 = arg0 + 1 & 0xFFFF;
		return true;
	}
}
