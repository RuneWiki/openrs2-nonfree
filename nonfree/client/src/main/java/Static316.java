import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "[Lclient!nm;")
	public static Class28_Sub1[] aClass28_Sub1Array2;

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
	public static int anInt5435;

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "Lclient!qb;")
	public static Class190 aClass190_8;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "S")
	public static short aShort81 = 256;

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString55 = null;

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
	public static int anInt5437 = -1;

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
	public static int anInt5438 = 0;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!ck;I)V")
	public static void method4834(@OriginalArg(0) Class3_Sub5_Sub1 arg0) {
		arg0.method854();
		@Pc(18) int local18 = Static376.anInt6265;
		@Pc(28) Class28_Sub1_Sub1_Sub2 local28 = Static226.aClass28_Sub1_Sub1_Sub2_2 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local18] = new Class28_Sub1_Sub1_Sub2();
		local28.anInt4373 = local18;
		@Pc(36) int local36 = arg0.method859(30);
		@Pc(41) byte local41 = (byte) (local36 >> 28);
		@Pc(47) int local47 = local36 >> 14 & 0x3FFF;
		@Pc(51) int local51 = local36 & 0x3FFF;
		local28.anIntArray491[0] = local47 - Static21.anInt265;
		local28.anInt5774 = (local28.anIntArray491[0] << 7) + (local28.method4009() << 6);
		local28.anIntArray490[0] = local51 - Static103.anInt2044;
		local28.anInt5766 = (local28.anIntArray490[0] << 7) + (local28.method4009() << 6);
		Static363.anInt6170 = local28.aByte73 = local41;
		if (Static192.aClass3_Sub5Array1[local18] != null) {
			local28.method4030(Static192.aClass3_Sub5Array1[local18]);
		}
		Static366.anInt4870 = 0;
		Static3.anIntArray9[Static366.anInt4870++] = local18;
		Static268.aByteArray60[local18] = 0;
		Static259.anInt3006 = 0;
		for (@Pc(127) int local127 = 1; local127 < 2048; local127++) {
			if (local127 != local18) {
				@Pc(141) int local141 = arg0.method859(18);
				@Pc(145) int local145 = local141 >> 16;
				@Pc(151) int local151 = local141 >> 8 & 0xFF;
				@Pc(155) int local155 = local141 & 0xFF;
				Static166.anIntArray674[local127] = (local145 << 28) + (local151 << 14) + local155;
				Static186.anIntArray372[local127] = 0;
				Static109.anIntArray212[local127] = -1;
				Static102.anIntArray202[Static259.anInt3006++] = local127;
				Static268.aByteArray60[local127] = 0;
			}
		}
		arg0.method860();
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!dt;ILclient!dt;)V")
	public static void method4836(@OriginalArg(0) Class62 arg0, @OriginalArg(2) Class62 arg1) {
		Static229.method3783(Static228.aClass244_57);
		Static23.aClass3_Sub5_Sub1_1.method2782(arg1.anInt1500);
		Static23.aClass3_Sub5_Sub1_1.method2749(arg0.anInt1549);
		Static23.aClass3_Sub5_Sub1_1.method2790(arg0.anInt1500);
		Static23.aClass3_Sub5_Sub1_1.method2727(arg0.anInt1510);
		Static23.aClass3_Sub5_Sub1_1.method2749(arg1.anInt1549);
		Static23.aClass3_Sub5_Sub1_1.method2762(arg1.anInt1510);
	}
}
