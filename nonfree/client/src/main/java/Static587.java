import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!tq", name = "t", descriptor = "F")
	public static float aFloat205;

	@OriginalMember(owner = "client!tq", name = "w", descriptor = "I")
	public static int anInt9057;

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "Lclient!ut;")
	public static final Class367 aClass367_13 = new Class367();

	@OriginalMember(owner = "client!tq", name = "u", descriptor = "Lclient!gha;")
	public static final Class134 aClass134_4 = new Class134();

	@OriginalMember(owner = "client!tq", name = "x", descriptor = "Lclient!qda;")
	public static final Class300 aClass300_4 = new Class300(16);

	@OriginalMember(owner = "client!tq", name = "y", descriptor = "Lclient!fj;")
	public static final Class117 aClass117_15 = new Class117(13, 8);

	@OriginalMember(owner = "client!tq", name = "z", descriptor = "Lclient!oh;")
	public static final Class268 aClass268_38 = new Class268("", 11);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!ha;Lclient!kq;II)V")
	public static void method7738(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) Class199 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = 63; local11 >= 0; local11--) {
			Static650.method8679(false, true);
			@Pc(33) int local33 = (local11 & 0x3F) << 10 | 0x3F | 0x380;
			@Pc(37) int local37 = Static411.anIntArray448[local33];
			Static373.method4918(true, false);
			arg1.aa(arg0, arg3 + (arg2.anInt4994 * (63 - local11) >> 6), arg2.anInt5035, (arg2.anInt4994 >> 6) + 1, local37, 0);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!bt;)V")
	public static void method7740(@OriginalArg(1) Class34 arg0) {
		Static255.aClass34_56 = arg0;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BZ)V")
	public static void method7741(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static77.anInt1630 != -1) {
				Static342.method7464(Static77.anInt1630);
			}
			for (@Pc(15) Class4_Sub28 local15 = (Class4_Sub28) Static242.aClass66_17.method1992(); local15 != null; local15 = (Class4_Sub28) Static242.aClass66_17.method1984()) {
				if (!local15.method9002()) {
					local15 = (Class4_Sub28) Static242.aClass66_17.method1992();
					if (local15 == null) {
						break;
					}
				}
				Static601.method7899(true, false, local15);
			}
			Static77.anInt1630 = -1;
			Static242.aClass66_17 = new Class66(8);
			Static260.method7100();
			Static77.anInt1630 = Static500.anInt7840;
			Static470.method6503(false);
			Static34.method8332();
			Static237.method3391(Static77.anInt1630);
		}
		Static178.method2883();
		Static106.aBoolean137 = false;
		Static95.method1941();
		Static530.anInt8205 = -1;
		Static244.method3606(Static203.anInt3317);
		Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4 = new Class3_Sub1_Sub2_Sub2_Sub1();
		Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anIntArray693[0] = Static224.anInt3557 / 2;
		Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9925 = Static224.anInt3557 * 512 / 2;
		Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9917 = Static267.anInt4309 * 512 / 2;
		Static652.anInt10283 = 0;
		Static611.anInt9382 = 0;
		Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anIntArray694[0] = Static267.anInt4309 / 2;
		if (Static259.anInt4200 == 2) {
			Static652.anInt10283 = Static414.anInt5950 << 9;
			Static611.anInt9382 = Static537.anInt8321 << 9;
		} else {
			Static366.method4841();
		}
		Static568.method7522();
	}
}
