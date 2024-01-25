import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(IB)V")
	public static void method5133(@OriginalArg(0) int arg0) {
		Static270.anInt4979 = arg0;
		Static245.anInt780 = 2;
		if (Static360.aString55 == null) {
			Static221.method8979(35);
		} else {
			@Pc(24) Class5_Sub41 local24 = new Class5_Sub41(Static353.method5337(Static352.method8968(Static360.aString55)));
			@Pc(28) long local28 = local24.method7823();
			Static288.aLong136 = local24.method7823();
			Static430.method58("", Static142.method2492(local28), true);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Z")
	public static boolean method5134(@OriginalArg(0) int arg0) {
		if (arg0 == 6 || arg0 == 60 || arg0 == 59 || arg0 == 25 || arg0 == 19) {
			return true;
		} else {
			return arg0 == 44 || arg0 == 1001;
		}
	}
}
