import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
	public static int anInt2360;

	@OriginalMember(owner = "client!gl", name = "v", descriptor = "[Lclient!fh;")
	public static Class68[] aClass68Array2;

	@OriginalMember(owner = "client!gl", name = "x", descriptor = "Lclient!kr;")
	public static Class46 aClass46_10;

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_82 = new Class157(31, 3);

	@OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
	public static final int anInt2359 = 1;

	@OriginalMember(owner = "client!gl", name = "u", descriptor = "Lclient!ns;")
	public static final Class143 aClass143_6 = new Class143(1, 7);

	@OriginalMember(owner = "client!gl", name = "w", descriptor = "I")
	public static int anInt2361 = 2;

	@OriginalMember(owner = "client!gl", name = "y", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_60 = new Class140("Loading fonts - ", "Lade Schriftsätze - ", "Chargement des polices - ", "Carregando fontes - ");

	@OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
	public static int anInt2362 = 1;

	@OriginalMember(owner = "client!gl", name = "A", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_61 = new Class140("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
	public static int anInt2363 = 0;

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)I")
	public static int method2174() {
		return 16;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([SI)[S")
	public static short[] method2175(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static369.method2578(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZII)I")
	public static int method2176(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}
}
