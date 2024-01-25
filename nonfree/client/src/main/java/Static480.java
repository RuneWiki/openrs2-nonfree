import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!rda", name = "i", descriptor = "I")
	public static int anInt8592;

	@OriginalMember(owner = "client!rda", name = "j", descriptor = "I")
	public static int anInt8593 = 1;

	@OriginalMember(owner = "client!rda", name = "k", descriptor = "[I")
	public static final int[] anIntArray468 = new int[8];

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIII)V")
	public static void method7074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static110.anInt7701 / (float) Static110.anInt7702;
		@Pc(11) int local11 = arg3;
		@Pc(13) int local13 = arg1;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg3 * local9);
		} else {
			local11 = (int) ((float) arg1 / local9);
		}
		@Pc(40) int local40 = arg0 - (arg3 - local11) / 2;
		@Pc(48) int local48 = arg2 - (arg1 - local13) / 2;
		Static329.anInt6567 = -1;
		Static561.anInt9691 = Static110.anInt7701 - Static110.anInt7701 * local48 / local13;
		Static227.anInt5187 = local40 * Static110.anInt7702 / local11;
		Static18.anInt872 = -1;
		Static119.method2632();
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIZ)V")
	public static void method7075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static251.anInt9634 <= arg3 && Static366.anInt6946 >= arg3) {
			@Pc(24) int local24 = Static132.method2911(Static444.anInt8258, arg0, Static188.anInt4410);
			@Pc(34) int local34 = Static132.method2911(Static444.anInt8258, arg1, Static188.anInt4410);
			Static231.method4278(arg3, arg2, local24, local34);
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BI)S")
	public static short method7076(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(37) int local37 = local19 <= 64 ? local15 * local19 >> 7 : (127 - local19) * local15 >> 7;
		@Pc(41) int local41 = local37 + local19;
		@Pc(47) int local47;
		if (local41 == 0) {
			local47 = local37 << 1;
		} else {
			local47 = (local37 << 8) / local41;
		}
		return (short) (local9 << 10 | local47 >> 4 << 7 | local41);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(III)Z")
	public static boolean method7077(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(26) boolean local26 = (arg1 & 0x37) == 0 ? Static376.method5847(arg0, arg1) : Static322.method5333(arg0, arg1);
		return Static271.method4662(arg0, arg1) | (arg0 & 0x10000) != 0 | local26;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(JJ)J")
	public static long method7079(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}
}
