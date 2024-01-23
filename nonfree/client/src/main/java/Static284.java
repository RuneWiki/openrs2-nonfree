import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "Lclient!cg;")
	public static Class22 aClass22_99;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "Lclient!je;")
	public static Class82 aClass82_3;

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "Lclient!cg;")
	public static Class22 aClass22_100;

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "[I")
	public static int[] anIntArray447;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)I")
	public static int method4438(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = Integer.MAX_VALUE & local11 * (local11 * local11 * 15731 + 789221) + 1376312589;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZB)V")
	public static void method4439(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static115.aClass4_Sub2_Sub18_1 != null) {
			Static136.anInt2689 = Static115.aClass4_Sub2_Sub18_1.anInt4543;
		} else {
			Static136.anInt2689 = -1;
		}
		Static211.aByteArrayArrayArray12 = null;
		Static245.aByteArrayArrayArray14 = null;
		Static301.aByteArrayArrayArray17 = null;
		Static134.aClass97_12 = null;
		Static280.anIntArrayArrayArray14 = null;
		Static108.anIntArrayArrayArray2 = null;
		Static115.aClass4_Sub2_Sub18_1 = null;
		Static219.anInt4212 = 0;
		Static138.aByteArrayArrayArray9 = null;
		Static243.anIntArrayArrayArray13 = null;
		Static112.anIntArray191 = null;
		Static293.aByteArrayArrayArray16 = null;
		Static64.aClass17_9.method618();
		Static299.aClass177_7 = null;
		Static209.aClass100_3 = null;
		Static143.aClass177_6 = null;
		Static132.aClass177_5 = null;
		Static230.anInt4619 = -1;
		Static112.aClass177_3 = null;
		Static165.anInt3317 = -1;
		Static308.aClass177_8 = null;
		Static114.aClass177_4 = null;
		Static248.aClass4_Sub2_Sub4_9 = null;
		Static101.aClass177_2 = null;
		Static74.aClass177_1 = null;
		Static233.aClass4_Sub2_Sub4_Sub2_8 = null;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)I")
	public static int method4440() {
		if (Static250.aFrame2 != null) {
			return 3;
		} else if (Static251.aBoolean330 && Static107.aBoolean124) {
			return 2;
		} else if (Static251.aBoolean330 && !Static107.aBoolean124) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!te;ILclient!te;)V")
	public static void method4442(@OriginalArg(0) Class4 arg0, @OriginalArg(2) Class4 arg1) {
		if (arg1.aClass4_232 != null) {
			arg1.method4690();
		}
		arg1.aClass4_232 = arg0.aClass4_232;
		arg1.aClass4_233 = arg0;
		arg1.aClass4_232.aClass4_233 = arg1;
		arg1.aClass4_233.aClass4_232 = arg1;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([I[Ljava/lang/Object;Z)V")
	public static void method4443(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Static58.method2507(arg0, 0, arg1, arg0.length - 1);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([[FIIILclient!bl;[[I[[FIZIBI[[F[[IIIZ[Z[IZZI)V")
	public static void method4444(@OriginalArg(0) float[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub8 arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) float[][] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) byte arg10, @OriginalArg(12) float[][] arg11, @OriginalArg(13) int[][] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) boolean arg15, @OriginalArg(17) boolean[] arg16, @OriginalArg(18) int[] arg17, @OriginalArg(19) boolean arg18, @OriginalArg(20) boolean arg19, @OriginalArg(21) int arg20) {
		@Pc(16) int local16 = (arg14 << 8) + (arg18 ? 255 : 0);
		@Pc(26) int local26 = (arg8 ? 255 : 0) + (arg7 << 8);
		@Pc(36) int local36 = (arg15 ? 255 : 0) + (arg1 << 8);
		@Pc(46) int local46 = (arg19 ? 255 : 0) + (arg3 << 8);
		@Pc(56) int[] local56 = new int[arg17.length / 2];
		for (@Pc(58) int local58 = 0; local58 < local56.length; local58++) {
			@Pc(68) int local68 = arg17[local58 + local58];
			@Pc(82) int[][] local82 = arg12 == null || arg16 == null || !arg16[local58] ? arg5 : arg12;
			@Pc(91) int local91 = arg17[local58 + local58 + 1];
			local56[local58] = Static265.method4193(arg11, local36, arg6, local16, local68, false, local26, arg20, arg12, local91, arg0, local46, arg13, arg10, local82, arg4, (float) arg2);
		}
		arg4.method573(arg9, arg13, arg20, local56, null, false);
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
	public static void method4445() {
		Static136.aClass172_23.method4350();
		Static177.aClass172_34.method4350();
		Static95.aClass172_18.method4350();
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(B)V")
	public static void method4446() {
		Static51.aClass172_10.method4350();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIBLclient!ao;II)V")
	public static void method4447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class12 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) long local3 = 0L;
		if (arg2 == 0) {
			local3 = Static108.method1836(arg0, arg4, arg5);
		} else if (arg2 == 1) {
			local3 = Static307.method4707(arg0, arg4, arg5);
		} else if (arg2 == 2) {
			local3 = Static4.method65(arg0, arg4, arg5);
		} else if (arg2 == 3) {
			local3 = Static32.method638(arg0, arg4, arg5);
		}
		@Pc(68) int local68 = (int) local3 >> 20 & 0x3;
		@Pc(75) int local75 = (int) local3 >> 14 & 0x1F;
		@Pc(82) int local82 = (int) (local3 >>> 32) & Integer.MAX_VALUE;
		@Pc(86) Class73 local86 = Static296.method4591(local82);
		if (local86.method1909()) {
			Static250.method3843(arg4, arg0, arg5, local86);
		}
		if (local3 == 0L) {
			return;
		}
		@Pc(104) Class13 local104 = null;
		@Pc(106) Class13 local106 = null;
		if (arg2 == 0) {
			@Pc(232) Class181 local232 = Static240.method2138(arg0, arg4, arg5);
			if (local232 != null) {
				local106 = local232.aClass13_10;
				local104 = local232.aClass13_9;
			}
			if (local86.anInt2270 != 0) {
				arg3.method269(!local86.aBoolean132, arg5, local68, local75, arg4, local86.aBoolean128);
			}
		} else if (arg2 == 1) {
			@Pc(117) Class35 local117 = Static262.method4059(arg0, arg4, arg5);
			if (local117 != null) {
				local104 = local117.aClass13_2;
				local106 = local117.aClass13_1;
			}
		} else if (arg2 == 2) {
			@Pc(166) Class99 local166 = Static41.method794(arg0, arg4, arg5);
			if (local166 != null) {
				local104 = local166.aClass13_4;
			}
			if (local86.anInt2270 != 0 && local86.anInt2259 + arg4 < 104 && local86.anInt2259 + arg5 < 104 && arg4 + local86.anInt2253 < 104 && arg5 + local86.anInt2253 < 104) {
				arg3.method278(local86.aBoolean128, local86.anInt2253, local86.anInt2259, !local86.aBoolean132, arg4, arg5, local68);
			}
		} else if (arg2 == 3) {
			@Pc(142) Class67 local142 = Static10.method201(arg0, arg4, arg5);
			if (local142 != null) {
				local104 = local142.aClass13_3;
			}
			if (local86.anInt2270 == 1) {
				arg3.method277(arg5, arg4);
			}
		}
		if (local86.anIntArray196 != null) {
			local86 = local86.method1899();
		}
		if (!Static251.aBoolean330 || local86 == null || !local86.aBoolean140) {
			return;
		}
		if (local75 == 2) {
			if (local104 instanceof Class13_Sub2) {
				((Class13_Sub2) local104).method559();
			} else {
				Static52.method1023(arg4, local86, local68 + 4, arg5, local75, arg1, 0, 0);
			}
			if (local106 instanceof Class13_Sub2) {
				((Class13_Sub2) local106).method559();
			} else {
				Static52.method1023(arg4, local86, local68 + 1 & 0x3, arg5, local75, arg1, 0, 0);
			}
		} else if (local75 == 5) {
			if (local104 instanceof Class13_Sub2) {
				((Class13_Sub2) local104).method559();
			} else {
				Static52.method1023(arg4, local86, local68, arg5, 4, arg1, Static99.anIntArray166[local68] * 8, Static193.anIntArray308[local68] * 8);
			}
		} else if (local75 == 6) {
			if (local104 instanceof Class13_Sub2) {
				((Class13_Sub2) local104).method559();
			} else {
				Static52.method1023(arg4, local86, local68 + 4, arg5, 4, arg1, Static60.anIntArray130[local68] * 8, Static286.anIntArray453[local68] * 8);
			}
		} else if (local75 == 7) {
			if (local104 instanceof Class13_Sub2) {
				((Class13_Sub2) local104).method559();
			} else {
				Static52.method1023(arg4, local86, (local68 + 2 & 0x3) + 4, arg5, 4, arg1, 0, 0);
			}
		} else if (local75 == 8) {
			if (local104 instanceof Class13_Sub2) {
				((Class13_Sub2) local104).method559();
			} else {
				Static52.method1023(arg4, local86, local68 + 4, arg5, 4, arg1, Static60.anIntArray130[local68] * 8, Static286.anIntArray453[local68] * 8);
			}
			if (local106 instanceof Class13_Sub2) {
				((Class13_Sub2) local106).method559();
			} else {
				Static52.method1023(arg4, local86, (local68 + 2 & 0x3) + 4, arg5, 4, arg1, Static60.anIntArray130[local68] * 8, Static286.anIntArray453[local68] * 8);
			}
		} else if (local75 == 11) {
			if (local104 instanceof Class13_Sub2) {
				((Class13_Sub2) local104).method559();
			} else {
				Static52.method1023(arg4, local86, local68 + 4, arg5, 10, arg1, 0, 0);
			}
		} else if (local104 instanceof Class13_Sub2) {
			((Class13_Sub2) local104).method559();
		} else {
			Static52.method1023(arg4, local86, local68, arg5, local75, arg1, 0, 0);
		}
	}
}
