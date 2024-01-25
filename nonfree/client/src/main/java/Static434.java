import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "F")
	public static float aFloat189;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
	public static int anInt6966;

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
	public static int anInt6972;

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
	public static int anInt6974;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_97 = new Class154(23, 4);

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_98 = new Class154(83, 4);

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
	public static int anInt6970 = -1;

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString105 = null;

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
	public static int anInt6973 = 0;

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
	public static int anInt6975 = 0;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[SB)[S")
	public static short[] method5701(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static598.method4264(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BIIII)V")
	public static void method5702(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static585.anInt9495 = arg0;
		Static307.anInt5082 = arg1;
		Static410.anInt6680 = arg2;
		Static226.anInt3311 = arg3;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)[Lclient!nb;")
	public static Class232[] method5704() {
		return new Class232[] { Static340.aClass232_14, Static225.aClass232_9, Static580.aClass232_20, Static295.aClass232_12, Static560.aClass232_19, Static140.aClass232_11 };
	}
}
