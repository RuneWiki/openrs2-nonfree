import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!ija", name = "i", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_77 = new Class216(53, 6);

	@OriginalMember(owner = "client!ija", name = "l", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_95 = new Class151(7, 4);

	@OriginalMember(owner = "client!ija", name = "m", descriptor = "Lclient!ut;")
	public static final Class367 aClass367_3 = new Class367();

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "([Ljava/lang/String;III[I)V")
	public static void method3699(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg1) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) String local20 = arg0[local14];
		arg0[local14] = arg0[arg2];
		arg0[arg2] = local20;
		@Pc(34) int local34 = arg3[local14];
		arg3[local14] = arg3[arg2];
		arg3[arg2] = local34;
		for (@Pc(46) int local46 = arg1; local46 < arg2; local46++) {
			if (local20 == null || arg0[local46] != null && arg0[local46].compareTo(local20) < (local46 & 0x1)) {
				@Pc(67) String local67 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16] = local67;
				@Pc(81) int local81 = arg3[local46];
				arg3[local46] = arg3[local16];
				arg3[local16++] = local81;
			}
		}
		arg0[arg2] = arg0[local16];
		arg0[local16] = local20;
		arg3[arg2] = arg3[local16];
		arg3[local16] = local34;
		method3699(arg0, arg1, local16 - 1, arg3);
		method3699(arg0, local16 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(B)V")
	public static void method3700() {
		if (Static656.anInt10356 == 9) {
			Static53.method1256(5);
		} else if (Static656.anInt10356 == 5 || Static656.anInt10356 == 6) {
			Static53.method1256(3);
			return;
		} else if (Static656.anInt10356 == 12) {
			Static53.method1256(3);
			return;
		}
	}
}
