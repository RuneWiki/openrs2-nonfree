import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray63;

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "[Lclient!fh;")
	public static Class22[] aClass22Array2 = new Class22[4];

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "Lclient!ea;")
	private static Class18 aClass18_520 = Static8.method128("Welcome to RuneScape");

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "Lclient!ea;")
	public static Class18 aClass18_519 = aClass18_520;

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "[I")
	public static int[] anIntArray189 = new int[25];

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIILclient!r;Z)V")
	public static void method1500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub15 arg3) {
		if (Static80.anInt2478 >= 400) {
			return;
		}
		if (arg3.anIntArray338 != null) {
			arg3 = arg3.method2589();
		}
		if (arg3 == null || !arg3.aBoolean163) {
			return;
		}
		@Pc(30) Class18 local30 = arg3.aClass18_964;
		if (arg3.anInt3786 != 0) {
			local30 = Static144.method2735(new Class18[] { local30, Static113.method2976(arg3.anInt3786, Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3621), Static132.aClass18_948, Static161.aClass18_1137, Static132.method2564(arg3.anInt3786), Static57.aClass18_444 });
		}
		if (Static98.anInt3018 == 1) {
			Static15.method272(33, arg2, Static144.aClass18_1016, arg1, Static144.method2735(new Class18[] { Static135.aClass18_967, Static161.aClass18_1135, local30 }), arg0);
		} else if (!Static21.aBoolean19) {
			@Pc(118) Class18[] local118 = arg3.aClass18Array19;
			if (Static73.aBoolean74) {
				local118 = Static117.method2324(local118);
			}
			@Pc(132) int local132;
			if (local118 != null) {
				for (local132 = 4; local132 >= 0; local132--) {
					if (local118[local132] != null && !local118[local132].method734(Static39.aClass18_291)) {
						@Pc(151) byte local151 = 0;
						if (local132 == 0) {
							local151 = 51;
						}
						if (local132 == 1) {
							local151 = 26;
						}
						if (local132 == 2) {
							local151 = 1;
						}
						if (local132 == 3) {
							local151 = 9;
						}
						if (local132 == 4) {
							local151 = 8;
						}
						Static15.method272(local151, arg2, local118[local132], arg1, Static144.method2735(new Class18[] { Static24.aClass18_221, local30 }), arg0);
					}
				}
			}
			if (local118 != null) {
				for (local132 = 4; local132 >= 0; local132--) {
					if (local118[local132] != null && local118[local132].method734(Static39.aClass18_291)) {
						@Pc(223) short local223 = 0;
						if (arg3.anInt3786 > Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3621) {
							local223 = 2000;
						}
						@Pc(240) int local240 = 0;
						if (local132 == 0) {
							local240 = local223 + 51;
						}
						if (local132 == 1) {
							local240 = local223 + 26;
						}
						if (local132 == 2) {
							local240 = local223 + 1;
						}
						if (local132 == 3) {
							local240 = local223 + 9;
						}
						if (local132 == 4) {
							local240 = local223 + 8;
						}
						Static15.method272(local240, arg2, local118[local132], arg1, Static144.method2735(new Class18[] { Static24.aClass18_221, local30 }), arg0);
					}
				}
			}
			Static15.method272(1007, arg2, Static154.aClass18_1087, arg1, Static144.method2735(new Class18[] { Static24.aClass18_221, local30 }), arg0);
		} else if ((Static122.anInt3449 & 0x2) == 2) {
			Static15.method272(6, arg2, Static9.aClass18_106, arg1, Static144.method2735(new Class18[] { Static127.aClass18_912, Static161.aClass18_1135, local30 }), arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)I")
	public static int method1501(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
	public static void method1502() {
		aClass22Array2 = null;
		anIntArrayArray63 = null;
		aClass18_519 = null;
		aClass18_520 = null;
		anIntArray189 = null;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!hc;ZI)Lclient!ea;")
	public static Class18 method1504(@OriginalArg(0) Class1_Sub6 arg0) {
		try {
			@Pc(12) Class18 local12 = new Class18();
			local12.anInt1129 = arg0.method527();
			if (local12.anInt1129 > 32767) {
				local12.anInt1129 = 32767;
			}
			local12.aByteArray6 = new byte[local12.anInt1129];
			arg0.anInt839 += Static110.aClass15_1.method572(local12.aByteArray6, arg0.anInt839, arg0.aByteArray3, local12.anInt1129, 0);
			return local12;
		} catch (@Pc(49) Exception local49) {
			return Static96.aClass18_755;
		}
	}
}
