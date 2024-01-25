import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "[I")
	public static int[] anIntArray310;

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "Lclient!mg;")
	public static Class156 aClass156_28 = new Class156();

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BII)Z")
	public static boolean method2960(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "(I)V")
	public static void method2962(@OriginalArg(0) int arg0) {
		Static154.anInt2668 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static169.anInt2876; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static316.anInt5459; local6++) {
				if (Static309.aClass270ArrayArrayArray3[arg0][local3][local6] == null) {
					Static309.aClass270ArrayArrayArray3[arg0][local3][local6] = new Class270(arg0, local3, local6);
				}
			}
		}
	}
}
