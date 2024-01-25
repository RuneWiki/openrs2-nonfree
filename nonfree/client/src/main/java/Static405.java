import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!pl", name = "w", descriptor = "Lclient!mt;")
	public static Class4_Sub7_Sub3 aClass4_Sub7_Sub3_4;

	@OriginalMember(owner = "client!pl", name = "v", descriptor = "Lclient!op;")
	public static final Class250 aClass250_8 = new Class250();

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(III)I")
	public static int method6366(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(42) int local42 = (arg0 & 0x7F) * 96 >> 7;
			if (local42 < 2) {
				local42 = 2;
			} else if (local42 > 126) {
				local42 = 126;
			}
			return (arg0 & 0xFF80) + local42;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB[BIII)V")
	public static void method6367(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(15) int local15 = arg2 - arg3 >> 2;
		arg0 += arg3;
		while (true) {
			local15--;
			if (local15 < 0) {
				local15 = arg2 - arg3 & 0x3;
				while (true) {
					local15--;
					if (local15 < 0) {
						return;
					}
					arg1[arg0++] = 1;
				}
			}
			@Pc(24) int local24 = arg0 + 1;
			arg1[arg0] = 1;
			@Pc(29) int local29 = local24 + 1;
			arg1[local24] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg1[local29] = 1;
			arg0 = local34 + 1;
			arg1[local34] = 1;
		}
	}
}
