import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ct", name = "o", descriptor = "Lclient!ph;")
	public static Class187 aClass187_21;

	@OriginalMember(owner = "client!ct", name = "p", descriptor = "Lclient!vp;")
	public static Class262 aClass262_4;

	@OriginalMember(owner = "client!ct", name = "q", descriptor = "I")
	public static int anInt1162;

	@OriginalMember(owner = "client!ct", name = "n", descriptor = "[I")
	public static final int[] anIntArray95 = new int[6];

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(CI)Z")
	public static boolean method1057(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
	public static void method1059() {
		if (Static274.anInt4796 < 0) {
			return;
		}
		@Pc(19) long local19 = Static220.method3314();
		Static274.anInt4796 = (int) ((long) Static274.anInt4796 + Static351.aLong207 - local19);
		if (Static274.anInt4796 > 0) {
			@Pc(36) int local36 = (Static274.anInt4796 << 8) / Static380.anInt6537;
			@Pc(41) int local41 = 255 - local36;
			@Pc(46) float local46 = (float) local36 / 255.0F;
			Static386.anInt6594 = (local41 * (Static292.aClass184_1.anInt5299 & 0xFF00FF) + local36 * (Static447.anInt6544 & 0xFF00FF) & 0xFF00FF00) + ((Static447.anInt6544 & 0xFF00) * local36 + local41 * (Static292.aClass184_1.anInt5299 & 0xFF00) & 0xFF0000) >>> 8;
			@Pc(83) float local83 = 1.0F - local46;
			Static322.aFloat102 = (Static292.aClass184_1.aFloat95 - Static384.aFloat110) * local83 + Static384.aFloat110;
			Static238.aFloat71 = local83 * (Static292.aClass184_1.aFloat96 - Static419.aFloat120) + Static419.aFloat120;
			Static446.anInt7495 = (local41 * (Static292.aClass184_1.anInt5292 & 0xFF00FF) + (Static17.anInt314 & 0xFF00FF) * local36 & 0xFF00FF00) + ((Static292.aClass184_1.anInt5292 & 0xFF00) * local41 + local36 * (Static17.anInt314 & 0xFF00) & 0xFF0000) >>> 8;
			Static349.aFloat105 = (Static292.aClass184_1.aFloat98 - Static23.aFloat124) * local83 + Static23.aFloat124;
			Static61.aFloat15 = Static164.aFloat67 + (Static292.aClass184_1.aFloat97 - Static164.aFloat67) * local83;
			Static119.aFloat43 = Static40.aFloat11 + (Static292.aClass184_1.aFloat94 - Static40.aFloat11) * local83;
			Static227.aFloat63 = local83 * (Static292.aClass184_1.aFloat93 - Static310.aFloat99) + Static310.aFloat99;
			Static137.anInt2872 = Static292.aClass184_1.anInt5291 * local41 + local36 * Static114.anInt2296 >> 8;
			if (Static292.aClass184_1.aClass30_5 != Static429.aClass30_8) {
				Static447.aClass30_7 = Static56.aClass50_1.method5847(Static429.aClass30_8, Static292.aClass184_1.aClass30_5, local83, Static447.aClass30_7);
			}
		} else {
			Static137.anInt2872 = Static292.aClass184_1.anInt5291;
			Static238.aFloat71 = Static292.aClass184_1.aFloat96;
			Static386.anInt6594 = Static292.aClass184_1.anInt5299;
			Static274.anInt4796 = -1;
			Static119.aFloat43 = Static292.aClass184_1.aFloat94;
			Static447.aClass30_7 = Static292.aClass184_1.aClass30_5;
			Static61.aFloat15 = Static292.aClass184_1.aFloat97;
			Static446.anInt7495 = Static292.aClass184_1.anInt5292;
			Static227.aFloat63 = Static292.aClass184_1.aFloat93;
			Static349.aFloat105 = Static292.aClass184_1.aFloat98;
			Static322.aFloat102 = Static292.aClass184_1.aFloat95;
		}
		Static351.aLong207 = local19;
	}
}
