import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!hr", name = "q", descriptor = "F")
	public static float aFloat96;

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "Lclient!sl;")
	public static final Class222 aClass222_4 = new Class222("", 11);

	@OriginalMember(owner = "client!hr", name = "s", descriptor = "I")
	public static int anInt3140 = 0;

	@OriginalMember(owner = "client!hr", name = "t", descriptor = "[I")
	public static final int[] anIntArray206 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIII)V")
	public static void method2510(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static391.anInt6869 = arg0;
		Static142.anInt2719 = arg1;
		Static268.anInt4956 = arg2;
		Static399.anInt6965 = arg3;
		Static164.anInt3205 = arg4;
		if (Static391.anInt6869 >= 100) {
			@Pc(28) int local28 = Static164.anInt3205 * 128 + 64;
			@Pc(34) int local34 = Static142.anInt2719 * 128 + 64;
			@Pc(43) int local43 = Static66.method1200(Static301.anInt5383, local28, local34) - Static268.anInt4956;
			@Pc(48) int local48 = local28 - Static225.anInt4310;
			@Pc(53) int local53 = local43 - Static110.anInt2281;
			@Pc(58) int local58 = local34 - Static293.anInt5621;
			@Pc(70) int local70 = (int) Math.sqrt((double) (local48 * local48 + local58 * local58));
			Static293.anInt5622 = (int) (Math.atan2((double) local53, (double) local70) * 2607.5945876176133D) & 0x3FFF;
			Static258.anInt4308 = (int) (Math.atan2((double) local48, (double) local58) * -2607.5945876176133D) & 0x3FFF;
			if (Static293.anInt5622 < 1024) {
				Static293.anInt5622 = 1024;
			}
			Static436.anInt7610 = 0;
			if (Static293.anInt5622 > 3072) {
				Static293.anInt5622 = 3072;
			}
		}
		Static65.anInt7824 = 2;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILjava/util/Random;Z)I")
	public static int method2512(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static74.method1330(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(45) int local45;
			do {
				local45 = arg1.nextInt();
			} while (local45 >= local42);
			return Static216.method3354(local45, arg0);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIII)V")
	public static void method2513(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg2 < arg3) {
			for (local10 = arg2; local10 < arg3; local10++) {
				Static277.anIntArrayArray40[local10][arg0] = arg1;
			}
		} else {
			for (local10 = arg3; local10 < arg2; local10++) {
				Static277.anIntArrayArray40[local10][arg0] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZII)Z")
	public static boolean method2515(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method2516(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static304.anInt5397; local11++) {
			if (arg0.equalsIgnoreCase(Static371.aStringArray36[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static231.aClass4_Sub2_Sub2_Sub1_2.aString48);
	}
}
