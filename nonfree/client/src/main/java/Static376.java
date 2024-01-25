import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!sr", name = "L", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_136 = new Class119(74, 2);

	@OriginalMember(owner = "client!sr", name = "P", descriptor = "[I")
	public static final int[] anIntArray404 = new int[14];

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIII)V")
	public static void method4925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class163 local9 = Static77.aClass163ArrayArray1[arg2][arg0];
		Static50.method913(local9 == null ? Static47.aClass163_1 : local9, arg1);
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(III)I")
	public static int method4926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local5 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return arg0 * local5;
		} else {
			return local5;
		}
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(II)I")
	public static int method4927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static305.anIntArrayArray37 == null ? 0 : Static305.anIntArrayArray37[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IB)Z")
	public static boolean method4928(@OriginalArg(0) int arg0) {
		if (arg0 == 19 || arg0 == 58 || arg0 == 51 || arg0 == 18 || arg0 == 25) {
			return true;
		} else {
			return arg0 == 49 || arg0 == 1004;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIB)I")
	public static int method4929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
