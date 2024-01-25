import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ba", name = "w", descriptor = "[I")
	public static final int[] anIntArray40 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!ba", name = "L", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_7 = new Class177(63, 8);

	@OriginalMember(owner = "client!ba", name = "O", descriptor = "[I")
	public static final int[] anIntArray41 = new int[5];

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(IIII)Lclient!ou;")
	public static Class30_Sub1_Sub1 method492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class252 local11 = Static67.aClass252ArrayArrayArray2[arg2][arg0][arg1];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class30_Sub1_Sub1 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class208 local22 = local11.aClass208_3; local22 != null; local22 = local22.aClass208_2) {
			@Pc(26) Class30_Sub1 local26 = local22.aClass30_Sub1_1;
			if (local26 instanceof Class30_Sub1_Sub1) {
				@Pc(32) Class30_Sub1_Sub1 local32 = (Class30_Sub1_Sub1) local26;
				@Pc(42) int local42 = (local32.method944() - 1) * 64 + 60;
				@Pc(50) int local50 = local32.anInt7490 - local42 >> 7;
				@Pc(57) int local57 = local32.anInt7488 - local42 >> 7;
				@Pc(64) int local64 = local42 + local32.anInt7490 >> 7;
				@Pc(71) int local71 = local42 + local32.anInt7488 >> 7;
				if (local50 <= arg0 && arg1 >= local57 && arg0 <= local64 && arg1 <= local71) {
					@Pc(105) int local105 = (local64 + 1 - arg0) * (local71 + 1 + -arg1);
					if (local19 < local105) {
						local19 = local105;
						local17 = local32;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V")
	public static void method493() {
		if (Static367.anInt6719 == 1 || Static367.anInt6719 == 3 || Static140.anInt3082 != Static367.anInt6719 && (Static367.anInt6719 == 0 || Static140.anInt3082 == 0)) {
			Static197.anInt4078 = 0;
			Static127.anInt2832 = 0;
			Static24.aClass38_3.method774();
		}
		Static140.anInt3082 = Static367.anInt6719;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IFFI[BIFFFIIILclient!al;)V")
	public static void method496(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(6) float arg4, @OriginalArg(7) float arg5, @OriginalArg(8) float arg6, @OriginalArg(12) Class12 arg7) {
		for (@Pc(1) int local1 = 0; local1 < 16; local1++) {
			Static142.method2274(local1, arg0, arg4, arg6, arg2, arg3, arg7, arg5, arg1);
			arg2 += 16384;
		}
	}
}
