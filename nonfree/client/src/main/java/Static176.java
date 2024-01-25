import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
	public static int anInt3170;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_56 = new Class186(80, 7);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I[JII[Ljava/lang/Object;)V")
	public static void method2712(@OriginalArg(0) int arg0, @OriginalArg(1) long[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(18) int local18 = (arg2 + arg0) / 2;
		@Pc(20) int local20 = arg0;
		@Pc(24) long local24 = arg1[local18];
		arg1[local18] = arg1[arg2];
		arg1[arg2] = local24;
		@Pc(38) Object local38 = arg3[local18];
		arg3[local18] = arg3[arg2];
		arg3[arg2] = local38;
		@Pc(57) int local57 = local24 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(59) int local59 = arg0; local59 < arg2; local59++) {
			if ((long) (local59 & local57) + local24 > arg1[local59]) {
				@Pc(78) long local78 = arg1[local59];
				arg1[local59] = arg1[local20];
				arg1[local20] = local78;
				@Pc(92) Object local92 = arg3[local59];
				arg3[local59] = arg3[local20];
				arg3[local20++] = local92;
			}
		}
		arg1[arg2] = arg1[local20];
		arg1[local20] = local24;
		arg3[arg2] = arg3[local20];
		arg3[local20] = local38;
		method2712(arg0, arg1, local20 - 1, arg3);
		method2712(local20 + 1, arg1, arg2, arg3);
	}
}
