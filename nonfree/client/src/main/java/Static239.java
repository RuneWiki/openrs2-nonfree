import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!jca", name = "p", descriptor = "I")
	public static int anInt4386;

	@OriginalMember(owner = "client!jca", name = "l", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_50 = new Class316(73, 6);

	@OriginalMember(owner = "client!jca", name = "o", descriptor = "[I")
	public static final int[] anIntArray364 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3731(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 <= '\u007f') {
				local15++;
			} else if (local23 <= '\u07ff') {
				local15 += 2;
			} else {
				local15 += 3;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)V")
	public static void method3733(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static363.anInt6671 - Static331.anInt6260;
		if (local7 >= 100) {
			Static60.anInt1008 = 1;
			return;
		}
		@Pc(18) int local18 = (int) Static532.aFloat185;
		if (local18 < Static428.anInt7623 >> 8) {
			local18 = Static428.anInt7623 >> 8;
		}
		if (Static297.aBooleanArray18[4] && Static10.anIntArray7[4] + 128 > local18) {
			local18 = Static10.anIntArray7[4] + 128;
		}
		@Pc(51) int local51 = Static270.anInt4763 + (int) Static562.aFloat14 & 0x3FFF;
		Static58.method834(Static168.anInt3085, local18, Static37.method631(Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913, Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911, Static391.anInt7128) - 200, Static480.anInt8528, (local18 >> 3) * 3 + 600 << 2, arg0, local51);
		@Pc(98) float local98 = 1.0F - (float) ((100 - local7) * (100 - local7) * (100 - local7)) / 1000000.0F;
		Static208.anInt3949 = (int) ((float) Static383.anInt7014 + local98 * (float) (Static208.anInt3949 - Static383.anInt7014));
		Static378.anInt6923 = (int) ((float) Static79.anInt2702 + local98 * (float) (Static378.anInt6923 - Static79.anInt2702));
		Static12.anInt183 = (int) ((float) Static376.anInt6855 + (float) (Static12.anInt183 - Static376.anInt6855) * local98);
		Static38.anInt742 = (int) (local98 * (float) (Static38.anInt742 - Static58.anInt1002) + (float) Static58.anInt1002);
		@Pc(151) int local151 = Static232.anInt9865 - Static534.anInt8866;
		if (local151 > 8192) {
			local151 -= 16384;
		} else if (local151 < -8192) {
			local151 += 16384;
		}
		Static232.anInt9865 = (int) ((float) local151 * local98 + (float) Static534.anInt8866);
		Static232.anInt9865 &= 0x3FFF;
	}
}
