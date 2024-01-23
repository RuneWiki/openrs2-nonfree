import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
	public static int anInt4831 = 0;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "[[S")
	public static short[][] aShortArrayArray31 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray36 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "[I")
	public static int[] anIntArray435 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZII[B)Z")
	public static boolean method3757(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(3) boolean local3 = true;
		@Pc(8) Class1_Sub14 local8 = new Class1_Sub14(arg2);
		@Pc(14) int local14 = -1;
		label71: while (true) {
			@Pc(18) int local18 = local8.method2608();
			if (local18 == 0) {
				return local3;
			}
			@Pc(23) boolean local23 = false;
			@Pc(25) int local25 = 0;
			local14 += local18;
			while (true) {
				@Pc(69) int local69;
				@Pc(91) Class43 local91;
				do {
					@Pc(59) int local59;
					@Pc(63) int local63;
					do {
						do {
							do {
								do {
									@Pc(35) int local35;
									while (local23) {
										local35 = local8.method2648();
										if (local35 == 0) {
											continue label71;
										}
										local8.method2595();
									}
									local35 = local8.method2648();
									if (local35 == 0) {
										continue label71;
									}
									local25 += local35 - 1;
									@Pc(49) int local49 = local25 & 0x3F;
									@Pc(55) int local55 = local25 >> 6 & 0x3F;
									local59 = arg1 + local55;
									local63 = arg0 + local49;
									local69 = local8.method2595() >> 2;
								} while (local59 <= 0);
							} while (local63 <= 0);
						} while (local59 >= 103);
					} while (local63 >= 103);
					local91 = Static189.method3080(local14);
				} while (local69 == 22 && !Static289.aBoolean394 && local91.anInt1170 == 0 && local91.anInt1181 != 1 && !local91.aBoolean99);
				local23 = true;
				if (!local91.method1002()) {
					local3 = false;
					Static300.anInt5677++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(II)Lclient!ka;")
	public static Class97 method3759(@OriginalArg(1) int arg0) {
		@Pc(6) Class97 local6 = (Class97) Static88.aClass169_57.method4017((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(28) byte[] local28 = Static78.aClass138_22.method3346(Static279.method4122(arg0), Static40.method725(arg0));
		local6 = new Class97();
		local6.anInt2707 = arg0;
		if (local28 != null) {
			local6.method2205(new Class1_Sub14(local28));
		}
		Static88.aClass169_57.method4016(local6, (long) arg0);
		return local6;
	}
}
