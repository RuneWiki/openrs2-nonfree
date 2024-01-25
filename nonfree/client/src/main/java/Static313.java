import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!ps", name = "M", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!ps", name = "Q", descriptor = "I")
	public static int anInt5549;

	@OriginalMember(owner = "client!ps", name = "L", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_116 = new Class119(3, -1);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BIIII)V")
	public static void method4344(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(9) int local9 = 0; local9 < Static246.anInt4693; local9++) {
			@Pc(14) Rectangle local14 = Class7_Sub5_Sub1.aRectangleArray1[local9];
			if (arg2 < local14.x + local14.width && local14.x < arg0 + arg2 && arg3 < local14.y + local14.height && local14.y < arg1 + arg3) {
				Static55.aBooleanArray8[local9] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "(I)V")
	public static void method4345() {
		Static99.aClass8Array65 = null;
		Static331.aClass8Array209 = null;
		Static387.aClass8Array185 = null;
		Static260.aClass8Array170 = null;
		Static299.aClass59_3 = null;
		Static183.aClass8_14 = null;
		Static271.aClass59_2 = null;
		Static453.aClass8Array211 = null;
		Static37.aClass8Array28 = null;
		Static123.aClass8_9 = null;
		Static391.aClass8Array192 = null;
		Static4.aClass8Array3 = null;
		Static324.aClass8Array212 = null;
		Static161.aClass8Array89 = null;
		Static163.aClass8Array176 = null;
		Static321.aClass59_4 = null;
		Static151.aClass8Array83 = null;
		Static165.aClass8Array91 = null;
	}
}
