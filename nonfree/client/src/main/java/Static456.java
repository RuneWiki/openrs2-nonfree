import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
	public static int anInt7775 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
	public static void method6472() {
		@Pc(9) int[] local9 = new int[Static342.aClass250_2.anInt7128];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static342.aClass250_2.anInt7128; local13++) {
			@Pc(20) Class133 local20 = Static342.aClass250_2.method5980(local13);
			if (local20.anInt3943 >= 0 || local20.anInt3932 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static458.anIntArray733 = new int[local11];
		for (@Pc(53) int local53 = 0; local53 < local11; local53++) {
			Static458.anIntArray733[local53] = local9[local53];
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLclient!th;I)V")
	public static void method6474(@OriginalArg(1) Class283 arg0, @OriginalArg(2) int arg1) {
		if (Static539.aBoolean635) {
			arg1 = 0;
			Static539.aBoolean635 = false;
		}
		if (Static115.aClass283_2 != null && Static115.aClass283_2.method6532(arg0)) {
			return;
		}
		Static115.aClass283_2 = arg0;
		Static510.aLong319 = Static60.method1119();
		Static432.anInt7513 = arg1;
		Static248.anInt2367 = arg1;
		if (Static248.anInt2367 == 0) {
			Static463.method6530();
			return;
		}
		Static224.aFloat96 = Static235.aFloat99;
		Static302.aFloat113 = Static283.aFloat106;
		Static141.anInt2697 = Static69.anInt1328;
		Static402.aFloat142 = Static2.aFloat116;
		Static5.aClass45_1 = Static104.aClass45_2;
		Static150.anInt2781 = Static24.anInt539;
		Static302.aFloat114 = Static124.aFloat26;
		Static444.anInt7641 = Static184.anInt7343;
		Static129.aFloat29 = Static493.aFloat157;
		Static117.aFloat22 = Static498.aFloat160;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZLclient!bi;)V")
	public static void method6475(@OriginalArg(1) Class27 arg0) {
		Static154.aClass27_1 = arg0;
	}
}
