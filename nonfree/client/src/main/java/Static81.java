import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "[S")
	public static short[] aShortArray45;

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
	public static int anInt2399 = 0;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
	public static int anInt2408 = 0;

	@OriginalMember(owner = "client!ii", name = "E", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_652 = Static158.method3034("<col=00ff80>");

	@OriginalMember(owner = "client!ii", name = "G", descriptor = "[I")
	public static final int[] anIntArray268 = new int[50];

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)Z")
	public static boolean method1904() {
		@Pc(8) long local8 = Static1.method2();
		@Pc(13) int local13 = (int) (local8 - Static161.aLong131);
		if (local13 > 200) {
			local13 = 200;
		}
		Static161.aLong131 = local8;
		Static72.anInt2165 += local13;
		if (Static135.anInt3578 == 0 && Static159.anInt4431 == 0 && Static85.anInt2515 == 0 && Static64.anInt1969 == 0) {
			return true;
		} else if (Static159.aClass66_41 == null) {
			return false;
		} else {
			try {
				if (Static72.anInt2165 > 30000) {
					throw new IOException();
				}
				@Pc(58) Class2_Sub1_Sub20 local58;
				@Pc(63) Class2_Sub3 local63;
				while (Static159.anInt4431 < 20 && Static64.anInt1969 > 0) {
					local58 = (Class2_Sub1_Sub20) Static147.aClass51_10.method2465();
					local63 = new Class2_Sub3(4);
					local63.method224(1);
					local63.method238((int) local58.aLong151);
					Static159.aClass66_41.method2838(local63.aByteArray4, 4);
					Static138.aClass51_2.method2463(local58, local58.aLong151);
					Static159.anInt4431++;
					Static64.anInt1969--;
				}
				while (Static135.anInt3578 < 20 && Static85.anInt2515 > 0) {
					local58 = (Class2_Sub1_Sub20) Static114.aClass55_1.method2526();
					local63 = new Class2_Sub3(4);
					local63.method224(0);
					local63.method238((int) local58.aLong151);
					Static159.aClass66_41.method2838(local63.aByteArray4, 4);
					local58.method3415();
					Static160.aClass51_4.method2463(local58, local58.aLong151);
					Static85.anInt2515--;
					Static135.anInt3578++;
				}
				for (@Pc(155) int local155 = 0; local155 < 100; local155++) {
					@Pc(168) int local168 = Static159.aClass66_41.method2841();
					if (local168 < 0) {
						throw new IOException();
					}
					if (local168 == 0) {
						break;
					}
					Static72.anInt2165 = 0;
					@Pc(186) byte local186 = 0;
					if (Static54.aClass2_Sub1_Sub20_1 == null) {
						local186 = 8;
					} else if (Static59.anInt1834 == 0) {
						local186 = 1;
					}
					@Pc(206) int local206;
					@Pc(211) int local211;
					@Pc(244) int local244;
					@Pc(387) int local387;
					if (local186 <= 0) {
						local206 = Static183.aClass2_Sub3_4.aByteArray4.length - Static54.aClass2_Sub1_Sub20_1.aByte7;
						local211 = 512 - Static59.anInt1834;
						if (local206 - Static183.aClass2_Sub3_4.anInt273 < local211) {
							local211 = local206 - Static183.aClass2_Sub3_4.anInt273;
						}
						if (local211 > local168) {
							local211 = local168;
						}
						Static159.aClass66_41.method2839(local211, Static183.aClass2_Sub3_4.aByteArray4, Static183.aClass2_Sub3_4.anInt273);
						if (Static172.aByte6 != 0) {
							for (local244 = 0; local244 < local211; local244++) {
								Static183.aClass2_Sub3_4.aByteArray4[local244 + Static183.aClass2_Sub3_4.anInt273] ^= Static172.aByte6;
							}
						}
						Static59.anInt1834 += local211;
						Static183.aClass2_Sub3_4.anInt273 += local211;
						if (Static183.aClass2_Sub3_4.anInt273 == local206) {
							if (Static54.aClass2_Sub1_Sub20_1.aLong151 == 16711935L) {
								Static79.aClass2_Sub3_2 = Static183.aClass2_Sub3_4;
								for (local244 = 0; local244 < 256; local244++) {
									@Pc(374) Class13_Sub1 local374 = Static151.aClass13_Sub1Array2[local244];
									if (local374 != null) {
										Static79.aClass2_Sub3_2.anInt273 = local244 * 8 + 5;
										local387 = Static79.aClass2_Sub3_2.method206();
										@Pc(391) int local391 = Static79.aClass2_Sub3_2.method206();
										local374.method543(local387, local391);
									}
								}
							} else {
								Static181.aCRC32_2.reset();
								Static181.aCRC32_2.update(Static183.aClass2_Sub3_4.aByteArray4, 0, local206);
								local244 = (int) Static181.aCRC32_2.getValue();
								if (Static54.aClass2_Sub1_Sub20_1.anInt4441 != local244) {
									try {
										Static159.aClass66_41.method2834();
									} catch (@Pc(320) Exception local320) {
									}
									Static159.aClass66_41 = null;
									Static11.anInt384++;
									Static172.aByte6 = (byte) (Math.random() * 255.0D + 1.0D);
									return false;
								}
								Static39.anInt1274 = 0;
								Static11.anInt384 = 0;
								Static54.aClass2_Sub1_Sub20_1.aClass13_Sub1_26.method548((Static54.aClass2_Sub1_Sub20_1.aLong151 & 0xFF0000L) == 16711680L, Static183.aClass2_Sub3_4.aByteArray4, Static54.aBoolean70, (int) (Static54.aClass2_Sub1_Sub20_1.aLong151 & 0xFFFFL));
							}
							Static54.aClass2_Sub1_Sub20_1.method3556();
							Static183.aClass2_Sub3_4 = null;
							Static59.anInt1834 = 0;
							Static54.aClass2_Sub1_Sub20_1 = null;
							if (Static54.aBoolean70) {
								Static159.anInt4431--;
							} else {
								Static135.anInt3578--;
							}
						} else {
							if (Static59.anInt1834 != 512) {
								break;
							}
							Static59.anInt1834 = 0;
						}
					} else {
						local206 = local186 - Static192.aClass2_Sub3_5.anInt273;
						if (local168 < local206) {
							local206 = local168;
						}
						Static159.aClass66_41.method2839(local206, Static192.aClass2_Sub3_5.aByteArray4, Static192.aClass2_Sub3_5.anInt273);
						if (Static172.aByte6 != 0) {
							for (local211 = 0; local211 < local206; local211++) {
								Static192.aClass2_Sub3_5.aByteArray4[Static192.aClass2_Sub3_5.anInt273 + local211] ^= Static172.aByte6;
							}
						}
						Static192.aClass2_Sub3_5.anInt273 += local206;
						if (local186 > Static192.aClass2_Sub3_5.anInt273) {
							break;
						}
						if (Static54.aClass2_Sub1_Sub20_1 == null) {
							Static192.aClass2_Sub3_5.anInt273 = 0;
							local211 = Static192.aClass2_Sub3_5.method218();
							local244 = Static192.aClass2_Sub3_5.method234();
							@Pc(506) int local506 = Static192.aClass2_Sub3_5.method218();
							local387 = Static192.aClass2_Sub3_5.method206();
							@Pc(517) long local517 = (long) (local244 + (local211 << 16));
							@Pc(523) Class2_Sub1_Sub20 local523 = (Class2_Sub1_Sub20) Static138.aClass51_2.method2458(local517);
							Static54.aBoolean70 = true;
							if (local523 == null) {
								local523 = (Class2_Sub1_Sub20) Static160.aClass51_4.method2458(local517);
								Static54.aBoolean70 = false;
							}
							if (local523 == null) {
								throw new IOException();
							}
							Static54.aClass2_Sub1_Sub20_1 = local523;
							@Pc(549) int local549 = local506 == 0 ? 5 : 9;
							Static183.aClass2_Sub3_4 = new Class2_Sub3(local549 + local387 + Static54.aClass2_Sub1_Sub20_1.aByte7);
							Static183.aClass2_Sub3_4.method224(local506);
							Static183.aClass2_Sub3_4.method197(local387);
							Static192.aClass2_Sub3_5.anInt273 = 0;
							Static59.anInt1834 = 8;
						} else if (Static59.anInt1834 == 0) {
							if (Static192.aClass2_Sub3_5.aByteArray4[0] == -1) {
								Static192.aClass2_Sub3_5.anInt273 = 0;
								Static59.anInt1834 = 1;
							} else {
								Static54.aClass2_Sub1_Sub20_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(601) IOException local601) {
				try {
					Static159.aClass66_41.method2834();
				} catch (@Pc(606) Exception local606) {
				}
				Static39.anInt1274++;
				Static159.aClass66_41 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIBI)I")
	public static int method1905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(8) int local8 = arg0;
			arg0 = arg4;
			arg4 = local8;
		}
		@Pc(28) int local28 = arg3 & 0x3;
		if (local28 == 0) {
			return arg1;
		} else if (local28 == 1) {
			return 1 + 7 - arg0 - arg5;
		} else if (local28 == 2) {
			return 1 + 7 - arg4 - arg1;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method1906(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg3 + arg1;
		@Pc(13) int local13 = arg5 + arg1;
		@Pc(18) int local18 = arg4 - arg1;
		@Pc(23) int local23 = arg6 - arg1;
		for (@Pc(31) int local31 = arg3; local31 < local9; local31++) {
			Static163.method3070(arg6, arg5, arg0, Static42.anIntArrayArray8[local31]);
		}
		for (@Pc(47) int local47 = arg4; local47 > local18; local47--) {
			Static163.method3070(arg6, arg5, arg0, Static42.anIntArrayArray8[local47]);
		}
		for (@Pc(63) int local63 = local9; local63 <= local18; local63++) {
			@Pc(69) int[] local69 = Static42.anIntArrayArray8[local63];
			Static163.method3070(local13, arg5, arg0, local69);
			Static163.method3070(local23, local13, arg2, local69);
			Static163.method3070(arg6, local23, arg0, local69);
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)I")
	public static int method1908(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILclient!pe;ZLclient!pe;)V")
	public static void method1909(@OriginalArg(1) Class13 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class13 arg2) {
		Static171.aBoolean165 = arg1;
		Static71.aClass13_37 = arg2;
		Static107.aClass13_22 = arg0;
	}

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V")
	public static void method1910() {
		Static178.anIntArray468 = null;
		Static16.anIntArray43 = null;
		Static197.aByteArrayArray10 = null;
		Static30.anIntArray96 = null;
		Static30.anIntArray95 = null;
		Static103.anIntArray342 = null;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(III)V")
	public static void method1911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class2_Sub1_Sub6 local9 = Static127.method2669(arg1);
		@Pc(12) int local12 = local9.anInt1016;
		@Pc(20) int local20 = local9.anInt1014;
		@Pc(23) int local23 = local9.anInt1018;
		@Pc(30) int local30 = Class2_Sub1_Sub16.anIntArray418[local23 - local20];
		if (arg0 < 0 || arg0 > local30) {
			arg0 = 0;
		}
		local30 <<= local20;
		Static163.anIntArray447[local12] = Static163.anIntArray447[local12] & ~local30 | local30 & arg0 << local20;
	}
}
