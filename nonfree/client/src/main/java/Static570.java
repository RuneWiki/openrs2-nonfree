import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "Lclient!sea;")
	public static Class308 aClass308_189;

	@OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
	public static int anInt9417;

	@OriginalMember(owner = "client!wa", name = "L", descriptor = "[I")
	public static final int[] anIntArray593 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!wa", name = "xb", descriptor = "I")
	public static int anInt9433 = 0;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)[Lclient!ma;")
	public static Class216[] method7672() {
		return new Class216[] { Static148.aClass216_6, Static321.aClass216_9, Static564.aClass216_13 };
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method7674(@OriginalArg(0) String arg0) {
		return Static43.method753(arg0);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
	public static void method7676() {
		Static115.aClass160ArrayArray1 = new Class160[Static123.aClass308_49.method6564()][];
		Static549.aClass160ArrayArray2 = new Class160[Static123.aClass308_49.method6564()][];
		Static502.aBooleanArray32 = new boolean[Static123.aClass308_49.method6564()];
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)Lclient!wg;")
	public static Class360 method7679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static568.aClass360ArrayArrayArray22[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static568.aClass360ArrayArrayArray22[0][arg1][arg2] != null && Static568.aClass360ArrayArrayArray22[0][arg1][arg2].aClass360_1 != null;
			if (local28 && arg0 >= Static119.anInt2474 - 1) {
				return null;
			}
			Static419.method5955(arg0, arg1, arg2);
		}
		return Static568.aClass360ArrayArrayArray22[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)I")
	public static int method7680() {
		return Static411.anIntArray437 == null ? 0 : Static411.anIntArray437.length * 2;
	}
}
