import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!od", name = "t", descriptor = "J")
	public static long aLong99;

	@OriginalMember(owner = "client!od", name = "w", descriptor = "I")
	public static int anInt3249;

	@OriginalMember(owner = "client!od", name = "x", descriptor = "Lclient!nb;")
	public static Class15 aClass15_30;

	@OriginalMember(owner = "client!od", name = "C", descriptor = "[I")
	public static int[] anIntArray337;

	@OriginalMember(owner = "client!od", name = "E", descriptor = "[I")
	public static int[] anIntArray338;

	@OriginalMember(owner = "client!od", name = "u", descriptor = "Lclient!i;")
	public static Class41 aClass41_897 = Static184.method2923("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!od", name = "y", descriptor = "Lclient!i;")
	public static Class41 aClass41_898 = Static184.method2923(":tradereq:");

	@OriginalMember(owner = "client!od", name = "z", descriptor = "Lclient!i;")
	public static Class41 aClass41_899 = Static184.method2923("(U0a )2 in: ");

	@OriginalMember(owner = "client!od", name = "D", descriptor = "Lclient!i;")
	public static Class41 aClass41_900 = Static184.method2923(" weitere Optionen");

	@OriginalMember(owner = "client!od", name = "G", descriptor = "I")
	public static int anInt3252 = 0;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)I")
	public static int method2224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > arg2) {
			return arg0;
		} else if (arg2 > arg1) {
			return arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!f;IIIIIIZ)V")
	public static void method2226(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray146.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray146[local5] - Static65.anInt1729;
			local20 = arg0.anIntArray145[local5] - Static214.anInt4717;
			local27 = arg0.anIntArray136[local5] - Static191.anInt4374;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray144 != null) {
				Static51.anIntArray141[local5] = local37;
				Static51.anIntArray148[local5] = local59;
				Static51.anIntArray140[local5] = local69;
			}
			Static51.anIntArray138[local5] = Static155.anInt3625 + (local37 << 9) / local69;
			Static51.anIntArray143[local5] = Static155.anInt3624 + (local59 << 9) / local69;
		}
		Static155.anInt3621 = 0;
		local3 = arg0.anIntArray150.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray150[local13];
			local27 = arg0.anIntArray139[local13];
			local37 = arg0.anIntArray137[local13];
			@Pc(142) int local142 = Static51.anIntArray138[local20];
			@Pc(146) int local146 = Static51.anIntArray138[local27];
			@Pc(150) int local150 = Static51.anIntArray138[local37];
			@Pc(154) int local154 = Static51.anIntArray143[local20];
			@Pc(158) int local158 = Static51.anIntArray143[local27];
			@Pc(162) int local162 = Static51.anIntArray143[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static104.aBoolean136 && Static21.method3206(Static36.anInt953 + Static155.anInt3625, Static33.anInt889 + Static155.anInt3624, local154, local158, local162, local142, local146, local150)) {
					Static100.anInt2439 = arg5;
					Static79.anInt2049 = arg6;
				}
				if (!arg7) {
					Static155.aBoolean209 = false;
					if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static155.anInt3622 || local146 > Static155.anInt3622 || local150 > Static155.anInt3622) {
						Static155.aBoolean209 = true;
					}
					if (arg0.anIntArray144 == null || arg0.anIntArray144[local13] == -1) {
						if (arg0.anIntArray149[local13] != 12345678) {
							Static155.method2524(local154, local158, local162, local142, local146, local150, arg0.anIntArray149[local13], arg0.anIntArray147[local13], arg0.anIntArray142[local13]);
						}
					} else if (Static91.aBoolean119) {
						@Pc(369) int local369 = Static155.anInterface1_1.method1135(arg0.anIntArray144[local13]);
						Static155.method2524(local154, local158, local162, local142, local146, local150, Static103.method1767(local369, arg0.anIntArray149[local13]), Static103.method1767(local369, arg0.anIntArray147[local13]), Static103.method1767(local369, arg0.anIntArray142[local13]));
					} else if (arg0.aBoolean73) {
						Static155.method2522(local154, local158, local162, local142, local146, local150, arg0.anIntArray149[local13], arg0.anIntArray147[local13], arg0.anIntArray142[local13], Static51.anIntArray141[0], Static51.anIntArray141[1], Static51.anIntArray141[3], Static51.anIntArray148[0], Static51.anIntArray148[1], Static51.anIntArray148[3], Static51.anIntArray140[0], Static51.anIntArray140[1], Static51.anIntArray140[3], arg0.anIntArray144[local13]);
					} else {
						Static155.method2522(local154, local158, local162, local142, local146, local150, arg0.anIntArray149[local13], arg0.anIntArray147[local13], arg0.anIntArray142[local13], Static51.anIntArray141[local20], Static51.anIntArray141[local27], Static51.anIntArray141[local37], Static51.anIntArray148[local20], Static51.anIntArray148[local27], Static51.anIntArray148[local37], Static51.anIntArray140[local20], Static51.anIntArray140[local27], Static51.anIntArray140[local37], arg0.anIntArray144[local13]);
					}
				}
			}
		}
	}
}
