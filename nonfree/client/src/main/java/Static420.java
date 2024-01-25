import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "[[F")
	public static final float[][] aFloatArrayArray6 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
	public static void method5520() {
		Static260.method3743(false);
		if (Static278.anInt5921 >= 0 && Static278.anInt5921 != 0) {
			Static178.method2951(Static278.anInt5921);
			Static278.anInt5921 = -1;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "()V")
	public static void method5521() {
		Static299.method3748(Static285.anInt5004);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIII)I")
	public static int method5522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BB)V")
	public static void method5524(@OriginalArg(0) byte arg0) {
		if (Static255.aByteArrayArrayArray16 == null) {
			Static255.aByteArrayArrayArray16 = new byte[4][Static2.anInt7][Static17.anInt315];
		}
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			for (@Pc(26) int local26 = 0; local26 < Static2.anInt7; local26++) {
				for (@Pc(30) int local30 = 0; local30 < Static17.anInt315; local30++) {
					Static255.aByteArrayArrayArray16[local22][local26][local30] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(IIII)I")
	public static int method5525(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static181.aByteArrayArrayArray15[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static181.aByteArrayArrayArray15[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}
}
