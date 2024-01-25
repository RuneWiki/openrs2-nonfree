import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_20 = new Class45(27, 0);

	@OriginalMember(owner = "client!caa", name = "d", descriptor = "I")
	public static int anInt1395 = 1;

	@OriginalMember(owner = "client!caa", name = "h", descriptor = "[[B")
	public static final byte[][] aByteArrayArray3 = new byte[50][];

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(ZII)I")
	public static int method1402(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static22.anIntArray694[arg0 & 0x3] : Static66.anIntArray171[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg1 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(29) int local29 = Static261.aShort69 + local7 * (Static337.aShort87 - Static261.aShort69) / 100;
		@Pc(35) int local35 = local29 * arg6 >> 8;
		@Pc(41) int local41 = 16384 - arg2 & 0x3FFF;
		@Pc(48) int local48 = 16384 - arg4 & 0x3FFF;
		@Pc(50) int local50 = 0;
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = local35;
		if (local41 != 0) {
			local52 = -local35 * Class12_Sub1_Sub36.anIntArray667[local41] >> 15;
			local54 = local35 * Class12_Sub1_Sub36.anIntArray668[local41] >> 15;
		}
		if (local48 != 0) {
			local50 = Class12_Sub1_Sub36.anIntArray667[local48] * local54 >> 15;
			local54 = local54 * Class12_Sub1_Sub36.anIntArray668[local48] >> 15;
		}
		Static519.anInt9341 = arg2;
		Static6.anInt93 = arg0 - local54;
		Static507.anInt9125 = 0;
		Static248.anInt5104 = arg4;
		Static62.anInt1472 = arg3 - local52;
		Static368.anInt6832 = arg5 - local50;
	}
}
