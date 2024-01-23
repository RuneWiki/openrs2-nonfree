import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
	public static int anInt4211 = 0;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "[B")
	public static byte[] aByteArray45 = new byte[520];

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "[I")
	public static int[] anIntArray349 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "Z")
	public static boolean aBoolean348 = false;

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString208 = "glow1:";

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
	public static int anInt4222 = -1;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
	public static void method3403(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub3_Sub16 local13 = Static119.method2204(arg0, 12);
		local13.method2718();
		local13.anInt3327 = arg1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = arg3 - 334;
		if (local3 < 0) {
			local3 = 0;
		} else if (local3 > 100) {
			local3 = 100;
		}
		@Pc(43) int local43 = Static49.aShort11 + (Static289.aShort44 - Static49.aShort11) * local3 / 100;
		@Pc(50) int local50 = 2048 - arg0 & 0x7FF;
		@Pc(56) int local56 = local43 * arg6 >> 8;
		@Pc(63) int local63 = 2048 - arg4 & 0x7FF;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		@Pc(69) int local69 = local56;
		@Pc(78) int local78;
		@Pc(89) int local89;
		if (local50 != 0) {
			local78 = Class66.anIntArray148[local50];
			local65 = -local56 * local78 >> 16;
			local89 = Class66.anIntArray153[local50];
			local69 = local56 * local89 >> 16;
		}
		if (local63 != 0) {
			local89 = Class66.anIntArray153[local63];
			local78 = Class66.anIntArray148[local63];
			local67 = local78 * local69 >> 16;
			local69 = local89 * local69 >> 16;
		}
		Static271.anInt5632 = arg5 - local67;
		Static210.anInt4376 = arg0;
		Static133.anInt2729 = arg1 - local65;
		Static255.anInt5182 = arg2 - local69;
		Static265.anInt5500 = arg4;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
	public static void method3407(@OriginalArg(0) int arg0) {
		Static268.anInt5543 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3408(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = Static236.method3908(arg0.charAt(local12)) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)I")
	public static int method3411(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg1 < arg0 ? arg0 : arg2 < arg1 ? arg2 : arg1;
	}
}
