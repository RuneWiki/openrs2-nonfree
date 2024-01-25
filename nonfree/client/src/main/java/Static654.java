import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static654 {

	@OriginalMember(owner = "client!wba", name = "k", descriptor = "Lclient!ef;")
	public static Class97 aClass97_8;

	@OriginalMember(owner = "client!wba", name = "i", descriptor = "I")
	public static int anInt10668 = 0;

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZIII)I")
	public static int method8756(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub21 local8 = Static586.method7782(arg2, arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 >= 0 && local8.anIntArray175.length > arg1) {
			return local8.anIntArray175[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZI)V")
	public static void method8758(@OriginalArg(0) boolean arg0) {
		if (Static89.aString26.length() == 0) {
			return;
		}
		Static85.method1345("--> " + Static89.aString26);
		Static367.method9035(arg0, false, Static89.aString26);
		Static89.aString26 = "";
		Static6.anInt84 = 0;
		Static610.anInt10155 = 0;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IZ)V")
	public static void method8759(@OriginalArg(1) boolean arg0) {
		if (Static74.aClass191_1 == null) {
			Static629.method8500();
		}
		if (arg0) {
			Static74.aClass191_1.method4355();
		}
	}
}
