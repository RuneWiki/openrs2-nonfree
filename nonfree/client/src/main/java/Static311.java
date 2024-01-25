import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!mt", name = "x", descriptor = "I")
	public static int anInt6050;

	@OriginalMember(owner = "client!mt", name = "B", descriptor = "I")
	public static int anInt6054;

	@OriginalMember(owner = "client!mt", name = "v", descriptor = "[I")
	public static int[] anIntArray539 = new int[1];

	@OriginalMember(owner = "client!mt", name = "w", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_104 = new Class133(70, 28);

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!rt;I)V")
	public static void method5067(@OriginalArg(0) Class3_Sub27 arg0) {
		if (arg0.aByteArray114.length - arg0.anInt9191 < 1) {
			return;
		}
		@Pc(29) int local29 = arg0.method7548();
		if (local29 < 0 || local29 > 1 || arg0.aByteArray114.length - arg0.anInt9191 < 2) {
			return;
		}
		@Pc(52) int local52 = arg0.method7591();
		if (arg0.aByteArray114.length - arg0.anInt9191 < local52 * 6) {
			return;
		}
		for (@Pc(66) int local66 = 0; local66 < local52; local66++) {
			@Pc(74) int local74 = arg0.method7591();
			@Pc(78) int local78 = arg0.method7549();
			if (Static416.anIntArray153.length > local74 && Static4.aBooleanArray44[local74] && (Class6_Sub1_Sub3.lb.method1463(local74).aChar2 != '1' || local78 >= -1 && local78 <= 1)) {
				Static416.anIntArray153[local74] = local78;
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(III)B")
	public static byte method5068(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!km;I)I")
	public static int method5069(@OriginalArg(0) Class166 arg0) {
		if (Static213.aClass166_3 == arg0) {
			return 5890;
		} else if (Static501.aClass166_4 == arg0) {
			return 34167;
		} else if (Static28.aClass166_1 == arg0) {
			return 34168;
		} else if (arg0 == Static144.aClass166_2) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)I")
	public static int method5070() {
		return Static211.anInt4643;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method5071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg4 && arg8 == arg7 && arg3 == arg1 && arg6 == arg0) {
			Static70.method609(arg5, arg2, arg7, arg0, arg1);
			return;
		}
		@Pc(27) int local27 = arg2;
		@Pc(29) int local29 = arg7;
		@Pc(33) int local33 = arg2 * 3;
		@Pc(37) int local37 = arg7 * 3;
		@Pc(41) int local41 = arg4 * 3;
		@Pc(45) int local45 = arg8 * 3;
		@Pc(49) int local49 = arg3 * 3;
		@Pc(53) int local53 = arg6 * 3;
		@Pc(63) int local63 = local41 + arg1 - arg2 - local49;
		@Pc(73) int local73 = local45 + arg0 - local53 - arg7;
		@Pc(83) int local83 = local49 + local33 - local41 - local41;
		@Pc(93) int local93 = local53 + local37 - local45 - local45;
		@Pc(98) int local98 = local41 - local33;
		@Pc(103) int local103 = local45 - local37;
		for (@Pc(105) int local105 = 128; local105 <= 4096; local105 += 128) {
			@Pc(113) int local113 = local105 * local105 >> 12;
			@Pc(119) int local119 = local113 * local105 >> 12;
			@Pc(123) int local123 = local63 * local119;
			@Pc(127) int local127 = local73 * local119;
			@Pc(131) int local131 = local83 * local113;
			@Pc(135) int local135 = local113 * local93;
			@Pc(139) int local139 = local98 * local105;
			@Pc(143) int local143 = local103 * local105;
			@Pc(153) int local153 = arg2 + (local139 + local131 + local123 >> 12);
			@Pc(163) int local163 = (local143 + local135 + local127 >> 12) + arg7;
			Static70.method609(arg5, local27, local29, local163, local153);
			local27 = local153;
			local29 = local163;
		}
	}
}
