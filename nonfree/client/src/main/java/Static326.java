import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!l", name = "J", descriptor = "[I")
	public static int[] anIntArray324;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)V")
	public static void method4967(@OriginalArg(1) int arg0) {
		if (Static670.anInt10721 == 1) {
			Static89.anInt1506 = arg0;
		} else if (Static670.anInt10721 == 2) {
			Static313.anInt5550 = arg0;
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method4970(@OriginalArg(0) String arg0) {
		@Pc(9) String local9 = Static375.method5507(Static74.method1182(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}
}
