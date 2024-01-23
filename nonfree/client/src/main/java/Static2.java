import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
	public static int anInt71;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Lclient!ia;")
	public static Class51 aClass51_38 = Static64.method1101("mem=");

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "Lclient!uh;")
	public static Class116 aClass116_1 = new Class116();

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "[I")
	public static int[] anIntArray1 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
	public static int anInt73 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLclient!mb;)V")
	public static void method59(@OriginalArg(1) Class70 arg0) {
		Static8.aClass41_Sub1Array1 = Static25.method498(Static140.anInt3108, arg0);
		Static88.anIntArray127 = new int[256];
		for (@Pc(15) int local15 = 0; local15 < 3; local15++) {
			@Pc(26) float local26 = (float) (Static182.anIntArray301[local15] >> 16 & 0xFF);
			@Pc(36) int local36 = Static182.anIntArray301[local15 + 1] >> 16 & 0xFF;
			@Pc(45) float local45 = (float) (Static182.anIntArray301[local15] >> 8 & 0xFF);
			@Pc(52) float local52 = ((float) local36 - local26) / 64.0F;
			@Pc(62) int local62 = Static182.anIntArray301[local15 + 1] >> 8 & 0xFF;
			@Pc(69) float local69 = (float) (Static182.anIntArray301[local15] & 0xFF);
			@Pc(77) int local77 = Static182.anIntArray301[local15 + 1] & 0xFF;
			@Pc(84) float local84 = ((float) local77 - local69) / 64.0F;
			@Pc(92) float local92 = ((float) local62 - local45) / 64.0F;
			for (@Pc(94) int local94 = 0; local94 < 64; local94++) {
				Static88.anIntArray127[local15 * 64 + local94] = (int) local45 << 8 | (int) local26 << 16 | (int) local69;
				local69 += local84;
				local26 += local52;
				local45 += local92;
			}
		}
		for (@Pc(141) int local141 = 192; local141 < 255; local141++) {
			Static88.anIntArray127[local141] = Static182.anIntArray301[3];
		}
		Static179.anIntArray298 = new int[32768];
		Static50.anIntArray70 = new int[32768];
		Static110.method1052(null);
		Static206.anIntArray329 = new int[32768];
		Static47.anIntArray66 = new int[32768];
		Static168.aClass1_Sub2_Sub1_Sub1_1 = new Class1_Sub2_Sub1_Sub1(128, 254);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIZII)V")
	public static void method60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == arg0) {
			Static227.method3741(arg4, arg0, arg1, arg3);
		} else if (Static160.anInt3454 <= arg1 - arg0 && Static149.anInt3252 >= arg1 + arg0 && arg3 - arg2 >= Static225.anInt4729 && Static122.anInt2710 >= arg3 + arg2) {
			Static203.method3264(arg3, arg4, arg1, arg0, arg2);
		} else {
			Static50.method866(arg4, arg3, arg1, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ[BI)I")
	public static int method61(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(15) int local15 = arg2; local15 < arg0; local15++) {
			local7 = Class1_Sub2_Sub7.anIntArray232[(local7 ^ arg1[local15]) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)I")
	public static int method63() {
		return Static13.anInt326;
	}
}
