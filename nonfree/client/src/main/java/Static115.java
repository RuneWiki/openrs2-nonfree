import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!dia", name = "r", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_37 = new Class186(135, -1);

	@OriginalMember(owner = "client!dia", name = "J", descriptor = "Lclient!m;")
	public static final Class235 aClass235_15 = new Class235(32);

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(I)V")
	public static void method2033() {
		@Pc(12) Class338 local12 = Static381.aClass338_35;
		synchronized (Static381.aClass338_35) {
			Static381.aClass338_35.method8051();
		}
		local12 = Static30.aClass338_1;
		synchronized (Static30.aClass338_1) {
			Static30.aClass338_1.method8051();
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(ILclient!rba;)V")
	public static void method2034(@OriginalArg(1) Class3_Sub28 arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static323.anInt5655; local12++) {
			@Pc(18) int local18 = arg0.method5331();
			@Pc(22) int local22 = arg0.method5272();
			if (local22 == 65535) {
				local22 = -1;
			}
			if (Static460.aClass256_Sub1Array2[local18] != null) {
				Static460.aClass256_Sub1Array2[local18].anInt7707 = local22;
			}
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method2035(@OriginalArg(1) Class67 arg0) {
		Static705.aClass44_53 = Static318.method4777(Static671.anInt10623, true, true, arg0);
		Static48.aClass330_1 = Static607.method8322(Static671.anInt10623, arg0);
		Static418.aClass44_32 = Static318.method4777(Static692.anInt10862, true, true, arg0);
		Static687.aClass330_13 = Static607.method8322(Static692.anInt10862, arg0);
		Static427.aClass44_34 = Static318.method4777(Static375.anInt6392, true, true, arg0);
		Static381.aClass330_7 = Static607.method8322(Static375.anInt6392, arg0);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(BLclient!lv;)V")
	public static void method2036(@OriginalArg(1) Class3_Sub32 arg0) {
		Static671.aClass3_Sub22_Sub5_3.method9335(false, arg0);
		if (Static296.aClass33_3 != null) {
			Static296.aClass33_3.method8232(Static671.aClass3_Sub22_Sub5_3);
		}
		Static112.anInt2244 = 0;
	}
}
