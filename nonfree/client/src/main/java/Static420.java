import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_359 = new Class12(59, 8);

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "Ljava/lang/Boolean;")
	public static Boolean aBoolean628 = Boolean.FALSE;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
	public static void method5671() {
		if (Static40.anInt629 == 10 || Static40.anInt629 == 28) {
			Static66.method992(5000, Static4.anInt149 >> 10, Static302.anInt5030 >> 10);
		} else {
			@Pc(36) int local36 = Static255.aClass47_Sub1_Sub5_Sub2_2.anIntArray407[0] >> 3;
			@Pc(43) int local43 = Static255.aClass47_Sub1_Sub5_Sub2_2.anIntArray408[0] >> 3;
			if (local36 >= 0 && local36 < Static80.anInt6558 >> 3 && local43 >= 0 && Static104.anInt2048 >> 3 > local43) {
				Static66.method992(5000, local43, local36);
			} else {
				Static66.method992(0, Static104.anInt2048 >> 4, Static80.anInt6558 >> 4);
			}
		}
		Static245.method3551();
		Static401.method5480();
		Static17.method238();
		Static2.method36();
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
	public static void method5672() {
		Static373.method5289(Static206.aClass229_6);
		Static317.anInt5502++;
		if (Static104.aBoolean164 && Static196.aBoolean280) {
			@Pc(31) int local31 = Static38.aClass32_1.method3517();
			@Pc(35) int local35 = Static38.aClass32_1.method3524();
			local35 -= Static367.anInt6677;
			local31 -= Static255.anInt4375;
			if (local31 < Static283.anInt4756) {
				local31 = Static283.anInt4756;
			}
			if (Static296.anInt4967 > local35) {
				local35 = Static296.anInt4967;
			}
			if (Static283.anInt4756 + Static196.aClass229_5.anInt6905 < Static206.aClass229_6.anInt6905 + local31) {
				local31 = Static283.anInt4756 + Static196.aClass229_5.anInt6905 - Static206.aClass229_6.anInt6905;
			}
			if (local35 + Static206.aClass229_6.anInt6895 > Static196.aClass229_5.anInt6895 + Static296.anInt4967) {
				local35 = Static196.aClass229_5.anInt6895 + Static296.anInt4967 - Static206.aClass229_6.anInt6895;
			}
			@Pc(107) int local107 = local31 + Static196.aClass229_5.anInt6886 - Static283.anInt4756;
			@Pc(116) int local116 = local35 + Static196.aClass229_5.anInt6871 - Static296.anInt4967;
			@Pc(175) Class1_Sub16 local175;
			if (Static38.aClass32_1.method3522()) {
				if (Static317.anInt5502 > Static206.aClass229_6.anInt6888) {
					@Pc(129) int local129 = local31 - Static136.anInt2493;
					@Pc(134) int local134 = local35 - Static36.anInt7705;
					if (local129 > Static206.aClass229_6.anInt6910 || -Static206.aClass229_6.anInt6910 > local129 || local134 > Static206.aClass229_6.anInt6910 || -Static206.aClass229_6.anInt6910 > local134) {
						Static280.aBoolean374 = true;
					}
				}
				if (Static206.aClass229_6.anObjectArray7 != null && Static280.aBoolean374) {
					local175 = new Class1_Sub16();
					local175.aClass229_4 = Static206.aClass229_6;
					local175.anInt2540 = local116;
					local175.anObjectArray1 = Static206.aClass229_6.anObjectArray7;
					local175.anInt2543 = local107;
					Static354.method5070(local175);
					return;
				}
			} else {
				if (Static280.aBoolean374) {
					Static161.method2531();
					if (Static206.aClass229_6.anObjectArray24 != null) {
						local175 = new Class1_Sub16();
						local175.anObjectArray1 = Static206.aClass229_6.anObjectArray24;
						local175.anInt2540 = local116;
						local175.aClass229_3 = Static297.aClass229_8;
						local175.aClass229_4 = Static206.aClass229_6;
						local175.anInt2543 = local107;
						Static354.method5070(local175);
					}
					if (Static297.aClass229_8 != null && Static51.method754(Static206.aClass229_6) != null) {
						Static194.method5862(Static297.aClass229_8, Static206.aClass229_6);
					}
				} else if ((Static82.anInt1486 == 1 || Static102.method1634()) && Static119.anInt2296 > 2) {
					Static50.method697(Static255.anInt4375 + Static136.anInt2493, Static367.anInt6677 + Static36.anInt7705);
				} else if (Static88.method1243()) {
					Static50.method697(Static255.anInt4375 + Static136.anInt2493, Static36.anInt7705 + Static367.anInt6677);
				}
				Static206.aClass229_6 = null;
			}
		} else if (Static317.anInt5502 > 1) {
			Static206.aClass229_6 = null;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method5673(@OriginalArg(1) String arg0) {
		if (!Static217.aBoolean311) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12 = Static97.anInt1902;
		@Pc(14) int[] local14 = Static105.anIntArray107;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class47_Sub1_Sub5_Sub2 local24 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local14[local16]];
			if (local24 != null && Static255.aClass47_Sub1_Sub5_Sub2_2 != local24 && local24.aString66 != null && local24.aString66.equalsIgnoreCase(arg0)) {
				Static224.method3272(Static184.aClass254_75);
				Static201.aClass1_Sub14_Sub2_2.method4535(local14[local16]);
				Static201.aClass1_Sub14_Sub2_2.method4549(Static224.anInt3903);
				Static201.aClass1_Sub14_Sub2_2.method4504(Static380.anInt6831);
				Static201.aClass1_Sub14_Sub2_2.method4505(Static281.anInt4710);
				Static201.aClass1_Sub14_Sub2_2.method4554(0);
				Static382.method4555(local24.anIntArray407[0], local24.anIntArray408[0], 0, -2, true, local24.method4317(), 0, local24.method4317());
				local10 = true;
				break;
			}
		}
		if (!local10) {
			Static353.method5059(Static369.aClass96_99.method1935(Static389.anInt7061) + arg0);
		}
		if (Static217.aBoolean311) {
			Static161.method2531();
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZI)V")
	public static void method5674(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub1 local12 = Static190.method3007(arg0, 7);
		local12.method28();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII)V")
	public static void method5675(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static321.anInt5590 = arg2;
		Static84.anInt6174 = arg1;
		Static207.anInt3759 = arg0;
		Static383.anInt3787 = arg4;
		Static382.anInt5701 = arg3;
		if (Static207.anInt3759 >= 100) {
			@Pc(30) int local30 = Static382.anInt5701 * 128 + 64;
			@Pc(36) int local36 = Static321.anInt5590 * 128 + 64;
			@Pc(46) int local46 = Static405.method5510(local36, local30, Static1.anInt41) - Static84.anInt6174;
			@Pc(51) int local51 = local30 - Static302.anInt5030;
			@Pc(56) int local56 = local46 - Static264.anInt4481;
			@Pc(61) int local61 = local36 - Static4.anInt149;
			@Pc(73) int local73 = (int) Math.sqrt((double) (local51 * local51 + local61 * local61));
			Static401.anInt7130 = (int) (Math.atan2((double) local56, (double) local73) * 2607.5945876176133D) & 0x3FFF;
			Static432.anInt7548 = (int) (Math.atan2((double) local51, (double) local61) * -2607.5945876176133D) & 0x3FFF;
			Static423.anInt7380 = 0;
			if (Static401.anInt7130 < 1024) {
				Static401.anInt7130 = 1024;
			}
			if (Static401.anInt7130 > 3072) {
				Static401.anInt7130 = 3072;
			}
		}
		Static57.anInt883 = 2;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "()V")
	public static void method5676() {
		Static360.method5151(Static29.anInt482);
	}
}
