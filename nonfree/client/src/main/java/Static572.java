import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLclient!bfa;II)V")
	public static void method8298(@OriginalArg(1) Class4_Sub2_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int[] local10 = new int[4];
		Static652.method4544(local10, 0, local10.length, arg1);
		Static417.method6374(arg0, arg2, local10);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method8312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(9) int arg6) {
		@Pc(11) Class5_Sub44 local11 = null;
		for (@Pc(16) Class5_Sub44 local16 = (Class5_Sub44) Static174.aClass330_14.method7908(); local16 != null; local16 = (Class5_Sub44) Static174.aClass330_14.method7914()) {
			if (arg4 == local16.anInt8640 && local16.anInt8645 == arg2 && local16.anInt8639 == arg6 && arg5 == local16.anInt8642) {
				local11 = local16;
				break;
			}
		}
		if (local11 == null) {
			local11 = new Class5_Sub44();
			local11.anInt8640 = arg4;
			local11.anInt8642 = arg5;
			local11.anInt8645 = arg2;
			local11.anInt8639 = arg6;
			if (arg2 >= 0 && arg6 >= 0 && Static326.anInt5541 > arg2 && Static448.anInt7637 > arg6) {
				Static646.method9056(local11);
			}
			Static174.aClass330_14.method7917(local11);
		}
		local11.anInt8652 = arg0;
		local11.anInt8648 = 0;
		local11.anInt8641 = -1;
		local11.anInt8650 = arg1;
		local11.anInt8646 = arg3;
	}
}
