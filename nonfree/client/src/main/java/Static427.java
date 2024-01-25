import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static427 {

	@OriginalMember(owner = "client!qk", name = "I", descriptor = "I")
	public static int anInt7433;

	@OriginalMember(owner = "client!qk", name = "J", descriptor = "I")
	public static int anInt7434;

	@OriginalMember(owner = "client!qk", name = "z", descriptor = "Lclient!lh;")
	public static final Class194 aClass194_3 = new Class194("WTQA", 2);

	@OriginalMember(owner = "client!qk", name = "K", descriptor = "Lclient!ws;")
	public static final Class361 aClass361_54 = new Class361();

	@OriginalMember(owner = "client!qk", name = "L", descriptor = "[[I")
	public static final int[][] anIntArrayArray65 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!rr;I)Ljava/lang/String;")
	public static String method6151(@OriginalArg(1) Class292 arg0, @OriginalArg(2) int arg1) {
		if (!Static67.method1354(arg0).method244(arg1) && arg0.anObjectArray6 == null) {
			return null;
		} else if (arg0.aStringArray35 == null || arg1 >= arg0.aStringArray35.length || arg0.aStringArray35[arg1] == null || arg0.aStringArray35[arg1].trim().length() == 0) {
			return Static226.aBoolean321 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray35[arg1];
		}
	}
}
