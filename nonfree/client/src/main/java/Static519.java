import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!sha", name = "g", descriptor = "Lclient!wu;")
	public static Class380 aClass380_116;

	@OriginalMember(owner = "client!sha", name = "m", descriptor = "I")
	public static int anInt8614;

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "([III[ILclient!pga;I)Lclient!ub;")
	public static Class1_Sub3 method7254(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class95_Sub3 arg4) {
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(35) int local35;
		if (!arg4.method7103(Static588.aClass188_15, Static290.aClass189_11)) {
			@Pc(65) int[] local65 = new int[arg2 * arg1];
			for (local23 = 0; local23 < arg2; local23++) {
				local33 = local23 * arg1 + arg0[local23];
				for (local35 = 0; local35 < arg3[local23]; local35++) {
					local65[local33++] = -16777216;
				}
			}
			return new Class1_Sub3(arg4, arg1, arg2, local65);
		}
		@Pc(21) byte[] local21 = new byte[arg1 * arg2];
		for (local23 = 0; local23 < arg2; local23++) {
			local33 = arg1 * local23 + arg0[local23];
			for (local35 = 0; local35 < arg3[local23]; local35++) {
				local21[local33++] = -1;
			}
		}
		return new Class1_Sub3(arg4, arg1, arg2, local21);
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "()V")
	public static void method7256() {
		Static219.aClass94_4 = Static219.aClass94_3;
	}
}
