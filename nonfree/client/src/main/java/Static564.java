import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static564 {

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString140 = "";

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZII)V")
	public static void method7370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class2_Sub2_Sub18 local13 = Static508.method6607(arg0, 9);
		local13.method6227();
		local13.anInt7693 = arg2;
		local13.anInt7701 = arg1;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([II[[BI[B[[B[IB)I")
	public static int method7371(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(9) int local9 = arg0[arg1];
		@Pc(16) int local16 = local9 + arg6[arg1];
		@Pc(20) int local20 = arg0[arg3];
		@Pc(26) int local26 = local20 + arg6[arg3];
		@Pc(28) int local28 = local9;
		if (local9 < local20) {
			local28 = local20;
		}
		@Pc(35) int local35 = local16;
		if (local16 > local26) {
			local35 = local26;
		}
		@Pc(50) int local50 = arg4[arg1] & 0xFF;
		if (local50 > (arg4[arg3] & 0xFF)) {
			local50 = arg4[arg3] & 0xFF;
		}
		@Pc(67) byte[] local67 = arg5[arg1];
		@Pc(71) byte[] local71 = arg2[arg3];
		@Pc(75) int local75 = local28 - local9;
		@Pc(80) int local80 = local28 - local20;
		for (@Pc(82) int local82 = local28; local82 < local35; local82++) {
			@Pc(95) int local95 = local67[local75++] + local71[local80++];
			if (local50 > local95) {
				local50 = local95;
			}
		}
		return -local50;
	}
}
