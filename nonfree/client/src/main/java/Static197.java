import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
	public static int anInt3618;

	@OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
	public static int anInt3622;

	@OriginalMember(owner = "client!lf", name = "L", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_93 = new Class77(20, 2);

	@OriginalMember(owner = "client!lf", name = "O", descriptor = "[Lclient!wj;")
	public static Class141_Sub1[] aClass141_Sub1Array2 = new Class141_Sub1[0];

	@OriginalMember(owner = "client!lf", name = "S", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_125 = new Class221("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!lf", name = "U", descriptor = "[I")
	public static final int[] anIntArray435 = new int[32];

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!mr;III[Z)Z")
	public static boolean method3302(@OriginalArg(0) Class2_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static17.aClass33Array1 != Static345.aClass33Array3) {
			@Pc(11) int local11 = Static39.aClass33Array2[arg1].method4055(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class33 local18 = Static39.aClass33Array2[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method4055(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method4068(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method4059(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(III)V")
	public static void method3303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class251 local9 = Static362.aClass251ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static346.anInt6114 = local9.anInt6718;
			Static292.anInt5166 = local9.anInt6716;
			Static69.anInt1316 = local9.anInt6719;
		}
		Static63.method1165();
	}
}
