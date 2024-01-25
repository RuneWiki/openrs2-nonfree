import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!vj", name = "P", descriptor = "I")
	public static int anInt6692;

	@OriginalMember(owner = "client!vj", name = "Q", descriptor = "I")
	public static int anInt6693;

	@OriginalMember(owner = "client!vj", name = "N", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_213 = new Class157(12, 6);

	@OriginalMember(owner = "client!vj", name = "O", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_157 = new Class140("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIII)V")
	public static void method5602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static309.anInt6122 = arg2;
		Static234.anInt5027 = arg1;
		Static133.anInt2845 = arg3;
		Static87.anInt1642 = arg0;
		Static236.anInt929 = arg4;
		if (Static133.anInt2845 >= 100) {
			@Pc(22) int local22 = Static236.anInt929 * 128 + 64;
			@Pc(28) int local28 = Static87.anInt1642 * 128 + 64;
			@Pc(36) int local36 = Static97.method1899(Static291.anInt5263, local28, local22) - Static234.anInt5027;
			@Pc(41) int local41 = local22 - Static166.anInt3804;
			@Pc(46) int local46 = local36 - Static23.anInt356;
			@Pc(51) int local51 = local28 - Static51.anInt879;
			@Pc(62) int local62 = (int) Math.sqrt((double) (local51 * local51 + local41 * local41));
			Static168.anInt3820 = (int) (Math.atan2((double) local46, (double) local62) * 2607.5945876176133D) & 0x3FFF;
			Static195.anInt4286 = (int) (Math.atan2((double) local41, (double) local51) * -2607.5945876176133D) & 0x3FFF;
			Static234.anInt5031 = 0;
			if (Static168.anInt3820 < 1024) {
				Static168.anInt3820 = 1024;
			}
			if (Static168.anInt3820 > 3072) {
				Static168.anInt3820 = 3072;
			}
		}
		Static135.anInt2910 = 2;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZ)I")
	public static int method5603(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return arg0 & ~local42;
	}
}
