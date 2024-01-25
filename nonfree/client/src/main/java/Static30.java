import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[I")
	public static int[] anIntArray47 = new int[2];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!co;I)V")
	public static void method696(@OriginalArg(0) Class5_Sub3 arg0) {
		for (@Pc(11) int local11 = 0; local11 < Static482.anInt8343; local11++) {
			@Pc(17) int local17 = arg0.method4231();
			@Pc(21) int local21 = arg0.method4227();
			if (local21 == 65535) {
				local21 = -1;
			}
			if (Static315.aClass35_Sub1Array2[local17] != null) {
				Static315.aClass35_Sub1Array2[local17].anInt990 = local21;
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIB)V")
	public static void method697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class5_Sub2_Sub7 local13 = Static144.method2728(arg1, 12);
		local13.method1327();
		local13.anInt1437 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!bo;ZZIILclient!bo;Z)I")
	public static int method698(@OriginalArg(0) Class35_Sub1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class35_Sub1 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(21) int local21 = Static178.method3062(arg3, arg5, arg0, arg4);
		if (local21 != 0) {
			return arg5 ? -local21 : local21;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(49) int local49 = Static178.method3062(arg2, arg1, arg0, arg4);
			return arg1 ? -local49 : local49;
		}
	}
}
