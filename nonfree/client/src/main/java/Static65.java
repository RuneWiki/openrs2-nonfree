import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
	public static int anInt1178;

	@OriginalMember(owner = "client!cw", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[5];

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IBI)Z")
	public static boolean method1080(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(20) Class126 local20 = Static342.aClass237_4.method5212(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local20.method3017(arg0);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "([BI)Z")
	public static boolean method1084(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class10_Sub8 local8 = new Class10_Sub8(arg0);
		@Pc(12) int local12 = local8.method2502();
		if (local12 != 2) {
			return false;
		}
		@Pc(28) boolean local28 = local8.method2502() == 1;
		if (local28) {
			Static238.method3477(local8);
		}
		Static209.method3243(local8);
		return true;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method1085(@OriginalArg(1) String arg0) {
		@Pc(9) String local9 = Static178.method2950(Static269.method3820(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}
}
