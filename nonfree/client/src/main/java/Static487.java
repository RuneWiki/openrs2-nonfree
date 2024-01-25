import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!so", name = "e", descriptor = "I")
	public static final int anInt8218 = 1406;

	@OriginalMember(owner = "client!so", name = "g", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_126 = new Class47(46, 7);

	@OriginalMember(owner = "client!so", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString87 = null;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!go;[[BI)V")
	public static void method6671(@OriginalArg(0) Class115_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(16) int[] local16 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(18) int local18 = 0; local18 < arg0.anInt3545; local18++) {
			Static482.method6632();
			for (@Pc(24) int local24 = 0; local24 < Static473.anInt8075 >> 3; local24++) {
				for (@Pc(28) int local28 = 0; local28 < Static165.anInt6749 >> 3; local28++) {
					@Pc(38) int local38 = Static553.anIntArrayArrayArray20[local18][local24][local28];
					if (local38 != -1) {
						@Pc(47) int local47 = local38 >> 24 & 0x3;
						if (!arg0.aBoolean249 || local47 == 0) {
							@Pc(58) int local58 = local38 >> 1 & 0x3;
							@Pc(64) int local64 = local38 >> 14 & 0x3FF;
							@Pc(70) int local70 = local38 >> 3 & 0x7FF;
							@Pc(80) int local80 = local70 / 8 + (local64 / 8 << 8);
							for (@Pc(82) int local82 = 0; local82 < Static365.anIntArray477.length; local82++) {
								if (Static365.anIntArray477[local82] == local80 && arg1[local82] != null) {
									@Pc(100) Class6_Sub21 local100 = new Class6_Sub21(arg1[local82]);
									arg0.method3141(local64, local47, local28 * 8, local24 * 8, local58, Static579.aClass189Array4, local70, local18, local100);
									arg0.method3156(local47, local70, local64, local28 * 8, local100, Static240.aClass14_7, local16[0] == -1 ? local16 : null, local58, local24 * 8, local18);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local16[0] != -1) {
			Static385.aClass268_1 = Static209.aClass270_1.method6106(local16[1], Static230.aClass306_1, local16[2], local16[0], local16[3]);
			Static596.anInt9622 = local16[4];
		}
	}
}
