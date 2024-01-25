import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "F")
	public static float aFloat19;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "[I")
	public static final int[] anIntArray156 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[100];

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIII)V")
	public static void method1985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(10) Class6_Sub4 local10 = (Class6_Sub4) Static231.aClass138_2.method3311(); local10 != null; local10 = (Class6_Sub4) Static231.aClass138_2.method3312()) {
			if (Static253.anInt4787 >= local10.anInt4104) {
				local10.method5914();
			} else {
				Static193.method3090(arg0 >> 1, local10.anInt4102, local10.anInt4103 * 2, (local10.anInt4108 << 7) + 64, arg1 >> 1, (local10.anInt4105 << 7) + 64);
				Static321.aClass59_4.method5774(local10.aString25, local10.anInt4106 | 0xFF000000, 0, Static196.anIntArray248[1] + arg3, Static196.anIntArray248[0] + arg2);
			}
		}
	}
}
