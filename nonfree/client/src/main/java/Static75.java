import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!hc", name = "jb", descriptor = "[I")
	public static int[] anIntArray79;

	@OriginalMember(owner = "client!hc", name = "lb", descriptor = "Lclient!ke;")
	public static Class52 aClass52_16;

	@OriginalMember(owner = "client!hc", name = "ab", descriptor = "Lclient!ce;")
	public static final Class3_Sub4 aClass3_Sub4_1 = new Class3_Sub4(new byte[5000]);

	@OriginalMember(owner = "client!hc", name = "cb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_707 = Static193.method3027("labels)3dat");

	@OriginalMember(owner = "client!hc", name = "eb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_708 = Static193.method3027(":clan:");

	@OriginalMember(owner = "client!hc", name = "kb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_711 = Static193.method3027("Your account is already logged in)3");

	@OriginalMember(owner = "client!hc", name = "fb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_709 = aClass70_711;

	@OriginalMember(owner = "client!hc", name = "hb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_710 = Static193.method3027("Versteckt");

	@OriginalMember(owner = "client!hc", name = "ib", descriptor = "I")
	public static int anInt1476 = 0;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!we;I)V")
	public static void method1079(@OriginalArg(0) Class26_Sub2 arg0) {
		arg0.aBoolean129 = false;
		@Pc(16) Class3_Sub3_Sub17 local16;
		if (arg0.anInt2596 != -1) {
			local16 = Static11.method254(arg0.anInt2596);
			if (local16 == null || local16.anIntArray197 == null) {
				arg0.anInt2596 = -1;
			} else {
				arg0.anInt2587++;
				if (local16.anIntArray197.length > arg0.anInt2623 && local16.anIntArray193[arg0.anInt2623] < arg0.anInt2587) {
					arg0.anInt2587 = 1;
					arg0.anInt2623++;
					Static126.method1760(arg0.anInt2623, local16, arg0 == Static144.aClass26_Sub2_Sub1_1, arg0.anInt2611, arg0.anInt2593);
				}
				if (arg0.anInt2623 >= local16.anIntArray197.length) {
					arg0.anInt2587 = 0;
					arg0.anInt2623 = 0;
					Static126.method1760(arg0.anInt2623, local16, arg0 == Static144.aClass26_Sub2_Sub1_1, arg0.anInt2611, arg0.anInt2593);
				}
			}
		}
		if (arg0.anInt2608 != -1 && arg0.anInt2614 <= Static184.anInt3760) {
			if (arg0.anInt2592 < 0) {
				arg0.anInt2592 = 0;
			}
			@Pc(128) int local128 = Static78.method1141(arg0.anInt2608).anInt106;
			if (local128 == -1) {
				arg0.anInt2608 = -1;
			} else {
				@Pc(135) Class3_Sub3_Sub17 local135 = Static11.method254(local128);
				if (local135 == null || local135.anIntArray197 == null) {
					arg0.anInt2608 = -1;
				} else {
					arg0.anInt2612++;
					if (local135.anIntArray197.length > arg0.anInt2592 && arg0.anInt2612 > local135.anIntArray193[arg0.anInt2592]) {
						arg0.anInt2612 = 1;
						arg0.anInt2592++;
						Static126.method1760(arg0.anInt2592, local135, Static144.aClass26_Sub2_Sub1_1 == arg0, arg0.anInt2611, arg0.anInt2593);
					}
					if (arg0.anInt2592 >= local135.anIntArray197.length) {
						arg0.anInt2608 = -1;
					}
				}
			}
		}
		if (arg0.anInt2599 != -1 && arg0.anInt2610 <= 1) {
			local16 = Static11.method254(arg0.anInt2599);
			if (local16.anInt2739 == 1 && arg0.anInt2642 > 0 && arg0.anInt2624 <= Static184.anInt3760 && arg0.anInt2640 < Static184.anInt3760) {
				arg0.anInt2610 = 1;
				return;
			}
		}
		if (arg0.anInt2599 != -1 && arg0.anInt2610 == 0) {
			local16 = Static11.method254(arg0.anInt2599);
			if (local16 == null || local16.anIntArray197 == null) {
				arg0.anInt2599 = -1;
			} else {
				arg0.anInt2606++;
				if (local16.anIntArray197.length > arg0.anInt2621 && local16.anIntArray193[arg0.anInt2621] < arg0.anInt2606) {
					arg0.anInt2621++;
					arg0.anInt2606 = 1;
					Static126.method1760(arg0.anInt2621, local16, arg0 == Static144.aClass26_Sub2_Sub1_1, arg0.anInt2611, arg0.anInt2593);
				}
				if (arg0.anInt2621 >= local16.anIntArray197.length) {
					arg0.anInt2621 -= local16.anInt2738;
					arg0.anInt2641++;
					if (arg0.anInt2641 >= local16.anInt2744) {
						arg0.anInt2599 = -1;
					} else if (arg0.anInt2621 >= 0 && local16.anIntArray197.length > arg0.anInt2621) {
						Static126.method1760(arg0.anInt2621, local16, Static144.aClass26_Sub2_Sub1_1 == arg0, arg0.anInt2611, arg0.anInt2593);
					} else {
						arg0.anInt2599 = -1;
					}
				}
				arg0.aBoolean129 = local16.aBoolean134;
			}
		}
		if (arg0.anInt2610 > 0) {
			arg0.anInt2610--;
		}
	}

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "(B)V")
	public static void method1080() {
		Static185.aClass85_35.method2557();
		Static181.aClass94_10.method3157();
		Static63.aClass94_4.method3157();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIZII)V")
	public static void method1081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg3 - arg0;
		@Pc(15) int local15 = arg2 - arg1;
		if (local10 == 0) {
			if (local15 != 0) {
				Static143.method2081(arg1, arg4, arg2, arg0);
			}
		} else if (local15 == 0) {
			Static1.method1309(arg3, arg1, arg0, arg4);
		} else {
			@Pc(47) int local47 = (local15 << 12) / local10;
			@Pc(56) int local56 = arg1 - (local47 * arg0 >> 12);
			@Pc(68) int local68;
			@Pc(76) int local76;
			if (Static119.anInt2428 > arg0) {
				local68 = Static119.anInt2428;
				local76 = (local47 * Static119.anInt2428 >> 12) + local56;
			} else if (arg0 > Static200.anInt4074) {
				local68 = Static200.anInt4074;
				local76 = local56 + (local47 * Static200.anInt4074 >> 12);
			} else {
				local76 = arg1;
				local68 = arg0;
			}
			if (local76 < Static26.anInt554) {
				local68 = (Static26.anInt554 - local56 << 12) / local47;
				local76 = Static26.anInt554;
			} else if (local76 > Static52.anInt1117) {
				local76 = Static52.anInt1117;
				local68 = (Static52.anInt1117 - local56 << 12) / local47;
			}
			@Pc(146) int local146;
			@Pc(144) int local144;
			if (Static119.anInt2428 > arg3) {
				local144 = (local47 * Static119.anInt2428 >> 12) + local56;
				local146 = Static119.anInt2428;
			} else if (arg3 <= Static200.anInt4074) {
				local144 = arg2;
				local146 = arg3;
			} else {
				local146 = Static200.anInt4074;
				local144 = (Static200.anInt4074 * local47 >> 12) + local56;
			}
			if (local144 < Static26.anInt554) {
				local146 = (Static26.anInt554 - local56 << 12) / local47;
				local144 = Static26.anInt554;
			} else if (local144 > Static52.anInt1117) {
				local144 = Static52.anInt1117;
				local146 = (Static52.anInt1117 - local56 << 12) / local47;
			}
			Static131.method1839(local144, local146, arg4, local76, local68);
		}
	}
}
