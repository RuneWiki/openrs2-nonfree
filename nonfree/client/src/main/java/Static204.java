import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "Z")
	public static boolean aBoolean242;

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1485 = Static200.method3116("red:");

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1483 = aClass60_1485;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
	public static int anInt4324 = 0;

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1484 = aClass60_1485;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
	public static int anInt4327 = 0;

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1486 = Static200.method3116("Nehmen");

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "Lclient!ff;")
	public static Class33 aClass33_17 = new Class33(32);

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1487 = Static200.method3116("Login limit exceeded)3");

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
	public static int anInt4328 = 0;

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1488 = aClass60_1487;

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "Lclient!ge;")
	public static Class39 aClass39_25 = new Class39(64);

	@OriginalMember(owner = "client!ui", name = "u", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1489 = Static200.method3116("null");

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!vi;IIIIIIZ)V")
	public static void method3164(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray605.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray605[local5] - Static201.anInt4280;
			local20 = arg0.anIntArray604[local5] - Static105.anInt2387;
			local27 = arg0.anIntArray602[local5] - Static155.anInt3455;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray607 != null) {
				Static212.anIntArray608[local5] = local37;
				Static212.anIntArray596[local5] = local59;
				Static212.anIntArray597[local5] = local69;
			}
			Static212.anIntArray603[local5] = Static81.anInt1940 + (local37 << 9) / local69;
			Static212.anIntArray598[local5] = Static81.anInt1941 + (local59 << 9) / local69;
		}
		Static81.anInt1939 = 0;
		local3 = arg0.anIntArray600.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray600[local13];
			local27 = arg0.anIntArray601[local13];
			local37 = arg0.anIntArray595[local13];
			@Pc(142) int local142 = Static212.anIntArray603[local20];
			@Pc(146) int local146 = Static212.anIntArray603[local27];
			@Pc(150) int local150 = Static212.anIntArray603[local37];
			@Pc(154) int local154 = Static212.anIntArray598[local20];
			@Pc(158) int local158 = Static212.anIntArray598[local27];
			@Pc(162) int local162 = Static212.anIntArray598[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static71.aBoolean92 && Static100.method1742(Static24.anInt573 + Static81.anInt1940, Static86.anInt1997 + Static81.anInt1941, local154, local158, local162, local142, local146, local150)) {
					Static2.anInt67 = arg5;
					Static194.anInt4139 = arg6;
				}
				if (!arg7) {
					Static81.aBoolean103 = false;
					if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static81.anInt1937 || local146 > Static81.anInt1937 || local150 > Static81.anInt1937) {
						Static81.aBoolean103 = true;
					}
					if (arg0.anIntArray607 == null || arg0.anIntArray607[local13] == -1) {
						if (arg0.anIntArray606[local13] != 12345678) {
							Static81.method1447(local154, local158, local162, local142, local146, local150, arg0.anIntArray606[local13], arg0.anIntArray594[local13], arg0.anIntArray599[local13]);
						}
					} else if (Static23.aBoolean144) {
						@Pc(369) int local369 = Static81.anInterface1_1.method1250(arg0.anIntArray607[local13]);
						Static81.method1447(local154, local158, local162, local142, local146, local150, Static140.method2405(local369, arg0.anIntArray606[local13]), Static140.method2405(local369, arg0.anIntArray594[local13]), Static140.method2405(local369, arg0.anIntArray599[local13]));
					} else if (arg0.aBoolean255) {
						Static81.method1443(local154, local158, local162, local142, local146, local150, arg0.anIntArray606[local13], arg0.anIntArray594[local13], arg0.anIntArray599[local13], Static212.anIntArray608[0], Static212.anIntArray608[1], Static212.anIntArray608[3], Static212.anIntArray596[0], Static212.anIntArray596[1], Static212.anIntArray596[3], Static212.anIntArray597[0], Static212.anIntArray597[1], Static212.anIntArray597[3], arg0.anIntArray607[local13]);
					} else {
						Static81.method1443(local154, local158, local162, local142, local146, local150, arg0.anIntArray606[local13], arg0.anIntArray594[local13], arg0.anIntArray599[local13], Static212.anIntArray608[local20], Static212.anIntArray608[local27], Static212.anIntArray608[local37], Static212.anIntArray596[local20], Static212.anIntArray596[local27], Static212.anIntArray596[local37], Static212.anIntArray597[local20], Static212.anIntArray597[local27], Static212.anIntArray597[local37], arg0.anIntArray607[local13]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)I")
	public static int method3166(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!fa;)V")
	public static void method3168(@OriginalArg(0) Class29 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1437; local2 <= arg0.anInt1430; local2++) {
			for (@Pc(6) int local6 = arg0.anInt1423; local6 <= arg0.anInt1431; local6++) {
				@Pc(16) Class1_Sub22 local16 = Static100.aClass1_Sub22ArrayArrayArray3[arg0.anInt1434][local2][local6];
				if (local16 != null) {
					@Pc(35) int local35;
					for (@Pc(20) int local20 = 0; local20 < local16.anInt3358; local20++) {
						if (local16.aClass29Array3[local20] == arg0) {
							local16.anInt3358--;
							for (local35 = local20; local35 < local16.anInt3358; local35++) {
								local16.aClass29Array3[local35] = local16.aClass29Array3[local35 + 1];
								local16.anIntArray435[local35] = local16.anIntArray435[local35 + 1];
							}
							local16.aClass29Array3[local16.anInt3358] = null;
							break;
						}
					}
					local16.anInt3354 = 0;
					for (local35 = 0; local35 < local16.anInt3358; local35++) {
						local16.anInt3354 |= local16.anIntArray435[local35];
					}
				}
			}
		}
	}
}
