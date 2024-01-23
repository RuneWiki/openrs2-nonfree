import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "F")
	public static float aFloat96;

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "F")
	public static float aFloat97;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray25 = new String[500];

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
	public static int anInt3255 = 0;

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "[I")
	public static int[] anIntArray277 = new int[14];

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)I")
	public static int method2814() {
		return Static309.aBoolean379 && Static32.aBooleanArray9[81] && Static110.anInt2281 > 2 ? Static21.anIntArray19[Static110.anInt2281 - 2] : Static21.anIntArray19[Static110.anInt2281 - 1];
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)Lclient!am;")
	public static Class11 method2816(@OriginalArg(0) int arg0) {
		@Pc(10) Class11 local10 = (Class11) Static194.aClass187_103.method4527((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static255.aClass121_113.method3115(32, arg0);
		local10 = new Class11();
		if (local22 != null) {
			local10.method173(new Class1_Sub14(local22));
		}
		local10.method169();
		Static194.aClass187_103.method4524((long) arg0, local10);
		return local10;
	}
}
