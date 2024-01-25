import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
	public static int anInt9089 = 100;

	@OriginalMember(owner = "client!tb", name = "G", descriptor = "Lclient!ew;")
	public static final Class98 aClass98_45 = new Class98("", 15);

	@OriginalMember(owner = "client!tb", name = "I", descriptor = "Lclient!pl;")
	public static final Class273 aClass273_41 = new Class273(16);

	@OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
	public static int anInt9092 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIII[B)V")
	public static void method7854(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(24) int local24 = arg0 - arg2 >> 2;
		arg1 += arg2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg0 - arg2 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg3[arg1++] = 1;
				}
			}
			@Pc(33) int local33 = arg1 + 1;
			arg3[arg1] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg3[local33] = 1;
			@Pc(43) int local43 = local38 + 1;
			arg3[local38] = 1;
			arg1 = local43 + 1;
			arg3[local43] = 1;
		}
	}
}
