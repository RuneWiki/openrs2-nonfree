import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!ti", name = "U", descriptor = "Z")
	public static boolean aBoolean441 = false;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!ct;B)V")
	public static void method5348(@OriginalArg(0) Class30 arg0) {
		Static336.aClass30_97 = arg0;
		Static301.anInt5789 = Static336.aClass30_97.method1180(19);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)V")
	public static void method5349(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub4_Sub17 local13 = Static132.method2717(arg0, 9);
		local13.method3481();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZIII)V")
	public static void method5351(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static124.anInt2721 == 0 || arg1 == 0 || Static116.anInt2537 >= 50 || arg2 == -1) {
			return;
		}
		Static189.anIntArray288[Static116.anInt2537] = arg2;
		Static123.anIntArray198[Static116.anInt2537] = arg1;
		Static38.anIntArray61[Static116.anInt2537] = arg0;
		Static83.aClass65Array1[Static116.anInt2537] = null;
		Static155.anIntArray232[Static116.anInt2537] = 0;
		Static81.anIntArray144[Static116.anInt2537] = arg3;
		Static116.anInt2537++;
	}
}
