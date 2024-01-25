import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "[S")
	private static final short[] aShortArray21 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "[I")
	public static final int[] anIntArray88 = new int[500];

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
	public static int anInt2001 = -1;

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "[S")
	public static final short[] aShortArray22 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray9 = new boolean[100];

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
	public static int anInt2003 = 16777215;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
	public static int anInt2005 = 0;

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "[S")
	private static final short[] aShortArray23 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "[[S")
	public static final short[][] aShortArrayArray5 = new short[][] { aShortArray23, aShortArray22, aShortArray21 };

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
	public static int anInt2006 = 13156520;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method1916(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 *= 37L;
			@Pc(22) char local22 = arg0.charAt(local12);
			if (local22 >= 'A' && local22 <= 'Z') {
				local7 += local22 + 1 - 65;
			} else if (local22 >= 'a' && local22 <= 'z') {
				local7 += local22 + 1 - 97;
			} else if (local22 >= '0' && local22 <= '9') {
				local7 += local22 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)V")
	public static void method1920(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static407.anInt7704 - Static183.anInt4412;
		if (local7 >= 100) {
			Static496.anInt9165 = 1;
			Static442.anInt8212 = -1;
			Static194.anInt4508 = -1;
			return;
		}
		@Pc(22) int local22 = (int) Static305.aFloat154;
		if (Static489.anInt9047 >> 8 > local22) {
			local22 = Static489.anInt9047 >> 8;
		}
		if (Static446.aBooleanArray21[4] && Static561.anIntArray651[4] + 128 > local22) {
			local22 = Static561.anIntArray651[4] + 128;
		}
		@Pc(59) int local59 = (int) Static72.aFloat68 + Static471.anInt8841 & 0x3FFF;
		Static208.method4098(local22, Static590.method8716(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10303, Static12.anInt172, Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10310) - 200, local59, Static468.anInt8821, arg0, Static21.anInt398, (local22 >> 3) * 3 + 600 << 2);
		@Pc(110) float local110 = 1.0F - (float) ((100 - local7) * (100 - local7) * (100 - local7)) / 1000000.0F;
		Static135.anInt3347 = (int) ((float) Static148.anInt3618 + local110 * (float) (Static135.anInt3347 - Static148.anInt3618));
		Static639.anInt11034 = (int) ((float) (Static639.anInt11034 - Static552.anInt9898) * local110 + (float) Static552.anInt9898);
		Static266.anInt5673 = (int) ((float) Static601.anInt10558 + (float) (Static266.anInt5673 - Static601.anInt10558) * local110);
		Static621.anInt10870 = (int) ((float) Static141.anInt3414 + local110 * (float) (Static621.anInt10870 - Static141.anInt3414));
		@Pc(161) int local161 = Static189.anInt11070 - Static558.anInt9998;
		if (local161 > 8192) {
			local161 -= 16384;
		} else if (local161 < -8192) {
			local161 += 16384;
		}
		Static189.anInt11070 = (int) ((float) local161 * local110 + (float) Static558.anInt9998);
		Static189.anInt11070 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	public static void method1923() {
		for (@Pc(7) int local7 = 0; local7 < Static395.anInt7569; local7++) {
			@Pc(13) Class125 local13 = Static443.aClass125Array1[local7];
			if (local13.aByte72 == 3) {
				if (local13.aClass2_Sub8_Sub5_1 == null) {
					local13.anInt4519 = Integer.MIN_VALUE;
				} else {
					Static614.aClass2_Sub8_Sub4_2.method7925(local13.aClass2_Sub8_Sub5_1);
				}
			}
		}
	}
}
