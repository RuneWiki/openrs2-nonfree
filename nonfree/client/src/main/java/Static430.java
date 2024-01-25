import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "Lclient!dr;")
	public static Class59 aClass59_1;

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "Lclient!so;")
	public static Class211 aClass211_1;

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
	public static int anInt7326;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "[I")
	public static int[] anIntArray518 = new int[2];

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_272 = new Class184(107, 6);

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "[Z")
	public static final boolean[] aBooleanArray25 = new boolean[200];

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIII)Lclient!vh;")
	public static Class7 method5689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(33) long local33 = (long) arg3 * 986053L ^ (long) arg0 * 475427L ^ (long) arg1 * 67481L ^ (long) arg5 * 97549L ^ (long) arg2 * 32147369L ^ (long) arg4 * 76724863L;
		@Pc(43) Class7 local43 = (Class7) Static287.aClass5_47.method104(local33);
		if (local43 == null) {
			local43 = Static115.aClass75_3.method2597(arg1, arg5, arg0, arg3, arg2, arg4);
			Static287.aClass5_47.method114(local33, local43);
			return local43;
		} else {
			return local43;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([BII)[B")
	public static byte[] method5691(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static464.method5797(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
