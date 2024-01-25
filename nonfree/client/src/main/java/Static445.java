import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "J")
	public static long aLong216;

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_114 = new Class231("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BI)V")
	public static void method5943(@OriginalArg(1) int arg0) {
		Static187.anInt3261 = arg0;
		Static340.anInt5720 = -1;
		Static212.anInt3671 = -1;
		Static380.method5244();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZI)V")
	public static void method5944(@OriginalArg(1) int arg0) {
		for (@Pc(9) Class6 local9 = Static345.aClass137_29.method3181(); local9 != null; local9 = Static345.aClass137_29.method3182()) {
			if ((long) arg0 == (local9.aLong217 >> 48 & 0xFFFFL)) {
				local9.method5977();
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIII)V")
	public static void method5945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class6_Sub1_Sub12 local8 = Static449.method5975(arg1, 8);
		local8.method3043();
		local8.anInt3400 = arg0;
		local8.anInt3397 = arg2;
		local8.anInt3403 = arg3;
	}
}
