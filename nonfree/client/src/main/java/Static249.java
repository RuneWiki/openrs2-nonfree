import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static249 {

	@OriginalMember(owner = "client!om", name = "b", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_139 = new Class208(22, 2);

	@OriginalMember(owner = "client!om", name = "e", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_173 = new Class62("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!om", name = "f", descriptor = "[I")
	public static final int[] anIntArray396 = new int[2048];

	@OriginalMember(owner = "client!om", name = "l", descriptor = "[S")
	public static short[] aShortArray79 = new short[256];

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V")
	public static void method4332(@OriginalArg(1) int arg0) {
		Static8.anInt492 = -1;
		Static208.anInt4249 = arg0;
		Static8.anInt492 = -1;
		Static335.method5408();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BC)C")
	public static char method4334(@OriginalArg(1) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}
}
