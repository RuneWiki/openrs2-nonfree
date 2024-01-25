import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "[Lclient!vv;")
	public static Interface23[] anInterface23Array1;

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
	public static int anInt10324;

	@OriginalMember(owner = "client!wu", name = "m", descriptor = "I")
	public static int anInt10329;

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "Lclient!qs;")
	public static final Class273 aClass273_4 = new Class273();

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(B)V")
	public static void method8174() {
		Static129.anIntArray106 = null;
		Static285.anIntArray253 = null;
		Static517.anIntArray530 = null;
		Static466.anIntArray478 = null;
		Static465.aBoolean558 = false;
		Static245.anIntArray227 = null;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIILclient!vb;Lclient!vb;)V")
	public static void method8175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class25_Sub2_Sub1 arg3, @OriginalArg(4) Class25_Sub2_Sub1 arg4) {
		@Pc(4) Class333 local4 = Static195.method3408(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass25_Sub2_Sub1_2 = arg3;
		local4.aClass25_Sub2_Sub1_1 = arg4;
		@Pc(19) int local19 = Static256.aClass127Array3 == Static108.aClass127Array5 ? 1 : 0;
		if (!arg3.method6653()) {
			Static69.aClass25_Sub2ArrayArray3[local19][Static473.anIntArray482[local19]++] = arg3;
		} else if (arg3.method6655()) {
			Static468.aClass25_Sub2ArrayArray4[local19][Static154.anIntArray135[local19]++] = arg3;
		} else {
			Static530.aClass25_Sub2ArrayArray5[local19][Static199.anIntArray186[local19]++] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method6653()) {
			if (arg4.method6655()) {
				Static468.aClass25_Sub2ArrayArray4[local19][Static154.anIntArray135[local19]++] = arg4;
				return;
			}
			Static530.aClass25_Sub2ArrayArray5[local19][Static199.anIntArray186[local19]++] = arg4;
			return;
		}
		Static69.aClass25_Sub2ArrayArray3[local19][Static473.anIntArray482[local19]++] = arg4;
	}
}
