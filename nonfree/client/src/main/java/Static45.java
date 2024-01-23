import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
	public static int anInt932;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
	public static int anInt929 = -1;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)I")
	public static int method884() {
		return Static182.anInt3489 == 0 ? 0 : Static94.anInterface4Array3[Static182.anInt3489].method4404();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;BILjava/lang/String;)V")
	public static void method885(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static188.anIntArray297[local11] = Static188.anIntArray297[local11 - 1];
			Static77.aStringArray8[local11] = Static77.aStringArray8[local11 - 1];
			Static191.aStringArray29[local11] = Static191.aStringArray29[local11 - 1];
			Static82.aStringArray11[local11] = Static82.aStringArray11[local11 - 1];
			Static91.anIntArray163[local11] = Static91.anIntArray163[local11 - 1];
		}
		Static23.anInt398++;
		Static188.anIntArray297[0] = arg3;
		Static91.anIntArray163[0] = arg0;
		Static135.anInt2712 = Static86.anInt1698;
		Static77.aStringArray8[0] = arg1;
		Static191.aStringArray29[0] = arg4;
		Static82.aStringArray11[0] = arg2;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIZIIIIII)V")
	public static void method886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static90.aClass15_Sub5_Sub2_2.method4702() == 2) {
			Static188.method3082(arg3, arg4, arg8, arg2, arg1, arg5, arg6, arg0, arg7);
		} else if (Static90.aClass15_Sub5_Sub2_2.method4702() > 2) {
			Static174.method2941(arg1, arg3, arg4, arg8, arg2, arg0, Static90.aClass15_Sub5_Sub2_2.method4702(), arg5, arg7, arg6);
		} else {
			Static183.method2998(arg7, arg2, arg3, arg0, arg1, arg4, arg8, arg6, arg5);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;Lclient!nk;ZI)Lclient!r;")
	public static Class150 method887(@OriginalArg(0) String arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(15) int local15 = arg1.method3108(arg0);
		if (local15 == -1) {
			return new Class150(0);
		}
		@Pc(31) int[] local31 = arg1.method3135(local15);
		@Pc(37) Class150 local37 = new Class150(local31.length);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		while (true) {
			while (local39 < local37.anInt4326) {
				@Pc(61) Class1_Sub14 local61 = new Class1_Sub14(arg1.method3115(local15, local31[local41++]));
				@Pc(65) int local65 = local61.method1392();
				@Pc(69) int local69 = local61.method1386();
				@Pc(73) int local73 = local61.method1378();
				if (!arg2 && local73 == 1) {
					local37.anInt4326--;
				} else {
					local37.anIntArray369[local39] = local65;
					local37.aClass1_Sub2_Sub12Array1[local39] = new Class1_Sub2_Sub12();
					local37.aClass1_Sub2_Sub12Array1[local39].anInt3591 = local69;
					local39++;
				}
			}
			return local37;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIII)V")
	public static void method888(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = 0;
		Static273.method4257(arg3 - arg1, Static183.anIntArrayArray26[arg0], arg4, arg1 + arg3);
		@Pc(22) int local22 = arg2;
		@Pc(26) int local26 = arg1 * arg1;
		@Pc(30) int local30 = arg2 * arg2;
		@Pc(34) int local34 = local30 << 1;
		@Pc(38) int local38 = local26 << 1;
		@Pc(42) int local42 = arg2 << 1;
		@Pc(61) int local61 = local30 - local38 * (local42 - 1);
		@Pc(70) int local70 = local34 + local26 * (1 - local42);
		@Pc(74) int local74 = local26 << 2;
		@Pc(82) int local82 = local34 * 3;
		@Pc(86) int local86 = local30 << 2;
		@Pc(94) int local94 = local38 * ((arg2 << 1) - 3);
		@Pc(100) int local100 = (arg2 - 1) * local74;
		@Pc(106) int local106 = local86;
		while (local22 > 0) {
			local22--;
			if (local70 < 0) {
				while (local70 < 0) {
					local61 += local106;
					local3++;
					local106 += local86;
					local70 += local82;
					local82 += local86;
				}
			}
			if (local61 < 0) {
				local70 += local82;
				local61 += local106;
				local106 += local86;
				local3++;
				local82 += local86;
			}
			local70 += -local100;
			local61 += -local94;
			@Pc(179) int local179 = arg0 - local22;
			local100 -= local74;
			@Pc(187) int local187 = local22 + arg0;
			local94 -= local74;
			@Pc(195) int local195 = local3 + arg3;
			@Pc(199) int local199 = arg3 - local3;
			Static273.method4257(local199, Static183.anIntArrayArray26[local179], arg4, local195);
			Static273.method4257(local199, Static183.anIntArrayArray26[local187], arg4, local195);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!ia;III)V")
	public static void method889(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(22) Class1_Sub8 local22 = (Class1_Sub8) Static75.aClass59_18.method1704(); local22 != null; local22 = (Class1_Sub8) Static75.aClass59_18.method1701()) {
			if (arg0 == local22.anInt519 && arg2 * 128 == local22.anInt507 && arg3 * 128 == local22.anInt508 && arg1.anInt2388 == local22.aClass71_1.anInt2388) {
				if (local22.aClass1_Sub24_Sub2_1 != null) {
					Static205.aClass1_Sub24_Sub3_1.method4518(local22.aClass1_Sub24_Sub2_1);
					local22.aClass1_Sub24_Sub2_1 = null;
				}
				if (local22.aClass1_Sub24_Sub2_2 != null) {
					Static205.aClass1_Sub24_Sub3_1.method4518(local22.aClass1_Sub24_Sub2_2);
					local22.aClass1_Sub24_Sub2_2 = null;
				}
				local22.method4779();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLclient!hi;)V")
	public static void method890(@OriginalArg(1) Class66 arg0) {
		@Pc(13) Class66 local13 = Static187.method3064(arg0);
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (local13 == null) {
			local18 = Static292.anInt5236;
			local20 = Static120.anInt2505;
		} else {
			local18 = local13.anInt2204;
			local20 = local13.anInt2207;
		}
		Static264.method4162(local20, local18, false, arg0);
		Static96.method1761(arg0, local18, local20);
	}
}
