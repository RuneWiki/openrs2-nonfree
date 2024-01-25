import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!ms", name = "m", descriptor = "[Lclient!f;")
	public static Class80[] aClass80Array11;

	@OriginalMember(owner = "client!ms", name = "A", descriptor = "Lclient!gu;")
	public static Class100 aClass100_9;

	@OriginalMember(owner = "client!ms", name = "V", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!ms", name = "R", descriptor = "Z")
	public static boolean aBoolean317 = false;

	@OriginalMember(owner = "client!ms", name = "U", descriptor = "I")
	public static int anInt4626 = 0;

	@OriginalMember(owner = "client!ms", name = "W", descriptor = "[[S")
	public static final short[][] aShortArrayArray6 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "(I)V")
	public static void method3778() {
		if (Static47.aBoolean40) {
			return;
		}
		Static56.method5515(Static182.aClass211ArrayArrayArray6);
		if (Static87.aClass211ArrayArrayArray1 != null) {
			Static56.method5515(Static87.aClass211ArrayArrayArray1);
		}
		Static47.aBoolean40 = true;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)V")
	public static void method3780() {
		@Pc(5) Class83 local5 = Static244.aClass83_38;
		synchronized (Static244.aClass83_38) {
			Static244.aClass83_38.method1667();
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!jb;)V")
	public static void method3782(@OriginalArg(0) Class124 arg0) {
		if (Static139.anInt2353 >= 65535) {
			return;
		}
		@Pc(6) Class1_Sub5 local6 = arg0.aClass1_Sub5_1;
		Static110.aClass124Array2[Static139.anInt2353] = arg0;
		Static439.aBooleanArray29[Static139.anInt2353] = false;
		Static139.anInt2353++;
		@Pc(21) int local21 = arg0.anInt3439;
		if (arg0.aBoolean200) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt3439;
		if (arg0.aBoolean199) {
			local29 = Static107.anInt1964 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method3325() + Static122.anInt2160 - local6.method3327() >> Static139.anInt2355;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method3325() + local6.method3327() - Static122.anInt2160 >> Static139.anInt2355;
			if (local73 >= Static378.anInt6480) {
				local73 = Static378.anInt6480 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray52[local41++];
				@Pc(105) int local105 = (local6.method3333() + Static122.anInt2160 - local6.method3327() >> Static139.anInt2355) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static377.anInt6467) {
					local113 = Static377.anInt6467 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static242.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static242.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static139.anInt2353;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static242.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static139.anInt2353 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static242.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static139.anInt2353 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static242.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static139.anInt2353 << 48;
					}
				}
			}
		}
	}
}
