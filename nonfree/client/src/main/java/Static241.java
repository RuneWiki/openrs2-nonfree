import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "F")
	public static float aFloat80;

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
	public static int anInt4476;

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
	public static int anInt4470 = 0;

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "Lclient!ui;")
	public static Class175 aClass175_35 = new Class175(64);

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
	public static volatile int anInt4478 = 0;

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "F")
	public static float aFloat81 = 0.0F;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(FIIIBIZI)[I")
	public static int[] method3831(@OriginalArg(0) float arg0) {
		@Pc(2) int[] local2 = new int[2048];
		@Pc(10) Class1_Sub1_Sub8 local10 = new Class1_Sub1_Sub8();
		local10.anInt713 = 4;
		local10.anInt717 = 8;
		local10.aBoolean74 = true;
		local10.anInt712 = 8;
		local10.anInt719 = 35;
		local10.anInt710 = (int) (arg0 * 4096.0F);
		local10.method4460();
		Static62.method1108(1, 2048);
		local10.method662(local2, 0);
		return local2;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)I")
	public static int method3833(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II[[IIII)I")
	public static int method3834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(26) int local26 = arg2[arg4 + 1][arg0] * arg3 + (128 - arg3) * arg2[arg4][arg0] >> 7;
		@Pc(54) int local54 = arg2[arg4][arg0 + 1] * (128 - arg3) + arg2[arg4 + 1][arg0 + 1] * arg3 >> 7;
		return arg1 * local54 + (128 - arg1) * local26 >> 7;
	}
}
