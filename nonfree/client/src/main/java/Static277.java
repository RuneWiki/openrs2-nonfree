import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "Lclient!lc;")
	public static Class98 aClass98_163;

	@OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
	public static int anInt5180;

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
	public static int anInt5174 = 0;

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
	public static int anInt5176 = -1;

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
	public static int anInt5177 = 0;

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "[I")
	public static int[] anIntArray459 = new int[256];

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
	public static int anInt5178 = 0;

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
	public static int anInt5179 = 1;

	@OriginalMember(owner = "client!vb", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString187 = "glow1:";

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIBIIIILclient!cc;)V")
	public static void method4114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class22 arg6) {
		if (Static70.aBoolean273) {
			Static227.anInt3980 = 32;
		} else {
			Static227.anInt3980 = 0;
		}
		Static70.aBoolean273 = false;
		@Pc(141) int local141;
		if (Static71.anInt1316 != 0) {
			if (arg0 >= arg2 && arg2 + 16 > arg0 && arg1 >= arg4 && arg4 + 16 > arg1) {
				arg6.anInt547 -= 4;
				Static81.method3274(arg6);
			} else if (arg2 <= arg0 && arg0 < arg2 + 16 && arg4 + arg3 - 16 <= arg1 && arg1 < arg3 + arg4) {
				arg6.anInt547 += 4;
				Static81.method3274(arg6);
			} else if (arg0 >= arg2 - Static227.anInt3980 && arg0 < Static227.anInt3980 + arg2 + 16 && arg1 >= arg4 + 16 && arg3 + arg4 - 16 > arg1) {
				local141 = (arg3 - 32) * arg3 / arg5;
				if (local141 < 8) {
					local141 = 8;
				}
				@Pc(155) int local155 = arg3 - local141 - 32;
				@Pc(166) int local166 = arg1 - arg4 - local141 / 2 - 16;
				arg6.anInt547 = (arg5 - arg3) * local166 / local155;
				Static81.method3274(arg6);
				Static70.aBoolean273 = true;
			}
		}
		if (Static44.anInt887 == 0) {
			return;
		}
		local141 = arg6.anInt546;
		if (arg0 >= arg2 - local141 && arg4 <= arg1 && arg2 + 16 > arg0 && arg1 <= arg3 + arg4) {
			arg6.anInt547 += Static44.anInt887 * 45;
			Static81.method3274(arg6);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
	public static void method4115() {
		Static142.aClass4_Sub17_Sub1_3.method1905(184);
		Static142.aClass4_Sub17_Sub1_3.method1891(0L);
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
	public static void method4116() {
		anIntArray459 = null;
		aClass98_163 = null;
		aString187 = null;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(IB)Lclient!th;")
	public static Class163 method4117(@OriginalArg(0) int arg0) {
		@Pc(10) Class163 local10 = (Class163) Static82.aClass33_11.method841((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static264.aClass98_154.method2396(Static165.method2600(arg0), Static211.method3384(arg0));
		local10 = new Class163();
		local10.anInt4898 = arg0;
		if (local24 != null) {
			local10.method3897(new Class4_Sub17(local24));
		}
		local10.method3889();
		if (local10.anInt4869 != -1) {
			local10.method3901(method4117(local10.anInt4869), method4117(local10.anInt4899));
		}
		if (local10.anInt4892 != -1) {
			local10.method3886(method4117(local10.anInt4880), method4117(local10.anInt4892));
		}
		if (!Static217.aBoolean285 && local10.aBoolean316) {
			local10.aStringArray32 = Static268.aStringArray35;
			local10.aStringArray33 = Static134.aStringArray22;
			local10.aBoolean315 = false;
			local10.anInt4884 = 0;
			local10.aString169 = Static201.aString125;
		}
		Static82.aClass33_11.method845(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!cc;IZ)I")
	public static int method4118(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArrayArray6 == null || arg1 >= arg0.anIntArrayArray6.length) {
			return -2;
		}
		try {
			@Pc(20) int[] local20 = arg0.anIntArrayArray6[arg1];
			@Pc(22) int local22 = 0;
			@Pc(24) int local24 = 0;
			@Pc(26) byte local26 = 0;
			while (true) {
				@Pc(31) int local31 = local20[local24++];
				@Pc(33) byte local33 = 0;
				@Pc(35) int local35 = 0;
				if (local31 == 0) {
					return local22;
				}
				if (local31 == 1) {
					local35 = Static264.anIntArray443[local20[local24++]];
				}
				if (local31 == 15) {
					local33 = 1;
				}
				if (local31 == 16) {
					local33 = 2;
				}
				if (local31 == 2) {
					local35 = Static280.anIntArray475[local20[local24++]];
				}
				if (local31 == 3) {
					local35 = Static286.anIntArray481[local20[local24++]];
				}
				@Pc(99) int local99;
				@Pc(110) Class22 local110;
				@Pc(115) int local115;
				@Pc(128) int local128;
				if (local31 == 4) {
					local99 = local20[local24++] << 16;
					@Pc(106) int local106 = local99 + local20[local24++];
					local110 = Static21.method3453(local106);
					local115 = local20[local24++];
					if (local115 != -1 && (!method4117(local115).aBoolean316 || Static39.aBoolean340)) {
						for (local128 = 0; local128 < local110.anIntArray63.length; local128++) {
							if (local115 + 1 == local110.anIntArray63[local128]) {
								local35 += local110.anIntArray56[local128];
							}
						}
					}
				}
				if (local31 == 5) {
					local35 = Static221.anIntArray393[local20[local24++]];
				}
				if (local31 == 6) {
					local35 = Class57.anIntArray222[Static280.anIntArray475[local20[local24++]] - 1];
				}
				if (local31 == 17) {
					local33 = 3;
				}
				if (local31 == 7) {
					local35 = Static221.anIntArray393[local20[local24++]] * 100 / 46875;
				}
				if (local31 == 8) {
					local35 = Static239.aClass12_Sub3_Sub2_2.anInt4201;
				}
				if (local31 == 9) {
					for (local99 = 0; local99 < 25; local99++) {
						if (Static244.aBooleanArray23[local99]) {
							local35 += Static280.anIntArray475[local99];
						}
					}
				}
				if (local31 == 10) {
					local99 = local20[local24++] << 16;
					local99 += local20[local24++];
					local110 = Static21.method3453(local99);
					local115 = local20[local24++];
					if (local115 != -1 && (!method4117(local115).aBoolean316 || Static39.aBoolean340)) {
						for (local128 = 0; local128 < local110.anIntArray63.length; local128++) {
							if (local115 + 1 == local110.anIntArray63[local128]) {
								local35 = 999999999;
								break;
							}
						}
					}
				}
				if (local31 == 11) {
					local35 = Static183.anInt3590;
				}
				if (local31 == 12) {
					local35 = Static100.anInt2135;
				}
				if (local31 == 13) {
					local99 = Static221.anIntArray393[local20[local24++]];
					@Pc(332) int local332 = local20[local24++];
					local35 = (local99 & 0x1 << local332) == 0 ? 0 : 1;
				}
				if (local31 == 14) {
					local99 = local20[local24++];
					local35 = Static227.method3216(local99);
				}
				if (local31 == 18) {
					local35 = (Static239.aClass12_Sub3_Sub2_2.anInt4141 >> 7) + Static170.anInt3385;
				}
				if (local31 == 19) {
					local35 = (Static239.aClass12_Sub3_Sub2_2.anInt4113 >> 7) + Static239.anInt4613;
				}
				if (local31 == 20) {
					local35 = local20[local24++];
				}
				if (local33 == 0) {
					if (local26 == 0) {
						local22 += local35;
					}
					if (local26 == 1) {
						local22 -= local35;
					}
					if (local26 == 2 && local35 != 0) {
						local22 /= local35;
					}
					if (local26 == 3) {
						local22 *= local35;
					}
					local26 = 0;
				} else {
					local26 = local33;
				}
			}
		} catch (@Pc(441) Exception local441) {
			return -1;
		}
	}
}
