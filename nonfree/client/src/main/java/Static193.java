import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
	public static int anInt3890;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "[I")
	public static int[] anIntArray308 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
	public static void method3165() {
		Static211.aClass172_36.method4346();
		Static157.aClass172_3.method4346();
		Static228.aClass172_38.method4346();
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)V")
	public static void method3166() {
		@Pc(10) int local10 = Static256.aClass4_Sub24_Sub1_3.method3132(8);
		@Pc(15) int local15;
		if (local10 < Static85.anInt1730) {
			for (local15 = local10; local15 < Static85.anInt1730; local15++) {
				Static3.anIntArray3[Static105.anInt2109++] = Static291.anIntArray457[local15];
			}
		}
		if (local10 > Static85.anInt1730) {
			throw new RuntimeException("gppov1");
		}
		Static85.anInt1730 = 0;
		for (local15 = 0; local15 < local10; local15++) {
			@Pc(63) int local63 = Static291.anIntArray457[local15];
			@Pc(67) Class13_Sub5_Sub1 local67 = Static100.aClass13_Sub5_Sub1Array1[local63];
			@Pc(72) int local72 = Static256.aClass4_Sub24_Sub1_3.method3132(1);
			if (local72 == 0) {
				Static291.anIntArray457[Static85.anInt1730++] = local63;
				local67.anInt5329 = Static50.anInt1118;
			} else {
				@Pc(94) int local94 = Static256.aClass4_Sub24_Sub1_3.method3132(2);
				if (local94 == 0) {
					Static291.anIntArray457[Static85.anInt1730++] = local63;
					local67.anInt5329 = Static50.anInt1118;
					Static148.anIntArray237[Static291.anInt5649++] = local63;
				} else {
					@Pc(140) int local140;
					@Pc(152) int local152;
					if (local94 == 1) {
						Static291.anIntArray457[Static85.anInt1730++] = local63;
						local67.anInt5329 = Static50.anInt1118;
						local140 = Static256.aClass4_Sub24_Sub1_3.method3132(3);
						local67.method4210(1, local140);
						local152 = Static256.aClass4_Sub24_Sub1_3.method3132(1);
						if (local152 == 1) {
							Static148.anIntArray237[Static291.anInt5649++] = local63;
						}
					} else if (local94 == 2) {
						Static291.anIntArray457[Static85.anInt1730++] = local63;
						local67.anInt5329 = Static50.anInt1118;
						if (Static256.aClass4_Sub24_Sub1_3.method3132(1) == 1) {
							local140 = Static256.aClass4_Sub24_Sub1_3.method3132(3);
							local67.method4210(2, local140);
							local152 = Static256.aClass4_Sub24_Sub1_3.method3132(3);
							local67.method4210(2, local152);
						} else {
							local140 = Static256.aClass4_Sub24_Sub1_3.method3132(3);
							local67.method4210(0, local140);
						}
						local140 = Static256.aClass4_Sub24_Sub1_3.method3132(1);
						if (local140 == 1) {
							Static148.anIntArray237[Static291.anInt5649++] = local63;
						}
					} else if (local94 == 3) {
						Static3.anIntArray3[Static105.anInt2109++] = local63;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)Lclient!ta;")
	public static Class58_Sub2 method3167() {
		@Pc(21) Class58_Sub2 local21 = new Class58_Sub2(Static31.anInt651, Static161.anInt3300, Static149.anIntArray238[0], Static278.anIntArray422[0], Static107.anIntArray188[0], Static246.anIntArray386[0], Static99.aByteArrayArray8[0], Static138.anIntArray228);
		Static184.method2969();
		return local21;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!cg;Lclient!cg;I)V")
	public static void method3168(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class22 arg1) {
		Static284.aClass22_99 = arg1;
		Static45.aClass22_24 = arg0;
		Static30.anInt632 = Static284.aClass22_99.method679(3);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(JB)V")
	public static void method3169(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static226.method3571(arg0 - 1L);
			Static226.method3571(1L);
		} else {
			Static226.method3571(arg0);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method3171(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 *= 37L;
			@Pc(28) char local28 = arg0.charAt(local17);
			if (local28 >= 'A' && local28 <= 'Z') {
				local10 += local28 - 64;
			} else if (local28 >= 'a' && local28 <= 'z') {
				local10 += local28 + 1 - 97;
			} else if (local28 >= '0' && local28 <= '9') {
				local10 += local28 + 27 - 48;
			}
			if (local10 >= 177917621779460413L) {
				break;
			}
		}
		while (local10 % 37L == 0L && local10 != 0L) {
			local10 /= 37L;
		}
		return local10;
	}
}
