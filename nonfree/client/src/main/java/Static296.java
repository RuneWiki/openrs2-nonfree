import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "[[Lclient!wl;")
	public static Class2_Sub32[][] aClass2_Sub32ArrayArray4;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
	public static int anInt5741;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray44;

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "Lclient!sf;")
	public static Class157 aClass157_44 = new Class157(64);

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "Z")
	public static boolean aBoolean383 = false;

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
	public static int anInt5746 = 0;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
	public static void method4528() {
		Static211.aClass2_Sub16_Sub1_2.method2198(189);
		for (@Pc(18) Class2_Sub4 local18 = (Class2_Sub4) Static132.aClass101_8.method2868(); local18 != null; local18 = (Class2_Sub4) Static132.aClass101_8.method2859()) {
			if (local18.anInt278 == 0) {
				Static225.method4281(local18, true);
			}
		}
		if (Static159.aClass56_17 != null) {
			Static287.method4466(Static159.aClass56_17);
			Static159.aClass56_17 = null;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI)I")
	public static int method4529(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static3.method81(arg0 + 91923, arg1 + 45365, 4) + (Static3.method81(arg0 + 37821, arg1 + 10294, 2) + -128 >> 1) + (Static3.method81(arg0, arg1, 1) - 128 >> 2) - 128;
		local41 = (int) ((double) local41 * 0.3D) + 35;
		if (local41 < 10) {
			local41 = 10;
		} else if (local41 > 60) {
			local41 = 60;
		}
		return local41;
	}
}
