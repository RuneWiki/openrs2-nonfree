import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!il", name = "m", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_103 = new Class221(27, 3);

	@OriginalMember(owner = "client!il", name = "w", descriptor = "Lclient!nq;")
	public static final Class142 aClass142_3 = new Class142();

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
	public static void method2705() {
		@Pc(5) Class107 local5 = Static257.aClass107_35;
		synchronized (Static257.aClass107_35) {
			Static257.aClass107_35.method3015();
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!mf;III)V")
	public static void method2709(@OriginalArg(0) Class132 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static360.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt4637 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass2_Sub10_Sub1Array4[arg0.anInt4637++] = Static120.aClass2_Sub10_Sub1Array2[local21 - 1];
			local9 += 16L;
		}
		for (local21 = arg0.anInt4637; local21 < 4; local21++) {
			arg0.aClass2_Sub10_Sub1Array4[local21] = null;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
	public static void method2718() {
		if (Static176.anInt3971 == 10) {
			Static224.method5495(28);
		}
		if (Static176.anInt3971 == 30) {
			Static224.method5495(25);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BLclient!ps;)V")
	public static void method2719(@OriginalArg(1) Class2_Sub31 arg0) {
		if (arg0 == null || Static103.aClass180_24.aClass2_207 == arg0) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt5369;
		@Pc(18) int local18 = arg0.anInt5370;
		@Pc(21) int local21 = arg0.anInt5368;
		@Pc(25) int local25 = (int) arg0.aLong163;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(37) long local37 = arg0.aLong163;
		@Pc(43) int local43;
		@Pc(47) int local47;
		if (Static17.aClass2_Sub1_1 == null) {
			local47 = Static50.anInt826;
			local43 = Static64.anInt1136;
		} else {
			local43 = Static17.aClass2_Sub1_1.method49();
			local47 = Static17.aClass2_Sub1_1.method51();
		}
		if (local21 == 45) {
			Static362.anInt6987 = local47;
			Static125.anInt2668 = local43;
			Static289.anInt4725 = 2;
			Static172.anInt3886 = 0;
			Static300.method5057(Static127.aClass157_91);
			Static197.aClass2_Sub12_Sub2_2.method3102(Integer.MAX_VALUE & (int) (local37 >>> 32));
			Static197.aClass2_Sub12_Sub2_2.method3158(Static287.anInt5776 + local18);
			Static197.aClass2_Sub12_Sub2_2.method3141(Static166.aClass25_1.method398(82) ? 1 : 0);
			Static197.aClass2_Sub12_Sub2_2.method3115(local15 + Static150.anInt3453);
			Static227.method4204(local37, local15, local18);
		}
		@Pc(120) Class1_Sub2_Sub3_Sub1 local120;
		if (local21 == 11) {
			local120 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local25];
			if (local120 != null) {
				Static362.anInt6987 = local47;
				Static125.anInt2668 = local43;
				Static289.anInt4725 = 2;
				Static172.anInt3886 = 0;
				Static300.method5057(Static184.aClass157_120);
				Static197.aClass2_Sub12_Sub2_2.method3152(Static166.aClass25_1.method398(82) ? 1 : 0);
				Static197.aClass2_Sub12_Sub2_2.method3158(local25);
				Static86.method1714(local120.method5787(), local120.anIntArray535[0], 0, Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0], Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0], -2, local120.anIntArray534[0], local120.method5787(), true, 0);
			}
		}
		if (local21 == 21 && Static91.aClass68_12 == null) {
			Static342.method5580(local18, local15);
			Static91.aClass68_12 = Static50.method942(local15, local18);
			Static114.method2241(Static91.aClass68_12);
		}
		if (local21 == 1007 || local21 == 1011 || local21 == 1012 || local21 == 1008 || local21 == 1001) {
			Static171.method3371(local25, local15, local21);
		}
		@Pc(239) Class1_Sub2_Sub3_Sub2 local239;
		if (local21 == 1003) {
			Static362.anInt6987 = local47;
			Static172.anInt3886 = 0;
			Static289.anInt4725 = 2;
			Static125.anInt2668 = local43;
			local239 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local25];
			if (local239 != null) {
				@Pc(244) Class139 local244 = local239.aClass139_1;
				if (local244.anIntArray350 != null) {
					local244 = local244.method4120();
				}
				if (local244 != null) {
					Static300.method5057(Static280.aClass157_178);
					Static197.aClass2_Sub12_Sub2_2.method3158(local244.anInt4787);
				}
			}
		}
		@Pc(275) Class68 local275;
		if (local21 == 9) {
			local275 = Static50.method942(local15, local18);
			if (local275 != null) {
				Static7.method120(local275);
			}
		}
		if (local21 == 25) {
			local275 = Static50.method942(local15, local18);
			if (local275 != null) {
				Static295.method4928();
				@Pc(295) Class2_Sub43 local295 = Static46.method890(local275);
				Static225.method4187(local295.method5641(), local18, local15, local295.anInt6734, local275.anInt1843, local275.anInt1832);
				Static295.aString63 = Static227.method4208(local275);
				Static228.aString46 = local275.aString23 + "<col=ffffff>";
				if (Static295.aString63 == null) {
					Static295.aString63 = "Null";
				}
			}
			return;
		}
		if (local21 == 50) {
			local239 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local25];
			if (local239 != null) {
				Static172.anInt3886 = 0;
				Static125.anInt2668 = local43;
				Static362.anInt6987 = local47;
				Static289.anInt4725 = 2;
				Static300.method5057(Static189.aClass157_123);
				Static197.aClass2_Sub12_Sub2_2.method3158(Static292.anInt5818);
				Static197.aClass2_Sub12_Sub2_2.method3115(Static71.anInt1272);
				Static197.aClass2_Sub12_Sub2_2.method3133(Static166.aClass25_1.method398(82) ? 1 : 0);
				Static197.aClass2_Sub12_Sub2_2.method3154(Static310.anInt6128);
				Static197.aClass2_Sub12_Sub2_2.method3121(local25);
				Static86.method1714(local239.method5787(), local239.anIntArray535[0], 0, Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0], Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0], -2, local239.anIntArray534[0], local239.method5787(), true, 0);
			}
		}
		if (local21 == 1002) {
			Static125.anInt2668 = local43;
			Static362.anInt6987 = local47;
			Static289.anInt4725 = 2;
			Static172.anInt3886 = 0;
			Static300.method5057(Static47.aClass157_32);
			Static197.aClass2_Sub12_Sub2_2.method3158(local25);
		}
		if (local21 == 15) {
			local120 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local25];
			if (local120 != null) {
				Static172.anInt3886 = 0;
				Static289.anInt4725 = 2;
				Static125.anInt2668 = local43;
				Static362.anInt6987 = local47;
				Static300.method5057(Static291.aClass157_159);
				Static197.aClass2_Sub12_Sub2_2.method3147(Static166.aClass25_1.method398(82) ? 1 : 0);
				Static197.aClass2_Sub12_Sub2_2.method3102(local25);
				Static86.method1714(local120.method5787(), local120.anIntArray535[0], 0, Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0], Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0], -2, local120.anIntArray534[0], local120.method5787(), true, 0);
			}
		}
		if (local21 == 4) {
			Static289.anInt4725 = 2;
			Static125.anInt2668 = local43;
			Static362.anInt6987 = local47;
			Static172.anInt3886 = 0;
			Static300.method5057(Static148.aClass157_105);
			Static197.aClass2_Sub12_Sub2_2.method3115(Static287.anInt5776 + local18);
			Static197.aClass2_Sub12_Sub2_2.method3115(Static150.anInt3453 + local15);
			Static197.aClass2_Sub12_Sub2_2.method3121(Integer.MAX_VALUE & (int) (local37 >>> 32));
			Static197.aClass2_Sub12_Sub2_2.method3147(Static166.aClass25_1.method398(82) ? 1 : 0);
			Static227.method4204(local37, local15, local18);
		}
		if (local21 == 12) {
			Static289.anInt4725 = 2;
			Static172.anInt3886 = 0;
			Static362.anInt6987 = local47;
			Static125.anInt2668 = local43;
			Static300.method5057(Static333.aClass157_205);
			Static197.aClass2_Sub12_Sub2_2.method3102(Static150.anInt3453 + local15);
			Static197.aClass2_Sub12_Sub2_2.method3121(local25);
			Static197.aClass2_Sub12_Sub2_2.method3141(Static166.aClass25_1.method398(82) ? 1 : 0);
			Static197.aClass2_Sub12_Sub2_2.method3102(Static287.anInt5776 + local18);
			Static323.method5335(local18, local15);
		}
		if (local21 == 30) {
			local239 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local25];
			if (local239 != null) {
				Static172.anInt3886 = 0;
				Static289.anInt4725 = 2;
				Static125.anInt2668 = local43;
				Static362.anInt6987 = local47;
				Static300.method5057(Static91.aClass157_64);
				Static197.aClass2_Sub12_Sub2_2.method3121(local25);
				Static197.aClass2_Sub12_Sub2_2.method3141(Static166.aClass25_1.method398(82) ? 1 : 0);
				Static86.method1714(local239.method5787(), local239.anIntArray535[0], 0, Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0], Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0], -2, local239.anIntArray534[0], local239.method5787(), true, 0);
			}
		}
		if (local21 == 10) {
			local120 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local25];
			if (local120 != null) {
				Static289.anInt4725 = 2;
				Static172.anInt3886 = 0;
				Static362.anInt6987 = local47;
				Static125.anInt2668 = local43;
				Static300.method5057(Static157.aClass157_111);
				Static197.aClass2_Sub12_Sub2_2.method3147(Static166.aClass25_1.method398(82) ? 1 : 0);
				Static197.aClass2_Sub12_Sub2_2.method3158(local25);
				Static86.method1714(local120.method5787(), local120.anIntArray535[0], 0, Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0], Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0], -2, local120.anIntArray534[0], local120.method5787(), true, 0);
			}
		}
		if (local21 == 46) {
			Static125.anInt2668 = local43;
			Static289.anInt4725 = 2;
			Static172.anInt3886 = 0;
			Static362.anInt6987 = local47;
			Static300.method5057(Static116.aClass157_85);
			Static197.aClass2_Sub12_Sub2_2.method3158(local18 + Static287.anInt5776);
			Static197.aClass2_Sub12_Sub2_2.method3115(local25);
			Static197.aClass2_Sub12_Sub2_2.method3141(Static166.aClass25_1.method398(82) ? 1 : 0);
			Static197.aClass2_Sub12_Sub2_2.method3158(local15 + Static150.anInt3453);
			Static323.method5335(local18, local15);
		}
		if (local21 == 59) {
			if (Static291.anInt5264 > 0 && Static166.aClass25_1.method398(82) && Static166.aClass25_1.method398(81)) {
				Static357.method5710(local18 + Static287.anInt5776, Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77, local15 + Static150.anInt3453);
			} else {
				Static362.anInt6987 = local47;
				Static172.anInt3886 = 0;
				Static289.anInt4725 = 1;
				Static125.anInt2668 = local43;
				Static300.method5057(Static311.aClass157_193);
				Static197.aClass2_Sub12_Sub2_2.method3115(local18 + Static287.anInt5776);
				Static197.aClass2_Sub12_Sub2_2.method3115(local15 + Static150.anInt3453);
			}
		}
		if (local21 == 1009) {
			Static172.anInt3886 = 0;
			Static125.anInt2668 = local43;
			Static362.anInt6987 = local47;
			Static289.anInt4725 = 2;
			Static300.method5057(Static120.aClass157_5);
			Static197.aClass2_Sub12_Sub2_2.method3158(local25);
		}
		if (local21 == 19) {
			local120 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local25];
			if (local120 != null) {
				Static289.anInt4725 = 2;
				Static362.anInt6987 = local47;
				Static125.anInt2668 = local43;
				Static172.anInt3886 = 0;
				Static300.method5057(Static78.aClass157_50);
				Static197.aClass2_Sub12_Sub2_2.method3147(Static166.aClass25_1.method398(82) ? 1 : 0);
				Static197.aClass2_Sub12_Sub2_2.method3162(Static310.anInt6128);
				Static197.aClass2_Sub12_Sub2_2.method3158(local25);
				Static197.aClass2_Sub12_Sub2_2.method3102(Static292.anInt5818);
				Static197.aClass2_Sub12_Sub2_2.method3115(Static71.anInt1272);
				Static86.method1714(local120.method5787(), local120.anIntArray535[0], 0, Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0], Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0], -2, local120.anIntArray534[0], local120.method5787(), true, 0);
			}
		}
		if (local21 == 20) {
			if (Static291.anInt5264 > 0 && Static166.aClass25_1.method398(82) && Static166.aClass25_1.method398(81)) {
				Static357.method5710(local18 + Static287.anInt5776, Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77, local15 + Static150.anInt3453);
			} else {
				Static121.method2360(local25, local15, local18);
				if (local25 == 1) {
					Static197.aClass2_Sub12_Sub2_2.method3147(-1);
					Static197.aClass2_Sub12_Sub2_2.method3147(-1);
					Static197.aClass2_Sub12_Sub2_2.method3158((int) Static366.aFloat48);
					Static197.aClass2_Sub12_Sub2_2.method3147(57);
					Static197.aClass2_Sub12_Sub2_2.method3147(Static85.anInt1601);
					Static197.aClass2_Sub12_Sub2_2.method3147(Static267.anInt5561);
					Static197.aClass2_Sub12_Sub2_2.method3147(89);
					Static197.aClass2_Sub12_Sub2_2.method3158(Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893);
					Static197.aClass2_Sub12_Sub2_2.method3158(Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888);
					Static197.aClass2_Sub12_Sub2_2.method3147(63);
				} else {
					Static125.anInt2668 = local43;
					Static172.anInt3886 = 0;
					Static362.anInt6987 = local47;
					Static289.anInt4725 = 1;
				}
				Static86.method1714(1, local15, 0, Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0], Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0], -4, local18, 1, true, 0);
			}
		}
		if (local21 == 8) {
			local239 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local25];
			if (local239 != null) {
				Static125.anInt2668 = local43;
				Static362.anInt6987 = local47;
				Static172.anInt3886 = 0;
				Static289.anInt4725 = 2;
				Static300.method5057(Static134.aClass157_97);
				Static197.aClass2_Sub12_Sub2_2.method3147(Static166.aClass25_1.method398(82) ? 1 : 0);
				Static197.aClass2_Sub12_Sub2_2.method3115(local25);
				Static86.method1714(local239.method5787(), local239.anIntArray535[0], 0, Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0], Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0], -2, local239.anIntArray534[0], local239.method5787(), true, 0);
			}
		}
		if (local21 == 51) {
			Static125.anInt2668 = local43;
			Static172.anInt3886 = 0;
			Static362.anInt6987 = local47;
			Static289.anInt4725 = 2;
			Static300.method5057(Static82.aClass157_57);
			Static197.aClass2_Sub12_Sub2_2.method3115(Static292.anInt5818);
			Static197.aClass2_Sub12_Sub2_2.method3158(local25);
			Static197.aClass2_Sub12_Sub2_2.method3102(Static150.anInt3453 + local15);
			Static197.aClass2_Sub12_Sub2_2.method3115(local18 + Static287.anInt5776);
			Static197.aClass2_Sub12_Sub2_2.method3147(Static166.aClass25_1.method398(82) ? 1 : 0);
			Static197.aClass2_Sub12_Sub2_2.method3121(Static71.anInt1272);
			Static197.aClass2_Sub12_Sub2_2.method3125(Static310.anInt6128);
			Static323.method5335(local18, local15);
		}
		if (local21 == 3) {
			Static289.anInt4725 = 2;
			Static362.anInt6987 = local47;
			Static172.anInt3886 = 0;
			Static125.anInt2668 = local43;
			Static300.method5057(Static248.aClass157_156);
			Static197.aClass2_Sub12_Sub2_2.method3115(Static287.anInt5776 + local18);
			Static197.aClass2_Sub12_Sub2_2.method3102((int) (local37 >>> 32) & Integer.MAX_VALUE);
			Static197.aClass2_Sub12_Sub2_2.method3147(Static166.aClass25_1.method398(82) ? 1 : 0);
			Static197.aClass2_Sub12_Sub2_2.method3115(Static150.anInt3453 + local15);
			Static227.method4204(local37, local15, local18);
		}
		if (local21 == 60 || local21 == 1006) {
			Static338.method5525(arg0.aString51, local15, local25, local18);
		}
		if (local21 == 5) {
			local120 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local25];
			if (local120 != null) {
				Static125.anInt2668 = local43;
				Static289.anInt4725 = 2;
				Static362.anInt6987 = local47;
				Static172.anInt3886 = 0;
				Static300.method5057(Static276.aClass157_177);
				Static197.aClass2_Sub12_Sub2_2.method3141(Static166.aClass25_1.method398(82) ? 1 : 0);
				Static197.aClass2_Sub12_Sub2_2.method3158(local25);
				Static86.method1714(local120.method5787(), local120.anIntArray535[0], 0, Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0], Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0], -2, local120.anIntArray534[0], local120.method5787(), true, 0);
			}
		}
		if (local21 == 44) {
			Static125.anInt2668 = local43;
			Static289.anInt4725 = 2;
			Static172.anInt3886 = 0;
			Static362.anInt6987 = local47;
			Static300.method5057(Static331.aClass157_202);
			Static197.aClass2_Sub12_Sub2_2.method3121(local15 + Static150.anInt3453);
			Static197.aClass2_Sub12_Sub2_2.method3158(local18 + Static287.anInt5776);
			Static197.aClass2_Sub12_Sub2_2.method3158(local25);
			Static197.aClass2_Sub12_Sub2_2.method3152(Static166.aClass25_1.method398(82) ? 1 : 0);
			Static323.method5335(local18, local15);
		}
		if (local21 == 18) {
			local120 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local25];
			if (local120 != null) {
				Static172.anInt3886 = 0;
				Static289.anInt4725 = 2;
				Static362.anInt6987 = local47;
				Static125.anInt2668 = local43;
				Static300.method5057(Static207.aClass157_133);
				Static197.aClass2_Sub12_Sub2_2.method3158(local25);
				Static197.aClass2_Sub12_Sub2_2.method3152(Static166.aClass25_1.method398(82) ? 1 : 0);
				Static86.method1714(local120.method5787(), local120.anIntArray535[0], 0, Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0], Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0], -2, local120.anIntArray534[0], local120.method5787(), true, 0);
			}
		}
		if (local21 == 17) {
			Static289.anInt4725 = 1;
			Static362.anInt6987 = local47;
			Static125.anInt2668 = local43;
			Static172.anInt3886 = 0;
			Static300.method5057(Static73.aClass157_46);
			Static197.aClass2_Sub12_Sub2_2.method3158(local15 + Static150.anInt3453);
			Static197.aClass2_Sub12_Sub2_2.method3115(Static292.anInt5818);
			Static197.aClass2_Sub12_Sub2_2.method3154(Static310.anInt6128);
			Static197.aClass2_Sub12_Sub2_2.method3121(Static287.anInt5776 + local18);
			Static197.aClass2_Sub12_Sub2_2.method3121(Static71.anInt1272);
			Static86.method1714(1, local15, 0, Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0], Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0], -4, local18, 1, true, 0);
		}
		if (local21 == 49) {
			local120 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local25];
			if (local120 != null) {
				Static172.anInt3886 = 0;
				Static289.anInt4725 = 2;
				Static362.anInt6987 = local47;
				Static125.anInt2668 = local43;
				Static300.method5057(Static255.aClass157_160);
				Static197.aClass2_Sub12_Sub2_2.method3121(local25);
				Static197.aClass2_Sub12_Sub2_2.method3147(Static166.aClass25_1.method398(82) ? 1 : 0);
				Static86.method1714(local120.method5787(), local120.anIntArray535[0], 0, Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0], Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0], -2, local120.anIntArray534[0], local120.method5787(), true, 0);
			}
		}
		if (local21 == 2) {
			Static362.anInt6987 = local47;
			Static125.anInt2668 = local43;
			Static289.anInt4725 = 2;
			Static172.anInt3886 = 0;
			Static300.method5057(Static317.aClass157_196);
			Static197.aClass2_Sub12_Sub2_2.method3102(Integer.MAX_VALUE & (int) (local37 >>> 32));
			Static197.aClass2_Sub12_Sub2_2.method3102(Static150.anInt3453 + local15);
			Static197.aClass2_Sub12_Sub2_2.method3121(Static71.anInt1272);
			Static197.aClass2_Sub12_Sub2_2.method3152(Static166.aClass25_1.method398(82) ? 1 : 0);
			Static197.aClass2_Sub12_Sub2_2.method3138(Static310.anInt6128);
			Static197.aClass2_Sub12_Sub2_2.method3121(Static292.anInt5818);
			Static197.aClass2_Sub12_Sub2_2.method3121(Static287.anInt5776 + local18);
			Static227.method4204(local37, local15, local18);
		}
		if (local21 == 47) {
			local239 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local25];
			if (local239 != null) {
				Static125.anInt2668 = local43;
				Static362.anInt6987 = local47;
				Static289.anInt4725 = 2;
				Static172.anInt3886 = 0;
				Static300.method5057(Static78.aClass157_51);
				Static197.aClass2_Sub12_Sub2_2.method3115(local25);
				Static197.aClass2_Sub12_Sub2_2.method3133(Static166.aClass25_1.method398(82) ? 1 : 0);
				Static86.method1714(local239.method5787(), local239.anIntArray535[0], 0, Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0], Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0], -2, local239.anIntArray534[0], local239.method5787(), true, 0);
			}
		}
		if (local21 == 1010) {
			Static362.anInt6987 = local47;
			Static125.anInt2668 = local43;
			Static172.anInt3886 = 0;
			Static289.anInt4725 = 2;
			Static300.method5057(Static79.aClass157_53);
			Static197.aClass2_Sub12_Sub2_2.method3121(local18 + Static287.anInt5776);
			Static197.aClass2_Sub12_Sub2_2.method3158(local15 + Static150.anInt3453);
			Static197.aClass2_Sub12_Sub2_2.method3158(Integer.MAX_VALUE & (int) (local37 >>> 32));
			Static197.aClass2_Sub12_Sub2_2.method3147(Static166.aClass25_1.method398(82) ? 1 : 0);
			Static227.method4204(local37, local15, local18);
		}
		if (local21 == 22) {
			Static362.anInt6987 = local47;
			Static289.anInt4725 = 2;
			Static125.anInt2668 = local43;
			Static172.anInt3886 = 0;
			Static300.method5057(Static67.aClass157_127);
			Static197.aClass2_Sub12_Sub2_2.method3121(Static287.anInt5776 + local18);
			Static197.aClass2_Sub12_Sub2_2.method3121(local15 + Static150.anInt3453);
			Static197.aClass2_Sub12_Sub2_2.method3158(local25);
			Static197.aClass2_Sub12_Sub2_2.method3133(Static166.aClass25_1.method398(82) ? 1 : 0);
			Static323.method5335(local18, local15);
		}
		if (local21 == 48) {
			Static125.anInt2668 = local43;
			Static362.anInt6987 = local47;
			Static172.anInt3886 = 0;
			Static289.anInt4725 = 2;
			Static300.method5057(Static294.aClass157_185);
			Static197.aClass2_Sub12_Sub2_2.method3121(Static150.anInt3453 + local15);
			Static197.aClass2_Sub12_Sub2_2.method3141(Static166.aClass25_1.method398(82) ? 1 : 0);
			Static197.aClass2_Sub12_Sub2_2.method3121(local18 + Static287.anInt5776);
			Static197.aClass2_Sub12_Sub2_2.method3158((int) (local37 >>> 32) & Integer.MAX_VALUE);
			Static227.method4204(local37, local15, local18);
		}
		if (local21 == 6) {
			local239 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local25];
			if (local239 != null) {
				Static289.anInt4725 = 2;
				Static125.anInt2668 = local43;
				Static362.anInt6987 = local47;
				Static172.anInt3886 = 0;
				Static300.method5057(Static326.aClass157_200);
				Static197.aClass2_Sub12_Sub2_2.method3133(Static166.aClass25_1.method398(82) ? 1 : 0);
				Static197.aClass2_Sub12_Sub2_2.method3121(local25);
				Static86.method1714(local239.method5787(), local239.anIntArray535[0], 0, Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0], Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0], -2, local239.anIntArray534[0], local239.method5787(), true, 0);
			}
		}
		if (local21 == 23) {
			Static172.anInt3886 = 0;
			Static125.anInt2668 = local43;
			Static289.anInt4725 = 2;
			Static362.anInt6987 = local47;
			Static300.method5057(Static83.aClass157_58);
			Static197.aClass2_Sub12_Sub2_2.method3147(Static166.aClass25_1.method398(82) ? 1 : 0);
			Static197.aClass2_Sub12_Sub2_2.method3121(local25);
			Static197.aClass2_Sub12_Sub2_2.method3121(Static150.anInt3453 + local15);
			Static197.aClass2_Sub12_Sub2_2.method3121(local18 + Static287.anInt5776);
			Static323.method5335(local18, local15);
		}
		if (local21 == 58) {
			local120 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local25];
			if (local120 != null) {
				Static362.anInt6987 = local47;
				Static172.anInt3886 = 0;
				Static125.anInt2668 = local43;
				Static289.anInt4725 = 2;
				Static300.method5057(Static229.aClass157_150);
				Static197.aClass2_Sub12_Sub2_2.method3133(Static166.aClass25_1.method398(82) ? 1 : 0);
				Static197.aClass2_Sub12_Sub2_2.method3115(local25);
				Static86.method1714(local120.method5787(), local120.anIntArray535[0], 0, Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0], Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0], -2, local120.anIntArray534[0], local120.method5787(), true, 0);
			}
		}
		if (local21 == 13) {
			local239 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local25];
			if (local239 != null) {
				Static172.anInt3886 = 0;
				Static362.anInt6987 = local47;
				Static125.anInt2668 = local43;
				Static289.anInt4725 = 2;
				Static300.method5057(Static112.aClass157_82);
				Static197.aClass2_Sub12_Sub2_2.method3152(Static166.aClass25_1.method398(82) ? 1 : 0);
				Static197.aClass2_Sub12_Sub2_2.method3115(local25);
				Static86.method1714(local239.method5787(), local239.anIntArray535[0], 0, Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0], Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0], -2, local239.anIntArray534[0], local239.method5787(), true, 0);
			}
		}
		if (local21 == 57) {
			local120 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local25];
			if (local120 != null) {
				Static289.anInt4725 = 2;
				Static362.anInt6987 = local47;
				Static125.anInt2668 = local43;
				Static172.anInt3886 = 0;
				Static300.method5057(Static13.aClass157_13);
				Static197.aClass2_Sub12_Sub2_2.method3147(Static166.aClass25_1.method398(82) ? 1 : 0);
				Static197.aClass2_Sub12_Sub2_2.method3115(local25);
				Static86.method1714(local120.method5787(), local120.anIntArray535[0], 0, Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0], Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0], -2, local120.anIntArray534[0], local120.method5787(), true, 0);
			}
		}
		if (Static60.aBoolean109) {
			Static295.method4928();
		}
		if (Static36.aClass68_2 != null && Static7.anInt144 == 0) {
			Static114.method2241(Static36.aClass68_2);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IZ)Z")
	public static boolean method2722(@OriginalArg(1) boolean arg0) {
		@Pc(11) boolean local11 = Static51.aClass37_1.method3719();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static51.aClass37_1.method3644();
		} else if (!Static51.aClass37_1.method3749()) {
			arg0 = false;
		}
		if (arg0 == local11) {
			return false;
		} else {
			Static363.aBoolean618 = arg0;
			Static167.method3337(Static62.aClass179_2);
			return true;
		}
	}
}
