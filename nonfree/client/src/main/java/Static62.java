import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ei", name = "F", descriptor = "I")
	public static int anInt1583;

	@OriginalMember(owner = "client!ei", name = "M", descriptor = "[I")
	public static int[] anIntArray168;

	@OriginalMember(owner = "client!ei", name = "z", descriptor = "I")
	public static int anInt1579 = -1;

	@OriginalMember(owner = "client!ei", name = "A", descriptor = "I")
	public static int anInt1580 = 0;

	@OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
	public static int anInt1582 = 0;

	@OriginalMember(owner = "client!ei", name = "I", descriptor = "[I")
	public static int[] anIntArray167 = new int[100];

	@OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
	public static int anInt1585 = 0;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZBLclient!kb;Lclient!kb;)V")
	public static void method1207(@OriginalArg(2) Class83 arg0, @OriginalArg(3) Class83 arg1) {
		Static115.aClass83_77 = arg0;
		Static215.aBoolean264 = true;
		Static154.aClass83_109 = arg1;
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V")
	public static void method1209() {
		if (Static105.aFloat200 > Static241.aFloat173) {
			Static241.aFloat173 = (float) ((double) Static241.aFloat173 + (double) Static241.aFloat173 / 30.0D);
			if (Static241.aFloat173 > Static105.aFloat200) {
				Static241.aFloat173 = Static105.aFloat200;
			}
			Static104.method850();
		} else if (Static241.aFloat173 > Static105.aFloat200) {
			Static241.aFloat173 = (float) ((double) Static241.aFloat173 - (double) Static241.aFloat173 / 30.0D);
			if (Static241.aFloat173 < Static105.aFloat200) {
				Static241.aFloat173 = Static105.aFloat200;
			}
			Static104.method850();
		}
		if (Static5.anInt145 == -1 || Static206.anInt4587 == -1) {
			return;
		}
		@Pc(59) int local59 = Static5.anInt145 - Static87.anInt2033;
		@Pc(63) int local63 = Static206.anInt4587 - Static88.anInt2053;
		if (local59 < 2 || local59 > 2) {
			local59 >>= 0x4;
		}
		Static87.anInt2033 += local59;
		if (local63 < 2 || local63 > 2) {
			local63 >>= 0x4;
		}
		if (local59 == 0 && local63 == 0) {
			Static206.anInt4587 = -1;
			Static5.anInt145 = -1;
		}
		Static88.anInt2053 -= -local63;
		Static104.method850();
	}

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)J")
	public static long method1210() {
		return Static117.aClass8_1.method330();
	}

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V")
	public static void method1211() {
		Static222.aClass1_Sub16_Sub1_3.method2671();
		@Pc(17) int local17 = Static222.aClass1_Sub16_Sub1_3.method2670(8);
		@Pc(27) int local27;
		if (local17 < Static147.anInt3493) {
			for (local27 = local17; local27 < Static147.anInt3493; local27++) {
				Static226.anIntArray516[Static146.anInt3487++] = Static65.anIntArray25[local27];
			}
		}
		if (local17 > Static147.anInt3493) {
			throw new RuntimeException("gnpov1");
		}
		Static147.anInt3493 = 0;
		for (local27 = 0; local27 < local17; local27++) {
			@Pc(67) int local67 = Static65.anIntArray25[local27];
			@Pc(71) Class25_Sub1_Sub2 local71 = Static27.aClass25_Sub1_Sub2Array1[local67];
			@Pc(76) int local76 = Static222.aClass1_Sub16_Sub1_3.method2670(1);
			if (local76 == 0) {
				Static65.anIntArray25[Static147.anInt3493++] = local67;
				local71.anInt1658 = Static32.anInt809;
			} else {
				@Pc(99) int local99 = Static222.aClass1_Sub16_Sub1_3.method2670(2);
				if (local99 == 0) {
					Static65.anIntArray25[Static147.anInt3493++] = local67;
					local71.anInt1658 = Static32.anInt809;
					Static95.anIntArray220[Static111.anInt2390++] = local67;
				} else {
					@Pc(147) int local147;
					@Pc(157) int local157;
					if (local99 == 1) {
						Static65.anIntArray25[Static147.anInt3493++] = local67;
						local71.anInt1658 = Static32.anInt809;
						local147 = Static222.aClass1_Sub16_Sub1_3.method2670(3);
						local71.method1240(local147, 1);
						local157 = Static222.aClass1_Sub16_Sub1_3.method2670(1);
						if (local157 == 1) {
							Static95.anIntArray220[Static111.anInt2390++] = local67;
						}
					} else if (local99 == 2) {
						Static65.anIntArray25[Static147.anInt3493++] = local67;
						local71.anInt1658 = Static32.anInt809;
						if (Static222.aClass1_Sub16_Sub1_3.method2670(1) == 1) {
							local147 = Static222.aClass1_Sub16_Sub1_3.method2670(3);
							local71.method1240(local147, 2);
							local157 = Static222.aClass1_Sub16_Sub1_3.method2670(3);
							local71.method1240(local157, 2);
						} else {
							local147 = Static222.aClass1_Sub16_Sub1_3.method2670(3);
							local71.method1240(local147, 0);
						}
						local147 = Static222.aClass1_Sub16_Sub1_3.method2670(1);
						if (local147 == 1) {
							Static95.anIntArray220[Static111.anInt2390++] = local67;
						}
					} else if (local99 == 3) {
						Static226.anIntArray516[Static146.anInt3487++] = local67;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method1212(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		Static81.aClass1_Sub16_Sub1_1.method2676(36);
		Static81.aClass1_Sub16_Sub1_1.method2603(Static94.method4774(arg0));
		Static81.aClass1_Sub16_Sub1_1.method2662(arg1);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IC)C")
	public static char method1213(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
