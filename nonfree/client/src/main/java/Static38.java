import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
	public static int anInt742;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[200];

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
	public static int anInt740 = 104;

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
	public static int anInt741 = 104;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)Lclient!lw;")
	public static Class10_Sub5 method651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class100 local7 = Static309.aClass100ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass10_Sub5_1 == null ? null : local7.aClass10_Sub5_1;
	}
}
