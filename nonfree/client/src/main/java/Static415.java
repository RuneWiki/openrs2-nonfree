import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!up", name = "e", descriptor = "J")
	public static long aLong54;

	@OriginalMember(owner = "client!up", name = "f", descriptor = "Lclient!f;")
	public static Class49 aClass49_6;

	@OriginalMember(owner = "client!up", name = "b", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_77 = new Class137(4, -1);

	@OriginalMember(owner = "client!up", name = "c", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_78 = new Class137(11, 16);

	@OriginalMember(owner = "client!up", name = "d", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_62 = new Class214(11, -2);

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II[S[Ljava/lang/String;I)V")
	public static void method1272(@OriginalArg(1) int arg0, @OriginalArg(2) short[] arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) String local20 = arg2[local14];
		arg2[local14] = arg2[arg3];
		arg2[arg3] = local20;
		@Pc(34) short local34 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local34;
		for (@Pc(46) int local46 = arg0; local46 < arg3; local46++) {
			if (local20 == null || arg2[local46] != null && (local46 & 0x1) > arg2[local46].compareTo(local20)) {
				@Pc(67) String local67 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16] = local67;
				@Pc(81) short local81 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16++] = local81;
			}
		}
		arg2[arg3] = arg2[local16];
		arg2[local16] = local20;
		arg1[arg3] = arg1[local16];
		arg1[local16] = local34;
		method1272(arg0, arg1, arg2, local16 - 1);
		method1272(local16 + 1, arg1, arg2, arg3);
	}
}
