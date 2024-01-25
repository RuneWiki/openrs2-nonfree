import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "[Lclient!wo;")
	public static Interface27[] anInterface27Array1;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
	public static final int anInt1560 = 1337;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI[BI)[B")
	public static byte[] method1526(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(17) byte[] local17;
		if (arg2 <= 0) {
			local17 = arg1;
		} else {
			local17 = new byte[arg0];
			for (@Pc(24) int local24 = 0; local24 < arg0; local24++) {
				local17[local24] = arg1[local24 + arg2];
			}
		}
		@Pc(42) Class152 local42 = new Class152();
		local42.method3293();
		local42.method3295((long) (arg0 * 8), local17);
		@Pc(56) byte[] local56 = new byte[64];
		local42.method3290(local56);
		return local56;
	}
}
