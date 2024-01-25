import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "Lclient!aw;")
	public static Class25 aClass25_3;

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "F")
	public static float aFloat126;

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "Lclient!aga;")
	public static Class13 aClass13_2;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)Z")
	public static boolean method3315(@OriginalArg(0) int arg0) {
		if (arg0 == 22 || arg0 == 47 || arg0 == 18 || arg0 == 51 || arg0 == 1009) {
			return true;
		} else {
			return arg0 == 19 || arg0 == 1008;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZIII)Lclient!pl;")
	public static Class259 method3316(@OriginalArg(0) boolean arg0, @OriginalArg(3) int arg1) {
		@Pc(10) Class207 local10 = null;
		if (Static393.aClass64_5 != null) {
			local10 = new Class207(arg1, Static393.aClass64_5, Static459.aClass64Array1[arg1], 1000000);
		}
		Static443.aClass251_Sub1Array2[arg1] = Static55.aClass176_2.method3951(arg1, Static248.aClass207_1, local10);
		Static443.aClass251_Sub1Array2[arg1].method5864();
		return new Class259(Static443.aClass251_Sub1Array2[arg1], arg0, 1);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(FIIFF)F")
	public static float method3318(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(15) float[] local15 = Static553.aFloatArrayArray15[arg1];
		return arg2 * local15[2] + local15[0] * arg3 + local15[1] * arg0;
	}
}
