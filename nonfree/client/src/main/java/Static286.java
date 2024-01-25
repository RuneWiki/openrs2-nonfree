import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!sa", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString205 = "Please remove ";

	@OriginalMember(owner = "client!sa", name = "t", descriptor = "Lclient!wq;")
	public static final Class14_Sub43 aClass14_Sub43_1 = new Class14_Sub43(0, 0);

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
	public static int anInt5461 = 0;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!sk;)V")
	public static void method4893(@OriginalArg(0) Class14_Sub13_Sub1 arg0) {
		if (Static4.anInt118 >= 255) {
			return;
		}
		Static127.aClass14_Sub13_Sub1Array1[Static4.anInt118] = arg0;
		Static124.aBooleanArray13[Static4.anInt118] = false;
		Static4.anInt118++;
		@Pc(18) int local18 = arg0.anInt5650;
		if (arg0.aBoolean373) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt5650;
		if (arg0.aBoolean372) {
			local26 = Static125.anInt2719 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt5638 + 64 - arg0.anInt5639 >> 7;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt5638 + arg0.anInt5639 - 64 >> 7;
			if (local66 >= Static180.anInt3712) {
				local66 = Static180.anInt3712 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray113[local38++];
				@Pc(96) int local96 = (arg0.anInt5640 + 64 - arg0.anInt5639 >> 7) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Static233.anInt4556) {
					local104 = Static233.anInt4556 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) int local126 = Static118.anIntArrayArrayArray3[local35][local117][local75];
					if ((local126 & 0xFF) == 0) {
						Static118.anIntArrayArrayArray3[local35][local117][local75] = local126 | Static4.anInt118;
					} else if ((local126 & 0xFF00) == 0) {
						Static118.anIntArrayArrayArray3[local35][local117][local75] = local126 | Static4.anInt118 << 8;
					} else if ((local126 & 0xFF0000) == 0) {
						Static118.anIntArrayArrayArray3[local35][local117][local75] = local126 | Static4.anInt118 << 16;
					} else if ((local126 & 0xFF000000) == 0) {
						Static118.anIntArrayArrayArray3[local35][local117][local75] = local126 | Static4.anInt118 << 24;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
	public static void method4894(@OriginalArg(1) int arg0) {
		@Pc(8) Class14_Sub2_Sub13 local8 = Static1.method5711(10, arg0);
		local8.method3539();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!e;ZII[BI[Lclient!fn;)V")
	public static void method4895(@OriginalArg(0) Class46 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) Class65[] arg5) {
		@Pc(16) Class14_Sub4 local16 = new Class14_Sub4(arg4);
		@Pc(18) int local18 = -1;
		while (true) {
			@Pc(22) int local22 = local16.method2507();
			if (local22 == 0) {
				return;
			}
			local18 += local22;
			@Pc(30) int local30 = 0;
			while (true) {
				@Pc(34) int local34 = local16.method2525();
				if (local34 == 0) {
					break;
				}
				local30 += local34 - 1;
				@Pc(46) int local46 = local30 & 0x3F;
				@Pc(52) int local52 = local30 >> 6 & 0x3F;
				@Pc(56) int local56 = local30 >> 12;
				@Pc(60) int local60 = local16.method2548();
				@Pc(64) int local64 = local60 >> 2;
				@Pc(68) int local68 = local60 & 0x3;
				@Pc(72) int local72 = arg2 + local52;
				@Pc(76) int local76 = arg3 + local46;
				if (local72 > 0 && local76 > 0 && local72 < Static195.anInt3965 - 1 && Static298.anInt5716 - 1 > local76) {
					@Pc(102) Class65 local102 = null;
					if (!arg1) {
						@Pc(106) int local106 = local56;
						if ((Static108.aByteArrayArrayArray5[1][local72][local76] & 0x2) == 2) {
							local106 = local56 - 1;
						}
						if (local106 >= 0) {
							local102 = arg5[local106];
						}
					}
					Static137.method2761(arg1, local102, local72, arg0, local76, true, -1, local64, local68, local18, local56, local56);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!jg;ILclient!ap;I)V")
	public static void method4896(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) Class15 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class14_Sub22 local13 = new Class14_Sub22();
		local13.anInt3715 = arg0.method2548();
		local13.anInt3714 = arg0.method2510();
		local13.aByteArrayArrayArray7 = new byte[local13.anInt3715][][];
		local13.anIntArray322 = new int[local13.anInt3715];
		local13.aClass205Array1 = new Class205[local13.anInt3715];
		local13.aClass205Array2 = new Class205[local13.anInt3715];
		local13.anIntArray320 = new int[local13.anInt3715];
		local13.anIntArray321 = new int[local13.anInt3715];
		for (@Pc(55) int local55 = 0; local55 < local13.anInt3715; local55++) {
			try {
				@Pc(61) int local61 = arg0.method2548();
				@Pc(73) String local73;
				@Pc(77) String local77;
				@Pc(79) int local79;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local73 = arg0.method2496();
					local77 = arg0.method2496();
					local79 = 0;
					if (local61 == 1) {
						local79 = arg0.method2510();
					}
					local13.anIntArray322[local55] = local61;
					local13.anIntArray321[local55] = local79;
					local13.aClass205Array1[local55] = arg1.method278(Static324.method5567(local73), local77);
				} else if (local61 == 3 || local61 == 4) {
					local73 = arg0.method2496();
					local77 = arg0.method2496();
					local79 = arg0.method2548();
					@Pc(144) String[] local144 = new String[local79];
					for (@Pc(146) int local146 = 0; local146 < local79; local146++) {
						local144[local146] = arg0.method2496();
					}
					@Pc(165) byte[][] local165 = new byte[local79][];
					@Pc(180) int local180;
					if (local61 == 3) {
						for (@Pc(172) int local172 = 0; local172 < local79; local172++) {
							local180 = arg0.method2510();
							local165[local172] = new byte[local180];
							arg0.method2518(local165[local172], local180);
						}
					}
					local13.anIntArray322[local55] = local61;
					@Pc(205) Class[] local205 = new Class[local79];
					for (local180 = 0; local180 < local79; local180++) {
						local205[local180] = Static324.method5567(local144[local180]);
					}
					local13.aClass205Array2[local55] = arg1.method280(local205, local77, Static324.method5567(local73));
					local13.aByteArrayArrayArray7[local55] = local165;
				}
			} catch (@Pc(242) ClassNotFoundException local242) {
				local13.anIntArray320[local55] = -1;
			} catch (@Pc(249) SecurityException local249) {
				local13.anIntArray320[local55] = -2;
			} catch (@Pc(256) NullPointerException local256) {
				local13.anIntArray320[local55] = -3;
			} catch (@Pc(263) Exception local263) {
				local13.anIntArray320[local55] = -4;
			} catch (@Pc(270) Throwable local270) {
				local13.anIntArray320[local55] = -5;
			}
		}
		Static279.aClass18_33.method451(local13);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!mo;Lclient!mo;Z)V")
	public static void method4897(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class143 arg1) {
		Static4.aClass143_3 = arg0;
		Static342.aClass143_115 = arg1;
	}
}
