import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!lg", name = "F", descriptor = "I")
	public static int anInt2843;

	@OriginalMember(owner = "client!lg", name = "H", descriptor = "Lclient!dd;")
	private static Class13 aClass13_944 = Static161.method2971("yellow:");

	@OriginalMember(owner = "client!lg", name = "J", descriptor = "Lclient!dd;")
	public static Class13 aClass13_945 = aClass13_944;

	@OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
	public static int anInt2850 = 0;

	@OriginalMember(owner = "client!lg", name = "Q", descriptor = "Lclient!ld;")
	public static Class47 aClass47_21 = new Class47(50);

	@OriginalMember(owner = "client!lg", name = "R", descriptor = "Lclient!dd;")
	public static Class13 aClass13_946 = aClass13_944;

	@OriginalMember(owner = "client!lg", name = "V", descriptor = "I")
	public static int anInt2853 = 0;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!ma;IIIIII)V")
	public static void method2036(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray270.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray270[local5] - Static4.anInt122;
			local20 = arg0.anIntArray271[local5] - Static2.anInt95;
			local27 = arg0.anIntArray283[local5] - Static24.anInt869;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray277 != null) {
				Static105.anIntArray280[local5] = local37;
				Static105.anIntArray281[local5] = local59;
				Static105.anIntArray274[local5] = local69;
			}
			Static105.anIntArray273[local5] = Static9.anInt332 + (local37 << 9) / local69;
			Static105.anIntArray275[local5] = Static9.anInt333 + (local59 << 9) / local69;
		}
		Static9.anInt330 = 0;
		local3 = arg0.anIntArray276.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray276[local13];
			local27 = arg0.anIntArray278[local13];
			local37 = arg0.anIntArray279[local13];
			@Pc(142) int local142 = Static105.anIntArray273[local20];
			@Pc(146) int local146 = Static105.anIntArray273[local27];
			@Pc(150) int local150 = Static105.anIntArray273[local37];
			@Pc(154) int local154 = Static105.anIntArray275[local20];
			@Pc(158) int local158 = Static105.anIntArray275[local27];
			@Pc(162) int local162 = Static105.anIntArray275[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static71.aBoolean156 && Static65.method1443(Static67.anInt1964, Static99.anInt2784, local154, local158, local162, local142, local146, local150)) {
					Static168.anInt3947 = arg5;
					Static61.anInt1892 = arg6;
				}
				Static9.aBoolean31 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static9.anInt334 || local146 > Static9.anInt334 || local150 > Static9.anInt334) {
					Static9.aBoolean31 = true;
				}
				if (arg0.anIntArray277 == null || arg0.anIntArray277[local13] == -1) {
					if (arg0.anIntArray272[local13] != 12345678) {
						Static9.method361(local154, local158, local162, local142, local146, local150, arg0.anIntArray272[local13], arg0.anIntArray282[local13], arg0.anIntArray269[local13]);
					}
				} else if (Static137.aBoolean262) {
					@Pc(363) int local363 = Static9.anInterface3_1.method2048(arg0.anIntArray277[local13]);
					Static9.method361(local154, local158, local162, local142, local146, local150, Static163.method2796(local363, arg0.anIntArray272[local13]), Static163.method2796(local363, arg0.anIntArray282[local13]), Static163.method2796(local363, arg0.anIntArray269[local13]));
				} else if (arg0.aBoolean214) {
					Static9.method353(local154, local158, local162, local142, local146, local150, arg0.anIntArray272[local13], arg0.anIntArray282[local13], arg0.anIntArray269[local13], Static105.anIntArray280[0], Static105.anIntArray280[1], Static105.anIntArray280[3], Static105.anIntArray281[0], Static105.anIntArray281[1], Static105.anIntArray281[3], Static105.anIntArray274[0], Static105.anIntArray274[1], Static105.anIntArray274[3], arg0.anIntArray277[local13]);
				} else {
					Static9.method353(local154, local158, local162, local142, local146, local150, arg0.anIntArray272[local13], arg0.anIntArray282[local13], arg0.anIntArray269[local13], Static105.anIntArray280[local20], Static105.anIntArray280[local27], Static105.anIntArray280[local37], Static105.anIntArray281[local20], Static105.anIntArray281[local27], Static105.anIntArray281[local37], Static105.anIntArray274[local20], Static105.anIntArray274[local27], Static105.anIntArray274[local37], arg0.anIntArray277[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(III)I")
	public static int method2037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(42) int local42 = Static131.method2381(arg0 - 1, arg1 + -1) + Static131.method2381(arg0 - 1, arg1 + 1) + Static131.method2381(arg0 + 1, arg1 + -1) + Static131.method2381(arg0 + 1, arg1 + 1);
		@Pc(72) int local72 = Static131.method2381(arg0, arg1 - 1) + Static131.method2381(arg0, arg1 + 1) + Static131.method2381(arg0 - 1, arg1) + Static131.method2381(arg0 + 1, arg1);
		@Pc(77) int local77 = Static131.method2381(arg0, arg1);
		return local42 / 16 + local72 / 8 + local77 / 4;
	}

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)V")
	public static void method2038() {
		aClass47_21 = null;
		aClass13_944 = null;
		aClass13_946 = null;
		aClass13_945 = null;
	}
}
