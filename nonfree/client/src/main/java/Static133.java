import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!eca", name = "n", descriptor = "Z")
	public static boolean aBoolean169;

	@OriginalMember(owner = "client!eca", name = "j", descriptor = "Lclient!vf;")
	public static final Class390 aClass390_5 = new Class390(5, 1);

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "(B)V")
	public static void method2361() {
		Static147.aClass313_13.method7101();
		Static356.aClass313_26.method7101();
	}

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "(I)V")
	public static void method2363() {
		Static565.anImage13 = null;
		Static256.aFont2 = null;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(BLclient!bj;)I")
	public static int method2365(@OriginalArg(1) Class37 arg0) {
		if (Static15.aClass37_1 == arg0) {
			return 9216;
		} else if (Static526.aClass37_3 == arg0) {
			return 34065;
		} else if (arg0 == Static281.aClass37_2) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IILclient!ha;)V")
	public static void method2369(@OriginalArg(0) int arg0, @OriginalArg(2) Class22 arg1) {
		if (!Static42.aBoolean87 || !Static497.aBoolean530) {
			Static525.anInt8215 = 0;
			return;
		}
		if (Static296.aBoolean290) {
			Static471.aLong245 = Static310.aClass157_1.method6916();
		}
		Static62.anInt1503 = 0;
		Static456.anInt7106 = 0;
		Static65.anInt8656 = 0;
		@Pc(39) int[] local39 = arg1.Y();
		Static456.anInt7115 = (int) ((float) local39[2] / 3.0F);
		Static446.anInt6828 = (int) ((float) local39[3] / 3.0F);
		arg1.method9371(Static607.anIntArray664);
		if ((int) ((float) Static607.anIntArray664[0] / 3.0F) != Static587.anInt8944 || Static391.anInt6094 != (int) ((float) Static607.anIntArray664[1] / 3.0F)) {
			Static391.anInt6094 = (int) ((float) Static607.anIntArray664[1] / 3.0F);
			Static587.anInt8944 = (int) ((float) Static607.anIntArray664[0] / 3.0F);
			Static325.anInt5274 = Static391.anInt6094 >> 1;
			Static351.anInt5574 = Static587.anInt8944 >> 1;
			Static628.anIntArray700 = new int[Static587.anInt8944 * Static391.anInt6094];
		}
		Static491.aClass58_8 = arg1.method9369();
		Static525.anInt8215 = 0;
		for (@Pc(120) int local120 = 0; local120 < Static328.anInt8407; local120++) {
			Static317.method4649(Static357.aClass108Array6[local120], arg0, arg1);
		}
		for (@Pc(141) int local141 = 0; local141 < Static86.anInt2031; local141++) {
			Static317.method4649(Static179.aClass108Array5[local141], arg0, arg1);
		}
		for (@Pc(162) int local162 = 0; local162 < Static340.anInt5461; local162++) {
			Static317.method4649(Static131.aClass108Array4[local162], arg0, arg1);
		}
		Static532.anInt8283 = 0;
		if (Static525.anInt8215 > 0) {
			@Pc(193) int local193 = Static628.anIntArray700.length;
			@Pc(200) int local200 = local193 - local193 & 0x7;
			@Pc(202) int local202 = 0;
			while (local200 > local202) {
				Static628.anIntArray700[local202++] = Integer.MAX_VALUE;
				Static628.anIntArray700[local202++] = Integer.MAX_VALUE;
				Static628.anIntArray700[local202++] = Integer.MAX_VALUE;
				Static628.anIntArray700[local202++] = Integer.MAX_VALUE;
				Static628.anIntArray700[local202++] = Integer.MAX_VALUE;
				Static628.anIntArray700[local202++] = Integer.MAX_VALUE;
				Static628.anIntArray700[local202++] = Integer.MAX_VALUE;
				Static628.anIntArray700[local202++] = Integer.MAX_VALUE;
			}
			while (local202 < local193) {
				Static628.anIntArray700[local202++] = Integer.MAX_VALUE;
			}
			Static245.anInt3870 = 1;
			for (@Pc(273) int local273 = 0; local273 < Static525.anInt8215; local273++) {
				@Pc(279) Class108 local279 = Static79.aClass108Array3[local273];
				Static166.method2695(local279.aShortArray17[1], local279.aShortArray17[0], local279.aShortArray16[3], local279.aShortArray17[3], local279.aShortArray18[0], local279.aShortArray16[0], local279.aShortArray16[1], local279.aShortArray18[3], local279.aShortArray18[1]);
				Static166.method2695(local279.aShortArray17[2], local279.aShortArray17[1], local279.aShortArray16[3], local279.aShortArray17[3], local279.aShortArray18[1], local279.aShortArray16[1], local279.aShortArray16[2], local279.aShortArray18[3], local279.aShortArray18[2]);
			}
			Static245.anInt3870 = 2;
		}
		if (Static296.aBoolean290) {
			Static691.aLong331 = Static310.aClass157_1.method6916() - Static471.aLong245;
		}
	}
}
