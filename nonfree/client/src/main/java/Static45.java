import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "[I")
	public static final int[] anIntArray568 = new int[4];

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!f;B)Ljava/lang/String;")
	public static String method8618(@OriginalArg(0) Class6_Sub5_Sub11 arg0) {
		return arg0.aString28 + " <col=ffffff>>";
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)Lclient!ega;")
	public static Class81 method8619(@OriginalArg(0) int arg0) {
		@Pc(17) Class81 local17 = (Class81) Static506.aClass94_47.method2960((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static35.aClass223_10.method5954(arg0, 1);
		local17 = new Class81();
		local17.anInt3153 = arg0;
		if (local27 != null) {
			local17.method2645(new Class6_Sub8(local27));
		}
		local17.method2648();
		if (local17.anInt3151 == 2 && Static514.aClass380_39.method8747((long) arg0) == null) {
			Static514.aClass380_39.method8753(new Class6_Sub37(Static481.anInt8517), (long) arg0);
			Static574.aClass81Array1[Static481.anInt8517++] = local17;
		}
		Static506.aClass94_47.method2963((long) arg0, local17);
		return local17;
	}
}
