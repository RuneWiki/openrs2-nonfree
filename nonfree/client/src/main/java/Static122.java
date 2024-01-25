import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!efa", name = "Vd", descriptor = "I")
	public static int anInt3308;

	@OriginalMember(owner = "client!efa", name = "sd", descriptor = "I")
	public static int anInt3286 = 0;

	@OriginalMember(owner = "client!efa", name = "td", descriptor = "I")
	public static int anInt3287 = 0;

	@OriginalMember(owner = "client!efa", name = "ke", descriptor = "I")
	public static int anInt3320 = 0;

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ILclient!efa;)I")
	public static int method2760(@OriginalArg(1) Class15_Sub1_Sub2_Sub2_Sub1 arg0) {
		@Pc(16) int local16 = arg0.anInt3295;
		@Pc(20) Class102 local20 = arg0.method6686();
		if (arg0.anInt8107 == -1 || arg0.aBoolean585) {
			local16 = arg0.anInt3315;
		} else if (arg0.anInt8107 == local20.anInt3731 || local20.anInt3744 == arg0.anInt8107 || arg0.anInt8107 == local20.anInt3753 || arg0.anInt8107 == local20.anInt3740) {
			local16 = arg0.anInt3297;
		} else if (arg0.anInt8107 == local20.anInt3763 || local20.anInt3734 == arg0.anInt8107 || arg0.anInt8107 == local20.anInt3760 || arg0.anInt8107 == local20.anInt3755) {
			local16 = arg0.anInt3301;
		}
		return local16;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Z[[BLclient!fca;)V")
	public static void method2767(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class19_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg0[local17];
			if (local23 != null) {
				@Pc(30) Class8_Sub8 local30 = new Class8_Sub8(local23);
				local36 = Static170.anIntArray225[local17] >> 8;
				@Pc(42) int local42 = Static170.anIntArray225[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static628.anInt10493;
				@Pc(55) int local55 = local42 * 64 - Static594.anInt10160;
				Static92.method2160();
				arg1.method2992(local49, local30, Static628.anInt10493, Static594.anInt10160, Static204.aClass48Array1, local55);
				arg1.method3005(local30, local12, local49, local55, Static171.aClass16_5);
				if (!arg1.aBoolean269 && Static325.anInt6515 / 8 == local36 && local42 == Static19.anInt3646 / 8 && local12[0] != -1) {
					Static328.aClass203_5 = Static527.aClass321_1.method7503(local12[2], local12[3], Static274.aClass270_1, local12[0], local12[1]);
					Static83.anInt2471 = local12[4];
				}
			}
		}
		for (@Pc(129) int local129 = 0; local129 < local15; local129++) {
			@Pc(142) int local142 = (Static170.anIntArray225[local129] >> 8) * 64 - Static628.anInt10493;
			local36 = (Static170.anIntArray225[local129] & 0xFF) * 64 - Static594.anInt10160;
			@Pc(156) byte[] local156 = arg0[local129];
			if (local156 == null && Static19.anInt3646 < 800) {
				Static92.method2160();
				arg1.method2999(local142, local36);
			}
		}
	}
}
