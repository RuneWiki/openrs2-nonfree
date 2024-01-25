import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!cu", name = "q", descriptor = "S")
	public static short aShort100 = 1;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!ms;I[[B)V")
	public static void method6978(@OriginalArg(0) Class210_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg1.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg1[local17];
			if (local23 != null) {
				@Pc(30) Class6_Sub8 local30 = new Class6_Sub8(local23);
				local36 = Static228.anIntArray215[local17] >> 8;
				@Pc(42) int local42 = Static228.anIntArray215[local17] & 0xFF;
				@Pc(48) int local48 = local36 * 64 - Static477.anInt8412;
				@Pc(55) int local55 = local42 * 64 - Static227.anInt5049;
				Static245.method4396();
				arg0.method5798(local55, Static227.anInt5049, Static477.anInt8412, local30, local48, Static313.aClass258Array1);
				arg0.method5806(local55, local48, Static467.aClass5_13, local30, local12);
				if (!arg0.aBoolean553 && local36 == Static300.anInt6134 / 8 && local42 == Static484.anInt8559 / 8 && local12[0] != -1) {
					Static406.aClass350_1 = Static82.aClass74_1.method2529(local12[0], local12[2], local12[1], Static181.aClass132_1, local12[3]);
					Static475.anInt8407 = local12[4];
				}
			}
		}
		for (@Pc(127) int local127 = 0; local127 < local15; local127++) {
			@Pc(139) int local139 = (Static228.anIntArray215[local127] >> 8) * 64 - Static477.anInt8412;
			local36 = (Static228.anIntArray215[local127] & 0xFF) * 64 - Static227.anInt5049;
			@Pc(154) byte[] local154 = arg1[local127];
			if (local154 == null && Static484.anInt8559 < 800) {
				Static245.method4396();
				arg0.method5793(local36, local139);
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLclient!ji;)Lclient!sh;")
	public static Class308 method6980(@OriginalArg(1) Class6_Sub8 arg0) {
		@Pc(12) Class308 local12 = new Class308();
		local12.anInt9126 = arg0.method8220();
		local12.aClass6_Sub5_Sub14_1 = Static105.aClass291_1.method7162(local12.anInt9126);
		return local12;
	}
}
