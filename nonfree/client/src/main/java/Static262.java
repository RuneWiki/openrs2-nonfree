import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "Lclient!dp;")
	public static Class53 aClass53_119;

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "[I")
	public static final int[] anIntArray528 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
	public static int anInt4777 = 999999;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!ri;IIB)V")
	public static void method4417(@OriginalArg(0) Class44_Sub4_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.anInt5099 == arg2 && arg2 != -1) {
			@Pc(69) Class24 local69 = Static209.method3737(arg2);
			@Pc(72) int local72 = local69.anInt574;
			if (local72 == 1) {
				arg0.anInt5144 = 0;
				arg0.anInt5118 = arg1;
				arg0.anInt5133 = 1;
				arg0.anInt5119 = 0;
				arg0.anInt5152 = 0;
				Static203.method3667(arg0.anInt5152, arg0.anInt6339, local69, arg0.anInt6340, false);
			}
			if (local72 == 2) {
				arg0.anInt5144 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt5099 == -1 || Static209.method3737(arg2).anInt588 >= Static209.method3737(arg0.anInt5099).anInt588) {
			arg0.anInt5152 = 0;
			arg0.anInt5118 = arg1;
			arg0.anInt5133 = 1;
			arg0.anInt5144 = 0;
			arg0.anInt5158 = arg0.anInt5156;
			arg0.anInt5099 = arg2;
			arg0.anInt5119 = 0;
			if (arg0.anInt5099 != -1) {
				Static203.method3667(arg0.anInt5152, arg0.anInt6339, Static209.method3737(arg0.anInt5099), arg0.anInt6340, false);
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
	public static void method4419() {
		Static238.aBoolean357 = true;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZIIIFIII)[I")
	public static int[] method4420(@OriginalArg(4) float arg0) {
		@Pc(11) int[] local11 = new int[2048];
		@Pc(15) Class6_Sub1_Sub30 local15 = new Class6_Sub1_Sub30();
		local15.anInt4998 = (int) (arg0 * 4096.0F);
		local15.aBoolean350 = true;
		local15.anInt4989 = 8;
		local15.anInt4999 = 8;
		local15.anInt5002 = 35;
		local15.anInt4997 = 4;
		local15.method5611();
		Static117.method2381(1, 2048);
		local15.method4562(local11, 0);
		return local11;
	}
}
