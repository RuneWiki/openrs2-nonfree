import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "Lclient!ij;")
	public static Class93 aClass93_139;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_151 = new Class85("yellow:", "", "", "");

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
	public static int anInt6833 = 0;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "[I")
	public static final int[] anIntArray645 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIZI)V")
	public static void method6048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class65 local14 = Static42.aClass65ArrayArray1[arg0][arg1];
		Static325.method5631(local14 == null ? Static322.aClass65_3 : local14, 5000);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)V")
	public static void method6049(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static98.aBooleanArray8[arg0]) {
			return;
		}
		Static248.aClass93_95.method2404(arg0);
		if (Static304.aClass201ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(32) boolean local32 = true;
		for (@Pc(34) int local34 = 0; local34 < Static304.aClass201ArrayArray1[arg0].length; local34++) {
			if (Static304.aClass201ArrayArray1[arg0][local34] != null) {
				if (Static304.aClass201ArrayArray1[arg0][local34].anInt6559 == 2) {
					local32 = false;
				} else {
					Static304.aClass201ArrayArray1[arg0][local34] = null;
				}
			}
		}
		if (local32) {
			Static304.aClass201ArrayArray1[arg0] = null;
		}
		Static98.aBooleanArray8[arg0] = false;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!ij;I)V")
	public static void method6050(@OriginalArg(0) Class93 arg0) {
		Static133.aClass93_52 = arg0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	public static void method6055() {
		Static44.aClass109_15.method2850();
		Static143.aClass109_33.method2850();
		Static308.aClass109_57.method2850();
		Static272.aClass109_49.method2850();
		Static11.aClass109_4.method2850();
	}
}
