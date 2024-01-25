import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray2;

	@OriginalMember(owner = "client!wj", name = "p", descriptor = "F")
	public static float aFloat223;

	@OriginalMember(owner = "client!wj", name = "x", descriptor = "I")
	public static int anInt7297;

	@OriginalMember(owner = "client!wj", name = "y", descriptor = "Lclient!ro;")
	public static Class206 aClass206_3;

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_150 = new Class83("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
	public static int anInt7298 = 1;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLclient!fs;Lclient!fs;)I")
	public static int method5632(@OriginalArg(1) Class76 arg0, @OriginalArg(2) Class76 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method2125(Static177.anInt2985)) {
			local5++;
		}
		if (arg1.method2125(Static62.anInt1122)) {
			local5++;
		}
		if (arg1.method2125(Static145.anInt2907)) {
			local5++;
		}
		if (arg0.method2125(Static177.anInt2985)) {
			local5++;
		}
		if (arg0.method2125(Static62.anInt1122)) {
			local5++;
		}
		if (arg0.method2125(Static145.anInt2907)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)Z")
	public static boolean method5641(@OriginalArg(1) int arg0) {
		return arg0 == 48 || arg0 == 47 || arg0 == 1002 || arg0 == 9 || arg0 == 60;
	}
}
