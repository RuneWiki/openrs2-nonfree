import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!eba", name = "h", descriptor = "Z")
	public static boolean aBoolean172 = false;

	@OriginalMember(owner = "client!eba", name = "o", descriptor = "[Lclient!ki;")
	public static final Class173[] aClass173Array1 = new Class173[100];

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "([BIIIIB)V")
	public static void method1964(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(24) int local24 = arg3 - arg1 >> 2;
		arg2 += arg1;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg3 - arg1 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg0[arg2++] = 1;
				}
			}
			@Pc(33) int local33 = arg2 + 1;
			arg0[arg2] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg0[local33] = 1;
			@Pc(43) int local43 = local38 + 1;
			arg0[local38] = 1;
			arg2 = local43 + 1;
			arg0[local43] = 1;
		}
	}
}
