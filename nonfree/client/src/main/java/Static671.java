import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static671 {

	@OriginalMember(owner = "client!wr", name = "B", descriptor = "Lclient!cr;")
	public static final Class67 aClass67_11 = new Class67();

	@OriginalMember(owner = "client!wr", name = "M", descriptor = "[I")
	public static final int[] anIntArray613 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!wr", name = "Q", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_340 = new Class196(19, -2);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "([BIIIIB)V")
	public static void method8758(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(15) int local15 = arg2 - arg1 >> 2;
		arg3 += arg1;
		while (true) {
			local15--;
			if (local15 < 0) {
				local15 = arg2 - arg1 & 0x3;
				while (true) {
					local15--;
					if (local15 < 0) {
						return;
					}
					arg0[arg3++] = 1;
				}
			}
			@Pc(32) int local32 = arg3 + 1;
			arg0[arg3] = 1;
			@Pc(37) int local37 = local32 + 1;
			arg0[local32] = 1;
			@Pc(42) int local42 = local37 + 1;
			arg0[local37] = 1;
			arg3 = local42 + 1;
			arg0[local42] = 1;
		}
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(Z)V")
	public static void method8761() {
		Static451.aClass265_50.method6568();
		Static493.aClass265_54.method6568();
		Static314.aClass265_31.method6568();
		Static667.aClass265_65.method6568();
	}
}
