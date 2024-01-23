import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
	public static int anInt5064;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "[I")
	public static int[] anIntArray398;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "[I")
	public static int[] anIntArray399;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "[I")
	public static int[] anIntArray400;

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
	public static int anInt5069;

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
	public static int anInt5065 = 0;

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
	public static int anInt5066 = 0;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
	public static int anInt5067 = 0;

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
	public static int anInt5068 = 0;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIII)V")
	private static void method4010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 == 0) {
			method4030(arg0, arg1, arg3);
			return;
		}
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(15) int local15 = arg1 - arg2;
		if (local15 < anInt5065) {
			local15 = anInt5065;
		}
		@Pc(26) int local26 = arg1 + arg2 + 1;
		if (local26 > anInt5068) {
			local26 = anInt5068;
		}
		@Pc(33) int local33 = local15;
		@Pc(37) int local37 = arg2 * arg2;
		@Pc(39) int local39 = 0;
		@Pc(43) int local43 = arg1 - local15;
		@Pc(47) int local47 = local43 * local43;
		@Pc(51) int local51 = local47 - local43;
		if (arg1 > local26) {
			arg1 = local26;
		}
		@Pc(85) int local85;
		@Pc(94) int local94;
		@Pc(105) int local105;
		@Pc(107) int local107;
		while (local33 < arg1) {
			while (local51 <= local37 || local47 <= local37) {
				local47 += local39 + local39;
				local51 += local39++ + local39;
			}
			local85 = arg0 + 1 - local39;
			if (local85 < anInt5067) {
				local85 = anInt5067;
			}
			local94 = arg0 + local39;
			if (local94 > anInt5066) {
				local94 = anInt5066;
			}
			local105 = local85 + local33 * anInt5069;
			for (local107 = local85; local107 < local94; local107++) {
				anIntArray399[local105++] = arg3;
			}
			local33++;
			local47 -= local43-- + local43;
			local51 -= local43 + local43;
		}
		local39 = arg2;
		local43 = local33 - arg1;
		local51 = local43 * local43 + local37;
		local47 = local51 - arg2;
		local51 -= local43;
		while (local33 < local26) {
			while (local51 > local37 && local47 > local37) {
				local51 -= local39-- + local39;
				local47 -= local39 + local39;
			}
			local85 = arg0 - local39;
			if (local85 < anInt5067) {
				local85 = anInt5067;
			}
			local94 = arg0 + local39;
			if (local94 > anInt5066 - 1) {
				local94 = anInt5066 - 1;
			}
			local105 = local85 + local33 * anInt5069;
			for (local107 = local85; local107 <= local94; local107++) {
				anIntArray399[local105++] = arg3;
			}
			local33++;
			local51 += local43 + local43;
			local47 += local43++ + local43;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIII)V")
	public static void method4011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method4033(arg0, arg1, arg2, arg4, arg5);
		method4033(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method4032(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method4032(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "()V")
	public static void method4012() {
		anInt5067 = 0;
		anInt5065 = 0;
		anInt5066 = anInt5069;
		anInt5068 = anInt5064;
		method4020();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([I[I)V")
	public static void method4013(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0.length != anInt5068 - anInt5065 || arg1.length != anInt5068 - anInt5065) {
			throw new IllegalArgumentException();
		}
		anIntArray400 = arg0;
		anIntArray398 = arg1;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIII)V")
	public static void method4014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				method4021(arg0, arg1, arg2 + 1, arg4);
			} else {
				method4021(arg0 + arg2, arg1, 1 - arg2, arg4);
			}
		} else if (arg2 != 0) {
			if (arg2 + arg3 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(96) int local96;
			@Pc(127) int local127;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(86) int local86 = arg3 << 16;
				local96 = (int) Math.floor((double) local86 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < anInt5067) {
					arg1 += local96 * (anInt5067 - arg0);
					arg0 = anInt5067;
				}
				if (arg2 >= anInt5066) {
					arg2 = anInt5066 - 1;
				}
				while (arg0 <= arg2) {
					local127 = arg1 >> 16;
					if (local127 >= anInt5065 && local127 < anInt5068) {
						anIntArray399[arg0 + local127 * anInt5069] = arg4;
					}
					arg1 += local96;
					arg0++;
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				@Pc(160) int local160 = arg2 << 16;
				local96 = (int) Math.floor((double) local160 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < anInt5065) {
					arg0 += local96 * (anInt5065 - arg1);
					arg1 = anInt5065;
				}
				if (arg3 >= anInt5068) {
					arg3 = anInt5068 - 1;
				}
				while (arg1 <= arg3) {
					local127 = arg0 >> 16;
					if (local127 >= anInt5067 && local127 < anInt5066) {
						anIntArray399[local127 + arg1 * anInt5069] = arg4;
					}
					arg0 += local96;
					arg1++;
				}
			}
		} else if (arg3 >= 0) {
			method4018(arg0, arg1, arg3 + 1, arg4);
		} else {
			method4018(arg0, arg1 + arg3, -arg3 + 1, arg4);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([I)V")
	public static void method4015(@OriginalArg(0) int[] arg0) {
		anInt5067 = arg0[0];
		anInt5065 = arg0[1];
		anInt5066 = arg0[2];
		anInt5068 = arg0[3];
		method4020();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([III)V")
	public static void method4016(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		anIntArray399 = arg0;
		anInt5069 = arg1;
		anInt5064 = arg2;
		method4029(0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(IIII)V")
	public static void method4018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < anInt5067 || arg0 >= anInt5066) {
			return;
		}
		if (arg1 < anInt5065) {
			arg2 -= anInt5065 - arg1;
			arg1 = anInt5065;
		}
		if (arg1 + arg2 > anInt5068) {
			arg2 = anInt5068 - arg1;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt5069;
		@Pc(34) int local34 = 0;
		while (local34 < arg2) {
			anIntArray399[local32] = arg3;
			local34++;
			local32 += anInt5069;
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "([I)V")
	public static void method4019(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt5067;
		arg0[1] = anInt5065;
		arg0[2] = anInt5066;
		arg0[3] = anInt5068;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "()V")
	public static void method4020() {
		anIntArray400 = null;
		anIntArray398 = null;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(IIII)V")
	public static void method4021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < anInt5065 || arg1 >= anInt5068) {
			return;
		}
		if (arg0 < anInt5067) {
			arg2 -= anInt5067 - arg0;
			arg0 = anInt5067;
		}
		if (arg0 + arg2 > anInt5066) {
			arg2 = anInt5066 - arg0;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt5069;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray399[local32 + local34] = arg3;
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(IIIIII)V")
	public static void method4022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg2 - arg0;
		@Pc(7) int local7 = arg3 - arg1;
		@Pc(14) int local14 = local3 >= 0 ? local3 : -local3;
		@Pc(21) int local21 = local7 >= 0 ? local7 : -local7;
		@Pc(23) int local23 = local14;
		if (local14 < local21) {
			local23 = local21;
		}
		if (local23 == 0) {
			return;
		}
		@Pc(37) int local37 = (local3 << 16) / local23;
		@Pc(43) int local43 = (local7 << 16) / local23;
		if (local43 <= local37) {
			local37 = -local37;
		} else {
			local43 = -local43;
		}
		@Pc(59) int local59 = arg5 * local43 >> 17;
		@Pc(67) int local67 = arg5 * local43 + 1 >> 17;
		@Pc(73) int local73 = arg5 * local37 >> 17;
		@Pc(81) int local81 = arg5 * local37 + 1 >> 17;
		@Pc(85) int local85 = arg0 - Static283.method4417();
		@Pc(89) int local89 = arg1 - Static283.method4419();
		@Pc(93) int local93 = local85 + local59;
		@Pc(97) int local97 = local85 - local67;
		@Pc(103) int local103 = local85 + local3 - local67;
		@Pc(109) int local109 = local85 + local3 + local59;
		@Pc(113) int local113 = local89 + local73;
		@Pc(117) int local117 = local89 - local81;
		@Pc(123) int local123 = local89 + local7 - local81;
		@Pc(129) int local129 = local89 + local7 + local73;
		Static283.method4410(local93, local97, local103);
		Static283.method4424(local113, local117, local123, local93, local97, local103, arg4);
		Static283.method4410(local93, local103, local109);
		Static283.method4424(local113, local123, local129, local93, local103, local109, arg4);
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(IIII)V")
	public static void method4023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt5067 < arg0) {
			anInt5067 = arg0;
		}
		if (anInt5065 < arg1) {
			anInt5065 = arg1;
		}
		if (anInt5066 > arg2) {
			anInt5066 = arg2;
		}
		if (anInt5068 > arg3) {
			anInt5068 = arg3;
		}
		method4020();
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "()V")
	public static void method4024() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = anInt5069 * anInt5064 - 7;
		while (local1 < local7) {
			anIntArray399[local1++] = 0;
			anIntArray399[local1++] = 0;
			anIntArray399[local1++] = 0;
			anIntArray399[local1++] = 0;
			anIntArray399[local1++] = 0;
			anIntArray399[local1++] = 0;
			anIntArray399[local1++] = 0;
			anIntArray399[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			anIntArray399[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(IIIII)V")
	public static void method4025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		method4021(arg0, arg1, arg2, arg4);
		method4021(arg0, arg1 + arg3 - 1, arg2, arg4);
		method4018(arg0, arg1, arg3, arg4);
		method4018(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(IIIIII)V")
	public static void method4026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < anInt5067) {
			arg2 -= anInt5067 - arg0;
			arg0 = anInt5067;
		}
		if (arg1 < anInt5065) {
			arg3 -= anInt5065 - arg1;
			arg1 = anInt5065;
		}
		if (arg0 + arg2 > anInt5066) {
			arg2 = anInt5066 - arg0;
		}
		if (arg1 + arg3 > anInt5068) {
			arg3 = anInt5068 - arg1;
		}
		@Pc(59) int local59 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
		@Pc(63) int local63 = 256 - arg5;
		@Pc(67) int local67 = anInt5069 - arg2;
		@Pc(73) int local73 = arg0 + arg1 * anInt5069;
		for (@Pc(75) int local75 = 0; local75 < arg3; local75++) {
			for (@Pc(81) int local81 = -arg2; local81 < 0; local81++) {
				@Pc(87) int local87 = anIntArray399[local73];
				@Pc(107) int local107 = ((local87 & 0xFF00FF) * local63 >> 8 & 0xFF00FF) + ((local87 & 0xFF00) * local63 >> 8 & 0xFF00);
				anIntArray399[local73++] = local59 + local107;
			}
			local73 += local67;
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(IIIII)V")
	public static void method4027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == 0) {
			return;
		}
		if (arg4 == 256) {
			method4010(arg0, arg1, arg2, arg3);
			return;
		}
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(20) int local20 = 256 - arg4;
		@Pc(28) int local28 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(36) int local36 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(42) int local42 = (arg3 & 0xFF) * arg4;
		@Pc(46) int local46 = arg1 - arg2;
		if (local46 < anInt5065) {
			local46 = anInt5065;
		}
		@Pc(57) int local57 = arg1 + arg2 + 1;
		if (local57 > anInt5068) {
			local57 = anInt5068;
		}
		@Pc(64) int local64 = local46;
		@Pc(68) int local68 = arg2 * arg2;
		@Pc(70) int local70 = 0;
		@Pc(74) int local74 = arg1 - local46;
		@Pc(78) int local78 = local74 * local74;
		@Pc(82) int local82 = local78 - local74;
		if (arg1 > local57) {
			arg1 = local57;
		}
		@Pc(151) int local151;
		@Pc(161) int local161;
		@Pc(169) int local169;
		@Pc(116) int local116;
		@Pc(125) int local125;
		@Pc(136) int local136;
		@Pc(138) int local138;
		@Pc(191) int local191;
		while (local64 < arg1) {
			while (local82 <= local68 || local78 <= local68) {
				local78 += local70 + local70;
				local82 += local70++ + local70;
			}
			local116 = arg0 + 1 - local70;
			if (local116 < anInt5067) {
				local116 = anInt5067;
			}
			local125 = arg0 + local70;
			if (local125 > anInt5066) {
				local125 = anInt5066;
			}
			local136 = local116 + local64 * anInt5069;
			for (local138 = local116; local138 < local125; local138++) {
				local151 = (anIntArray399[local136] >> 16 & 0xFF) * local20;
				local161 = (anIntArray399[local136] >> 8 & 0xFF) * local20;
				local169 = (anIntArray399[local136] & 0xFF) * local20;
				local191 = (local28 + local151 >> 8 << 16) + (local36 + local161 >> 8 << 8) + (local42 + local169 >> 8);
				anIntArray399[local136++] = local191;
			}
			local64++;
			local78 -= local74-- + local74;
			local82 -= local74 + local74;
		}
		local70 = arg2;
		local74 = -local74;
		local82 = local74 * local74 + local68;
		local78 = local82 - arg2;
		local82 -= local74;
		while (local64 < local57) {
			while (local82 > local68 && local78 > local68) {
				local82 -= local70-- + local70;
				local78 -= local70 + local70;
			}
			local116 = arg0 - local70;
			if (local116 < anInt5067) {
				local116 = anInt5067;
			}
			local125 = arg0 + local70;
			if (local125 > anInt5066 - 1) {
				local125 = anInt5066 - 1;
			}
			local136 = local116 + local64 * anInt5069;
			for (local138 = local116; local138 <= local125; local138++) {
				local151 = (anIntArray399[local136] >> 16 & 0xFF) * local20;
				local161 = (anIntArray399[local136] >> 8 & 0xFF) * local20;
				local169 = (anIntArray399[local136] & 0xFF) * local20;
				local191 = (local28 + local151 >> 8 << 16) + (local36 + local161 >> 8 << 8) + (local42 + local169 >> 8);
				anIntArray399[local136++] = local191;
			}
			local64++;
			local82 += local74 + local74;
			local78 += local74++ + local74;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III[I[I)V")
	public static void method4028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		@Pc(5) int local5 = arg0 + arg1 * anInt5069;
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(17) int local17 = local5 + arg2[local7];
			for (@Pc(22) int local22 = -arg3[local7]; local22 < 0; local22++) {
				anIntArray399[local17++] = 0;
			}
			local5 += anInt5069;
		}
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(IIII)V")
	public static void method4029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > anInt5069) {
			arg2 = anInt5069;
		}
		if (arg3 > anInt5064) {
			arg3 = anInt5064;
		}
		anInt5067 = arg0;
		anInt5065 = arg1;
		anInt5066 = arg2;
		anInt5068 = arg3;
		method4020();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V")
	private static void method4030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 >= anInt5067 && arg1 >= anInt5065 && arg0 < anInt5066 && arg1 < anInt5068) {
			anIntArray399[arg0 + arg1 * anInt5069] = arg2;
		}
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(IIIII)V")
	public static void method4031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt5067) {
			arg2 -= anInt5067 - arg0;
			arg0 = anInt5067;
		}
		if (arg1 < anInt5065) {
			arg3 -= anInt5065 - arg1;
			arg1 = anInt5065;
		}
		if (arg0 + arg2 > anInt5066) {
			arg2 = anInt5066 - arg0;
		}
		if (arg1 + arg3 > anInt5068) {
			arg3 = anInt5068 - arg1;
		}
		@Pc(43) int local43 = anInt5069 - arg2;
		@Pc(49) int local49 = arg0 + arg1 * anInt5069;
		for (@Pc(52) int local52 = -arg3; local52 < 0; local52++) {
			for (@Pc(57) int local57 = -arg2; local57 < 0; local57++) {
				anIntArray399[local49++] = arg4;
			}
			local49 += local43;
		}
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(IIIII)V")
	private static void method4032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt5067 || arg0 >= anInt5066) {
			return;
		}
		if (arg1 < anInt5065) {
			arg2 -= anInt5065 - arg1;
			arg1 = anInt5065;
		}
		if (arg1 + arg2 > anInt5068) {
			arg2 = anInt5068 - arg1;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt5069;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(73) int local73 = (anIntArray399[local58] >> 16 & 0xFF) * local30;
			@Pc(83) int local83 = (anIntArray399[local58] >> 8 & 0xFF) * local30;
			@Pc(91) int local91 = (anIntArray399[local58] & 0xFF) * local30;
			@Pc(113) int local113 = (local38 + local73 >> 8 << 16) + (local46 + local83 >> 8 << 8) + (local52 + local91 >> 8);
			anIntArray399[local58] = local113;
			local58 += anInt5069;
		}
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(IIIII)V")
	private static void method4033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < anInt5065 || arg1 >= anInt5068) {
			return;
		}
		if (arg0 < anInt5067) {
			arg2 -= anInt5067 - arg0;
			arg0 = anInt5067;
		}
		if (arg0 + arg2 > anInt5066) {
			arg2 = anInt5066 - arg0;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt5069;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(73) int local73 = (anIntArray399[local58] >> 16 & 0xFF) * local30;
			@Pc(83) int local83 = (anIntArray399[local58] >> 8 & 0xFF) * local30;
			@Pc(91) int local91 = (anIntArray399[local58] & 0xFF) * local30;
			@Pc(113) int local113 = (local38 + local73 >> 8 << 16) + (local46 + local83 >> 8 << 8) + (local52 + local91 >> 8);
			anIntArray399[local58++] = local113;
		}
	}
}
