import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!sv", name = "Q", descriptor = "I")
	public static int anInt6154;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IBIII)Z")
	public static boolean method4953(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static4.aByteArrayArrayArray1[0][arg1][arg3] & 0x2) != 0) {
			return true;
		} else if ((Static4.aByteArrayArrayArray1[arg0][arg1][arg3] & 0x10) == 0) {
			return Static21.method297(arg3, arg1, arg0) == arg2;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method4954(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = Static339.method4488(arg0.charAt(local17)) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIIIB)V")
	public static void method4955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static379.anInt6161 = arg4;
		Static76.anInt1530 = arg2;
		Static339.anInt5517 = arg5;
		Static136.anInt2489 = arg0;
		Static206.anInt4097 = arg1;
		Static380.anInt6187 = arg3;
	}
}
