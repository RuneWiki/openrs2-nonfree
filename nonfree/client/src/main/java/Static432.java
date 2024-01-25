import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static432 {

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "[I")
	public static final int[] anIntArray543 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_121 = new Class98(53, 3);

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "Lclient!su;")
	public static final Class298 aClass298_162 = new Class298();

	@OriginalMember(owner = "client!qu", name = "h", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_97 = new Class316(25, 8);

	@OriginalMember(owner = "client!qu", name = "i", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIII)I")
	public static int method6149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static267.aByteArrayArrayArray8[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static267.aByteArrayArrayArray8[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IFFF)F")
	public static float method6150(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return (arg0 - arg2) * arg1 + arg2;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIBIII)V")
	public static void method6151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == arg1) {
			Static472.method6553(arg0, arg4, arg2, arg3);
		} else if (Static529.anInt9806 <= arg0 - arg2 && arg2 + arg0 <= Static205.anInt3906 && Static133.anInt2531 <= arg3 - arg1 && Static52.anInt1226 >= arg1 + arg3) {
			Static371.method6439(arg2, arg4, arg1, arg0, arg3);
		} else {
			Static510.method7006(arg3, arg0, arg1, arg2, arg4);
		}
	}
}
