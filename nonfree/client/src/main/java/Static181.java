import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!in", name = "x", descriptor = "Lclient!oh;")
	public static final Class189 aClass189_3 = new Class189();

	@OriginalMember(owner = "client!in", name = "y", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray11 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!in", name = "A", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_73 = new Class25(36, 4);

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIBIIIIII)V")
	public static void method2410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg7 && arg4 == arg3 && arg5 == arg0 && arg8 == arg6) {
			Static205.method2887(arg2, arg4, arg1, arg0, arg6);
			return;
		}
		@Pc(23) int local23 = arg1;
		@Pc(25) int local25 = arg4;
		@Pc(29) int local29 = arg1 * 3;
		@Pc(33) int local33 = arg4 * 3;
		@Pc(37) int local37 = arg7 * 3;
		@Pc(41) int local41 = arg3 * 3;
		@Pc(45) int local45 = arg5 * 3;
		@Pc(49) int local49 = arg8 * 3;
		@Pc(59) int local59 = local37 + arg0 - arg1 - local45;
		@Pc(69) int local69 = arg6 + local41 - local49 - arg4;
		@Pc(79) int local79 = local29 + local45 - local37 - local37;
		@Pc(89) int local89 = local49 + local33 - local41 - local41;
		@Pc(94) int local94 = local37 - local29;
		@Pc(99) int local99 = local41 - local33;
		for (@Pc(101) int local101 = 128; local101 <= 4096; local101 += 128) {
			@Pc(109) int local109 = local101 * local101 >> 12;
			@Pc(115) int local115 = local109 * local101 >> 12;
			@Pc(119) int local119 = local115 * local59;
			@Pc(123) int local123 = local115 * local69;
			@Pc(127) int local127 = local79 * local109;
			@Pc(131) int local131 = local89 * local109;
			@Pc(135) int local135 = local94 * local101;
			@Pc(139) int local139 = local101 * local99;
			@Pc(149) int local149 = (local135 + local119 + local127 >> 12) + arg1;
			@Pc(159) int local159 = (local131 + local123 + local139 >> 12) + arg4;
			Static205.method2887(arg2, local25, local23, local149, local159);
			local23 = local149;
			local25 = local159;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V")
	public static void method2412() {
		Static202.aClass2_Sub17_Sub1_1.method5585();
		@Pc(18) int local18 = Static202.aClass2_Sub17_Sub1_1.method5577(8);
		@Pc(27) int local27;
		if (local18 < Static458.anInt7721) {
			for (local27 = local18; local27 < Static458.anInt7721; local27++) {
				Static48.anIntArray63[Static331.anInt5942++] = Static164.anIntArray253[local27];
			}
		}
		if (local18 > Static458.anInt7721) {
			throw new RuntimeException("gnpov1");
		}
		Static458.anInt7721 = 0;
		for (local27 = 0; local27 < local18; local27++) {
			@Pc(61) int local61 = Static164.anIntArray253[local27];
			@Pc(69) Class11_Sub5_Sub2_Sub2 local69 = ((Class2_Sub34) Static400.aClass220_41.method5099((long) local61)).aClass11_Sub5_Sub2_Sub2_2;
			@Pc(74) int local74 = Static202.aClass2_Sub17_Sub1_1.method5577(1);
			if (local74 == 0) {
				Static164.anIntArray253[Static458.anInt7721++] = local61;
				local69.anInt7634 = Static277.anInt5022;
			} else {
				@Pc(97) int local97 = Static202.aClass2_Sub17_Sub1_1.method5577(2);
				if (local97 == 0) {
					Static164.anIntArray253[Static458.anInt7721++] = local61;
					local69.anInt7634 = Static277.anInt5022;
					Static290.anIntArray441[Static439.anInt7382++] = local61;
				} else {
					@Pc(144) int local144;
					@Pc(154) int local154;
					if (local97 == 1) {
						Static164.anIntArray253[Static458.anInt7721++] = local61;
						local69.anInt7634 = Static277.anInt5022;
						local144 = Static202.aClass2_Sub17_Sub1_1.method5577(3);
						local69.method6238(1, local144);
						local154 = Static202.aClass2_Sub17_Sub1_1.method5577(1);
						if (local154 == 1) {
							Static290.anIntArray441[Static439.anInt7382++] = local61;
						}
					} else if (local97 == 2) {
						Static164.anIntArray253[Static458.anInt7721++] = local61;
						local69.anInt7634 = Static277.anInt5022;
						if (Static202.aClass2_Sub17_Sub1_1.method5577(1) == 1) {
							local144 = Static202.aClass2_Sub17_Sub1_1.method5577(3);
							local69.method6238(2, local144);
							local154 = Static202.aClass2_Sub17_Sub1_1.method5577(3);
							local69.method6238(2, local154);
						} else {
							local144 = Static202.aClass2_Sub17_Sub1_1.method5577(3);
							local69.method6238(0, local144);
						}
						local144 = Static202.aClass2_Sub17_Sub1_1.method5577(1);
						if (local144 == 1) {
							Static290.anIntArray441[Static439.anInt7382++] = local61;
						}
					} else if (local97 == 3) {
						Static48.anIntArray63[Static331.anInt5942++] = local61;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIILclient!ej;)V")
	public static void method2416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class11_Sub4 arg4) {
		@Pc(4) Class36 local4 = Static61.method976(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt5591 = (arg1 << Static146.anInt2674) + Static417.anInt7156;
		arg4.anInt5590 = arg3;
		arg4.anInt5593 = (arg2 << Static146.anInt2674) + Static417.anInt7156;
		for (@Pc(28) Class195 local28 = local4.aClass195_1; local28 != null; local28 = local28.aClass195_2) {
			if (local28.aClass11_Sub5_1.aBoolean512) {
				@Pc(38) int local38 = local28.aClass11_Sub5_1.method6213();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt5590 += local8;
			arg4.aBoolean394 = true;
		} else if (local4.aClass11_Sub3_1 != null) {
			arg4.anInt5590 -= local4.aClass11_Sub3_1.aShort80;
		}
		local4.aClass11_Sub4_1 = arg4;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(FFLclient!bl;FFIIIIIF[BIZ)V")
	public static void method2417(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class27 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(10) float arg7, @OriginalArg(11) byte[] arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(18) int local18;
		@Pc(52) int local52;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			local18 = arg5;
			arg2.method2713(arg3 / (float) 128, local12, arg6, 0, arg0 / (float) 128, arg7 / (float) 16, arg1 * 127.0F);
			arg1 *= arg4;
			arg3 *= 2.0F;
			for (local52 = 0; local52 < 16384; local52++) {
				arg8[local18] = (byte) ((float) arg8[local18] + local12[local52]);
				local18++;
			}
			arg7 *= 2.0F;
			arg0 *= 2.0F;
		}
		local18 = arg5;
		for (local52 = 0; local52 < 16384; local52++) {
			arg8[local18] = (byte) (arg8[local18] + 127);
			local18++;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZIILclient!gi;)V")
	public static void method2418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class93 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray29 != null) {
			@Pc(13) Class2_Sub18 local13 = new Class2_Sub18();
			local13.aClass93_10 = arg2;
			local13.anObjectArray33 = arg2.anObjectArray29;
			Static76.method1143(local13);
		}
		Static331.anInt5940 = arg1;
		Static435.anInt7328 = arg2.anInt2488;
		Static11.aBoolean7 = true;
		Static236.anInt3995 = arg2.anInt2482;
		Static238.anInt4001 = arg2.anInt2424;
		Static329.anInt5889 = arg2.anInt2508;
		Static456.anInt7598 = arg0;
		Static252.anInt4355 = arg2.anInt2437;
		Static383.method5263(arg2);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IZI)I")
	public static int method2420(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(12) int local12 = 255 - local7;
		@Pc(35) int local35 = (local7 * (arg0 & 0xFF00) & 0xFF0000 | (arg0 & 0xFF00FF) * local7 & 0xFF00FF00) >>> 8;
		return local35 + ((local12 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local12 * (arg1 & 0xFF00) & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIB)Z")
	public static boolean method2421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static108.method1798(arg1, arg0) & Static212.method3007(arg0, arg1);
	}
}
