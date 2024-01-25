import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static402 {

	@OriginalMember(owner = "client!ts", name = "N", descriptor = "I")
	public static int anInt6657;

	@OriginalMember(owner = "client!ts", name = "M", descriptor = "I")
	public static int anInt6656 = -1;

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(IIIII)V")
	public static void method5511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static372.anInt6316 = arg1;
		Static399.anInt2866 = 0;
		Static418.anInt7030 = arg0;
		Static316.anInt5349 = 0;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(CB)Z")
	public static boolean method5512(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
