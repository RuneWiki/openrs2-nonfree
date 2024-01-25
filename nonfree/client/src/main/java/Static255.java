import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!mt", name = "F", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_152 = new Class56(82, -2);

	@OriginalMember(owner = "client!mt", name = "N", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_73 = new Class15(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!mt", name = "O", descriptor = "[I")
	public static final int[] anIntArray350 = new int[8];

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method3371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg0; local12 <= arg2; local12++) {
			for (@Pc(16) int local16 = arg1; local16 <= arg4; local16++) {
				if (Static138.anIntArrayArray30[local12][local16] == arg3 && Static401.anIntArrayArray57[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(B)V")
	public static void method3372() {
		Static35.method468(Static413.aClass49_Sub1_1.anInt3201);
		@Pc(21) int local21 = (Static365.anInt6047 >> 3) + (Static235.anInt4004 >> 10);
		Static68.anInt1387 = Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99 = 0;
		@Pc(34) int local34 = (Static393.anInt7135 >> 10) + (Static366.anInt6052 >> 3);
		Static401.aClass8_Sub3_Sub1_Sub1_2.method4558(8, 8);
		Static146.anIntArray220 = new int[18];
		Static271.aByteArrayArray10 = new byte[18][];
		Static225.anIntArray279 = new int[18];
		Static131.aByteArrayArray5 = new byte[18][];
		Static372.aByteArrayArray13 = new byte[18][];
		Static229.anIntArrayArray42 = new int[18][4];
		Static91.anIntArray131 = new int[18];
		Static418.aByteArrayArray17 = new byte[18][];
		Static398.anIntArray495 = new int[18];
		Static375.aByteArrayArray14 = new byte[18][];
		Static127.anIntArray182 = new int[18];
		Static318.anIntArray417 = new int[18];
		@Pc(80) int local80 = 0;
		@Pc(99) int local99;
		for (@Pc(88) int local88 = (local21 - (Static337.anInt5497 >> 4)) / 8; local88 <= (local21 + (Static337.anInt5497 >> 4)) / 8; local88++) {
			for (local99 = (local34 - (Static282.anInt4644 >> 4)) / 8; local99 <= ((Static282.anInt4644 >> 4) + local34) / 8; local99++) {
				@Pc(107) int local107 = (local88 << 8) + local99;
				Static91.anIntArray131[local80] = local107;
				Static318.anIntArray417[local80] = Static280.aClass211_68.method4384("m" + local88 + "_" + local99);
				Static146.anIntArray220[local80] = Static280.aClass211_68.method4384("l" + local88 + "_" + local99);
				Static225.anIntArray279[local80] = Static280.aClass211_68.method4384("n" + local88 + "_" + local99);
				Static127.anIntArray182[local80] = Static280.aClass211_68.method4384("um" + local88 + "_" + local99);
				Static398.anIntArray495[local80] = Static280.aClass211_68.method4384("ul" + local88 + "_" + local99);
				if (Static225.anIntArray279[local80] == -1) {
					Static318.anIntArray417[local80] = -1;
					Static146.anIntArray220[local80] = -1;
					Static127.anIntArray182[local80] = -1;
					Static398.anIntArray495[local80] = -1;
				}
				local80++;
			}
		}
		for (local99 = local80; local99 < Static225.anIntArray279.length; local99++) {
			Static225.anIntArray279[local99] = -1;
			Static318.anIntArray417[local99] = -1;
			Static146.anIntArray220[local99] = -1;
			Static127.anIntArray182[local99] = -1;
			Static398.anIntArray495[local99] = -1;
		}
		@Pc(285) byte local285;
		if (Static8.anInt119 == 1 || Static8.anInt119 == 2) {
			local285 = 3;
		} else {
			local285 = 7;
		}
		Static326.method4297(local285, false, local34, local21);
	}

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "(Z)Lclient!mv;")
	public static Class176_Sub1 method3374() {
		return Static412.anInt6968 < Static360.aClass176_Sub1Array2.length ? Static360.aClass176_Sub1Array2[Static412.anInt6968++] : null;
	}
}
