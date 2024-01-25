import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "D")
	public static double aDouble2;

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
	public static int anInt4989 = 0;

	@OriginalMember(owner = "client!hn", name = "o", descriptor = "[[B")
	public static final byte[][] aByteArrayArray10 = new byte[50][];

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB[BI)[B")
	public static byte[] method4083(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(17) byte[] local17;
		if (arg0 <= 0) {
			local17 = arg1;
		} else {
			local17 = new byte[arg2];
			for (@Pc(24) int local24 = 0; local24 < arg2; local24++) {
				local17[local24] = arg1[local24 + arg0];
			}
		}
		@Pc(46) Class377 local46 = new Class377();
		local46.method8740();
		local46.method8738(local17, (long) (arg2 * 8));
		@Pc(60) byte[] local60 = new byte[64];
		local46.method8739(local60);
		return local60;
	}
}
