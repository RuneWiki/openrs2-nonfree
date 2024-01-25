import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!wn", name = "M", descriptor = "I")
	public static int anInt9575 = -1;

	@OriginalMember(owner = "client!wn", name = "O", descriptor = "[I")
	public static final int[] anIntArray721 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)Z")
	public static boolean method7813(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x40000) != 0 | Static378.method5524(arg0, arg1) || Static252.method3570(arg0, arg1);
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)V")
	public static void method7814() {
		Static301.method4219(Static480.aClass6_Sub37_Sub1_1.anInt6061);
		@Pc(24) int local24 = (Static388.anInt6921 >> 12) + (Static218.anInt3718 >> 3);
		Static282.anInt4677 = Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103 = 0;
		@Pc(37) int local37 = (Static167.anInt3048 >> 3) + (Static220.anInt3753 >> 12);
		Static426.aClass29_Sub2_Sub1_Sub2_2.method7024(8, 8);
		Static268.anIntArray440 = new int[18];
		Static69.aByteArrayArray3 = new byte[18][];
		Static193.anIntArray386 = new int[18];
		Static84.anIntArrayArray25 = new int[18][4];
		Static225.anIntArray414 = new int[18];
		Static491.aByteArrayArray24 = new byte[18][];
		Static196.aByteArrayArray10 = new byte[18][];
		Static370.anIntArray541 = new int[18];
		Static202.aByteArrayArray11 = new byte[18][];
		Static567.anIntArray719 = new int[18];
		Static35.anIntArray45 = new int[18];
		Static340.aByteArrayArray20 = new byte[18][];
		@Pc(83) int local83 = 0;
		@Pc(103) int local103;
		for (@Pc(92) int local92 = (local24 - (Static301.anInt4912 >> 4)) / 8; local92 <= ((Static301.anInt4912 >> 4) + local24) / 8; local92++) {
			for (local103 = (local37 - (Static473.anInt7969 >> 4)) / 8; local103 <= (local37 + (Static473.anInt7969 >> 4)) / 8; local103++) {
				@Pc(111) int local111 = (local92 << 8) + local103;
				Static35.anIntArray45[local83] = local111;
				Static268.anIntArray440[local83] = Static285.aClass251_84.method5863("m" + local92 + "_" + local103);
				Static193.anIntArray386[local83] = Static285.aClass251_84.method5863("l" + local92 + "_" + local103);
				Static567.anIntArray719[local83] = Static285.aClass251_84.method5863("n" + local92 + "_" + local103);
				Static225.anIntArray414[local83] = Static285.aClass251_84.method5863("um" + local92 + "_" + local103);
				Static370.anIntArray541[local83] = Static285.aClass251_84.method5863("ul" + local92 + "_" + local103);
				if (Static567.anIntArray719[local83] == -1) {
					Static268.anIntArray440[local83] = -1;
					Static193.anIntArray386[local83] = -1;
					Static225.anIntArray414[local83] = -1;
					Static370.anIntArray541[local83] = -1;
				}
				local83++;
			}
		}
		for (local103 = local83; local103 < Static567.anIntArray719.length; local103++) {
			Static567.anIntArray719[local103] = -1;
			Static268.anIntArray440[local103] = -1;
			Static193.anIntArray386[local103] = -1;
			Static225.anIntArray414[local103] = -1;
			Static370.anIntArray541[local103] = -1;
		}
		@Pc(290) byte local290;
		if (Static146.anInt2581 == 3) {
			local290 = 4;
		} else {
			local290 = 8;
		}
		Static242.method3514(false, local37, local290, local24);
	}
}
