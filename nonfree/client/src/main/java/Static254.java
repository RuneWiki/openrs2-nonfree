import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!th", name = "z", descriptor = "I")
	public static int anInt5397;

	@OriginalMember(owner = "client!th", name = "M", descriptor = "I")
	public static int anInt5407;

	@OriginalMember(owner = "client!th", name = "N", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!th", name = "A", descriptor = "I")
	public static int anInt5398 = 0;

	@OriginalMember(owner = "client!th", name = "D", descriptor = "I")
	public static int anInt5401 = 0;

	@OriginalMember(owner = "client!th", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString169 = "Allocated memory";

	@OriginalMember(owner = "client!th", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString170 = "Close";

	@OriginalMember(owner = "client!th", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString171 = "Connected to update server";

	@OriginalMember(owner = "client!th", name = "O", descriptor = "I")
	public static int anInt5408 = 0;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BII)V")
	public static void method4235(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14;
		if (arg1 != Static75.anInt1848) {
			Static157.anIntArray331 = new int[arg1];
			for (local14 = 0; local14 < arg1; local14++) {
				Static157.anIntArray331[local14] = (local14 << 12) / arg1;
			}
			Static229.anInt5035 = arg1 * 32;
			Static75.anInt1848 = arg1;
			Static145.anInt3482 = arg1 - 1;
		}
		if (Static6.anInt2264 == arg0) {
			return;
		}
		if (Static75.anInt1848 == arg0) {
			Static98.anIntArray221 = Static157.anIntArray331;
		} else {
			Static98.anIntArray221 = new int[arg0];
			for (local14 = 0; local14 < arg0; local14++) {
				Static98.anIntArray221[local14] = (local14 << 12) / arg0;
			}
		}
		Static6.anInt2264 = arg0;
		Static178.anInt4007 = arg0 - 1;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIBILclient!de;II)V")
	public static void method4236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class36 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = 0L;
		if (arg5 == 0) {
			local7 = Static172.method3180(arg1, arg0, arg4);
		} else if (arg5 == 1) {
			local7 = Static150.method1227(arg1, arg0, arg4);
		} else if (arg5 == 2) {
			local7 = Static199.method3572(arg1, arg0, arg4);
		} else if (arg5 == 3) {
			local7 = Static242.method4165(arg1, arg0, arg4);
		}
		@Pc(57) int local57 = (int) local7 >> 14 & 0x1F;
		@Pc(68) int local68 = (int) local7 >> 20 & 0x3;
		@Pc(75) int local75 = (int) (local7 >>> 32) & Integer.MAX_VALUE;
		@Pc(79) Class30 local79 = Static268.method4511(local75);
		if (local79.method690()) {
			Static217.method3826(arg1, local79, arg4, arg0);
		}
		if (local7 == 0L) {
			return;
		}
		@Pc(101) Class25 local101 = null;
		@Pc(103) Class25 local103 = null;
		if (arg5 == 0) {
			@Pc(229) Class133 local229 = Static238.method4100(arg1, arg0, arg4);
			if (local229 != null) {
				local103 = local229.aClass25_4;
				local101 = local229.aClass25_5;
			}
			if (local79.anInt852 != 0) {
				arg3.method953(local79.aBoolean56, !local79.aBoolean48, local68, arg0, arg4, local57);
			}
		} else if (arg5 == 1) {
			@Pc(118) Class101 local118 = Static12.method242(arg1, arg0, arg4);
			if (local118 != null) {
				local101 = local118.aClass25_2;
				local103 = local118.aClass25_3;
			}
		} else if (arg5 == 2) {
			@Pc(136) Class152 local136 = Static12.method237(arg1, arg0, arg4);
			if (local136 != null) {
				local103 = local136.aClass25_6;
			}
			if (local79.anInt852 != 0 && local79.anInt848 + arg0 < 104 && arg4 + local79.anInt848 < 104 && arg0 + local79.anInt863 < 104 && arg4 + local79.anInt863 < 104) {
				arg3.method952(local79.anInt848, local79.anInt863, arg4, arg0, local79.aBoolean56, !local79.aBoolean48, local68);
			}
		} else if (arg5 == 3) {
			@Pc(205) Class162 local205 = Static33.method687(arg1, arg0, arg4);
			if (local205 != null) {
				local103 = local205.aClass25_7;
			}
			if (local79.anInt852 == 1) {
				arg3.method954(arg0, arg4);
			}
		}
		if (local79.anIntArray93 != null) {
			local79 = local79.method688();
		}
		if (!Static296.aBoolean335 || local79 == null || !local79.aBoolean54) {
			return;
		}
		if (local57 == 2) {
			if (local103 instanceof Class25_Sub4) {
				((Class25_Sub4) local103).method3241();
			} else {
				Static19.method383(arg4, local79, arg2, local57, local68 + 4, arg0, 0, 0);
			}
			if (local101 instanceof Class25_Sub4) {
				((Class25_Sub4) local101).method3241();
			} else {
				Static19.method383(arg4, local79, arg2, local57, local68 + 1 & 0x3, arg0, 0, 0);
			}
		} else if (local57 == 5) {
			if (local103 instanceof Class25_Sub4) {
				((Class25_Sub4) local103).method3241();
			} else {
				Static19.method383(arg4, local79, arg2, 4, local68, arg0, Static134.anIntArray273[local68] * 8, Static105.anIntArray606[local68] * 8);
			}
		} else if (local57 == 6) {
			if (local103 instanceof Class25_Sub4) {
				((Class25_Sub4) local103).method3241();
			} else {
				Static19.method383(arg4, local79, arg2, 4, local68 + 4, arg0, Static224.anIntArray514[local68] * 8, Static25.anIntArray54[local68] * 8);
			}
		} else if (local57 == 7) {
			if (local103 instanceof Class25_Sub4) {
				((Class25_Sub4) local103).method3241();
			} else {
				Static19.method383(arg4, local79, arg2, 4, (local68 + 2 & 0x3) + 4, arg0, 0, 0);
			}
		} else if (local57 == 8) {
			if (local103 instanceof Class25_Sub4) {
				((Class25_Sub4) local103).method3241();
			} else {
				Static19.method383(arg4, local79, arg2, 4, local68 + 4, arg0, Static224.anIntArray514[local68] * 8, Static25.anIntArray54[local68] * 8);
			}
			if (local101 instanceof Class25_Sub4) {
				((Class25_Sub4) local101).method3241();
			} else {
				Static19.method383(arg4, local79, arg2, 4, (local68 + 2 & 0x3) + 4, arg0, Static224.anIntArray514[local68] * 8, Static25.anIntArray54[local68] * 8);
			}
		} else if (local57 == 11) {
			if (local103 instanceof Class25_Sub4) {
				((Class25_Sub4) local103).method3241();
			} else {
				Static19.method383(arg4, local79, arg2, 10, local68 + 4, arg0, 0, 0);
			}
		} else if (local103 instanceof Class25_Sub4) {
			((Class25_Sub4) local103).method3241();
		} else {
			Static19.method383(arg4, local79, arg2, local57, local68, arg0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!th", name = "e", descriptor = "(B)[Lclient!fj;")
	public static Class7[] method4238() {
		@Pc(4) Class7[] local4 = new Class7[Static153.anInt3542];
		for (@Pc(6) int local6 = 0; local6 < Static153.anInt3542; local6++) {
			if (Static296.aBoolean335) {
				local4[local6] = new Class7_Sub2(Static298.anInt6232, Static158.anInt3659, Static298.anIntArray623[local6], Static121.anIntArray257[local6], Static166.anIntArray343[local6], Static81.anIntArray204[local6], Static200.aByteArrayArray83[local6], Static167.anIntArray346);
			} else {
				local4[local6] = new Class7_Sub1(Static298.anInt6232, Static158.anInt3659, Static298.anIntArray623[local6], Static121.anIntArray257[local6], Static166.anIntArray343[local6], Static81.anIntArray204[local6], Static200.aByteArrayArray83[local6], Static167.anIntArray346);
			}
		}
		Static265.method4490();
		return local4;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!ok;)Ljava/lang/String;")
	public static String method4239(@OriginalArg(1) Class116 arg0) {
		if (Static37.method866(arg0).method1106() == 0) {
			return null;
		} else if (arg0.aString130 == null || arg0.aString130.trim().length() == 0) {
			return Static24.aBoolean27 ? "Hidden-use" : null;
		} else {
			return arg0.aString130;
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(BC)Z")
	public static boolean method4240(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method4242(@OriginalArg(0) int arg0) {
		return Static24.aStringArray3[arg0].length() > 0 ? Static165.aStringArray17[arg0] + Static115.aString78 + Static24.aStringArray3[arg0] : Static165.aStringArray17[arg0];
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I[III[Ljava/lang/Object;)V")
	public static void method4243(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(16) int local16 = (arg0 + arg2) / 2;
		@Pc(18) int local18 = arg0;
		@Pc(22) int local22 = arg1[local16];
		arg1[local16] = arg1[arg2];
		arg1[arg2] = local22;
		@Pc(36) Object local36 = arg3[local16];
		arg3[local16] = arg3[arg2];
		arg3[arg2] = local36;
		for (@Pc(48) int local48 = arg0; local48 < arg2; local48++) {
			if (arg1[local48] < local22 + (local48 & 0x1)) {
				@Pc(70) int local70 = arg1[local48];
				arg1[local48] = arg1[local18];
				arg1[local18] = local70;
				@Pc(84) Object local84 = arg3[local48];
				arg3[local48] = arg3[local18];
				arg3[local18++] = local84;
			}
		}
		arg1[arg2] = arg1[local18];
		arg1[local18] = local22;
		arg3[arg2] = arg3[local18];
		arg3[local18] = local36;
		method4243(arg0, arg1, local18 - 1, arg3);
		method4243(local18 + 1, arg1, arg2, arg3);
	}
}
