import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
	public static int anInt4712;

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
	public static int anInt4714 = 0;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!vc;I)V")
	public static void method4162(@OriginalArg(0) Class63 arg0) {
		@Pc(7) int local7 = Static236.anInt2045;
		@Pc(13) int local13 = Static255.anInt4503;
		@Pc(15) int local15 = Static108.anInt5290;
		@Pc(17) int local17 = Static320.anInt5473;
		arg0.method1951(local13, local17, local15, -10660793, local7);
		arg0.method1951(local13 + 1, 16, local15 - 2, -16777216, local7 + 1);
		arg0.method2027(local15 - 2, local17 + -19, local7 + 1, -16777216, local13 + 18);
		Static340.aClass9_4.method5052(-10660793, local13 + 14, Static190.aClass32_48.method701(Static107.anInt2498), -1, local7 + 3);
		@Pc(76) int local76 = Static311.aClass129_1.method2997();
		@Pc(80) int local80 = Static311.aClass129_1.method2989();
		@Pc(82) int local82 = 0;
		for (@Pc(87) Class2_Sub26 local87 = (Class2_Sub26) Static195.aClass30_28.method694(); local87 != null; local87 = (Class2_Sub26) Static195.aClass30_28.method682()) {
			@Pc(102) int local102 = (Static285.anInt4946 - local82 - 1) * 16 + local13 + 31;
			@Pc(104) short local104 = -1;
			if (local7 < local76 && local76 < local15 + local7 && local80 > local102 - 13 && local102 + 3 > local80 && local87.aBoolean272) {
				local104 = -256;
			}
			@Pc(137) int[] local137 = null;
			if (Static37.method674(local87.anInt3594)) {
				local137 = Static15.aClass81_1.method2175((int) local87.aLong127).anIntArray853;
			} else if (local87.anInt3593 != -1) {
				local137 = Static15.aClass81_1.method2175(local87.anInt3593).anIntArray853;
			} else if (Static17.method319(local87.anInt3594)) {
				@Pc(217) Class1_Sub5_Sub1_Sub2 local217 = Static299.aClass1_Sub5_Sub1_Sub2Array1[(int) local87.aLong127];
				if (local217 != null) {
					@Pc(222) Class133 local222 = local217.aClass133_1;
					if (local222.anIntArray653 != null) {
						local222 = local222.method3094(Static321.aClass211_1);
					}
					if (local222 != null) {
						local137 = local222.anIntArray651;
					}
				}
			} else if (Static249.method5593(local87.anInt3594)) {
				@Pc(183) Class172 local183;
				if (local87.anInt3594 == 1001) {
					local183 = Static221.aClass118_6.method2858((int) local87.aLong127);
				} else {
					local183 = Static221.aClass118_6.method2858((int) (local87.aLong127 >>> 32 & 0x7FFFFFFFL));
				}
				if (local183.anIntArray801 != null) {
					local183 = local183.method3775(Static321.aClass211_1);
				}
				if (local183 != null) {
					local137 = local183.anIntArray802;
				}
			}
			@Pc(247) String local247 = Static308.method4502(local87);
			if (local137 != null) {
				local247 = local247 + Static245.method3916(local137);
			}
			Static340.aClass9_4.method5060(local247, local102, Static44.anIntArray183, Static382.aClass18Array14, local7 + 3, local104);
			if (local87.aBoolean273) {
				Static120.aClass18_12.method4558(Static238.aClass136_7.method3125(local247) + local7 + 5, local102 + -12);
			}
			local82++;
		}
		Static230.method3733(Static108.anInt5290, Static255.anInt4503, Static320.anInt5473, Static236.anInt2045);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
	public static void method4163() {
		Static373.anInt6290 = 0;
		Static323.anInt5535 = 0;
		Static103.anInt2138 = 0;
		Static326.anInt5621 = 0;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
	public static void method4164() {
		if (Static156.aClass85_1 != null) {
			Static156.aClass85_1.method4216();
		}
		if (Static269.aClass85_2 != null) {
			Static269.aClass85_2.method4216();
		}
	}
}
