import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "I")
	public static int anInt7274;

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_110 = new Class45("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!rca", name = "g", descriptor = "Lclient!sc;")
	public static final Class263 aClass263_5 = new Class263();

	@OriginalMember(owner = "client!rca", name = "h", descriptor = "[I")
	public static final int[] anIntArray701 = new int[14];

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method6539(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(17) int local17 = local6 + 3 & 0xFFFFFFFC;
		@Pc(23) int local23 = local17 / 4 * 3;
		if (local17 - 2 >= local6 || Static480.method7475(arg0.charAt(local17 - 2)) == -1) {
			local23 -= 2;
		} else if (local17 - 1 >= local6 || Static480.method7475(arg0.charAt(local17 - 1)) == -1) {
			local23--;
		}
		@Pc(63) byte[] local63 = new byte[local23];
		Static163.method2924(arg0, local63, 0);
		return local63;
	}
}
