import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!il", name = "bb", descriptor = "[I")
	public static int[] anIntArray171;

	@OriginalMember(owner = "client!il", name = "E", descriptor = "I")
	public static int anInt2422 = 0;

	@OriginalMember(owner = "client!il", name = "X", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_20 = new Class26(8);

	@OriginalMember(owner = "client!il", name = "Z", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray10 = new int[2][][];

	@OriginalMember(owner = "client!il", name = "cb", descriptor = "Z")
	public static boolean aBoolean156 = false;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILclient!uo;)V")
	public static void method2020(@OriginalArg(1) Class129 arg0) {
		if (Static115.aClass16_20.method183() == 0) {
			return;
		}
		@Pc(32) Class11_Sub12 local32;
		if (Static74.anInt1413 == 0 || Static74.anInt1413 == 2) {
			for (local32 = (Class11_Sub12) Static115.aClass16_20.method193(); local32 != null; local32 = (Class11_Sub12) Static115.aClass16_20.method188()) {
				Static144.method2191(local32.anInt1492, local32.anInt1490, local32.anInt1494, local32.anInt1497, false, local32.anInt1493, arg0, arg0, false, local32.aBoolean90 ? Static156.aClass67_Sub3_Sub3_Sub2_2.aClass140_2 : null, Static283.aClass9_3);
				local32.method5701();
			}
			Static239.method4236();
			return;
		}
		if (Static262.aClass129_9 == null) {
			@Pc(80) Canvas local80 = new Canvas();
			local80.setSize(36, 32);
			Static262.aClass129_9 = Static326.method4946(local80, Static77.aClass118_7, 0, Static76.anInterface2_6, 0);
			Static297.aClass9_4 = Static262.aClass129_9.method4933(Static22.method310(Static318.aClass144_101, Static82.anInt1505), Static368.method2868(Static182.aClass144_49, Static82.anInt1505));
		}
		for (local32 = (Class11_Sub12) Static115.aClass16_20.method193(); local32 != null; local32 = (Class11_Sub12) Static115.aClass16_20.method188()) {
			Static144.method2191(local32.anInt1492, local32.anInt1490, local32.anInt1494, local32.anInt1497, false, local32.anInt1493, Static262.aClass129_9, arg0, false, local32.aBoolean90 ? Static156.aClass67_Sub3_Sub3_Sub2_2.aClass140_2 : null, Static297.aClass9_4);
			local32.method5701();
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)V")
	public static void method2023(@OriginalArg(0) int arg0) {
		@Pc(13) Class11_Sub4_Sub12 local13 = Static35.method512(7, arg0);
		local13.method3864();
	}

	@OriginalMember(owner = "client!il", name = "f", descriptor = "(I)V")
	public static void method2024() {
		Static308.method5159();
		Static86.method1242();
		Static130.method4129();
		Static57.method864();
		Static233.method4162();
		Static148.method2258();
		Static155.method2495();
		Static32.method461();
		Static216.method4852();
		Static346.method5617();
		Static314.method1714();
		Static277.method4681();
		Static214.method3857();
		Static185.method3208();
		Static73.method1116();
		Static283.method4715();
		Static152.method4675();
		Static12.method174();
		Static153.method2463();
		Static210.method3757();
		Static234.method3683();
		Static90.method4103();
		Static192.method3523();
		Static108.aClass26_17.method328();
		Static156.aClass26_26.method328();
		Static100.aClass26_15.method328();
		aClass26_20.method328();
		Static93.aClass26_12.method328();
	}
}
