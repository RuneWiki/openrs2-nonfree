import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
	public static int anInt6555;

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_101 = new Class45("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!bp", name = "i", descriptor = "Lclient!vj;")
	public static Class305 aClass305_340 = null;

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_341 = new Class305(48, 6);

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_342 = new Class305(39, -2);

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIIII)V")
	public static void method5906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static187.anInt3872 < arg4 || Static94.anInt2057 > arg1) {
			return;
		}
		@Pc(27) boolean local27;
		if (Static325.anInt6148 > arg3) {
			local27 = false;
			arg3 = Static325.anInt6148;
		} else if (arg3 <= Static119.anInt2469) {
			local27 = true;
		} else {
			local27 = false;
			arg3 = Static119.anInt2469;
		}
		@Pc(51) boolean local51;
		if (Static325.anInt6148 > arg0) {
			arg0 = Static325.anInt6148;
			local51 = false;
		} else if (arg0 <= Static119.anInt2469) {
			local51 = true;
		} else {
			arg0 = Static119.anInt2469;
			local51 = false;
		}
		if (Static94.anInt2057 <= arg4) {
			Static313.method5430(arg0, arg2, Static143.anIntArrayArray33[arg4++], arg3);
		} else {
			arg4 = Static94.anInt2057;
		}
		if (arg1 > Static187.anInt3872) {
			arg1 = Static187.anInt3872;
		} else {
			Static313.method5430(arg0, arg2, Static143.anIntArrayArray33[arg1--], arg3);
		}
		@Pc(103) int local103;
		if (local27 && local51) {
			for (local103 = arg4; local103 <= arg1; local103++) {
				@Pc(151) int[] local151 = Static143.anIntArrayArray33[local103];
				local151[arg3] = local151[arg0] = arg2;
			}
		} else if (local27) {
			for (local103 = arg4; local103 <= arg1; local103++) {
				Static143.anIntArrayArray33[local103][arg3] = arg2;
			}
		} else if (local51) {
			for (local103 = arg4; local103 <= arg1; local103++) {
				Static143.anIntArrayArray33[local103][arg0] = arg2;
			}
		}
	}
}
