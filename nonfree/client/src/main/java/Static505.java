import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "[I")
	public static final int[] anIntArray447 = new int[14];

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IBIIIII)V")
	public static void method7273(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(15) Class9_Sub7 local15 = (Class9_Sub7) Static482.aClass234_12.method6092(); local15 != null; local15 = (Class9_Sub7) Static482.aClass234_12.method6098()) {
			if (local15.anInt6818 <= Static384.anInt7234) {
				local15.method8408();
			} else {
				Static2.method4207(local15.anInt6819, (local15.anInt6814 << 9) + 256, local15.anInt6820 * 2, (local15.anInt6821 << 9) + 256, arg2 >> 1, arg3 >> 1);
				Static537.aClass34_12.method8602(local15.anInt6815 | 0xFF000000, local15.aString71, arg0 + Static456.anIntArray426[0], 0, arg1 + Static456.anIntArray426[1]);
			}
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)V")
	public static void method7275(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub5_Sub19 local10 = Static348.method5721(arg0, 8);
		local10.method5174();
	}
}
