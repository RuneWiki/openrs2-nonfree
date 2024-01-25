import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!tga", name = "o", descriptor = "I")
	public static int anInt9195;

	@OriginalMember(owner = "client!tga", name = "l", descriptor = "I")
	public static int anInt9193 = 0;

	@OriginalMember(owner = "client!tga", name = "n", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_89 = new Class305(80, 8);

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7771(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg5 + arg1;
		@Pc(13) int local13 = arg4 - arg1;
		for (@Pc(15) int local15 = arg5; local15 < local9; local15++) {
			Static197.method3240(arg3, Static16.anIntArrayArray2[local15], arg0, arg6);
		}
		@Pc(37) int local37 = arg3 - arg1;
		@Pc(41) int local41 = arg1 + arg0;
		for (@Pc(43) int local43 = arg4; local43 > local13; local43--) {
			Static197.method3240(arg3, Static16.anIntArrayArray2[local43], arg0, arg6);
		}
		for (@Pc(64) int local64 = local9; local64 <= local13; local64++) {
			@Pc(70) int[] local70 = Static16.anIntArrayArray2[local64];
			Static197.method3240(local41, local70, arg0, arg6);
			Static197.method3240(local37, local70, local41, arg2);
			Static197.method3240(arg3, local70, local37, arg6);
		}
	}
}
