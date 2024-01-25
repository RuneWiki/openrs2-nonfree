import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!vba", name = "J", descriptor = "Z")
	public static boolean aBoolean637 = true;

	@OriginalMember(owner = "client!vba", name = "L", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_177 = new Class239(37, -1);

	@OriginalMember(owner = "client!vba", name = "Q", descriptor = "Z")
	public static boolean aBoolean638 = false;

	@OriginalMember(owner = "client!vba", name = "S", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_89 = new Class243(40, 7);

	@OriginalMember(owner = "client!vba", name = "T", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_178 = new Class239(19, 12);

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(ILjava/lang/Object;II)[B")
	public static byte[] method7394(@OriginalArg(1) Object arg0, @OriginalArg(3) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return Static435.method6664(local13, arg1);
		} else if (arg0 instanceof Class38) {
			@Pc(25) Class38 local25 = (Class38) arg0;
			return local25.method1196(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(III[BII)V")
	public static void method7396(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		arg0 += arg1;
		@Pc(20) int local20 = arg3 - arg1 >> 2;
		while (true) {
			local20--;
			if (local20 < 0) {
				local20 = arg3 - arg1 & 0x3;
				while (true) {
					local20--;
					if (local20 < 0) {
						return;
					}
					arg2[arg0++] = 1;
				}
			}
			@Pc(33) int local33 = arg0 + 1;
			arg2[arg0] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg2[local33] = 1;
			@Pc(43) int local43 = local38 + 1;
			arg2[local38] = 1;
			arg0 = local43 + 1;
			arg2[local43] = 1;
		}
	}
}
