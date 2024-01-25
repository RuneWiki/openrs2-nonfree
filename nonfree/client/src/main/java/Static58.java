import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!caa", name = "k", descriptor = "I")
	public static int anInt1002;

	@OriginalMember(owner = "client!caa", name = "l", descriptor = "Lclient!vaa;")
	public static Class6_Sub17_Sub1 aClass6_Sub17_Sub1_1;

	@OriginalMember(owner = "client!caa", name = "e", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_13 = new Class98(83, 6);

	@OriginalMember(owner = "client!caa", name = "j", descriptor = "[[B")
	public static final byte[][] aByteArrayArray1 = new byte[250][];

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V")
	public static void method833() {
		Static154.anInt2875 = 0;
		Static567.anInt9818 = -1;
		Static542.anInt9320 = -1;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg5 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(30) int local30 = Static287.aShort82 + (Static478.aShort104 - Static287.aShort82) * local7 / 100;
		@Pc(36) int local36 = local30 * arg4 >> 8;
		@Pc(43) int local43 = 16384 - arg1 & 0x3FFF;
		@Pc(50) int local50 = 16384 - arg6 & 0x3FFF;
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = local36;
		if (local43 != 0) {
			local54 = Class22.anIntArray20[local43] * -local36 >> 14;
			local56 = local36 * Class22.anIntArray19[local43] >> 14;
		}
		if (local50 != 0) {
			local52 = local56 * Class22.anIntArray20[local50] >> 14;
			local56 = Class22.anIntArray19[local50] * local56 >> 14;
		}
		Static38.anInt742 = arg1;
		Static232.anInt9865 = arg6;
		Static378.anInt6923 = arg3 - local52;
		Static463.anInt8184 = 0;
		Static208.anInt3949 = arg0 - local56;
		Static12.anInt183 = arg2 - local54;
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V")
	public static void method835() {
		for (@Pc(22) Class6_Sub44 local22 = (Class6_Sub44) Static24.aClass298_14.method6809(); local22 != null; local22 = (Class6_Sub44) Static24.aClass298_14.method6821()) {
			if (local22.anInt8221 == -1) {
				local22.anInt8231 = 0;
				if (local22.anInt8222 >= 0 && local22.anInt8228 >= 0 && Static18.anInt5706 > local22.anInt8222 && local22.anInt8228 < Static80.anInt1367) {
					Static305.method1619(local22);
				}
			} else {
				local22.method7948();
			}
		}
	}

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "(I)I")
	public static int method836() {
		return Static345.anInt6520;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(BZ)C")
	public static char method838(@OriginalArg(0) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(43) char local43 = Static73.aCharArray1[local12 - 128];
			if (local43 == '\u0000') {
				local43 = '?';
			}
			local12 = local43;
		}
		return (char) local12;
	}
}
