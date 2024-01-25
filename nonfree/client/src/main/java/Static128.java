import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "Lclient!uu;")
	public static Class343 aClass343_48;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
	public static int anInt1666;

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "Lclient!baa;")
	public static Class25 aClass25_7 = new Class25(8);

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
	public static int anInt1667 = 0;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
	public static int anInt1669 = 0;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIILclient!pia;IIILclient!ka;IIILclient!ha;I)Lclient!ka;")
	public static Class75 method1420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class267 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class75 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class82 arg11, @OriginalArg(13) int arg12) {
		if (arg7 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg4 != null) {
			local11 = arg4.method6605(arg5, false, -1) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(47) long local47 = ((long) arg12 << 48) + (long) ((arg9 << 24) + (arg1 << 16) + arg8) + ((long) arg6 << 32);
		@Pc(49) Class136 local49 = Static89.aClass136_40;
		@Pc(57) Class75 local57;
		synchronized (Static89.aClass136_40) {
			local57 = (Class75) Static89.aClass136_40.method3134(local47);
		}
		@Pc(154) int local154;
		if (local57 == null || arg11.method6105(local57.ua(), local11) != 0) {
			if (local57 != null) {
				local11 = arg11.method6169(local11, local57.ua());
			}
			@Pc(86) byte local86;
			if (arg8 == 1) {
				local86 = 9;
			} else if (arg8 == 2) {
				local86 = 12;
			} else if (arg8 == 3) {
				local86 = 15;
			} else if (arg8 == 4) {
				local86 = 18;
			} else {
				local86 = 21;
			}
			@Pc(128) int[] local128 = new int[] { 64, 96, 128 };
			@Pc(147) Class359 local147 = new Class359(local86 * 3 + 1, local86 * 3 * 2 + -local86, 0);
			local154 = local147.method8350(0, 0, 0);
			@Pc(158) int[][] local158 = new int[3][local86];
			@Pc(166) int local166;
			@Pc(170) int local170;
			@Pc(172) int local172;
			@Pc(196) int local196;
			for (@Pc(160) int local160 = 0; local160 < 3; local160++) {
				local166 = local128[local160];
				local170 = local128[local160];
				for (local172 = 0; local172 < local86; local172++) {
					@Pc(180) int local180 = (local172 << 14) / local86;
					@Pc(188) int local188 = Class3_Sub13.anIntArray147[local180] * local166 >> 14;
					local196 = local170 * Class3_Sub13.anIntArray146[local180] >> 14;
					local158[local160][local172] = local147.method8350(local196, local188, 0);
				}
			}
			for (local166 = 0; local166 < 3; local166++) {
				local170 = (local166 * 256 + 128) / 3;
				local172 = 256 - local170;
				@Pc(250) byte local250 = (byte) (arg9 * local170 + local172 * arg1 >> 8);
				@Pc(295) short local295 = (short) (((arg6 & 0x7F) * local172 + local170 * (arg12 & 0x7F) & 0x7F00) + ((arg12 & 0x380) * local170 + (arg6 & 0x380) * local172 & 0x38000) + (local170 * (arg12 & 0xFC00) + (arg6 & 0xFC00) * local172 & 0xFC0000) >> 8);
				for (local196 = 0; local196 < local86; local196++) {
					if (local166 == 0) {
						local147.method8354(local154, (byte) 1, local295, (byte) -1, local158[0][(local196 + 1) % local86], local250, (short) -1, local158[0][local196]);
					} else {
						local147.method8354(local158[local166 - 1][local196], (byte) 1, local295, (byte) -1, local158[local166 - 1][(local196 + 1) % local86], local250, (short) -1, local158[local166][(local196 + 1) % local86]);
						local147.method8354(local158[local166 - 1][local196], (byte) 1, local295, (byte) -1, local158[local166][(local196 + 1) % local86], local250, (short) -1, local158[local166][local196]);
					}
				}
			}
			local57 = arg11.method6176(local147, local11, Static27.anInt402, 64, 768);
			@Pc(418) Class136 local418 = Static89.aClass136_40;
			synchronized (Static89.aClass136_40) {
				Static89.aClass136_40.method3135(local57, local47);
			}
		}
		@Pc(434) int local434 = arg7.V();
		@Pc(437) int local437 = arg7.RA();
		@Pc(448) int local448 = arg7.HA();
		local154 = arg7.G();
		@Pc(453) Class3_Sub7_Sub18 local453 = null;
		if (arg4 != null) {
			@Pc(460) int local460 = arg4.anIntArray458[arg5];
			local453 = Static474.aClass264_2.method6569(local460 >> 16);
			arg5 = local460 & 0xFFFF;
		}
		if (local453 == null) {
			local57 = local57.method6805((byte) 3, local11, true);
			local57.O(local437 - local434 >> 1, 128, local154 - local448 >> 1);
			local57.H(local434 + local437 >> 1, 0, local448 + local154 >> 1);
		} else {
			local57 = local57.method6805((byte) 3, local11, true);
			local57.O(local437 - local434 >> 1, 128, local154 - local448 >> 1);
			local57.H(local437 + local434 >> 1, 0, local448 + local154 >> 1);
			local57.method6783(arg5, local453);
		}
		if (arg10 != 0) {
			local57.FA(arg10);
		}
		if (arg0 != 0) {
			local57.VA(arg0);
		}
		if (arg2 != 0) {
			local57.H(0, arg2, 0);
		}
		return local57;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method1424(@OriginalArg(1) Class82 arg0) {
		if (Static285.anInt7798 < 2 && !Static425.aBoolean536 || Static429.aClass344_9 != null) {
			return;
		}
		@Pc(39) String local39;
		if (Static425.aBoolean536 && Static285.anInt7798 < 2) {
			local39 = Static323.aString46 + Static369.aClass235_35.method5893(Static455.anInt7738) + Static372.aString48 + " ->";
		} else if (Static327.aBoolean456 && Static476.aClass62_2.method1421(81) && Static285.anInt7798 > 2) {
			local39 = Static354.method5709(Static165.aClass3_Sub7_Sub19_14);
		} else {
			@Pc(32) Class3_Sub7_Sub19 local32 = Static165.aClass3_Sub7_Sub19_14;
			if (local32 == null) {
				return;
			}
			local39 = Static354.method5709(local32);
			@Pc(41) int[] local41 = null;
			if (Static368.method5890(local32.anInt8564)) {
				local41 = Static298.aClass132_1.method3062((int) local32.aLong229).anIntArray436;
			} else if (local32.anInt8567 != -1) {
				local41 = Static298.aClass132_1.method3062(local32.anInt8567).anIntArray436;
			} else if (Static580.method8102(local32.anInt8564)) {
				@Pc(118) Class3_Sub43 local118 = (Class3_Sub43) Static545.aClass25_40.method426((long) (int) local32.aLong229);
				if (local118 != null) {
					@Pc(123) Class9_Sub2_Sub1_Sub2_Sub2 local123 = local118.aClass9_Sub2_Sub1_Sub2_Sub2_2;
					@Pc(126) Class309 local126 = local123.aClass309_1;
					if (local126.anIntArray553 != null) {
						local126 = local126.method7594(Static183.aClass285_1);
					}
					if (local126 != null) {
						local41 = local126.anIntArray554;
					}
				}
			} else if (Static110.method1823(local32.anInt8564)) {
				@Pc(83) Class330 local83;
				if (local32.anInt8564 == 1009) {
					local83 = Static370.aClass284_3.method6915((int) local32.aLong229);
				} else {
					local83 = Static370.aClass284_3.method6915((int) (local32.aLong229 >>> 32 & 0x7FFFFFFFL));
				}
				if (local83.anIntArray581 != null) {
					local83 = local83.method7892(Static183.aClass285_1);
				}
				if (local83 != null) {
					local41 = local83.anIntArray577;
				}
			}
			if (local41 != null) {
				local39 = local39 + Static103.method1716(local41);
			}
		}
		if (Static285.anInt7798 > 2) {
			local39 = local39 + "<col=ffffff> / " + (Static285.anInt7798 - 2) + Static369.aClass235_28.method5893(Static455.anInt7738);
		}
		if (Static105.aClass344_3 != null) {
			@Pc(256) Class63 local256 = Static105.aClass344_3.method8177(arg0);
			if (local256 == null) {
				local256 = Static374.aClass63_9;
			}
			local256.method7764(Static538.anInt9064, Static105.aClass344_3.anInt9546, Static556.aRandom1, Static105.aClass344_3.anInt9602, local39, Static105.aClass344_3.anInt9543, Static70.anInt1416, Static459.anInt7854, Static234.anIntArray255, Static333.anIntArray344, Static105.aClass344_3.anInt9612, Static105.aClass344_3.anInt9570, Static307.aClass103Array12, Static105.aClass344_3.anInt9600);
			Static283.method4602(Static333.anIntArray344[3], Static333.anIntArray344[1], Static333.anIntArray344[2], Static333.anIntArray344[0]);
		} else if (Static91.aClass344_2 != null && Static483.aClass133_14 == Static431.aClass133_11) {
			@Pc(237) int local237 = Static374.aClass63_9.method7757(Static538.anInt9064, Static307.aClass103Array12, Static518.anInt8728 + 16, Static291.anInt5615 + 4, Static556.aRandom1, Static234.anIntArray255, local39);
			Static283.method4602(16, Static518.anInt8728, local237 + Static426.aClass93_11.method2315(local39), Static291.anInt5615 + 4);
			return;
		}
	}
}
