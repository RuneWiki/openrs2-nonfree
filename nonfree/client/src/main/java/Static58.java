import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!f", name = "R", descriptor = "Lclient!pa;")
	public static Class86 aClass86_20;

	@OriginalMember(owner = "client!f", name = "U", descriptor = "I")
	public static int anInt1154;

	@OriginalMember(owner = "client!f", name = "V", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_9;

	@OriginalMember(owner = "client!f", name = "Z", descriptor = "Lclient!id;")
	public static Class48 aClass48_1;

	@OriginalMember(owner = "client!f", name = "cb", descriptor = "I")
	public static int anInt1159;

	@OriginalMember(owner = "client!f", name = "hb", descriptor = "Lclient!hh;")
	private static Class50 aClass50_415 = Static186.method3527("flash2:");

	@OriginalMember(owner = "client!f", name = "S", descriptor = "Lclient!hh;")
	public static Class50 aClass50_412 = aClass50_415;

	@OriginalMember(owner = "client!f", name = "W", descriptor = "Lclient!hh;")
	public static Class50 aClass50_413 = Static186.method3527("leuchten3:");

	@OriginalMember(owner = "client!f", name = "X", descriptor = "I")
	public static int anInt1155 = 0;

	@OriginalMember(owner = "client!f", name = "ab", descriptor = "I")
	public static int anInt1157 = 0;

	@OriginalMember(owner = "client!f", name = "fb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_414 = aClass50_415;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZZ)V")
	public static void method861() {
		@Pc(3) byte[][] local3 = Static64.aByteArrayArray3;
		@Pc(10) int local10 = Static6.aByteArrayArray1.length;
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			@Pc(23) byte[] local23 = local3[local17];
			if (local23 != null) {
				@Pc(36) int local36 = (Static103.anIntArray197[local17] >> 8) * 64 - Static91.anInt4078;
				@Pc(46) int local46 = (Static103.anIntArray197[local17] & 0xFF) * 64 - Static101.anInt2041;
				Static192.method3138();
				Static201.method3211(local36, local46, local23, Static22.aClass16Array1);
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIBIIIIIII)V")
	public static void method862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7) {
		@Pc(10) int local10 = arg1 - arg4;
		@Pc(15) int local15 = arg5 - arg0;
		@Pc(26) boolean local26;
		if (Static192.anInt3939 > 0 && Static192.anInt3939 % 10 < 5) {
			local26 = true;
		} else {
			local26 = false;
		}
		@Pc(34) int local34 = 983040 / arg2;
		@Pc(38) int local38 = 983040 / arg3;
		for (@Pc(41) int local41 = -local34; local41 < local10 + local34; local41++) {
			@Pc(53) int local53 = (local41 + 1) * arg2 >> 16;
			@Pc(61) int local61 = arg2 * local41 >> 16;
			@Pc(66) int local66 = local53 - local61;
			if (local66 > 0) {
				local61 += arg7;
				@Pc(82) int local82 = local41 + arg4 >> 6;
				if (local82 >= 0 && local82 <= Static109.anIntArrayArrayArray9.length - 1) {
					@Pc(103) int[][] local103 = Static109.anIntArrayArrayArray9[local82];
					for (@Pc(106) int local106 = -local38; local106 < local38 + local15; local106++) {
						@Pc(118) int local118 = arg3 * (local106 + 1) >> 16;
						@Pc(127) int local127 = local106 * arg3 >> 16;
						@Pc(132) int local132 = local118 - local127;
						if (local132 > 0) {
							local127 += arg6;
							@Pc(151) int local151 = arg0 + local106 >> 6;
							if (local151 >= 0 && local151 <= local103.length - 1 && local103[local151] != null) {
								@Pc(184) int local184 = (local41 + arg4 & 0x3F) + ((local106 + arg0 & 0x3F) << 6);
								@Pc(190) int local190 = local103[local151][local184];
								if (local190 != 0) {
									@Pc(201) Class18 local201 = Static148.method2487(local190 - 1);
									if (local26 && Static199.anInt4011 == local201.anInt815) {
										@Pc(211) Class1_Sub2 local211 = new Class1_Sub2();
										local211.anInt50 = local61;
										local211.anInt54 = local127;
										local211.anInt60 = local201.anInt815;
										Static140.aClass75_14.method2240(local211);
									}
									Static34.aClass1_Sub1_Sub8_Sub1Array5[local201.anInt815].method2417(local61 - 7, local127 + -7);
								}
							}
						}
					}
				}
			}
		}
		for (@Pc(257) Class1_Sub2 local257 = (Class1_Sub2) Static140.aClass75_14.method2239(); local257 != null; local257 = (Class1_Sub2) Static140.aClass75_14.method2238()) {
			Static34.aClass1_Sub1_Sub8_Sub1Array5[local257.anInt60].method2417(local257.anInt50 - 7, local257.anInt54 - 7);
			Static29.method419(local257.anInt50, local257.anInt54, 15, 16776960, 128);
			Static29.method419(local257.anInt50, local257.anInt54, 7, 16777215, 256);
		}
		Static140.aClass75_14.method2243();
	}
}
