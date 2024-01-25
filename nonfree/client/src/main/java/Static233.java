import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!jaa", name = "pb", descriptor = "I")
	public static int anInt4814;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IZ)V")
	public static void method4046(@OriginalArg(1) boolean arg0) {
		if (Static393.aClass8_2 != null) {
			Static393.aClass8_2.method362();
			Static393.aClass8_2 = null;
		}
		Static353.anInt7069 = 0;
		Static247.method4472();
		Static442.method6915();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static403.aClass350Array1[local19].method8207();
		}
		Static348.method2213(false);
		System.gc();
		Static314.method5271();
		Static509.anInt9416 = -1;
		Static353.aBoolean597 = false;
		Static262.method4616(true);
		Static39.anInt1074 = 0;
		Static393.anInt7567 = 0;
		Static230.anInt4667 = 0;
		Static368.anInt7248 = 0;
		Static187.anInt3746 = 0;
		Static563.anInt10006 = 0;
		for (@Pc(59) int local59 = 0; local59 < Static516.aClass357Array3.length; local59++) {
			Static516.aClass357Array3[local59] = null;
		}
		Static514.method7669();
		for (@Pc(75) int local75 = 0; local75 < 2048; local75++) {
			Static378.aClass2_Sub2_Sub1_Sub1Array10[local75] = null;
		}
		Static268.anInt5680 = 0;
		Static331.aClass25_25.method948();
		Static17.anInt6046 = 0;
		Static30.aClass25_5.method948();
		Static181.method3223();
		Static445.anInt8469 = 0;
		Static588.aClass322_1.method7759();
		Static467.method7181();
		Static531.method7810();
		Static252.aLong155 = 0L;
		Static90.aClass3_Sub26_10 = null;
		if (arg0) {
			Static168.method3104(12);
			return;
		}
		Static168.method3104(3);
		try {
			Static603.method4977("loggedout", Static253.anApplet3);
		} catch (@Pc(132) Throwable local132) {
		}
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(II)V")
	public static void method4049(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub4_Sub6 local8 = Static367.method6025(1, arg0);
		local8.method1896();
	}
}
