import java.awt.Frame;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
	public static int anInt5680;

	@OriginalMember(owner = "client!tb", name = "W", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(B)I")
	public static int method5013() {
		try {
			if (Static11.anInt5390 == 0) {
				if (Static349.method5647() - 5000L < Static99.aLong77) {
					return 0;
				}
				Static218.aClass134_7 = Static180.aClass110_6.method3357(Static148.aString201, Static194.anInt3960);
				Static209.aLong143 = Static349.method5647();
				Static11.anInt5390 = 1;
			}
			if (Static209.aLong143 + 30000L < Static349.method5647()) {
				return Static223.method4076(1000);
			}
			@Pc(78) int local78;
			@Pc(121) int local121;
			if (Static11.anInt5390 == 1) {
				if (Static218.aClass134_7.anInt4033 == 2) {
					return Static223.method4076(1001);
				}
				if (Static218.aClass134_7.anInt4033 != 1) {
					return -1;
				}
				Static153.aClass158_2 = new Class158((Socket) Static218.aClass134_7.anObject6, Static180.aClass110_6);
				Static218.aClass134_7 = null;
				local78 = 0;
				if (Static293.aBoolean499) {
					local78 = Static335.anInt6373;
				}
				Static248.aClass1_Sub7_Sub1_2.anInt3368 = 0;
				Static248.aClass1_Sub7_Sub1_2.method3108(23);
				Static248.aClass1_Sub7_Sub1_2.method3098(local78);
				Static153.aClass158_2.method4325(Static248.aClass1_Sub7_Sub1_2.aByteArray58, Static248.aClass1_Sub7_Sub1_2.anInt3368);
				if (Static210.aClass174_2 != null) {
					Static210.aClass174_2.method5520();
				}
				if (Static108.aClass174_1 != null) {
					Static108.aClass174_1.method5520();
				}
				local121 = Static153.aClass158_2.method4337();
				if (Static210.aClass174_2 != null) {
					Static210.aClass174_2.method5520();
				}
				if (Static108.aClass174_1 != null) {
					Static108.aClass174_1.method5520();
				}
				if (local121 != 0) {
					return Static223.method4076(local121);
				}
				Static11.anInt5390 = 2;
			}
			if (Static11.anInt5390 == 2) {
				if (Static153.aClass158_2.method4326() < 2) {
					return -1;
				}
				Static269.anInt5258 = Static153.aClass158_2.method4337();
				Static269.anInt5258 <<= 0x8;
				Static269.anInt5258 += Static153.aClass158_2.method4337();
				Static304.aByteArray90 = new byte[Static269.anInt5258];
				Static11.anInt5390 = 3;
				Static120.anInt2348 = 0;
			}
			if (Static11.anInt5390 != 3) {
				return -1;
			}
			local78 = Static153.aClass158_2.method4326();
			if (local78 < 1) {
				return -1;
			}
			if (Static269.anInt5258 - Static120.anInt2348 < local78) {
				local78 = Static269.anInt5258 - Static120.anInt2348;
			}
			Static153.aClass158_2.method4330(local78, Static304.aByteArray90, Static120.anInt2348);
			Static120.anInt2348 += local78;
			if (Static269.anInt5258 > Static120.anInt2348) {
				return -1;
			} else if (Static16.method366(Static304.aByteArray90)) {
				Static296.aClass74_Sub1Array2 = new Class74_Sub1[Static152.anInt3054];
				local121 = 0;
				for (@Pc(241) int local241 = Static116.anInt2306; local241 <= Static5.anInt98; local241++) {
					@Pc(247) Class74_Sub1 local247 = Static51.method4585(local241);
					if (local247 != null) {
						Static296.aClass74_Sub1Array2[local121++] = local247;
					}
				}
				Static2.aClass1_Sub15_3 = null;
				Static54.anInt3492 = 0;
				Static153.aClass158_2.method4339();
				Static261.anInt5070 = 0;
				Static153.aClass158_2 = null;
				Static304.aByteArray90 = null;
				Static11.anInt5390 = 0;
				Static99.aLong77 = Static349.method5647();
				return 0;
			} else {
				return Static223.method4076(1002);
			}
		} catch (@Pc(279) IOException local279) {
			return Static223.method4076(1003);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!aa;II[Lclient!ie;IIIIZ[BII)[I")
	public static int[] method5014(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class91[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11 = (arg10 & 0x7) * 8;
		@Pc(17) int local17 = (arg5 & 0x7) * 8;
		@Pc(25) int local25;
		@Pc(29) int local29;
		if (!arg8) {
			@Pc(23) Class91 local23 = arg3[arg2];
			for (local25 = 0; local25 < 8; local25++) {
				for (local29 = 0; local29 < 8; local29++) {
					@Pc(43) int local43 = arg7 + Static216.method3971(arg4, local29 & 0x7, local25 & 0x7);
					@Pc(56) int local56 = arg1 + Static276.method4788(local29 & 0x7, arg4, local25 & 0x7);
					if (local43 > 0 && local43 < Static48.anInt1107 - 1 && local56 > 0 && local56 < Static337.anInt6402 - 1) {
						local23.method2591(local56, local43);
					}
				}
			}
		}
		@Pc(99) byte local99;
		if (arg8) {
			local99 = 1;
		} else {
			local99 = 4;
		}
		@Pc(108) Class1_Sub7 local108 = new Class1_Sub7(arg9);
		local25 = (arg10 & 0xFFFFFFF8) << 3;
		local29 = (arg5 & 0xFFFFFFF8) << 3;
		@Pc(122) byte local122 = 0;
		@Pc(124) byte local124 = 0;
		if (arg4 == 1) {
			local124 = 1;
		} else if (arg4 == 2) {
			local122 = 1;
			local124 = 1;
		} else if (arg4 == 3) {
			local122 = 1;
		}
		@Pc(211) int local211;
		@Pc(223) int local223;
		@Pc(253) int local253;
		@Pc(260) int local260;
		@Pc(277) int local277;
		@Pc(286) int local286;
		for (@Pc(156) int local156 = 0; local156 < local99; local156++) {
			for (@Pc(160) int local160 = 0; local160 < 64; local160++) {
				for (@Pc(164) int local164 = 0; local164 < 64; local164++) {
					if (local156 != arg6 || local160 < local11 || local11 + 8 < local160 || local164 < local17 || local17 + 8 < local164) {
						Static40.method4016(arg8, -1, 0, false, 0, local108, 0, 0, -1, 0, 0);
					} else if (local160 == local11 + 8 || local164 == local17 + 8) {
						if (arg4 == 0) {
							local211 = arg7 + local160 - local11;
							local223 = local164 + arg1 - local17;
						} else if (arg4 == 1) {
							local223 = local11 + arg1 + 8 - local160;
							local211 = local164 + arg7 - local17;
						} else if (arg4 == 2) {
							local223 = local17 + arg1 + 8 - local164;
							local211 = local11 + arg7 + 8 - local160;
						} else {
							local211 = arg7 + local17 + 8 - local164;
							local223 = arg1 + local160 - local11;
						}
						Static40.method4016(arg8, local211, 0, true, 0, local108, arg2, local164 + local29, local223, local160 + local25, 0);
					} else {
						local211 = Static216.method3971(arg4, local164 & 0x7, local160 & 0x7) + arg7;
						local223 = arg1 + Static276.method4788(local164 & 0x7, arg4, local160 & 0x7);
						Static40.method4016(arg8, local211, local124, false, arg4, local108, arg2, local164 + local29, local223, local160 + local25, local122);
						if (local160 == 63 || local164 == 63) {
							local253 = local160 == 63 ? 64 : local160;
							local260 = local164 == 63 ? 64 : local164;
							if (arg4 == 0) {
								local277 = arg7 + local253 - local11;
								local286 = local260 + arg1 - local17;
							} else if (arg4 == 1) {
								local277 = local260 + arg7 - local17;
								local286 = local11 + arg1 + 8 - local253;
							} else if (arg4 == 2) {
								local286 = arg1 + local17 + 8 - local260;
								local277 = arg7 + local11 + 8 - local253;
							} else {
								local286 = arg1 + local253 - local11;
								local277 = arg7 + local17 + 8 - local260;
							}
							if (local277 >= 0 && Static48.anInt1107 > local277 && local286 >= 0 && local286 < Static337.anInt6402) {
								Static213.anIntArrayArrayArray10[arg2][local277][local286] = Static213.anIntArrayArrayArray10[arg2][local211 + local122][local223 + local124];
							}
						}
					}
				}
			}
		}
		@Pc(514) boolean local514 = false;
		@Pc(619) int local619;
		@Pc(701) int local701;
		@Pc(743) int local743;
		while (local108.aByteArray58.length > local108.anInt3368) {
			local211 = local108.method3141();
			if (local211 == 128) {
				Static181.anIntArray443[0] = local108.method3115();
				Static181.anIntArray443[1] = local108.method3090();
				Static181.anIntArray443[2] = local108.method3090();
				Static181.anIntArray443[3] = local108.method3090();
				Static181.anIntArray443[4] = local108.method3115();
				local514 = true;
			} else {
				if (local211 != 129) {
					local108.anInt3368--;
					break;
				}
				if (Static207.aByteArrayArrayArray10 == null) {
					Static207.aByteArrayArrayArray10 = new byte[4][][];
				}
				for (local223 = 0; local223 < 4; local223++) {
					@Pc(551) byte local551 = local108.method3130();
					if (local551 == 0 && Static207.aByteArrayArrayArray10[arg2] != null) {
						if (arg6 >= local223) {
							local260 = arg7;
							local277 = arg7 + 7;
							local286 = arg1;
							if (arg7 < 0) {
								local260 = 0;
							} else if (arg7 >= Static48.anInt1107) {
								local260 = Static48.anInt1107;
							}
							if (arg1 < 0) {
								local286 = 0;
							} else if (arg1 >= Static337.anInt6402) {
								local286 = Static337.anInt6402;
							}
							if (local277 < 0) {
								local277 = 0;
							} else if (Static48.anInt1107 <= local277) {
								local277 = Static48.anInt1107;
							}
							local619 = arg1 + 7;
							if (local619 < 0) {
								local619 = 0;
							} else if (local619 >= Static337.anInt6402) {
								local619 = Static337.anInt6402;
							}
							while (local277 > local260) {
								while (local286 < local619) {
									Static207.aByteArrayArrayArray10[arg2][local260][local286] = 0;
									local286++;
								}
								local260++;
							}
						}
					} else if (local551 == 1) {
						if (Static207.aByteArrayArrayArray10[arg2] == null) {
							Static207.aByteArrayArrayArray10[arg2] = new byte[Static48.anInt1107 + 1][Static337.anInt6402 + 1];
						}
						for (local260 = 0; local260 < 64; local260 += 4) {
							for (local277 = 0; local277 < 64; local277 += 4) {
								@Pc(688) byte local688 = local108.method3130();
								if (arg6 >= local223) {
									for (local619 = local260; local619 < local260 + 4; local619++) {
										for (local701 = local277; local701 < local277 + 4; local701++) {
											if (local11 <= local619 && local619 < local11 + 8 && local701 >= local17 && local17 + 8 > local17) {
												local743 = arg7 + Static216.method3971(arg4, local701 & 0x7, local619 & 0x7);
												@Pc(756) int local756 = arg1 + Static276.method4788(local701 & 0x7, arg4, local619 & 0x7);
												if (local743 >= 0 && local743 < Static48.anInt1107 && local756 >= 0 && local756 < Static337.anInt6402) {
													Static207.aByteArrayArrayArray10[arg2][local743][local756] = local688;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (!arg8) {
			@Pc(855) Class186 local855 = null;
			while (true) {
				while (local108.anInt3368 < local108.aByteArray58.length) {
					local223 = local108.method3141();
					if (local223 == 0) {
						local855 = new Class186(local108);
					} else if (local223 == 1) {
						local253 = local108.method3141();
						if (local253 > 0) {
							for (local260 = 0; local260 < local253; local260++) {
								@Pc(910) Class1_Sub31_Sub1 local910 = new Class1_Sub31_Sub1(local108);
								if (local910.anInt4707 == 31) {
									@Pc(920) Class36 local920 = Static272.method4749(local108.method3115());
									local910.method4289(local920.anInt1303, local920.anInt1305, local920.anInt1301, local920.anInt1300);
								}
								local286 = local910.anInt4687 >> 7;
								local619 = local910.anInt4693 >> 7;
								if (arg6 == local910.anInt4698 && local286 >= local11 && local11 + 8 > local286 && local619 >= local17 && local619 < local17 + 8) {
									local701 = (arg7 << 7) + Static4.method172(arg4, local910.anInt4687 & 0x3FF, local910.anInt4693 & 0x3FF);
									local743 = (arg1 << 7) + Static90.method1713(local910.anInt4687 & 0x3FF, local910.anInt4693 & 0x3FF, arg4);
									local910.anInt4693 = local743;
									local910.anInt4687 = local701;
									local619 = local910.anInt4693 >> 7;
									local286 = local910.anInt4687 >> 7;
									if (local286 >= 0 && local619 >= 0 && local286 < Static48.anInt1107 && local619 < Static337.anInt6402) {
										local910.anInt4691 = Static213.anIntArrayArrayArray10[arg6][local286][local619] - local910.anInt4691;
										if (arg0.method3312() > 0) {
											Static24.method732(local910);
										}
									}
								}
							}
						}
					} else if (local223 == 2) {
						if (local855 == null) {
							local855 = new Class186();
						}
						local855.method4878(local108);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local855 != null) {
					Static306.method5156(arg1 >> 3, local855, arg7 >> 3);
				}
				break;
			}
		}
		if (Static207.aByteArrayArrayArray10 != null && Static207.aByteArrayArrayArray10[arg2] != null) {
			local211 = arg7 + 7;
			local223 = arg1 + 7;
			for (local253 = arg7; local253 < local211; local253++) {
				for (local260 = arg1; local260 < local223; local260++) {
					Static207.aByteArrayArrayArray10[arg2][local253][local260] = 0;
				}
			}
		}
		if (local514) {
			return Static181.anIntArray443;
		} else {
			return null;
		}
	}
}
