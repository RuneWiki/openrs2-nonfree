import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!li", name = "q", descriptor = "Lclient!ph;")
	public static Class138 aClass138_46;

	@OriginalMember(owner = "client!li", name = "r", descriptor = "Lclient!ph;")
	public static Class138 aClass138_47;

	@OriginalMember(owner = "client!li", name = "t", descriptor = "[I")
	public static int[] anIntArray269 = new int[32];

	@OriginalMember(owner = "client!li", name = "x", descriptor = "I")
	public static int anInt3329 = 0;

	@OriginalMember(owner = "client!li", name = "e", descriptor = "(III)Z")
	public static boolean method2678(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(11) Class43 local11 = Static189.method3080(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local11.method1008(arg1);
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
	public static void method2680() {
		if (Static245.aBoolean177) {
			return;
		}
		Static245.aBoolean177 = true;
		if (Static51.aBoolean77) {
			Static2.aFloat1 = (int) Static2.aFloat1 - 65 & 0xFFFFFF80;
		} else {
			Static287.aFloat54 += (-24.0F - Static287.aFloat54) / 2.0F;
		}
		Static104.aBoolean149 = true;
	}

	@OriginalMember(owner = "client!li", name = "f", descriptor = "(III)I")
	public static int method2681(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg1 + arg0 * 57;
		@Pc(11) int local11 = local5 ^ local5 << 13;
		@Pc(37) int local37 = Integer.MAX_VALUE & (local11 * local11 * 15731 + 789221) * local11 + 1376312589;
		return local37 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V")
	public static void method2682() {
		Static111.aClass169_65.method4014();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BIIII)V")
	public static void method2683(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static140.anInt2753 = -1;
		Static280.anInt5336 = -1;
		@Pc(13) float local13 = (float) Static58.anInt2563 / (float) Static58.anInt2561;
		@Pc(15) int local15 = arg1;
		@Pc(22) int local22 = arg3;
		if (local13 < 1.0F) {
			local22 = (int) ((float) arg1 * local13);
		} else {
			local15 = (int) ((float) arg3 / local13);
		}
		@Pc(49) int local49 = arg2 - (arg3 - local22) / 2;
		@Pc(58) int local58 = arg0 - (arg1 - local15) / 2;
		Static72.anInt1374 = Static58.anInt2561 * local58 / local15;
		Static75.anInt1427 = local49 * Static58.anInt2563 / local22;
		Static97.method1402();
	}
}
