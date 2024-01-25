import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
	public static void method4919() {
		@Pc(16) Class5_Sub48 local16 = Static16.method232(Static636.aClass46_110, Static276.aClass251_2);
		local16.aClass5_Sub22_Sub1_2.method5905(0);
		Static277.method4436(local16);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)Lclient!raa;")
	public static Class295 method4920(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class295 local15 = Static107.method9049(arg0);
		if (arg1 == -1) {
			return local15;
		} else if (local15 == null || local15.aClass295Array2 == null || local15.aClass295Array2.length <= arg1) {
			return null;
		} else {
			return local15.aClass295Array2[arg1];
		}
	}
}
