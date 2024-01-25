import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!waa", name = "C", descriptor = "I")
	public static int anInt9426;

	@OriginalMember(owner = "client!waa", name = "eb", descriptor = "Lclient!jc;")
	public static Class6 aClass6_1;

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
	public static void method7828(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static358.anInt6694 >= 100) {
			Static206.method7966(Static284.aClass88_155.method2391(Static345.anInt6495));
			return;
		}
		@Pc(28) String local28 = Static458.method6893(arg0);
		if (local28 == null) {
			return;
		}
		@Pc(71) String local71;
		for (@Pc(33) int local33 = 0; local33 < Static358.anInt6694; local33++) {
			@Pc(41) String local41 = Static458.method6893(Static440.aStringArray54[local33]);
			if (local41 != null && local41.equals(local28)) {
				Static206.method7966(arg0 + Static276.aClass88_152.method2391(Static345.anInt6495));
				return;
			}
			if (Static540.aStringArray61[local33] != null) {
				local71 = Static458.method6893(Static540.aStringArray61[local33]);
				if (local71 != null && local71.equals(local28)) {
					Static206.method7966(arg0 + Static276.aClass88_152.method2391(Static345.anInt6495));
					return;
				}
			}
		}
		for (@Pc(97) int local97 = 0; local97 < Static167.anInt3850; local97++) {
			local71 = Static458.method6893(Static205.aStringArray24[local97]);
			if (local71 != null && local71.equals(local28)) {
				Static206.method7966(Static130.aClass88_76.method2391(Static345.anInt6495) + arg0 + Static115.aClass88_67.method2391(Static345.anInt6495));
				return;
			}
			if (Static251.aStringArray28[local97] != null) {
				@Pc(140) String local140 = Static458.method6893(Static251.aStringArray28[local97]);
				if (local140 != null && local140.equals(local28)) {
					Static206.method7966(Static130.aClass88_76.method2391(Static345.anInt6495) + arg0 + Static115.aClass88_67.method2391(Static345.anInt6495));
					return;
				}
			}
		}
		if (Static458.method6893(Static440.aClass30_Sub1_Sub1_Sub1_2.aString6).equals(local28)) {
			Static206.method7966(Static407.aClass88_220.method2391(Static345.anInt6495));
		} else {
			Static332.method5312(Static366.aClass77_86);
			Static383.aClass12_Sub8_Sub2_1.method5214(Static201.method3811(arg0) + 1);
			Static383.aClass12_Sub8_Sub2_1.method5180(arg0);
			Static383.aClass12_Sub8_Sub2_1.method5214(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "(B)V")
	public static void method7830() {
		Static331.method5282(Static191.aClass198_6);
		Static463.anInt8420++;
		if (Static451.aBoolean357 && Static109.aBoolean213) {
			@Pc(28) int local28 = aClass6_1.method3754();
			@Pc(32) int local32 = aClass6_1.method3757();
			local28 -= Static43.anInt839;
			local32 -= Static427.anInt7899;
			if (local28 < Static511.anInt9214) {
				local28 = Static511.anInt9214;
			}
			if (local28 + Static191.aClass198_6.anInt5762 > Static309.aClass198_9.anInt5762 + Static511.anInt9214) {
				local28 = Static511.anInt9214 + Static309.aClass198_9.anInt5762 - Static191.aClass198_6.anInt5762;
			}
			if (local32 < Static75.anInt1788) {
				local32 = Static75.anInt1788;
			}
			if (Static75.anInt1788 + Static309.aClass198_9.anInt5715 < Static191.aClass198_6.anInt5715 + local32) {
				local32 = Static309.aClass198_9.anInt5715 + Static75.anInt1788 - Static191.aClass198_6.anInt5715;
			}
			@Pc(104) int local104 = Static309.aClass198_9.anInt5732 + local28 - Static511.anInt9214;
			@Pc(112) int local112 = Static309.aClass198_9.anInt5791 + local32 - Static75.anInt1788;
			@Pc(127) Class12_Sub6 local127;
			if (aClass6_1.method3756()) {
				if (Static191.aClass198_6.anInt5759 < Static463.anInt8420) {
					@Pc(204) int local204 = local28 - Static477.anInt8703;
					@Pc(208) int local208 = local32 - Static100.anInt2302;
					if (local204 > Static191.aClass198_6.anInt5775 || -Static191.aClass198_6.anInt5775 > local204 || local208 > Static191.aClass198_6.anInt5775 || local208 < -Static191.aClass198_6.anInt5775) {
						Static478.aBoolean614 = true;
					}
				}
				if (Static191.aClass198_6.anObjectArray9 != null && Static478.aBoolean614) {
					local127 = new Class12_Sub6();
					local127.anInt1513 = local112;
					local127.anInt1509 = local104;
					local127.anObjectArray2 = Static191.aClass198_6.anObjectArray9;
					local127.aClass198_2 = Static191.aClass198_6;
					Static312.method5029(local127);
				}
			} else {
				if (Static478.aBoolean614) {
					Static227.method4101();
					if (Static191.aClass198_6.anObjectArray14 != null) {
						local127 = new Class12_Sub6();
						local127.aClass198_1 = Static353.aClass198_12;
						local127.anInt1509 = local104;
						local127.anObjectArray2 = Static191.aClass198_6.anObjectArray14;
						local127.anInt1513 = local112;
						local127.aClass198_2 = Static191.aClass198_6;
						Static312.method5029(local127);
					}
					if (Static353.aClass198_12 != null && Static67.method1534(Static191.aClass198_6) != null) {
						Static116.method2392(Static353.aClass198_12, Static191.aClass198_6);
					}
				} else if ((Static268.anInt5393 == 1 || Static377.method7984()) && Static8.anInt118 > 2) {
					Static488.method7289(Static43.anInt839 + Static477.anInt8703, Static100.anInt2302 + Static427.anInt7899);
				} else if (Static438.method6664()) {
					Static488.method7289(Static43.anInt839 + Static477.anInt8703, Static100.anInt2302 + Static427.anInt7899);
				}
				Static191.aClass198_6 = null;
			}
		} else if (Static463.anInt8420 > 1) {
			Static191.aClass198_6 = null;
		}
	}

	@OriginalMember(owner = "client!waa", name = "l", descriptor = "(I)V")
	public static void method7831() {
		Static304.method4953();
		Static497.aClass42_9 = null;
		Static540.aClass124_4 = null;
		Static500.aClass124_3 = null;
		Static544.aClass240ArrayArray1 = null;
		Static98.aClass124_1 = null;
	}
}
