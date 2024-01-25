import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static612 {

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray48;

	@OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
	public static int anInt8715 = -2;

	@OriginalMember(owner = "client!vn", name = "u", descriptor = "[C")
	public static final char[] aCharArray13 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/lang/String;ZII)I")
	public static int method7494(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(92) int local92;
			if (local46 >= '0' && local46 <= '9') {
				local92 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local92 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local92 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local92 >= arg1) {
				throw new NumberFormatException();
			}
			if (local26) {
				local92 = -local92;
			}
			@Pc(124) int local124 = local92 + local35 * arg1;
			if (local124 / arg1 != local35) {
				throw new NumberFormatException();
			}
			local33 = true;
			local35 = local124;
		}
		if (!local33) {
			throw new NumberFormatException();
		}
		return local35;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)I")
	public static int method7496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method7502(@OriginalArg(0) Class100 arg0) {
		if (Static462.anInt8179 < 2 && !Static280.aBoolean380 || Static478.aClass302_56 != null) {
			return;
		}
		@Pc(38) String local38;
		if (Static280.aBoolean380 && Static462.anInt8179 < 2) {
			local38 = Static173.aString38 + Static317.aClass192_32.method5299(Static307.anInt5931) + Static391.aString87 + " ->";
		} else if (Static576.aBoolean330 && Static647.aClass251_1.method6712(81) && Static462.anInt8179 > 2) {
			local38 = Static641.method8970(Static482.aClass6_Sub2_Sub4_4);
		} else {
			@Pc(42) Class6_Sub2_Sub4 local42 = Static482.aClass6_Sub2_Sub4_4;
			if (local42 == null) {
				return;
			}
			local38 = Static641.method8970(local42);
			@Pc(51) int[] local51 = null;
			if (Static238.method4146(local42.anInt1738)) {
				local51 = Static266.aClass138_1.method3730((int) local42.aLong42).lb;
			} else if (local42.anInt1732 != -1) {
				local51 = Static266.aClass138_1.method3730(local42.anInt1732).lb;
			} else if (Static74.method1294(local42.anInt1738)) {
				@Pc(133) Class6_Sub46 local133 = (Class6_Sub46) Static347.aClass128_23.method3560((long) (int) local42.aLong42);
				if (local133 != null) {
					@Pc(138) Class20_Sub2_Sub2_Sub1_Sub2 local138 = local133.aClass20_Sub2_Sub2_Sub1_Sub2_1;
					@Pc(141) Class247 local141 = local138.aClass247_1;
					if (local141.anIntArray467 != null) {
						local141 = local141.method6613(Static279.aClass294_1);
					}
					if (local141 != null) {
						local51 = local141.anIntArray465;
					}
				}
			} else if (Static420.method6609(local42.anInt1738)) {
				@Pc(96) Class312 local96;
				if (local42.anInt1738 == 1008) {
					local96 = Static283.aClass210_2.method5629((int) local42.aLong42);
				} else {
					local96 = Static283.aClass210_2.method5629((int) (local42.aLong42 >>> 32 & 0x7FFFFFFFL));
				}
				if (local96.anIntArray565 != null) {
					local96 = local96.method7866(Static279.aClass294_1);
				}
				if (local96 != null) {
					local51 = local96.anIntArray563;
				}
			}
			if (local51 != null) {
				local38 = local38 + Static109.method6911(local51);
			}
		}
		if (Static462.anInt8179 > 2) {
			local38 = local38 + "<col=ffffff> / " + (Static462.anInt8179 - 2) + Static317.aClass192_25.method5299(Static307.anInt5931);
		}
		if (Static393.aClass302_45 != null) {
			@Pc(225) Class50 local225 = Static393.aClass302_45.method7560(arg0);
			if (local225 == null) {
				local225 = Static173.aClass50_5;
			}
			local225.method5737(Static393.aClass302_45.anInt8827, Static393.aClass302_45.anInt8857, local38, Static393.aClass302_45.anInt8801, Static411.anInt6250, Static393.aClass302_45.anInt8814, Static428.aClass32Array16, Static432.anInt7833, Static535.anIntArray567, Static364.aRandom1, Static393.aClass302_45.anInt8800, Static422.anInt7718, Static393.aClass302_45.anInt8844, Static603.anIntArray609);
			Static143.method2301(Static603.anIntArray609[3], Static603.anIntArray609[0], Static603.anIntArray609[2], Static603.anIntArray609[1]);
		} else if (Static89.aClass302_43 != null && Static630.aClass271_17 == Static237.aClass271_11) {
			@Pc(293) int local293 = Static173.aClass50_5.method5740(Static411.anInt6250, Static535.anIntArray567, Static428.aClass32Array16, Static364.aRandom1, local38, Static500.anInt8417 + 16, Static321.anInt6136 + 4);
			Static143.method2301(16, Static321.anInt6136 + 4, local293 + Static31.aClass133_3.method3643(local38), Static500.anInt8417);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIB)V")
	public static void method7504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(10) Class6_Sub49 local10 = (Class6_Sub49) Static550.aClass8_63.method149(); local10 != null; local10 = (Class6_Sub49) Static550.aClass8_63.method155()) {
			Static120.method1984(local10, arg0, arg1, arg2, arg3);
		}
		@Pc(203) boolean local203;
		for (@Pc(31) Class6_Sub49 local31 = (Class6_Sub49) Static23.aClass8_21.method149(); local31 != null; local31 = (Class6_Sub49) Static23.aClass8_21.method155()) {
			@Pc(44) byte local44 = 1;
			@Pc(51) Class201 local51 = local31.aClass20_Sub2_Sub2_Sub1_Sub2_2.method4911();
			if (local31.aClass20_Sub2_Sub2_Sub1_Sub2_2.anInt5571 == -1 || local31.aClass20_Sub2_Sub2_Sub1_Sub2_2.aBoolean375) {
				local44 = 0;
			} else if (local51.anInt6319 == local31.aClass20_Sub2_Sub2_Sub1_Sub2_2.anInt5571 || local31.aClass20_Sub2_Sub2_Sub1_Sub2_2.anInt5571 == local51.anInt6339 || local31.aClass20_Sub2_Sub2_Sub1_Sub2_2.anInt5571 == local51.anInt6334 || local51.anInt6324 == local31.aClass20_Sub2_Sub2_Sub1_Sub2_2.anInt5571) {
				local44 = 2;
			} else if (local51.anInt6338 == local31.aClass20_Sub2_Sub2_Sub1_Sub2_2.anInt5571 || local31.aClass20_Sub2_Sub2_Sub1_Sub2_2.anInt5571 == local51.anInt6350 || local51.anInt6317 == local31.aClass20_Sub2_Sub2_Sub1_Sub2_2.anInt5571 || local51.anInt6337 == local31.aClass20_Sub2_Sub2_Sub1_Sub2_2.anInt5571) {
				local44 = 3;
			}
			if (local31.anInt9620 != local44) {
				@Pc(155) int local155 = Static525.method7809(local31.aClass20_Sub2_Sub2_Sub1_Sub2_2);
				@Pc(159) Class247 local159 = local31.aClass20_Sub2_Sub2_Sub1_Sub2_2.aClass247_1;
				if (local159.anIntArray467 != null) {
					local159 = local159.method6613(Static279.aClass294_1);
				}
				if (local159 == null || local155 == -1) {
					local31.aBoolean662 = false;
					local31.anInt9629 = -1;
					local31.anInt9620 = local44;
				} else if (local155 == local31.anInt9629 && local159.aBoolean513 == local31.aBoolean662) {
					local31.anInt9620 = local44;
					local31.anInt9635 = local159.anInt7686;
				} else {
					local203 = false;
					if (local31.aClass6_Sub3_Sub3_4 == null) {
						local203 = true;
					} else {
						local31.anInt9635 -= 512;
						if (local31.anInt9635 <= 0) {
							Static196.aClass6_Sub3_Sub1_1.method270(local31.aClass6_Sub3_Sub3_4);
							local31.aClass6_Sub3_Sub3_4 = null;
							local203 = true;
						}
					}
					if (local203) {
						local31.anInt9635 = local159.anInt7686;
						local31.anInt9629 = local155;
						local31.aClass6_Sub37_Sub1_3 = null;
						local31.aClass6_Sub7_2 = null;
						local31.anInt9620 = local44;
						local31.aBoolean662 = local159.aBoolean513;
					}
				}
			}
			local31.anInt9625 = local31.aClass20_Sub2_Sub2_Sub1_Sub2_2.anInt10725;
			local31.anInt9634 = local31.aClass20_Sub2_Sub2_Sub1_Sub2_2.anInt10725 + (local31.aClass20_Sub2_Sub2_Sub1_Sub2_2.method4913() << 8);
			local31.anInt9626 = local31.aClass20_Sub2_Sub2_Sub1_Sub2_2.anInt10729;
			local31.anInt9638 = local31.aClass20_Sub2_Sub2_Sub1_Sub2_2.anInt10729 + (local31.aClass20_Sub2_Sub2_Sub1_Sub2_2.method4913() << 8);
			Static120.method1984(local31, arg0, arg1, arg2, arg3);
		}
		for (@Pc(314) Class6_Sub49 local314 = (Class6_Sub49) Static554.aClass128_8.method3556(); local314 != null; local314 = (Class6_Sub49) Static554.aClass128_8.method3555()) {
			@Pc(318) byte local318 = 1;
			@Pc(323) Class201 local323 = local314.aClass20_Sub2_Sub2_Sub1_Sub1_2.method4911();
			if (local314.aClass20_Sub2_Sub2_Sub1_Sub1_2.anInt5571 == -1 || local314.aClass20_Sub2_Sub2_Sub1_Sub1_2.aBoolean375) {
				local318 = 0;
			} else if (local314.aClass20_Sub2_Sub2_Sub1_Sub1_2.anInt5571 == local323.anInt6319 || local314.aClass20_Sub2_Sub2_Sub1_Sub1_2.anInt5571 == local323.anInt6339 || local314.aClass20_Sub2_Sub2_Sub1_Sub1_2.anInt5571 == local323.anInt6334 || local314.aClass20_Sub2_Sub2_Sub1_Sub1_2.anInt5571 == local323.anInt6324) {
				local318 = 2;
			} else if (local314.aClass20_Sub2_Sub2_Sub1_Sub1_2.anInt5571 == local323.anInt6338 || local314.aClass20_Sub2_Sub2_Sub1_Sub1_2.anInt5571 == local323.anInt6350 || local314.aClass20_Sub2_Sub2_Sub1_Sub1_2.anInt5571 == local323.anInt6317 || local314.aClass20_Sub2_Sub2_Sub1_Sub1_2.anInt5571 == local323.anInt6337) {
				local318 = 3;
			}
			if (local318 != local314.anInt9620) {
				@Pc(420) int local420 = Static281.method4932(local314.aClass20_Sub2_Sub2_Sub1_Sub1_2);
				if (local314.anInt9629 == local420 && local314.aBoolean662 == local314.aClass20_Sub2_Sub2_Sub1_Sub1_2.aBoolean73) {
					local314.anInt9620 = local318;
					local314.anInt9635 = local314.aClass20_Sub2_Sub2_Sub1_Sub1_2.anInt1197;
				} else {
					local203 = false;
					if (local314.aClass6_Sub3_Sub3_4 == null) {
						local203 = true;
					} else {
						local314.anInt9635 -= 512;
						if (local314.anInt9635 <= 0) {
							Static196.aClass6_Sub3_Sub1_1.method270(local314.aClass6_Sub3_Sub3_4);
							local314.aClass6_Sub3_Sub3_4 = null;
							local203 = true;
						}
					}
					if (local203) {
						local314.anInt9629 = local420;
						local314.anInt9620 = local318;
						local314.aClass6_Sub7_2 = null;
						local314.aBoolean662 = local314.aClass20_Sub2_Sub2_Sub1_Sub1_2.aBoolean73;
						local314.aClass6_Sub37_Sub1_3 = null;
						local314.anInt9635 = local314.aClass20_Sub2_Sub2_Sub1_Sub1_2.anInt1197;
					}
				}
			}
			local314.anInt9625 = local314.aClass20_Sub2_Sub2_Sub1_Sub1_2.anInt10725;
			local314.anInt9634 = local314.aClass20_Sub2_Sub2_Sub1_Sub1_2.anInt10725 + (local314.aClass20_Sub2_Sub2_Sub1_Sub1_2.method4913() << 8);
			local314.anInt9626 = local314.aClass20_Sub2_Sub2_Sub1_Sub1_2.anInt10729;
			local314.anInt9638 = local314.aClass20_Sub2_Sub2_Sub1_Sub1_2.anInt10729 + (local314.aClass20_Sub2_Sub2_Sub1_Sub1_2.method4913() << 8);
			Static120.method1984(local314, arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIII)V")
	public static void method7506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 >= Static347.anInt6542 && Static553.anInt9425 >= arg5 && Static100.anInt10042 <= arg4 && Static567.anInt9578 >= arg3) {
			if (arg0 == 1) {
				Static196.method3495(arg3, arg4, arg2, arg5, arg1);
			} else {
				Static456.method7009(arg4, arg1, arg2, arg3, arg0, arg5);
			}
		} else if (arg0 == 1) {
			Static476.method8757(arg5, arg4, arg3, arg1, arg2);
		} else {
			Static89.method5739(arg2, arg0, arg3, arg4, arg5, arg1);
		}
	}
}
