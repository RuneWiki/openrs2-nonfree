import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "[I")
	public static final int[] anIntArray12 = new int[2048];

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "[Lclient!bs;")
	public static final Class20_Sub2_Sub2_Sub1_Sub1[] aClass20_Sub2_Sub2_Sub1_Sub1Array1 = new Class20_Sub2_Sub2_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZI)Lclient!fa;")
	public static Class89 method329(@OriginalArg(1) int arg0) {
		@Pc(13) Class89[] local13 = Static606.method7455();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (arg0 == local13[local15].anInt2681) {
				return local13[local15];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLclient!efa;Lclient!efa;)V")
	public static void method330(@OriginalArg(1) Class6 arg0, @OriginalArg(2) Class6 arg1) {
		if (arg1.aClass6_300 != null) {
			arg1.method9043();
		}
		arg1.aClass6_300 = arg0.aClass6_300;
		arg1.aClass6_299 = arg0;
		arg1.aClass6_300.aClass6_299 = arg1;
		arg1.aClass6_299.aClass6_300 = arg1;
	}
}
