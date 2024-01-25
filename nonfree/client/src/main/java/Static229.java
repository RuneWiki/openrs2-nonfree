import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
	public static int anInt4393;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "[I")
	public static final int[] anIntArray226 = new int[32];

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "Z")
	public static boolean aBoolean338 = false;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIBIII)V")
	public static void method3852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static119.anInt1918 = arg1;
		Static546.anInt10354 = arg2;
		Static81.anInt1406 = arg3;
		Static680.anInt11080 = arg0;
		Static188.anInt3131 = arg4;
		if (Static188.anInt3131 >= 100) {
			@Pc(29) int local29 = Static81.anInt1406 * 512 + 256;
			@Pc(35) int local35 = Static119.anInt1918 * 512 + 256;
			@Pc(44) int local44 = Static388.method5919(local35, local29, Static391.anInt6811) - Static546.anInt10354;
			@Pc(48) int local48 = local29 - Static70.anInt1085;
			@Pc(52) int local52 = local44 - Static153.anInt2372;
			@Pc(57) int local57 = local35 - anInt4393;
			@Pc(68) int local68 = (int) Math.sqrt((double) (local57 * local57 + local48 * local48));
			Static126.anInt9524 = (int) (Math.atan2((double) local52, (double) local68) * 2607.5945876176133D) & 0x3FFF;
			Static669.anInt10940 = (int) (-2607.5945876176133D * Math.atan2((double) local48, (double) local57)) & 0x3FFF;
			Static470.anInt8100 = 0;
			if (Static126.anInt9524 < 1024) {
				Static126.anInt9524 = 1024;
			}
			if (Static126.anInt9524 > 3072) {
				Static126.anInt9524 = 3072;
			}
		}
		Static304.anInt5410 = 2;
		Static124.anInt2024 = -1;
		Static507.anInt8817 = -1;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIB)Z")
	public static boolean method3853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static438.method6534(arg0, arg1) | (arg1 & 0x800) != 0 || Static497.method7459(arg0, arg1);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIZ)I")
	public static int method3854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 4095 - arg2;
		} else if (local3 == 2) {
			return 4095 - arg1;
		} else {
			return arg2;
		}
	}
}
