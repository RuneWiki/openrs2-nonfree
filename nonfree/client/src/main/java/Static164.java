import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "Lclient!nga;")
	public static Class228 aClass228_8;

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
	public static int anInt8839;

	@OriginalMember(owner = "client!ft", name = "z", descriptor = "I")
	public static int anInt8855;

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)V")
	public static void method7296() {
		for (@Pc(6) Class3_Sub1_Sub10 local6 = (Class3_Sub1_Sub10) Static379.aClass30_9.method780(); local6 != null; local6 = (Class3_Sub1_Sub10) Static379.aClass30_9.method783()) {
			if (local6.anInt5812 > 1) {
				local6.anInt5812 = 0;
				Static54.aClass112_23.method3636(((Class3_Sub1_Sub4) local6.aClass30_7.aClass3_Sub1_7.aClass3_Sub1_66).aLong73, local6);
				local6.aClass30_7.method778();
			}
		}
		Static443.anInt8026 = 0;
		Static462.anInt8390 = 0;
		Static187.aClass276_28.method6910();
		Static107.aClass307_15.method7427();
		Static379.aClass30_9.method778();
		Static433.aBoolean672 = false;
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(I)V")
	public static void method7297(@OriginalArg(0) int arg0) {
		Static155.anInt3811 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static642.anInt10523; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static158.anInt3845; local6++) {
				if (Static170.aClass106ArrayArrayArray1[arg0][local3][local6] == null) {
					Static170.aClass106ArrayArrayArray1[arg0][local3][local6] = new Class106(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IBII)I")
	public static int method7298(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1) {
			return arg0;
		}
		@Pc(17) int local17 = 128 - arg2;
		@Pc(31) int local31 = local17 * (arg0 & 0x7F) + arg2 * (arg1 & 0x7F) >> 7;
		@Pc(45) int local45 = arg2 * (arg1 & 0x380) + local17 * (arg0 & 0x380) >> 7;
		@Pc(64) int local64 = local17 * (arg0 & 0xFC00) + (arg1 & 0xFC00) * arg2 >> 7;
		return local45 & 0x380 | local64 & 0xFC00 | local31 & 0x7F;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIZII[[[Lclient!fu;)Z")
	public static boolean method7303(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class106[][][] arg4) {
		@Pc(14) byte local14 = arg1 ? 1 : (byte) (Static469.anInt8476 & 0xFF);
		if (Static192.aByteArrayArrayArray3[Static552.anInt9440][arg3][arg2] == local14) {
			return false;
		} else if ((Static244.aByteArrayArrayArray10[Static552.anInt9440][arg3][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(50) byte local50 = 0;
			Static166.anIntArray211[0] = arg3;
			@Pc(56) int local56 = 0;
			@Pc(59) int local59 = local50 + 1;
			Static351.anIntArray399[0] = arg2;
			Static192.aByteArrayArrayArray3[Static552.anInt9440][arg3][arg2] = local14;
			while (local56 != local59) {
				@Pc(77) int local77 = Static166.anIntArray211[local56] & 0xFFFF;
				@Pc(85) int local85 = Static166.anIntArray211[local56] >> 16 & 0xFF;
				@Pc(93) int local93 = Static166.anIntArray211[local56] >> 24 & 0xFF;
				@Pc(99) int local99 = Static351.anIntArray399[local56] & 0xFFFF;
				@Pc(107) int local107 = Static351.anIntArray399[local56] >> 16 & 0xFF;
				local56 = local56 + 1 & 0xFFF;
				@Pc(115) boolean local115 = false;
				if ((Static244.aByteArrayArrayArray10[Static552.anInt9440][local77][local99] & 0x4) == 0) {
					local115 = true;
				}
				@Pc(132) boolean local132 = false;
				@Pc(138) int local138;
				@Pc(180) int local180;
				@Pc(223) int local223;
				if (arg4 != null) {
					label237: for (local138 = Static552.anInt9440 + 1; local138 <= 3; local138++) {
						if (arg4[local138] != null && (Static244.aByteArrayArrayArray10[local138][local77][local99] & 0x8) == 0) {
							@Pc(321) Class2_Sub3_Sub1 local321;
							@Pc(331) int local331;
							@Pc(310) Class106 local310;
							@Pc(316) Class243 local316;
							if (local115 && arg4[local138][local77][local99] != null) {
								if (arg4[local138][local77][local99].aClass2_Sub3_Sub2_2 != null) {
									local180 = Static510.method7397(local85);
									if (arg4[local138][local77][local99].aClass2_Sub3_Sub2_2.aShort90 == local180 || arg4[local138][local77][local99].aClass2_Sub3_Sub2_1 != null && arg4[local138][local77][local99].aClass2_Sub3_Sub2_1.aShort90 == local180) {
										continue;
									}
									if (local93 != 0) {
										local223 = Static510.method7397(local93);
										if (local223 == arg4[local138][local77][local99].aClass2_Sub3_Sub2_2.aShort90 || arg4[local138][local77][local99].aClass2_Sub3_Sub2_1 != null && local223 == arg4[local138][local77][local99].aClass2_Sub3_Sub2_1.aShort90) {
											continue;
										}
									}
									if (local107 != 0) {
										local223 = Static510.method7397(local107);
										if (local223 == arg4[local138][local77][local99].aClass2_Sub3_Sub2_2.aShort90 || arg4[local138][local77][local99].aClass2_Sub3_Sub2_1 != null && local223 == arg4[local138][local77][local99].aClass2_Sub3_Sub2_1.aShort90) {
											continue;
										}
									}
								}
								local310 = arg4[local138][local77][local99];
								if (local310.aClass243_1 != null) {
									for (local316 = local310.aClass243_1; local316 != null; local316 = local316.aClass243_3) {
										local321 = local316.aClass2_Sub3_Sub1_1;
										if (local321 instanceof Interface18) {
											@Pc(327) Interface18 local327 = (Interface18) local321;
											local331 = local327.method8588();
											@Pc(335) int local335 = local327.method8586();
											if (local331 == 21) {
												local331 = 19;
											}
											@Pc(348) int local348 = local335 << 6 | local331;
											if (local85 == local348 || local93 != 0 && local348 == local93 || local107 != 0 && local348 == local107) {
												continue label237;
											}
										}
									}
								}
							}
							local310 = arg4[local138][local77][local99];
							if (local310 != null && local310.aClass243_1 != null) {
								for (local316 = local310.aClass243_1; local316 != null; local316 = local316.aClass243_3) {
									local321 = local316.aClass2_Sub3_Sub1_1;
									if (local321.aShort121 != local321.aShort122 || local321.aShort124 != local321.aShort123) {
										for (@Pc(406) int local406 = local321.aShort121; local406 <= local321.aShort122; local406++) {
											for (local331 = local321.aShort124; local331 <= local321.aShort123; local331++) {
												Static192.aByteArrayArrayArray3[local138][local406][local331] = local14;
											}
										}
									}
								}
							}
							local132 = true;
							Static192.aByteArrayArrayArray3[local138][local77][local99] = local14;
						}
					}
				}
				if (local132) {
					local138 = Static500.aClass274Array2[Static552.anInt9440 + 1].method8041(local77, local99);
					if (Static286.anIntArray346[arg0] < local138) {
						Static286.anIntArray346[arg0] = local138;
					}
					local180 = local77 << 9;
					local223 = local99 << 9;
					if (local180 < Static99.anIntArray103[arg0]) {
						Static99.anIntArray103[arg0] = local180;
					} else if (local180 > Static170.anIntArray225[arg0]) {
						Static170.anIntArray225[arg0] = local180;
					}
					if (Static454.anIntArray521[arg0] > local223) {
						Static454.anIntArray521[arg0] = local223;
					} else if (Static394.anIntArray471[arg0] < local223) {
						Static394.anIntArray471[arg0] = local223;
					}
				}
				if (!local115) {
					if (local77 >= 1 && Static192.aByteArrayArrayArray3[Static552.anInt9440][local77 - 1][local99] != local14) {
						Static166.anIntArray211[local59] = local77 - 1 | 0xD3000000 | 0x120000;
						Static351.anIntArray399[local59] = local99 | 0x130000;
						Static192.aByteArrayArrayArray3[Static552.anInt9440][local77 - 1][local99] = local14;
						local59 = local59 + 1 & 0xFFF;
					}
					@Pc(588) int local588 = ~Static462.anInt8391;
					local99++;
					if (local588 < ~local99) {
						if (local77 - 1 >= 0 && local14 != Static192.aByteArrayArrayArray3[Static552.anInt9440][local77 - 1][local99] && (Static244.aByteArrayArrayArray10[Static552.anInt9440][local77][local99] & 0x4) == 0 && (Static244.aByteArrayArrayArray10[Static552.anInt9440][local77 - 1][local99 - 1] & 0x4) == 0) {
							Static166.anIntArray211[local59] = local77 - 1 | 0x52000000 | 0x120000;
							Static351.anIntArray399[local59] = local99 | 0x130000;
							Static192.aByteArrayArrayArray3[Static552.anInt9440][local77 - 1][local99] = local14;
							local59 = local59 + 1 & 0xFFF;
						}
						if (local14 != Static192.aByteArrayArrayArray3[Static552.anInt9440][local77][local99]) {
							Static166.anIntArray211[local59] = local77 | 0x13000000 | 0x520000;
							Static351.anIntArray399[local59] = local99 | 0x530000;
							local59 = local59 + 1 & 0xFFF;
							Static192.aByteArrayArrayArray3[Static552.anInt9440][local77][local99] = local14;
						}
						if (local77 + 1 < Static394.anInt7540 && local14 != Static192.aByteArrayArrayArray3[Static552.anInt9440][local77 + 1][local99] && (Static244.aByteArrayArrayArray10[Static552.anInt9440][local77][local99] & 0x4) == 0 && (Static244.aByteArrayArrayArray10[Static552.anInt9440][local77 + 1][local99 - 1] & 0x4) == 0) {
							Static166.anIntArray211[local59] = local77 + 1 | 0x92000000 | 0x520000;
							Static351.anIntArray399[local59] = local99 | 0x530000;
							Static192.aByteArrayArrayArray3[Static552.anInt9440][local77 + 1][local99] = local14;
							local59 = local59 + 1 & 0xFFF;
						}
					}
					local99--;
					if (Static394.anInt7540 > local77 + 1 && Static192.aByteArrayArrayArray3[Static552.anInt9440][local77 + 1][local99] != local14) {
						Static166.anIntArray211[local59] = 0x53000000 | 0x920000 | local77 + 1;
						Static351.anIntArray399[local59] = local99 | 0x930000;
						Static192.aByteArrayArrayArray3[Static552.anInt9440][local77 + 1][local99] = local14;
						local59 = local59 + 1 & 0xFFF;
					}
					local99--;
					if (local99 >= 0) {
						if (local77 - 1 >= 0 && Static192.aByteArrayArrayArray3[Static552.anInt9440][local77 - 1][local99] != local14 && (Static244.aByteArrayArrayArray10[Static552.anInt9440][local77][local99] & 0x4) == 0 && (Static244.aByteArrayArrayArray10[Static552.anInt9440][local77 - 1][local99 + 1] & 0x4) == 0) {
							Static166.anIntArray211[local59] = local77 - 1 | 0x12000000 | 0xD20000;
							Static351.anIntArray399[local59] = local99 | 0xD30000;
							Static192.aByteArrayArrayArray3[Static552.anInt9440][local77 - 1][local99] = local14;
							local59 = local59 + 1 & 0xFFF;
						}
						if (local14 != Static192.aByteArrayArrayArray3[Static552.anInt9440][local77][local99]) {
							Static166.anIntArray211[local59] = local77 | 0xD20000 | 0x93000000;
							Static351.anIntArray399[local59] = local99 | 0xD30000;
							Static192.aByteArrayArrayArray3[Static552.anInt9440][local77][local99] = local14;
							local59 = local59 + 1 & 0xFFF;
						}
						if (Static394.anInt7540 > local77 + 1 && local14 != Static192.aByteArrayArrayArray3[Static552.anInt9440][local77 + 1][local99] && (Static244.aByteArrayArrayArray10[Static552.anInt9440][local77][local99] & 0x4) == 0 && (Static244.aByteArrayArrayArray10[Static552.anInt9440][local77 + 1][local99 + 1] & 0x4) == 0) {
							Static166.anIntArray211[local59] = local77 + 1 | 0x920000 | 0xD2000000;
							Static351.anIntArray399[local59] = local99 | 0x930000;
							local59 = local59 + 1 & 0xFFF;
							Static192.aByteArrayArrayArray3[Static552.anInt9440][local77 + 1][local99] = local14;
						}
					}
				}
			}
			if (Static286.anIntArray346[arg0] != -1000000) {
				Static286.anIntArray346[arg0] += 40;
				Static99.anIntArray103[arg0] -= 512;
				Static170.anIntArray225[arg0] += 512;
				Static394.anIntArray471[arg0] += 512;
				Static454.anIntArray521[arg0] -= 512;
			}
			return true;
		}
	}
}
