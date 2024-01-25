import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!dm", name = "u", descriptor = "[I")
	public static int[] anIntArray115;

	@OriginalMember(owner = "client!dm", name = "k", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!dm", name = "o", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_71 = new Class22(77, -2);

	@OriginalMember(owner = "client!dm", name = "A", descriptor = "[B")
	public static final byte[] aByteArray19 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!dm", name = "B", descriptor = "[I")
	public static final int[] anIntArray116 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILclient!uu;I)I")
	public static int method1350(@OriginalArg(0) int arg0, @OriginalArg(1) Class247 arg1) {
		if (!Static53.method900(arg1).method3905(arg0) && arg1.anObjectArray15 == null) {
			return -1;
		} else if (arg1.anIntArray521 == null || arg1.anIntArray521.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray521[arg0];
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(III)Z")
	public static boolean method1353(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)V")
	public static void method1354() {
		Static420.method5385(Static323.aClass50_Sub1_1.aBoolean291);
		Static363.aClass4_Sub15_Sub1_3 = new Class4_Sub15_Sub1();
		Static363.aClass4_Sub15_Sub1_3.method1453();
		Static424.aClass49_2 = Static380.method5016(0, Static206.aClass66_4, 22050, Static273.aCanvas5);
		Static424.aClass49_2.method2070(Static363.aClass4_Sub15_Sub1_3);
		Static439.method5554(Static67.aClass76_19, Static363.aClass4_Sub15_Sub1_3, Static312.aClass76_66, Static350.aClass76_79);
		Static291.aClass49_1 = Static380.method5016(1, Static206.aClass66_4, 2048, Static273.aCanvas5);
		Static360.aClass4_Sub15_Sub2_2 = new Class4_Sub15_Sub2();
		Static291.aClass49_1.method2070(Static360.aClass4_Sub15_Sub2_2);
		Static275.aClass261_1 = new Class261(22050, Static261.anInt4928);
		Static414.anInt6866 = Static46.aClass76_54.method2099("scape main");
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIII)V")
	public static void method1355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(39) int local39 = local13 * (1 - local29) + local21;
		@Pc(48) int local48 = local17 - (local29 - 1) * local25;
		@Pc(52) int local52 = local13 << 2;
		@Pc(56) int local56 = local17 << 2;
		@Pc(64) int local64 = local21 * 3;
		@Pc(72) int local72 = local25 * ((arg3 << 1) - 3);
		@Pc(78) int local78 = local56;
		Static251.method3640(arg4 - arg1, arg2, arg4 + arg1, Static96.anIntArrayArray21[arg0]);
		@Pc(98) int local98 = local52 * (arg3 - 1);
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local39 += local64;
					local48 += local78;
					local64 += local56;
					local78 += local56;
					local7++;
				}
			}
			if (local48 < 0) {
				local39 += local64;
				local48 += local78;
				local78 += local56;
				local64 += local56;
				local7++;
			}
			local39 += -local98;
			local48 += -local72;
			local9--;
			local98 -= local52;
			local72 -= local52;
			@Pc(174) int local174 = arg0 - local9;
			@Pc(178) int local178 = local9 + arg0;
			@Pc(182) int local182 = local7 + arg4;
			@Pc(187) int local187 = arg4 - local7;
			Static251.method3640(local187, arg2, local182, Static96.anIntArrayArray21[local174]);
			Static251.method3640(local187, arg2, local182, Static96.anIntArrayArray21[local178]);
		}
	}
}
