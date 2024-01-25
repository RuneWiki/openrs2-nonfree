import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!in", name = "g", descriptor = "Lclient!fm;")
	public static Class76 aClass76_1;

	@OriginalMember(owner = "client!in", name = "h", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "Lclient!bd;")
	public static final Class17 aClass17_12 = new Class17(3, 5);

	@OriginalMember(owner = "client!in", name = "e", descriptor = "I")
	public static int anInt2771 = 0;

	@OriginalMember(owner = "client!in", name = "i", descriptor = "Lclient!dt;")
	public static final Class55 aClass55_4 = new Class55(16);

	@OriginalMember(owner = "client!in", name = "k", descriptor = "[[B")
	public static final byte[][] aByteArrayArray10 = new byte[1000][];

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method2581(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(17) int local17 = 0;
		@Pc(23) int local23 = arg1 ? 32768 : 0;
		@Pc(32) int local32 = local23 + (arg1 ? Static155.anInt2781 : Static371.anInt6500);
		for (@Pc(34) int local34 = local23; local34 < local32; local34++) {
			@Pc(40) Class2_Sub1_Sub10 local40 = Static145.method2497(local34);
			if (local40.aBoolean294 && local40.method3626().toLowerCase().indexOf(local8) != -1) {
				if (local17 >= 50) {
					Static134.anInt2480 = -1;
					Static240.aShortArray86 = null;
					return;
				}
				if (local17 >= local11.length) {
					@Pc(73) short[] local73 = new short[local11.length * 2];
					for (@Pc(75) int local75 = 0; local75 < local17; local75++) {
						local73[local75] = local11[local75];
					}
					local11 = local73;
				}
				local11[local17++] = (short) local34;
			}
		}
		Static240.aShortArray86 = local11;
		Static149.anInt2704 = 0;
		Static134.anInt2480 = local17;
		@Pc(112) String[] local112 = new String[Static134.anInt2480];
		for (@Pc(114) int local114 = 0; local114 < Static134.anInt2480; local114++) {
			local112[local114] = Static145.method2497(local11[local114]).method3626();
		}
		Static317.method4924(Static240.aShortArray86, local112);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III)I")
	public static int method2582(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 31;
		return (arg1 + local7) / arg0 - local7;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIZZIII)V")
	public static void method2584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 >= arg4) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg4) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) Class141_Sub1 local20 = Static197.aClass141_Sub1Array2[local14];
		Static197.aClass141_Sub1Array2[local14] = Static197.aClass141_Sub1Array2[arg4];
		Static197.aClass141_Sub1Array2[arg4] = local20;
		for (@Pc(32) int local32 = arg0; local32 < arg4; local32++) {
			if (Static13.method406(arg3, Static197.aClass141_Sub1Array2[local32], local20, arg2, arg1, arg5) <= 0) {
				@Pc(49) Class141_Sub1 local49 = Static197.aClass141_Sub1Array2[local32];
				Static197.aClass141_Sub1Array2[local32] = Static197.aClass141_Sub1Array2[local16];
				Static197.aClass141_Sub1Array2[local16++] = local49;
			}
		}
		Static197.aClass141_Sub1Array2[arg4] = Static197.aClass141_Sub1Array2[local16];
		Static197.aClass141_Sub1Array2[local16] = local20;
		method2584(arg0, arg1, arg2, arg3, local16 - 1, arg5);
		method2584(local16 + 1, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(III)I")
	public static int method2585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg0 - 1 & arg1 >> 31;
		return local16 + (arg1 + (arg1 >>> 31)) % arg0;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ILclient!qr;ILclient!pf;I)V")
	public static void method2586(@OriginalArg(1) Class12_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub13_Sub2 arg2, @OriginalArg(4) int arg3) {
		@Pc(7) byte local7 = -1;
		if ((arg1 & 0x100) != 0) {
			local7 = arg2.method4223();
		}
		@Pc(26) int local26;
		@Pc(37) int local37;
		@Pc(43) int local43;
		if ((arg1 & 0x400) != 0) {
			local26 = arg2.method4240();
			@Pc(29) int[] local29 = new int[local26];
			@Pc(32) int[] local32 = new int[local26];
			@Pc(35) int[] local35 = new int[local26];
			for (local37 = 0; local37 < local26; local37++) {
				local43 = arg2.method4237();
				if (local43 == 65535) {
					local43 = -1;
				}
				local29[local37] = local43;
				local32[local37] = arg2.method4240();
				local35[local37] = arg2.method4245();
			}
			Static236.method3860(arg0, local32, local35, local29);
		}
		if ((arg1 & 0x4) != 0) {
			arg0.anInt5390 = arg2.method4245();
			if (arg0.anInt5380 == 0) {
				arg0.method4697(arg0.anInt5390);
				arg0.anInt5390 = -1;
			}
		}
		@Pc(116) int local116;
		@Pc(232) int local232;
		if ((arg1 & 0x800) != 0) {
			local26 = arg2.method4220();
			if (local26 == 65535) {
				local26 = -1;
			}
			local116 = arg2.method4221();
			@Pc(118) boolean local118 = true;
			@Pc(211) Class189 local211;
			if (local26 != -1 && arg0.anInt5330 != -1) {
				@Pc(140) Class220 local140;
				if (local26 == arg0.anInt5330) {
					local140 = Static168.aClass74_1.method1772(local26);
					if (local140.aBoolean455 && local140.anInt6020 != -1) {
						@Pc(154) Class189 local154 = Static351.aClass175_3.method4107(local140.anInt6020);
						local43 = local154.anInt5165;
						if (local43 == 0) {
							local118 = false;
						} else if (local43 == 1) {
							local118 = true;
						} else if (local43 == 2) {
							arg0.anInt5324 = 0;
							local118 = false;
						}
					}
				} else {
					local140 = Static168.aClass74_1.method1772(local26);
					@Pc(196) Class220 local196 = Static168.aClass74_1.method1772(arg0.anInt5330);
					if (local140.anInt6020 != -1 && local196.anInt6020 != -1) {
						local211 = Static351.aClass175_3.method4107(local140.anInt6020);
						@Pc(217) Class189 local217 = Static351.aClass175_3.method4107(local196.anInt6020);
						if (local211.anInt5157 < local217.anInt5157) {
							local118 = false;
						}
					}
				}
			}
			if (local118) {
				local232 = Static295.anInt5281;
				arg0.anInt5330 = local26;
				arg0.anInt5375 = local116 >> 16;
				arg0.anInt5327 = 1;
				arg0.anInt5367 = (local116 & 0xFFFF) + local232;
				arg0.anInt5369 = 0;
				arg0.anInt5341 = 0;
				if (local232 < arg0.anInt5367) {
					arg0.anInt5341 = -1;
				}
				if (arg0.anInt5330 != -1 && local232 == arg0.anInt5367) {
					local37 = Static168.aClass74_1.method1772(arg0.anInt5330).anInt6020;
					if (local37 != -1) {
						local211 = Static351.aClass175_3.method4107(local37);
						if (local211 != null && local211.anIntArray639 != null) {
							Static369.method5563(arg0.aByte74, local211, arg0 == Static267.aClass12_Sub1_Sub2_Sub2_1, arg0.anInt6328, arg0.anInt6317, 0);
						}
					}
				}
			}
		}
		if ((arg1 & 0x20) != 0) {
			local116 = arg2.method4196();
			@Pc(334) byte[] local334 = new byte[local116];
			@Pc(339) Class2_Sub13 local339 = new Class2_Sub13(local334);
			arg2.method4225(local334, local116);
			Static290.aClass2_Sub13Array1[arg3] = local339;
			arg0.method4714(local339);
		}
		if ((arg1 & 0x200) != 0) {
			local116 = arg2.method4245();
			arg0.anInt5320 = arg2.method4196();
			arg0.anInt5373 = arg2.method4196();
			arg0.aBoolean420 = (local116 & 0x8000) != 0;
			arg0.anInt5359 = local116 & 0x7FFF;
			arg0.anInt5319 = arg0.anInt5320 + Static295.anInt5281 + arg0.anInt5359;
		}
		@Pc(406) int local406;
		if ((arg1 & 0x1) != 0) {
			local116 = arg2.method4220();
			local406 = arg2.method4193();
			local232 = arg2.method4240();
			local37 = arg2.anInt4788;
			@Pc(421) boolean local421 = (local116 & 0x8000) != 0;
			if (arg0.aString51 != null && arg0.aClass247_1 != null) {
				@Pc(429) boolean local429 = false;
				if (local406 <= 1) {
					if (!local421 && (Static244.aBoolean92 && !Static208.aBoolean285 || Static346.aBoolean460)) {
						local429 = true;
					} else if (Static55.method1065(arg0.aString51)) {
						local429 = true;
					}
				}
				if (!local429 && Static46.anInt931 == 0) {
					Static257.aClass2_Sub13_12.anInt4788 = 0;
					arg2.method4197(Static257.aClass2_Sub13_12.aByteArray77, local232);
					Static257.aClass2_Sub13_12.anInt4788 = 0;
					@Pc(475) int local475 = -1;
					@Pc(485) String local485;
					if (local421) {
						local116 &= 0x7FFF;
						@Pc(495) Class178 local495 = Static285.method4387(Static257.aClass2_Sub13_12);
						local475 = local495.anInt4883;
						local485 = local495.aClass2_Sub1_Sub10_1.method3619(Static257.aClass2_Sub13_12);
					} else {
						local485 = Static18.method506(Static155.method2589(Static128.method2278(Static257.aClass2_Sub13_12)));
					}
					arg0.aString50 = local485.trim();
					arg0.anInt5350 = local116 & 0xFF;
					arg0.anInt5335 = 150;
					arg0.anInt5329 = local116 >> 8;
					@Pc(533) int local533;
					if (local406 == 1 || local406 == 2) {
						local533 = local421 ? 17 : 1;
					} else {
						local533 = local421 ? 17 : 2;
					}
					if (local406 == 2) {
						Static143.method2460(local475, "<img=1>" + arg0.method4724(), local485, local533, null, 0, "<img=1>" + arg0.method4713());
					} else if (local406 == 1) {
						Static143.method2460(local475, "<img=0>" + arg0.method4724(), local485, local533, null, 0, "<img=0>" + arg0.method4713());
					} else {
						Static143.method2460(local475, arg0.method4724(), local485, local533, null, 0, arg0.method4713());
					}
				}
			}
			arg2.anInt4788 = local37 + local232;
		}
		if ((arg1 & 0x2000) != 0) {
			arg0.anInt5344 = arg2.method4234();
			arg0.anInt5347 = arg2.method4217();
			arg0.anInt5336 = arg2.method4234();
			arg0.anInt5362 = arg2.method4223();
			arg0.anInt5372 = arg2.method4229() + Static295.anInt5281;
			arg0.anInt5374 = arg2.method4229() + Static295.anInt5281;
			arg0.anInt5346 = arg2.method4240();
			arg0.anInt5378 = 0;
			if (arg0.anInt5396 == -1) {
				arg0.anInt5344 += arg0.anIntArray659[0];
				arg0.anInt5336 += arg0.anIntArray659[0];
				arg0.anInt5347 += arg0.anIntArray658[0];
				arg0.anInt5380 = 1;
				arg0.anInt5362 += arg0.anIntArray658[0];
			} else {
				arg0.anInt5347 += arg0.anInt5420;
				arg0.anInt5380 = 0;
				arg0.anInt5362 += arg0.anInt5420;
				arg0.anInt5344 += arg0.anInt5396;
				arg0.anInt5336 += arg0.anInt5396;
			}
		}
		if ((arg1 & 0x40) != 0) {
			local116 = arg2.method4211();
			local406 = arg2.method4196();
			arg0.method4708(Static295.anInt5281, local116, local406);
			arg0.anInt5322 = Static295.anInt5281 + 300;
			arg0.anInt5360 = arg2.method4193();
		}
		if ((arg1 & 0x10) != 0) {
			Static258.aByteArray65[arg3] = arg2.method4217();
		}
		if ((arg1 & 0x2) != 0) {
			local116 = arg2.method4237();
			if (local116 == 65535) {
				local116 = -1;
			}
			local406 = arg2.method4240();
			Static189.method4513(local116, local406, arg0);
		}
		if ((arg1 & 0x80) != 0) {
			local116 = arg2.method4245();
			if (local116 == 65535) {
				local116 = -1;
			}
			arg0.anInt5345 = local116;
		}
		if ((arg1 & 0x4000) != 0) {
			local116 = Static295.anInt5281;
			local406 = arg2.method4211();
			local232 = arg2.method4193();
			arg0.method4708(local116, local406, local232);
		}
		if ((arg1 & 0x1000) != 0) {
			arg0.aString50 = arg2.method4201();
			if (arg0.aString50.charAt(0) == '~') {
				arg0.aString50 = arg0.aString50.substring(1);
				Static242.method3898(arg0.aString50, 0, arg0.method4713(), arg0.method4724(), 2);
			} else if (Static267.aClass12_Sub1_Sub2_Sub2_1 == arg0) {
				Static242.method3898(arg0.aString50, 0, arg0.method4713(), arg0.method4724(), 2);
			}
			arg0.anInt5335 = 150;
			arg0.anInt5329 = 0;
			arg0.anInt5350 = 0;
		}
		if (arg0.anInt5396 == -1) {
			return;
		}
		if (local7 == 127) {
			arg0.method4722(arg0.anInt5396, arg0.anInt5420);
			return;
		}
		@Pc(950) byte local950;
		if (local7 == -1) {
			local950 = Static258.aByteArray65[arg3];
		} else {
			local950 = local7;
		}
		arg0.method4720(arg0.anInt5420, arg0.anInt5396, local950);
	}
}
