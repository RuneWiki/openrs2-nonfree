import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!mm", name = "v", descriptor = "I")
	public static int anInt5290;

	@OriginalMember(owner = "client!mm", name = "B", descriptor = "[I")
	public static int[] anIntArray568;

	@OriginalMember(owner = "client!mm", name = "s", descriptor = "Lclient!jj;")
	public static Class108 aClass108_30 = new Class108(8);

	@OriginalMember(owner = "client!mm", name = "t", descriptor = "I")
	public static int anInt5288 = 0;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!sc;Z)Z")
	public static boolean method4803(@OriginalArg(0) Interface7 arg0) {
		@Pc(9) Class66 local9 = Static196.method3622(arg0.method5799());
		if (local9.anInt1478 == -1) {
			return true;
		} else {
			@Pc(20) Class80 local20 = Static152.method3077(local9.anInt1478);
			return local20.anInt1736 == -1 ? true : local20.method1723();
		}
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)V")
	public static void method4805(@OriginalArg(1) int arg0) {
		@Pc(8) Class6_Sub2_Sub8 local8 = Static239.method5786(6, arg0);
		local8.method2645();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(III[J[Ljava/lang/Object;)V")
	public static void method4806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) long local20 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local20;
		@Pc(34) Object local34 = arg3[local14];
		arg3[local14] = arg3[arg1];
		arg3[arg1] = local34;
		for (@Pc(46) int local46 = arg0; local46 < arg1; local46++) {
			if (arg2[local46] < (long) (local46 & 0x1) + local20) {
				@Pc(67) long local67 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16] = local67;
				@Pc(81) Object local81 = arg3[local46];
				arg3[local46] = arg3[local16];
				arg3[local16++] = local81;
			}
		}
		arg2[arg1] = arg2[local16];
		arg2[local16] = local20;
		arg3[arg1] = arg3[local16];
		arg3[local16] = local34;
		method4806(arg0, local16 - 1, arg2, arg3);
		method4806(local16 + 1, arg1, arg2, arg3);
	}
}
