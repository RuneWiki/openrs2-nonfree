import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "Lclient!gp;")
	public static Class117 aClass117_61;

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
	public static int anInt2350;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "Lclient!hca;")
	public static final Class125 aClass125_1 = new Class125("WIP", 2);

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
	public static void method2155() {
		Static377.method5650(Static499.aClass220_17);
		Static136.anInt2832++;
		if (Static525.aBoolean644 && Static527.aBoolean646) {
			@Pc(33) int local33 = Static280.aClass214_1.method6766();
			@Pc(37) int local37 = Static280.aClass214_1.method6770();
			local33 -= Static543.anInt6390;
			local37 -= Static364.anInt6815;
			if (Static277.anInt5400 > local33) {
				local33 = Static277.anInt5400;
			}
			if (local37 < Static492.anInt8448) {
				local37 = Static492.anInt8448;
			}
			if (Static277.anInt5400 + Static178.aClass220_8.anInt6627 < local33 - -Static499.aClass220_17.anInt6627) {
				local33 = Static277.anInt5400 + Static178.aClass220_8.anInt6627 - Static499.aClass220_17.anInt6627;
			}
			if (local37 + Static499.aClass220_17.anInt6681 > Static492.anInt8448 - -Static178.aClass220_8.anInt6681) {
				local37 = Static492.anInt8448 + Static178.aClass220_8.anInt6681 - Static499.aClass220_17.anInt6681;
			}
			@Pc(103) int local103 = Static178.aClass220_8.anInt6626 + local33 - Static277.anInt5400;
			@Pc(112) int local112 = local37 + Static178.aClass220_8.anInt6609 - Static492.anInt8448;
			@Pc(171) Class5_Sub17 local171;
			if (Static280.aClass214_1.method6771()) {
				if (Static136.anInt2832 > Static499.aClass220_17.anInt6655) {
					@Pc(125) int local125 = local33 - Static219.anInt4144;
					@Pc(130) int local130 = local37 - Static503.anInt8592;
					if (Static499.aClass220_17.anInt6668 < local125 || -Static499.aClass220_17.anInt6668 > local125 || local130 > Static499.aClass220_17.anInt6668 || -Static499.aClass220_17.anInt6668 > local130) {
						Static377.aBoolean483 = true;
					}
				}
				if (Static499.aClass220_17.anObjectArray23 != null && Static377.aBoolean483) {
					local171 = new Class5_Sub17();
					local171.anInt2985 = local112;
					local171.aClass220_5 = Static499.aClass220_17;
					local171.anObjectArray3 = Static499.aClass220_17.anObjectArray23;
					local171.anInt2983 = local103;
					Static266.method4403(local171);
					return;
				}
			} else {
				if (Static377.aBoolean483) {
					Static187.method3151();
					if (Static499.aClass220_17.anObjectArray34 != null) {
						local171 = new Class5_Sub17();
						local171.aClass220_6 = Static350.aClass220_11;
						local171.aClass220_5 = Static499.aClass220_17;
						local171.anInt2985 = local112;
						local171.anInt2983 = local103;
						local171.anObjectArray3 = Static499.aClass220_17.anObjectArray34;
						Static266.method4403(local171);
					}
					if (Static350.aClass220_11 != null && Static68.method1286(Static499.aClass220_17) != null) {
						Static241.method4091(Static350.aClass220_11, Static499.aClass220_17);
					}
				} else if ((Static325.anInt6252 == 1 || Static136.method2573()) && Static257.anInt5147 > 2) {
					Static162.method2908(Static543.anInt6390 + Static219.anInt4144, Static503.anInt8592 + Static364.anInt6815);
				} else if (Static358.method5520()) {
					Static162.method2908(Static543.anInt6390 + Static219.anInt4144, Static503.anInt8592 + Static364.anInt6815);
				}
				Static499.aClass220_17 = null;
			}
		} else if (Static136.anInt2832 > 1) {
			Static499.aClass220_17 = null;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
	public static void method2159() {
		Static356.aClass25Array15 = null;
		Static130.aClass13_2 = null;
		Static492.aClass13_3 = null;
		Static282.aClass25Array12 = null;
		Static279.aClass25Array11 = null;
		Static84.aClass25Array4 = null;
		Static147.aClass25Array6 = null;
		Static343.aClass25_19 = null;
		Static77.aClass25Array13 = null;
		Static179.aClass25Array10 = null;
		Static45.aClass25Array2 = null;
		Static529.aClass25Array17 = null;
		Static300.aClass25_15 = null;
		Static121.aClass13_1 = null;
		Static167.aClass25Array9 = null;
		Static301.aClass25Array14 = null;
		Static22.aClass25Array1 = null;
		Static438.aClass25Array16 = null;
	}
}
