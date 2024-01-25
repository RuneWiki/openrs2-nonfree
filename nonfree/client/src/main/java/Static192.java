import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!go", name = "o", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23;

	@OriginalMember(owner = "client!go", name = "x", descriptor = "Lclient!nd;")
	public static Class238 aClass238_93;

	@OriginalMember(owner = "client!go", name = "y", descriptor = "[I")
	public static int[] anIntArray247;

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(B)V")
	public static void method3286() {
		Static173.anInt3502 = 0;
		Static259.anInt4871 = 0;
		for (@Pc(19) int local19 = 0; local19 < Static259.anInt4870; local19++) {
			@Pc(25) int local25 = local19 * Static294.anInt5311;
			for (@Pc(27) int local27 = 0; local27 < Static294.anInt5311; local27++) {
				@Pc(34) int local34 = local25 + local27;
				Static65.anInterface18Array1[local34].method8674(local27 * Static456.anInt7437, local19 * Static5.anInt108, Static456.anInt7437, Static5.anInt108, true);
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "e", descriptor = "(I)V")
	public static void method3289() {
		Static327.aClass2_Sub17_Sub1_1.method2461();
		@Pc(18) int local18 = Static327.aClass2_Sub17_Sub1_1.method2456(8);
		@Pc(23) int local23;
		if (local18 < Static317.anInt5602) {
			for (local23 = local18; local23 < Static317.anInt5602; local23++) {
				Static104.anIntArray173[Static229.anInt4227++] = Static363.anIntArray409[local23];
			}
		}
		if (Static317.anInt5602 < local18) {
			throw new RuntimeException("gnpov1");
		}
		Static317.anInt5602 = 0;
		for (local23 = 0; local23 < local18; local23++) {
			@Pc(61) int local61 = Static363.anIntArray409[local23];
			@Pc(71) Class16_Sub1_Sub1_Sub3_Sub1 local71 = ((Class2_Sub32) Static514.aClass323_32.method7484((long) local61)).aClass16_Sub1_Sub1_Sub3_Sub1_2;
			@Pc(78) int local78 = Static327.aClass2_Sub17_Sub1_1.method2456(1);
			if (local78 == 0) {
				Static363.anIntArray409[Static317.anInt5602++] = local61;
				local71.anInt8110 = Static340.anInt5976;
			} else {
				@Pc(101) int local101 = Static327.aClass2_Sub17_Sub1_1.method2456(2);
				if (local101 == 0) {
					Static363.anIntArray409[Static317.anInt5602++] = local61;
					local71.anInt8110 = Static340.anInt5976;
					Static170.anIntArray226[Static570.anInt9337++] = local61;
				} else {
					@Pc(146) int local146;
					@Pc(158) int local158;
					if (local101 == 1) {
						Static363.anIntArray409[Static317.anInt5602++] = local61;
						local71.anInt8110 = Static340.anInt5976;
						local146 = Static327.aClass2_Sub17_Sub1_1.method2456(3);
						local71.method1407(1, local146);
						local158 = Static327.aClass2_Sub17_Sub1_1.method2456(1);
						if (local158 == 1) {
							Static170.anIntArray226[Static570.anInt9337++] = local61;
						}
					} else if (local101 == 2) {
						Static363.anIntArray409[Static317.anInt5602++] = local61;
						local71.anInt8110 = Static340.anInt5976;
						if (Static327.aClass2_Sub17_Sub1_1.method2456(1) == 1) {
							local146 = Static327.aClass2_Sub17_Sub1_1.method2456(3);
							local71.method1407(2, local146);
							local158 = Static327.aClass2_Sub17_Sub1_1.method2456(3);
							local71.method1407(2, local158);
						} else {
							local146 = Static327.aClass2_Sub17_Sub1_1.method2456(3);
							local71.method1407(0, local146);
						}
						local146 = Static327.aClass2_Sub17_Sub1_1.method2456(1);
						if (local146 == 1) {
							Static170.anIntArray226[Static570.anInt9337++] = local61;
						}
					} else if (local101 == 3) {
						Static104.anIntArray173[Static229.anInt4227++] = local61;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(Z)V")
	public static void method3293(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static348.aClass84ArrayArrayArray5 = Static230.aClass84ArrayArrayArray4;
			Static511.aClass91Array3 = Static332.aClass91Array2;
		} else {
			Static348.aClass84ArrayArrayArray5 = Static313.aClass84ArrayArrayArray6;
			Static511.aClass91Array3 = Static124.aClass91Array1;
		}
		Static395.anInt6810 = Static348.aClass84ArrayArrayArray5.length;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;ZIZ)Z")
	public static boolean method3294(@OriginalArg(0) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(40) char local40 = arg0.charAt(local35);
			if (local35 == 0) {
				if (local40 == '-') {
					local26 = true;
					continue;
				}
				if (local40 == '+') {
					continue;
				}
			}
			@Pc(61) int local61;
			if (local40 >= '0' && local40 <= '9') {
				local61 = local40 - '0';
			} else if (local40 >= 'A' && local40 <= 'Z') {
				local61 = local40 - '7';
			} else if (local40 >= 'a' && local40 <= 'z') {
				local61 = local40 - 'W';
			} else {
				return false;
			}
			if (local61 >= 10) {
				return false;
			}
			if (local26) {
				local61 = -local61;
			}
			@Pc(98) int local98 = local30 * 10 + local61;
			if (local98 / 10 != local30) {
				return false;
			}
			local28 = true;
			local30 = local98;
		}
		return local28;
	}
}
