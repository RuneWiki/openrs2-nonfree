import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "Lclient!jr;")
	public static final Class127 aClass127_13 = new Class127(16);

	@OriginalMember(owner = "client!gh", name = "s", descriptor = "[F")
	public static final float[] aFloatArray22 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!gh", name = "u", descriptor = "[I")
	public static final int[] anIntArray234 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ)V")
	public static void method2286(@OriginalArg(0) int arg0) {
		Static27.anInt771 = 100;
		Static166.anInt3528 = -1;
		Static284.anInt5213 = 3;
		Static411.anInt7104 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(III)I")
	public static int method2287(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static18.method542(arg0 + 45365, arg1 - -91923, 4) + (Static18.method542(arg0 + 10294, arg1 + 37821, 2) + -128 >> 1) + (Static18.method542(arg0, arg1, 1) + -128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLclient!dn;)V")
	public static void method2288(@OriginalArg(1) Class56 arg0) {
		Static221.aClass56_54 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[[BLclient!bi;)V")
	public static void method2289(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class4_Sub1 arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg1.anInt808; local13++) {
			Static143.method2556();
			for (@Pc(19) int local19 = 0; local19 < Static399.anInt6923 >> 3; local19++) {
				for (@Pc(23) int local23 = 0; local23 < Static127.anInt2696 >> 3; local23++) {
					@Pc(33) int local33 = Static192.anIntArrayArrayArray11[local13][local19][local23];
					if (local33 != -1) {
						@Pc(42) int local42 = local33 >> 24 & 0x3;
						if (!arg1.aBoolean46 || local42 == 0) {
							@Pc(53) int local53 = local33 >> 1 & 0x3;
							@Pc(59) int local59 = local33 >> 14 & 0x3FF;
							@Pc(65) int local65 = local33 >> 3 & 0x7FF;
							@Pc(75) int local75 = local65 / 8 + (local59 / 8 << 8);
							for (@Pc(77) int local77 = 0; local77 < Static289.anIntArray407.length; local77++) {
								if (Static289.anIntArray407[local77] == local75 && arg0[local77] != null) {
									arg1.method758(local42, local23 * 8, arg0[local77], Static266.aClass75_7, (local59 & 0x7) * 8, (local65 & 0x7) * 8, Static389.aClass23Array1, local13, local53, local19 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
