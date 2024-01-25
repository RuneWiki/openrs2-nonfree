import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!vs", name = "D", descriptor = "I")
	public static int anInt6328;

	@OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
	public static int anInt6322 = 0;

	@OriginalMember(owner = "client!vs", name = "A", descriptor = "[I")
	public static final int[] anIntArray440 = new int[14];

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIIIIB)V")
	public static void method5245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class6_Sub7 local10 = (Class6_Sub7) Static181.aClass109_5.method2314(); local10 != null; local10 = (Class6_Sub7) Static181.aClass109_5.method2312()) {
			if (local10.anInt7981 <= Static412.anInt575) {
				local10.method7989();
			} else {
				Static213.method3440((local10.anInt7987 << 9) + 256, arg2 >> 1, (local10.anInt7982 << 9) + 256, arg1 >> 1, local10.anInt7985 * 2, local10.anInt7986);
				Static419.aClass29_13.method7118(local10.anInt7984 | 0xFF000000, arg3 + Static318.anIntArray418[0], 0, arg0 + Static318.anIntArray418[1], local10.aString84);
			}
		}
	}
}
