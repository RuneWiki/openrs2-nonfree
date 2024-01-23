import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!di", name = "m", descriptor = "I")
	public static int anInt1156;

	@OriginalMember(owner = "client!di", name = "q", descriptor = "[I")
	public static int[] anIntArray91;

	@OriginalMember(owner = "client!di", name = "u", descriptor = "I")
	public static int anInt1161;

	@OriginalMember(owner = "client!di", name = "s", descriptor = "I")
	public static int anInt1159 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method979(@OriginalArg(1) String arg0) {
		return Static103.method1979(arg0);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZIIILclient!sm;IIILclient!sb;IIIII)Lclient!sm;")
	public static Class11_Sub1 method980(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class11_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class152 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(13) int arg12) {
		@Pc(27) long local27 = ((long) arg2 << 48) + ((long) ((arg11 << 24) + arg6 + (arg7 << 16)) + ((long) arg3 << 32));
		@Pc(33) Class11_Sub1 local33 = (Class11_Sub1) Static145.aClass175_22.method4295(local27);
		@Pc(116) int local116;
		@Pc(118) int local118;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(155) int local155;
		if (local33 == null) {
			@Pc(42) byte local42;
			if (arg6 == 1) {
				local42 = 9;
			} else if (arg6 == 2) {
				local42 = 12;
			} else if (arg6 == 3) {
				local42 = 15;
			} else if (arg6 == 4) {
				local42 = 18;
			} else {
				local42 = 21;
			}
			@Pc(91) Class11_Sub5 local91 = new Class11_Sub5(local42 * 3 + 1, -local42 + local42 * 3 * 2, 0);
			@Pc(106) int[] local106 = new int[] { 64, 96, 128 };
			@Pc(110) int[][] local110 = new int[3][local42];
			local116 = local91.method3077(0, 0);
			for (local118 = 0; local118 < 3; local118++) {
				local129 = local106[local118];
				local133 = local106[local118];
				for (@Pc(135) int local135 = 0; local135 < local42; local135++) {
					@Pc(144) int local144 = (local135 << 11) / local42;
					local155 = arg5 + local129 * Class87.anIntArray173[local144] >> 16;
					@Pc(165) int local165 = arg9 + Class87.anIntArray177[local144] * local133 >> 16;
					local110[local118][local135] = local91.method3077(local155, local165);
				}
			}
			for (local118 = 0; local118 < 3; local118++) {
				local129 = (local118 * 256 + 128) / 3;
				local133 = 256 - local129;
				@Pc(214) byte local214 = (byte) (local129 * arg11 + arg7 * local133 >> 8);
				@Pc(259) short local259 = (short) (((arg3 & 0xFC00) * local133 + local129 * (arg2 & 0xFC00) & 0xFC0000) + (local129 * (arg2 & 0x380) + (arg3 & 0x380) * local133 & 0x38000) + ((arg2 & 0x7F) * local129 + (arg3 & 0x7F) * local133 & 0x7F00) >> 8);
				for (local155 = 0; local155 < local42; local155++) {
					if (local118 == 0) {
						local91.method3068(local116, local110[0][(local155 + 1) % local42], local110[0][local155], local259, local214);
					} else {
						local91.method3068(local110[local118 - 1][local155], local110[local118 - 1][(local155 + 1) % local42], local110[local118][(local155 + 1) % local42], local259, local214);
						local91.method3068(local110[local118 - 1][local155], local110[local118][(local155 + 1) % local42], local110[local118][local155], local259, local214);
					}
				}
			}
			local33 = local91.method3055(64, 768, -50, -10, -50);
			Static145.aClass175_22.method4285(local33, local27);
		}
		@Pc(374) int local374 = arg6 * 64 - 1;
		@Pc(377) int local377 = -local374;
		local116 = local374;
		@Pc(382) int local382 = arg4.method2914();
		@Pc(385) int local385 = -local374;
		local118 = arg4.method2921();
		local129 = arg4.method2899();
		@Pc(398) int local398 = local374;
		if (arg0) {
			if (arg1 > 1152 && arg1 < 1920) {
				local398 = local374 + 128;
			}
			if (arg1 > 128 && arg1 < 896) {
				local377 -= 128;
			}
			if (arg1 > 640 && arg1 < 1408) {
				local116 = local374 + 128;
			}
			if (arg1 > 1664 || arg1 < 384) {
				local385 -= 128;
			}
		}
		if (local118 > local398) {
			local118 = local398;
		}
		if (local377 > local382) {
			local382 = local377;
		}
		if (local385 > local129) {
			local129 = local385;
		}
		@Pc(457) Class1_Sub5_Sub4 local457 = null;
		local133 = arg4.method2906();
		if (local116 < local133) {
			local133 = local116;
		}
		if (arg8 != null) {
			@Pc(478) int local478 = arg8.anIntArray509[arg10];
			local457 = Static278.method4265(local478 >> 16);
			arg10 = local478 & 0xFFFF;
		}
		if (local457 == null) {
			local33 = local33.method2907(true, true, true);
			local33.method2902((local118 - local382) / 2, 128, (local133 - local129) / 2);
			local33.method2913((local382 + local118) / 2, 0, (local133 + local129) / 2);
		} else {
			local33 = local33.method2907(!local457.method895(arg10), !local457.method894(arg10), true);
			local33.method2902((local118 - local382) / 2, 128, (local133 - local129) / 2);
			local33.method2913((local382 + local118) / 2, 0, (local133 + local129) / 2);
			local33.method2923(local457, arg10);
		}
		if (arg1 != 0) {
			local33.method2909(arg1);
		}
		if (Static71.aBoolean165) {
			@Pc(659) Class11_Sub1_Sub1 local659 = (Class11_Sub1_Sub1) local33;
			if (Static42.method768(arg5 + local382, Static132.anInt2608, local129 + arg9) != arg12 || Static42.method768(local118 + arg5, Static132.anInt2608, local133 + arg9) != arg12) {
				for (local155 = 0; local155 < local659.anInt436; local155++) {
					local659.anIntArray45[local155] += Static42.method768(arg5 + local659.anIntArray46[local155], Static132.anInt2608, arg9 + local659.anIntArray41[local155]) - arg12;
				}
				local659.aClass36_1.aBoolean117 = false;
				local659.aClass92_1.aBoolean224 = false;
			}
		} else {
			@Pc(590) Class11_Sub1_Sub2 local590 = (Class11_Sub1_Sub2) local33;
			if (Static42.method768(arg5 + local382, Static132.anInt2608, arg9 + local129) != arg12 || Static42.method768(local118 + arg5, Static132.anInt2608, local133 + arg9) != arg12) {
				for (local155 = 0; local155 < local590.anInt3320; local155++) {
					local590.anIntArray311[local155] += Static42.method768(local590.anIntArray312[local155] + arg5, Static132.anInt2608, local590.anIntArray319[local155] + arg9) - arg12;
				}
				local590.aBoolean290 = false;
			}
		}
		return local33;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V")
	public static void method981() {
		Static269.anIntArray553 = null;
		Static259.aByteArrayArrayArray15 = null;
		Static4.anIntArray15 = null;
		Static3.anIntArray12 = null;
		Static261.anIntArray546 = null;
		Static166.anIntArray298 = null;
		Static73.aByteArrayArrayArray3 = null;
		Static101.aByteArrayArrayArray4 = null;
		Static13.anIntArray25 = null;
		Static4.anIntArrayArrayArray1 = null;
		Static312.aByteArrayArrayArray21 = null;
		Static204.aByteArrayArrayArray9 = null;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(III)I")
	public static int method982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = arg0 >> 31 & arg1 - 1;
		return local17 + ((arg0 >>> 31) + arg0) % arg1;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!nm;ZI)Lclient!lj;")
	public static Class1_Sub5_Sub6 method983(@OriginalArg(0) Class119 arg0, @OriginalArg(2) int arg1) {
		return Static219.method3548(arg0, arg1) ? Static175.method2998() : null;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!il;Lclient!wm;B)Lclient!jb;")
	public static Class1_Sub15 method984(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class192 arg1) {
		@Pc(35) long local35 = ((long) arg1.anInt5623 << 32) + ((long) arg1.anInt5626 << 56) + (long) ((arg1.anInt5629 + 1 << 16) - -arg1.anInt5625);
		@Pc(41) Class1_Sub15 local41 = (Class1_Sub15) arg0.method2136(local35);
		if (local41 == null) {
			local41 = new Class1_Sub15(arg1.anInt5629, (float) arg1.anInt5625, true, false, arg1.anInt5623);
			arg0.method2144(local41, local35);
		}
		return local41;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BJ)V")
	public static void method986(@OriginalArg(1) long arg0) {
		if (!Static240.aBoolean404) {
			Static8.aFloat4 += Static241.aFloat81 * (float) arg0 / 40.0F;
			Static148.aFloat64 += Static273.aFloat91 * (float) arg0 / 40.0F;
		}
		@Pc(41) int local41 = Static138.aClass11_Sub4_Sub1_3.anInt3865 + Static310.anInt5536;
		@Pc(47) int local47 = Static138.aClass11_Sub4_Sub1_3.anInt3856 + Static1.anInt50;
		if (Static21.anInt443 - local41 < -500 || Static21.anInt443 - local41 > 500 || Static106.anInt3753 - local47 < -500 || Static106.anInt3753 - local47 > 500) {
			Static21.anInt443 = local41;
			Static106.anInt3753 = local47;
		}
		@Pc(86) int local86;
		@Pc(94) int local94;
		if (local41 != Static21.anInt443) {
			local86 = local41 - Static21.anInt443;
			local94 = (int) ((long) local86 * arg0 / 320L);
			if (local86 <= 0) {
				if (local94 == 0) {
					local94 = -1;
				} else if (local94 < local86) {
					local94 = local86;
				}
			} else if (local94 == 0) {
				local94 = 1;
			} else if (local86 < local94) {
				local94 = local86;
			}
			Static21.anInt443 += local94;
		}
		if (Static106.anInt3753 != local47) {
			local86 = local47 - Static106.anInt3753;
			local94 = (int) ((long) local86 * arg0 / 320L);
			if (local86 <= 0) {
				if (local94 == 0) {
					local94 = -1;
				} else if (local86 > local94) {
					local94 = local86;
				}
			} else if (local94 == 0) {
				local94 = 1;
			} else if (local94 > local86) {
				local94 = local86;
			}
			Static106.anInt3753 += local94;
		}
		Static248.method3885();
	}
}
