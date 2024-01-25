import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
	public static int anInt1506;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
	public static int anInt1509;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "[I")
	public static final int[] anIntArray170 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
	public static int anInt1510 = 0;

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString57 = "Please remove ";

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!aa;ZI[BZI[Lclient!ie;III)[I")
	public static int[] method1434(@OriginalArg(0) Class2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class91[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(31) int local31;
		if (!arg3) {
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				@Pc(15) Class91 local15 = arg5[local9];
				for (local17 = 0; local17 < 64; local17++) {
					for (local21 = 0; local21 < 64; local21++) {
						local27 = local17 + arg7;
						local31 = arg1 + local21;
						if (local27 >= 0 && Static48.anInt1107 > local27 && local31 >= 0 && Static337.anInt6402 > local31) {
							local15.method2591(local31, local27);
						}
					}
				}
			}
		}
		@Pc(72) Class1_Sub7 local72 = new Class1_Sub7(arg2);
		@Pc(76) int local76 = arg6 + arg7;
		local17 = arg8 + arg1;
		for (local21 = 0; local21 < arg4; local21++) {
			for (local27 = 0; local27 < 64; local27++) {
				for (local31 = 0; local31 < 64; local31++) {
					Static40.method4016(arg3, arg7 + local27, 0, false, 0, local72, local21, local31 + local17, arg1 + local31, local27 + local76, 0);
				}
			}
		}
		@Pc(131) boolean local131 = false;
		@Pc(133) boolean local133 = false;
		@Pc(139) int local139;
		@Pc(186) int local186;
		@Pc(200) int local200;
		@Pc(204) int local204;
		@Pc(206) int local206;
		@Pc(228) int local228;
		while (local72.aByteArray58.length > local72.anInt3368) {
			local139 = local72.method3141();
			if (local139 == 128) {
				Static181.anIntArray443[0] = local72.method3115();
				Static181.anIntArray443[1] = local72.method3090();
				Static181.anIntArray443[2] = local72.method3090();
				Static181.anIntArray443[3] = local72.method3090();
				Static181.anIntArray443[4] = local72.method3115();
				local131 = true;
			} else {
				if (local139 != 129) {
					local72.anInt3368--;
					break;
				}
				if (Static207.aByteArrayArrayArray10 == null) {
					Static207.aByteArrayArrayArray10 = new byte[4][][];
				}
				for (local186 = 0; local186 < 4; local186++) {
					@Pc(192) byte local192 = local72.method3130();
					if (local192 == 0 && Static207.aByteArrayArrayArray10[local186] != null) {
						local200 = arg7;
						local204 = arg7 + 64;
						local206 = arg1;
						if (arg1 < 0) {
							local206 = 0;
						} else if (arg1 >= Static337.anInt6402) {
							local206 = Static337.anInt6402;
						}
						local228 = arg1 + 64;
						if (local204 < 0) {
							local204 = 0;
						} else if (Static48.anInt1107 <= local204) {
							local204 = Static48.anInt1107;
						}
						if (arg7 < 0) {
							local200 = 0;
						} else if (arg7 >= Static48.anInt1107) {
							local200 = Static48.anInt1107;
						}
						if (local228 < 0) {
							local228 = 0;
						} else if (local228 >= Static337.anInt6402) {
							local228 = Static337.anInt6402;
						}
						while (local204 > local200) {
							while (local206 < local228) {
								Static207.aByteArrayArrayArray10[local186][local200][local206] = 0;
								local206++;
							}
							local200++;
						}
					} else if (local192 == 1) {
						if (Static207.aByteArrayArrayArray10[local186] == null) {
							Static207.aByteArrayArrayArray10[local186] = new byte[Static48.anInt1107 + 1][Static337.anInt6402 + 1];
						}
						for (local200 = 0; local200 < 64; local200 += 4) {
							for (local204 = 0; local204 < 64; local204 += 4) {
								@Pc(326) byte local326 = local72.method3130();
								for (local228 = local200 + arg7; local228 < local200 + arg7 + 4; local228++) {
									for (@Pc(337) int local337 = local204 + arg1; local337 < arg1 + local204 + 4; local337++) {
										if (local228 >= 0 && Static48.anInt1107 > local228 && local337 >= 0 && Static337.anInt6402 > local337) {
											Static207.aByteArrayArrayArray10[local186][local228][local337] = local326;
										}
									}
								}
							}
						}
					} else if (local192 == 2) {
						if (Static207.aByteArrayArrayArray10[local186] == null) {
							Static207.aByteArrayArrayArray10[local186] = new byte[Static48.anInt1107 + 1][Static337.anInt6402 + 1];
						}
						if (local186 > 0) {
							local200 = arg7;
							local204 = arg7 + 64;
							local206 = arg1;
							if (arg1 < 0) {
								local206 = 0;
							} else if (arg1 >= Static337.anInt6402) {
								local206 = Static337.anInt6402;
							}
							local228 = arg1 + 64;
							if (local204 < 0) {
								local204 = 0;
							} else if (local204 >= Static48.anInt1107) {
								local204 = Static48.anInt1107;
							}
							if (arg7 < 0) {
								local200 = 0;
							} else if (Static48.anInt1107 <= arg7) {
								local200 = Static48.anInt1107;
							}
							if (local228 < 0) {
								local228 = 0;
							} else if (Static337.anInt6402 <= local228) {
								local228 = Static337.anInt6402;
							}
							while (local204 > local200) {
								while (local228 > local206) {
									Static207.aByteArrayArrayArray10[local186][local200][local206] = Static207.aByteArrayArrayArray10[local186 - 1][local200][local206];
									local206++;
								}
								local200++;
							}
						}
					}
				}
				local133 = true;
			}
		}
		@Pc(580) int local580;
		if (!arg3) {
			@Pc(545) Class186 local545 = null;
			label278: while (true) {
				while (true) {
					while (local72.aByteArray58.length > local72.anInt3368) {
						local186 = local72.method3141();
						if (local186 == 0) {
							local545 = new Class186(local72);
						} else if (local186 == 1) {
							local580 = local72.method3141();
							if (local580 > 0) {
								for (local200 = 0; local200 < local580; local200++) {
									@Pc(594) Class1_Sub31_Sub1 local594 = new Class1_Sub31_Sub1(local72);
									if (local594.anInt4707 == 31) {
										@Pc(606) Class36 local606 = Static272.method4749(local72.method3115());
										local594.method4289(local606.anInt1303, local606.anInt1305, local606.anInt1301, local606.anInt1300);
									}
									local594.anInt4687 += arg7 << 7;
									local594.anInt4693 += arg1 << 7;
									local206 = local594.anInt4687 >> 7;
									local228 = local594.anInt4693 >> 7;
									if (local206 >= 0 && local228 >= 0 && Static48.anInt1107 > local206 && local228 < Static337.anInt6402) {
										local594.anInt4691 = Static213.anIntArrayArrayArray10[local594.anInt4698][local206][local228] - local594.anInt4691;
										if (arg0.method3312() > 0) {
											Static24.method732(local594);
										}
									}
								}
							}
						} else if (local186 == 2) {
							if (local545 == null) {
								local545 = new Class186();
							}
							local545.method4878(local72);
						} else {
							throw new IllegalStateException();
						}
					}
					if (local545 != null) {
						for (local186 = 0; local186 < 8; local186++) {
							for (local580 = 0; local580 < 8; local580++) {
								local200 = (arg7 >> 3) + local186;
								local204 = (arg1 >> 3) + local580;
								if (local200 >= 0 && Static48.anInt1107 >> 3 > local200 && local204 >= 0 && local204 < Static337.anInt6402 >> 3) {
									Static306.method5156(local204, local545, local200);
								}
							}
						}
					}
					break label278;
				}
			}
		}
		if (!local133 && Static207.aByteArrayArrayArray10 != null) {
			for (local139 = 0; local139 < 4; local139++) {
				if (Static207.aByteArrayArrayArray10[local139] != null) {
					for (local186 = 0; local186 < 16; local186++) {
						for (local580 = 0; local580 < 16; local580++) {
							local200 = local186 + (arg7 >> 2);
							local204 = local580 + (arg1 >> 2);
							if (local200 >= 0 && local200 < 26 && local204 >= 0 && local204 < 26) {
								Static207.aByteArrayArrayArray10[local139][local200][local204] = 0;
							}
						}
					}
				}
			}
		}
		if (local131) {
			return Static181.anIntArray443;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[Lclient!rg;IIZI)V")
	public static void method1435(@OriginalArg(0) int arg0, @OriginalArg(1) Class177[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class177 local13 = arg1[local7];
			if (local13 != null && local13.anInt5236 == arg2) {
				Static298.method5223(arg3, arg0, local13, arg4);
				Static206.method3815(arg3, local13, arg0);
				if (local13.anInt5221 > local13.anInt5181 - local13.anInt5179) {
					local13.anInt5221 = local13.anInt5181 - local13.anInt5179;
				}
				if (local13.anInt5221 < 0) {
					local13.anInt5221 = 0;
				}
				if (local13.anInt5262 - local13.anInt5209 < local13.anInt5182) {
					local13.anInt5182 = local13.anInt5262 - local13.anInt5209;
				}
				if (local13.anInt5182 < 0) {
					local13.anInt5182 = 0;
				}
				if (local13.anInt5208 == 0) {
					Static217.method3973(arg4, local13);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!ql;)I")
	public static int method1436(@OriginalArg(1) Class5_Sub3_Sub3_Sub2 arg0) {
		@Pc(8) Class122 local8 = arg0.aClass122_1;
		if (local8.anIntArray451 != null) {
			local8 = local8.method3573();
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(22) int local22 = local8.anInt3816;
		@Pc(26) Class45 local26 = arg0.method4533();
		if (arg0.aBoolean412) {
			local22 = local8.anInt3793;
		} else if (local26.anInt1490 == arg0.anInt4975 || local26.anInt1494 == arg0.anInt4975 || local26.anInt1481 == arg0.anInt4975 || arg0.anInt4975 == local26.anInt1489) {
			local22 = local8.anInt3820;
		} else if (local26.anInt1504 == arg0.anInt4975 || arg0.anInt4975 == local26.anInt1476 || arg0.anInt4975 == local26.anInt1500 || arg0.anInt4975 == local26.anInt1482) {
			local22 = local8.anInt3786;
		}
		return local22;
	}
}
