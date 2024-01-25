import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!lp", name = "O", descriptor = "D")
	public static double aDouble17;

	@OriginalMember(owner = "client!lp", name = "fb", descriptor = "I")
	public static int anInt5973;

	@OriginalMember(owner = "client!lp", name = "zb", descriptor = "[Lclient!hh;")
	public static Class6[] aClass6Array9;

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "[I")
	public static final int[] anIntArray321 = new int[14];

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIII)V")
	public static void method5049(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class382 local14 = Static26.aClass382ArrayArray1[arg0][arg1];
		Static32.method675(arg2, local14 == null ? Static89.aClass382_1 : local14);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)Z")
	public static boolean method5050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x20) != 0;
	}
}
