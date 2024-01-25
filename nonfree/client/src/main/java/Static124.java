import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "I")
	public static int anInt6631;

	@OriginalMember(owner = "client!ew", name = "e", descriptor = "I")
	public static int anInt6630 = 0;

	@OriginalMember(owner = "client!ew", name = "f", descriptor = "[I")
	public static final int[] anIntArray515 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(B)V")
	public static void method5296() {
		@Pc(20) Class1_Sub11 local20 = Static276.method3885(Static206.aClass70_34, Static481.aClass276_2);
		local20.aClass1_Sub35_Sub2_1.method5776(Static373.anInt6266);
		Static48.method743(local20);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZII)Z")
	public static boolean method5297(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static472.method6449(arg1, arg0) | (arg0 & 0x60000) != 0 || Static330.method4520(arg0, arg1) || Static14.method145(arg1, arg0);
	}
}
