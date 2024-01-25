import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!no", name = "F", descriptor = "F")
	public static float aFloat111;

	@OriginalMember(owner = "client!no", name = "G", descriptor = "Lclient!jp;")
	public static Class129 aClass129_114;

	@OriginalMember(owner = "client!no", name = "P", descriptor = "I")
	public static int anInt4431;

	@OriginalMember(owner = "client!no", name = "A", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_113 = new Class129(9, 12);

	@OriginalMember(owner = "client!no", name = "R", descriptor = "[I")
	public static final int[] anIntArray345 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!no", name = "S", descriptor = "I")
	public static int anInt4433 = 0;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIBII)V")
	public static void method3516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static343.anInt5618; local8++) {
			@Pc(14) Rectangle local14 = Class121.aRectangleArray1[local8];
			if (local14.width + local14.x > arg1 && arg1 + arg0 > local14.x && arg3 < local14.height + local14.y && arg2 + arg3 > local14.y) {
				Static371.aBooleanArray21[local8] = true;
			}
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIBLclient!um;)Lclient!fe;")
	public static Class74 method3518(@OriginalArg(0) int arg0, @OriginalArg(3) Class243 arg1) {
		@Pc(9) byte[] local9 = arg1.method5455(0, arg0);
		return local9 == null ? null : new Class74(local9);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(III)Lclient!es;")
	public static Class2_Sub3 method3519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class258 local7 = Static319.aClass258ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass2_Sub3_2 == null ? null : local7.aClass2_Sub3_2;
	}
}
