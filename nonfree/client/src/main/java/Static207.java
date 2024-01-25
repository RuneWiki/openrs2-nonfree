import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "Lclient!no;")
	public static final Class167 aClass167_4 = new Class167("", 12);

	@OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
	public static int anInt4005 = 0;

	@OriginalMember(owner = "client!ki", name = "v", descriptor = "[I")
	public static final int[] anIntArray262 = new int[14];

	@OriginalMember(owner = "client!ki", name = "w", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_88 = new Class119(48, 0);

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZII)I")
	public static int method3206(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1 & 0x3;
		if (local8 == 0) {
			return arg2;
		} else if (local8 == 1) {
			return arg0;
		} else if (local8 == 2) {
			return 1023 - arg2;
		} else {
			return 1023 - arg0;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(17) int local17 = arg3 + arg6;
		@Pc(21) int local21 = arg2 - arg3;
		for (@Pc(23) int local23 = arg6; local23 < local17; local23++) {
			Static412.method5293(Static262.anIntArrayArray31[local23], arg0, arg1, arg4);
		}
		@Pc(41) int local41 = arg4 - arg3;
		@Pc(45) int local45 = arg3 + arg1;
		for (@Pc(47) int local47 = arg2; local47 > local21; local47--) {
			Static412.method5293(Static262.anIntArrayArray31[local47], arg0, arg1, arg4);
		}
		for (@Pc(67) int local67 = local17; local67 <= local21; local67++) {
			@Pc(73) int[] local73 = Static262.anIntArrayArray31[local67];
			Static412.method5293(local73, arg0, arg1, local45);
			Static412.method5293(local73, arg5, local45, local41);
			Static412.method5293(local73, arg0, local41, arg4);
		}
	}
}
