import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
	public static int anInt4643;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
	public static void method4078() {
		@Pc(1) Class154 local1 = Static329.aClass154_48;
		synchronized (Static329.aClass154_48) {
			Static329.aClass154_48.method3746();
		}
		local1 = Static350.aClass154_53;
		synchronized (Static350.aClass154_53) {
			Static350.aClass154_53.method3746();
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V")
	public static void method4079() {
		Static39.aClass2_Sub13_Sub2_4.anInt4788 = 0;
		Static229.aClass77_164 = null;
		Static327.anInt5773 = 0;
		Static85.aClass2_Sub13_Sub2_11.anInt4788 = 0;
		Static327.aClass77_147 = null;
		Static130.anInt2453 = 0;
		Static46.aClass77_19 = null;
		Static90.anInt1710 = 0;
		Static265.aClass77_123 = null;
		Static106.method1854();
		Static237.method3865();
		for (@Pc(38) int local38 = 0; local38 < 2048; local38++) {
			Static90.aClass12_Sub1_Sub2_Sub2Array1[local38] = null;
		}
		Static267.aClass12_Sub1_Sub2_Sub2_1 = null;
		for (@Pc(52) int local52 = 0; local52 < Static107.aClass12_Sub1_Sub2_Sub1Array1.length; local52++) {
			@Pc(58) Class12_Sub1_Sub2_Sub1 local58 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local52];
			if (local58 != null) {
				local58.anInt5345 = -1;
			}
		}
		Static90.method1538();
		Static283.anInt5017 = 1;
		Static345.method5253(30);
		for (@Pc(79) int local79 = 0; local79 < 100; local79++) {
			Static370.aBooleanArray143[local79] = true;
		}
		Static360.method5472();
		Static231.aClass2_Sub18_2 = null;
		Static92.aLong59 = 0L;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)V")
	public static void method4080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class2_Sub1_Sub2 local15 = Static323.method4982(arg1, 14);
		local15.method410();
		local15.anInt348 = arg0;
	}
}
