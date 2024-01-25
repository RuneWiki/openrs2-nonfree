import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!ev", name = "y", descriptor = "F")
	public static float aFloat61;

	@OriginalMember(owner = "client!ev", name = "m", descriptor = "Z")
	public static final boolean aBoolean236 = false;

	@OriginalMember(owner = "client!ev", name = "C", descriptor = "[I")
	public static final int[] anIntArray195 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZIIIIIIIII)V")
	public static void method2588(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		if (arg4 < 512 || arg0 < 512 || arg4 > (Static456.anInt7428 - 2) * 512 || arg0 > Static5.anInt112 * 512 - 1024) {
			Static197.anIntArray250[0] = Static197.anIntArray250[1] = -1;
			return;
		}
		@Pc(41) int local41 = Static392.method5799(arg5, arg4, arg0) - arg2;
		if (Static148.aBoolean241) {
			Static472.method6681(true);
		} else {
			Static46.aClass51_5.method6711(arg1, 0, 0);
			Static141.aClass13_27.method8138(Static46.aClass51_5);
		}
		if (Static582.aBoolean678) {
			Static141.aClass13_27.HA(arg4, local41, arg0, Static529.anInt8509, Static197.anIntArray250);
		} else {
			Static141.aClass13_27.da(arg4, local41, arg0, Static197.anIntArray250);
		}
		if (Static148.aBoolean241) {
			Static300.method4737();
		} else {
			Static46.aClass51_5.method6711(-arg1, 0, 0);
			Static141.aClass13_27.method8138(Static46.aClass51_5);
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!ka;IIIILclient!mk;IILclient!ha;ZIIII)Lclient!ka;")
	public static Class193 method2589(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class228 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class13 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (arg0 == null) {
			return null;
		}
		@Pc(16) int local16 = 2055;
		if (arg5 != null) {
			local16 = arg5.method5358(arg6, -1, false) | 0x807;
			local16 &= 0xFFFFFDFF;
		}
		@Pc(53) long local53 = ((long) arg11 << 48) + (long) ((arg10 << 16) + (arg9 + (arg4 << 24))) + ((long) arg2 << 32);
		@Pc(55) Class69 local55 = Static248.aClass69_25;
		@Pc(63) Class193 local63;
		synchronized (Static248.aClass69_25) {
			local63 = (Class193) Static248.aClass69_25.method1919(local53);
		}
		if (local63 == null || arg8.method8163(local63.ua(), local16) != 0) {
			if (local63 != null) {
				local16 = arg8.method8122(local16, local63.ua());
			}
			@Pc(98) byte local98;
			if (arg9 == 1) {
				local98 = 9;
			} else if (arg9 == 2) {
				local98 = 12;
			} else if (arg9 == 3) {
				local98 = 15;
			} else if (arg9 == 4) {
				local98 = 18;
			} else {
				local98 = 21;
			}
			@Pc(133) int[] local133 = new int[] { 64, 96, 128 };
			@Pc(151) Class212 local151 = new Class212(local98 * 3 + 1, local98 * 6 + -local98, 0);
			@Pc(158) int local158 = local151.method4926(0, 0, 0);
			@Pc(162) int[][] local162 = new int[3][local98];
			@Pc(170) int local170;
			@Pc(174) int local174;
			@Pc(176) int local176;
			@Pc(200) int local200;
			for (@Pc(164) int local164 = 0; local164 < 3; local164++) {
				local170 = local133[local164];
				local174 = local133[local164];
				for (local176 = 0; local176 < local98; local176++) {
					@Pc(184) int local184 = (local176 << 14) / local98;
					@Pc(192) int local192 = local170 * Class290.anIntArray546[local184] >> 14;
					local200 = Class290.anIntArray547[local184] * local174 >> 14;
					local162[local164][local176] = local151.method4926(0, local192, local200);
				}
			}
			for (local170 = 0; local170 < 3; local170++) {
				local174 = (local170 * 256 + 128) / 3;
				local176 = 256 - local174;
				@Pc(254) byte local254 = (byte) (arg10 * local176 + local174 * arg4 >> 8);
				@Pc(299) short local299 = (short) ((local176 * (arg2 & 0xFC00) + (arg11 & 0xFC00) * local174 & 0xFC0000) + (local174 * (arg11 & 0x380) + local176 * (arg2 & 0x380) & 0x38000) + ((arg11 & 0x7F) * local174 + (arg2 & 0x7F) * local176 & 0x7F00) >> 8);
				for (local200 = 0; local200 < local98; local200++) {
					if (local170 == 0) {
						local151.method4925((short) -1, local162[0][local200], (byte) -1, local254, local158, local162[0][(local200 + 1) % local98], (byte) 1, local299);
					} else {
						local151.method4925((short) -1, local162[local170][(local200 + 1) % local98], (byte) -1, local254, local162[local170 - 1][local200], local162[local170 - 1][(local200 + 1) % local98], (byte) 1, local299);
						local151.method4925((short) -1, local162[local170][local200], (byte) -1, local254, local162[local170 - 1][local200], local162[local170][(local200 + 1) % local98], (byte) 1, local299);
					}
				}
			}
			local63 = arg8.method8161(local151, local16, Static348.anInt6053, 64, 768);
			@Pc(419) Class69 local419 = Static248.aClass69_25;
			synchronized (Static248.aClass69_25) {
				Static248.aClass69_25.method1917(local53, local63);
			}
		}
		@Pc(435) int local435 = arg0.V();
		@Pc(438) int local438 = arg0.RA();
		@Pc(441) int local441 = arg0.HA();
		@Pc(444) int local444 = arg0.G();
		@Pc(446) Class2_Sub7_Sub6 local446 = null;
		if (arg5 != null) {
			@Pc(453) int local453 = arg5.anIntArray403[arg6];
			local446 = Static479.aClass308_2.method7074(local453 >> 16);
			arg6 = local453 & 0xFFFF;
		}
		if (local446 == null) {
			local63 = local63.method6609((byte) 3, local16, true);
			local63.O(local438 - local435 >> 1, 128, local444 - local441 >> 1);
			local63.H(local438 + local435 >> 1, 0, local444 + local441 >> 1);
		} else {
			local63 = local63.method6609((byte) 3, local16, true);
			local63.O(local438 - local435 >> 1, 128, local444 - local441 >> 1);
			local63.H(local435 + local438 >> 1, 0, local444 + local441 >> 1);
			local63.method6632(local446, arg6);
		}
		if (arg3 != 0) {
			local63.FA(arg3);
		}
		if (arg7 != 0) {
			local63.VA(arg7);
		}
		if (arg12 != 0) {
			local63.H(0, arg12, 0);
		}
		return local63;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(BLclient!ei;)V")
	public static void method2590(@OriginalArg(1) Class2_Sub17_Sub1 arg0) {
		arg0.method2827(Static321.aClass238_147.method5599());
		arg0.method2827(Static550.aClass238_250.method5599());
		arg0.method2827(Static215.aClass238_103.method5599());
		arg0.method2827(Static493.aClass238_222.method5599());
		arg0.method2827(Static75.aClass238_236.method5599());
		arg0.method2827(Static122.aClass238_58.method5599());
		arg0.method2827(Static609.aClass238_284.method5599());
		arg0.method2827(Static72.aClass238_40.method5599());
		arg0.method2827(Static497.aClass238_223.method5599());
		arg0.method2827(Class16_Sub1_Sub1_Sub2.lb.method5599());
		arg0.method2827(Static143.aClass238_70.method5599());
		arg0.method2827(Static355.aClass238_164.method5599());
		arg0.method2827(Static222.aClass238_106.method5599());
		arg0.method2827(Static419.aClass238_210.method5599());
		arg0.method2827(Static441.aClass238_203.method5599());
		arg0.method2827(Static29.aClass238_16.method5599());
		arg0.method2827(Static425.aClass238_197.method5599());
		arg0.method2827(Static120.aClass238_57.method5599());
		arg0.method2827(Static26.aClass238_15.method5599());
		arg0.method2827(Static444.aClass238_206.method5599());
		arg0.method2827(Static556.aClass238_253.method5599());
		arg0.method2827(Static258.aClass238_119.method5599());
		arg0.method2827(Static367.aClass238_170.method5599());
		arg0.method2827(Static178.aClass238_289.method5599());
		arg0.method2827(Static332.aClass238_154.method5599());
		arg0.method2827(Static388.aClass238_178.method5599());
		arg0.method2827(Static213.aClass238_102.method5599());
		arg0.method2827(Static305.aClass238_141.method5599());
		arg0.method2827(Static546.aClass238_245.method5599());
		arg0.method2827(Static562.aClass238_256.method5599());
		arg0.method2827(Static306.aClass238_142.method5599());
		arg0.method2827(Static98.aClass238_299.method5599());
		arg0.method2827(Static497.method6927());
		arg0.method2827(Static142.method2571());
		arg0.method2827(Static188.aClass238_91.method5599());
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method2592(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Class337 local11 = Static176.aClass337Array1[99];
		for (@Pc(13) int local13 = 99; local13 > 0; local13--) {
			Static176.aClass337Array1[local13] = Static176.aClass337Array1[local13 - 1];
		}
		if (local11 == null) {
			local11 = new Class337(arg1, arg7, arg4, arg3, arg0, arg6, arg2, arg5);
		} else {
			local11.method7859(arg3, arg2, arg1, arg5, arg0, arg7, arg6, arg4);
		}
		Static227.anInt4204++;
		Static176.aClass337Array1[0] = local11;
		Static30.anInt557 = Static148.anInt3063;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIII)V")
	public static void method2593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= arg2) {
			Static188.method3208(arg0, arg3, arg2, Static349.anIntArrayArray71[arg1]);
		} else {
			Static188.method3208(arg2, arg3, arg0, Static349.anIntArrayArray71[arg1]);
		}
	}
}
