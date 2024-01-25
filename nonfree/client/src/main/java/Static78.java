import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!cu", name = "t", descriptor = "F")
	public static float aFloat32;

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "Lclient!dc;")
	public static final Class70 aClass70_4 = new Class70();

	@OriginalMember(owner = "client!cu", name = "p", descriptor = "[I")
	public static final int[] anIntArray137 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)V")
	public static void method1222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class228 local7 = Static469.aClass228ArrayArrayArray6[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static324.method4715(local7.aClass12_Sub2_Sub5_1);
		Static324.method4715(local7.aClass12_Sub2_Sub5_2);
		if (local7.aClass12_Sub2_Sub5_1 != null) {
			local7.aClass12_Sub2_Sub5_1 = null;
		}
		if (local7.aClass12_Sub2_Sub5_2 != null) {
			local7.aClass12_Sub2_Sub5_2 = null;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1225(@OriginalArg(1) String arg0) {
		Static316.method4596("", 0, arg0, "", "", 0);
	}
}
