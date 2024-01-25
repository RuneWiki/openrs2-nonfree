import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static273 {

	@OriginalMember(owner = "client!pn", name = "Z", descriptor = "Lclient!dp;")
	public static Class51 aClass51_13;

	@OriginalMember(owner = "client!pn", name = "db", descriptor = "Lclient!jn;")
	public static Class54 aClass54_1;

	@OriginalMember(owner = "client!pn", name = "D", descriptor = "[[I")
	public static final int[][] anIntArrayArray53 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!pn", name = "W", descriptor = "Lclient!o;")
	public static final Class169 aClass169_257 = new Class169("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!pn", name = "bb", descriptor = "[I")
	public static final int[] anIntArray578 = new int[14];

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(II)V")
	public static void method4214(@OriginalArg(0) int arg0) {
		Static359.anInt6301 = -1;
		Static386.anInt6289 = arg0;
		Static390.anInt6367 = -1;
		Static201.method2874();
	}

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "(II)Lclient!so;")
	public static Class124_Sub1 method4215(@OriginalArg(1) int arg0) {
		return Static148.aBoolean231 && Static208.anInt3626 <= arg0 && Static382.anInt6199 >= arg0 ? Static321.aClass124_Sub1Array2[arg0 - Static208.anInt3626] : null;
	}
}
