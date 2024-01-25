import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(BC)Z")
	public static boolean method1900(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZBIZI)Lclient!ci;")
	public static Class38 method1901(@OriginalArg(0) boolean arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(5) Class269 local5 = null;
		if (Static251.aClass159_2 != null) {
			local5 = new Class269(arg2, Static251.aClass159_2, Static265.aClass159Array1[arg2], 1000000);
		}
		Static296.aClass79_Sub1Array3[arg2] = Static277.aClass171_4.method4286(arg2, Static219.aClass269_3, local5);
		if (arg1) {
			Static296.aClass79_Sub1Array3[arg2].method2233();
		}
		return new Class38(Static296.aClass79_Sub1Array3[arg2], arg0, 1);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I[FI)[F")
	public static float[] method1902(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static474.method3328(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)Z")
	public static boolean method1903(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}
