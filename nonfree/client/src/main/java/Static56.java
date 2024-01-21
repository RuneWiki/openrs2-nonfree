import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!fe", name = "V", descriptor = "Lclient!nf;")
	public static Class69_Sub1 aClass69_Sub1_48;

	@OriginalMember(owner = "client!fe", name = "eb", descriptor = "Lclient!ve;")
	public static Class69 aClass69_15;

	@OriginalMember(owner = "client!fe", name = "jb", descriptor = "[I")
	public static int[] anIntArray124;

	@OriginalMember(owner = "client!fe", name = "P", descriptor = "[Lclient!ij;")
	public static final Class48[] aClass48Array1 = new Class48[4];

	@OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
	public static volatile int anInt1411 = 0;

	@OriginalMember(owner = "client!fe", name = "Z", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_383 = Static81.method1507(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!fe", name = "bb", descriptor = "[I")
	public static final int[] anIntArray121 = new int[32];

	@OriginalMember(owner = "client!fe", name = "fb", descriptor = "Lclient!vc;")
	public static Class98 aClass98_8 = null;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(B)V")
	public static void method1089() {
		Static28.anIntArray73 = null;
		Static148.aByteArrayArrayArray10 = null;
		Static199.aByteArrayArrayArray6 = null;
		Static65.anIntArrayArrayArray4 = null;
		Static135.anInt2989 = 0;
		Static72.aByteArrayArrayArray4 = null;
		Static86.anIntArrayArrayArray5 = null;
		Static44.aClass98_5 = null;
		Static157.aByteArrayArrayArray11 = null;
		Static202.aByteArrayArrayArray14 = null;
		Static27.aByteArrayArrayArray2 = null;
		Static168.aClass87_25.method2831();
		Static162.aClass87_23.method2831();
		Static112.aClass1_Sub2_Sub8_Sub5_25 = null;
		Static47.aClass1_Sub2_Sub8_Sub5_11 = null;
		Static5.aClass1_Sub2_Sub8_Sub5_3 = null;
		Static184.aClass1_Sub2_Sub8_Sub5_37 = null;
		Static91.aClass1_Sub2_Sub8_Sub5_21 = null;
		Static66.aClass1_Sub2_Sub8_Sub5_18 = null;
		Static59.aClass1_Sub2_Sub8_Sub5_16 = null;
		Static176.aClass1_Sub2_Sub8_Sub5_41 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!ld;I)V")
	public static void method1091(@OriginalArg(0) Class5_Sub2 arg0) {
		arg0.aBoolean116 = false;
		@Pc(17) Class1_Sub2_Sub22 local17;
		if (arg0.anInt2504 != -1) {
			local17 = Static85.method2622(arg0.anInt2504);
			if (local17 == null || local17.anIntArray346 == null) {
				arg0.anInt2504 = -1;
			} else {
				arg0.anInt2481++;
				if (arg0.anInt2490 < local17.anIntArray346.length && local17.anIntArray344[arg0.anInt2490] < arg0.anInt2481) {
					arg0.anInt2490++;
					arg0.anInt2481 = 1;
					Static125.method2098(local17, arg0.anInt2501, arg0.anInt2448, arg0.anInt2490, arg0 == Static87.aClass5_Sub2_Sub1_1);
				}
				if (arg0.anInt2490 >= local17.anIntArray346.length) {
					arg0.anInt2490 = 0;
					arg0.anInt2481 = 0;
					Static125.method2098(local17, arg0.anInt2501, arg0.anInt2448, arg0.anInt2490, Static87.aClass5_Sub2_Sub1_1 == arg0);
				}
			}
		}
		if (arg0.anInt2458 != -1 && Static42.anInt1100 >= arg0.anInt2473) {
			if (arg0.anInt2471 < 0) {
				arg0.anInt2471 = 0;
			}
			@Pc(136) int local136 = Static72.method1365(arg0.anInt2458).anInt294;
			if (local136 == -1) {
				arg0.anInt2458 = -1;
			} else {
				@Pc(149) Class1_Sub2_Sub22 local149 = Static85.method2622(local136);
				if (local149 == null || local149.anIntArray346 == null) {
					arg0.anInt2458 = -1;
				} else {
					arg0.anInt2488++;
					if (local149.anIntArray346.length > arg0.anInt2471 && arg0.anInt2488 > local149.anIntArray344[arg0.anInt2471]) {
						arg0.anInt2471++;
						arg0.anInt2488 = 1;
						Static125.method2098(local149, arg0.anInt2501, arg0.anInt2448, arg0.anInt2471, arg0 == Static87.aClass5_Sub2_Sub1_1);
					}
					if (arg0.anInt2471 >= local149.anIntArray346.length) {
						arg0.anInt2458 = -1;
					}
				}
			}
		}
		if (arg0.anInt2485 != -1 && arg0.anInt2472 <= 1) {
			local17 = Static85.method2622(arg0.anInt2485);
			if (local17.anInt4003 == 1 && arg0.anInt2456 > 0 && Static42.anInt1100 >= arg0.anInt2451 && arg0.anInt2452 < Static42.anInt1100) {
				arg0.anInt2472 = 1;
				return;
			}
		}
		if (arg0.anInt2485 != -1 && arg0.anInt2472 == 0) {
			local17 = Static85.method2622(arg0.anInt2485);
			if (local17 == null || local17.anIntArray346 == null) {
				arg0.anInt2485 = -1;
			} else {
				arg0.anInt2496++;
				if (arg0.anInt2493 < local17.anIntArray346.length && arg0.anInt2496 > local17.anIntArray344[arg0.anInt2493]) {
					arg0.anInt2493++;
					arg0.anInt2496 = 1;
					Static125.method2098(local17, arg0.anInt2501, arg0.anInt2448, arg0.anInt2493, Static87.aClass5_Sub2_Sub1_1 == arg0);
				}
				if (arg0.anInt2493 >= local17.anIntArray346.length) {
					arg0.anInt2466++;
					arg0.anInt2493 -= local17.anInt4005;
					if (arg0.anInt2466 >= local17.anInt3993) {
						arg0.anInt2485 = -1;
					} else if (arg0.anInt2493 >= 0 && local17.anIntArray346.length > arg0.anInt2493) {
						Static125.method2098(local17, arg0.anInt2501, arg0.anInt2448, arg0.anInt2493, Static87.aClass5_Sub2_Sub1_1 == arg0);
					} else {
						arg0.anInt2485 = -1;
					}
				}
				arg0.aBoolean116 = local17.aBoolean187;
			}
		}
		if (arg0.anInt2472 > 0) {
			arg0.anInt2472--;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZI)Lclient!qa;")
	public static Class1_Sub2_Sub19 method1093(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub2_Sub19 local6 = (Class1_Sub2_Sub19) Static9.aClass86_5.method2816((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static174.aClass69_34.method2208(4, arg0);
		local6 = new Class1_Sub2_Sub19();
		if (local25 != null) {
			local6.method2588(arg0, new Class1_Sub7(local25));
		}
		Static9.aClass86_5.method2821(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZII)I")
	public static int method1095(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg1 >>> 31;
		return (local3 + arg1) / arg0 - local3;
	}
}
