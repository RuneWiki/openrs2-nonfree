import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!mf", name = "A", descriptor = "[I")
	public static final int[] anIntArray358 = new int[4];

	@OriginalMember(owner = "client!mf", name = "I", descriptor = "Z")
	public static boolean aBoolean459 = false;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBIIIIIII)V")
	public static void method5333(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < 1 || arg4 < 1 || Static124.anInt2150 - 2 < arg3 || arg4 > Static64.anInt1015 - 2) {
			return;
		}
		@Pc(36) int local36 = arg5;
		if (arg5 < 3 && Static488.method7149(arg3, arg4)) {
			local36 = arg5 + 1;
		}
		if (Static655.aClass5_Sub36_29.aClass2_Sub19_1.method7172() == 0 && !Static71.method1044(local36, arg3, arg4, Static326.anInt5965)) {
			return;
		}
		if (Static129.aClass313ArrayArrayArray7 == null) {
			return;
		}
		Static652.aClass34_Sub1_2.method542(arg6, Static137.aClass234Array1[arg5], Static563.aClass143_13, arg3, arg5, arg4);
		if (arg7 < 0) {
			return;
		}
		@Pc(84) int local84 = Static655.aClass5_Sub36_29.aClass2_Sub3_1.method2012();
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub3_1, 1);
		Static652.aClass34_Sub1_2.method543(arg4, arg0, arg1, arg5, Static137.aClass234Array1[arg5], local36, arg2, arg7, Static563.aClass143_13, arg3);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub3_1, local84);
		return;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)V")
	public static void method5334(@OriginalArg(1) int arg0) {
		@Pc(1) Class5_Sub2_Sub7 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class88 local8 = Static230.aClass88Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static92.anInt1526; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static665.anInt7330; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static138.anInt2287;
							@Pc(32) int local32 = local12 << Static138.anInt2287;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class88 local41 = Static230.aClass88Array2[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method8749(local15, local12) - local41.method8749(local15, local12);
									@Pc(71) int local71 = local8.method8749(local15 + 1, local12) - local41.method8749(local15 + 1, local12);
									@Pc(91) int local91 = local8.method8749(local15 + 1, local12 + 1) - local41.method8749(local15 + 1, local12 + 1);
									@Pc(107) int local107 = local8.method8749(local15, local12 + 1) - local41.method8749(local15, local12 + 1);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)V")
	public static void method5336() {
		if (Static307.anInt5474 == -1 || Static235.anInt3819 == -1) {
			return;
		}
		@Pc(21) int local21 = Static314.anInt5578 + ((Static636.anInt10129 - Static314.anInt5578) * Static102.anInt1792 >> 16);
		Static102.anInt1792 += local21;
		if (Static102.anInt1792 >= 65535) {
			if (Static187.aBoolean211) {
				Static494.aBoolean613 = false;
			} else {
				Static494.aBoolean613 = true;
			}
			Static102.anInt1792 = 65535;
			Static187.aBoolean211 = true;
		} else {
			Static187.aBoolean211 = false;
			Static494.aBoolean613 = false;
		}
		@Pc(51) float local51 = (float) Static102.anInt1792 / 65535.0F;
		@Pc(54) float[] local54 = new float[3];
		@Pc(58) int local58 = Static162.anInt7889 * 2;
		@Pc(83) int local83;
		@Pc(117) int local117;
		@Pc(125) int local125;
		@Pc(130) int local130;
		@Pc(139) int local139;
		@Pc(156) int local156;
		for (@Pc(60) int local60 = 0; local60 < 3; local60++) {
			@Pc(71) int local71 = Static214.anIntArrayArrayArray4[Static307.anInt5474][local58][local60] * 3;
			local83 = Static214.anIntArrayArrayArray4[Static307.anInt5474][local58 + 1][local60] * 3;
			local117 = (Static214.anIntArrayArrayArray4[Static307.anInt5474][local58 + 2][local60] + Static214.anIntArrayArrayArray4[Static307.anInt5474][local58 + 2][local60] - Static214.anIntArrayArrayArray4[Static307.anInt5474][local58 + 3][local60]) * 3;
			local125 = Static214.anIntArrayArrayArray4[Static307.anInt5474][local58][local60];
			local130 = local83 - local71;
			local139 = local117 + local71 - local83 * 2;
			local156 = local83 + Static214.anIntArrayArrayArray4[Static307.anInt5474][local58 + 2][local60] - local125 - local117;
			local54[local60] = (float) local125 + local51 * ((local51 * (float) local156 + (float) local139) * local51 + (float) local130);
		}
		Static570.anInt9347 = (int) local54[0] - Static454.anInt7910 * 512;
		Static105.anInt1868 = (int) local54[2] - Static48.anInt750 * 512;
		Static546.anInt8938 = (int) local54[1] * -1;
		@Pc(211) float[] local211 = new float[3];
		local83 = Static287.anInt4500 * 2;
		for (local117 = 0; local117 < 3; local117++) {
			local125 = Static214.anIntArrayArrayArray4[Static235.anInt3819][local83][local117] * 3;
			local130 = Static214.anIntArrayArrayArray4[Static235.anInt3819][local83 + 1][local117] * 3;
			local139 = (Static214.anIntArrayArrayArray4[Static235.anInt3819][local83 + 2][local117] + Static214.anIntArrayArrayArray4[Static235.anInt3819][local83 + 2][local117] - Static214.anIntArrayArrayArray4[Static235.anInt3819][local83 + 3][local117]) * 3;
			local156 = Static214.anIntArrayArrayArray4[Static235.anInt3819][local83][local117];
			@Pc(285) int local285 = local130 - local125;
			@Pc(293) int local293 = local139 + local125 - local130 * 2;
			@Pc(311) int local311 = local130 + Static214.anIntArrayArrayArray4[Static235.anInt3819][local83 + 2][local117] - local156 - local139;
			local211[local117] = (float) local156 + local51 * ((local51 * (float) local311 + (float) local293) * local51 + (float) local285);
		}
		@Pc(343) float local343 = local211[0] - local54[0];
		@Pc(354) float local354 = -1.0F * (local211[1] - local54[1]);
		@Pc(362) float local362 = local211[2] - local54[2];
		@Pc(372) double local372 = Math.sqrt((double) (local343 * local343 + local362 * local362));
		Static498.anInt8495 = (int) (Math.atan2((double) local354, local372) * 2607.5945876176133D) & 0x3FFF;
		Static493.anInt8442 = (int) (-Math.atan2((double) local343, (double) local362) * 2607.5945876176133D) & 0x3FFF;
		Static78.anInt1274 = Static214.anIntArrayArrayArray4[Static307.anInt5474][local58][3] + ((Static214.anIntArrayArrayArray4[Static307.anInt5474][local58 + 2][3] - Static214.anIntArrayArrayArray4[Static307.anInt5474][local58][3]) * Static102.anInt1792 >> 16);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!kj;Ljava/lang/String;I)Lclient!rb;")
	public static Class297 method5337(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1, @OriginalArg(2) String arg2) {
		if (arg0 == 0) {
			return arg1.method4726(arg2);
		}
		@Pc(37) Class297 local37;
		if (arg0 == 1) {
			try {
				Static680.method2299("openjs", new Object[] { (new URL(Static285.anApplet5.getCodeBase(), arg2)).toString() }, Static285.anApplet5);
				local37 = new Class297();
				local37.anInt8459 = 1;
				return local37;
			} catch (@Pc(43) Throwable local43) {
				local37 = new Class297();
				local37.anInt8459 = 2;
				return local37;
			}
		} else if (arg0 == 2) {
			try {
				Static285.anApplet5.getAppletContext().showDocument(new URL(Static285.anApplet5.getCodeBase(), arg2), "_blank");
				local37 = new Class297();
				local37.anInt8459 = 1;
				return local37;
			} catch (@Pc(75) Exception local75) {
				local37 = new Class297();
				local37.anInt8459 = 2;
				return local37;
			}
		} else if (arg0 == 3) {
			try {
				Static680.method2300("loggedout", Static285.anApplet5);
			} catch (@Pc(103) Throwable local103) {
			}
			try {
				Static285.anApplet5.getAppletContext().showDocument(new URL(Static285.anApplet5.getCodeBase(), arg2), "_top");
				local37 = new Class297();
				local37.anInt8459 = 1;
				return local37;
			} catch (@Pc(123) Exception local123) {
				local37 = new Class297();
				local37.anInt8459 = 2;
				return local37;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)Lclient!lh;")
	public static Class217 method5338(@OriginalArg(0) int arg0) {
		@Pc(10) Class217 local10 = (Class217) Static560.aClass265_60.method6577((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static441.aClass50_125.method916(arg0, 0);
		local10 = new Class217();
		if (local20 != null) {
			local10.method5155(new Class5_Sub15(local20));
		}
		local10.method5153();
		Static560.aClass265_60.method6566(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!li;BI)V")
	public static void method5339(@OriginalArg(0) Class41_Sub1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = 0;
		if (arg0.anInt9491 > Static421.anInt7434) {
			Static276.method3846(arg0);
		} else if (Static421.anInt7434 <= arg0.anInt9455) {
			Static107.method1772(arg0);
		} else {
			Static149.method2218(arg0, false);
			local7 = Static652.anInt10280;
			local5 = Static194.anInt10095;
		}
		@Pc(123) int local123;
		if (arg0.anInt10366 < 512 || arg0.anInt10367 < 512 || arg0.anInt10366 >= Static124.anInt2150 * 512 - 512 || Static64.anInt1015 * 512 - 512 <= arg0.anInt10367) {
			arg0.anIntArray521 = null;
			local5 = -1;
			local7 = 0;
			arg0.anInt9503 = -1;
			arg0.anInt9455 = 0;
			arg0.anInt9491 = 0;
			arg0.anInt10366 = arg0.anIntArray528[0] * 512 + arg0.method7917() * 256;
			arg0.anInt10367 = arg0.anIntArray527[0] * 512 + arg0.method7917() * 256;
			arg0.method7923();
			for (local123 = 0; local123 < arg0.aClass329Array3.length; local123++) {
				arg0.aClass329Array3[local123].anInt9066 = -1;
			}
		}
		if (arg0 == Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1 && (arg0.anInt10366 < 6144 || arg0.anInt10367 < 6144 || arg0.anInt10366 >= Static124.anInt2150 * 512 - 6144 || Static64.anInt1015 * 512 - 6144 <= arg0.anInt10367)) {
			local5 = -1;
			arg0.anIntArray521 = null;
			arg0.anInt9455 = 0;
			local7 = 0;
			arg0.anInt9503 = -1;
			arg0.anInt9491 = 0;
			arg0.anInt10366 = arg0.anIntArray528[0] * 512 + arg0.method7917() * 256;
			arg0.anInt10367 = arg0.anIntArray527[0] * 512 + arg0.method7917() * 256;
			arg0.method7923();
			for (local123 = 0; local123 < arg0.aClass329Array3.length; local123++) {
				arg0.aClass329Array3[local123].anInt9066 = -1;
			}
		}
		local123 = Static57.method859(arg0);
		Static224.method3189(arg0);
		Static53.method3584(local7, local5, local123, arg0);
		Static413.method6083(arg0, local5);
		Static411.method6069(arg0);
	}
}
