import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!w", name = "q", descriptor = "I")
	public static int anInt5919 = 0;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(B)I")
	public static int method4635() {
		return 6;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V")
	public static void method4636() {
		@Pc(10) int local10 = Static91.aClass2_Sub16_Sub1_1.method2202(8);
		@Pc(15) int local15;
		if (Static191.anInt4008 > local10) {
			for (local15 = local10; local15 < Static191.anInt4008; local15++) {
				Static190.anIntArray399[Static214.anInt4373++] = Static246.anIntArray479[local15];
			}
		}
		if (local10 > Static191.anInt4008) {
			throw new RuntimeException("gppov1");
		}
		Static191.anInt4008 = 0;
		for (local15 = 0; local15 < local10; local15++) {
			@Pc(63) int local63 = Static246.anIntArray479[local15];
			@Pc(67) Class15_Sub2_Sub2 local67 = Static188.aClass15_Sub2_Sub2Array41[local63];
			@Pc(72) int local72 = Static91.aClass2_Sub16_Sub1_1.method2202(1);
			if (local72 == 0) {
				Static246.anIntArray479[Static191.anInt4008++] = local63;
				local67.anInt5378 = Static268.anInt5236;
			} else {
				@Pc(95) int local95 = Static91.aClass2_Sub16_Sub1_1.method2202(2);
				if (local95 == 0) {
					Static246.anIntArray479[Static191.anInt4008++] = local63;
					local67.anInt5378 = Static268.anInt5236;
					Static132.anIntArray303[Static222.anInt4523++] = local63;
				} else {
					@Pc(142) int local142;
					@Pc(152) int local152;
					if (local95 == 1) {
						Static246.anIntArray479[Static191.anInt4008++] = local63;
						local67.anInt5378 = Static268.anInt5236;
						local142 = Static91.aClass2_Sub16_Sub1_1.method2202(3);
						local67.method4294(1, local142);
						local152 = Static91.aClass2_Sub16_Sub1_1.method2202(1);
						if (local152 == 1) {
							Static132.anIntArray303[Static222.anInt4523++] = local63;
						}
					} else if (local95 == 2) {
						Static246.anIntArray479[Static191.anInt4008++] = local63;
						local67.anInt5378 = Static268.anInt5236;
						if (Static91.aClass2_Sub16_Sub1_1.method2202(1) == 1) {
							local142 = Static91.aClass2_Sub16_Sub1_1.method2202(3);
							local67.method4294(2, local142);
							local152 = Static91.aClass2_Sub16_Sub1_1.method2202(3);
							local67.method4294(2, local152);
						} else {
							local142 = Static91.aClass2_Sub16_Sub1_1.method2202(3);
							local67.method4294(0, local142);
						}
						local142 = Static91.aClass2_Sub16_Sub1_1.method2202(1);
						if (local142 == 1) {
							Static132.anIntArray303[Static222.anInt4523++] = local63;
						}
					} else if (local95 == 3) {
						Static190.anIntArray399[Static214.anInt4373++] = local63;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(B)V")
	public static void method4637() {
		if (Static158.aString118.toLowerCase().indexOf("microsoft") != -1) {
			Static166.anIntArray362[223] = 28;
			Static166.anIntArray362[222] = 59;
			Static166.anIntArray362[190] = 72;
			Static166.anIntArray362[191] = 73;
			Static166.anIntArray362[189] = 26;
			Static166.anIntArray362[188] = 71;
			Static166.anIntArray362[192] = 58;
			Static166.anIntArray362[221] = 43;
			Static166.anIntArray362[186] = 57;
			Static166.anIntArray362[219] = 42;
			Static166.anIntArray362[220] = 74;
			Static166.anIntArray362[187] = 27;
			return;
		}
		Static166.anIntArray362[44] = 71;
		Static166.anIntArray362[61] = 27;
		Static166.anIntArray362[47] = 73;
		Static166.anIntArray362[92] = 74;
		Static166.anIntArray362[91] = 42;
		if (Static158.aMethod1 == null) {
			Static166.anIntArray362[192] = 58;
			Static166.anIntArray362[222] = 59;
		} else {
			Static166.anIntArray362[222] = 58;
			Static166.anIntArray362[520] = 59;
			Static166.anIntArray362[192] = 28;
		}
		Static166.anIntArray362[59] = 57;
		Static166.anIntArray362[46] = 72;
		Static166.anIntArray362[45] = 26;
		Static166.anIntArray362[93] = 43;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IZ)V")
	public static void method4638(@OriginalArg(0) int arg0) {
		Static140.anInt3087 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V")
	public static void method4639(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static211.aClass2_Sub16_Sub1_2.method2198(244);
		Static211.aClass2_Sub16_Sub1_2.method2164(arg0);
		Static211.aClass2_Sub16_Sub1_2.method2186(arg1);
	}
}
