import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIB)V")
	public static void method5488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class6_Sub2_Sub7 local16 = Static401.method5861(arg0, 9);
		local16.method2582();
		local16.anInt2947 = arg2;
		local16.anInt2944 = arg1;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IBIIZI)V")
	public static void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if ((arg3 ? Static140.aClass6_Sub48_Sub1_1.anInt8991 : Static140.aClass6_Sub48_Sub1_1.anInt8997) != 0 && arg4 != 0 && Static559.anInt9221 < 50 && arg0 != -1) {
			Static546.aClass39Array1[Static559.anInt9221++] = new Class39((byte) (arg3 ? 3 : 2), arg0, arg4, arg1, arg2, 0);
		}
	}
}
