import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!v", name = "J", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_157 = new Class265(16, 0);

	@OriginalMember(owner = "client!v", name = "Q", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_158 = new Class265(51, 3);

	@OriginalMember(owner = "client!v", name = "R", descriptor = "Lclient!em;")
	public static Class68 aClass68_14 = null;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!sk;IZ)V")
	public static void method5428(@OriginalArg(0) Class3_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static373.anInt4900 >= 400) {
			return;
		}
		if (Static375.aClass3_Sub2_Sub1_Sub2_7 != arg0) {
			@Pc(80) String local80;
			@Pc(133) int local133;
			if (arg0.anInt6223 == 0) {
				@Pc(84) boolean local84 = true;
				if (Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6229 != -1 && arg0.anInt6229 != -1) {
					@Pc(108) int local108 = Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6217 > arg0.anInt6217 ? Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6217 : arg0.anInt6217;
					@Pc(123) int local123 = arg0.anInt6229 <= Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6229 ? arg0.anInt6229 : Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6229;
					local133 = local108 * 10 / 100 + local123 + 5;
					@Pc(140) int local140 = Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6217 - arg0.anInt6217;
					if (local140 < 0) {
						local140 = -local140;
					}
					if (local140 > local133) {
						local84 = false;
					}
				}
				@Pc(163) String local163 = Static320.aClass10_28 == Static423.aClass10_43 ? Static72.aClass209_40.method4562(Static388.anInt6533) : Static350.aClass209_138.method4562(Static388.anInt6533);
				if (arg0.anInt6245 > arg0.anInt6217) {
					local80 = arg0.method4950() + (local84 ? Static26.method509(arg0.anInt6217, Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6217) : "<col=ffffff>") + " (" + local163 + arg0.anInt6217 + "+" + (arg0.anInt6245 - arg0.anInt6217) + ")";
				} else {
					local80 = arg0.method4950() + (local84 ? Static26.method509(arg0.anInt6217, Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6217) : "<col=ffffff>") + " (" + local163 + arg0.anInt6217 + ")";
				}
			} else {
				local80 = arg0.method4950() + " (" + Static91.aClass209_46.method4562(Static388.anInt6533) + arg0.anInt6223 + ")";
			}
			if (Static385.aBoolean441) {
				if (!arg1 && (Static201.anInt3539 & 0x8) != 0) {
					Static172.method2802(12, Static323.anInt5618, true, (long) arg0.anInt6137, Static118.aString34, 0, Static254.aString46 + " -> <col=ffffff>" + local80, -1, false, 0);
				}
			} else if (arg1) {
				Static172.method2802(-1, -1, false, 0L, "<col=cccccc>" + local80, 0, "", 0, true, 0);
			} else {
				for (@Pc(280) int local280 = 7; local280 >= 0; local280--) {
					if (Static199.aStringArray26[local280] != null) {
						@Pc(288) short local288 = 0;
						if (Static199.aClass10_22 == Static320.aClass10_28 && Static199.aStringArray26[local280].equalsIgnoreCase(Static58.aClass209_31.method4562(Static388.anInt6533))) {
							if (Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6217 < arg0.anInt6217) {
								local288 = 2000;
							}
							if (Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6215 != 0 && arg0.anInt6215 != 0) {
								if (Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6215 == arg0.anInt6215) {
									local288 = 2000;
								} else {
									local288 = 0;
								}
							}
						} else if (Static82.aBooleanArray10[local280]) {
							local288 = 2000;
						}
						@Pc(346) short local346 = (short) (Static169.aShortArray43[local280] + local288);
						local133 = Static326.anIntArray467[local280] == -1 ? Static238.anInt4575 : Static326.anIntArray467[local280];
						Static172.method2802(local346, local133, true, (long) arg0.anInt6137, Static199.aStringArray26[local280], 0, "<col=ffffff>" + local80, -1, false, 0);
					}
				}
			}
			if (!arg1) {
				for (@Pc(419) Class2_Sub22 local419 = (Class2_Sub22) Static248.aClass14_35.method309(); local419 != null; local419 = (Class2_Sub22) Static248.aClass14_35.method311()) {
					if (local419.anInt3716 == 59) {
						local419.aString43 = "<col=ffffff>" + local80;
						return;
					}
				}
			}
		} else if (Static385.aBoolean441 && (Static201.anInt3539 & 0x10) != 0) {
			Static172.method2802(30, Static323.anInt5618, true, 0L, Static118.aString34, 0, Static254.aString46 + " -> <col=ffffff>" + Static341.aClass209_63.method4562(Static388.anInt6533), -1, false, 0);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLclient!si;)V")
	public static void method5431(@OriginalArg(1) Class2_Sub23 arg0) {
		@Pc(9) int local9 = arg0.method5479();
		Static222.aClass233Array1 = new Class233[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static222.aClass233Array1[local14] = new Class233();
			Static222.aClass233Array1[local14].anInt6434 = arg0.method5479();
			Static222.aClass233Array1[local14].aString57 = arg0.method5467();
		}
		Static429.anInt6516 = arg0.method5479();
		Static160.anInt4302 = arg0.method5479();
		Static427.anInt7111 = arg0.method5479();
		Static204.aClass219_Sub1Array2 = new Class219_Sub1[Static160.anInt4302 + 1 - Static429.anInt6516];
		for (@Pc(66) int local66 = 0; local66 < Static427.anInt7111; local66++) {
			@Pc(72) int local72 = arg0.method5479();
			@Pc(80) Class219_Sub1 local80 = Static204.aClass219_Sub1Array2[local72] = new Class219_Sub1();
			local80.anInt6539 = arg0.method5495();
			local80.anInt6541 = arg0.method5508();
			local80.anInt6547 = Static429.anInt6516 + local72;
			local80.aString58 = arg0.method5467();
			local80.aString59 = arg0.method5467();
		}
		Static386.anInt6457 = arg0.method5508();
		Static230.aBoolean325 = true;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!dr;ILclient!si;)V")
	public static void method5432(@OriginalArg(1) Class59 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub23 arg2) {
		@Pc(9) Class2_Sub44 local9 = new Class2_Sub44();
		local9.anInt7214 = arg2.method5495();
		local9.anInt7215 = arg2.method5508();
		local9.aClass138Array2 = new Class138[local9.anInt7214];
		local9.aClass138Array1 = new Class138[local9.anInt7214];
		local9.anIntArray611 = new int[local9.anInt7214];
		local9.anIntArray610 = new int[local9.anInt7214];
		local9.aByteArrayArrayArray17 = new byte[local9.anInt7214][][];
		local9.anIntArray609 = new int[local9.anInt7214];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt7214; local51++) {
			try {
				@Pc(57) int local57 = arg2.method5495();
				@Pc(73) String local73;
				@Pc(77) String local77;
				@Pc(79) int local79;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local73 = arg2.method5494();
					local77 = arg2.method5494();
					local79 = 0;
					if (local57 == 1) {
						local79 = arg2.method5508();
					}
					local9.anIntArray609[local51] = local57;
					local9.anIntArray610[local51] = local79;
					local9.aClass138Array2[local51] = arg0.method1375(Static322.method4524(local73), local77);
				} else if (local57 == 3 || local57 == 4) {
					local73 = arg2.method5494();
					local77 = arg2.method5494();
					local79 = arg2.method5495();
					@Pc(136) String[] local136 = new String[local79];
					for (@Pc(138) int local138 = 0; local138 < local79; local138++) {
						local136[local138] = arg2.method5494();
					}
					@Pc(157) byte[][] local157 = new byte[local79][];
					@Pc(168) int local168;
					if (local57 == 3) {
						for (@Pc(162) int local162 = 0; local162 < local79; local162++) {
							local168 = arg2.method5508();
							local157[local162] = new byte[local168];
							arg2.method5509(local168, local157[local162]);
						}
					}
					local9.anIntArray609[local51] = local57;
					@Pc(193) Class[] local193 = new Class[local79];
					for (local168 = 0; local168 < local79; local168++) {
						local193[local168] = Static322.method4524(local136[local168]);
					}
					local9.aClass138Array1[local51] = arg0.method1374(local77, Static322.method4524(local73), local193);
					local9.aByteArrayArrayArray17[local51] = local157;
				}
			} catch (@Pc(228) ClassNotFoundException local228) {
				local9.anIntArray611[local51] = -1;
			} catch (@Pc(235) SecurityException local235) {
				local9.anIntArray611[local51] = -2;
			} catch (@Pc(242) NullPointerException local242) {
				local9.anIntArray611[local51] = -3;
			} catch (@Pc(249) Exception local249) {
				local9.anIntArray611[local51] = -4;
			} catch (@Pc(256) Throwable local256) {
				local9.anIntArray611[local51] = -5;
			}
		}
		Static33.aClass14_3.method300(local9);
	}
}
