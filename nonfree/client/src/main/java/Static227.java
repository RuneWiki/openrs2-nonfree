import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!ll", name = "B", descriptor = "I")
	public static int anInt4511;

	@OriginalMember(owner = "client!ll", name = "o", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_62 = new Class212(17, 8);

	@OriginalMember(owner = "client!ll", name = "x", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_63 = new Class212(45, 3);

	@OriginalMember(owner = "client!ll", name = "y", descriptor = "[[I")
	public static final int[][] anIntArrayArray32 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!ll", name = "z", descriptor = "I")
	public static int anInt4510 = 0;

	@OriginalMember(owner = "client!ll", name = "A", descriptor = "[[I")
	public static final int[][] anIntArrayArray33 = new int[128][128];

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIII)V")
	public static void method3863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static171.anInt3372; local7++) {
			@Pc(13) Rectangle local13 = Class267.aRectangleArray2[local7];
			if (arg0 < local13.width + local13.x && arg1 + arg0 > local13.x && arg3 < local13.y + local13.height && local13.y < arg2 + arg3) {
				Static353.aBooleanArray124[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIBII)V")
	public static void method3864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static176.anInt3462 <= arg0 - arg1 && Static418.anInt3023 >= arg0 + arg1 && arg2 - arg1 >= Static162.anInt1715 && arg2 + arg1 <= Static55.anInt1319) {
			Static121.method6136(arg0, arg5, arg1, arg4, arg3, arg2);
		} else {
			Static294.method4497(arg1, arg2, arg5, arg0, arg3, arg4);
		}
	}
}
