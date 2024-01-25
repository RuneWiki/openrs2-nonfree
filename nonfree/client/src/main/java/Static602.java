import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static602 {

	@OriginalMember(owner = "client!vha", name = "d", descriptor = "[Lclient!vca;")
	public static Class358[] aClass358Array1;

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray70 = new int[6][];

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(ILclient!vj;)Ljava/lang/String;")
	public static String method8117(@OriginalArg(1) Class2_Sub22 arg0) {
		return Static264.method3724(arg0);
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(BI)Z")
	public static boolean method8118(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}
}
