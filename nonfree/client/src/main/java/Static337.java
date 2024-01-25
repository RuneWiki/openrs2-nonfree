import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "F")
	public static float aFloat128;

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIIBI)I")
	public static int method5336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(12) int local12 = arg2;
			arg2 = arg3;
			arg3 = local12;
		}
		@Pc(32) int local32 = arg4 & 0x3;
		if (local32 == 0) {
			return arg1;
		} else if (local32 == 1) {
			return 7 + 1 - arg5 - arg2;
		} else if (local32 == 2) {
			return 1 + 7 - arg3 - arg1;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)V")
	public static void method5337(@OriginalArg(1) int arg0) {
		if (Static517.anInt9002 == 0) {
			Static519.aClass2_Sub12_Sub1_3.method1028(arg0);
		} else {
			Static117.anInt2343 = arg0;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILclient!dda;II)Lclient!dd;")
	public static Class52 method5338(@OriginalArg(0) int arg0, @OriginalArg(1) Class53 arg1) {
		@Pc(9) byte[] local9 = arg1.method1616(0, arg0);
		return local9 == null ? null : new Class52(local9);
	}
}
