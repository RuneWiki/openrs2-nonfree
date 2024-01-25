import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "[Lclient!au;")
	public static Class1_Sub2[] aClass1_Sub2Array1;

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
	public static final int anInt8178 = 1339;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII)V")
	public static void method6785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(11) Class4_Sub36 local11 = (Class4_Sub36) Static88.aClass244_18.method5963(); local11 != null; local11 = (Class4_Sub36) Static88.aClass244_18.method5965()) {
			Static270.method4676(arg1, arg0, local11, arg2, arg3);
		}
		@Pc(178) boolean local178;
		for (@Pc(36) Class4_Sub36 local36 = (Class4_Sub36) Static190.aClass244_25.method5963(); local36 != null; local36 = (Class4_Sub36) Static190.aClass244_25.method5965()) {
			@Pc(40) byte local40 = 1;
			@Pc(45) Class316 local45 = local36.aClass1_Sub4_Sub2_Sub1_Sub1_2.method6921();
			if (local36.aClass1_Sub4_Sub2_Sub1_Sub1_2.anInt8409 == -1 || local36.aClass1_Sub4_Sub2_Sub1_Sub1_2.aBoolean589) {
				local40 = 0;
			} else if (local36.aClass1_Sub4_Sub2_Sub1_Sub1_2.anInt8409 == local45.anInt9146 || local45.anInt9142 == local36.aClass1_Sub4_Sub2_Sub1_Sub1_2.anInt8409 || local36.aClass1_Sub4_Sub2_Sub1_Sub1_2.anInt8409 == local45.anInt9157 || local45.anInt9121 == local36.aClass1_Sub4_Sub2_Sub1_Sub1_2.anInt8409) {
				local40 = 2;
			} else if (local36.aClass1_Sub4_Sub2_Sub1_Sub1_2.anInt8409 == local45.anInt9149 || local45.anInt9151 == local36.aClass1_Sub4_Sub2_Sub1_Sub1_2.anInt8409 || local36.aClass1_Sub4_Sub2_Sub1_Sub1_2.anInt8409 == local45.anInt9162 || local36.aClass1_Sub4_Sub2_Sub1_Sub1_2.anInt8409 == local45.anInt9138) {
				local40 = 3;
			}
			if (local36.anInt8118 != local40) {
				@Pc(142) int local142 = Static533.method7755(local36.aClass1_Sub4_Sub2_Sub1_Sub1_2);
				@Pc(146) Class283 local146 = local36.aClass1_Sub4_Sub2_Sub1_Sub1_2.aClass283_1;
				if (local146.anIntArray453 != null) {
					local146 = local146.method6834(Static45.aClass148_1);
				}
				if (local146 == null || local142 == -1) {
					local36.anInt8133 = -1;
					local36.aBoolean564 = false;
					local36.anInt8118 = local40;
				} else if (local142 == local36.anInt8133 && local146.aBoolean572 == local36.aBoolean564) {
					local36.anInt8122 = local146.anInt8243;
					local36.anInt8118 = local40;
				} else {
					local178 = false;
					if (local36.aClass4_Sub7_Sub4_1 == null) {
						local178 = true;
					} else {
						local36.anInt8122 -= 512;
						if (local36.anInt8122 <= 0) {
							Static444.aClass4_Sub7_Sub1_2.method400(local36.aClass4_Sub7_Sub4_1);
							local178 = true;
							local36.aClass4_Sub7_Sub4_1 = null;
						}
					}
					if (local178) {
						local36.anInt8122 = local146.anInt8243;
						local36.aClass4_Sub47_2 = null;
						local36.anInt8118 = local40;
						local36.aClass4_Sub16_Sub1_1 = null;
						local36.anInt8133 = local142;
						local36.aBoolean564 = local146.aBoolean572;
					}
				}
			}
			local36.anInt8131 = local36.aClass1_Sub4_Sub2_Sub1_Sub1_2.anInt9934;
			local36.anInt8119 = local36.aClass1_Sub4_Sub2_Sub1_Sub1_2.anInt9934 + (local36.aClass1_Sub4_Sub2_Sub1_Sub1_2.method6925() << 8);
			local36.anInt8132 = local36.aClass1_Sub4_Sub2_Sub1_Sub1_2.anInt9935;
			local36.anInt8125 = local36.aClass1_Sub4_Sub2_Sub1_Sub1_2.anInt9935 + (local36.aClass1_Sub4_Sub2_Sub1_Sub1_2.method6925() << 8);
			Static270.method4676(arg1, arg0, local36, arg2, arg3);
		}
		for (@Pc(300) Class4_Sub36 local300 = (Class4_Sub36) Static583.aClass350_42.method8198(); local300 != null; local300 = (Class4_Sub36) Static583.aClass350_42.method8205()) {
			@Pc(304) byte local304 = 1;
			@Pc(309) Class316 local309 = local300.aClass1_Sub4_Sub2_Sub1_Sub2_2.method6921();
			if (local300.aClass1_Sub4_Sub2_Sub1_Sub2_2.anInt8409 == -1 || local300.aClass1_Sub4_Sub2_Sub1_Sub2_2.aBoolean589) {
				local304 = 0;
			} else if (local300.aClass1_Sub4_Sub2_Sub1_Sub2_2.anInt8409 == local309.anInt9146 || local309.anInt9142 == local300.aClass1_Sub4_Sub2_Sub1_Sub2_2.anInt8409 || local300.aClass1_Sub4_Sub2_Sub1_Sub2_2.anInt8409 == local309.anInt9157 || local300.aClass1_Sub4_Sub2_Sub1_Sub2_2.anInt8409 == local309.anInt9121) {
				local304 = 2;
			} else if (local300.aClass1_Sub4_Sub2_Sub1_Sub2_2.anInt8409 == local309.anInt9149 || local300.aClass1_Sub4_Sub2_Sub1_Sub2_2.anInt8409 == local309.anInt9151 || local309.anInt9162 == local300.aClass1_Sub4_Sub2_Sub1_Sub2_2.anInt8409 || local309.anInt9138 == local300.aClass1_Sub4_Sub2_Sub1_Sub2_2.anInt8409) {
				local304 = 3;
			}
			if (local304 != local300.anInt8118) {
				@Pc(402) int local402 = Static434.method6771(local300.aClass1_Sub4_Sub2_Sub1_Sub2_2);
				if (local402 == local300.anInt8133 && local300.aBoolean564 == local300.aClass1_Sub4_Sub2_Sub1_Sub2_2.aBoolean597) {
					local300.anInt8118 = local304;
					local300.anInt8122 = local300.aClass1_Sub4_Sub2_Sub1_Sub2_2.anInt8485;
				} else {
					local178 = false;
					if (local300.aClass4_Sub7_Sub4_1 == null) {
						local178 = true;
					} else {
						local300.anInt8122 -= 512;
						if (local300.anInt8122 <= 0) {
							Static444.aClass4_Sub7_Sub1_2.method400(local300.aClass4_Sub7_Sub4_1);
							local178 = true;
							local300.aClass4_Sub7_Sub4_1 = null;
						}
					}
					if (local178) {
						local300.aBoolean564 = local300.aClass1_Sub4_Sub2_Sub1_Sub2_2.aBoolean597;
						local300.anInt8133 = local402;
						local300.aClass4_Sub16_Sub1_1 = null;
						local300.anInt8122 = local300.aClass1_Sub4_Sub2_Sub1_Sub2_2.anInt8485;
						local300.aClass4_Sub47_2 = null;
						local300.anInt8118 = local304;
					}
				}
			}
			local300.anInt8131 = local300.aClass1_Sub4_Sub2_Sub1_Sub2_2.anInt9934;
			local300.anInt8119 = local300.aClass1_Sub4_Sub2_Sub1_Sub2_2.anInt9934 + (local300.aClass1_Sub4_Sub2_Sub1_Sub2_2.method6925() << 8);
			local300.anInt8132 = local300.aClass1_Sub4_Sub2_Sub1_Sub2_2.anInt9935;
			local300.anInt8125 = local300.aClass1_Sub4_Sub2_Sub1_Sub2_2.anInt9935 + (local300.aClass1_Sub4_Sub2_Sub1_Sub2_2.method6925() << 8);
			Static270.method4676(arg1, arg0, local300, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!ub;[Lclient!ul;)V")
	public static void method6787(@OriginalArg(0) Class1_Sub4 arg0, @OriginalArg(1) Class4_Sub24[] arg1) {
		@Pc(6) int local6;
		if (Static541.aBoolean678) {
			local6 = arg0.method8129(arg1);
			Static468.aClass44_7.method5000(local6, arg1);
		}
		if (Static183.aClass83Array6 == Static499.aClass83Array3) {
			@Pc(28) int local28;
			if (arg0 instanceof Class1_Sub4_Sub2) {
				local6 = ((Class1_Sub4_Sub2) arg0).aShort121;
				local28 = ((Class1_Sub4_Sub2) arg0).aShort120;
			} else {
				local6 = arg0.anInt9934 >> Static145.anInt3093;
				local28 = arg0.anInt9935 >> Static145.anInt3093;
			}
			Static468.aClass44_7.YA(Static444.aClass83Array7[0].method7213(arg0.anInt9934, arg0.anInt9935), Static258.method4158(local6, local28), Static159.method2941(local6, local28), Static171.method3122(local6, local28));
		}
		@Pc(64) Class1_Sub8 local64 = arg0.method8130(Static468.aClass44_7);
		if (local64 == null) {
			return;
		}
		local64.aClass1_Sub4_2 = arg0;
		if (Static175.aBoolean289) {
			@Pc(73) Class136 local73 = Static156.aClass136_5;
			synchronized (Static156.aClass136_5) {
				@Pc(77) boolean local77 = false;
				for (@Pc(82) Class1_Sub8 local82 = (Class1_Sub8) Static156.aClass136_5.method3288(); local82 != null; local82 = (Class1_Sub8) Static156.aClass136_5.method3286()) {
					if (arg0.anInt9938 >= local82.aClass1_Sub4_2.anInt9938) {
						Static30.method406(local82, local64);
						local77 = true;
						break;
					}
				}
				if (!local77) {
					Static156.aClass136_5.method3289(local64);
				}
				return;
			}
		}
		@Pc(117) boolean local117 = false;
		for (@Pc(122) Class1_Sub8 local122 = (Class1_Sub8) Static156.aClass136_5.method3288(); local122 != null; local122 = (Class1_Sub8) Static156.aClass136_5.method3286()) {
			if (arg0.anInt9938 >= local122.aClass1_Sub4_2.anInt9938) {
				Static30.method406(local122, local64);
				local117 = true;
				break;
			}
		}
		if (!local117) {
			Static156.aClass136_5.method3289(local64);
		}
	}
}
