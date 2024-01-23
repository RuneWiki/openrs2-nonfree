import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "Lclient!ug;")
	public static Class1_Sub2_Sub14 aClass1_Sub2_Sub14_5;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
	public static int anInt4717;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Z")
	public static boolean aBoolean252 = false;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
	public static int anInt4711 = 0;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)Lclient!cn;")
	public static Class32 method3734(@OriginalArg(0) int arg0) {
		@Pc(10) Class32 local10 = (Class32) Static99.aClass155_17.method4358((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(30) byte[] local30 = Static224.aClass83_150.method2306(29, arg0);
		local10 = new Class32();
		if (local30 != null) {
			local10.method881(arg0, new Class1_Sub16(local30));
		}
		Static99.aClass155_17.method4360((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIZIII)V")
	public static void method3735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == arg5) {
			Static89.method1537(arg3, arg6, arg0, arg1, arg4, arg2);
		} else if (arg1 - arg0 >= Static102.anInt2239 && arg1 + arg0 <= Static88.anInt2052 && Static152.anInt3532 <= arg4 - arg5 && arg5 + arg4 <= Static223.anInt1245) {
			Static5.method103(arg5, arg2, arg0, arg1, arg4, arg6, arg3);
		} else {
			Static14.method313(arg5, arg1, arg3, arg2, arg0, arg6, arg4);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIZIZIZLclient!sh;I)Lclient!ug;")
	public static Class1_Sub2_Sub14 method3737(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class147 arg6, @OriginalArg(8) int arg7) {
		@Pc(5) Class138 local5 = Static238.method4099(arg4);
		if (arg0 > 1 && local5.anIntArray527 != null) {
			@Pc(14) int local14 = -1;
			for (@Pc(16) int local16 = 0; local16 < 10; local16++) {
				if (arg0 >= local5.anIntArray526[local16] && local5.anIntArray526[local16] != 0) {
					local14 = local5.anIntArray527[local16];
				}
			}
			if (local14 != -1) {
				local5 = Static238.method4099(local14);
			}
		}
		@Pc(63) Class25_Sub2_Sub2 local63 = local5.method4003(arg6);
		if (local63 == null) {
			return null;
		}
		@Pc(70) Class1_Sub2_Sub14_Sub1 local70 = null;
		if (local5.anInt5028 != -1) {
			local70 = (Class1_Sub2_Sub14_Sub1) method3737(10, true, 1, true, local5.anInt5059, false, arg6, 0);
			if (local70 == null) {
				return null;
			}
		} else if (local5.anInt5064 != -1) {
			local70 = (Class1_Sub2_Sub14_Sub1) method3737(arg0, false, arg2, true, local5.anInt5044, false, arg6, arg7);
			if (local70 == null) {
				return null;
			}
		}
		@Pc(120) int[] local120 = Static203.anIntArray460;
		@Pc(123) int[] local123 = new int[4];
		@Pc(125) int local125 = Static203.anInt4511;
		@Pc(127) int local127 = Static203.anInt4507;
		Static203.method3593(local123);
		@Pc(135) Class1_Sub2_Sub14_Sub1 local135 = new Class1_Sub2_Sub14_Sub1(36, 32);
		Static203.method3591(local135.anIntArray294, 36, 32);
		Static151.method2838();
		Static151.method2836(16, 16);
		@Pc(147) int local147 = local5.anInt5056;
		Static151.aBoolean179 = false;
		if (arg1) {
			local147 = (int) ((double) local147 * 1.5D);
		} else if (arg2 == 2) {
			local147 = (int) ((double) local147 * 1.04D);
		}
		@Pc(192) int local192 = Class91.anIntArray320[local5.anInt5043] * local147 >> 16;
		@Pc(201) int local201 = local147 * Class91.anIntArray319[local5.anInt5043] >> 16;
		local63.method3487(local5.anInt5041, local5.anInt5029, local5.anInt5043, local5.anInt5030, local201 + local5.anInt5049 - local63.method4773() / 2, local5.anInt5049 + local192, -1L);
		if (arg2 >= 1) {
			local135.method2476(1);
			if (arg2 >= 2) {
				local135.method2476(16777215);
			}
			Static203.method3591(local135.anIntArray294, 36, 32);
		}
		if (arg7 != 0) {
			local135.method2479(arg7);
		}
		if (local5.anInt5028 != -1) {
			local70.method2727(0, 0);
		} else if (local5.anInt5064 != -1) {
			Static203.method3591(local70.anIntArray294, 36, 32);
			local135.method2727(0, 0);
			local135 = local70;
		}
		if (arg5 && (local5.anInt5053 == 1 || arg0 != 1) && arg0 != -1) {
			Static251.aClass1_Sub2_Sub16_Sub2_2.method3981(Static55.method1117(arg0), 0, 9, 16776960, 1);
		}
		Static203.method3591(local120, local127, local125);
		Static203.method3605(local123);
		Static151.method2838();
		Static151.aBoolean179 = true;
		return Static296.aBoolean335 && !arg3 ? new Class1_Sub2_Sub14_Sub2(local135) : local135;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILclient!im;Lclient!gn;)V")
	public static void method3738(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub16 arg1, @OriginalArg(3) Class66 arg2) {
		@Pc(13) Class1_Sub7 local13 = new Class1_Sub7();
		local13.anInt1386 = arg1.method2655();
		local13.anInt1387 = arg1.method2610();
		local13.anIntArray144 = new int[local13.anInt1386];
		local13.aClass43Array1 = new Class43[local13.anInt1386];
		local13.anIntArray143 = new int[local13.anInt1386];
		local13.anIntArray145 = new int[local13.anInt1386];
		local13.aClass43Array2 = new Class43[local13.anInt1386];
		local13.aByteArrayArrayArray8 = new byte[local13.anInt1386][][];
		for (@Pc(55) int local55 = 0; local55 < local13.anInt1386; local55++) {
			try {
				@Pc(65) int local65 = arg1.method2655();
				@Pc(84) String local84;
				@Pc(90) String local90;
				@Pc(86) int local86;
				if (local65 == 0 || local65 == 1 || local65 == 2) {
					local84 = arg1.method2611();
					local86 = 0;
					local90 = arg1.method2611();
					if (local65 == 1) {
						local86 = arg1.method2610();
					}
					local13.anIntArray144[local55] = local65;
					local13.anIntArray145[local55] = local86;
					local13.aClass43Array1[local55] = arg2.method1614(local90, Static37.method851(local84));
				} else if (local65 == 3 || local65 == 4) {
					local84 = arg1.method2611();
					local90 = arg1.method2611();
					local86 = arg1.method2655();
					@Pc(144) String[] local144 = new String[local86];
					for (@Pc(146) int local146 = 0; local146 < local86; local146++) {
						local144[local146] = arg1.method2611();
					}
					@Pc(165) byte[][] local165 = new byte[local86][];
					@Pc(179) int local179;
					if (local65 == 3) {
						for (@Pc(172) int local172 = 0; local172 < local86; local172++) {
							local179 = arg1.method2610();
							local165[local172] = new byte[local179];
							arg1.method2665(local165[local172], local179);
						}
					}
					local13.anIntArray144[local55] = local65;
					@Pc(203) Class[] local203 = new Class[local86];
					for (local179 = 0; local179 < local86; local179++) {
						local203[local179] = Static37.method851(local144[local179]);
					}
					local13.aClass43Array2[local55] = arg2.method1609(local90, local203, Static37.method851(local84));
					local13.aByteArrayArrayArray8[local55] = local165;
				}
			} catch (@Pc(242) ClassNotFoundException local242) {
				local13.anIntArray143[local55] = -1;
			} catch (@Pc(249) SecurityException local249) {
				local13.anIntArray143[local55] = -2;
			} catch (@Pc(256) NullPointerException local256) {
				local13.anIntArray143[local55] = -3;
			} catch (@Pc(263) Exception local263) {
				local13.anIntArray143[local55] = -4;
			} catch (@Pc(270) Throwable local270) {
				local13.anIntArray143[local55] = -5;
			}
		}
		Static282.aClass131_27.method3799(local13);
	}
}
