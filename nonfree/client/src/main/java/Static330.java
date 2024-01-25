import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "Lclient!iv;")
	public static Class34 aClass34_1;

	@OriginalMember(owner = "client!laa", name = "d", descriptor = "[I")
	public static int[] anIntArray297;

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "[I")
	public static final int[] anIntArray298 = new int[25];

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Z)V")
	public static void method5445() {
		for (@Pc(14) int local14 = 0; local14 < Static56.anInt1101; local14++) {
			@Pc(20) int local20 = Static288.anIntArray268[local14];
			@Pc(28) Class15_Sub3_Sub3_Sub1_Sub2 local28 = ((Class2_Sub6) Static630.aClass335_29.method8357((long) local20)).aClass15_Sub3_Sub3_Sub1_Sub2_1;
			@Pc(32) int local32 = Static206.aClass2_Sub8_Sub2_1.method5203();
			if ((local32 & 0x4) != 0) {
				local32 += Static206.aClass2_Sub8_Sub2_1.method5203() << 8;
			}
			if ((local32 & 0x8000) != 0) {
				local32 += Static206.aClass2_Sub8_Sub2_1.method5203() << 16;
			}
			@Pc(71) int local71;
			@Pc(98) int local98;
			if ((local32 & 0x8) != 0) {
				@Pc(69) int[] local69 = new int[4];
				for (local71 = 0; local71 < 4; local71++) {
					local69[local71] = Static206.aClass2_Sub8_Sub2_1.method5214();
					if (local69[local71] == 65535) {
						local69[local71] = -1;
					}
				}
				local98 = Static206.aClass2_Sub8_Sub2_1.method5203();
				Static658.method9647(local69, local98, local28);
			}
			@Pc(130) int local130;
			@Pc(136) int local136;
			@Pc(111) int local111;
			if ((local32 & 0x1000) != 0) {
				local111 = Static206.aClass2_Sub8_Sub2_1.method5226();
				if (local111 == 65535) {
					local111 = -1;
				}
				local71 = Static206.aClass2_Sub8_Sub2_1.method5167();
				local98 = Static206.aClass2_Sub8_Sub2_1.method5207();
				local130 = local98 & 0x7;
				local136 = local98 >> 3 & 0xF;
				if (local136 == 15) {
					local136 = -1;
				}
				local28.method3692(1, local136, local71, local111, local130);
			}
			if ((local32 & 0x20) != 0) {
				if (local28.aClass312_1.method7946()) {
					Static656.method9621(local28);
				}
				local28.method3698(Static522.aClass272_2.method7200(Static206.aClass2_Sub8_Sub2_1.method5214()));
				local28.method3689(local28.aClass312_1.anInt9095);
				local28.anInt4024 = local28.aClass312_1.anInt9063 << 3;
				if (local28.aClass312_1.method7946()) {
					Static225.method4155(local28, (Class15_Sub3_Sub3_Sub1_Sub1) null, 0, local28.anIntArray188[0], (Class331) null, local28.aByte142, local28.anIntArray189[0]);
				}
			}
			if ((local32 & 0x4000) != 0) {
				local111 = Static206.aClass2_Sub8_Sub2_1.method5226();
				local28.anInt4020 = Static206.aClass2_Sub8_Sub2_1.method5201();
				local28.anInt4023 = Static206.aClass2_Sub8_Sub2_1.method5203();
				local28.aBoolean313 = (local111 & 0x8000) != 0;
				local28.anInt3992 = local111 & 0x7FFF;
				local28.anInt4012 = local28.anInt4020 + Static62.anInt1184 + local28.anInt3992;
			}
			if ((local32 & 0x10) != 0) {
				local28.anInt3979 = Static206.aClass2_Sub8_Sub2_1.method5222();
				if (local28.anInt3979 == 65535) {
					local28.anInt3979 = -1;
				}
			}
			if ((local32 & 0x200) != 0) {
				local28.anInt3994 = Static206.aClass2_Sub8_Sub2_1.method5227();
				local28.anInt3989 = Static206.aClass2_Sub8_Sub2_1.method5165();
				local28.anInt4014 = Static206.aClass2_Sub8_Sub2_1.method5175();
				local28.lb = Static206.aClass2_Sub8_Sub2_1.method5175();
				local28.anInt4008 = Static206.aClass2_Sub8_Sub2_1.method5222() + Static62.anInt1184;
				local28.anInt3982 = Static206.aClass2_Sub8_Sub2_1.method5214() + Static62.anInt1184;
				local28.anInt3970 = Static206.aClass2_Sub8_Sub2_1.method5207();
				local28.anInt3989 += local28.anIntArray188[0];
				local28.anInt4039 = 1;
				local28.anInt4038 = 0;
				local28.anInt3994 += local28.anIntArray189[0];
				local28.lb += local28.anIntArray188[0];
				local28.anInt4014 += local28.anIntArray189[0];
			}
			@Pc(413) int local413;
			@Pc(439) int local439;
			@Pc(466) int local466;
			@Pc(401) int[] local401;
			@Pc(427) short[] local427;
			@Pc(454) short[] local454;
			@Pc(493) long local493;
			if ((local32 & 0x800) != 0) {
				local111 = local28.aClass312_1.anIntArray461.length;
				local71 = 0;
				if (local28.aClass312_1.aShortArray117 != null) {
					local71 = local28.aClass312_1.aShortArray117.length;
				}
				local98 = 0;
				if (local28.aClass312_1.lb != null) {
					local98 = local28.aClass312_1.lb.length;
				}
				local130 = Static206.aClass2_Sub8_Sub2_1.method5201();
				if ((local130 & 0x1) == 1) {
					local28.aClass21_1 = null;
				} else {
					local401 = null;
					if ((local130 & 0x2) == 2) {
						local401 = new int[local111];
						for (local413 = 0; local413 < local111; local413++) {
							local401[local413] = Static206.aClass2_Sub8_Sub2_1.method5211();
						}
					}
					local427 = null;
					if ((local130 & 0x4) == 4) {
						local427 = new short[local71];
						for (local439 = 0; local439 < local71; local439++) {
							local427[local439] = (short) Static206.aClass2_Sub8_Sub2_1.method5211();
						}
					}
					local454 = null;
					if ((local130 & 0x8) == 8) {
						local454 = new short[local98];
						for (local466 = 0; local466 < local98; local466++) {
							local454[local466] = (short) Static206.aClass2_Sub8_Sub2_1.method5226();
						}
					}
					local493 = (long) local28.anInt4055++ << 32 | (long) local20;
					local28.aClass21_1 = new Class21(local493, local401, local427, local454);
				}
			}
			if ((local32 & 0x1) != 0) {
				local28.anInt4050 = Static206.aClass2_Sub8_Sub2_1.method5226();
				local28.anInt4043 = Static206.aClass2_Sub8_Sub2_1.method5211();
			}
			if ((local32 & 0x10000) != 0) {
				local111 = local28.aClass312_1.anIntArray459.length;
				local71 = 0;
				if (local28.aClass312_1.aShortArray117 != null) {
					local71 = local28.aClass312_1.aShortArray117.length;
				}
				if (local28.aClass312_1.lb != null) {
					local71 = local28.aClass312_1.lb.length;
				}
				local130 = Static206.aClass2_Sub8_Sub2_1.method5203();
				if ((local130 & 0x1) != 1) {
					local401 = null;
					if ((local130 & 0x2) == 2) {
						local401 = new int[local111];
						for (local413 = 0; local413 < local111; local413++) {
							local401[local413] = Static206.aClass2_Sub8_Sub2_1.method5226();
						}
					}
					local427 = null;
					if ((local130 & 0x4) == 4) {
						local427 = new short[local71];
						for (local439 = 0; local439 < local71; local439++) {
							local427[local439] = (short) Static206.aClass2_Sub8_Sub2_1.method5226();
						}
					}
					local454 = null;
					if ((local130 & 0x8) == 8) {
						local454 = new short[0];
						for (local466 = 0; local466 < 0; local466++) {
							local454[local466] = (short) Static206.aClass2_Sub8_Sub2_1.method5222();
						}
					}
					local493 = (long) local20 | (long) local28.anInt4054++ << 32;
					new Class21(local493, local401, local427, local454);
				}
			}
			if ((local32 & 0x80000) != 0) {
				local111 = Static206.aClass2_Sub8_Sub2_1.method5214();
				if (local111 == 65535) {
					local111 = -1;
				}
				local71 = Static206.aClass2_Sub8_Sub2_1.method5167();
				local98 = Static206.aClass2_Sub8_Sub2_1.method5206();
				local130 = local98 & 0x7;
				local136 = local98 >> 3 & 0xF;
				if (local136 == 15) {
					local136 = -1;
				}
				local28.method3692(2, local136, local71, local111, local130);
			}
			if ((local32 & 0x100) != 0) {
				local28.aByte55 = Static206.aClass2_Sub8_Sub2_1.method5190();
				local28.aByte57 = Static206.aClass2_Sub8_Sub2_1.method5190();
				local28.aByte56 = Static206.aClass2_Sub8_Sub2_1.method5175();
				local28.aByte54 = (byte) Static206.aClass2_Sub8_Sub2_1.method5203();
				local28.anInt4003 = Static62.anInt1184 + Static206.aClass2_Sub8_Sub2_1.method5222();
				local28.anInt4027 = Static62.anInt1184 + Static206.aClass2_Sub8_Sub2_1.method5214();
			}
			@Pc(758) int[] local758;
			@Pc(755) int[] local755;
			if ((local32 & 0x2000) != 0) {
				local111 = Static206.aClass2_Sub8_Sub2_1.method5206();
				local755 = new int[local111];
				local758 = new int[local111];
				for (local130 = 0; local130 < local111; local130++) {
					local136 = Static206.aClass2_Sub8_Sub2_1.method5211();
					if ((local136 & 0xC000) == 49152) {
						local413 = Static206.aClass2_Sub8_Sub2_1.method5222();
						local755[local130] = local413 | local136 << 16;
					} else {
						local755[local130] = local136;
					}
					local758[local130] = Static206.aClass2_Sub8_Sub2_1.method5226();
				}
				local28.method3679(local755, local758);
			}
			if ((local32 & 0x40000) != 0) {
				local28.aString47 = Static206.aClass2_Sub8_Sub2_1.method5178();
				if ("".equals(local28.aString47) || local28.aString47.equals(local28.aClass312_1.aString108)) {
					local28.aString47 = local28.aClass312_1.aString108;
				}
			}
			if ((local32 & 0x2) != 0) {
				local111 = Static206.aClass2_Sub8_Sub2_1.method5201();
				if (local111 > 0) {
					for (local71 = 0; local71 < local111; local71++) {
						local130 = -1;
						local136 = -1;
						local98 = Static206.aClass2_Sub8_Sub2_1.method5173();
						local413 = -1;
						if (local98 == 32767) {
							local98 = Static206.aClass2_Sub8_Sub2_1.method5173();
							local136 = Static206.aClass2_Sub8_Sub2_1.method5173();
							local130 = Static206.aClass2_Sub8_Sub2_1.method5173();
							local413 = Static206.aClass2_Sub8_Sub2_1.method5173();
						} else if (local98 == 32766) {
							local98 = -1;
						} else {
							local136 = Static206.aClass2_Sub8_Sub2_1.method5173();
						}
						local439 = Static206.aClass2_Sub8_Sub2_1.method5173();
						local466 = Static206.aClass2_Sub8_Sub2_1.method5206();
						local28.method3684(local130, local466, local136, Static62.anInt1184, local98, local439, local413);
					}
				}
			}
			if ((local32 & 0x400) != 0) {
				local111 = Static206.aClass2_Sub8_Sub2_1.method5207();
				local755 = new int[local111];
				local758 = new int[local111];
				@Pc(936) int[] local936 = new int[local111];
				for (local136 = 0; local136 < local111; local136++) {
					local413 = Static206.aClass2_Sub8_Sub2_1.method5214();
					if (local413 == 65535) {
						local413 = -1;
					}
					local755[local136] = local413;
					local758[local136] = Static206.aClass2_Sub8_Sub2_1.method5201();
					local936[local136] = Static206.aClass2_Sub8_Sub2_1.method5222();
				}
				Static568.method8654(local758, local936, local28, local755);
			}
			if ((local32 & 0x80) != 0) {
				local28.aString45 = Static206.aClass2_Sub8_Sub2_1.method5178();
				local28.anInt4011 = 100;
			}
			if ((local32 & 0x40) != 0) {
				local111 = Static206.aClass2_Sub8_Sub2_1.method5211();
				if (local111 == 65535) {
					local111 = -1;
				}
				local71 = Static206.aClass2_Sub8_Sub2_1.method5223();
				local98 = Static206.aClass2_Sub8_Sub2_1.method5206();
				local130 = local98 & 0x7;
				local136 = local98 >> 3 & 0xF;
				if (local136 == 15) {
					local136 = -1;
				}
				local28.method3692(0, local136, local71, local111, local130);
			}
			if ((local32 & 0x20000) != 0) {
				local28.anInt4052 = Static206.aClass2_Sub8_Sub2_1.method5222();
				if (local28.anInt4052 == 65535) {
					local28.anInt4052 = local28.aClass312_1.anInt9080;
				}
			}
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method5447(@OriginalArg(1) int arg0) {
		@Pc(17) Class2_Sub18 local17 = (Class2_Sub18) Static284.aClass335_14.method8357((long) arg0);
		if (local17 != null) {
			@Pc(24) Class2_Sub7_Sub2 local24 = local17.aClass78_Sub1_1.method2005();
			if (local24 != null) {
				@Pc(31) double local31 = local17.aClass78_Sub1_1.method2001();
				if (local31 >= (double) local24.method1055() && (double) local24.method1054() >= local31) {
					return local24.method1060();
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILjava/lang/String;B)V")
	public static void method5448(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(9) Class2_Sub1_Sub5 local9 = Static653.method9595(2, (long) arg0);
		local9.method2486();
		local9.aString33 = arg1;
	}
}
