import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray1;

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString32;

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
	public static int anInt1831 = -1;

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_26 = new Class387(51, -1);

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method1635(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(18) int local18 = local6 + 3 & 0xFFFFFFFC;
		@Pc(30) int local30 = local18 / 4 * 3;
		if (local18 - 2 >= local6 || Static651.method9036(arg0.charAt(local18 - 2)) == -1) {
			local30 -= 2;
		} else if (local18 - 1 >= local6 || Static651.method9036(arg0.charAt(local18 - 1)) == -1) {
			local30--;
		}
		@Pc(85) byte[] local85 = new byte[local30];
		Static446.method6637(arg0, local85, 0);
		return local85;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIII)V")
	public static void method1636(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class5_Sub5_Sub6 local14 = Static478.method6972((long) arg1 << 32 | (long) arg2, 19);
		local14.method2687();
		local14.anInt3064 = arg3;
		local14.anInt3058 = arg0;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)Z")
	public static boolean method1638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}
}
