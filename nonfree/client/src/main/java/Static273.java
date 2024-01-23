import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "Lclient!th;")
	public static Class168 aClass168_185;

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "B")
	public static byte aByte24 = 0;

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "[I")
	public static int[] anIntArray490 = new int[100];

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIC)I")
	public static int method4134(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		@Pc(3) int local3 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local3 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local3 = 1762;
		}
		return local3;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIII)V")
	public static void method4135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg0 + 1;
		Static98.method3942(arg2, Static121.anIntArrayArray33[arg0], arg1, arg3);
		@Pc(18) int local18 = arg4 - 1;
		Static98.method3942(arg2, Static121.anIntArrayArray33[arg4], arg1, arg3);
		for (@Pc(27) int local27 = local5; local27 <= local18; local27++) {
			@Pc(34) int[] local34 = Static121.anIntArrayArray33[local27];
			local34[arg3] = local34[arg2] = arg1;
		}
	}
}
