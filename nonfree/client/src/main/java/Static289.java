import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!se", name = "g", descriptor = "I")
	public static int anInt5545;

	@OriginalMember(owner = "client!se", name = "j", descriptor = "[I")
	public static int[] anIntArray417;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "Lclient!gi;")
	public static final Class72 aClass72_1 = new Class72();

	@OriginalMember(owner = "client!se", name = "f", descriptor = "Lclient!fi;")
	public static Class66 aClass66_97 = new Class66(64);

	@OriginalMember(owner = "client!se", name = "h", descriptor = "[I")
	public static final int[] anIntArray416 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!se", name = "i", descriptor = "I")
	public static final int anInt5546 = 52;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!lj;IIII)V")
	public static void method4917(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static331.method5535(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static12.anInt378) {
			Static331.method5535(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static331.method5535(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static248.anInt4822) {
			Static331.method5535(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static248.anInt4822) {
			Static331.method5535(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static12.anInt378 && arg4 <= Static248.anInt4822) {
			Static331.method5535(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static331.method5535(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static12.anInt378 && arg4 > 0) {
			Static331.method5535(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public static void method4918() {
		if (Static125.anInt2611 < 0) {
			return;
		}
		@Pc(13) long local13 = Static284.method4783();
		Static125.anInt2611 = (int) ((long) Static125.anInt2611 + Static153.aLong115 - local13);
		if (Static125.anInt2611 <= 0) {
			Static216.anInt4322 = Static27.aClass6_4.anInt186;
			Static125.anInt2611 = -1;
			Static49.anInt1234 = Static27.aClass6_4.anInt190;
			Static3.aFloat102 = Static27.aClass6_4.aFloat8;
			Static352.aFloat104 = Static27.aClass6_4.aFloat3;
			Static52.anInt1317 = Static27.aClass6_4.anInt188;
			Static4.aClass18_1 = Static27.aClass6_4.aClass18_2;
			Static57.aFloat20 = Static27.aClass6_4.aFloat6;
			Static88.aFloat24 = Static27.aClass6_4.aFloat7;
			Static95.aFloat101 = Static27.aClass6_4.aFloat4;
			Static126.aFloat34 = Static27.aClass6_4.aFloat5;
		} else {
			@Pc(67) int local67 = (Static125.anInt2611 << 8) / Static22.anInt581;
			@Pc(72) int local72 = 255 - local67;
			@Pc(77) float local77 = (float) local67 / 255.0F;
			Static216.anInt4322 = (local72 * (Static27.aClass6_4.anInt186 & 0xFF00FF) + (Static244.anInt4743 & 0xFF00FF) * local67 & 0xFF00FF00) + (local67 * (Static244.anInt4743 & 0xFF00) + (local72 * (Static27.aClass6_4.anInt186 & 0xFF00)) & 0xFF0000) >>> 8;
			@Pc(114) float local114 = 1.0F - local77;
			Static49.anInt1234 = (local72 * (Static27.aClass6_4.anInt190 & 0xFF00FF) + local67 * (Static336.anInt5414 & 0xFF00FF) & 0xFF00FF00) + (local72 * (Static27.aClass6_4.anInt190 & 0xFF00) + local67 * (Static336.anInt5414 & 0xFF00) & 0xFF0000) >>> 8;
			Static52.anInt1317 = Static27.aClass6_4.anInt188 * local72 + Static19.anInt541 * local67 >> 8;
			Static3.aFloat102 = (Static27.aClass6_4.aFloat8 - Static343.aFloat103) * local114 + Static343.aFloat103;
			Static88.aFloat24 = Static76.aFloat93 + (Static27.aClass6_4.aFloat7 - Static76.aFloat93) * local114;
			Static57.aFloat20 = Static330.aFloat30 + (Static27.aClass6_4.aFloat6 - Static330.aFloat30) * local114;
			Static352.aFloat104 = (Static27.aClass6_4.aFloat3 - Static300.aFloat97) * local114 + Static300.aFloat97;
			Static95.aFloat101 = local114 * (Static27.aClass6_4.aFloat4 - Static28.aFloat14) + Static28.aFloat14;
			Static126.aFloat34 = Static202.aFloat65 + local114 * (Static27.aClass6_4.aFloat5 - Static202.aFloat65);
			if (Static66.aClass18_3 != Static27.aClass6_4.aClass18_2) {
				Static4.aClass18_1 = Static26.aClass59_2.method4836(Static66.aClass18_3, Static27.aClass6_4.aClass18_2, local114, Static4.aClass18_1);
			}
		}
		Static153.aLong115 = local13;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIB)Z")
	public static boolean method4920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((Static32.aByteArrayArrayArray4[0][arg0][arg3] & 0x2) != 0) {
			return true;
		} else if ((Static32.aByteArrayArrayArray4[arg2][arg0][arg3] & 0x10) == 0) {
			return arg1 == Static81.method1794(arg3, arg2, arg0);
		} else {
			return false;
		}
	}
}
