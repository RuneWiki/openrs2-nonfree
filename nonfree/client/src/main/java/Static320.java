import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static320 {

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)V")
	public static void method3903() {
		if (Static148.aString20.toLowerCase().indexOf("microsoft") != -1) {
			Static470.anIntArray619[192] = 58;
			Static470.anIntArray619[219] = 42;
			Static470.anIntArray619[222] = 59;
			Static470.anIntArray619[186] = 57;
			Static470.anIntArray619[223] = 28;
			Static470.anIntArray619[187] = 27;
			Static470.anIntArray619[220] = 74;
			Static470.anIntArray619[221] = 43;
			Static470.anIntArray619[188] = 71;
			Static470.anIntArray619[190] = 72;
			Static470.anIntArray619[191] = 73;
			Static470.anIntArray619[189] = 26;
			return;
		}
		Static470.anIntArray619[47] = 73;
		Static470.anIntArray619[44] = 71;
		if (Static148.aMethod1 == null) {
			Static470.anIntArray619[222] = 59;
			Static470.anIntArray619[192] = 58;
		} else {
			Static470.anIntArray619[222] = 58;
			Static470.anIntArray619[520] = 59;
			Static470.anIntArray619[192] = 28;
		}
		Static470.anIntArray619[45] = 26;
		Static470.anIntArray619[46] = 72;
		Static470.anIntArray619[91] = 42;
		Static470.anIntArray619[92] = 74;
		Static470.anIntArray619[93] = 43;
		Static470.anIntArray619[61] = 27;
		Static470.anIntArray619[59] = 57;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIILclient!ok;I)Lclient!ot;")
	public static Class40_Sub3_Sub1 method3904(@OriginalArg(0) int arg0, @OriginalArg(3) Class134_Sub2 arg1, @OriginalArg(4) int arg2) {
		if (arg1.aBoolean519 || Static230.method3483(arg0) && Static230.method3483(arg2)) {
			return new Class40_Sub3_Sub1(arg1, 3553, 6408, arg0, arg2);
		} else if (arg1.aBoolean505) {
			return new Class40_Sub3_Sub1(arg1, 34037, 6408, arg0, arg2);
		} else {
			return new Class40_Sub3_Sub1(arg1, 6408, arg0, arg2, Static457.method6299(arg0), Static457.method6299(arg2));
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "([II[J)V")
	public static void method3905(@OriginalArg(0) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static358.method4884(arg1.length - 1, arg0, 0, arg1);
	}
}
