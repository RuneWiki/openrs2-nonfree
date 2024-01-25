import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ah", name = "nb", descriptor = "I")
	public static int anInt159;

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_2 = new Class179(39, 0);

	@OriginalMember(owner = "client!ah", name = "cb", descriptor = "Lclient!mha;")
	public static final Class222 aClass222_1 = new Class222(14, 0, 4, 1);

	@OriginalMember(owner = "client!ah", name = "hb", descriptor = "[I")
	public static final int[] anIntArray34 = new int[2];

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB[F)[F")
	public static float[] method174(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(11) float[] local11 = new float[arg0];
		Static653.method5396(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/String;ZIBLjava/lang/String;)V")
	public static void method181(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		Static346.method4638(arg3, arg2, true, -1, arg1, arg0);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!gs;Z)V")
	public static void method182(@OriginalArg(0) Class13_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort117; local2 <= arg0.aShort120; local2++) {
			for (@Pc(6) int local6 = arg0.aShort119; local6 <= arg0.aShort118; local6++) {
				@Pc(16) Class53 local16 = Static28.aClass53ArrayArrayArray1[arg0.aByte127][local2][local6];
				if (local16 != null) {
					@Pc(21) Class325 local21 = local16.aClass325_1;
					@Pc(23) Class325 local23 = null;
					while (local21 != null) {
						if (local21.aClass13_Sub1_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass325_1 = local21.aClass325_3;
							} else {
								local23.aClass325_3 = local21.aClass325_3;
							}
							local21.method7368();
							break;
						}
						local23 = local21;
						local21 = local21.aClass325_3;
					}
				}
			}
		}
		if (!arg1) {
			Static54.method261(arg0);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)Z")
	public static boolean method183(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
