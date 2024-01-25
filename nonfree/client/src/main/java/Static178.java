import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
	public static int anInt3432;

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "Lclient!wv;")
	public static final Class269 aClass269_5 = new Class269("WTRC", 1);

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
	public static int anInt3434 = 1;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BIIII[BI)Z")
	public static boolean method2786(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg4 % 8;
		@Pc(19) int local19;
		if (local9 == 0) {
			local19 = 0;
		} else {
			local19 = 8 - local9;
		}
		@Pc(38) int local38 = -((arg0 + 8 - 1) / 8);
		@Pc(47) int local47 = -((arg4 + 8 - 1) / 8);
		for (@Pc(49) int local49 = local38; local49 < 0; local49++) {
			for (@Pc(53) int local53 = local47; local53 < 0; local53++) {
				if (arg3[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local19;
			if (arg3[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg2;
		}
		return false;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)B")
	public static byte method2787(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
