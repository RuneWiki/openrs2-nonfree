import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_94 = new Class243(6, 4);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZLclient!ps;)Lclient!tk;")
	public static Class2_Sub7 method7781(@OriginalArg(1) Class2_Sub29 arg0) {
		arg0.method5170();
		@Pc(13) int local13 = arg0.method5170();
		@Pc(22) Class2_Sub7 local22 = Static41.method788(local13);
		local22.anInt9073 = arg0.method5170();
		@Pc(31) int local31 = arg0.method5170();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method5170();
			local22.method7582(local39, arg0);
		}
		local22.method7583();
		return local22;
	}
}
