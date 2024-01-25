import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "F")
	public static float aFloat110;

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "[Lclient!cu;")
	public static final Class57[] aClass57Array22 = new Class57[14];

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)I")
	public static int method3988() {
		return 16;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIB[B)[B")
	public static byte[] method3989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(10) byte[] local10;
		if (arg0 > 0) {
			local10 = new byte[arg1];
			for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
				local10[local12] = arg2[arg0 + local12];
			}
		} else {
			local10 = arg2;
		}
		@Pc(44) Class129 local44 = new Class129();
		local44.method3278();
		local44.method3276((long) (arg1 * 8), local10);
		@Pc(58) byte[] local58 = new byte[64];
		local44.method3280(local58);
		return local58;
	}
}
