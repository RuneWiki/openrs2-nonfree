import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "Lclient!gp;")
	public static final Class133 aClass133_6 = new Class133("game4", 3);

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "Lclient!kr;")
	public static Class194 aClass194_100 = null;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(11) int local11 = Static632.method8535(Static596.anInt9703, Static298.anInt5919, arg5);
		@Pc(17) int local17 = Static632.method8535(Static596.anInt9703, Static298.anInt5919, arg4);
		@Pc(23) int local23 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg0);
		@Pc(29) int local29 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg2);
		@Pc(38) int local38 = Static632.method8535(Static596.anInt9703, Static298.anInt5919, arg5 + arg6);
		@Pc(47) int local47 = Static632.method8535(Static596.anInt9703, Static298.anInt5919, arg4 - arg6);
		for (@Pc(49) int local49 = local11; local49 < local38; local49++) {
			Static82.method1400(arg1, local23, local29, Static71.anIntArrayArray5[local49]);
		}
		for (@Pc(69) int local69 = local17; local69 > local47; local69--) {
			Static82.method1400(arg1, local23, local29, Static71.anIntArrayArray5[local69]);
		}
		@Pc(92) int local92 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg0 + arg6);
		@Pc(106) int local106 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg2 - arg6);
		for (@Pc(108) int local108 = local38; local108 <= local47; local108++) {
			@Pc(114) int[] local114 = Static71.anIntArrayArray5[local108];
			Static82.method1400(arg1, local23, local92, local114);
			Static82.method1400(arg3, local92, local106, local114);
			Static82.method1400(arg1, local106, local29, local114);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
	public static void method2956() {
		if (Static501.aString73.toLowerCase().indexOf("microsoft") != -1) {
			Static133.anIntArray660[191] = 73;
			Static133.anIntArray660[221] = 43;
			Static133.anIntArray660[188] = 71;
			Static133.anIntArray660[220] = 74;
			Static133.anIntArray660[192] = 58;
			Static133.anIntArray660[222] = 59;
			Static133.anIntArray660[189] = 26;
			Static133.anIntArray660[223] = 28;
			Static133.anIntArray660[219] = 42;
			Static133.anIntArray660[186] = 57;
			Static133.anIntArray660[187] = 27;
			Static133.anIntArray660[190] = 72;
			return;
		}
		Static133.anIntArray660[44] = 71;
		Static133.anIntArray660[92] = 74;
		if (Static501.aMethod2 == null) {
			Static133.anIntArray660[192] = 58;
			Static133.anIntArray660[222] = 59;
		} else {
			Static133.anIntArray660[222] = 58;
			Static133.anIntArray660[520] = 59;
			Static133.anIntArray660[192] = 28;
		}
		Static133.anIntArray660[91] = 42;
		Static133.anIntArray660[59] = 57;
		Static133.anIntArray660[93] = 43;
		Static133.anIntArray660[47] = 73;
		Static133.anIntArray660[61] = 27;
		Static133.anIntArray660[45] = 26;
		Static133.anIntArray660[46] = 72;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = arg4; local7 <= arg2; local7++) {
			for (@Pc(11) int local11 = arg3; local11 <= arg0; local11++) {
				if (arg1 == Static273.anIntArrayArray24[local7][local11] && Static314.anIntArrayArray25[local7][local11] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V")
	public static void method2959(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub7_Sub5 local10 = Static138.method2377(12, arg0);
		local10.method1473();
	}
}
