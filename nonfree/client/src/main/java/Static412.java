import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static412 {

	@OriginalMember(owner = "client!ns", name = "n", descriptor = "S")
	public static short aShort57 = 320;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
	public static void method5624() {
		Static574.aClass3_Sub12_Sub3_3.method7561();
		Static653.aClass3_Sub12_Sub3_4 = null;
		Static554.aClass362_126 = null;
		Static634.anInt6735 = 1;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)Z")
	public static boolean method5625(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static278.method4065(arg0, arg1) || Static669.method8386(arg0, arg1);
	}
}
