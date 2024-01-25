import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static612 {

	@OriginalMember(owner = "client!up", name = "c", descriptor = "D")
	public static double aDouble21;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "Lclient!qq;")
	public static Class203 aClass203_14;

	@OriginalMember(owner = "client!up", name = "e", descriptor = "Lclient!sg;")
	public static Class5_Sub5_Sub19 aClass5_Sub5_Sub19_5;

	@OriginalMember(owner = "client!up", name = "f", descriptor = "I")
	public static int anInt10117;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II)Z")
	public static boolean method8696(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V")
	public static void method8697() {
		@Pc(1) Class391 local1 = Static320.aClass391_27;
		synchronized (Static320.aClass391_27) {
			Static320.aClass391_27.method9286();
		}
		local1 = Static32.aClass391_5;
		synchronized (Static32.aClass391_5) {
			Static32.aClass391_5.method9286();
		}
	}
}
