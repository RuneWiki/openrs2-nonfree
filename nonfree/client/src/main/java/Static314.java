import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!mq", name = "h", descriptor = "I")
	public static int anInt4187;

	@OriginalMember(owner = "client!mq", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString43;

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "[I")
	public static final int[] anIntArray289 = new int[5];

	@OriginalMember(owner = "client!mq", name = "g", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_69 = new Class40("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!mq", name = "i", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_106 = new Class150(2, -2);

	@OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
	public static int anInt4188 = 0;

	@OriginalMember(owner = "client!mq", name = "k", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_70 = new Class40("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!mq", name = "l", descriptor = "Lclient!fea;")
	public static final Class99 aClass99_28 = new Class99();

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
	public static String[] method3571(@OriginalArg(0) String[] arg0) {
		@Pc(13) String[] local13 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = local13[local15] + arg0[local15];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)I")
	public static int method3573() {
		return 2;
	}
}
