import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fi", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZIII[[[Lclient!ms;I)Z")
	public static boolean method1995(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class228[][][] arg4) {
		@Pc(14) byte local14 = arg0 ? 1 : (byte) (Static388.anInt6397 & 0xFF);
		if (Class2_Sub35_Sub1.lb[Static402.anInt6620][arg3][arg2] == local14) {
			return false;
		} else if ((Static433.aByteArrayArrayArray15[Static402.anInt6620][arg3][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(46) byte local46 = 0;
			Static408.anIntArray247[0] = arg3;
			@Pc(52) int local52 = 0;
			@Pc(55) int local55 = local46 + 1;
			Static265.anIntArray314[0] = arg2;
			Class2_Sub35_Sub1.lb[Static402.anInt6620][arg3][arg2] = local14;
			while (local55 != local52) {
				@Pc(73) int local73 = Static408.anIntArray247[local52] & 0xFFFF;
				@Pc(81) int local81 = Static408.anIntArray247[local52] >> 16 & 0xFF;
				@Pc(89) int local89 = Static408.anIntArray247[local52] >> 24 & 0xFF;
				@Pc(95) int local95 = Static265.anIntArray314[local52] & 0xFFFF;
				@Pc(103) int local103 = Static265.anIntArray314[local52] >> 16 & 0xFF;
				local52 = local52 + 1 & 0xFFF;
				@Pc(111) boolean local111 = false;
				if ((Static433.aByteArrayArrayArray15[Static402.anInt6620][local73][local95] & 0x4) == 0) {
					local111 = true;
				}
				@Pc(128) boolean local128 = false;
				@Pc(170) int local170;
				@Pc(215) int local215;
				label231: for (@Pc(132) int local132 = Static402.anInt6620 + 1; local132 <= 3; local132++) {
					if ((Static433.aByteArrayArrayArray15[local132][local73][local95] & 0x8) == 0) {
						@Pc(315) Class12_Sub2_Sub1 local315;
						@Pc(325) int local325;
						@Pc(304) Class228 local304;
						@Pc(310) Class180 local310;
						if (local111 && arg4[local132][local73][local95] != null) {
							if (arg4[local132][local73][local95].aClass12_Sub2_Sub5_1 != null) {
								local170 = Static307.method4403(local81);
								if (arg4[local132][local73][local95].aClass12_Sub2_Sub5_1.aShort116 == local170 || arg4[local132][local73][local95].aClass12_Sub2_Sub5_2 != null && local170 == arg4[local132][local73][local95].aClass12_Sub2_Sub5_2.aShort116) {
									continue;
								}
								if (local89 != 0) {
									local215 = Static307.method4403(local89);
									if (local215 == arg4[local132][local73][local95].aClass12_Sub2_Sub5_1.aShort116 || arg4[local132][local73][local95].aClass12_Sub2_Sub5_2 != null && arg4[local132][local73][local95].aClass12_Sub2_Sub5_2.aShort116 == local215) {
										continue;
									}
								}
								if (local103 != 0) {
									local215 = Static307.method4403(local103);
									if (local215 == arg4[local132][local73][local95].aClass12_Sub2_Sub5_1.aShort116 || arg4[local132][local73][local95].aClass12_Sub2_Sub5_2 != null && arg4[local132][local73][local95].aClass12_Sub2_Sub5_2.aShort116 == local215) {
										continue;
									}
								}
							}
							local304 = arg4[local132][local73][local95];
							if (local304.aClass180_3 != null) {
								for (local310 = local304.aClass180_3; local310 != null; local310 = local310.aClass180_2) {
									local315 = local310.aClass12_Sub2_Sub1_1;
									if (local315 instanceof Interface14) {
										@Pc(321) Interface14 local321 = (Interface14) local315;
										local325 = local321.method7091();
										@Pc(329) int local329 = local321.method7093();
										if (local325 == 21) {
											local325 = 19;
										}
										@Pc(340) int local340 = local325 | local329 << 6;
										if (local81 == local340 || local89 != 0 && local89 == local340 || local103 != 0 && local340 == local103) {
											continue label231;
										}
									}
								}
							}
						}
						local304 = arg4[local132][local73][local95];
						if (local304 != null && local304.aClass180_3 != null) {
							for (local310 = local304.aClass180_3; local310 != null; local310 = local310.aClass180_2) {
								local315 = local310.aClass12_Sub2_Sub1_1;
								if (local315.aShort120 != local315.aShort119 || local315.aShort122 != local315.aShort121) {
									for (@Pc(413) int local413 = local315.aShort120; local413 <= local315.aShort119; local413++) {
										for (local325 = local315.aShort121; local325 <= local315.aShort122; local325++) {
											Class2_Sub35_Sub1.lb[local132][local413][local325] = local14;
										}
									}
								}
							}
						}
						Class2_Sub35_Sub1.lb[local132][local73][local95] = local14;
						local128 = true;
					}
				}
				if (local128) {
					local170 = Static114.aClass151Array1[Static402.anInt6620 + 1].method7676(local95, local73);
					if (Static264.anIntArray313[arg1] < local170) {
						Static264.anIntArray313[arg1] = local170;
					}
					local215 = local73 << 9;
					@Pc(494) int local494 = local95 << 9;
					if (local215 < Static100.anIntArray153[arg1]) {
						Static100.anIntArray153[arg1] = local215;
					} else if (local215 > Static524.anIntArray557[arg1]) {
						Static524.anIntArray557[arg1] = local215;
					}
					if (local494 < Static523.anIntArray556[arg1]) {
						Static523.anIntArray556[arg1] = local494;
					} else if (Static447.anIntArray484[arg1] < local494) {
						Static447.anIntArray484[arg1] = local494;
					}
				}
				if (!local111) {
					if (local73 >= 1 && Class2_Sub35_Sub1.lb[Static402.anInt6620][local73 - 1][local95] != local14) {
						Static408.anIntArray247[local55] = local73 - 1 | 0x120000 | 0xD3000000;
						Static265.anIntArray314[local55] = local95 | 0x130000;
						local55 = local55 + 1 & 0xFFF;
						Class2_Sub35_Sub1.lb[Static402.anInt6620][local73 - 1][local95] = local14;
					}
					local95++;
					if (Static29.anInt491 > local95) {
						if (local73 - 1 >= 0 && local14 != Class2_Sub35_Sub1.lb[Static402.anInt6620][local73 - 1][local95] && (Static433.aByteArrayArrayArray15[Static402.anInt6620][local73][local95] & 0x4) == 0 && (Static433.aByteArrayArrayArray15[Static402.anInt6620][local73 - 1][local95 - 1] & 0x4) == 0) {
							Static408.anIntArray247[local55] = local73 - 1 | 0x120000 | 0x52000000;
							Static265.anIntArray314[local55] = local95 | 0x130000;
							Class2_Sub35_Sub1.lb[Static402.anInt6620][local73 - 1][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (Class2_Sub35_Sub1.lb[Static402.anInt6620][local73][local95] != local14) {
							Static408.anIntArray247[local55] = local73 | 0x13000000 | 0x520000;
							Static265.anIntArray314[local55] = local95 | 0x530000;
							Class2_Sub35_Sub1.lb[Static402.anInt6620][local73][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (local73 + 1 < Static281.anInt4822 && Class2_Sub35_Sub1.lb[Static402.anInt6620][local73 + 1][local95] != local14 && (Static433.aByteArrayArrayArray15[Static402.anInt6620][local73][local95] & 0x4) == 0 && (Static433.aByteArrayArrayArray15[Static402.anInt6620][local73 + 1][local95 - 1] & 0x4) == 0) {
							Static408.anIntArray247[local55] = local73 + 1 | 0x92000000 | 0x520000;
							Static265.anIntArray314[local55] = local95 | 0x530000;
							local55 = local55 + 1 & 0xFFF;
							Class2_Sub35_Sub1.lb[Static402.anInt6620][local73 + 1][local95] = local14;
						}
					}
					local95--;
					if (Static281.anInt4822 > local73 + 1 && local14 != Class2_Sub35_Sub1.lb[Static402.anInt6620][local73 + 1][local95]) {
						Static408.anIntArray247[local55] = 0x53000000 | 0x920000 | local73 + 1;
						Static265.anIntArray314[local55] = local95 | 0x930000;
						Class2_Sub35_Sub1.lb[Static402.anInt6620][local73 + 1][local95] = local14;
						local55 = local55 + 1 & 0xFFF;
					}
					local95--;
					if (local95 >= 0) {
						if (local73 - 1 >= 0 && local14 != Class2_Sub35_Sub1.lb[Static402.anInt6620][local73 - 1][local95] && (Static433.aByteArrayArrayArray15[Static402.anInt6620][local73][local95] & 0x4) == 0 && (Static433.aByteArrayArrayArray15[Static402.anInt6620][local73 - 1][local95 + 1] & 0x4) == 0) {
							Static408.anIntArray247[local55] = local73 - 1 | 0x12000000 | 0xD20000;
							Static265.anIntArray314[local55] = local95 | 0xD30000;
							Class2_Sub35_Sub1.lb[Static402.anInt6620][local73 - 1][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (local14 != Class2_Sub35_Sub1.lb[Static402.anInt6620][local73][local95]) {
							Static408.anIntArray247[local55] = local73 | 0xD20000 | 0x93000000;
							Static265.anIntArray314[local55] = local95 | 0xD30000;
							local55 = local55 + 1 & 0xFFF;
							Class2_Sub35_Sub1.lb[Static402.anInt6620][local73][local95] = local14;
						}
						if (local73 + 1 < Static281.anInt4822 && Class2_Sub35_Sub1.lb[Static402.anInt6620][local73 + 1][local95] != local14 && (Static433.aByteArrayArrayArray15[Static402.anInt6620][local73][local95] & 0x4) == 0 && (Static433.aByteArrayArrayArray15[Static402.anInt6620][local73 + 1][local95 + 1] & 0x4) == 0) {
							Static408.anIntArray247[local55] = local73 + 1 | 0xD2000000 | 0x920000;
							Static265.anIntArray314[local55] = local95 | 0x930000;
							local55 = local55 + 1 & 0xFFF;
							Class2_Sub35_Sub1.lb[Static402.anInt6620][local73 + 1][local95] = local14;
						}
					}
				}
			}
			if (Static264.anIntArray313[arg1] != -1000000) {
				Static264.anIntArray313[arg1] += 40;
				Static100.anIntArray153[arg1] -= 512;
				Static524.anIntArray557[arg1] += 512;
				Static447.anIntArray484[arg1] += 512;
				Static523.anIntArray556[arg1] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "()V")
	public static void method2000() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static49.aClass128Array2.length; local3++) {
				if (Static49.aClass128Array2[local3].method2300()) {
					Static454.aLongArray14[local3] = Static49.aClass128Array2[local3].method2304();
				} else {
					synchronized (Static49.aClass128Array2[local3]) {
						Static49.aClass128Array2[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static49.aClass128Array2[Static49.aClass128Array2.length - 1].method2303();
				Static329.method4758(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static49.aClass128Array2.length - 1; local3++) {
						if (!Static49.aClass128Array2[local3].method2300()) {
							synchronized (Static49.aClass128Array2[local3]) {
								Static49.aClass128Array2[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static49.aClass128Array2.length - 2; local102++) {
							Static49.aClass128Array2[local102].method2303();
						}
						Static329.method4758(2);
						while (!Static49.aClass128Array2[0].method2300()) {
							synchronized (Static49.aClass128Array2[0]) {
								Static49.aClass128Array2[0].notify();
							}
							try {
								Static263.method3671(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static49.aClass128Array2[0].method2303();
						return;
					}
					try {
						Static263.method3671(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static263.method3671(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(Lclient!gk;I)Lclient!qj;")
	public static Class187_Sub3 method2001(@OriginalArg(0) Class2_Sub7 arg0) {
		return new Class187_Sub3(arg0.method4478(), arg0.method4478(), arg0.method4478(), arg0.method4478(), arg0.method4503(), arg0.method4503(), arg0.method4464());
	}
}
