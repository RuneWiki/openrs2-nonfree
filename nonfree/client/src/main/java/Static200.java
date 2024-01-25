import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "Lclient!kf;")
	public static Class134 aClass134_1;

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "Lclient!wa;")
	public static final Class257 aClass257_15 = new Class257(32);

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_135 = new Class137(26, 7);

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "([II[IBLclient!od;I)Lclient!eb;")
	public static Class59_Sub1 method2720(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class128_Sub2 arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg1 * arg4];
		for (@Pc(12) int local12 = 0; local12 < arg4; local12++) {
			@Pc(22) int local22 = local12 * arg1 + arg0[local12];
			for (@Pc(24) int local24 = 0; local24 < arg2[local12]; local24++) {
				local10[local22++] = -1;
			}
		}
		return new Class59_Sub1(arg3, arg1, arg4, local10);
	}
}
