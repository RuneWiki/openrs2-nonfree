import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
	public static int anInt6327 = 0;

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "J")
	public static long aLong158 = 0L;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BIIIIII)V")
	public static void method5375(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(10) Class1_Sub3 local10 = (Class1_Sub3) Static451.aClass136_7.method3288(); local10 != null; local10 = (Class1_Sub3) Static451.aClass136_7.method3286()) {
			if (Static106.anInt2418 >= local10.anInt1230) {
				local10.method8252();
			} else {
				Static580.method2692(local10.anInt1236 * 2, arg0 >> 1, local10.anInt1235, (local10.anInt1232 << 9) + 256, (local10.anInt1233 << 9) + 256, arg2 >> 1);
				Static552.aClass58_14.method8167(Static258.anIntArray241[0] + arg1, Static258.anIntArray241[1] + arg3, local10.aString5, local10.anInt1231 | 0xFF000000, 0);
			}
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIB)I")
	public static int method5377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(29) int local29 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local29;
		}
		return arg1;
	}
}
