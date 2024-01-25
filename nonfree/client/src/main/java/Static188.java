import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!gj", name = "A", descriptor = "I")
	public static int anInt4105;

	@OriginalMember(owner = "client!gj", name = "C", descriptor = "I")
	public static int anInt4107;

	@OriginalMember(owner = "client!gj", name = "P", descriptor = "[Lclient!ufa;")
	public static Class4[] aClass4Array3;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLclient!ji;)Lclient!dt;")
	public static Class6_Sub1 method3489(@OriginalArg(1) Class6_Sub8 arg0) {
		arg0.method8246();
		@Pc(18) int local18 = arg0.method8246();
		@Pc(22) Class6_Sub1 local22 = Static543.method7666(local18);
		local22.anInt10697 = arg0.method8246();
		@Pc(31) int local31 = arg0.method8246();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method8246();
			local22.method8722(local39, arg0);
		}
		local22.method8732();
		return local22;
	}
}
