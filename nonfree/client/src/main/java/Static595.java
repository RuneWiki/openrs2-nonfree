import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!uu", name = "v", descriptor = "I")
	public static int anInt9881;

	@OriginalMember(owner = "client!uu", name = "z", descriptor = "I")
	public static int anInt9885 = -1;

	@OriginalMember(owner = "client!uu", name = "A", descriptor = "I")
	public static int anInt9886 = 0;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(II[BZ)[B")
	public static byte[] method8390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(10) byte[] local10;
		if (arg1 > 0) {
			local10 = new byte[arg0];
			for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
				local10[local12] = arg2[local12 + arg1];
			}
		} else {
			local10 = arg2;
		}
		@Pc(43) Class131 local43 = new Class131();
		local43.method3202();
		local43.method3209((long) (arg0 * 8), local10);
		@Pc(57) byte[] local57 = new byte[64];
		local43.method3204(local57);
		return local57;
	}
}
