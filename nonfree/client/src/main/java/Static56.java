import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
	public static int anInt1784;

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "Lclient!rf;")
	public static Class70 aClass70_562 = Static49.method1293("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!fi", name = "n", descriptor = "Lclient!rf;")
	public static Class70 aClass70_563 = Static49.method1293(":chalreq:");

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
	public static void method1374() {
		aClass70_563 = null;
		aClass70_562 = null;
		anIntArrayArray18 = null;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)V")
	public static void method1376(@OriginalArg(1) int arg0) {
		Static128.anInt4223 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ee;IIIIII)V")
	public static void method1378(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray138.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray138[local5] - Static142.anInt3764;
			local20 = arg0.anIntArray134[local5] - Static183.anInt4552;
			local27 = arg0.anIntArray147[local5] - Static108.anInt3059;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray135 != null) {
				Static43.anIntArray139[local5] = local37;
				Static43.anIntArray140[local5] = local59;
				Static43.anIntArray144[local5] = local69;
			}
			Static43.anIntArray141[local5] = Static1.anInt72 + (local37 << 9) / local69;
			Static43.anIntArray143[local5] = Static1.anInt73 + (local59 << 9) / local69;
		}
		Static1.anInt74 = 0;
		local3 = arg0.anIntArray145.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray145[local13];
			local27 = arg0.anIntArray137[local13];
			local37 = arg0.anIntArray136[local13];
			@Pc(142) int local142 = Static43.anIntArray141[local20];
			@Pc(146) int local146 = Static43.anIntArray141[local27];
			@Pc(150) int local150 = Static43.anIntArray141[local37];
			@Pc(154) int local154 = Static43.anIntArray143[local20];
			@Pc(158) int local158 = Static43.anIntArray143[local27];
			@Pc(162) int local162 = Static43.anIntArray143[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static94.aBoolean108 && Static85.method1886(Static105.anInt2981, Static171.anInt4439, local154, local158, local162, local142, local146, local150)) {
					Static90.anInt2640 = arg5;
					Static85.anInt2551 = arg6;
				}
				Static1.aBoolean2 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static1.anInt69 || local146 > Static1.anInt69 || local150 > Static1.anInt69) {
					Static1.aBoolean2 = true;
				}
				if (arg0.anIntArray135 == null || arg0.anIntArray135[local13] == -1) {
					if (arg0.anIntArray146[local13] != 12345678) {
						Static1.method94(local154, local158, local162, local142, local146, local150, arg0.anIntArray146[local13], arg0.anIntArray142[local13], arg0.anIntArray148[local13]);
					}
				} else if (Static162.aBoolean167) {
					@Pc(363) int local363 = Static1.anInterface2_1.method3416(arg0.anIntArray135[local13]);
					Static1.method94(local154, local158, local162, local142, local146, local150, Static129.method3402(local363, arg0.anIntArray146[local13]), Static129.method3402(local363, arg0.anIntArray142[local13]), Static129.method3402(local363, arg0.anIntArray148[local13]));
				} else if (arg0.aBoolean56) {
					Static1.method106(local154, local158, local162, local142, local146, local150, arg0.anIntArray146[local13], arg0.anIntArray142[local13], arg0.anIntArray148[local13], Static43.anIntArray139[0], Static43.anIntArray139[1], Static43.anIntArray139[3], Static43.anIntArray140[0], Static43.anIntArray140[1], Static43.anIntArray140[3], Static43.anIntArray144[0], Static43.anIntArray144[1], Static43.anIntArray144[3], arg0.anIntArray135[local13]);
				} else {
					Static1.method106(local154, local158, local162, local142, local146, local150, arg0.anIntArray146[local13], arg0.anIntArray142[local13], arg0.anIntArray148[local13], Static43.anIntArray139[local20], Static43.anIntArray139[local27], Static43.anIntArray139[local37], Static43.anIntArray140[local20], Static43.anIntArray140[local27], Static43.anIntArray140[local37], Static43.anIntArray144[local20], Static43.anIntArray144[local27], Static43.anIntArray144[local37], arg0.anIntArray135[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)V")
	public static void method1379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass80_1 = null;
		}
	}
}
