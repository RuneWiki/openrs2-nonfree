import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static162 {

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
	public static int anInt3216 = 0;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Z")
	public static boolean aBoolean205 = false;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!lc;ILclient!lc;)V")
	public static void method2521(@OriginalArg(0) Class98 arg0, @OriginalArg(2) Class98 arg1) {
		Static79.aClass4_Sub2_Sub12_2 = Static80.method1247(arg1, Static121.anInt2643, arg0);
		if (Static178.aBoolean216) {
			Static16.aClass4_Sub2_Sub12_Sub1_1 = Static171.method2691(Static121.anInt2643, arg1, arg0);
		} else {
			Static16.aClass4_Sub2_Sub12_Sub1_1 = (Class4_Sub2_Sub12_Sub1) Static79.aClass4_Sub2_Sub12_2;
		}
		Static49.aClass4_Sub2_Sub12_1 = Static80.method1247(arg1, Static148.anInt3010, arg0);
		Static289.aClass4_Sub2_Sub12_3 = Static80.method1247(arg1, Static17.anInt373, arg0);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLclient!cc;I)I")
	public static int method2522(@OriginalArg(1) Class22 arg0, @OriginalArg(2) int arg1) {
		if (!Static40.method681(arg0).method2833(arg1) && arg0.anObjectArray10 == null) {
			return -1;
		} else if (arg0.anIntArray61 == null || arg0.anIntArray61.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray61[arg1];
		}
	}
}
