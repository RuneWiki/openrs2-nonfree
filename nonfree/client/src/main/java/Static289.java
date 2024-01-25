import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static289 {

	@OriginalMember(owner = "client!sg", name = "V", descriptor = "Lclient!pl;")
	public static Class162 aClass162_5;

	@OriginalMember(owner = "client!sg", name = "K", descriptor = "Lclient!il;")
	public static final Class93 aClass93_16 = new Class93(0, 7);

	@OriginalMember(owner = "client!sg", name = "U", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_194 = new Class106("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!sg", name = "X", descriptor = "[[I")
	public static final int[][] anIntArrayArray63 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!sg", name = "Y", descriptor = "I")
	public static int anInt5617 = 0;

	@OriginalMember(owner = "client!sg", name = "Z", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_190 = new Class18(73, 0);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!va;IIIII)V")
	public static void method5103(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub2_Sub6 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static204.method3760(0, arg3, arg0, arg1.anInt6729, arg1.anInt6726, arg2, arg1.aByte79);
	}

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "(I)V")
	public static void method5104() {
		if (Static111.aString17.toLowerCase().indexOf("microsoft") != -1) {
			Static46.anIntArray75[186] = 57;
			Static46.anIntArray75[187] = 27;
			Static46.anIntArray75[222] = 59;
			Static46.anIntArray75[220] = 74;
			Static46.anIntArray75[221] = 43;
			Static46.anIntArray75[219] = 42;
			Static46.anIntArray75[191] = 73;
			Static46.anIntArray75[189] = 26;
			Static46.anIntArray75[192] = 58;
			Static46.anIntArray75[188] = 71;
			Static46.anIntArray75[223] = 28;
			Static46.anIntArray75[190] = 72;
			return;
		}
		Static46.anIntArray75[45] = 26;
		Static46.anIntArray75[44] = 71;
		if (Static111.aMethod2 == null) {
			Static46.anIntArray75[222] = 59;
			Static46.anIntArray75[192] = 58;
		} else {
			Static46.anIntArray75[192] = 28;
			Static46.anIntArray75[222] = 58;
			Static46.anIntArray75[520] = 59;
		}
		Static46.anIntArray75[47] = 73;
		Static46.anIntArray75[59] = 57;
		Static46.anIntArray75[92] = 74;
		Static46.anIntArray75[46] = 72;
		Static46.anIntArray75[61] = 27;
		Static46.anIntArray75[93] = 43;
		Static46.anIntArray75[91] = 42;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)Z")
	public static boolean method5105(@OriginalArg(1) int arg0) {
		if (arg0 == 60 || arg0 == 23 || arg0 == 22 || arg0 == 4 || arg0 == 47) {
			return true;
		} else {
			return arg0 == 12 || arg0 == 1002;
		}
	}
}
