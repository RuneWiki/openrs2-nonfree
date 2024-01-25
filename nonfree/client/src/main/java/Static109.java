import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!dga", name = "z", descriptor = "I")
	public static int anInt2308;

	@OriginalMember(owner = "client!dga", name = "u", descriptor = "I")
	public static int anInt2309;

	@OriginalMember(owner = "client!dga", name = "t", descriptor = "I")
	public static int anInt2312;

	@OriginalMember(owner = "client!dga", name = "y", descriptor = "I")
	public static int anInt2314;

	@OriginalMember(owner = "client!dga", name = "C", descriptor = "Lclient!sca;")
	public static final Class335 aClass335_4 = new Class335(2);

	@OriginalMember(owner = "client!dga", name = "v", descriptor = "[I")
	public static final int[] anIntArray132 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(III)V")
	public static void method2139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class364 local7 = Static448.aClass364ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static219.method3261(local7.aClass9_Sub1_Sub2_2);
		Static219.method3261(local7.aClass9_Sub1_Sub2_1);
		if (local7.aClass9_Sub1_Sub2_2 != null) {
			local7.aClass9_Sub1_Sub2_2 = null;
		}
		if (local7.aClass9_Sub1_Sub2_1 != null) {
			local7.aClass9_Sub1_Sub2_1 = null;
		}
	}

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "(B)V")
	public static void method2140() {
		Static565.anInt8601 = -1;
		Static265.aClass292_3 = Static95.aClass292_1;
		Static11.anInt525 = 1;
		Static45.method1224("", Static441.aString88, true, Static441.aString88.equals(""));
	}
}
