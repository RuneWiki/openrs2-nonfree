import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!lo", name = "P", descriptor = "[[[Lclient!ru;")
	public static Class299[][][] aClass299ArrayArrayArray3;

	@OriginalMember(owner = "client!lo", name = "q", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_103 = new Class56(60, -2);

	@OriginalMember(owner = "client!lo", name = "T", descriptor = "I")
	public static int anInt5225 = 0;

	@OriginalMember(owner = "client!lo", name = "Kb", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_104 = new Class56(64, 17);

	@OriginalMember(owner = "client!lo", name = "Lb", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_105 = new Class56(46, 6);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)Z")
	public static boolean method4507(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIILclient!qp;)V")
	public static void method4508(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class280 arg3) {
		for (@Pc(19) Class3_Sub18 local19 = (Class3_Sub18) Static220.aClass112_25.method3088(); local19 != null; local19 = (Class3_Sub18) Static220.aClass112_25.method3084()) {
			if (arg1 == local19.anInt3368 && local19.anInt3370 == arg0 << 9 && local19.anInt3359 == arg2 << 9 && arg3.anInt7369 == local19.aClass280_1.anInt7369) {
				if (local19.aClass3_Sub4_Sub1_3 != null) {
					Static353.aClass3_Sub4_Sub2_1.method639(local19.aClass3_Sub4_Sub1_3);
					local19.aClass3_Sub4_Sub1_3 = null;
				}
				if (local19.aClass3_Sub4_Sub1_2 != null) {
					Static353.aClass3_Sub4_Sub2_1.method639(local19.aClass3_Sub4_Sub1_2);
					local19.aClass3_Sub4_Sub1_2 = null;
				}
				local19.method7825();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "([IIBI[Ljava/lang/Object;)V")
	public static void method4509(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(23) int local23 = (arg1 + arg2) / 2;
		@Pc(25) int local25 = arg2;
		@Pc(29) int local29 = arg0[local23];
		arg0[local23] = arg0[arg1];
		arg0[arg1] = local29;
		@Pc(43) Object local43 = arg3[local23];
		arg3[local23] = arg3[arg1];
		arg3[arg1] = local43;
		@Pc(60) int local60 = local29 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(62) int local62 = arg2; local62 < arg1; local62++) {
			if (local29 + (local62 & local60) > arg0[local62]) {
				@Pc(82) int local82 = arg0[local62];
				arg0[local62] = arg0[local25];
				arg0[local25] = local82;
				@Pc(96) Object local96 = arg3[local62];
				arg3[local62] = arg3[local25];
				arg3[local25++] = local96;
			}
		}
		arg0[arg1] = arg0[local25];
		arg0[local25] = local29;
		arg3[arg1] = arg3[local25];
		arg3[local25] = local43;
		method4509(arg0, local25 - 1, arg2, arg3);
		method4509(arg0, arg1, local25 + 1, arg3);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I[I[III)V")
	public static void method4510(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		if (arg0 >= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) int local20 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local20;
		@Pc(34) int local34 = arg2[local14];
		arg2[local14] = arg2[arg3];
		arg2[arg3] = local34;
		@Pc(51) int local51 = local20 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(53) int local53 = arg0; local53 < arg3; local53++) {
			if ((local53 & local51) + local20 > arg1[local53]) {
				@Pc(72) int local72 = arg1[local53];
				arg1[local53] = arg1[local16];
				arg1[local16] = local72;
				@Pc(86) int local86 = arg2[local53];
				arg2[local53] = arg2[local16];
				arg2[local16++] = local86;
			}
		}
		arg1[arg3] = arg1[local16];
		arg1[local16] = local20;
		arg2[arg3] = arg2[local16];
		arg2[local16] = local34;
		method4510(arg0, arg1, arg2, local16 - 1);
		method4510(local16 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!tf;)V")
	public static void method4512(@OriginalArg(1) Class322 arg0) {
		Static89.anInt1888 = 0;
		Static162.anInt987 = 0;
		Static361.aClass178_20 = new Class178();
		Static492.aClass41_Sub3_Sub1_Sub1Array1 = new Class41_Sub3_Sub1_Sub1[1024];
		Static151.aClass41_Sub9Array1 = new Class41_Sub9[Static555.anIntArray579[Static411.anInt7039] + 1];
		Static302.anInt5115 = 0;
		Static265.anInt4662 = 0;
		Static134.method2621(arg0);
		Static61.method1393(arg0);
	}

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "(II)V")
	public static void method4522(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub7_Sub18 local8 = Static543.method7218(14, arg0);
		local8.method7329();
	}
}
