import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "Lclient!mo;")
	public static Class143 aClass143_55;

	@OriginalMember(owner = "client!aq", name = "r", descriptor = "I")
	public static int anInt2444;

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "Lclient!al;")
	public static final Class11 aClass11_56 = new Class11(200);

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILclient!jg;)V")
	public static void method2364(@OriginalArg(1) Class14_Sub4 arg0) {
		if (arg0.aByteArray74.length - arg0.anInt2637 < 1) {
			return;
		}
		@Pc(34) int local34 = arg0.method2548();
		if (local34 < 0 || local34 > 15) {
			return;
		}
		@Pc(52) byte local52;
		if (local34 == 15) {
			local52 = 37;
		} else if (local34 == 14) {
			local52 = 36;
		} else if (local34 == 13) {
			local52 = 35;
		} else if (local34 == 12) {
			local52 = 34;
		} else if (local34 == 11) {
			local52 = 33;
		} else if (local34 == 10) {
			local52 = 32;
		} else if (local34 == 9) {
			local52 = 31;
		} else if (local34 == 8) {
			local52 = 30;
		} else if (local34 == 7) {
			local52 = 29;
		} else if (local34 == 6) {
			local52 = 28;
		} else if (local34 == 5) {
			local52 = 28;
		} else if (local34 == 4) {
			local52 = 24;
		} else if (local34 == 3) {
			local52 = 23;
		} else if (local34 == 2) {
			local52 = 22;
		} else if (local34 == 1) {
			local52 = 23;
		} else {
			local52 = 19;
		}
		if (local52 > arg0.aByteArray74.length - arg0.anInt2637) {
			return;
		}
		Static85.anInt2078 = arg0.method2548();
		if (Static85.anInt2078 < 1) {
			Static85.anInt2078 = 1;
		} else if (Static85.anInt2078 > 4) {
			Static85.anInt2078 = 4;
		}
		Static184.method3541(arg0.method2548() == 1);
		Static29.aBoolean312 = arg0.method2548() == 1;
		Static323.aBoolean52 = arg0.method2548() == 1;
		Static53.aBoolean87 = arg0.method2548() == 1;
		Static232.anInt2218 = arg0.method2548() == 1 ? 1 : 0;
		Static281.aBoolean353 = arg0.method2548() == 1;
		Static27.aBoolean30 = arg0.method2548() == 1;
		Static153.aBoolean212 = arg0.method2548() == 1;
		Static109.anInt2428 = arg0.method2548();
		if (Static109.anInt2428 > 2) {
			Static109.anInt2428 = 2;
		}
		if (local34 < 2) {
			Static9.aBoolean10 = arg0.method2548() == 1;
			arg0.method2548();
		} else {
			Static9.aBoolean10 = arg0.method2548() == 1;
		}
		Static185.aBoolean242 = arg0.method2548() == 1;
		Static134.aBoolean191 = arg0.method2548() == 1;
		Static95.anInt2209 = arg0.method2548();
		if (Static95.anInt2209 > 2) {
			Static95.anInt2209 = 2;
		}
		Static217.anInt4358 = Static95.anInt2209;
		Static181.aBoolean239 = arg0.method2548() == 1;
		Static282.anInt5377 = arg0.method2548();
		if (Static282.anInt5377 > 127) {
			Static282.anInt5377 = 127;
		}
		Static345.anInt6584 = arg0.method2548();
		Static78.anInt1894 = arg0.method2548();
		if (Static78.anInt1894 > 127) {
			Static78.anInt1894 = 127;
		}
		if (local34 >= 1) {
			Static325.anInt6256 = arg0.method2498();
			Static106.anInt2354 = arg0.method2498();
		}
		if (local34 >= 3 && local34 < 6) {
			arg0.method2548();
		}
		@Pc(414) int local414;
		if (local34 >= 4) {
			local414 = arg0.method2548();
			if (local414 < 0 || local414 > 2) {
				local414 = 0;
			}
			if (Static127.anInt2786 < 96) {
				local414 = 0;
			}
			Static252.method4374(local414);
		}
		if (local34 >= 5) {
			Static205.anInt4107 = arg0.method2510();
		}
		local414 = 0;
		if (local34 >= 6) {
			Static333.anInt6446 = local414 = arg0.method2548();
		}
		if (Static333.anInt6446 != 1 && Static333.anInt6446 != 2) {
			Static333.anInt6446 = 2;
		}
		if (local34 >= 7) {
			Static198.aBoolean251 = arg0.method2548() == 1;
		}
		if (local34 >= 8) {
			Static61.aBoolean94 = arg0.method2548() == 1;
		}
		if (local34 >= 9) {
			Static228.anInt4497 = arg0.method2548();
		}
		if (Static228.anInt4497 < 0 || Static228.anInt4497 > 3) {
			Static228.anInt4497 = 0;
		}
		if (local34 >= 10) {
			Static32.aBoolean39 = arg0.method2548() != 0;
		}
		if (local34 >= 11) {
			Static99.aBoolean157 = arg0.method2548() != 0;
		}
		if (local34 >= 12) {
			Static232.anInt2218 = arg0.method2548();
		}
		if (Static232.anInt2218 < 0 || Static232.anInt2218 > 2) {
			Static232.anInt2218 = 1;
		}
		if (local34 >= 13) {
			Static267.aBoolean340 = arg0.method2548() == 1;
		}
		if (local34 >= 14) {
			Static203.anInt6246 = arg0.method2548();
		} else if (local414 == 0) {
			Static203.anInt6246 = 2;
		} else {
			Static203.anInt6246 = 1;
		}
		if (Static203.anInt6246 < 0 || Static203.anInt6246 > 3) {
			Static203.anInt6246 = 2;
		}
		if (local34 >= 15) {
			Static153.anInt3264 = arg0.method2548();
			if (Static153.anInt3264 < 0 || Static153.anInt3264 > 4) {
				Static153.anInt3264 = Static203.anInt6252 == 1 ? 2 : 4;
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!jg;Z)V")
	public static void method2365(@OriginalArg(0) Class14_Sub4 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static232.anInt2216; local7++) {
			@Pc(13) int local13 = arg0.method2525();
			@Pc(17) int local17 = arg0.method2498();
			if (local17 == 65535) {
				local17 = -1;
			}
			if (Static343.aClass6_Sub1Array2[local13] != null) {
				Static343.aClass6_Sub1Array2[local13].anInt4508 = local17;
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "([BIBI[[B[I[I[[B)I")
	public static int method2367(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(9) int local9 = arg4[arg1];
		@Pc(15) int local15 = local9 + arg5[arg1];
		@Pc(19) int local19 = arg4[arg2];
		@Pc(26) int local26 = local19 + arg5[arg2];
		@Pc(28) int local28 = local9;
		if (local19 > local9) {
			local28 = local19;
		}
		@Pc(39) int local39 = local15;
		if (local15 > local26) {
			local39 = local26;
		}
		@Pc(50) int local50 = arg0[arg1] & 0xFF;
		if ((arg0[arg2] & 0xFF) < local50) {
			local50 = arg0[arg2] & 0xFF;
		}
		@Pc(71) byte[] local71 = arg6[arg1];
		@Pc(75) byte[] local75 = arg3[arg2];
		@Pc(80) int local80 = local28 - local9;
		@Pc(85) int local85 = local28 - local19;
		for (@Pc(92) int local92 = local28; local92 < local39; local92++) {
			@Pc(104) int local104 = local75[local85++] + local71[local80++];
			if (local50 > local104) {
				local50 = local104;
			}
		}
		return -local50;
	}
}
