import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
	public static int anInt2232;

	@OriginalMember(owner = "client!ew", name = "h", descriptor = "Lclient!f;")
	public static Class3 aClass3_6;

	@OriginalMember(owner = "client!ew", name = "i", descriptor = "Lclient!hh;")
	public static Class108 aClass108_5;

	@OriginalMember(owner = "client!ew", name = "e", descriptor = "Lclient!dl;")
	public static final Class49 aClass49_2 = new Class49(1);

	@OriginalMember(owner = "client!ew", name = "f", descriptor = "Lclient!wi;")
	public static final Class263 aClass263_15 = new Class263(0, 2, 2, 1);

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "I")
	public static int anInt2235 = -1;

	@OriginalMember(owner = "client!ew", name = "j", descriptor = "I")
	public static int anInt2236 = 0;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(III)Z")
	public static boolean method1658(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static100.method1585(arg1, arg0)) {
			return (arg0 & 0xB000) != 0 | Static314.method4330(arg0, arg1) | Static223.method3134(arg1, arg0) ? true : (Static287.method4005(arg0, arg1) | Static317.method4377(arg1, arg0)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(III)V")
	public static void method1659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (arg0 != Static350.anInt6330) {
			Static197.anIntArray566 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				Static197.anIntArray566[local9] = (local9 << 12) / arg0;
			}
			Static350.anInt6330 = arg0;
			Static136.anInt2636 = arg0 * 32;
			Static144.anInt2707 = arg0 - 1;
		}
		if (arg1 == Static160.anInt3006) {
			return;
		}
		if (arg1 == Static350.anInt6330) {
			Static293.anIntArray461 = Static197.anIntArray566;
		} else {
			Static293.anIntArray461 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				Static293.anIntArray461[local9] = (local9 << 12) / arg1;
			}
		}
		Static323.anInt5763 = arg1 - 1;
		Static160.anInt3006 = arg1;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIILclient!jb;)V")
	public static void method1660(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class126 arg2) {
		if (Static222.aBoolean305) {
			@Pc(13) Class247 local13 = Static114.anInt2420 == -1 ? null : Static110.aClass262_1.method5689(Static114.anInt2420);
			if (Static55.method1118(arg2).method4450() && (Static234.anInt4263 & 0x20) != 0 && (local13 == null || arg2.method2670(Static114.anInt2420, local13.anInt7035) != local13.anInt7035)) {
				Static191.method2806(arg2.anInt3392, 0L, false, Static195.anInt2838, true, Static279.aString50, Static178.aString37 + " -> " + arg2.aString38, arg2.anInt3397, arg2.anInt3395, 9);
			}
			return;
		}
		@Pc(76) String local76;
		for (@Pc(69) int local69 = 9; local69 >= 5; local69--) {
			local76 = Static169.method2492(arg2, local69);
			if (local76 != null) {
				Static191.method2806(arg2.anInt3392, (long) (local69 + 1), false, Static145.method2119(local69, arg2), true, local76, arg2.aString38, arg2.anInt3397, arg2.anInt3395, 1008);
			}
		}
		local76 = Static169.method2490(arg2);
		if (local76 != null) {
			Static191.method2806(arg2.anInt3392, 0L, false, arg2.anInt3466, true, local76, arg2.aString38, arg2.anInt3397, arg2.anInt3395, 46);
		}
		for (@Pc(137) int local137 = 4; local137 >= 0; local137--) {
			@Pc(144) String local144 = Static169.method2492(arg2, local137);
			if (local144 != null) {
				Static191.method2806(arg2.anInt3392, (long) (local137 + 1), false, Static145.method2119(local137, arg2), true, local144, arg2.aString38, arg2.anInt3397, arg2.anInt3395, 2);
			}
		}
		if (!Static55.method1118(arg2).method4449()) {
			return;
		}
		if (arg2.aString40 == null) {
			Static191.method2806(arg2.anInt3392, 0L, false, -1, true, Static210.aClass242_54.method5320(Static139.anInt2670), "", arg2.anInt3397, arg2.anInt3395, 45);
		} else {
			Static191.method2806(arg2.anInt3392, 0L, false, -1, true, arg2.aString40, "", arg2.anInt3397, arg2.anInt3395, 45);
		}
	}
}
