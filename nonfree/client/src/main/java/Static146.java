import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!ld", name = "K", descriptor = "[I")
	public static int[] anIntArray235;

	@OriginalMember(owner = "client!ld", name = "Y", descriptor = "I")
	public static int anInt2901;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!aj;)V")
	public static void method2311(@OriginalArg(1) Class8_Sub2 arg0) {
		label85: while (true) {
			if (arg0.aByteArray24.length > arg0.anInt2955) {
				@Pc(21) boolean local21 = false;
				@Pc(23) int local23 = 0;
				@Pc(25) int local25 = 0;
				if (arg0.method2334() == 1) {
					local21 = true;
					local25 = arg0.method2334();
					local23 = arg0.method2334();
				}
				@Pc(45) int local45 = arg0.method2334();
				@Pc(49) int local49 = arg0.method2334();
				@Pc(56) int local56 = local45 * 64 - Static220.anInt4522;
				@Pc(67) int local67 = Static140.anInt2782 + Static221.anInt4539 - local49 * 64 - 1;
				@Pc(106) byte local106;
				@Pc(91) int local91;
				if (local56 >= 0 && local67 - 63 >= 0 && local56 + 63 < Static156.anInt3157 && Static221.anInt4539 > local67) {
					local91 = local56 >> 6;
					@Pc(128) int local128 = local67 >> 6;
					@Pc(130) int local130 = 0;
					while (true) {
						if (local130 >= 64) {
							continue label85;
						}
						for (@Pc(135) int local135 = 0; local135 < 64; local135++) {
							if (!local21 || local130 >= local25 * 8 && local25 * 8 + 8 > local130 && local135 >= local23 * 8 && local23 * 8 + 8 > local135) {
								local106 = arg0.method2374();
								if (local106 != 0) {
									if (Static182.aByteArrayArrayArray10[local91][local128] == null) {
										Static182.aByteArrayArrayArray10[local91][local128] = new byte[4096];
									}
									Static182.aByteArrayArrayArray10[local91][local128][local130 + (63 - local135 << 6)] = local106;
									@Pc(210) byte local210 = arg0.method2374();
									if (Static197.aByteArrayArrayArray11[local91][local128] == null) {
										Static197.aByteArrayArrayArray11[local91][local128] = new byte[4096];
									}
									Static197.aByteArrayArrayArray11[local91][local128][(63 - local135 << 6) + local130] = local210;
								}
							}
						}
						local130++;
					}
				}
				local91 = 0;
				while (true) {
					if (local91 >= (local21 ? 64 : 4096)) {
						continue label85;
					}
					local106 = arg0.method2374();
					if (local106 != 0) {
						arg0.anInt2955++;
					}
					local91++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "(I)Lclient!wk;")
	public static Class43_Sub2 method2312() {
		@Pc(31) Class43_Sub2 local31 = new Class43_Sub2(Static97.anInt1999, Static290.anInt5656, Static25.anIntArray45[0], Static225.anIntArray345[0], Static92.anIntArray130[0], Static135.anIntArray225[0], Static232.aByteArrayArray15[0], Static147.anIntArray236);
		Static147.method2386();
		return local31;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!pk;Lclient!pk;Lclient!pk;ILclient!ka;)Z")
	public static boolean method2313(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(2) Class132 arg2, @OriginalArg(4) Class8_Sub8_Sub2 arg3) {
		Static104.aClass132_39 = arg2;
		Static231.aClass8_Sub8_Sub2_3 = arg3;
		Static61.aClass132_22 = arg0;
		Static184.aClass132_64 = arg1;
		return true;
	}
}
