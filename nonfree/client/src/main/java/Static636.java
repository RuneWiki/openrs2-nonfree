import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static636 {

	@OriginalMember(owner = "client!vm", name = "n", descriptor = "[[I")
	public static int[][] anIntArrayArray87;

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "Lclient!aba;")
	public static final Class4 aClass4_13 = new Class4();

	@OriginalMember(owner = "client!vm", name = "q", descriptor = "I")
	public static int anInt10129 = 0;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)Z")
	public static boolean method8433(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V")
	public static void method8436() {
		Static96.aClass143_3.L(Static240.anInt3902, Static655.aClass5_Sub36_29.aClass2_Sub24_1.method7984() == 1 ? Static325.anInt5948 + 256 << 2 : -1, 0);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BILclient!ha;)V")
	public static void method8437(@OriginalArg(1) int arg0, @OriginalArg(2) Class143 arg1) {
		if (!Static649.aBoolean743 || !Static662.aBoolean761) {
			Static32.anInt447 = 0;
			return;
		}
		if (Static22.aBoolean12) {
			Static477.aLong129 = Static515.aClass60_2.method3499();
		}
		Static224.anInt3589 = 0;
		Static336.anInt6092 = 0;
		Static423.anInt7531 = 0;
		@Pc(25) int[] local25 = arg1.Y();
		Static117.anInt2045 = (int) ((float) local25[3] / 3.0F);
		Static405.anInt6990 = (int) ((float) local25[2] / 3.0F);
		arg1.method6236(Static588.anIntArray531);
		if (Static626.anInt10033 != (int) ((float) Static588.anIntArray531[0] / 3.0F) || Static220.anInt3498 != (int) ((float) Static588.anIntArray531[1] / 3.0F)) {
			Static626.anInt10033 = (int) ((float) Static588.anIntArray531[0] / 3.0F);
			Static220.anInt3498 = (int) ((float) Static588.anIntArray531[1] / 3.0F);
			Static368.anInt6436 = Static220.anInt3498 >> 1;
			Static92.anIntArray87 = new int[Static220.anInt3498 * Static626.anInt10033];
			Static26.anInt351 = Static626.anInt10033 >> 1;
		}
		Static594.aClass56_14 = arg1.method6257();
		Static32.anInt447 = 0;
		for (@Pc(102) int local102 = 0; local102 < Static28.anInt387; local102++) {
			Static609.method8189(arg1, arg0, Static370.aClass180Array6[local102]);
		}
		for (@Pc(121) int local121 = 0; local121 < Static509.anInt5962; local121++) {
			Static609.method8189(arg1, arg0, Static194.aClass180Array8[local121]);
		}
		for (@Pc(139) int local139 = 0; local139 < Static252.anInt4008; local139++) {
			Static609.method8189(arg1, arg0, Static105.aClass180Array4[local139]);
		}
		Static309.anInt5508 = 0;
		if (Static32.anInt447 > 0) {
			@Pc(165) int local165 = Static92.anIntArray87.length;
			@Pc(172) int local172 = local165 - local165 & 0x7;
			@Pc(174) int local174 = 0;
			while (local172 > local174) {
				Static92.anIntArray87[local174++] = Integer.MAX_VALUE;
				Static92.anIntArray87[local174++] = Integer.MAX_VALUE;
				Static92.anIntArray87[local174++] = Integer.MAX_VALUE;
				Static92.anIntArray87[local174++] = Integer.MAX_VALUE;
				Static92.anIntArray87[local174++] = Integer.MAX_VALUE;
				Static92.anIntArray87[local174++] = Integer.MAX_VALUE;
				Static92.anIntArray87[local174++] = Integer.MAX_VALUE;
				Static92.anIntArray87[local174++] = Integer.MAX_VALUE;
			}
			while (local174 < local165) {
				Static92.anIntArray87[local174++] = Integer.MAX_VALUE;
			}
			Static188.anInt3093 = 1;
			for (@Pc(231) int local231 = 0; local231 < Static32.anInt447; local231++) {
				@Pc(236) Class180 local236 = Static41.aClass180Array1[local231];
				Static434.method6501(local236.aShortArray62[1], local236.aShortArray62[0], local236.aShortArray61[1], local236.aShortArray62[3], local236.aShortArray63[1], local236.aShortArray61[0], local236.aShortArray63[0], local236.aShortArray61[3], local236.aShortArray63[3]);
				Static434.method6501(local236.aShortArray62[2], local236.aShortArray62[1], local236.aShortArray61[2], local236.aShortArray62[3], local236.aShortArray63[2], local236.aShortArray61[1], local236.aShortArray63[1], local236.aShortArray61[3], local236.aShortArray63[3]);
			}
			Static188.anInt3093 = 2;
		}
		if (Static22.aBoolean12) {
			Static78.aLong53 = Static515.aClass60_2.method3499() - Static477.aLong129;
		}
	}
}
