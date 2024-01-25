import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "Lclient!wg;")
	public static final Class387 aClass387_6 = new Class387(13, 0, 1, 0);

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "Lclient!jia;")
	public static final Class193 aClass193_14 = new Class193();

	@OriginalMember(owner = "client!eaa", name = "g", descriptor = "I")
	public static int anInt2397 = 0;

	@OriginalMember(owner = "client!eaa", name = "i", descriptor = "I")
	public static int anInt2399 = 0;

	@OriginalMember(owner = "client!eaa", name = "j", descriptor = "[I")
	public static final int[] anIntArray156 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III)Z")
	public static boolean method2195(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)Z")
	public static boolean method2197() {
		try {
			return Static550.method7560();
		} catch (@Pc(14) IOException local14) {
			Static344.method5200();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static39.aClass126_16 == null ? -1 : Static39.aClass126_16.method2788()) + "," + (Static215.aClass126_116 == null ? -1 : Static215.aClass126_116.method2788()) + "," + (Static3.aClass126_2 == null ? -1 : Static3.aClass126_2.method2788()) + " - " + Static548.anInt8905 + "," + (Static417.anInt7047 + Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anIntArray659[0]) + "," + (Static347.anInt7851 + Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anIntArray660[0]) + " - ";
			for (@Pc(79) int local79 = 0; Static548.anInt8905 > local79 && local79 < 50; local79++) {
				local77 = local77 + Static67.aClass3_Sub17_Sub2_4.aByteArray59[local79] + ",";
			}
			Static81.method1711(local77, local19);
			Static431.method6362(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V")
	public static void method2198() {
		if (Static216.anInt3999 == 5) {
			Static216.anInt3999 = 6;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III[F[IIIZ[FI[III)V")
	public static void method2200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(11) int local11 = arg6 * arg0 + arg10;
		@Pc(22) int local22 = arg1 + arg11 * arg8;
		@Pc(27) int local27 = arg0 - arg2;
		@Pc(32) int local32 = arg8 - arg2;
		@Pc(38) int local38;
		@Pc(44) int local44;
		if (arg9 == null) {
			for (local38 = 0; local38 < arg5; local38++) {
				local44 = local11 + arg2;
				while (local11 < local44) {
					arg3[local22++] = arg7[local11++];
				}
				local22 += local32;
				local11 += local27;
			}
		} else if (arg7 == null) {
			for (local38 = 0; local38 < arg5; local38++) {
				local44 = arg2 + local11;
				while (local11 < local44) {
					arg4[local22++] = arg9[local11++];
				}
				local22 += local32;
				local11 += local27;
			}
		} else {
			for (local38 = 0; local38 < arg5; local38++) {
				local44 = local11 + arg2;
				while (local44 > local11) {
					arg4[local22] = arg9[local11];
					arg3[local22++] = arg7[local11++];
				}
				local22 += local32;
				local11 += local27;
			}
		}
	}
}
