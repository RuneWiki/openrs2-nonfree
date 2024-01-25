import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!vq", name = "y", descriptor = "Lclient!mj;")
	public static Class202 aClass202_14;

	@OriginalMember(owner = "client!vq", name = "z", descriptor = "Lclient!pj;")
	public static Class248 aClass248_108;

	@OriginalMember(owner = "client!vq", name = "A", descriptor = "Lclient!oj;")
	public static final Class234 aClass234_48 = new Class234(16);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I[BII)[B")
	public static byte[] method7739(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(10) byte[] local10;
		if (arg2 > 0) {
			local10 = new byte[arg0];
			for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
				local10[local12] = arg1[arg2 + local12];
			}
		} else {
			local10 = arg1;
		}
		@Pc(43) Class61 local43 = new Class61();
		local43.method1144();
		local43.method1141(local10, (long) (arg0 * 8));
		@Pc(57) byte[] local57 = new byte[64];
		local43.method1142(local57);
		return local57;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V")
	public static void method7740(@OriginalArg(1) int arg0) {
		Static441.anInt3925 = arg0;
		Static26.anInt444 = -1;
		Static175.anInt3184 = -1;
		Static563.method7799();
	}
}
