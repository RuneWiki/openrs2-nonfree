import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "Lclient!daa;")
	public static Class12_Sub8 aClass12_Sub8_3;

	@OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
	public static int anInt4549;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method3820(@OriginalArg(1) String arg0) {
		@Pc(11) int local11 = arg0.length();
		if (local11 == 0) {
			return new byte[0];
		}
		@Pc(25) int local25 = local11 + 3 & 0xFFFFFFFC;
		@Pc(31) int local31 = local25 / 4 * 3;
		if (local25 - 2 >= local11 || Static421.method6533(arg0.charAt(local25 - 2)) == -1) {
			local31 -= 2;
		} else if (local25 - 1 >= local11 || Static421.method6533(arg0.charAt(local25 - 1)) == -1) {
			local31--;
		}
		@Pc(71) byte[] local71 = new byte[local31];
		Static353.method5524(local71, arg0, 0);
		return local71;
	}
}
