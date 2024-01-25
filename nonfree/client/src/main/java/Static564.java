import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static564 {

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
	public static int anInt9697;

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "[I")
	public static int[] anIntArray514;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
	public static int anInt9701 = 0;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public static void method7935() {
		if (Static268.method4834(Static333.anInt6626) || Static275.method8428(Static333.anInt6626)) {
			Static348.method5723(Static259.anInt6990 >> 12, Static184.anInt4048 >> 12, 5000);
		} else {
			@Pc(33) int local33 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anIntArray197[0] >> 3;
			@Pc(40) int local40 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anIntArray198[0] >> 3;
			if (local33 >= 0 && Static306.anInt6176 >> 3 > local33 && local40 >= 0 && local40 < Static108.anInt2930 >> 3) {
				Static348.method5723(local40, local33, 5000);
			} else {
				Static348.method5723(Static108.anInt2930 >> 4, Static306.anInt6176 >> 4, 0);
			}
		}
		Static506.method7277();
		Static409.method6425();
		Static403.method6327();
		Static171.method3232();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)I")
	public static int method7938(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method7940(@OriginalArg(1) String arg0) {
		@Pc(6) Class6_Sub17 local6 = Static145.method2840();
		local6.aClass6_Sub8_Sub1_2.method8211(Static519.aClass238_12.anInt7405);
		local6.aClass6_Sub8_Sub1_2.method8241(0);
		@Pc(21) int local21 = local6.aClass6_Sub8_Sub1_2.anInt10061;
		local6.aClass6_Sub8_Sub1_2.method8241(637);
		@Pc(30) int[] local30 = Static229.method4153(local6);
		@Pc(34) int local34 = local6.aClass6_Sub8_Sub1_2.anInt10061;
		local6.aClass6_Sub8_Sub1_2.method8205(arg0);
		local6.aClass6_Sub8_Sub1_2.method8211(Static638.anInt10709);
		local6.aClass6_Sub8_Sub1_2.anInt10061 += 7;
		local6.aClass6_Sub8_Sub1_2.method8252(local30, local34, local6.aClass6_Sub8_Sub1_2.anInt10061);
		local6.aClass6_Sub8_Sub1_2.method8224(local6.aClass6_Sub8_Sub1_2.anInt10061 - local21);
		Static452.method6867(local6);
		Static284.anInt5943 = 0;
		Static109.anInt2942 = -3;
		Static632.anInt10595 = 1;
		Static634.anInt10666 = 0;
	}
}
