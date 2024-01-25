import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static173 {

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "[I")
	public static int[] anIntArray687;

	@OriginalMember(owner = "client!gaa", name = "d", descriptor = "Lclient!oj;")
	public static final Class183 aClass183_2 = Static166.method1422();

	@OriginalMember(owner = "client!gaa", name = "f", descriptor = "Lclient!rq;")
	public static final Class306 aClass306_14 = new Class306();

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIZ)Z")
	public static boolean method8449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V")
	public static void method8450() {
		Static17.method248();
		Static319.aBoolean356 = false;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BLclient!kp;)Ljava/lang/String;")
	public static String method8451(@OriginalArg(1) Class2_Sub2_Sub12 arg0) {
		return arg0.aString52 + " <col=ffffff>>";
	}
}
