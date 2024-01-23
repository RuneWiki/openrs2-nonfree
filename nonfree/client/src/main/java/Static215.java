import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!pf", name = "B", descriptor = "Lclient!ek;")
	public static Class42 aClass42_67;

	@OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
	public static int anInt4395;

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
	public static int anInt4386 = 0;

	@OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
	public static int anInt4387 = 0;

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "Lclient!sf;")
	public static Class157 aClass157_36 = new Class157(5);

	@OriginalMember(owner = "client!pf", name = "A", descriptor = "[I")
	public static int[] anIntArray441 = new int[14];

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILclient!g;)I")
	public static int method3576(@OriginalArg(0) int arg0, @OriginalArg(2) Class56 arg1) {
		if (!Static42.method804(arg1).method331(arg0) && arg1.anObjectArray13 == null) {
			return -1;
		} else if (arg1.anIntArray184 == null || arg1.anIntArray184.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray184[arg0];
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BD)V")
	public static void method3577(@OriginalArg(1) double arg0) {
		if (Static131.aDouble9 == arg0) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(30) int local30 = (int) (Math.pow((double) local15 / 255.0D, arg0) * 255.0D);
			Static256.anIntArray488[local15] = local30 <= 255 ? local30 : 255;
		}
		Static131.aDouble9 = arg0;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BJ)V")
	public static void method3579(@OriginalArg(1) long arg0) {
		if (!Static41.aBoolean65) {
			Static148.aFloat33 += (float) arg0 * Static231.aFloat46 / 40.0F;
			Static239.aFloat51 += Static102.aFloat11 * (float) arg0 / 40.0F;
		}
		@Pc(34) int local34 = Static75.anInt1869;
		@Pc(46) int local46;
		@Pc(54) int local54;
		if (local34 != Static254.anInt4978) {
			local46 = local34 - Static254.anInt4978;
			local54 = (int) (arg0 * (long) local46 / 320L);
			if (local46 > 0) {
				if (local54 == 0) {
					local54 = 1;
				} else if (local54 > local46) {
					local54 = local46;
				}
			} else if (local54 == 0) {
				local54 = -1;
			} else if (local46 > local54) {
				local54 = local46;
			}
			Static254.anInt4978 += local54;
		}
		@Pc(95) int local95 = Static279.anInt5490;
		if (local95 != Static101.anInt2397) {
			local46 = local95 - Static101.anInt2397;
			local54 = (int) (arg0 * (long) local46 / 320L);
			if (local46 <= 0) {
				if (local54 == 0) {
					local54 = -1;
				} else if (local54 < local46) {
					local54 = local46;
				}
			} else if (local54 == 0) {
				local54 = 1;
			} else if (local54 > local46) {
				local54 = local46;
			}
			Static101.anInt2397 += local54;
		}
		Static279.method4342();
	}
}
