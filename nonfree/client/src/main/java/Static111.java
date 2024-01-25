import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "D")
	public static double aDouble4;

	@OriginalMember(owner = "client!dp", name = "k", descriptor = "[I")
	public static final int[] anIntArray174 = new int[5];

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I[B)Ljava/lang/String;")
	public static String method1918(@OriginalArg(1) byte[] arg0) {
		return Static541.method8227(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZCLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method1920(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = Static303.method4445(arg1, arg0);
		@Pc(20) String[] local20 = new String[local10 + 1];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10; local26++) {
			@Pc(30) int local30;
			for (local30 = local24; arg1.charAt(local30) != arg0; local30++) {
			}
			local20[local22++] = arg1.substring(local24, local30);
			local24 = local30 + 1;
		}
		local20[local10] = arg1.substring(local24);
		return local20;
	}
}
