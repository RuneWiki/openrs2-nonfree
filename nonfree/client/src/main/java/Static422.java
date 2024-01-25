import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static422 {

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_100 = new Class27(74, 3);

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "[I")
	public static final int[] anIntArray683 = new int[32];

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "Lclient!s;")
	public static final Class217 aClass217_152 = new Class217(66, -1);

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "Lclient!os;")
	public static final Class182 aClass182_241 = new Class182("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!uv", name = "h", descriptor = "[Lclient!so;")
	public static final Class227[] aClass227Array1 = new Class227[30];

	@OriginalMember(owner = "client!uv", name = "i", descriptor = "[I")
	public static final int[] anIntArray685 = new int[4096];

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIII)V")
	public static void method5552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static177.anInt3658 == 1) {
			Static283.aClass80Array15[Static167.anInt3308 / 100].method5558(Static156.anInt3162 - 8, Static152.anInt3123 + -8);
		}
		if (Static177.anInt3658 == 2) {
			Static283.aClass80Array15[Static167.anInt3308 / 100 + 4].method5558(Static156.anInt3162 - 8, Static152.anInt3123 + -8);
		}
		Static191.method3044();
	}
}
