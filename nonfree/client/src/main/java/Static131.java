import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!we", name = "a", descriptor = "Lclient!qc;")
	public static Class1_Sub3_Sub1_Sub3 aClass1_Sub3_Sub1_Sub3_5;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!kb;")
	public static Class41 aClass41_33;

	@OriginalMember(owner = "client!we", name = "l", descriptor = "Z")
	public static boolean aBoolean125;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "Lclient!kb;")
	public static Class41 aClass41_34;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Lclient!af;")
	public static Class5 aClass5_1481 = Static45.method1937("Konfig geladen)3");

	@OriginalMember(owner = "client!we", name = "g", descriptor = "[I")
	public static int[] anIntArray468 = new int[32768];

	@OriginalMember(owner = "client!we", name = "h", descriptor = "Lclient!af;")
	public static Class5 aClass5_1482 = Static45.method1937("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Lclient!af;")
	public static Class5 aClass5_1483 = Static45.method1937("cross");

	@OriginalMember(owner = "client!we", name = "n", descriptor = "I")
	public static int anInt3268 = 0;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "[Lclient!md;")
	public static Class49[] aClass49Array1 = new Class49[4];

	@OriginalMember(owner = "client!we", name = "q", descriptor = "I")
	public static int anInt3269 = 0;

	@OriginalMember(owner = "client!we", name = "r", descriptor = "I")
	public static int anInt3270 = 0;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
	public static void method2260() {
		Static79.aClass1_Sub20_Sub1_2.method2113();
		@Pc(13) int local13 = Static79.aClass1_Sub20_Sub1_2.method2115(8);
		@Pc(18) int local18;
		if (Static93.anInt2338 > local13) {
			for (local18 = local13; local18 < Static93.anInt2338; local18++) {
				Static75.anIntArray289[Static103.anInt2537++] = anIntArray468[local18];
			}
		}
		if (local13 > Static93.anInt2338) {
			throw new RuntimeException("gnpov1");
		}
		Static93.anInt2338 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(60) int local60 = anIntArray468[local18];
			@Pc(64) Class1_Sub3_Sub4_Sub2_Sub2 local64 = Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[local60];
			@Pc(69) int local69 = Static79.aClass1_Sub20_Sub1_2.method2115(1);
			if (local69 == 0) {
				anIntArray468[Static93.anInt2338++] = local60;
				local64.anInt3066 = anInt3270;
			} else {
				@Pc(89) int local89 = Static79.aClass1_Sub20_Sub1_2.method2115(2);
				if (local89 == 0) {
					anIntArray468[Static93.anInt2338++] = local60;
					local64.anInt3066 = anInt3270;
					Static20.anIntArray83[Static86.anInt2184++] = local60;
				} else {
					@Pc(134) int local134;
					@Pc(144) int local144;
					if (local89 == 1) {
						anIntArray468[Static93.anInt2338++] = local60;
						local64.anInt3066 = anInt3270;
						local134 = Static79.aClass1_Sub20_Sub1_2.method2115(3);
						local64.method2155(false, local134);
						local144 = Static79.aClass1_Sub20_Sub1_2.method2115(1);
						if (local144 == 1) {
							Static20.anIntArray83[Static86.anInt2184++] = local60;
						}
					} else if (local89 == 2) {
						anIntArray468[Static93.anInt2338++] = local60;
						local64.anInt3066 = anInt3270;
						local134 = Static79.aClass1_Sub20_Sub1_2.method2115(3);
						local64.method2155(true, local134);
						local144 = Static79.aClass1_Sub20_Sub1_2.method2115(3);
						local64.method2155(true, local144);
						@Pc(196) int local196 = Static79.aClass1_Sub20_Sub1_2.method2115(1);
						if (local196 == 1) {
							Static20.anIntArray83[Static86.anInt2184++] = local60;
						}
					} else if (local89 == 3) {
						Static75.anIntArray289[Static103.anInt2537++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	public static void method2261() {
		aClass41_34 = null;
		aClass5_1483 = null;
		aClass1_Sub3_Sub1_Sub3_5 = null;
		aClass5_1481 = null;
		aClass49Array1 = null;
		aClass41_33 = null;
		anIntArray468 = null;
		aClass5_1482 = null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!cd;I)V")
	public static void method2262(@OriginalArg(0) Class1_Sub3_Sub4_Sub2 arg0) {
		arg0.aBoolean116 = false;
		@Pc(17) Class1_Sub3_Sub11 local17;
		if (arg0.anInt3087 != -1) {
			local17 = Static77.method1316(arg0.anInt3087);
			if (local17 == null || local17.anIntArray315 == null) {
				arg0.anInt3087 = -1;
			} else {
				arg0.anInt3049++;
				if (local17.anIntArray315.length > arg0.anInt3077 && local17.anIntArray318[arg0.anInt3077] < arg0.anInt3049) {
					arg0.anInt3077++;
					arg0.anInt3049 = 1;
					Static25.method542(arg0.anInt3079, arg0.anInt3089, local17, arg0.anInt3077);
				}
				if (local17.anIntArray315.length <= arg0.anInt3077) {
					arg0.anInt3049 = 0;
					arg0.anInt3077 = 0;
					Static25.method542(arg0.anInt3079, arg0.anInt3089, local17, arg0.anInt3077);
				}
			}
		}
		if (arg0.anInt3059 != -1 && arg0.anInt3085 <= anInt3270) {
			if (arg0.anInt3065 < 0) {
				arg0.anInt3065 = 0;
			}
			@Pc(118) int local118 = Static82.method1448(arg0.anInt3059).anInt834;
			if (local118 == -1) {
				arg0.anInt3059 = -1;
			} else {
				@Pc(125) Class1_Sub3_Sub11 local125 = Static77.method1316(local118);
				if (local125 == null || local125.anIntArray315 == null) {
					arg0.anInt3059 = -1;
				} else {
					arg0.anInt3067++;
					if (local125.anIntArray315.length > arg0.anInt3065 && local125.anIntArray318[arg0.anInt3065] < arg0.anInt3067) {
						arg0.anInt3065++;
						arg0.anInt3067 = 1;
						Static25.method542(arg0.anInt3079, arg0.anInt3089, local125, arg0.anInt3065);
					}
					if (local125.anIntArray315.length <= arg0.anInt3065 && (arg0.anInt3065 < 0 || arg0.anInt3065 >= local125.anIntArray315.length)) {
						arg0.anInt3059 = -1;
					}
				}
			}
		}
		if (arg0.anInt3068 != -1 && arg0.anInt3048 <= 1) {
			local17 = Static77.method1316(arg0.anInt3068);
			if (local17.anInt2033 == 1 && arg0.anInt3061 > 0 && arg0.anInt3072 <= anInt3270 && anInt3270 > arg0.anInt3074) {
				arg0.anInt3048 = 1;
				return;
			}
		}
		if (arg0.anInt3068 != -1 && arg0.anInt3048 == 0) {
			local17 = Static77.method1316(arg0.anInt3068);
			if (local17 == null || local17.anIntArray315 == null) {
				arg0.anInt3068 = -1;
			} else {
				arg0.anInt3053++;
				if (arg0.anInt3075 < local17.anIntArray315.length && arg0.anInt3053 > local17.anIntArray318[arg0.anInt3075]) {
					arg0.anInt3053 = 1;
					arg0.anInt3075++;
					Static25.method542(arg0.anInt3079, arg0.anInt3089, local17, arg0.anInt3075);
				}
				if (local17.anIntArray315.length <= arg0.anInt3075) {
					arg0.anInt3075 -= local17.anInt2051;
					arg0.anInt3084++;
					if (arg0.anInt3084 >= local17.anInt2050) {
						arg0.anInt3068 = -1;
					} else if (arg0.anInt3075 >= 0 && arg0.anInt3075 < local17.anIntArray315.length) {
						Static25.method542(arg0.anInt3079, arg0.anInt3089, local17, arg0.anInt3075);
					} else {
						arg0.anInt3068 = -1;
					}
				}
				arg0.aBoolean116 = local17.aBoolean68;
			}
		}
		if (arg0.anInt3048 > 0) {
			arg0.anInt3048--;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)Lclient!lf;")
	public static Class1_Sub3_Sub10 method2263(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub3_Sub10 local10 = (Class1_Sub3_Sub10) Static117.aClass28_86.method796((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static99.aClass41_23.method1710(6, arg0);
		local10 = new Class1_Sub3_Sub10();
		local10.anInt1683 = arg0;
		if (local20 != null) {
			local10.method1264(new Class1_Sub20(local20));
		}
		local10.method1261();
		if (local10.aBoolean56) {
			local10.anInt1681 = 0;
			local10.aBoolean58 = false;
		}
		Static117.aClass28_86.method789(local10, (long) arg0);
		return local10;
	}
}
