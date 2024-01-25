import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!po", name = "v", descriptor = "Lclient!vfa;")
	public static Class329 aClass329_8;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIB)Z")
	public static boolean method5832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static263.method4002(arg0, arg1) | Static424.method5983(arg1, arg0) | Static165.method2642(arg0, arg1)) & Static506.method5540(arg0, arg1);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method5837(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(17) int local17 = local6 + 3 & 0xFFFFFFFC;
		@Pc(23) int local23 = local17 / 4 * 3;
		if (local6 <= local17 - 2 || Static506.method5545(arg0.charAt(local17 - 2)) == -1) {
			local23 -= 2;
		} else if (local6 <= local17 - 1 || Static506.method5545(arg0.charAt(local17 - 1)) == -1) {
			local23--;
		}
		@Pc(68) byte[] local68 = new byte[local23];
		Static271.method4044(local68, arg0, 0);
		return local68;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IZ[S)[S")
	public static short[] method5838(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(14) short[] local14 = new short[arg0];
		Static596.method7722(arg1, 0, local14, 0, arg0);
		return local14;
	}
}
