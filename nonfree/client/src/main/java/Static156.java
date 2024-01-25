import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
	public static final int anInt2639 = 52;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIZZIII)V")
	public static void method2286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static143.anInt2346 = arg5;
		Static53.anInt962 = arg1;
		Static312.anInt5418 = arg3;
		Static262.anInt4691 = arg4;
		Static207.anInt6028 = arg0;
		if (arg2 && Static262.anInt4691 >= 100) {
			Static360.anInt6145 = Static207.anInt6028 * 128 + 64;
			Static213.anInt258 = Static312.anInt5418 * 128 + 64;
			Static391.anInt6529 = Static335.method4499(Static265.anInt4807, Static213.anInt258, Static360.anInt6145) - Static143.anInt2346;
		}
		Static333.anInt5693 = 2;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
	public static void method2287() {
		for (@Pc(3) int local3 = 0; local3 < Static383.aClass109ArrayArray1.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static383.aClass109ArrayArray1[local3].length; local7++) {
				Static383.aClass109ArrayArray1[local3][local7] = Static136.aClass109_3;
			}
		}
	}
}
