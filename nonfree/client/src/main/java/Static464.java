import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V")
	public static void method4174(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub11 local12 = Static541.method7520(2, arg0);
		local12.method4945();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III[B)[B")
	public static byte[] method4175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(13) byte[] local13;
		if (arg1 > 0) {
			local13 = new byte[arg0];
			for (@Pc(15) int local15 = 0; local15 < arg0; local15++) {
				local13[local15] = arg2[local15 + arg1];
			}
		} else {
			local13 = arg2;
		}
		@Pc(49) Class81 local49 = new Class81();
		local49.method1908();
		local49.method1904(local13, (long) (arg0 * 8));
		@Pc(63) byte[] local63 = new byte[64];
		local49.method1907(local63);
		return local63;
	}
}
