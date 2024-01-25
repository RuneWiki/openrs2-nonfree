import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!hs", name = "x", descriptor = "Lclient!ir;")
	public static Class100 aClass100_57;

	@OriginalMember(owner = "client!hs", name = "D", descriptor = "Lclient!wh;")
	public static Interface9 anInterface9_2;

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "[I")
	public static final int[] anIntArray166 = new int[14];

	@OriginalMember(owner = "client!hs", name = "p", descriptor = "J")
	public static volatile long aLong97 = 0L;

	@OriginalMember(owner = "client!hs", name = "u", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[200];

	@OriginalMember(owner = "client!hs", name = "v", descriptor = "I")
	public static int anInt2647 = 0;

	@OriginalMember(owner = "client!hs", name = "z", descriptor = "I")
	public static int anInt2650 = -1;

	@OriginalMember(owner = "client!hs", name = "C", descriptor = "Ljava/lang/String;")
	public static final String aString97 = "yellow:";

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IZIIZ)V")
	public static void method2156(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static65.method1707(arg0, arg2, 0, arg3, Static302.aClass58_Sub1Array2.length - 1, arg1);
		Static169.anInt3574 = 0;
		Static91.aClass3_Sub33_1 = null;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
	public static void method2157() {
		Static135.anInt2791 = Static303.aClass209_9.anInt6521 + Static303.aClass209_9.anInt6517 + 2;
		Static225.anInt5462 = Static191.aClass209_6.anInt6521 + Static191.aClass209_6.anInt6517 + 2;
		Static265.aStringArray34 = new String[350 / Static135.anInt2791];
		for (@Pc(28) int local28 = 0; local28 < Static265.aStringArray34.length; local28++) {
			Static265.aStringArray34[local28] = "";
		}
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
	public static void method2158() {
		if (Static194.aClass30_1 != null) {
			Static194.aClass30_1.method4527();
		}
		if (Static348.aClass30_2 != null) {
			Static348.aClass30_2.method4527();
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BZ)V")
	public static void method2160(@OriginalArg(1) boolean arg0) {
		@Pc(9) byte local9;
		@Pc(11) byte[][] local11;
		if (arg0) {
			local9 = 1;
			local11 = Static112.aByteArrayArray12;
		} else {
			local9 = 4;
			local11 = Static290.aByteArrayArray19;
		}
		@Pc(20) int local20 = local11.length;
		@Pc(41) int local41;
		@Pc(53) int local53;
		for (@Pc(27) int local27 = 0; local27 < local20; local27++) {
			@Pc(31) int[] local31 = null;
			@Pc(35) byte[] local35 = local11[local27];
			local41 = Static169.anIntArray239[local27] >> 8;
			@Pc(47) int local47 = Static169.anIntArray239[local27] & 0xFF;
			local53 = local41 * 64 - Static186.anInt3094;
			@Pc(60) int local60 = local47 * 64 - Static296.anInt5889;
			if (local35 != null) {
				method2158();
				local31 = Static221.method3875(local60, local53, Static186.anInt3094, arg0, local35, Static296.anInt5889, Static212.aClass122_2, local9, Static34.aClass13Array1);
			}
			if (!arg0 && Static16.anInt512 / 8 == local41 && Static130.anInt2745 / 8 == local47) {
				if (local31 == null) {
					Static55.aClass26_3 = null;
				} else {
					Static55.aClass26_3 = Static309.method5204(local31[1], local31[2], local31[0], local31[3]);
					Static90.anInt1786 = local31[4];
				}
			}
		}
		for (@Pc(127) int local127 = 0; local127 < local20; local127++) {
			@Pc(140) int local140 = (Static169.anIntArray239[local127] >> 8) * 64 - Static186.anInt3094;
			local41 = (Static169.anIntArray239[local127] & 0xFF) * 64 - Static296.anInt5889;
			@Pc(155) byte[] local155 = local11[local127];
			if (local155 == null && Static130.anInt2745 < 800) {
				method2158();
				for (local53 = 0; local53 < local9; local53++) {
					Static37.method5457(local53, local140, 64, 64, local41);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I[IIJ)Ljava/lang/String;")
	public static String method2161(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) long arg2) {
		if (Static286.anInterface7_1 != null) {
			@Pc(17) String local17 = Static286.anInterface7_1.method1573(arg0, arg1, arg2);
			if (local17 != null) {
				return local17;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)V")
	public static void method2162() {
		if (Static295.method5004() != 2) {
			return;
		}
		@Pc(17) byte local17 = (byte) (Static293.anInt6246 - 4 & 0xFF);
		@Pc(21) int local21 = Static293.anInt6246 % Static162.anInt2152;
		@Pc(27) int local27;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			for (local27 = 0; local27 < Static122.anInt2632; local27++) {
				Static219.aByteArrayArrayArray10[local23][local21][local27] = local17;
			}
		}
		if (Static163.anInt3184 == 3) {
			return;
		}
		for (local27 = 0; local27 < 2; local27++) {
			Static51.anIntArray69[local27] = -1000000;
			Static27.anIntArray36[local27] = 1000000;
			Static111.anIntArray139[local27] = 0;
			Static122.anIntArray164[local27] = 1000000;
			Static160.anIntArray218[local27] = 0;
		}
		@Pc(131) int local131;
		if (Static261.anInt5200 != 1) {
			local131 = Static286.method4919(Static110.anInt2324, Static210.anInt4317, Static163.anInt3184);
			if (local131 - Static175.anInt3631 >= 800 || (Static160.aByteArrayArrayArray9[Static163.anInt3184][Static110.anInt2324 >> 7][Static210.anInt4317 >> 7] & 0x4) == 0) {
				return;
			}
			Static158.method2508(false, Static210.anInt4317 >> 7, 1, Static110.anInt2324 >> 7, Static256.aClass45ArrayArrayArray2);
			return;
		}
		if ((Static160.aByteArrayArrayArray9[Static163.anInt3184][Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5901 >> 7][Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5905 >> 7] & 0x4) != 0) {
			Static158.method2508(false, Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5905 >> 7, 0, Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5901 >> 7, Static256.aClass45ArrayArrayArray2);
		}
		if (Static154.anInt6368 >= 2560) {
			return;
		}
		local131 = Static110.anInt2324 >> 7;
		@Pc(135) int local135 = Static210.anInt4317 >> 7;
		@Pc(140) int local140 = Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5901 >> 7;
		@Pc(145) int local145 = Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5905 >> 7;
		@Pc(157) int local157;
		if (local131 >= local140) {
			local157 = local131 - local140;
		} else {
			local157 = local140 - local131;
		}
		@Pc(174) int local174;
		if (local145 > local135) {
			local174 = local145 - local135;
		} else {
			local174 = local135 - local145;
		}
		if ((local157 != 0 || local174 != 0) && (-Static162.anInt2152) < local157 && Static162.anInt2152 > local157 && -Static122.anInt2632 < local174 && local174 < Static122.anInt2632) {
			@Pc(251) int local251;
			@Pc(253) int local253;
			if (local174 >= local157) {
				local251 = local157 * 65536 / local174;
				local253 = 32768;
				while (local135 != local145) {
					if (local135 < local145) {
						local135++;
					} else if (local135 > local145) {
						local135--;
					}
					if ((Static160.aByteArrayArrayArray9[Static163.anInt3184][local131][local135] & 0x4) != 0) {
						Static158.method2508(false, local135, 1, local131, Static256.aClass45ArrayArrayArray2);
						return;
					}
					local253 += local251;
					if (local253 >= 65536) {
						if (local140 > local131) {
							local131++;
						} else if (local140 < local131) {
							local131--;
						}
						local253 -= 65536;
						if ((Static160.aByteArrayArrayArray9[Static163.anInt3184][local131][local135] & 0x4) != 0) {
							Static158.method2508(false, local135, 1, local131, Static256.aClass45ArrayArrayArray2);
							return;
						}
					}
				}
				return;
			}
			local251 = local174 * 65536 / local157;
			local253 = 32768;
			while (local140 != local131) {
				if (local131 < local140) {
					local131++;
				} else if (local131 > local140) {
					local131--;
				}
				if ((Static160.aByteArrayArrayArray9[Static163.anInt3184][local131][local135] & 0x4) != 0) {
					Static158.method2508(false, local135, 1, local131, Static256.aClass45ArrayArrayArray2);
					return;
				}
				local253 += local251;
				if (local253 >= 65536) {
					if (local145 > local135) {
						local135++;
					} else if (local145 < local135) {
						local135--;
					}
					local253 -= 65536;
					if ((Static160.aByteArrayArrayArray9[Static163.anInt3184][local131][local135] & 0x4) != 0) {
						Static158.method2508(false, local135, 1, local131, Static256.aClass45ArrayArrayArray2);
						return;
					}
				}
			}
			return;
		}
		Static69.method1091("RC: " + local131 + "," + local135 + " " + local140 + "," + local145 + " " + Static186.anInt3094 + "," + Static296.anInt5889, null);
		return;
	}

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "(I)V")
	public static void method2163() {
		for (@Pc(7) int local7 = 0; local7 < Static283.anInt4489; local7++) {
			@Pc(13) int local13 = Static303.anIntArray447[local7];
			@Pc(17) Class5_Sub4_Sub4_Sub1 local17 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local13];
			@Pc(21) int local21 = Static20.aClass3_Sub4_Sub2_1.method3643();
			if ((local21 & 0x4) != 0) {
				local21 += Static20.aClass3_Sub4_Sub2_1.method3643() << 8;
			}
			Static29.method593(local13, local21, local17);
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BB)V")
	public static void method2164(@OriginalArg(0) byte arg0) {
		if (Static219.aByteArrayArrayArray10 == null) {
			Static219.aByteArrayArrayArray10 = new byte[4][Static162.anInt2152][Static122.anInt2632];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static162.anInt2152; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static122.anInt2632; local22++) {
					Static219.aByteArrayArrayArray10[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)I")
	public static int method2165(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5) {
		if (arg1 < 128 || arg5 < 128 || arg1 > (Static162.anInt2152 - 2) * 128 || (Static122.anInt2632 - 2) * 128 < arg5) {
			Static187.anIntArray302[0] = Static187.anIntArray302[1] = -1;
			return;
		}
		@Pc(45) int local45 = Static286.method4919(arg1, arg5, Static163.anInt3184) - arg0;
		Static200.aClass56_3.method4691(arg3, 0, 0);
		Static212.aClass122_2.method4785(Static200.aClass56_3);
		Static212.aClass122_2.method4763(arg1, local45, arg5, Static187.anIntArray302);
		Static200.aClass56_3.method4691(-arg3, 0, 0);
		Static212.aClass122_2.method4785(Static200.aClass56_3);
	}
}
