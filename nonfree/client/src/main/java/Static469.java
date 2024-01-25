import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!rv", name = "y", descriptor = "F")
	public static float aFloat207;

	@OriginalMember(owner = "client!rv", name = "A", descriptor = "I")
	public static int anInt7951 = 0;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "([IIIIIIII)V")
	public static void method6615(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg5 > 0 && !Static119.method2029(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static119.method2029(arg2)) {
			@Pc(43) int local43 = 0;
			@Pc(54) int local54 = arg2 > arg5 ? arg5 : arg2;
			@Pc(58) int local58 = arg5 >> 1;
			@Pc(62) int local62 = arg2 >> 1;
			@Pc(69) int[] local69 = arg0;
			@Pc(74) int[] local74 = new int[local62 * local58];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local43, arg4, arg5, arg2, 0, 32993, arg3, local69, 0);
				if (local54 <= 1) {
					return;
				}
				@Pc(93) int local93 = 0;
				@Pc(95) int local95 = 0;
				@Pc(99) int local99 = arg5;
				@Pc(101) int[] local101 = local74;
				for (@Pc(103) int local103 = 0; local103 < local62; local103++) {
					for (@Pc(107) int local107 = 0; local107 < local58; local107++) {
						@Pc(114) int local114 = local69[local95++];
						@Pc(119) int local119 = local69[local95++];
						@Pc(124) int local124 = local69[local99++];
						@Pc(128) int local128 = local114 & 0xFF;
						@Pc(134) int local134 = local114 >> 8 & 0xFF;
						@Pc(139) int local139 = local69[local99++];
						@Pc(145) int local145 = local114 >> 16 & 0xFF;
						@Pc(151) int local151 = local114 >> 24 & 0xFF;
						@Pc(159) int local159 = local145 + (local119 >> 16 & 0xFF);
						@Pc(167) int local167 = local134 + (local119 >> 8 & 0xFF);
						@Pc(173) int local173 = local128 + (local119 & 0xFF);
						@Pc(181) int local181 = local151 + (local119 >> 24 & 0xFF);
						@Pc(189) int local189 = local181 + (local124 >> 24 & 0xFF);
						@Pc(195) int local195 = local173 + (local124 & 0xFF);
						@Pc(203) int local203 = local159 + (local124 >> 16 & 0xFF);
						@Pc(211) int local211 = local167 + (local124 >> 8 & 0xFF);
						@Pc(219) int local219 = local189 + (local139 >> 24 & 0xFF);
						@Pc(227) int local227 = local203 + (local139 >> 16 & 0xFF);
						@Pc(235) int local235 = local211 + (local139 >> 8 & 0xFF);
						@Pc(241) int local241 = local195 + (local139 & 0xFF);
						local74[local93++] = (local235 & 0x3FC) << 6 | (local227 & 0x3FC) << 14 | (local219 & 0x3FC) << 22 | local241 >> 2 & 0xFF;
					}
					local99 += arg5;
					local95 += arg5;
				}
				local74 = local69;
				local69 = local101;
				arg2 = local62;
				arg5 = local58;
				local58 >>= 0x1;
				local62 >>= 0x1;
				local43++;
				local54 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!ir;Z)V")
	public static void method6617(@OriginalArg(0) Class20_Sub2 arg0) {
		if (Static50.aBoolean95) {
			Static384.aClass294Array3[Static384.aClass294Array3.length - 1].method6719(arg0);
		} else {
			Static238.method7879(arg0, Static177.aClass1_Sub5Array3);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BI)V")
	public static void method6618(@OriginalArg(0) byte arg0) {
		if (Static221.aByteArrayArrayArray5 == null) {
			Static221.aByteArrayArrayArray5 = new byte[4][Static500.anInt6888][Static573.anInt9325];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(20) int local20 = 0; local20 < Static500.anInt6888; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static573.anInt9325; local24++) {
					Static221.aByteArrayArrayArray5[local14][local20][local24] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "([IIBI[I)V")
	public static void method6619(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(26) int local26 = (arg2 + arg1) / 2;
		@Pc(28) int local28 = arg1;
		@Pc(32) int local32 = arg3[local26];
		arg3[local26] = arg3[arg2];
		arg3[arg2] = local32;
		@Pc(46) int local46 = arg0[local26];
		arg0[local26] = arg0[arg2];
		arg0[arg2] = local46;
		@Pc(63) int local63 = local32 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(65) int local65 = arg1; local65 < arg2; local65++) {
			if (local32 + (local65 & local63) > arg3[local65]) {
				@Pc(84) int local84 = arg3[local65];
				arg3[local65] = arg3[local28];
				arg3[local28] = local84;
				@Pc(98) int local98 = arg0[local65];
				arg0[local65] = arg0[local28];
				arg0[local28++] = local98;
			}
		}
		arg3[arg2] = arg3[local28];
		arg3[local28] = local32;
		arg0[arg2] = arg0[local28];
		arg0[local28] = local46;
		method6619(arg0, arg1, local28 - 1, arg3);
		method6619(arg0, local28 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BJ)V")
	public static void method6620(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZLclient!ga;Lclient!ga;Lclient!ga;Lclient!ga;)V")
	public static void method6623(@OriginalArg(1) Class111 arg0, @OriginalArg(2) Class111 arg1, @OriginalArg(3) Class111 arg2, @OriginalArg(4) Class111 arg3) {
		Static301.aClass111_70 = arg3;
		Static358.aClass111_86 = arg1;
		Static377.aClass111_91 = arg0;
		Static249.aClass365ArrayArray3 = new Class365[Static301.aClass111_70.method2436()][];
		Static24.aBooleanArray1 = new boolean[Static301.aClass111_70.method2436()];
	}
}
