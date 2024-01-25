import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "[Lclient!er;")
	public static Class55_Sub2_Sub1_Sub1[] aClass55_Sub2_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "Lclient!qp;")
	public static Class272 aClass272_1;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "Lclient!pe;")
	public static Class254 aClass254_43;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)I")
	public static int method2795(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(16) int local16 = (arg0 & 0x7F) * 96 >> 7;
		if (local16 < 2) {
			local16 = 2;
		} else if (local16 > 126) {
			local16 = 126;
		}
		return local16 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method2797(@OriginalArg(1) Class15 arg0) {
		@Pc(5) int local5 = Static386.anInt7409;
		@Pc(7) int local7 = Static489.anInt9112;
		@Pc(9) int local9 = Static277.anInt5863;
		@Pc(11) int local11 = Static344.anInt6998;
		arg0.method5341(-10660793, local5, local11, local9, local7);
		arg0.method5341(-16777216, local5 + 1, 16, local9 - 2, local7 + 1);
		arg0.method5300(local9 - 2, -16777216, local5 + 1, local11 - 19, local7 + 18);
		Static162.aClass111_6.method6675(Static139.aClass101_23.method2841(Static126.anInt2904), local5 + 3, local7 + 14, -10660793, -1);
		@Pc(74) int local74 = Static258.aClass116_1.method8249();
		@Pc(78) int local78 = Static258.aClass116_1.method8250();
		@Pc(80) int local80 = 0;
		for (@Pc(85) Class3_Sub40 local85 = (Class3_Sub40) Static342.aClass183_44.method4795(); local85 != null; local85 = (Class3_Sub40) Static342.aClass183_44.method4793()) {
			@Pc(99) int local99 = (Static309.anInt6170 - local80 - 1) * 16 + local7 + 31;
			@Pc(101) short local101 = -1;
			if (local5 < local74 && local9 + local5 > local74 && local99 - 13 < local78 && local99 + 3 > local78 && local85.aBoolean622) {
				local101 = -256;
			}
			@Pc(134) int[] local134 = null;
			if (Static211.method3720(local85.anInt7324)) {
				local134 = Static517.aClass23_2.method901((int) local85.aLong191).anIntArray18;
			} else if (local85.anInt7316 != -1) {
				local134 = Static517.aClass23_2.method901(local85.anInt7316).anIntArray18;
			} else if (Static566.method8142(local85.anInt7324)) {
				@Pc(210) Class3_Sub46 local210 = (Class3_Sub46) Static331.aClass25_25.method946((long) local85.aLong191);
				if (local210 != null) {
					@Pc(215) Class2_Sub2_Sub1_Sub2 local215 = local210.aClass2_Sub2_Sub1_Sub2_2;
					@Pc(218) Class169 local218 = local215.aClass169_1;
					if (local218.anIntArray306 != null) {
						local218 = local218.method4177(Static588.aClass322_1);
					}
					if (local218 != null) {
						local134 = local218.anIntArray305;
					}
				}
			} else if (Static127.method2533(local85.anInt7324)) {
				@Pc(175) Class292 local175;
				if (local85.anInt7324 == 1004) {
					local175 = Static253.aClass146_2.method3356((int) local85.aLong191);
				} else {
					local175 = Static253.aClass146_2.method3356((int) (local85.aLong191 >>> 32 & 0x7FFFFFFFL));
				}
				if (local175.anIntArray571 != null) {
					local175 = local175.method7198(Static588.aClass322_1);
				}
				if (local175 != null) {
					local134 = local175.anIntArray574;
				}
			}
			@Pc(244) String local244 = Static526.method7770(local85);
			if (local134 != null) {
				local244 = local244 + Static260.method4598(local134);
			}
			Static162.aClass111_6.method6670(Static528.aClass37Array11, local101, local99, Static282.anIntArray362, local244, local5 + 3);
			local80++;
			if (local85.aBoolean621) {
				Static284.aClass37_32.method7076(Static9.aClass297_1.method7314(local244) + local5 + 5, local99 - 12);
			}
		}
		Static128.method6031(Static277.anInt5863, Static489.anInt9112, Static386.anInt7409, Static344.anInt6998);
	}
}
