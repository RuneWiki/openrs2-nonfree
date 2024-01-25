import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!le", name = "o", descriptor = "Lclient!hja;")
	public static Class159 aClass159_1;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "Lclient!lga;")
	public static Class223 aClass223_74;

	@OriginalMember(owner = "client!le", name = "j", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_75 = new Class241(45, 3);

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I[I[Ljava/lang/Object;IB)V")
	public static void method5212(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(15) int local15 = (arg3 + arg0) / 2;
		@Pc(17) int local17 = arg3;
		@Pc(21) int local21 = arg1[local15];
		arg1[local15] = arg1[arg0];
		arg1[arg0] = local21;
		@Pc(35) Object local35 = arg2[local15];
		arg2[local15] = arg2[arg0];
		arg2[arg0] = local35;
		@Pc(55) int local55 = ~local21 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(57) int local57 = arg3; local57 < arg0; local57++) {
			if (arg1[local57] < (local57 & local55) + local21) {
				@Pc(74) int local74 = arg1[local57];
				arg1[local57] = arg1[local17];
				arg1[local17] = local74;
				@Pc(88) Object local88 = arg2[local57];
				arg2[local57] = arg2[local17];
				arg2[local17++] = local88;
			}
		}
		arg1[arg0] = arg1[local17];
		arg1[local17] = local21;
		arg2[arg0] = arg2[local17];
		arg2[local17] = local35;
		method5212(local17 - 1, arg1, arg2, arg3);
		method5212(arg0, arg1, arg2, local17 + 1);
	}
}
