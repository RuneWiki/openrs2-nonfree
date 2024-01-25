import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
	public static int anInt7320 = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBIII[B)V")
	public static void method5934(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(19) int local19 = arg0 - arg2 >> 2;
		arg1 += arg2;
		while (true) {
			local19--;
			if (local19 < 0) {
				local19 = arg0 - arg2 & 0x3;
				while (true) {
					local19--;
					if (local19 < 0) {
						return;
					}
					arg3[arg1++] = 1;
				}
			}
			@Pc(28) int local28 = arg1 + 1;
			arg3[arg1] = 1;
			@Pc(33) int local33 = local28 + 1;
			arg3[local28] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg3[local33] = 1;
			arg1 = local38 + 1;
			arg3[local38] = 1;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)V")
	public static void method5935(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub2_Sub18 local8 = Static508.method6607(arg0, 6);
		local8.method6229();
	}
}
