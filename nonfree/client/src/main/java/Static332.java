import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
	public static int anInt6016;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
	public static void method5129(@OriginalArg(0) int arg0) {
		@Pc(11) Class5_Sub2_Sub4 local11 = Static257.method3597(2, (long) arg0);
		local11.method2440();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZII)I")
	public static int method5130(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(30) int local30 = ((arg1 & 0xFF00FF) * arg0 & 0xFF00FF00 | (arg1 & 0xFF00) * arg0 & 0xFF0000) >>> 8;
		@Pc(35) int local35 = 255 - arg0;
		return local30 + ((local35 * (arg2 & 0xFF00) & 0xFF0000 | (arg2 & 0xFF00FF) * local35 & 0xFF00FF00) >>> 8);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!dn;Lclient!dn;I)V")
	public static void method5131(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1) {
		if (arg0.aClass5_338 != null) {
			arg0.method8829();
		}
		arg0.aClass5_337 = arg1;
		arg0.aClass5_338 = arg1.aClass5_338;
		arg0.aClass5_338.aClass5_337 = arg0;
		arg0.aClass5_337.aClass5_338 = arg0;
	}
}
