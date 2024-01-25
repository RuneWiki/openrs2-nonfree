import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!ri", name = "Qc", descriptor = "Z")
	public static boolean aBoolean361 = false;

	@OriginalMember(owner = "client!ri", name = "Uc", descriptor = "Ljava/lang/String;")
	public static String aString221 = "flash3:";

	@OriginalMember(owner = "client!ri", name = "Wc", descriptor = "Ljava/lang/String;")
	public static String aString222 = " more options";

	@OriginalMember(owner = "client!ri", name = "bd", descriptor = "Ljava/lang/String;")
	public static String aString223 = "Loading fonts - ";

	@OriginalMember(owner = "client!ri", name = "id", descriptor = "I")
	public static int anInt5181 = -1;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIZZ)Lclient!dp;")
	public static Class53 method4724(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) boolean arg2) {
		@Pc(10) Class197 local10 = null;
		if (Static268.aClass174_3 != null) {
			local10 = new Class197(arg0, Static268.aClass174_3, Static265.aClass174Array1[arg0], 1000000);
		}
		Static121.aClass98_Sub1Array3[arg0] = Static345.aClass124_1.method3324(arg0, Static260.aClass197_3, local10);
		if (arg2) {
			Static121.aClass98_Sub1Array3[arg0].method4147();
		}
		return new Class53(Static121.aClass98_Sub1Array3[arg0], arg1, 1);
	}
}
