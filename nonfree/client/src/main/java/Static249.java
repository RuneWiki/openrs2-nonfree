import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!it", name = "b", descriptor = "F")
	public static float aFloat148;

	@OriginalMember(owner = "client!it", name = "h", descriptor = "Z")
	public static volatile boolean aBoolean394 = true;

	@OriginalMember(owner = "client!it", name = "j", descriptor = "Z")
	public static final boolean aBoolean395 = false;

	@OriginalMember(owner = "client!it", name = "l", descriptor = "Lclient!at;")
	public static Class24 aClass24_10 = null;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IB)I")
	public static int method4599(@OriginalArg(0) int arg0) {
		@Pc(22) byte local22;
		if (arg0 > 12000) {
			Static381.method6295();
			local22 = 4;
		} else if (arg0 > 5000) {
			Static247.method6231();
			local22 = 3;
		} else if (arg0 <= 2000) {
			local22 = 1;
			Static27.method681();
		} else {
			local22 = 2;
			Static418.method6758();
		}
		if (Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945() != 2) {
			Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub5_1, 2);
			Static316.method5509(false, 2);
		}
		Static318.method5531();
		return local22;
	}
}
