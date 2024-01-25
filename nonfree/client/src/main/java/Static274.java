import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!nt", name = "n", descriptor = "[Lclient!vi;")
	public static Class261[] aClass261Array2;

	@OriginalMember(owner = "client!nt", name = "k", descriptor = "Lclient!gw;")
	public static final Class91 aClass91_30 = new Class91();

	@OriginalMember(owner = "client!nt", name = "l", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_161 = new Class214(88, 1);

	@OriginalMember(owner = "client!nt", name = "m", descriptor = "Lclient!ge;")
	public static final Class83 aClass83_32 = new Class83(4);

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "([IILclient!bt;I[II)Lclient!se;")
	public static Class74_Sub2 method4384(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class30_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(10) byte[] local10 = new byte[arg1 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(36) int local36 = local12 * arg3 + arg0[local12];
			for (@Pc(38) int local38 = 0; local38 < arg4[local12]; local38++) {
				local10[local36++] = -1;
			}
		}
		return new Class74_Sub2(arg2, arg3, arg1, local10);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "([BIZILclient!bt;III)Lclient!hf;")
	public static Class62_Sub2_Sub1 method4386(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class30_Sub1 arg2, @OriginalArg(6) int arg3) {
		if (arg2.aBoolean50 || Static39.method809(arg3) && Static39.method809(arg1)) {
			return new Class62_Sub2_Sub1(arg2, 3553, 6406, arg3, arg1, false, arg0, 6406);
		} else if (arg2.aBoolean39) {
			return new Class62_Sub2_Sub1(arg2, 34037, 6406, arg3, arg1, false, arg0, 6406);
		} else {
			return new Class62_Sub2_Sub1(arg2, 6406, arg3, arg1, Static84.method6309(arg3), Static84.method6309(arg1), arg0, 6406);
		}
	}
}
