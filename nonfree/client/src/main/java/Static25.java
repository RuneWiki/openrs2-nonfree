import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "[I")
	public static int[] anIntArray45;

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
	public static int anInt660;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
	public static void method432() {
		Static135.method2195(Static279.anInt5448);
		@Pc(21) int local21 = (Static185.anInt3689 >> 10) + (Static130.anInt2601 >> 3);
		@Pc(31) int local31 = (Static49.anInt1089 >> 3) + (Static46.anInt1044 >> 10);
		Static162.anIntArrayArray16 = new int[18][4];
		Static114.anIntArray190 = new int[18];
		Static282.aByteArrayArray5 = new byte[18][];
		Static274.aByteArrayArray17 = new byte[18][];
		Static177.aByteArrayArray7 = new byte[18][];
		Static13.anIntArray15 = new int[18];
		Static13.aByteArrayArray1 = new byte[18][];
		Static218.anIntArray335 = new int[18];
		Static173.anIntArray262 = new int[18];
		Static52.anIntArray80 = new int[18];
		Static109.aByteArrayArray8 = new byte[18][];
		Static294.anIntArray496 = new int[18];
		@Pc(76) int local76 = 0;
		@Pc(82) int local82;
		for (local82 = (local31 - 6) / 8; local82 <= (local31 + 6) / 8; local82++) {
			for (@Pc(95) int local95 = (local21 - 6) / 8; local95 <= (local21 + 6) / 8; local95++) {
				@Pc(113) int local113 = (local82 << 8) + local95;
				Static13.anIntArray15[local76] = local113;
				Static294.anIntArray496[local76] = Static157.aClass132_92.method3185("m" + local82 + "_" + local95);
				Static114.anIntArray190[local76] = Static157.aClass132_92.method3185("l" + local82 + "_" + local95);
				Static218.anIntArray335[local76] = Static157.aClass132_92.method3185("n" + local82 + "_" + local95);
				Static173.anIntArray262[local76] = Static157.aClass132_92.method3185("um" + local82 + "_" + local95);
				Static52.anIntArray80[local76] = Static157.aClass132_92.method3185("ul" + local82 + "_" + local95);
				if (Static218.anIntArray335[local76] == -1) {
					Static294.anIntArray496[local76] = -1;
					Static114.anIntArray190[local76] = -1;
					Static173.anIntArray262[local76] = -1;
					Static52.anIntArray80[local76] = -1;
				}
				local76++;
			}
		}
		for (local82 = local76; local82 < Static218.anIntArray335.length; local82++) {
			Static218.anIntArray335[local82] = -1;
			Static294.anIntArray496[local82] = -1;
			Static114.anIntArray190[local82] = -1;
			Static173.anIntArray262[local82] = -1;
			Static52.anIntArray80[local82] = -1;
		}
		Static273.method4055(0, false, true, local31, local21, 8, 8);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BLclient!aj;I)Lclient!bi;")
	public static Class8_Sub1_Sub2 method433(@OriginalArg(1) Class8_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(37) Class8_Sub1_Sub2 local37 = new Class8_Sub1_Sub2(arg1, arg0.method2372(), arg0.method2372(), arg0.method2352(), arg0.method2352(), arg0.method2334() == 1, arg0.method2334());
		@Pc(50) int local50 = arg0.method2334();
		for (@Pc(52) int local52 = 0; local52 < local50; local52++) {
			local37.aClass182_1.method4328(new Class8_Sub6(arg0.method2334(), arg0.method2334(), arg0.method2375(), arg0.method2375(), arg0.method2375(), arg0.method2375(), arg0.method2375(), arg0.method2375(), arg0.method2375(), arg0.method2375()));
		}
		local37.method431();
		return local37;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB)V")
	public static void method435(@OriginalArg(0) int arg0) {
		@Pc(8) Class8_Sub1_Sub6 local8 = Static181.method2779(9, arg0);
		local8.method929();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIII)V")
	public static void method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg4; local7 <= arg2; local7++) {
			Static19.method343(arg0, arg3, Static181.anIntArrayArray19[local7], arg1);
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZIIIIII)V")
	public static void method437(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static231.anInt4685 = arg3;
		Static31.anInt738 = arg1;
		Static293.anInt5688 = arg2;
		Static92.anInt1945 = arg5;
		Static273.anInt5369 = arg4;
		if (arg0 && Static293.anInt5688 >= 100) {
			Static46.anInt1044 = Static231.anInt4685 * 128 + 64;
			Static185.anInt3689 = Static273.anInt5369 * 128 + 64;
			Static170.anInt3411 = Static59.method927(Static46.anInt1044, Static185.anInt3689, Static34.anInt770) - Static92.anInt1945;
		}
		Static172.anInt3428 = 2;
	}
}
