import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!raa", name = "yb", descriptor = "[F")
	public static final float[] aFloatArray64 = new float[4];

	@OriginalMember(owner = "client!raa", name = "c", descriptor = "(B)V")
	public static void method6995() {
		for (@Pc(11) int local11 = 0; local11 < 100; local11++) {
			Static264.aBooleanArray16[local11] = true;
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Z)V")
	public static void method6997() {
		while (true) {
			if (Static257.aClass5_Sub22_Sub1_1.method2649(Static50.anInt1005) >= 15) {
				@Pc(12) int local12 = Static257.aClass5_Sub22_Sub1_1.method2655(15);
				if (local12 != 32767) {
					@Pc(17) boolean local17 = false;
					@Pc(28) Class5_Sub3 local28 = (Class5_Sub3) Static445.aClass273_29.method6581((long) local12);
					@Pc(34) Class4_Sub2_Sub1_Sub1_Sub2 local34;
					if (local28 == null) {
						local34 = new Class4_Sub2_Sub1_Sub1_Sub2();
						local34.anInt1225 = local12;
						local28 = new Class5_Sub3(local34);
						Static445.aClass273_29.method6585((long) local12, local28);
						Static467.aClass5_Sub3Array1[Static235.anInt4322++] = local28;
						local17 = true;
					}
					local34 = local28.aClass4_Sub2_Sub1_Sub1_Sub2_1;
					Static209.anIntArray198[Static280.anInt4989++] = local12;
					local34.anInt1230 = Static622.anInt10382;
					if (local34.aClass225_1 != null && local34.aClass225_1.method4985()) {
						Static390.method5789(local34);
					}
					@Pc(88) int local88 = Static257.aClass5_Sub22_Sub1_1.method2655(5);
					if (local88 > 15) {
						local88 -= 32;
					}
					@Pc(97) int local97 = Static257.aClass5_Sub22_Sub1_1.method2655(2);
					local34.method1045(Static439.aClass92_2.method1914(Static257.aClass5_Sub22_Sub1_1.method2655(14)));
					@Pc(112) int local112 = Static257.aClass5_Sub22_Sub1_1.method2655(1);
					@Pc(117) int local117 = Static257.aClass5_Sub22_Sub1_1.method2655(1);
					if (local117 == 1) {
						Static435.anIntArray405[Static58.anInt1145++] = local12;
					}
					@Pc(141) int local141 = (Static257.aClass5_Sub22_Sub1_1.method2655(3) + 4 & 0x37E00007) << 11;
					@Pc(146) int local146 = Static257.aClass5_Sub22_Sub1_1.method2655(5);
					local34.method1030(local34.aClass225_1.anInt5618);
					if (local146 > 15) {
						local146 -= 32;
					}
					local34.anInt1207 = local34.aClass225_1.anInt5626 << 3;
					if (local17) {
						local34.method1024(true, local141);
					}
					local34.method1041(local97, local112 == 1, local88 + Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anIntArray95[0], local146 + Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anIntArray94[0], local34.method1018());
					if (local34.aClass225_1.method4985()) {
						Static475.method7020(null, local34.aByte132, local34.anIntArray94[0], null, 0, local34, local34.anIntArray95[0]);
					}
					continue;
				}
			}
			Static257.aClass5_Sub22_Sub1_1.method2659();
			return;
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V")
	public static void method7001() {
		Static461.aClass87_191.method1796();
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method7002(@OriginalArg(0) String arg0) {
		return Static632.aHashtable7.containsKey(arg0);
	}

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(Z)V")
	public static void method7003() {
		for (@Pc(10) Class4_Sub10 local10 = (Class4_Sub10) Static609.aClass99_10.method2044(); local10 != null; local10 = (Class4_Sub10) Static609.aClass99_10.method2044()) {
			Static612.method8707(local10);
		}
		@Pc(32) int local32;
		@Pc(31) int local31;
		if (Static97.aClass5_Sub25_8.aClass6_Sub6_2.method1639() == 1) {
			local32 = 0;
			local31 = 3;
		} else {
			local31 = Static173.anInt3110;
			local32 = Static173.anInt3110;
		}
		Static75.method1288();
		for (@Pc(41) int local41 = local32; local41 <= local31; local41++) {
			Static75.method1284();
			Static75.method1282(local41);
			Static75.method1287(local41);
		}
		Static75.method1298();
		Static75.method1291();
	}
}
