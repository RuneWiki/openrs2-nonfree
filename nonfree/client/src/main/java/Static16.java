import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!b", name = "C", descriptor = "F")
	public static float aFloat11;

	@OriginalMember(owner = "client!b", name = "F", descriptor = "I")
	public static int anInt356;

	@OriginalMember(owner = "client!b", name = "o", descriptor = "[I")
	public static int[] anIntArray9 = new int[14];

	@OriginalMember(owner = "client!b", name = "p", descriptor = "Lclient!c;")
	public static Class17 aClass17_1 = new Class17();

	@OriginalMember(owner = "client!b", name = "v", descriptor = "I")
	public static int anInt350 = 0;

	@OriginalMember(owner = "client!b", name = "D", descriptor = "[I")
	public static int[] anIntArray10 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!b", name = "O", descriptor = "I")
	public static int anInt364 = -1;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Z")
	public static boolean method285(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!wc;I)V")
	public static void method286(@OriginalArg(0) Class13_Sub5 arg0) {
		if (arg0.anInt5265 == Static50.anInt1118 || arg0.anInt5305 == -1 || arg0.anInt5251 != 0 || arg0.anInt5333 + 1 > Static51.method992(arg0.anInt5305).anIntArray470[arg0.anInt5249]) {
			@Pc(39) int local39 = arg0.anInt5265 - arg0.anInt5285;
			@Pc(44) int local44 = Static50.anInt1118 - arg0.anInt5285;
			@Pc(56) int local56 = arg0.anInt5332 * 128 + arg0.method4219() * 64;
			@Pc(67) int local67 = arg0.anInt5257 * 128 + arg0.method4219() * 64;
			@Pc(79) int local79 = arg0.anInt5286 * 128 + arg0.method4219() * 64;
			@Pc(90) int local90 = arg0.anInt5272 * 128 + arg0.method4219() * 64;
			arg0.anInt5334 = (local56 * (local39 - local44) + local44 * local79) / local39;
			arg0.anInt5294 = (local90 * local44 + (local39 - local44) * local67) / local39;
		}
		if (arg0.anInt5284 == 0) {
			arg0.anInt5266 = 1024;
		}
		if (arg0.anInt5284 == 1) {
			arg0.anInt5266 = 1536;
		}
		arg0.anInt5322 = 0;
		if (arg0.anInt5284 == 2) {
			arg0.anInt5266 = 0;
		}
		if (arg0.anInt5284 == 3) {
			arg0.anInt5266 = 512;
		}
		arg0.anInt5261 = arg0.anInt5266;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!pi;)V")
	public static void method288(@OriginalArg(1) Class4_Sub24 arg0) {
		label86: while (true) {
			if (arg0.aByteArray47.length > arg0.anInt3822) {
				@Pc(22) boolean local22 = false;
				@Pc(24) int local24 = 0;
				@Pc(26) int local26 = 0;
				if (arg0.method3110() == 1) {
					local24 = arg0.method3110();
					local22 = true;
					local26 = arg0.method3110();
				}
				@Pc(50) int local50 = arg0.method3110();
				@Pc(54) int local54 = arg0.method3110();
				@Pc(61) int local61 = local50 * 64 - Static175.anInt3552;
				@Pc(72) int local72 = Static158.anInt3242 + Static133.anInt2663 - local54 * 64 - 1;
				@Pc(152) byte local152;
				@Pc(94) int local94;
				if (local61 >= 0 && local72 - 63 >= 0 && local61 + 63 < Static207.anInt2141 && Static158.anInt3242 > local72) {
					local94 = local61 >> 6;
					@Pc(98) int local98 = local72 >> 6;
					@Pc(100) int local100 = 0;
					while (true) {
						if (local100 >= 64) {
							continue label86;
						}
						for (@Pc(107) int local107 = 0; local107 < 64; local107++) {
							if (!local22 || local24 * 8 <= local100 && local24 * 8 + 8 > local100 && local107 >= local26 * 8 && local107 < local26 * 8 + 8) {
								local152 = arg0.method3069();
								if (local152 != 0) {
									if (Static293.aByteArrayArrayArray16[local94][local98] == null) {
										Static293.aByteArrayArrayArray16[local94][local98] = new byte[4096];
									}
									Static293.aByteArrayArrayArray16[local94][local98][local100 + (63 - local107 << 6)] = local152;
									@Pc(192) byte local192 = arg0.method3069();
									if (Static301.aByteArrayArrayArray17[local94][local98] == null) {
										Static301.aByteArrayArrayArray17[local94][local98] = new byte[4096];
									}
									Static301.aByteArrayArrayArray17[local94][local98][local100 + (63 - local107 << 6)] = local192;
								}
							}
						}
						local100++;
					}
				}
				local94 = 0;
				while (true) {
					if ((local22 ? 64 : 4096) <= local94) {
						continue label86;
					}
					local152 = arg0.method3069();
					if (local152 != 0) {
						arg0.anInt3822++;
					}
					local94++;
				}
			}
			return;
		}
	}
}
