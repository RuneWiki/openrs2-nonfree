import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
	public static int anInt4507;

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
	public static int anInt4505 = 0;

	@OriginalMember(owner = "client!ve", name = "D", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_158 = new Class184(14, 1);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIB)I")
	public static int method3673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([BI)[B")
	public static byte[] method3676(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local6];
		Static464.method5797(arg0, 0, local14, 0, local6);
		return local14;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!sj;II)V")
	public static void method3680(@OriginalArg(1) Class3_Sub38 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || arg0 == Static374.aClass229_41.aClass3_233) {
			return;
		}
		@Pc(13) int local13 = arg0.anInt6525;
		@Pc(16) int local16 = arg0.anInt6531;
		@Pc(19) int local19 = arg0.anInt6532;
		@Pc(23) int local23 = (int) arg0.aLong192;
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		@Pc(32) long local32 = arg0.aLong192;
		if (local19 == 2) {
			Static189.anInt3802 = 0;
			Static323.anInt5893 = arg1;
			Static338.anInt1381 = 2;
			Static98.anInt2228 = arg2;
			Static414.method5552(Static326.aClass92_197);
			Static302.aClass3_Sub2_Sub2_2.method5996(Static108.anInt3458 + local13);
			Static302.aClass3_Sub2_Sub2_2.method6034(Static19.aClass16_1.method580(82) ? 1 : 0);
			Static302.aClass3_Sub2_Sub2_2.method6045((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static302.aClass3_Sub2_Sub2_2.method6002(Static339.anInt6223 + local16);
			Static270.method5070(local13, local16, local32);
		}
		if (local19 == 57) {
			Static98.anInt2228 = arg2;
			Static323.anInt5893 = arg1;
			Static189.anInt3802 = 0;
			Static338.anInt1381 = 2;
			Static414.method5552(Static235.aClass92_147);
			Static302.aClass3_Sub2_Sub2_2.method5996(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static302.aClass3_Sub2_Sub2_2.method5996(local13 + Static108.anInt3458);
			Static302.aClass3_Sub2_Sub2_2.method6030(Static19.aClass16_1.method580(82) ? 1 : 0);
			Static302.aClass3_Sub2_Sub2_2.method6002(local16 + Static339.anInt6223);
			Static270.method5070(local13, local16, local32);
		}
		if (local19 == 1007) {
			Static189.anInt3802 = 0;
			Static338.anInt1381 = 2;
			Static98.anInt2228 = arg2;
			Static323.anInt5893 = arg1;
			Static414.method5552(Static306.aClass92_185);
			Static302.aClass3_Sub2_Sub2_2.method5996(Static339.anInt6223 + local16);
			Static302.aClass3_Sub2_Sub2_2.method6042(Static108.anInt3458 + local13);
			Static302.aClass3_Sub2_Sub2_2.method6030(Static19.aClass16_1.method580(82) ? 1 : 0);
			Static302.aClass3_Sub2_Sub2_2.method6002((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static270.method5070(local13, local16, local32);
		}
		if (local19 == 13) {
			Static338.anInt1381 = 2;
			Static323.anInt5893 = arg1;
			Static98.anInt2228 = arg2;
			Static189.anInt3802 = 0;
			Static414.method5552(Static293.aClass92_108);
			Static302.aClass3_Sub2_Sub2_2.method6002(Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6066);
			Static302.aClass3_Sub2_Sub2_2.method6045(Static455.anInt5935);
			Static302.aClass3_Sub2_Sub2_2.method5995(Static19.aClass16_1.method580(82) ? 1 : 0);
			Static302.aClass3_Sub2_Sub2_2.method6008(Static295.anInt5382);
			Static302.aClass3_Sub2_Sub2_2.method5996(Static207.anInt4138);
		}
		@Pc(268) Class68 local268;
		if (local19 == 45) {
			local268 = Static347.method4975(local16, local13);
			if (local268 != null) {
				Static31.method766();
				@Pc(275) Class3_Sub26 local275 = Static56.method1160(local268);
				Static169.method2916(local275.method3487(), local275.anInt4280, local268);
				Static276.aString52 = Static267.method4013(local268);
				Static128.aString25 = local268.aString21 + "<col=ffffff>";
				if (Static276.aString52 == null) {
					Static276.aString52 = "Null";
				}
			}
			return;
		}
		if (local19 == 1011 || local19 == 1006 || local19 == 1010 || local19 == 1003 || local19 == 1002) {
			Static420.method5628(local23, local13, local19);
		}
		if (local19 == 21) {
			if (Static199.anInt3933 > 0 && Static19.aClass16_1.method580(82) && Static19.aClass16_1.method580(81)) {
				Static128.method2229(Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77, local16 + Static339.anInt6223, Static108.anInt3458 + local13);
			} else {
				Static224.method3526(local16, local13, local23);
				if (local23 == 1) {
					Static302.aClass3_Sub2_Sub2_2.method6001(-1);
					Static302.aClass3_Sub2_Sub2_2.method6001(-1);
					Static302.aClass3_Sub2_Sub2_2.method6045((int) Static235.aFloat60);
					Static302.aClass3_Sub2_Sub2_2.method6001(57);
					Static302.aClass3_Sub2_Sub2_2.method6001(Static397.anInt6876);
					Static302.aClass3_Sub2_Sub2_2.method6001(Static317.anInt5759);
					Static302.aClass3_Sub2_Sub2_2.method6001(89);
					Static302.aClass3_Sub2_Sub2_2.method6045(Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053);
					Static302.aClass3_Sub2_Sub2_2.method6045(Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055);
					Static302.aClass3_Sub2_Sub2_2.method6001(63);
				} else {
					Static98.anInt2228 = arg2;
					Static338.anInt1381 = 1;
					Static323.anInt5893 = arg1;
					Static189.anInt3802 = 0;
				}
				Static454.method6065(1, 0, true, 1, local16, local13, 0, -4);
			}
		}
		if (local19 == 1012) {
			Static189.anInt3802 = 0;
			Static323.anInt5893 = arg1;
			Static338.anInt1381 = 2;
			Static98.anInt2228 = arg2;
			Static414.method5552(Static124.aClass92_89);
			Static302.aClass3_Sub2_Sub2_2.method6045(local23);
		}
		if (local19 == 3 && Static426.aClass68_13 == null) {
			Static203.method3335(local13, local16);
			Static426.aClass68_13 = Static347.method4975(local16, local13);
			Static442.method5899(Static426.aClass68_13);
		}
		@Pc(486) Class1_Sub3_Sub3_Sub1 local486;
		if (local19 == 10) {
			local486 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local23];
			if (local486 != null) {
				Static323.anInt5893 = arg1;
				Static98.anInt2228 = arg2;
				Static338.anInt1381 = 2;
				Static189.anInt3802 = 0;
				Static414.method5552(Static256.aClass92_155);
				Static302.aClass3_Sub2_Sub2_2.method6034(Static19.aClass16_1.method580(82) ? 1 : 0);
				Static302.aClass3_Sub2_Sub2_2.method5996(local23);
				Static454.method6065(local486.method4831(), 0, true, local486.method4831(), local486.anIntArray454[0], local486.anIntArray453[0], 0, -2);
			}
		}
		if (local19 == 15) {
			Static338.anInt1381 = 2;
			Static189.anInt3802 = 0;
			Static98.anInt2228 = arg2;
			Static323.anInt5893 = arg1;
			Static414.method5552(Static385.aClass92_223);
			Static302.aClass3_Sub2_Sub2_2.method6030(Static19.aClass16_1.method580(82) ? 1 : 0);
			Static302.aClass3_Sub2_Sub2_2.method6002(local13 + Static108.anInt3458);
			Static302.aClass3_Sub2_Sub2_2.method6042(local23);
			Static302.aClass3_Sub2_Sub2_2.method6002(Static339.anInt6223 + local16);
			Static55.method1112(local16, local13);
		}
		@Pc(606) Class1_Sub3_Sub3_Sub2 local606;
		if (local19 == 4) {
			local606 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local23];
			if (local606 != null) {
				Static189.anInt3802 = 0;
				Static338.anInt1381 = 2;
				Static323.anInt5893 = arg1;
				Static98.anInt2228 = arg2;
				Static414.method5552(Static58.aClass92_45);
				Static302.aClass3_Sub2_Sub2_2.method5995(Static19.aClass16_1.method580(82) ? 1 : 0);
				Static302.aClass3_Sub2_Sub2_2.method5996(local23);
				Static454.method6065(local606.method4831(), 0, true, local606.method4831(), local606.anIntArray454[0], local606.anIntArray453[0], 0, -2);
			}
		}
		if (local19 == 30) {
			local486 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local23];
			if (local486 != null) {
				Static189.anInt3802 = 0;
				Static323.anInt5893 = arg1;
				Static98.anInt2228 = arg2;
				Static338.anInt1381 = 2;
				Static414.method5552(Static70.aClass92_54);
				Static302.aClass3_Sub2_Sub2_2.method6034(Static19.aClass16_1.method580(82) ? 1 : 0);
				Static302.aClass3_Sub2_Sub2_2.method6045(local23);
				Static454.method6065(local486.method4831(), 0, true, local486.method4831(), local486.anIntArray454[0], local486.anIntArray453[0], 0, -2);
			}
		}
		if (local19 == 23) {
			local486 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local23];
			if (local486 != null) {
				Static323.anInt5893 = arg1;
				Static338.anInt1381 = 2;
				Static98.anInt2228 = arg2;
				Static189.anInt3802 = 0;
				Static414.method5552(Static414.aClass92_237);
				Static302.aClass3_Sub2_Sub2_2.method6030(Static19.aClass16_1.method580(82) ? 1 : 0);
				Static302.aClass3_Sub2_Sub2_2.method6045(local23);
				Static454.method6065(local486.method4831(), 0, true, local486.method4831(), local486.anIntArray454[0], local486.anIntArray453[0], 0, -2);
			}
		}
		if (local19 == 12) {
			if (Static199.anInt3933 > 0 && Static19.aClass16_1.method580(82) && Static19.aClass16_1.method580(81)) {
				Static128.method2229(Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77, local16 + Static339.anInt6223, local13 + Static108.anInt3458);
			} else {
				Static338.anInt1381 = 1;
				Static189.anInt3802 = 0;
				Static98.anInt2228 = arg2;
				Static323.anInt5893 = arg1;
				Static414.method5552(Static301.aClass92_180);
				Static302.aClass3_Sub2_Sub2_2.method6045(local13 + Static108.anInt3458);
				Static302.aClass3_Sub2_Sub2_2.method6045(Static339.anInt6223 + local16);
			}
		}
		if (local19 == 5) {
			Static338.anInt1381 = 2;
			Static189.anInt3802 = 0;
			Static98.anInt2228 = arg2;
			Static323.anInt5893 = arg1;
			Static414.method5552(Static233.aClass92_145);
			Static302.aClass3_Sub2_Sub2_2.method6002(Static207.anInt4138);
			Static302.aClass3_Sub2_Sub2_2.method6042(Static455.anInt5935);
			Static302.aClass3_Sub2_Sub2_2.method6007(Static295.anInt5382);
			Static302.aClass3_Sub2_Sub2_2.method6002(Static108.anInt3458 + local13);
			Static302.aClass3_Sub2_Sub2_2.method5995(Static19.aClass16_1.method580(82) ? 1 : 0);
			Static302.aClass3_Sub2_Sub2_2.method6042(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static302.aClass3_Sub2_Sub2_2.method6042(local16 + Static339.anInt6223);
			Static270.method5070(local13, local16, local32);
		}
		if (local19 == 16) {
			Static323.anInt5893 = arg1;
			Static338.anInt1381 = 2;
			Static98.anInt2228 = arg2;
			Static189.anInt3802 = 0;
			Static414.method5552(Static194.aClass92_118);
			Static302.aClass3_Sub2_Sub2_2.method6042(local13 + Static108.anInt3458);
			Static302.aClass3_Sub2_Sub2_2.method5996(local23);
			Static302.aClass3_Sub2_Sub2_2.method6045(local16 + Static339.anInt6223);
			Static302.aClass3_Sub2_Sub2_2.method6002(Static455.anInt5935);
			Static302.aClass3_Sub2_Sub2_2.method5996(Static207.anInt4138);
			Static302.aClass3_Sub2_Sub2_2.method5995(Static19.aClass16_1.method580(82) ? 1 : 0);
			Static302.aClass3_Sub2_Sub2_2.method6043(Static295.anInt5382);
			Static55.method1112(local16, local13);
		}
		if (local19 == 58) {
			local606 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local23];
			if (local606 != null) {
				Static189.anInt3802 = 0;
				Static323.anInt5893 = arg1;
				Static98.anInt2228 = arg2;
				Static338.anInt1381 = 2;
				Static414.method5552(Static138.aClass92_96);
				Static302.aClass3_Sub2_Sub2_2.method6001(Static19.aClass16_1.method580(82) ? 1 : 0);
				Static302.aClass3_Sub2_Sub2_2.method5996(local23);
				Static454.method6065(local606.method4831(), 0, true, local606.method4831(), local606.anIntArray454[0], local606.anIntArray453[0], 0, -2);
			}
		}
		if (local19 == 1001) {
			Static338.anInt1381 = 2;
			Static189.anInt3802 = 0;
			Static323.anInt5893 = arg1;
			Static98.anInt2228 = arg2;
			local606 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local23];
			if (local606 != null) {
				@Pc(1068) Class47 local1068 = local606.aClass47_1;
				if (local1068.anIntArray134 != null) {
					local1068 = local1068.method1296(Static369.aClass11_1);
				}
				if (local1068 != null) {
					Static414.method5552(Static224.aClass92_137);
					Static302.aClass3_Sub2_Sub2_2.method6045(local1068.anInt1569);
				}
			}
		}
		if (local19 == 47) {
			Static338.anInt1381 = 2;
			Static189.anInt3802 = 0;
			Static98.anInt2228 = arg2;
			Static323.anInt5893 = arg1;
			Static414.method5552(Static134.aClass92_94);
			Static302.aClass3_Sub2_Sub2_2.method5996(Static339.anInt6223 + local16);
			Static302.aClass3_Sub2_Sub2_2.method6045(local23);
			Static302.aClass3_Sub2_Sub2_2.method6034(Static19.aClass16_1.method580(82) ? 1 : 0);
			Static302.aClass3_Sub2_Sub2_2.method6045(Static108.anInt3458 + local13);
			Static55.method1112(local16, local13);
		}
		if (local19 == 49) {
			local606 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local23];
			if (local606 != null) {
				Static338.anInt1381 = 2;
				Static98.anInt2228 = arg2;
				Static189.anInt3802 = 0;
				Static323.anInt5893 = arg1;
				Static414.method5552(Static67.aClass92_51);
				Static302.aClass3_Sub2_Sub2_2.method6002(local23);
				Static302.aClass3_Sub2_Sub2_2.method5995(Static19.aClass16_1.method580(82) ? 1 : 0);
				Static454.method6065(local606.method4831(), 0, true, local606.method4831(), local606.anIntArray454[0], local606.anIntArray453[0], 0, -2);
			}
		}
		if (local19 == 6) {
			Static189.anInt3802 = 0;
			Static323.anInt5893 = arg1;
			Static338.anInt1381 = 2;
			Static98.anInt2228 = arg2;
			Static414.method5552(Static56.aClass92_44);
			Static302.aClass3_Sub2_Sub2_2.method5996(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static302.aClass3_Sub2_Sub2_2.method5996(Static339.anInt6223 + local16);
			Static302.aClass3_Sub2_Sub2_2.method6030(Static19.aClass16_1.method580(82) ? 1 : 0);
			Static302.aClass3_Sub2_Sub2_2.method5996(local13 + Static108.anInt3458);
			Static270.method5070(local13, local16, local32);
		}
		if (local19 == 11) {
			local486 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local23];
			if (local486 != null) {
				Static98.anInt2228 = arg2;
				Static338.anInt1381 = 2;
				Static323.anInt5893 = arg1;
				Static189.anInt3802 = 0;
				Static414.method5552(Static293.aClass92_108);
				Static302.aClass3_Sub2_Sub2_2.method6002(local23);
				Static302.aClass3_Sub2_Sub2_2.method6045(Static455.anInt5935);
				Static302.aClass3_Sub2_Sub2_2.method5995(Static19.aClass16_1.method580(82) ? 1 : 0);
				Static302.aClass3_Sub2_Sub2_2.method6008(Static295.anInt5382);
				Static302.aClass3_Sub2_Sub2_2.method5996(Static207.anInt4138);
				Static454.method6065(local486.method4831(), 0, true, local486.method4831(), local486.anIntArray454[0], local486.anIntArray453[0], 0, -2);
			}
		}
		if (local19 == 44) {
			local606 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local23];
			if (local606 != null) {
				Static98.anInt2228 = arg2;
				Static323.anInt5893 = arg1;
				Static338.anInt1381 = 2;
				Static189.anInt3802 = 0;
				Static414.method5552(Static302.aClass92_181);
				Static302.aClass3_Sub2_Sub2_2.method6001(Static19.aClass16_1.method580(82) ? 1 : 0);
				Static302.aClass3_Sub2_Sub2_2.method6042(local23);
				Static454.method6065(local606.method4831(), 0, true, local606.method4831(), local606.anIntArray454[0], local606.anIntArray453[0], 0, -2);
			}
		}
		if (local19 == 1004) {
			Static338.anInt1381 = 2;
			Static323.anInt5893 = arg1;
			Static98.anInt2228 = arg2;
			Static189.anInt3802 = 0;
			Static414.method5552(Static428.aClass92_244);
			Static302.aClass3_Sub2_Sub2_2.method6045(local23);
		}
		if (local19 == 59) {
			local486 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local23];
			if (local486 != null) {
				Static98.anInt2228 = arg2;
				Static323.anInt5893 = arg1;
				Static189.anInt3802 = 0;
				Static338.anInt1381 = 2;
				Static414.method5552(Static428.aClass92_245);
				Static302.aClass3_Sub2_Sub2_2.method6042(local23);
				Static302.aClass3_Sub2_Sub2_2.method5995(Static19.aClass16_1.method580(82) ? 1 : 0);
				Static454.method6065(local486.method4831(), 0, true, local486.method4831(), local486.anIntArray454[0], local486.anIntArray453[0], 0, -2);
			}
		}
		if (local19 == 46) {
			local268 = Static347.method4975(local16, local13);
			if (local268 != null) {
				Static224.method3527(local268);
			}
		}
		if (local19 == 50) {
			local606 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local23];
			if (local606 != null) {
				Static189.anInt3802 = 0;
				Static323.anInt5893 = arg1;
				Static98.anInt2228 = arg2;
				Static338.anInt1381 = 2;
				Static414.method5552(Static348.aClass92_248);
				Static302.aClass3_Sub2_Sub2_2.method5996(local23);
				Static302.aClass3_Sub2_Sub2_2.method5995(Static19.aClass16_1.method580(82) ? 1 : 0);
				Static454.method6065(local606.method4831(), 0, true, local606.method4831(), local606.anIntArray454[0], local606.anIntArray453[0], 0, -2);
			}
		}
		if (local19 == 18 || local19 == 1008) {
			Static129.method2233(arg0.aString59, local16, local13, local23);
		}
		if (local19 == 60) {
			local486 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local23];
			if (local486 != null) {
				Static189.anInt3802 = 0;
				Static98.anInt2228 = arg2;
				Static323.anInt5893 = arg1;
				Static338.anInt1381 = 2;
				Static414.method5552(Static302.aClass92_182);
				Static302.aClass3_Sub2_Sub2_2.method5995(Static19.aClass16_1.method580(82) ? 1 : 0);
				Static302.aClass3_Sub2_Sub2_2.method6002(local23);
				Static454.method6065(local486.method4831(), 0, true, local486.method4831(), local486.anIntArray454[0], local486.anIntArray453[0], 0, -2);
			}
		}
		if (local19 == 8) {
			local486 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local23];
			if (local486 != null) {
				Static338.anInt1381 = 2;
				Static323.anInt5893 = arg1;
				Static189.anInt3802 = 0;
				Static98.anInt2228 = arg2;
				Static414.method5552(Static73.aClass92_57);
				Static302.aClass3_Sub2_Sub2_2.method5996(local23);
				Static302.aClass3_Sub2_Sub2_2.method6034(Static19.aClass16_1.method580(82) ? 1 : 0);
				Static454.method6065(local486.method4831(), 0, true, local486.method4831(), local486.anIntArray454[0], local486.anIntArray453[0], 0, -2);
			}
		}
		if (local19 == 51) {
			Static338.anInt1381 = 2;
			Static323.anInt5893 = arg1;
			Static98.anInt2228 = arg2;
			Static189.anInt3802 = 0;
			Static414.method5552(Static198.aClass92_121);
			Static302.aClass3_Sub2_Sub2_2.method5996(local23);
			Static302.aClass3_Sub2_Sub2_2.method5995(Static19.aClass16_1.method580(82) ? 1 : 0);
			Static302.aClass3_Sub2_Sub2_2.method6042(Static108.anInt3458 + local13);
			Static302.aClass3_Sub2_Sub2_2.method6002(Static339.anInt6223 + local16);
			Static55.method1112(local16, local13);
		}
		if (local19 == 20) {
			Static189.anInt3802 = 0;
			Static338.anInt1381 = 1;
			Static323.anInt5893 = arg1;
			Static98.anInt2228 = arg2;
			Static414.method5552(Static62.aClass92_49);
			Static302.aClass3_Sub2_Sub2_2.method6042(Static455.anInt5935);
			Static302.aClass3_Sub2_Sub2_2.method5996(local16 + Static339.anInt6223);
			Static302.aClass3_Sub2_Sub2_2.method5998(Static295.anInt5382);
			Static302.aClass3_Sub2_Sub2_2.method6002(Static207.anInt4138);
			Static302.aClass3_Sub2_Sub2_2.method6002(local13 + Static108.anInt3458);
			Static454.method6065(1, 0, true, 1, local16, local13, 0, -4);
		}
		if (local19 == 19) {
			local606 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local23];
			if (local606 != null) {
				Static323.anInt5893 = arg1;
				Static189.anInt3802 = 0;
				Static338.anInt1381 = 2;
				Static98.anInt2228 = arg2;
				Static414.method5552(Static36.aClass92_33);
				Static302.aClass3_Sub2_Sub2_2.method5998(Static295.anInt5382);
				Static302.aClass3_Sub2_Sub2_2.method6034(Static19.aClass16_1.method580(82) ? 1 : 0);
				Static302.aClass3_Sub2_Sub2_2.method6045(Static207.anInt4138);
				Static302.aClass3_Sub2_Sub2_2.method6045(local23);
				Static302.aClass3_Sub2_Sub2_2.method5996(Static455.anInt5935);
				Static454.method6065(local606.method4831(), 0, true, local606.method4831(), local606.anIntArray454[0], local606.anIntArray453[0], 0, -2);
			}
		}
		if (local19 == 48) {
			Static98.anInt2228 = arg2;
			Static189.anInt3802 = 0;
			Static338.anInt1381 = 2;
			Static323.anInt5893 = arg1;
			Static414.method5552(Static404.aClass92_232);
			Static302.aClass3_Sub2_Sub2_2.method6002(Static108.anInt3458 + local13);
			Static302.aClass3_Sub2_Sub2_2.method6042(local16 + Static339.anInt6223);
			Static302.aClass3_Sub2_Sub2_2.method6030(Static19.aClass16_1.method580(82) ? 1 : 0);
			Static302.aClass3_Sub2_Sub2_2.method6042(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static270.method5070(local13, local16, local32);
		}
		if (local19 == 9) {
			Static189.anInt3802 = 0;
			Static98.anInt2228 = arg2;
			Static338.anInt1381 = 2;
			Static323.anInt5893 = arg1;
			Static414.method5552(Static206.aClass92_128);
			Static302.aClass3_Sub2_Sub2_2.method6045(local23);
			Static302.aClass3_Sub2_Sub2_2.method6030(Static19.aClass16_1.method580(82) ? 1 : 0);
			Static302.aClass3_Sub2_Sub2_2.method6045(local13 + Static108.anInt3458);
			Static302.aClass3_Sub2_Sub2_2.method5996(local16 + Static339.anInt6223);
			Static55.method1112(local16, local13);
		}
		if (local19 == 17) {
			Static98.anInt2228 = arg2;
			Static338.anInt1381 = 2;
			Static323.anInt5893 = arg1;
			Static189.anInt3802 = 0;
			Static414.method5552(Static358.aClass92_195);
			Static302.aClass3_Sub2_Sub2_2.method5995(Static19.aClass16_1.method580(82) ? 1 : 0);
			Static302.aClass3_Sub2_Sub2_2.method6045(local13 + Static108.anInt3458);
			Static302.aClass3_Sub2_Sub2_2.method6045(local16 + Static339.anInt6223);
			Static302.aClass3_Sub2_Sub2_2.method6042(local23);
			Static55.method1112(local16, local13);
		}
		if (local19 == 25) {
			local486 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local23];
			if (local486 != null) {
				Static98.anInt2228 = arg2;
				Static189.anInt3802 = 0;
				Static338.anInt1381 = 2;
				Static323.anInt5893 = arg1;
				Static414.method5552(Static98.aClass92_74);
				Static302.aClass3_Sub2_Sub2_2.method5996(local23);
				Static302.aClass3_Sub2_Sub2_2.method6034(Static19.aClass16_1.method580(82) ? 1 : 0);
				Static454.method6065(local486.method4831(), 0, true, local486.method4831(), local486.anIntArray454[0], local486.anIntArray453[0], 0, -2);
			}
		}
		if (local19 == 22) {
			local486 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local23];
			if (local486 != null) {
				Static338.anInt1381 = 2;
				Static98.anInt2228 = arg2;
				Static323.anInt5893 = arg1;
				Static189.anInt3802 = 0;
				Static414.method5552(Static287.aClass92_169);
				Static302.aClass3_Sub2_Sub2_2.method6042(local23);
				Static302.aClass3_Sub2_Sub2_2.method6001(Static19.aClass16_1.method580(82) ? 1 : 0);
				Static454.method6065(local486.method4831(), 0, true, local486.method4831(), local486.anIntArray454[0], local486.anIntArray453[0], 0, -2);
			}
		}
		if (Static59.aBoolean111) {
			Static31.method766();
		}
		if (Static165.aClass68_6 != null && Static136.anInt2297 == 0) {
			Static442.method5899(Static165.aClass68_6);
		}
	}
}
