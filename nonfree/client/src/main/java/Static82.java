import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ct", name = "v", descriptor = "Lclient!uu;")
	public static Class343 aClass343_46;

	@OriginalMember(owner = "client!ct", name = "n", descriptor = "Lclient!st;")
	public static final Class314 aClass314_30 = new Class314(59, 1);

	@OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
	public static int anInt1653 = 0;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIII[I)V")
	public static void method1400(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg1--;
		@Pc(16) int local16 = arg2 - 1;
		@Pc(19) int local19 = local16 - 7;
		while (arg1 < local19) {
			@Pc(23) int local23 = arg1 + 1;
			arg3[local23] = arg0;
			@Pc(28) int local28 = local23 + 1;
			arg3[local28] = arg0;
			@Pc(33) int local33 = local28 + 1;
			arg3[local33] = arg0;
			@Pc(38) int local38 = local33 + 1;
			arg3[local38] = arg0;
			@Pc(43) int local43 = local38 + 1;
			arg3[local43] = arg0;
			@Pc(48) int local48 = local43 + 1;
			arg3[local48] = arg0;
			@Pc(53) int local53 = local48 + 1;
			arg3[local53] = arg0;
			arg1 = local53 + 1;
			arg3[arg1] = arg0;
		}
		while (local16 > arg1) {
			arg1++;
			arg3[arg1] = arg0;
		}
	}
}
