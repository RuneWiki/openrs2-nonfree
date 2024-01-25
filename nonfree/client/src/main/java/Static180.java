import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "Lclient!mg;")
	public static Class160 aClass160_30;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)Z")
	public static boolean method2884() {
		try {
			if (Static237.anInt4548 == 2) {
				if (Static167.aClass2_Sub27_1 == null) {
					Static167.aClass2_Sub27_1 = Static462.method3893(Static74.aClass160_9, Static71.anInt1577, Static436.anInt7186);
					if (Static167.aClass2_Sub27_1 == null) {
						return false;
					}
				}
				if (Static281.aClass105_10 == null) {
					Static281.aClass105_10 = new Class105(Static359.aClass160_71, Static316.aClass160_62);
				}
				if (Static335.aClass2_Sub3_Sub4_2.method4652(Static394.aClass160_75, Static281.aClass105_10, Static167.aClass2_Sub27_1)) {
					Static335.aClass2_Sub3_Sub4_2.method4623();
					Static335.aClass2_Sub3_Sub4_2.method4648(Static237.anInt4547);
					Static335.aClass2_Sub3_Sub4_2.method4630(Static167.aClass2_Sub27_1, Static263.aBoolean350);
					Static237.anInt4548 = 0;
					Static281.aClass105_10 = null;
					Static167.aClass2_Sub27_1 = null;
					Static74.aClass160_9 = null;
					return true;
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static335.aClass2_Sub3_Sub4_2.method4626();
			Static74.aClass160_9 = null;
			Static237.anInt4548 = 0;
			Static167.aClass2_Sub27_1 = null;
			Static281.aClass105_10 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public static void method2885() {
		if (Static381.anIntArray532 != null && Static90.anIntArray171 != null) {
			return;
		}
		Static90.anIntArray171 = new int[256];
		Static381.anIntArray532 = new int[256];
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(31) double local31 = (double) local22 / 255.0D * 6.283185307179586D;
			Static381.anIntArray532[local22] = (int) (Math.sin(local31) * 4096.0D);
			Static90.anIntArray171[local22] = (int) (Math.cos(local31) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIII)I")
	public static int method2888(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class162.anIntArray387[arg1 * 8192 / arg0] >> 1;
		return (arg3 * (65536 - local21) >> 16) + (arg2 * local21 >> 16);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(FFFFLclient!gl;II[BIIIFI)V")
	public static void method2889(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class87 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(11) float arg7) {
		for (@Pc(13) int local13 = 0; local13 < 16; local13++) {
			Static230.method3597(local13, arg2, arg6, arg5, arg7, arg4, arg0, arg3, arg1);
			arg5 += 16384;
		}
	}
}
