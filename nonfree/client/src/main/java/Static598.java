import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)V")
	public static void method7971(@OriginalArg(0) int arg0) {
		@Pc(9) Class3_Sub6_Sub7 local9 = Static198.method3146((long) arg0, 5);
		local9.method1709();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!s;)V")
	public static void method7972(@OriginalArg(0) int arg0, @OriginalArg(1) Class104 arg1) {
		Static343.aClass104Array2[arg0] = arg1;
	}
}
