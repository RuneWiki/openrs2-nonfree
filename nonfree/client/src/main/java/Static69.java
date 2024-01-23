import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!hb", name = "T", descriptor = "Lclient!ea;")
	public static Class2_Sub3 aClass2_Sub3_4;

	@OriginalMember(owner = "client!hb", name = "U", descriptor = "I")
	public static int anInt1817;

	@OriginalMember(owner = "client!hb", name = "bb", descriptor = "I")
	public static int anInt1824;

	@OriginalMember(owner = "client!hb", name = "S", descriptor = "Lclient!i;")
	public static Class41 aClass41_567 = Static184.method2923("null");

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III[BIII[III)V")
	public static void method1265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(9) int arg8) {
		@Pc(6) int local6 = -(arg4 >> 2);
		@Pc(11) int local11 = -(arg4 & 0x3);
		for (@Pc(19) int local19 = -arg5; local19 < 0; local19++) {
			for (@Pc(23) int local23 = local6; local23 < 0; local23++) {
				if (arg3[arg8++] == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0;
				}
				if (arg3[arg8++] == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0;
				}
				if (arg3[arg8++] == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0;
				}
				if (arg3[arg8++] == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0;
				}
			}
			for (@Pc(85) int local85 = local11; local85 < 0; local85++) {
				if (arg3[arg8++] == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0;
				}
			}
			arg2 += arg6;
			arg8 += arg1;
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)I")
	public static int method1266(@OriginalArg(0) int arg0) {
		if (Static111.anInt2675 == 1) {
			return 7;
		} else if (arg0 == 77) {
			return 1;
		} else if (arg0 == 38) {
			return 2;
		} else if (arg0 == 16) {
			return 3;
		} else if (arg0 == 161) {
			return 4;
		} else if (arg0 == 191) {
			return 5;
		} else if (arg0 == 69) {
			return 6;
		} else {
			return 0;
		}
	}
}
