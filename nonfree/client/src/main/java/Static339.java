import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!m", name = "y", descriptor = "I")
	public static int anInt5858;

	@OriginalMember(owner = "client!m", name = "D", descriptor = "Lclient!tea;")
	public static Class91 aClass91_2;

	@OriginalMember(owner = "client!m", name = "L", descriptor = "Lclient!wu;")
	public static Class384 aClass384_84;

	@OriginalMember(owner = "client!m", name = "F", descriptor = "Lclient!u;")
	public static Class5_Sub44 aClass5_Sub44_2 = null;

	@OriginalMember(owner = "client!m", name = "G", descriptor = "I")
	public static int anInt5861 = 0;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIBII)V")
	public static void method5203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 != 8 && arg3 != 16) {
			@Pc(21) Class156 local21 = Static535.aClass156ArrayArrayArray2[arg0][arg2][arg1];
			if (local21 != null) {
				if (arg3 == 1) {
					local21.aShort60 = 0;
				} else if (arg3 == 2) {
					local21.aShort61 = 0;
				}
			}
			Static67.method1109();
			return;
		}
		for (@Pc(45) int local45 = 0; local45 < Static156.anInt2751; local45++) {
			@Pc(51) Class4 local51 = Static232.aClass4Array3[local45];
			if (arg3 == local51.aByte2 && local51.aShort1 == arg2 && arg1 == local51.aShort3 || arg2 == local51.aShort2 && local51.aShort3 == arg1) {
				if (Static156.anInt2751 != local45) {
					Static655.method4106(Static232.aClass4Array3, local45 + 1, Static232.aClass4Array3, local45, Static232.aClass4Array3.length - local45 - 1);
				}
				Static156.anInt2751--;
				return;
			}
		}
	}
}
