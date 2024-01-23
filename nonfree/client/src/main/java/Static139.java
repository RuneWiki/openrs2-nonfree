import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "Lclient!pg;")
	public static Class1_Sub17 aClass1_Sub17_3;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!pa;II)Z")
	public static boolean method2305(@OriginalArg(1) Class86 arg0, @OriginalArg(3) int arg1) {
		@Pc(9) byte[] local9 = arg0.method3325(arg1, 0);
		if (local9 == null) {
			return false;
		} else {
			Static62.method939(local9);
			return true;
		}
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(B)V")
	public static void method2306() {
		Static35.aClass84_15.method2585();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([BIIZIIIII[Lclient!cg;I)V")
	public static void method2307(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class16[] arg7, @OriginalArg(10) int arg8) {
		@Pc(21) int local21;
		for (@Pc(17) int local17 = 0; local17 < 8; local17++) {
			for (local21 = 0; local21 < 8; local21++) {
				if (arg4 + local17 > 0 && arg4 + local17 < 103 && arg3 + local21 > 0 && arg3 + local21 < 103) {
					arg7[arg5].anIntArrayArray6[local17 + arg4][arg3 + local21] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(93) Class1_Sub17 local93 = new Class1_Sub17(arg0);
		for (local21 = 0; local21 < 4; local21++) {
			for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
				for (@Pc(108) int local108 = 0; local108 < 64; local108++) {
					if (arg1 == local21 && arg2 <= local104 && arg2 + 8 > local104 && arg6 <= local108 && local108 < arg6 + 8) {
						Static192.method3140(arg3 + Static151.method2539(arg8, local108 & 0x7, local104 & 0x7), arg5, local93, Static109.method1732(local108 & 0x7, local104 & 0x7, arg8) + arg4, arg8, 0, 0);
					} else {
						Static192.method3140(-1, 0, local93, -1, 0, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Z")
	public static boolean method2308(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}
}
