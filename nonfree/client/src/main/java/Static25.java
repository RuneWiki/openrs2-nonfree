import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "[I")
	public static int[] anIntArray103;

	@OriginalMember(owner = "client!bk", name = "q", descriptor = "Lclient!jj;")
	public static Class98 aClass98_4;

	@OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
	public static int anInt1346;

	@OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
	public static int anInt1347;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
	public static final int anInt1335 = 52;

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_21 = new Class93("Loading fonts - ", "Lade Schriftsätze - ", "Chargement des polices - ", "Carregando fontes - ");

	@OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
	public static int anInt1343 = 0;

	@OriginalMember(owner = "client!bk", name = "t", descriptor = "Z")
	public static boolean aBoolean123 = true;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)V")
	public static void method1410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub11_Sub19 local8 = Static306.method5411(13, arg1);
		local8.method5537();
		local8.anInt6362 = arg0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIII)Z")
	public static boolean method1418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Interface9 local9 = (Interface9) Static230.method4018(arg0, arg2, arg1);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static207.method5572(local9) & true;
		}
		local9 = (Interface9) Static280.method5066(arg0, arg2, arg1, vl.class);
		if (local9 != null) {
			local11 &= Static207.method5572(local9);
		}
		local9 = (Interface9) Static104.method4927(arg0, arg2, arg1);
		if (local9 != null) {
			local11 &= Static207.method5572(local9);
		}
		return local11;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ID)V")
	public static void method1439(@OriginalArg(1) double arg0) {
		if (arg0 == Static159.aDouble9) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static104.anIntArray409[local11] = local23 > 255 ? 255 : local23;
		}
		Static159.aDouble9 = arg0;
	}
}
