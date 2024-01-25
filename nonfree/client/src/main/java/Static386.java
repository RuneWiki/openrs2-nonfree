import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!tj", name = "H", descriptor = "[I")
	public static int[] anIntArray501;

	@OriginalMember(owner = "client!tj", name = "L", descriptor = "J")
	public static long aLong194;

	@OriginalMember(owner = "client!tj", name = "F", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_116 = new Class15("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIZZIII)V")
	public static void method5117(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 <= arg5) {
			return;
		}
		@Pc(10) int local10 = (arg4 + arg5) / 2;
		@Pc(12) int local12 = arg5;
		@Pc(16) Class176_Sub1 local16 = Static360.aClass176_Sub1Array2[local10];
		Static360.aClass176_Sub1Array2[local10] = Static360.aClass176_Sub1Array2[arg4];
		Static360.aClass176_Sub1Array2[arg4] = local16;
		for (@Pc(28) int local28 = arg5; local28 < arg4; local28++) {
			if (Static362.method4776(Static360.aClass176_Sub1Array2[local28], arg0, arg1, local16, arg3, arg2) <= 0) {
				@Pc(48) Class176_Sub1 local48 = Static360.aClass176_Sub1Array2[local28];
				Static360.aClass176_Sub1Array2[local28] = Static360.aClass176_Sub1Array2[local12];
				Static360.aClass176_Sub1Array2[local12++] = local48;
			}
		}
		Static360.aClass176_Sub1Array2[arg4] = Static360.aClass176_Sub1Array2[local12];
		Static360.aClass176_Sub1Array2[local12] = local16;
		method5117(arg0, arg1, arg2, arg3, local12 - 1, arg5);
		method5117(arg0, arg1, arg2, arg3, arg4, local12 + 1);
	}
}
