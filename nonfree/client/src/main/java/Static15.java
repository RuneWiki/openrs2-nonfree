import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
	public static int anInt224;

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "[Lclient!lt;")
	public static Class230[] aClass230Array1;

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
	public static int anInt228;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)I")
	public static int method197(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!s;)V")
	public static void method203(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1) {
		Static555.aClass96Array3[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIII)V")
	public static void method206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(12) int local12 = 0; local12 < Static149.anInt3119; local12++) {
			@Pc(18) Rectangle local18 = Class6_Sub24.aRectangleArray2[local12];
			if (local18.x + local18.width > arg2 && local18.x < arg2 + arg1 && local18.height + local18.y > arg3 && local18.y < arg0 + arg3) {
				Static72.aBooleanArray5[local12] = true;
			}
		}
		Static494.method3707(arg3, arg2, arg3 + arg0, arg2 - -arg1);
	}
}
