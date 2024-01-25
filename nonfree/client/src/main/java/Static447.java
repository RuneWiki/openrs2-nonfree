import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static447 {

	@OriginalMember(owner = "client!ow", name = "h", descriptor = "[I")
	public static final int[] anIntArray484 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)Lclient!qq;")
	public static Class4_Sub3_Sub4 method6133() {
		return Static570.aClass4_Sub3_Sub4_6;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(ZIILclient!kq;)V")
	public static void method6139(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class199 arg2) {
		if (Static507.aClass199_12 != null || Static333.aBoolean400 || (arg2 == null || Static253.method3678(arg2) == null)) {
			return;
		}
		Static507.aClass199_12 = arg2;
		Static389.aClass199_10 = Static253.method3678(arg2);
		Static9.anInt10387 = 0;
		Static495.aBoolean605 = false;
		Static156.anInt2899 = arg0;
		Static624.anInt9782 = arg1;
	}
}
