import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
	public static int anInt6075;

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "Lclient!bn;")
	public static Class24 aClass24_4;

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
	public static int anInt6076;

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "[Z")
	public static boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_105 = new Class198("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_106 = new Class198("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "[Z")
	public static final boolean[] aBooleanArray21 = new boolean[100];

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
	public static int anInt6077 = 0;

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
	public static int anInt6078 = 0;

	@OriginalMember(owner = "client!sg", name = "x", descriptor = "[I")
	public static final int[] anIntArray429 = new int[25];

	@OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
	public static int anInt6082 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)Lclient!fi;")
	public static Class76 method4859(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class76 local15 = Static213.method2817(arg0);
		if (arg1 == -1) {
			return local15;
		} else if (local15 == null || local15.aClass76Array2 == null || arg1 >= local15.aClass76Array2.length) {
			return null;
		} else {
			return local15.aClass76Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IBI)Z")
	public static boolean method4860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static320.method3942(arg0, arg1) | (arg0 & 0x70000) != 0 || Static16.method268(arg0, arg1);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)Lclient!wl;")
	public static Class2_Sub1_Sub3 method4861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class258 local11 = Static319.aClass258ArrayArrayArray3[arg2][arg0][arg1];
		if (local11 == null) {
			return null;
		}
		@Pc(26) Class2_Sub1_Sub3 local26 = null;
		@Pc(28) int local28 = -1;
		for (@Pc(31) Class122 local31 = local11.aClass122_3; local31 != null; local31 = local31.aClass122_1) {
			@Pc(35) Class2_Sub1 local35 = local31.aClass2_Sub1_1;
			if (local35 instanceof Class2_Sub1_Sub3) {
				@Pc(41) Class2_Sub1_Sub3 local41 = (Class2_Sub1_Sub3) local35;
				@Pc(51) int local51 = (local41.method4913() - 1) * 64 + 60;
				@Pc(59) int local59 = local41.anInt7500 - local51 >> 7;
				@Pc(67) int local67 = local41.anInt7502 - local51 >> 7;
				@Pc(75) int local75 = local41.anInt7500 + local51 >> 7;
				@Pc(83) int local83 = local41.anInt7502 + local51 >> 7;
				if (arg0 >= local59 && local67 <= arg1 && arg0 <= local75 && arg1 <= local83) {
					@Pc(117) int local117 = (local83 + 1 - arg1) * (-arg0 + local75 + 1);
					if (local28 < local117) {
						local28 = local117;
						local26 = local41;
					}
				}
			}
		}
		return local26;
	}
}
