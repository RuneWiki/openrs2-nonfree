import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "[I")
	public static int[] anIntArray49;

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "[I")
	public static int[] anIntArray50 = new int[2048];

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
	public static int anInt737 = 0;

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "[I")
	public static int[] anIntArray51 = new int[1000];

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray3 = new String[1000];

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIILclient!th;)V")
	public static void method649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class36_Sub3_Sub2 arg2) {
		if (arg0 == arg2.anInt5087 && arg0 != -1) {
			@Pc(86) Class15 local86 = Static35.method706(arg0);
			@Pc(89) int local89 = local86.anInt428;
			if (local89 == 1) {
				arg2.anInt5103 = 0;
				arg2.anInt5106 = 0;
				arg2.anInt5081 = 0;
				arg2.anInt5071 = 1;
				arg2.anInt5070 = arg1;
				Static225.method3777(arg2.anInt5106, arg2 == Static111.aClass36_Sub3_Sub2_1, arg2.anInt5109, local86, arg2.anInt5093);
			}
			if (local89 == 2) {
				arg2.anInt5103 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt5087 == -1 || Static35.method706(arg0).anInt413 >= Static35.method706(arg2.anInt5087).anInt413) {
			arg2.anInt5077 = arg2.anInt5096;
			arg2.anInt5103 = 0;
			arg2.anInt5087 = arg0;
			arg2.anInt5071 = 1;
			arg2.anInt5070 = arg1;
			arg2.anInt5081 = 0;
			arg2.anInt5106 = 0;
			if (arg2.anInt5087 != -1) {
				Static225.method3777(arg2.anInt5106, Static111.aClass36_Sub3_Sub2_1 == arg2, arg2.anInt5109, Static35.method706(arg2.anInt5087), arg2.anInt5093);
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIII)V")
	public static void method650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) Class180[] local7 = Static289.aClass180Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(21) Class180 local21 = local7[local9];
			if (local21 != null && local21.anInt5905 == 2) {
				Static241.method3939(local21.anInt5906 + (local21.anInt5899 - Static125.anInt5772 << 7), arg2 >> 1, (local21.anInt5902 - Static203.anInt4236 << 7) + local21.anInt5900, arg3, local21.anInt5895 * 2, arg1 >> 1, arg0);
				if (Static202.anInt4222 > -1 && Static148.anInt3168 % 20 < 10) {
					Static106.aClass2_Sub3_Sub1Array6[local21.anInt5904].method4367(arg5 + Static202.anInt4222 - 12, Static243.anInt3774 + arg4 + -28);
				}
			}
		}
	}
}
