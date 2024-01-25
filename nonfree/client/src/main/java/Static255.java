import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!ko", name = "v", descriptor = "I")
	public static int anInt4610;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)Z")
	public static boolean method3999(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(II)I")
	public static int method4000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static127.aShortArrayArray2 == null ? 0 : Static127.aShortArrayArray2[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIII)Z")
	public static boolean method4003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static266.method4294(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static175.anInt3259;
			@Pc(14) int local14 = arg2 << Static175.anInt3259;
			return Static468.method7043(local10 + 1, Static532.aClass75Array3[arg0].ba(arg1, arg2) + arg3, local14 + 1) && Static468.method7043(local10 + Static136.anInt2574 - 1, Static532.aClass75Array3[arg0].ba(arg1 + 1, arg2) + arg3, local14 + 1) && Static468.method7043(local10 + Static136.anInt2574 - 1, Static532.aClass75Array3[arg0].ba(arg1 + 1, arg2 + 1) + arg3, local14 + Static136.anInt2574 - 1) && Static468.method7043(local10 + 1, Static532.aClass75Array3[arg0].ba(arg1, arg2 + 1) + arg3, local14 + Static136.anInt2574 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIILclient!vf;Lclient!vf;)V")
	public static void method4007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub3 arg3, @OriginalArg(4) Class1_Sub3 arg4) {
		@Pc(4) Class262 local4 = Static519.method7540(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass1_Sub3_2 = arg3;
			local4.aClass1_Sub3_3 = arg4;
		}
	}
}
