import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!ta", name = "R", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!ta", name = "ib", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1049 = Static181.method2795("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!ta", name = "jb", descriptor = "[I")
	public static final int[] anIntArray365 = new int[128];

	@OriginalMember(owner = "client!ta", name = "kb", descriptor = "Lclient!dc;")
	public static Class19 aClass19_17 = new Class19();

	@OriginalMember(owner = "client!ta", name = "lb", descriptor = "I")
	public static int anInt3674 = 0;

	@OriginalMember(owner = "client!ta", name = "nb", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1051 = Static181.method2795("Starting 3d library");

	@OriginalMember(owner = "client!ta", name = "mb", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1050 = aClass83_1051;

	@OriginalMember(owner = "client!ta", name = "ob", descriptor = "I")
	public static int anInt3675 = 0;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIBII)V")
	public static void method2783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class2_Sub26 local6 = (Class2_Sub26) Static190.aClass19_20.method691(); local6 != null; local6 = (Class2_Sub26) Static190.aClass19_20.method686()) {
			if (local6.anInt4024 != -1 || local6.anIntArray400 != null) {
				@Pc(17) int local17 = 0;
				if (arg2 > local6.anInt4015) {
					local17 = arg2 - local6.anInt4015;
				} else if (local6.anInt4020 > arg2) {
					local17 = local6.anInt4020 - arg2;
				}
				if (arg3 > local6.anInt4019) {
					local17 += arg3 - local6.anInt4019;
				} else if (arg3 < local6.anInt4017) {
					local17 += local6.anInt4017 - arg3;
				}
				if (local6.anInt4022 < local17 - 64 || Static89.anInt4291 == 0 || local6.anInt4013 != arg0) {
					if (local6.aClass2_Sub9_Sub2_3 != null) {
						Static34.aClass2_Sub9_Sub4_1.method2480(local6.aClass2_Sub9_Sub2_3);
						local6.aClass2_Sub9_Sub2_3 = null;
					}
					if (local6.aClass2_Sub9_Sub2_2 != null) {
						Static34.aClass2_Sub9_Sub4_1.method2480(local6.aClass2_Sub9_Sub2_2);
						local6.aClass2_Sub9_Sub2_2 = null;
					}
				} else {
					local17 -= 64;
					if (local17 < 0) {
						local17 = 0;
					}
					@Pc(125) int local125 = (local6.anInt4022 - local17) * Static89.anInt4291 / local6.anInt4022;
					if (local6.aClass2_Sub9_Sub2_3 != null) {
						local6.aClass2_Sub9_Sub2_3.method1320(local125);
					} else if (local6.anInt4024 >= 0) {
						@Pc(146) Class90 local146 = Static224.method2701(Static137.aClass28_Sub1_21, local6.anInt4024, 0);
						if (local146 != null) {
							@Pc(153) Class2_Sub6_Sub1 local153 = local146.method2699().method451(Static15.aClass88_1);
							@Pc(158) Class2_Sub9_Sub2 local158 = Static219.method1329(local153, local125);
							local158.method1344(-1);
							Static34.aClass2_Sub9_Sub4_1.method2476(local158);
							local6.aClass2_Sub9_Sub2_3 = local158;
						}
					}
					if (local6.aClass2_Sub9_Sub2_2 != null) {
						local6.aClass2_Sub9_Sub2_2.method1320(local125);
						if (!local6.aClass2_Sub9_Sub2_2.method3251()) {
							local6.aClass2_Sub9_Sub2_2 = null;
						}
					} else if (local6.anIntArray400 != null && (local6.anInt4023 -= arg1) <= 0) {
						@Pc(203) int local203 = (int) ((double) local6.anIntArray400.length * Math.random());
						@Pc(211) Class90 local211 = Static224.method2701(Static137.aClass28_Sub1_21, local6.anIntArray400[local203], 0);
						if (local211 != null) {
							@Pc(218) Class2_Sub6_Sub1 local218 = local211.method2699().method451(Static15.aClass88_1);
							@Pc(223) Class2_Sub9_Sub2 local223 = Static219.method1329(local218, local125);
							local223.method1344(0);
							Static34.aClass2_Sub9_Sub4_1.method2476(local223);
							local6.anInt4023 = local6.anInt4012 + (int) (Math.random() * (double) (local6.anInt4018 - local6.anInt4012));
							local6.aClass2_Sub9_Sub2_2 = local223;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!b;[BI)V")
	public static void method2785(@OriginalArg(0) int arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(3) Class2_Sub17 local3 = new Class2_Sub17();
		local3.anInt2536 = 0;
		local3.aLong149 = arg0;
		local3.aByteArray24 = arg2;
		local3.aClass8_3 = arg1;
		@Pc(30) Class19 local30 = Static96.aClass19_11;
		synchronized (Static96.aClass19_11) {
			Static96.aClass19_11.method684(local3);
		}
		Static3.method65();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILclient!md;II)V")
	public static void method2786(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub2_Sub20 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class2_Sub26 local7 = new Class2_Sub26();
		local7.anIntArray400 = arg2.anIntArray262;
		local7.anInt4024 = arg2.anInt2691;
		@Pc(26) int local26 = arg2.anInt2670;
		local7.anInt4017 = arg0 * 128;
		local7.anInt4012 = arg2.anInt2677;
		local7.anInt4018 = arg2.anInt2662;
		local7.anInt4020 = arg3 * 128;
		local7.anInt4013 = arg4;
		local7.anInt4022 = arg2.anInt2684 * 128;
		@Pc(56) int local56 = arg2.anInt2665;
		if (arg1 == 1 || arg1 == 3) {
			local26 = arg2.anInt2665;
			local56 = arg2.anInt2670;
		}
		local7.anInt4015 = (arg3 + local26) * 128;
		local7.anInt4019 = (arg0 + local56) * 128;
		if (arg2.anIntArray264 != null) {
			local7.aClass2_Sub2_Sub20_1 = arg2;
			local7.method3082();
		}
		Static190.aClass19_20.method684(local7);
		if (local7.anIntArray400 != null) {
			local7.anInt4023 = local7.anInt4012 + (int) ((double) (local7.anInt4018 - local7.anInt4012) * Math.random());
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!ae;)Lclient!ae;")
	public static Class5 method2790(@OriginalArg(1) Class5 arg0) {
		@Pc(12) Class5 local12 = Static87.method1519(arg0);
		if (local12 == null) {
			local12 = arg0.aClass5_1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(B)Z")
	public static boolean method2791() {
		@Pc(8) long local8 = Static68.method1276();
		@Pc(14) int local14 = (int) (local8 - Static166.aLong118);
		Static166.aLong118 = local8;
		if (local14 > 200) {
			local14 = 200;
		}
		Static177.anInt3617 += local14;
		if (Static78.anInt1772 == 0 && Static68.anInt1623 == 0 && Static167.anInt3454 == 0 && Static41.anInt1039 == 0) {
			return true;
		} else if (Static74.aClass25_4 == null) {
			return false;
		} else {
			try {
				if (Static177.anInt3617 > 30000) {
					throw new IOException();
				}
				@Pc(64) Class2_Sub2_Sub15 local64;
				@Pc(69) Class2_Sub3 local69;
				while (Static68.anInt1623 < 20 && Static41.anInt1039 > 0) {
					local64 = (Class2_Sub2_Sub15) Static90.aClass63_8.method2114();
					local69 = new Class2_Sub3(4);
					local69.method247(1);
					local69.method231((int) local64.aLong149);
					Static74.aClass25_4.method800(local69.aByteArray2, 4);
					Static170.aClass63_14.method2115(local64.aLong149, local64);
					Static41.anInt1039--;
					Static68.anInt1623++;
				}
				while (Static78.anInt1772 < 20 && Static167.anInt3454 > 0) {
					local64 = (Class2_Sub2_Sub15) Static50.aClass71_1.method2233();
					local69 = new Class2_Sub3(4);
					local69.method247(0);
					local69.method231((int) local64.aLong149);
					Static74.aClass25_4.method800(local69.aByteArray2, 4);
					local64.method3026();
					Static96.aClass63_9.method2115(local64.aLong149, local64);
					Static78.anInt1772++;
					Static167.anInt3454--;
				}
				for (@Pc(163) int local163 = 0; local163 < 100; local163++) {
					@Pc(169) int local169 = Static74.aClass25_4.method798();
					if (local169 < 0) {
						throw new IOException();
					}
					if (local169 == 0) {
						break;
					}
					Static177.anInt3617 = 0;
					@Pc(184) byte local184 = 0;
					if (Static63.aClass2_Sub2_Sub15_3 == null) {
						local184 = 8;
					} else if (Static206.anInt4066 == 0) {
						local184 = 1;
					}
					@Pc(205) int local205;
					@Pc(225) int local225;
					@Pc(271) int local271;
					@Pc(287) int local287;
					if (local184 > 0) {
						local205 = local184 - Static125.aClass2_Sub3_1.anInt340;
						if (local169 < local205) {
							local205 = local169;
						}
						Static74.aClass25_4.method804(Static125.aClass2_Sub3_1.aByteArray2, Static125.aClass2_Sub3_1.anInt340, local205);
						if (Static78.aByte6 != 0) {
							for (local225 = 0; local225 < local205; local225++) {
								Static125.aClass2_Sub3_1.aByteArray2[local225 + Static125.aClass2_Sub3_1.anInt340] ^= Static78.aByte6;
							}
						}
						Static125.aClass2_Sub3_1.anInt340 += local205;
						if (Static125.aClass2_Sub3_1.anInt340 < local184) {
							break;
						}
						if (Static63.aClass2_Sub2_Sub15_3 == null) {
							Static125.aClass2_Sub3_1.anInt340 = 0;
							local225 = Static125.aClass2_Sub3_1.method260();
							local271 = Static125.aClass2_Sub3_1.method269();
							@Pc(275) int local275 = Static125.aClass2_Sub3_1.method260();
							@Pc(283) long local283 = (long) ((local225 << 16) + local271);
							local287 = Static125.aClass2_Sub3_1.method248();
							@Pc(293) Class2_Sub2_Sub15 local293 = (Class2_Sub2_Sub15) Static170.aClass63_14.method2110(local283);
							Static209.aBoolean191 = true;
							if (local293 == null) {
								local293 = (Class2_Sub2_Sub15) Static96.aClass63_9.method2110(local283);
								Static209.aBoolean191 = false;
							}
							if (local293 == null) {
								throw new IOException();
							}
							Static63.aClass2_Sub2_Sub15_3 = local293;
							@Pc(319) int local319 = local275 == 0 ? 5 : 9;
							Static168.aClass2_Sub3_3 = new Class2_Sub3(local287 + local319 + Static63.aClass2_Sub2_Sub15_3.aByte7);
							Static168.aClass2_Sub3_3.method247(local275);
							Static168.aClass2_Sub3_3.method246(local287);
							Static206.anInt4066 = 8;
							Static125.aClass2_Sub3_1.anInt340 = 0;
						} else if (Static206.anInt4066 == 0) {
							if (Static125.aClass2_Sub3_1.aByteArray2[0] == -1) {
								Static125.aClass2_Sub3_1.anInt340 = 0;
								Static206.anInt4066 = 1;
							} else {
								Static63.aClass2_Sub2_Sub15_3 = null;
							}
						}
					} else {
						local205 = Static168.aClass2_Sub3_3.aByteArray2.length - Static63.aClass2_Sub2_Sub15_3.aByte7;
						local225 = 512 - Static206.anInt4066;
						if (local205 - Static168.aClass2_Sub3_3.anInt340 < local225) {
							local225 = local205 - Static168.aClass2_Sub3_3.anInt340;
						}
						if (local169 < local225) {
							local225 = local169;
						}
						Static74.aClass25_4.method804(Static168.aClass2_Sub3_3.aByteArray2, Static168.aClass2_Sub3_3.anInt340, local225);
						if (Static78.aByte6 != 0) {
							for (local271 = 0; local271 < local225; local271++) {
								Static168.aClass2_Sub3_3.aByteArray2[local271 + Static168.aClass2_Sub3_3.anInt340] ^= Static78.aByte6;
							}
						}
						Static168.aClass2_Sub3_3.anInt340 += local225;
						Static206.anInt4066 += local225;
						if (local205 == Static168.aClass2_Sub3_3.anInt340) {
							if (Static63.aClass2_Sub2_Sub15_3.aLong149 == 16711935L) {
								Static142.aClass2_Sub3_2 = Static168.aClass2_Sub3_3;
								for (local271 = 0; local271 < 256; local271++) {
									@Pc(538) Class28_Sub1 local538 = Static8.aClass28_Sub1Array1[local271];
									if (local538 != null) {
										Static142.aClass2_Sub3_2.anInt340 = local271 * 8 + 5;
										local287 = Static142.aClass2_Sub3_2.method248();
										@Pc(555) int local555 = Static142.aClass2_Sub3_2.method248();
										local538.method878(local287, local555);
									}
								}
							} else {
								Static164.aCRC32_2.reset();
								Static164.aCRC32_2.update(Static168.aClass2_Sub3_3.aByteArray2, 0, local205);
								local271 = (int) Static164.aCRC32_2.getValue();
								if (local271 != Static63.aClass2_Sub2_Sub15_3.anInt2319) {
									try {
										Static74.aClass25_4.method796();
									} catch (@Pc(484) Exception local484) {
									}
									Static44.anInt1171++;
									Static78.aByte6 = (byte) (Math.random() * 255.0D + 1.0D);
									Static74.aClass25_4 = null;
									return false;
								}
								Static44.anInt1171 = 0;
								Static167.anInt3455 = 0;
								Static63.aClass2_Sub2_Sub15_3.aClass28_Sub1_15.method880((Static63.aClass2_Sub2_Sub15_3.aLong149 & 0xFF0000L) == 16711680L, Static168.aClass2_Sub3_3.aByteArray2, (int) (Static63.aClass2_Sub2_Sub15_3.aLong149 & 0xFFFFL), Static209.aBoolean191);
							}
							Static63.aClass2_Sub2_Sub15_3.method3254();
							Static168.aClass2_Sub3_3 = null;
							if (Static209.aBoolean191) {
								Static68.anInt1623--;
							} else {
								Static78.anInt1772--;
							}
							Static206.anInt4066 = 0;
							Static63.aClass2_Sub2_Sub15_3 = null;
						} else {
							if (Static206.anInt4066 != 512) {
								break;
							}
							Static206.anInt4066 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(592) IOException local592) {
				try {
					Static74.aClass25_4.method796();
				} catch (@Pc(597) Exception local597) {
				}
				Static74.aClass25_4 = null;
				Static167.anInt3455++;
				return false;
			}
		}
	}
}
