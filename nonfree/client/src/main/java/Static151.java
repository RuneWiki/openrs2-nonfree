import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!il", name = "s", descriptor = "Lclient!et;")
	public static Class70 aClass70_6;

	@OriginalMember(owner = "client!il", name = "i", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_120 = new Class208(67, 15);

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
	public static void method3886() {
		@Pc(1) Class41 local1 = Static281.aClass41_61;
		synchronized (Static281.aClass41_61) {
			Static281.aClass41_61.method825();
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(III)Z")
	public static boolean method3887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static165.anInt3409; local1++) {
			@Pc(6) Class153 local6 = Static299.aClass153Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt4374 == 1) {
				local15 = local6.anInt4382 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt4377 + (local6.anInt4379 * local15 >> 8);
					local37 = local6.anInt4370 + (local6.anInt4365 * local15 >> 8);
					local47 = local6.anInt4372 + (local6.anInt4368 * local15 >> 8);
					local57 = local6.anInt4361 + (local6.anInt4366 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4374 == 2) {
				local15 = arg0 - local6.anInt4382;
				if (local15 > 0) {
					local27 = local6.anInt4377 + (local6.anInt4379 * local15 >> 8);
					local37 = local6.anInt4370 + (local6.anInt4365 * local15 >> 8);
					local47 = local6.anInt4372 + (local6.anInt4368 * local15 >> 8);
					local57 = local6.anInt4361 + (local6.anInt4366 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4374 == 3) {
				local15 = local6.anInt4377 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt4382 + (local6.anInt4371 * local15 >> 8);
					local37 = local6.anInt4363 + (local6.anInt4375 * local15 >> 8);
					local47 = local6.anInt4372 + (local6.anInt4368 * local15 >> 8);
					local57 = local6.anInt4361 + (local6.anInt4366 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4374 == 4) {
				local15 = arg2 - local6.anInt4377;
				if (local15 > 0) {
					local27 = local6.anInt4382 + (local6.anInt4371 * local15 >> 8);
					local37 = local6.anInt4363 + (local6.anInt4375 * local15 >> 8);
					local47 = local6.anInt4372 + (local6.anInt4368 * local15 >> 8);
					local57 = local6.anInt4361 + (local6.anInt4366 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4374 == 5) {
				local15 = arg1 - local6.anInt4372;
				if (local15 > 0) {
					local27 = local6.anInt4382 + (local6.anInt4371 * local15 >> 8);
					local37 = local6.anInt4363 + (local6.anInt4375 * local15 >> 8);
					local47 = local6.anInt4377 + (local6.anInt4379 * local15 >> 8);
					local57 = local6.anInt4370 + (local6.anInt4365 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IZIIII)V")
	public static void method3888(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static86.method1459(Static69.anInt1551, arg4, Static317.anInt5793);
		@Pc(17) int local17 = Static86.method1459(Static69.anInt1551, arg1, Static317.anInt5793);
		@Pc(23) int local23 = Static86.method1459(Static121.anInt6758, arg2, Static179.anInt3768);
		@Pc(29) int local29 = Static86.method1459(Static121.anInt6758, arg3, Static179.anInt3768);
		for (@Pc(31) int local31 = local11; local31 <= local17; local31++) {
			Static307.method5019(Static152.anIntArrayArray30[local31], local29, arg0, local23);
		}
	}
}
