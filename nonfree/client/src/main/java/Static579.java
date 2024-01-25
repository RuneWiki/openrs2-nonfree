import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!tia", name = "E", descriptor = "I")
	public static int anInt9385;

	@OriginalMember(owner = "client!tia", name = "I", descriptor = "[Lclient!nga;")
	public static Class34_Sub1_Sub1[] aClass34_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!tia", name = "K", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray3;

	@OriginalMember(owner = "client!tia", name = "N", descriptor = "I")
	public static int anInt9391;

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lclient!tga;IIZILclient!uq;I)V")
	public static void method7660(@OriginalArg(0) Class3_Sub12_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class362 arg3) {
		Static58.method7696(arg3, arg1, arg2);
		Static653.aClass3_Sub12_Sub3_4 = arg0;
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(BILclient!mr;Lclient!mr;Z)I")
	public static int method7661(@OriginalArg(1) int arg0, @OriginalArg(2) Class236_Sub1 arg1, @OriginalArg(3) Class236_Sub1 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg0 == 1) {
			local9 = arg1.anInt6385;
			local12 = arg2.anInt6385;
			if (!arg3) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg0 == 2) {
			return Static539.method6917(arg2.method5368().aString32, arg1.method5368().aString32, Static654.anInt10668);
		} else if (arg0 == 3) {
			if (arg1.aString80.equals("-")) {
				if (arg2.aString80.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString80.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static539.method6917(arg2.aString80, arg1.aString80, Static654.anInt10668);
			}
		} else if (arg0 == 4) {
			if (arg1.method5367()) {
				return arg2.method5367() ? 0 : 1;
			} else if (arg2.method5367()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg1.method5365()) {
				return arg2.method5365() ? 0 : 1;
			} else if (arg2.method5365()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg1.method5363()) {
				return arg2.method5363() ? 0 : 1;
			} else if (arg2.method5363()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg1.method5366()) {
				return arg2.method5366() ? 0 : 1;
			} else if (arg2.method5366()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local9 = arg1.anInt6388;
			local12 = arg2.anInt6388;
			if (arg3) {
				if (local9 == 1000) {
					local9 = -1;
				}
				if (local12 == 1000) {
					local12 = -1;
				}
			} else {
				if (local9 == -1) {
					local9 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg1.anInt6389 - arg2.anInt6389;
		}
	}

	@OriginalMember(owner = "client!tia", name = "g", descriptor = "(I)V")
	public static void method7663() {
		Static293.aClass67_14 = null;
		Static35.aClass6Array2 = null;
		Static225.aClass6Array5 = null;
		Static656.aClass6Array14 = null;
		Static245.aClass6Array7 = null;
		Static393.aClass6Array10 = null;
		Static578.aClass6Array12 = null;
		Static232.aClass6Array6 = null;
		Static678.aClass6Array15 = null;
		Static266.aClass6Array8 = null;
		Static653.aClass6_39 = null;
		Static184.aClass67_3 = null;
		Static348.aClass6Array9 = null;
		Static221.aClass6Array4 = null;
		Static586.aClass6Array13 = null;
		Static14.aClass6Array1 = null;
		Static74.aClass6_6 = null;
		Static261.aClass67_5 = null;
	}
}
