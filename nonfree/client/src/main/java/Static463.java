import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!pw", name = "h", descriptor = "Lclient!cp;")
	public static Class70 aClass70_2;

	@OriginalMember(owner = "client!pw", name = "m", descriptor = "I")
	public static int anInt7832;

	@OriginalMember(owner = "client!pw", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray47 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(III)I")
	public static int method6623(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(23) byte local23;
		if (arg0 > 20000) {
			local23 = 4;
			Static115.method2132();
		} else if (arg0 > 10000) {
			local23 = 3;
			Static428.method6320();
		} else if (arg0 > 5000) {
			Static274.method4251();
			local23 = 2;
		} else {
			Static418.method6228();
			local23 = 1;
		}
		if (Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616() != arg1) {
			Static172.aClass5_Sub50_14.method7531(arg1, Static172.aClass5_Sub50_14.aClass12_Sub16_1);
			Static428.method6321(arg1, false);
		}
		Static102.method1995();
		return local23;
	}
}
