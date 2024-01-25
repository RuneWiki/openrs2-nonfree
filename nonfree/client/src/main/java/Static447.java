import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
	public static int anInt4684;

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
	public static int anInt4685;

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
	public static int anInt4686;

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "[I")
	public static int[] anIntArray321;

	@OriginalMember(owner = "client!wo", name = "q", descriptor = "F")
	public static float aFloat151;

	@OriginalMember(owner = "client!wo", name = "p", descriptor = "S")
	public static short aShort54 = 1;

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(III)V")
	public static void method3797(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17;
		if (arg0 != Static131.anInt2581) {
			Static252.anIntArray323 = new int[arg0];
			for (local17 = 0; local17 < arg0; local17++) {
				Static252.anIntArray323[local17] = (local17 << 12) / arg0;
			}
			Static131.anInt2581 = arg0;
			Static270.anInt4969 = arg0 * 32;
			Static287.anInt5227 = arg0 - 1;
		}
		if (arg1 == Static266.anInt4930) {
			return;
		}
		if (Static131.anInt2581 == arg1) {
			Static373.anIntArray55 = Static252.anIntArray323;
		} else {
			Static373.anIntArray55 = new int[arg1];
			for (local17 = 0; local17 < arg1; local17++) {
				Static373.anIntArray55[local17] = (local17 << 12) / arg1;
			}
		}
		Static36.anInt893 = arg1 - 1;
		Static266.anInt4930 = arg1;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(DZ)V")
	public static void method3799(@OriginalArg(0) double arg0) {
		if (Static201.aDouble1 == arg0) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static379.anIntArray449[local7] = local19 <= 255 ? local19 : 255;
		}
		Static201.aDouble1 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)V")
	public static void method3800(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = Static164.anInt3206 - Static271.anInt4997;
		if (local7 >= 100) {
			Static65.anInt7824 = 1;
			return;
		}
		@Pc(16) int local16 = (int) Static328.aFloat179;
		if (local16 < Static153.anInt2938 >> 8) {
			local16 = Static153.anInt2938 >> 8;
		}
		if (Static125.aBooleanArray17[4] && local16 < Static432.anIntArray503[4] + 128) {
			local16 = Static432.anIntArray503[4] + 128;
		}
		@Pc(53) int local53 = (int) Static203.aFloat130 + Static90.anInt2061 & 0x3FFF;
		Static405.method5499(arg0, Static177.anInt3430, local53, local16, Static66.method1200(Static301.anInt5383, Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7117, Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7111) - 50, (local16 >> 3) * 3 + 600 << 0, Static349.anInt6145);
		@Pc(99) float local99 = 1.0F - (float) ((100 - local7) * (100 - local7) * (100 - local7)) / 1000000.0F;
		Static110.anInt2281 = (int) ((float) (Static110.anInt2281 - Static271.anInt4999) * local99 + (float) Static271.anInt4999);
		Static293.anInt5622 = (int) (local99 * (float) (Static293.anInt5622 - Static97.anInt2176) + (float) Static97.anInt2176);
		Static293.anInt5621 = (int) (local99 * (float) (Static293.anInt5621 - Static327.anInt5855) + (float) Static327.anInt5855);
		Static225.anInt4310 = (int) (local99 * (float) (Static225.anInt4310 - Static176.anInt3414) + (float) Static176.anInt3414);
		@Pc(152) int local152 = Static258.anInt4308 - Static133.anInt2589;
		if (local152 > 8192) {
			local152 -= 16384;
		} else if (local152 < -8192) {
			local152 += 16384;
		}
		Static258.anInt4308 = (int) ((float) Static133.anInt2589 + (float) local152 * local99);
		Static258.anInt4308 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)V")
	public static void method3801() {
		if (Static72.aBoolean290) {
			return;
		}
		if (Static399.aClass167_Sub1_1.aBoolean480) {
			Static203.aFloat130 = (int) Static203.aFloat130 + 191 & 0xFFFFFF80;
		} else {
			Static83.aFloat67 += (24.0F - Static83.aFloat67) / 2.0F;
		}
		Static18.aBoolean33 = true;
		Static72.aBoolean290 = true;
	}
}
