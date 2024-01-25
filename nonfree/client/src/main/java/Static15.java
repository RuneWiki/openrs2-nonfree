import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!an", name = "q", descriptor = "I")
	public static int anInt485 = 0;

	@OriginalMember(owner = "client!an", name = "r", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_18 = new Class92(31, 8);

	@OriginalMember(owner = "client!an", name = "t", descriptor = "F")
	public static float aFloat3 = 0.0F;

	@OriginalMember(owner = "client!an", name = "u", descriptor = "I")
	public static int anInt486 = 0;

	@OriginalMember(owner = "client!an", name = "v", descriptor = "[I")
	public static final int[] anIntArray39 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!dn;Lclient!dn;B)I")
	public static int method457(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class56 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method1365(Static31.anInt838)) {
			local5++;
		}
		if (arg0.method1365(Static126.anInt3503)) {
			local5++;
		}
		if (arg0.method1365(Static215.anInt4228)) {
			local5++;
		}
		if (arg1.method1365(Static31.anInt838)) {
			local5++;
		}
		if (arg1.method1365(Static126.anInt3503)) {
			local5++;
		}
		if (arg1.method1365(Static215.anInt4228)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIIBIIII)V")
	public static void method458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 == arg4 && arg8 == arg6 && arg5 == arg1 && arg7 == arg0) {
			Static22.method610(arg7, arg5, arg4, arg8, arg2);
			return;
		}
		@Pc(43) int local43 = arg4;
		@Pc(45) int local45 = arg8;
		@Pc(49) int local49 = arg4 * 3;
		@Pc(53) int local53 = arg8 * 3;
		@Pc(57) int local57 = arg3 * 3;
		@Pc(61) int local61 = arg6 * 3;
		@Pc(65) int local65 = arg1 * 3;
		@Pc(69) int local69 = arg0 * 3;
		@Pc(78) int local78 = local57 + arg5 - local65 - arg4;
		@Pc(88) int local88 = local61 + arg7 - local69 - arg8;
		@Pc(99) int local99 = local65 + local49 - local57 - local57;
		@Pc(110) int local110 = local69 + local53 - local61 - local61;
		@Pc(115) int local115 = local57 - local49;
		@Pc(120) int local120 = local61 - local53;
		for (@Pc(122) int local122 = 128; local122 <= 4096; local122 += 128) {
			@Pc(130) int local130 = local122 * local122 >> 12;
			@Pc(136) int local136 = local122 * local130 >> 12;
			@Pc(140) int local140 = local136 * local78;
			@Pc(144) int local144 = local136 * local88;
			@Pc(148) int local148 = local130 * local99;
			@Pc(152) int local152 = local110 * local130;
			@Pc(156) int local156 = local115 * local122;
			@Pc(160) int local160 = local120 * local122;
			@Pc(170) int local170 = (local148 + local140 + local156 >> 12) + arg4;
			@Pc(180) int local180 = (local160 + local144 + local152 >> 12) + arg8;
			Static22.method610(local180, local170, local43, local45, arg2);
			local43 = local170;
			local45 = local180;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BIIIII)V")
	public static void method461(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(21) int local21 = arg0 * arg0;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(29) int local29 = local25 << 1;
		@Pc(33) int local33 = local21 << 1;
		@Pc(37) int local37 = arg2 << 1;
		@Pc(47) int local47 = (1 - local37) * local21 + local29;
		@Pc(56) int local56 = local25 - (local37 - 1) * local33;
		@Pc(60) int local60 = local21 << 2;
		@Pc(64) int local64 = local25 << 2;
		@Pc(72) int local72 = local29 * 3;
		@Pc(80) int local80 = local33 * ((arg2 << 1) - 3);
		@Pc(86) int local86 = local64;
		@Pc(92) int local92 = (arg2 - 1) * local60;
		@Pc(114) int local114;
		@Pc(123) int local123;
		if (arg1 >= Static161.anInt3448 && Static163.anInt3488 >= arg1) {
			local114 = Static439.method5863(arg4 + arg0, Static450.anInt7594, Static142.anInt3212);
			local123 = Static439.method5863(arg4 - arg0, Static450.anInt7594, Static142.anInt3212);
			method463(arg3, Static376.anIntArrayArray64[arg1], local123, local114);
		}
		while (local9 > 0) {
			if (local47 < 0) {
				while (local47 < 0) {
					local56 += local86;
					local47 += local72;
					local86 += local64;
					local7++;
					local72 += local64;
				}
			}
			if (local56 < 0) {
				local56 += local86;
				local47 += local72;
				local86 += local64;
				local72 += local64;
				local7++;
			}
			local47 += -local92;
			local56 += -local80;
			local92 -= local60;
			local80 -= local60;
			local9--;
			local114 = arg1 - local9;
			local123 = local9 + arg1;
			if (local123 >= Static161.anInt3448 && Static163.anInt3488 >= local114) {
				@Pc(228) int local228 = Static439.method5863(arg4 + local7, Static450.anInt7594, Static142.anInt3212);
				@Pc(237) int local237 = Static439.method5863(arg4 - local7, Static450.anInt7594, Static142.anInt3212);
				if (Static161.anInt3448 <= local114) {
					method463(arg3, Static376.anIntArrayArray64[local114], local237, local228);
				}
				if (local123 <= Static163.anInt3488) {
					method463(arg3, Static376.anIntArrayArray64[local123], local237, local228);
				}
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BLclient!um;)Z")
	public static boolean method462(@OriginalArg(1) Class238 arg0) {
		return arg0 == Static337.aClass238_5 || Static243.aClass238_3 == arg0 || Static336.aClass238_4 == arg0 || arg0 == Static89.aClass238_1;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I[IZII)V")
	public static void method463(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg2--;
		@Pc(6) int local6 = arg3 - 1;
		@Pc(9) int local9 = local6 - 7;
		while (local9 > arg2) {
			@Pc(12) int local12 = arg2 + 1;
			arg1[local12] = arg0;
			@Pc(17) int local17 = local12 + 1;
			arg1[local17] = arg0;
			@Pc(22) int local22 = local17 + 1;
			arg1[local22] = arg0;
			@Pc(27) int local27 = local22 + 1;
			arg1[local27] = arg0;
			@Pc(32) int local32 = local27 + 1;
			arg1[local32] = arg0;
			@Pc(37) int local37 = local32 + 1;
			arg1[local37] = arg0;
			@Pc(42) int local42 = local37 + 1;
			arg1[local42] = arg0;
			arg2 = local42 + 1;
			arg1[arg2] = arg0;
		}
		while (arg2 < local6) {
			arg2++;
			arg1[arg2] = arg0;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method467(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		Static212.aClass56_53.anInt1678 = 1;
		@Pc(13) String local13 = arg1.toLowerCase();
		@Pc(16) short[] local16 = new short[16];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < Static89.aClass157_1.anInt4724; local20++) {
			@Pc(26) Class191 local26 = Static89.aClass157_1.method3832(local20);
			if ((!arg0 || local26.aBoolean415) && local26.anInt5832 == -1 && local26.anInt5829 == -1 && local26.anInt5862 == 0 && local26.aString56.toLowerCase().indexOf(local13) != -1) {
				if (local18 >= 250) {
					Static301.anInt5506 = -1;
					Static72.aShortArray39 = null;
					return;
				}
				if (local18 >= local16.length) {
					@Pc(77) short[] local77 = new short[local16.length * 2];
					for (@Pc(79) int local79 = 0; local79 < local18; local79++) {
						local77[local79] = local16[local79];
					}
					local16 = local77;
				}
				local16[local18++] = (short) local20;
			}
		}
		Static425.anInt7285 = 0;
		Static301.anInt5506 = local18;
		Static72.aShortArray39 = local16;
		@Pc(116) String[] local116 = new String[Static301.anInt5506];
		for (@Pc(118) int local118 = 0; local118 < Static301.anInt5506; local118++) {
			local116[local118] = Static89.aClass157_1.method3832(local16[local118]).aString56;
		}
		Static258.method5845(local116, Static72.aShortArray39);
		Static212.aClass56_53.method1390();
		Static212.aClass56_53.anInt1678 = 2;
	}
}
