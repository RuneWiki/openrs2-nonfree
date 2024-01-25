import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
	public static int anInt1136 = 0;

	@OriginalMember(owner = "client!dp", name = "y", descriptor = "I")
	public static int anInt1153 = 0;

	@OriginalMember(owner = "client!dp", name = "C", descriptor = "I")
	public static int anInt1157 = 0;

	@OriginalMember(owner = "client!dp", name = "F", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray6 = null;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IZI)I")
	public static int method1010(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(46) int local46 = (arg0 & 0x7F) * 96 >> 7;
			if (local46 < 2) {
				local46 = 2;
			} else if (local46 > 126) {
				local46 = 126;
			}
			return (arg0 & 0xFF80) + local46;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!ja;BLclient!dp;)V")
	public static void method1012(@OriginalArg(0) Class81 arg0, @OriginalArg(2) Class53 arg1) {
		@Pc(14) Class88[] local14 = Static363.method2249(arg1, Static196.anInt3680);
		Static204.aClass40Array27 = new Class40[local14.length];
		for (@Pc(20) int local20 = 0; local20 < local14.length; local20++) {
			Static204.aClass40Array27[local20] = arg0.method3015(local14[local20]);
		}
		local14 = Static363.method2249(arg1, Static142.anInt2558);
		Static77.aClass40Array14 = new Class40[local14.length];
		for (@Pc(51) int local51 = 0; local51 < local14.length; local51++) {
			Static77.aClass40Array14[local51] = arg0.method3015(local14[local51]);
		}
		local14 = Static363.method2249(arg1, Static127.anInt4327);
		Static352.aClass40Array44 = new Class40[local14.length];
		for (@Pc(82) int local82 = 0; local82 < local14.length; local82++) {
			Static352.aClass40Array44[local82] = arg0.method3015(local14[local82]);
		}
		local14 = Static363.method2249(arg1, Static211.anInt3848);
		Static85.aClass40Array15 = new Class40[local14.length];
		for (@Pc(109) int local109 = 0; local109 < local14.length; local109++) {
			Static85.aClass40Array15[local109] = arg0.method3015(local14[local109]);
		}
		local14 = Static363.method2249(arg1, Static295.anInt5560);
		Static33.aClass40Array5 = new Class40[local14.length];
		for (@Pc(140) int local140 = 0; local140 < local14.length; local140++) {
			Static33.aClass40Array5[local140] = arg0.method3015(local14[local140]);
		}
		local14 = Static363.method2249(arg1, Static175.anInt3296);
		Static94.aClass40Array16 = new Class40[local14.length];
		for (@Pc(171) int local171 = 0; local171 < local14.length; local171++) {
			Static94.aClass40Array16[local171] = arg0.method3015(local14[local171]);
		}
		local14 = Static363.method2249(arg1, Static66.anInt1232);
		Static310.aClass40Array39 = new Class40[local14.length];
		for (@Pc(198) int local198 = 0; local198 < local14.length; local198++) {
			Static310.aClass40Array39[local198] = arg0.method3015(local14[local198]);
		}
		local14 = Static363.method2249(arg1, Static298.anInt5635);
		Static185.aClass40Array43 = new Class40[local14.length];
		for (@Pc(225) int local225 = 0; local225 < local14.length; local225++) {
			Static185.aClass40Array43[local225] = arg0.method3015(local14[local225]);
		}
		local14 = Static363.method2249(arg1, Static289.anInt5436);
		Static40.aClass40Array8 = new Class40[local14.length];
		for (@Pc(256) int local256 = 0; local256 < local14.length; local256++) {
			Static40.aClass40Array8[local256] = arg0.method3015(local14[local256]);
		}
		local14 = Static363.method2249(arg1, Static306.anInt5793);
		Static98.aClass40Array17 = new Class40[local14.length];
		for (@Pc(283) int local283 = 0; local283 < local14.length; local283++) {
			Static98.aClass40Array17[local283] = arg0.method3015(local14[local283]);
		}
		local14 = Static363.method2249(arg1, Static52.anInt1005);
		Static177.aClass40Array23 = new Class40[local14.length];
		for (@Pc(310) int local310 = 0; local310 < local14.length; local310++) {
			Static177.aClass40Array23[local310] = arg0.method3015(local14[local310]);
		}
		local14 = Static363.method2249(arg1, Static18.anInt312);
		Static312.aClass40Array40 = new Class40[local14.length];
		for (@Pc(341) int local341 = 0; local341 < local14.length; local341++) {
			Static312.aClass40Array40[local341] = arg0.method3015(local14[local341]);
		}
		local14 = Static363.method2249(arg1, Static180.anInt3824);
		Static168.aClass40Array10 = new Class40[local14.length];
		for (@Pc(372) int local372 = 0; local372 < local14.length; local372++) {
			Static168.aClass40Array10[local372] = arg0.method3015(local14[local372]);
		}
		Static39.aClass40_2 = arg0.method3015(Static363.method2255(arg1, Static292.anInt5493, 0));
	}

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "(B)V")
	public static void method1030() {
		if (Static216.aClass11_5 != null) {
			Static216.aClass11_5.method159();
			Static216.aClass11_5 = null;
		}
		Static83.method1391();
		Static289.method4941();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static334.aClass27Array1[local17].method522();
		}
		Static31.method487(false);
		System.gc();
		Static300.method5157();
		Static40.aBoolean54 = false;
		Static253.anInt4718 = -1;
		Static76.method3066(true);
		Static334.aBoolean408 = false;
		Static300.anInt5672 = 0;
		Static154.anInt2914 = 0;
		Static296.anInt5969 = 0;
		Static44.anInt881 = 0;
		for (@Pc(54) int local54 = 0; local54 < Static330.aClass154Array1.length; local54++) {
			Static330.aClass154Array1[local54] = null;
		}
		Static149.anInt2759 = 0;
		Static200.anInt3712 = 0;
		for (@Pc(71) int local71 = 0; local71 < 2048; local71++) {
			Static343.aClass44_Sub4_Sub4_Sub1Array1[local71] = null;
			Static132.aClass6_Sub10Array1[local71] = null;
		}
		for (@Pc(87) int local87 = 0; local87 < 32768; local87++) {
			Static239.aClass44_Sub4_Sub4_Sub2Array8[local87] = null;
		}
		Static33.aClass108_3.method2909();
		Static191.method3588();
		Static31.anInt579 = 0;
		Static289.method4943();
		Static85.method1434();
		Static204.method3689();
		Static153.method3083(true);
		try {
			Static365.method3241(Static308.aClass206_5.anApplet1, "loggedout");
		} catch (@Pc(131) Throwable local131) {
		}
	}
}
