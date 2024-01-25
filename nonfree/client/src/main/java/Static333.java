import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "[I")
	public static final int[] anIntArray496 = new int[14];

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
	public static int anInt6673 = 0;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
	public static int anInt6676 = 0;

	@OriginalMember(owner = "client!vh", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString62 = null;

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "[I")
	public static final int[] anIntArray497 = new int[50];

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!ae;)V")
	public static void method5783(@OriginalArg(1) Class4 arg0) {
		@Pc(7) int local7 = Static194.anInt3816;
		@Pc(9) int local9 = Static11.anInt293;
		@Pc(16) int local16 = Static120.anInt2599;
		@Pc(18) int local18 = Static60.anInt1316;
		arg0.method4261(local9, local7, local18, local16, -10660793);
		arg0.method4261(local9 + 1, local7 - -1, 16, local16 - 2, -16777216);
		arg0.method4300(-16777216, local18 - 19, local16 + -2, local9 + 18, local7 + 1);
		Static56.aClass37_1.method5254(-1, local7 + 3, -10660793, Static10.aClass93_4.method2819(Static21.anInt455), local9 + 14);
		@Pc(77) int local77 = Static284.aClass61_1.method2658();
		@Pc(81) int local81 = Static284.aClass61_1.method2659();
		@Pc(83) int local83 = 0;
		for (@Pc(88) Class2_Sub13 local88 = (Class2_Sub13) Static91.aClass216_22.method5992(); local88 != null; local88 = (Class2_Sub13) Static91.aClass216_22.method6000()) {
			@Pc(103) int local103 = local9 + (Static117.anInt2590 - local83 - 1) * 16 + 31;
			@Pc(105) short local105 = -1;
			if (local7 < local77 && local16 + local7 > local77 && local81 > local103 - 13 && local103 + 3 > local81) {
				local105 = -256;
			}
			@Pc(135) int[] local135 = null;
			if (Static56.method1308(local88.anInt1317)) {
				local135 = Static282.method5080((int) local88.aLong38).anIntArray506;
			} else if (Static69.method1569(local88.anInt1317)) {
				@Pc(159) Class62_Sub1_Sub2_Sub1 local159 = Static37.aClass62_Sub1_Sub2_Sub1Array1[(int) local88.aLong38];
				if (local159 != null) {
					local135 = local159.aClass186_1.anIntArray431;
				}
			} else if (Static104.method4926(local88.anInt1317)) {
				if (local88.anInt1317 == 1009) {
					local135 = Static234.method4051((int) local88.aLong38).anIntArray258;
				} else {
					local135 = Static234.method4051((int) (local88.aLong38 >>> 32 & 0x7FFFFFFFL)).anIntArray258;
				}
			}
			@Pc(198) String local198 = Static269.method4875(local88);
			if (local135 != null) {
				local198 = local198 + Static184.method3328(local135);
			}
			local83++;
			Static56.aClass37_1.method5258(Static32.anIntArray40, local103, local7 + 3, local198, local105, Static36.aClass31Array1);
		}
		Static304.method5348(Static120.anInt2599, Static60.anInt1316, Static194.anInt3816, Static11.anInt293);
	}
}
