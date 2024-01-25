import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!fja", name = "i", descriptor = "I")
	public static int anInt3195 = -1;

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(Lclient!jt;I)I")
	public static int method2758(@OriginalArg(0) Class182 arg0) {
		if (Static280.aClass182_5 == arg0) {
			return 5120;
		} else if (arg0 == Static280.aClass182_6) {
			return 5122;
		} else if (Static280.aClass182_7 == arg0) {
			return 5124;
		} else if (arg0 == Static280.aClass182_8) {
			return 5121;
		} else if (arg0 == Static280.aClass182_9) {
			return 5123;
		} else if (arg0 == Static280.aClass182_10) {
			return 5125;
		} else if (arg0 == Static280.aClass182_11) {
			return 5131;
		} else if (arg0 == Static280.aClass182_12) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(BI[BIII)V")
	public static void method2759(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(20) int local20 = arg2 - arg0 >> 2;
		arg3 += arg0;
		while (true) {
			local20--;
			if (local20 < 0) {
				local20 = arg2 - arg0 & 0x3;
				while (true) {
					local20--;
					if (local20 < 0) {
						return;
					}
					arg1[arg3++] = 1;
				}
			}
			@Pc(29) int local29 = arg3 + 1;
			arg1[arg3] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg1[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg1[local34] = 1;
			arg3 = local39 + 1;
			arg1[local39] = 1;
		}
	}
}
