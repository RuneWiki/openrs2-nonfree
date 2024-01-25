import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_74 = new Class144(6, -1);

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(B[FI)[F")
	public static float[] method6529(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static732.method6315(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)V")
	public static void method6530(@OriginalArg(0) int arg0) {
		Static265.aClass292_3 = Static95.aClass292_2;
		Static11.anInt525 = 2;
		Static565.anInt8601 = arg0;
		Static45.method1224("", Static441.aString88, true, Static441.aString88.equals(""));
	}
}
