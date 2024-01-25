import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "[S")
	public static short[] aShortArray112;

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "[I")
	public static int[] anIntArray526;

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString64 = null;

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_116 = new Class117("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V")
	public static void method5456(@OriginalArg(1) int arg0) {
		if (!Static257.method4460(arg0)) {
			return;
		}
		@Pc(16) Class137[] local16 = Static188.aClass137ArrayArray1[arg0];
		for (@Pc(22) int local22 = 0; local22 < local16.length; local22++) {
			@Pc(28) Class137 local28 = local16[local22];
			if (local28 != null) {
				local28.anInt4091 = 0;
				local28.anInt4099 = 0;
				local28.anInt4104 = 1;
			}
		}
	}
}
