import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!mp", name = "G", descriptor = "I")
	public static int anInt4084;

	@OriginalMember(owner = "client!mp", name = "O", descriptor = "I")
	public static int anInt4090;

	@OriginalMember(owner = "client!mp", name = "B", descriptor = "[I")
	public static final int[] anIntArray561 = new int[50];

	@OriginalMember(owner = "client!mp", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString266 = null;

	@OriginalMember(owner = "client!mp", name = "N", descriptor = "J")
	public static long aLong139 = 0L;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZI)V")
	public static void method3646(@OriginalArg(1) int arg0) {
		Static266.aClass103_54 = new Class103(arg0);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method3649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg8 && arg2 == arg1 && arg3 == arg6 && arg0 == arg5) {
			Static168.method3217(arg4, arg7, arg3, arg5, arg2);
			return;
		}
		@Pc(40) int local40 = arg7;
		@Pc(42) int local42 = arg2;
		@Pc(46) int local46 = arg7 * 3;
		@Pc(50) int local50 = arg2 * 3;
		@Pc(54) int local54 = arg8 * 3;
		@Pc(58) int local58 = arg1 * 3;
		@Pc(62) int local62 = arg6 * 3;
		@Pc(66) int local66 = arg0 * 3;
		@Pc(76) int local76 = local54 + arg3 - arg7 - local62;
		@Pc(86) int local86 = local58 + arg5 - local66 - arg2;
		@Pc(95) int local95 = local46 + local62 - local54 - local54;
		@Pc(105) int local105 = local50 + local66 - local58 - local58;
		@Pc(110) int local110 = local54 - local46;
		@Pc(115) int local115 = local58 - local50;
		for (@Pc(117) int local117 = 128; local117 <= 4096; local117 += 128) {
			@Pc(125) int local125 = local117 * local117 >> 12;
			@Pc(131) int local131 = local117 * local125 >> 12;
			@Pc(135) int local135 = local131 * local76;
			@Pc(139) int local139 = local131 * local86;
			@Pc(143) int local143 = local95 * local125;
			@Pc(147) int local147 = local105 * local125;
			@Pc(151) int local151 = local110 * local117;
			@Pc(155) int local155 = local117 * local115;
			@Pc(167) int local167 = arg7 + (local135 + local143 + local151 >> 12);
			@Pc(178) int local178 = arg2 + (local155 + local147 + local139 >> 12);
			Static168.method3217(arg4, local40, local167, local178, local42);
			local40 = local167;
			local42 = local178;
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILclient!sb;B)V")
	public static void method3650(@OriginalArg(0) int arg0, @OriginalArg(1) Class22_Sub2_Sub1 arg1) {
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		if (arg1.anInt5099 > Static212.anInt4234) {
			Static12.method178(arg1);
		} else if (Static212.anInt4234 > arg1.anInt5138) {
			Static278.method4676(arg1, false);
			local15 = Static143.anInt4069;
			local17 = Static315.anInt6041;
		} else {
			Static159.method3029(arg1);
		}
		if (arg1.anInt5973 < 128 || arg1.anInt5967 < 128 || (Static15.anInt287 - 1) * 128 <= arg1.anInt5973 || arg1.anInt5967 >= (Static325.anInt6173 - 1) * 128) {
			arg1.anInt5129 = -1;
			arg1.anInt5138 = 0;
			arg1.anInt5099 = 0;
			arg1.anInt5133 = -1;
			arg1.anInt5973 = arg1.anIntArray666[0] * 128 + arg1.method4421() * 64;
			arg1.anInt5967 = arg1.anIntArray665[0] * 128 + arg1.method4421() * 64;
			arg1.method4415();
		}
		if (Static252.aClass22_Sub2_Sub1_Sub1_4 == arg1 && (arg1.anInt5973 < 1536 || arg1.anInt5967 < 1536 || arg1.anInt5973 >= (Static15.anInt287 - 12) * 128 || (Static325.anInt6173 - 12) * 128 <= arg1.anInt5967)) {
			arg1.anInt5133 = -1;
			arg1.anInt5129 = -1;
			arg1.anInt5099 = 0;
			arg1.anInt5138 = 0;
			arg1.anInt5973 = arg1.anIntArray666[0] * 128 + arg1.method4421() * 64;
			arg1.anInt5967 = arg1.anIntArray665[0] * 128 + arg1.method4421() * 64;
			arg1.method4415();
		}
		@Pc(208) int local208 = Static275.method4594(arg1);
		Static75.method1500(local208, local15, local17, arg1);
		Static134.method2675(arg1);
	}
}
