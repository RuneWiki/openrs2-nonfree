import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
	public static int anInt7906;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IBIZII)V")
	public static void method6713(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(20) long local20 = (long) (arg1 | (arg2 ? Integer.MIN_VALUE : 0));
		@Pc(26) Class5_Sub48 local26 = (Class5_Sub48) Static459.aClass335_41.method7766(local20);
		if (local26 == null) {
			local26 = new Class5_Sub48();
			Static459.aClass335_41.method7770(local20, local26);
		}
		if (local26.anIntArray497.length <= arg4) {
			@Pc(47) int[] local47 = new int[arg4 + 1];
			@Pc(52) int[] local52 = new int[arg4 + 1];
			for (@Pc(54) int local54 = 0; local54 < local26.anIntArray497.length; local54++) {
				local47[local54] = local26.anIntArray497[local54];
				local52[local54] = local26.anIntArray495[local54];
			}
			for (@Pc(79) int local79 = local26.anIntArray497.length; local79 < arg4; local79++) {
				local47[local79] = -1;
				local52[local79] = 0;
			}
			local26.anIntArray497 = local47;
			local26.anIntArray495 = local52;
		}
		local26.anIntArray497[arg4] = arg0;
		local26.anIntArray495[arg4] = arg3;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!rv;)Lclient!ck;")
	public static Class61 method6714(@OriginalArg(1) Class5_Sub15 arg0) {
		@Pc(12) int local12 = arg0.method3698();
		return new Class61(local12);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IFFIF)F")
	public static float method6715(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		@Pc(7) float[] local7 = Static392.aFloatArrayArray13[arg0];
		return arg3 * local7[2] + arg2 * local7[0] + local7[1] * arg1;
	}
}
