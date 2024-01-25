import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
	public static int anInt8631;

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
	public static final int anInt8632 = 1400;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method7637(@OriginalArg(1) Class145 arg0) {
		if (Static189.aBoolean301) {
			Static698.method9382(arg0);
		} else {
			Static479.method6878(arg0);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)V")
	public static void method7638(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static542.anInt8552 != -1) {
				Static84.method1246(Static542.anInt8552);
			}
			for (@Pc(19) Class2_Sub26 local19 = (Class2_Sub26) Static463.aClass218_36.method5092(); local19 != null; local19 = (Class2_Sub26) Static463.aClass218_36.method5096()) {
				if (!local19.method9871()) {
					local19 = (Class2_Sub26) Static463.aClass218_36.method5092();
					if (local19 == null) {
						break;
					}
				}
				Static331.method4599(local19, false, true);
			}
			Static542.anInt8552 = -1;
			Static463.aClass218_36 = new Class218(8);
			Static553.method7726();
			Static542.anInt8552 = Static519.aClass132_1.anInt3151;
			Static445.method6516(false);
			Static668.method9110(-58);
			Static484.method6921(Static542.anInt8552);
		}
		Static414.method8366();
		Static237.aBoolean968 = false;
		Static40.method554();
		Static85.anInt1436 = -1;
		Static693.method9336(Static288.anInt4456);
		Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2 = new Class4_Sub2_Sub1_Sub2_Sub1();
		Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10229 = Static426.anInt6942 * 512 / 2;
		Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anIntArray183[0] = Static426.anInt6942 / 2;
		Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10228 = Static280.anInt6752 * 512 / 2;
		Static218.anInt3475 = 0;
		Static430.anInt7002 = 0;
		Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anIntArray182[0] = Static280.anInt6752 / 2;
		if (Static60.anInt1040 == 2) {
			Static218.anInt3475 = Static14.anInt205 << 9;
			Static430.anInt7002 = Static594.anInt9285 << 9;
		} else {
			Static578.method8065();
		}
		Static408.method6014();
	}
}
