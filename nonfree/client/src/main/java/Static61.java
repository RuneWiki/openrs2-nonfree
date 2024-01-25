import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cea", name = "g", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!cea", name = "j", descriptor = "I")
	public static int anInt1627 = 100;

	@OriginalMember(owner = "client!cea", name = "n", descriptor = "I")
	public static int anInt1631 = -1;

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	public static byte[] method1377(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(25) int local25 = local6 + 3 & 0xFFFFFFFC;
		@Pc(31) int local31 = local25 / 4 * 3;
		if (local25 - 2 >= local6 || Static223.method3625(arg0.charAt(local25 - 2)) == -1) {
			local31 -= 2;
		} else if (local6 <= local25 - 1 || Static223.method3625(arg0.charAt(local25 - 1)) == -1) {
			local31--;
		}
		@Pc(71) byte[] local71 = new byte[local31];
		Static47.method1134(local71, arg0, 0);
		return local71;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZI)V")
	public static void method1378(@OriginalArg(1) int arg0) {
		@Pc(15) Class4_Sub6_Sub5 local15 = Static396.method6079(arg0, 10);
		local15.method2302();
	}
}
