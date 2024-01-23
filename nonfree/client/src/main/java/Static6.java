import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "Q", descriptor = "Lclient!qe;")
	public static Class78 aClass78_15 = Static199.method3560("blaugr-Un:");

	@OriginalMember(owner = "client!ae", name = "T", descriptor = "Lclient!qe;")
	public static Class78 aClass78_16 = Static199.method3560("_");

	@OriginalMember(owner = "client!ae", name = "X", descriptor = "I")
	public static int anInt187 = 0;

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "(I)Lclient!fe;")
	public static Class2_Sub3_Sub8_Sub1 method126() {
		@Pc(13) int local13 = Static113.anIntArray423[0] * Static131.anIntArray489[0];
		@Pc(17) byte[] local17 = Static31.aByteArrayArray3[0];
		@Pc(65) Class2_Sub3_Sub8_Sub1 local65;
		if (Static131.aBooleanArray90[0]) {
			@Pc(70) int[] local70 = new int[local13];
			@Pc(74) byte[] local74 = Static33.aByteArrayArray4[0];
			for (@Pc(76) int local76 = 0; local76 < local13; local76++) {
				local70[local76] = (local74[local76] & 0xFF) << 24 | Static198.anIntArray725[local17[local76] & 0xFF];
			}
			local65 = new Class2_Sub3_Sub8_Sub1_Sub1(Static142.anInt3236, Static100.anInt2184, Static186.anIntArray702[0], Static37.anIntArray108[0], Static113.anIntArray423[0], Static131.anIntArray489[0], local70);
		} else {
			@Pc(24) int[] local24 = new int[local13];
			for (@Pc(26) int local26 = 0; local26 < local13; local26++) {
				local24[local26] = Static198.anIntArray725[local17[local26] & 0xFF];
			}
			local65 = new Class2_Sub3_Sub8_Sub1(Static142.anInt3236, Static100.anInt2184, Static186.anIntArray702[0], Static37.anIntArray108[0], Static113.anIntArray423[0], Static131.anIntArray489[0], local24);
		}
		Static28.method365();
		return local65;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(IB)V")
	public static void method127(@OriginalArg(0) int arg0) {
		Static32.anInt4049 = arg0;
		Static4.anInt123 = -1;
		Static22.anInt416 = -1;
		Static178.method3274();
	}
}
