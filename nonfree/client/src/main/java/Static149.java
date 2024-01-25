import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_58 = new Class319(62, 8);

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I[BII)[B")
	public static byte[] method2389(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(14) byte[] local14;
		if (arg2 <= 0) {
			local14 = arg1;
		} else {
			local14 = new byte[arg0];
			for (@Pc(21) int local21 = 0; local21 < arg0; local21++) {
				local14[local21] = arg1[local21 + arg2];
			}
		}
		@Pc(43) Class87 local43 = new Class87();
		local43.method2031();
		local43.method2030(local14, (long) (arg0 * 8));
		@Pc(57) byte[] local57 = new byte[64];
		local43.method2027(local57);
		return local57;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B[Ljava/lang/String;[S)V")
	public static void method2390(@OriginalArg(1) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static328.method4970(arg1, arg0, arg0.length - 1, 0);
	}
}
