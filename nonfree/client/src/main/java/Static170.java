import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ue", name = "U", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1394 = Static177.method3050("nav");

	@OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
	public static int anInt3809 = 0;

	@OriginalMember(owner = "client!ue", name = "ab", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1395 = Static177.method3050("blinken2:");

	@OriginalMember(owner = "client!ue", name = "fb", descriptor = "I")
	public static int anInt3816 = 0;

	@OriginalMember(owner = "client!ue", name = "kb", descriptor = "I")
	public static int anInt3820 = -1;

	@OriginalMember(owner = "client!ue", name = "nb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1396 = Static177.method3050("Null");

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZBI)V")
	public static void method2912(@OriginalArg(1) boolean arg0) {
		Static17.anInt484 = 2;
		Static68.aBoolean82 = arg0;
		Static154.anInt4087 = 22050;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)V")
	public static void method2914() {
		for (@Pc(1) int local1 = 0; local1 < Static135.anInt3222; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static57.anInt1408; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static84.anInt4112; local7++) {
					@Pc(16) Class4_Sub7 local16 = Static28.aClass4_Sub7ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class24 local21 = local16.aClass24_1;
						if (local21 != null && local21.aClass4_Sub1_Sub1_2 instanceof Class4_Sub1_Sub1_Sub6) {
							@Pc(31) Class4_Sub1_Sub1_Sub6 local31 = (Class4_Sub1_Sub1_Sub6) local21.aClass4_Sub1_Sub1_2;
							Static130.method2307(local31, local1, local4, local7, 1, 1);
							if (local21.aClass4_Sub1_Sub1_3 instanceof Class4_Sub1_Sub1_Sub6) {
								@Pc(46) Class4_Sub1_Sub1_Sub6 local46 = (Class4_Sub1_Sub1_Sub6) local21.aClass4_Sub1_Sub1_3;
								Static130.method2307(local46, local1, local4, local7, 1, 1);
								Static51.method999(local31, local46, 0, 0, 0, false);
								local21.aClass4_Sub1_Sub1_3 = local46.method1007(local46.aShort21, local46.aShort15, -50, -10, -50, false);
							}
							local21.aClass4_Sub1_Sub1_2 = local31.method1007(local31.aShort21, local31.aShort15, -50, -10, -50, false);
						}
						@Pc(104) Class4_Sub1_Sub1_Sub6 local104;
						for (@Pc(88) int local88 = 0; local88 < local16.anInt1040; local88++) {
							@Pc(94) Class86 local94 = local16.aClass86Array1[local88];
							if (local94 != null && local94.aClass4_Sub1_Sub1_10 instanceof Class4_Sub1_Sub1_Sub6) {
								local104 = (Class4_Sub1_Sub1_Sub6) local94.aClass4_Sub1_Sub1_10;
								Static130.method2307(local104, local1, local4, local7, local94.anInt3584 + 1 - local94.anInt3583, local94.anInt3595 - local94.anInt3581 + 1);
								local94.aClass4_Sub1_Sub1_10 = local104.method1007(local104.aShort21, local104.aShort15, -50, -10, -50, false);
							}
						}
						@Pc(144) Class17 local144 = local16.aClass17_1;
						if (local144 != null && local144.aClass4_Sub1_Sub1_1 instanceof Class4_Sub1_Sub1_Sub6) {
							local104 = (Class4_Sub1_Sub1_Sub6) local144.aClass4_Sub1_Sub1_1;
							Static149.method2553(local104, local1, local4, local7);
							local144.aClass4_Sub1_Sub1_1 = local104.method1007(local104.aShort21, local104.aShort15, -50, -10, -50, false);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!kd;I)V")
	public static void method2915(@OriginalArg(0) Class4_Sub13 arg0) {
		@Pc(9) int local9 = -1;
		@Pc(11) long local11 = 0L;
		if (arg0.anInt2382 == 0) {
			local11 = Static111.method2060(arg0.anInt2390, arg0.anInt2391, arg0.anInt2389);
		}
		@Pc(27) int local27 = 0;
		if (arg0.anInt2382 == 1) {
			local11 = Static66.method1448(arg0.anInt2390, arg0.anInt2391, arg0.anInt2389);
		}
		if (arg0.anInt2382 == 2) {
			local11 = Static187.method3164(arg0.anInt2390, arg0.anInt2391, arg0.anInt2389);
		}
		if (arg0.anInt2382 == 3) {
			local11 = Static78.method1588(arg0.anInt2390, arg0.anInt2391, arg0.anInt2389);
		}
		@Pc(71) int local71 = 0;
		if (local11 != 0L) {
			local71 = (int) local11 >> 20 & 0x3;
			local9 = (int) (local11 >>> 32) & Integer.MAX_VALUE;
			local27 = (int) local11 >> 14 & 0x1F;
		}
		arg0.anInt2376 = local71;
		arg0.anInt2380 = local9;
		arg0.anInt2377 = local27;
	}
}
