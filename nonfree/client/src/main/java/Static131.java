import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1668 = Static32.method683("Unable to connect)3");

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1667 = aClass49_1668;

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
	public static int anInt3731 = 0;

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1669 = Static32.method683("Loading fonts )2 ");

	@OriginalMember(owner = "client!ph", name = "t", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1670 = aClass49_1669;

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1671 = aClass49_1668;

	@OriginalMember(owner = "client!ph", name = "w", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1672 = Static32.method683("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!ph", name = "x", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1673 = aClass49_1672;

	@OriginalMember(owner = "client!ph", name = "z", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1674 = Static32.method683("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
	public static int anInt3735 = 0;

	@OriginalMember(owner = "client!ph", name = "C", descriptor = "Lclient!rc;")
	public static Class74 aClass74_92 = new Class74(64);

	@OriginalMember(owner = "client!ph", name = "D", descriptor = "Lclient!rc;")
	public static Class74 aClass74_93 = new Class74(50);

	@OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
	public static int anInt3736 = 0;

	@OriginalMember(owner = "client!ph", name = "F", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1675 = Static32.method683("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!vg;)V")
	public static void method2839(@OriginalArg(1) Class85 arg0) {
		@Pc(2) int local2 = arg0.anInt3876;
		if (local2 == 324) {
			if (Static48.anInt1131 == -1) {
				Static158.anInt3451 = arg0.anInt3847;
				Static48.anInt1131 = arg0.anInt3881;
			}
			if (Static128.aClass10_1.aBoolean13) {
				arg0.anInt3881 = Static48.anInt1131;
			} else {
				arg0.anInt3881 = Static158.anInt3451;
			}
		} else if (local2 == 325) {
			if (Static48.anInt1131 == -1) {
				Static158.anInt3451 = arg0.anInt3847;
				Static48.anInt1131 = arg0.anInt3881;
			}
			if (Static128.aClass10_1.aBoolean13) {
				arg0.anInt3881 = Static158.anInt3451;
			} else {
				arg0.anInt3881 = Static48.anInt1131;
			}
		} else if (local2 == 327) {
			arg0.anInt3853 = 150;
			arg0.anInt3862 = (int) (Math.sin((double) Static127.anInt2757 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt3885 = -1;
			arg0.anInt3864 = 5;
		} else if (local2 == 328) {
			if (Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.aClass49_1606 == null) {
				arg0.anInt3885 = 0;
			} else {
				arg0.anInt3853 = 150;
				arg0.anInt3862 = (int) (Math.sin((double) Static127.anInt2757 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt3864 = 5;
				arg0.anInt3885 = ((int) Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.aClass49_1606.method1651() << 11) + 2047;
				arg0.anInt3888 = Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3550;
				arg0.anInt3863 = Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3554;
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
	public static void method2840() {
		aClass49_1671 = null;
		aClass49_1669 = null;
		aClass49_1672 = null;
		aClass49_1674 = null;
		aClass74_93 = null;
		aClass49_1668 = null;
		aClass74_92 = null;
		aClass49_1675 = null;
		aClass49_1670 = null;
		aClass49_1667 = null;
		aClass49_1673 = null;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method2841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!eb;IIIIII)V")
	public static void method2842(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray92.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray92[local5] - Static17.anInt2522;
			local20 = arg0.anIntArray93[local5] - Static156.anInt3422;
			local27 = arg0.anIntArray98[local5] - Static128.anInt2775;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray89 != null) {
				Static39.anIntArray90[local5] = local37;
				Static39.anIntArray94[local5] = local59;
				Static39.anIntArray96[local5] = local69;
			}
			Static39.anIntArray88[local5] = Static109.anInt2279 + (local37 << 9) / local69;
			Static39.anIntArray86[local5] = Static109.anInt2281 + (local59 << 9) / local69;
		}
		Static109.anInt2278 = 0;
		local3 = arg0.anIntArray100.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray100[local13];
			local27 = arg0.anIntArray91[local13];
			local37 = arg0.anIntArray99[local13];
			@Pc(142) int local142 = Static39.anIntArray88[local20];
			@Pc(146) int local146 = Static39.anIntArray88[local27];
			@Pc(150) int local150 = Static39.anIntArray88[local37];
			@Pc(154) int local154 = Static39.anIntArray86[local20];
			@Pc(158) int local158 = Static39.anIntArray86[local27];
			@Pc(162) int local162 = Static39.anIntArray86[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static113.aBoolean102 && method2841(Static31.anInt817, Static155.anInt3387, local154, local158, local162, local142, local146, local150)) {
					Static8.anInt2220 = arg5;
					Static29.anInt698 = arg6;
				}
				Static109.aBoolean97 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static109.anInt2285 || local146 > Static109.anInt2285 || local150 > Static109.anInt2285) {
					Static109.aBoolean97 = true;
				}
				if (arg0.anIntArray89 == null || arg0.anIntArray89[local13] == -1) {
					if (arg0.anIntArray87[local13] != 12345678) {
						Static109.method1867(local154, local158, local162, local142, local146, local150, arg0.anIntArray87[local13], arg0.anIntArray97[local13], arg0.anIntArray95[local13]);
					}
				} else if (Static171.aBoolean156) {
					@Pc(363) int local363 = Static109.anInterface1_2.method188(arg0.anIntArray89[local13]);
					Static109.method1867(local154, local158, local162, local142, local146, local150, Static123.method2141(local363, arg0.anIntArray87[local13]), Static123.method2141(local363, arg0.anIntArray97[local13]), Static123.method2141(local363, arg0.anIntArray95[local13]));
				} else if (arg0.aBoolean34) {
					Static109.method1880(local154, local158, local162, local142, local146, local150, arg0.anIntArray87[local13], arg0.anIntArray97[local13], arg0.anIntArray95[local13], Static39.anIntArray90[0], Static39.anIntArray90[1], Static39.anIntArray90[3], Static39.anIntArray94[0], Static39.anIntArray94[1], Static39.anIntArray94[3], Static39.anIntArray96[0], Static39.anIntArray96[1], Static39.anIntArray96[3], arg0.anIntArray89[local13]);
				} else {
					Static109.method1880(local154, local158, local162, local142, local146, local150, arg0.anIntArray87[local13], arg0.anIntArray97[local13], arg0.anIntArray95[local13], Static39.anIntArray90[local20], Static39.anIntArray90[local27], Static39.anIntArray90[local37], Static39.anIntArray94[local20], Static39.anIntArray94[local27], Static39.anIntArray94[local37], Static39.anIntArray96[local20], Static39.anIntArray96[local27], Static39.anIntArray96[local37], arg0.anIntArray89[local13]);
				}
			}
		}
	}
}
