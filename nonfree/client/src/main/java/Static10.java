import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "[I")
	public static int[] anIntArray25;

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
	public static int anInt269;

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "Z")
	public static boolean aBoolean16 = false;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([J[IIII)V")
	public static void method245(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(18) int local18 = (arg3 + arg2) / 2;
		@Pc(20) int local20 = arg2;
		@Pc(24) long local24 = arg0[local18];
		arg0[local18] = arg0[arg3];
		arg0[arg3] = local24;
		@Pc(38) int local38 = arg1[local18];
		arg1[local18] = arg1[arg3];
		arg1[arg3] = local38;
		@Pc(58) int local58 = ~local24 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg2; local60 < arg3; local60++) {
			if (arg0[local60] < (long) (local58 & local60) + local24) {
				@Pc(77) long local77 = arg0[local60];
				arg0[local60] = arg0[local20];
				arg0[local20] = local77;
				@Pc(91) int local91 = arg1[local60];
				arg1[local60] = arg1[local20];
				arg1[local20++] = local91;
			}
		}
		arg0[arg3] = arg0[local20];
		arg0[local20] = local24;
		arg1[arg3] = arg1[local20];
		arg1[local20] = local38;
		method245(arg0, arg1, arg2, local20 - 1);
		method245(arg0, arg1, local20 + 1, arg3);
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
	public static void method249() {
		Static115.aClass75_3.ua(((float) Static123.aClass21_Sub1_1.anInt864 * 0.1F + 0.7F) * 1.1523438F);
		Static115.aClass75_3.XA(Static46.anInt1156, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static115.aClass75_3.V(Static314.anInt5710, -1, 256);
		Static115.aClass75_3.method2599(Static399.aClass7_4);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BIIII)V")
	public static void method251(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static142.anInt3212 = 0;
		Static161.anInt3448 = 0;
		Static163.anInt3488 = arg0;
		Static450.anInt7594 = arg1;
	}
}
