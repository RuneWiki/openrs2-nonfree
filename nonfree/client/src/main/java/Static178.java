import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!hd", name = "D", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)Z")
	public static boolean method2662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static500.method5191(arg1, arg0) | (arg0 & 0x2000) != 0 | Static453.method6442(arg1, arg0)) & Static454.method6446(arg1, arg0);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([BI)[B")
	public static byte[] method2663(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static551.method3488(arg0, 0, local9, 0, local6);
		return local9;
	}
}
