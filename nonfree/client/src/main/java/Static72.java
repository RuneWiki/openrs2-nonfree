import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "[I")
	public static int[] anIntArray35;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "[Lclient!mi;")
	public static final Class59[] aClass59Array2 = new Class59[6];

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_125 = Static181.method2795("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_126 = Static181.method2795("leuchten3:");

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZI)Z")
	public static boolean method416(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!rb;III)V")
	public static void method417(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class2_Sub23 local12;
		if (arg2 < Static35.anInt916) {
			local12 = Static203.aClass2_Sub23ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass26_1 != null && local12.aClass26_1.aClass24_1.method2979()) {
				arg0.method2976(local12.aClass26_1.aClass24_1, 128, 0, 0, true);
			}
		}
		if (arg3 < Static35.anInt916) {
			local12 = Static203.aClass2_Sub23ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass26_1 != null && local12.aClass26_1.aClass24_1.method2979()) {
				arg0.method2976(local12.aClass26_1.aClass24_1, 0, 0, 128, true);
			}
		}
		if (arg2 < Static35.anInt916 && arg3 < Static31.anInt825) {
			local12 = Static203.aClass2_Sub23ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass26_1 != null && local12.aClass26_1.aClass24_1.method2979()) {
				arg0.method2976(local12.aClass26_1.aClass24_1, 128, 0, 128, true);
			}
		}
		if (arg2 < Static35.anInt916 && arg3 > 0) {
			local12 = Static203.aClass2_Sub23ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass26_1 != null && local12.aClass26_1.aClass24_1.method2979()) {
				arg0.method2976(local12.aClass26_1.aClass24_1, 128, 0, -128, true);
			}
		}
	}
}
