import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!wl", name = "A", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_177 = new Class254(53, -2);

	@OriginalMember(owner = "client!wl", name = "H", descriptor = "I")
	public static final int anInt9710 = 328;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "([I[Ljava/lang/Object;ZII)V")
	public static void method8082(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(18) int local18 = (arg3 + arg2) / 2;
		@Pc(20) int local20 = arg3;
		@Pc(24) int local24 = arg0[local18];
		arg0[local18] = arg0[arg2];
		arg0[arg2] = local24;
		@Pc(38) Object local38 = arg1[local18];
		arg1[local18] = arg1[arg2];
		arg1[arg2] = local38;
		@Pc(57) int local57 = ~local24 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(59) int local59 = arg3; local59 < arg2; local59++) {
			if (arg0[local59] < (local57 & local59) + local24) {
				@Pc(78) int local78 = arg0[local59];
				arg0[local59] = arg0[local20];
				arg0[local20] = local78;
				@Pc(92) Object local92 = arg1[local59];
				arg1[local59] = arg1[local20];
				arg1[local20++] = local92;
			}
		}
		arg0[arg2] = arg0[local20];
		arg0[local20] = local24;
		arg1[arg2] = arg1[local20];
		arg1[local20] = local38;
		method8082(arg0, arg1, local20 - 1, arg3);
		method8082(arg0, arg1, arg2, local20 + 1);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
	public static void method8086() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static228.anInt4746; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static44.anInt1275; local13++) {
				if (Static91.method2008(local9, local13, local7, true, Static256.aClass224ArrayArrayArray1)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)I")
	public static int method8088() {
		return Static275.method4583(false);
	}
}
