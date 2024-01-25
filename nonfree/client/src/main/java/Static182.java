import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
	public static int anInt3852 = 0;

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "Lclient!br;")
	public static Class21 aClass21_11 = null;

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
	public static int anInt3853 = 0;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!lf;Z)Lclient!qn;")
	public static Class4_Sub6 method3492(@OriginalArg(0) Class4_Sub11 arg0) {
		arg0.method3440();
		@Pc(13) int local13 = arg0.method3440();
		@Pc(17) Class4_Sub6 local17 = Static8.method189(local13);
		local17.anInt6811 = arg0.method3440();
		@Pc(26) int local26 = arg0.method3440();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = arg0.method3440();
			local17.method5697(local34, arg0);
		}
		local17.method5700();
		return local17;
	}
}
