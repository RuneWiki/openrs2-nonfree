import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
	public static int anInt2330 = -60;

	@OriginalMember(owner = "client!fa", name = "B", descriptor = "I")
	public static int anInt2338 = -1;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method1801(@OriginalArg(0) Class172 arg0) {
		@Pc(5) int local5 = Static124.anInt7631;
		@Pc(7) int local7 = Static442.anInt7488;
		@Pc(9) int local9 = Static126.anInt2657;
		@Pc(11) int local11 = Static242.anInt4631;
		arg0.method5507(-10660793, local11, local5, local7, local9);
		arg0.method5507(-16777216, 16, local5 + 1, local7 + 1, local9 - 2);
		arg0.method5503(local9 - 2, local5 + 1, local11 - 19, -16777216, local7 + 18);
		Static321.aClass59_4.method5788(-1, Static7.aClass189_5.method4262(Static53.anInt1454), -10660793, local5 + 3, local7 + 14);
		@Pc(72) int local72 = Static290.aClass100_1.method3218();
		@Pc(76) int local76 = Static290.aClass100_1.method3213();
		@Pc(78) int local78 = 0;
		for (@Pc(83) Class3_Sub14 local83 = (Class3_Sub14) Static184.aClass243_21.method5208(); local83 != null; local83 = (Class3_Sub14) Static184.aClass243_21.method5203()) {
			@Pc(97) int local97 = (Static158.anInt3162 - local78 - 1) * 16 + local7 + 31;
			@Pc(99) short local99 = -1;
			if (local72 > local5 && local5 + local9 > local72 && local97 - 13 < local76 && local76 < local97 + 3 && local83.aBoolean173) {
				local99 = -256;
			}
			@Pc(129) int[] local129 = null;
			if (Static353.method4700(local83.anInt2182)) {
				local129 = Static314.aClass12_2.method327((int) local83.aLong76).anIntArray144;
			} else if (local83.anInt2183 != -1) {
				local129 = Static314.aClass12_2.method327(local83.anInt2183).anIntArray144;
			} else if (Static376.method4928(local83.anInt2182)) {
				@Pc(207) Class7_Sub2_Sub3_Sub1 local207 = Static139.aClass7_Sub2_Sub3_Sub1Array11[(int) local83.aLong76];
				if (local207 != null) {
					@Pc(212) Class47 local212 = local207.aClass47_1;
					if (local212.anIntArray94 != null) {
						local212 = local212.method1251(Static85.aClass49_1);
					}
					if (local212 != null) {
						local129 = local212.anIntArray95;
					}
				}
			} else if (Static102.method1794(local83.anInt2182)) {
				@Pc(173) Class93 local173;
				if (local83.anInt2182 == 1011) {
					local173 = Static435.aClass30_4.method769((int) local83.aLong76);
				} else {
					local173 = Static435.aClass30_4.method769((int) (local83.aLong76 >>> 32 & 0x7FFFFFFFL));
				}
				if (local173.anIntArray171 != null) {
					local173 = local173.method2066(Static85.aClass49_1);
				}
				if (local173 != null) {
					local129 = local173.lb;
				}
			}
			@Pc(237) String local237 = Static407.method5245(local83);
			if (local129 != null) {
				local237 = local237 + Static390.method5066(local129);
			}
			Static321.aClass59_4.method5789(local5 + 3, Static430.aClass8Array88, local99, Static221.anIntArray276, local237, local97);
			if (local83.aBoolean174) {
				Static183.aClass8_14.method6001(local5 + Static269.aClass70_27.method1759(local237) + 5, local97 + -12);
			}
			local78++;
		}
		Static406.method5233(Static242.anInt4631, Static442.anInt7488, Static124.anInt7631, Static126.anInt2657);
	}
}
