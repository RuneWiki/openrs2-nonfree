import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(IBI)V")
	public static void method6489(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class3_Sub6_Sub7 local9 = Static198.method3146((long) arg1, 12);
		local9.method1712();
		local9.anInt1790 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)V")
	public static void method6490(@OriginalArg(1) int arg0) {
		@Pc(17) Class3_Sub6_Sub7 local17 = Static198.method3146((long) arg0, 14);
		local17.method1709();
	}
}
