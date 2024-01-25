import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "Lclient!vo;")
	public static Class348 aClass348_85;

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_64 = new Class344(78, -1);

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[100];

	@OriginalMember(owner = "client!oi", name = "q", descriptor = "[I")
	public static final int[] anIntArray404 = new int[2048];

	@OriginalMember(owner = "client!oi", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString148 = null;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZ)V")
	public static void method5878(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static306.anInt6122 - Static360.anInt6968;
		if (local7 >= 100) {
			Static453.anInt8613 = -1;
			Static587.anInt10508 = -1;
			Static300.anInt6053 = 1;
			return;
		}
		@Pc(24) int local24 = (int) Static155.aFloat73;
		if (Static506.anInt9470 >> 8 > local24) {
			local24 = Static506.anInt9470 >> 8;
		}
		if (Static179.aBooleanArray8[4] && local24 < Static60.anIntArray62[4] + 128) {
			local24 = Static60.anIntArray62[4] + 128;
		}
		@Pc(65) int local65 = Static42.anInt1292 + (int) Static189.aFloat83 & 0x3FFF;
		Static209.method3412(local65, arg0, Static461.method6782(Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10550, Static352.anInt6764, Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10551) - 200, (local24 >> 3) * 3 + 600 << 2, local24, Static222.anInt4655, Static148.anInt3159);
		@Pc(110) float local110 = 1.0F - (float) ((100 - local7) * (-local7 + 100) * (100 - local7)) / 1000000.0F;
		Static534.anInt9775 = (int) ((float) (Static534.anInt9775 - Static275.anInt5759) * local110 + (float) Static275.anInt5759);
		Static139.anInt3067 = (int) ((float) Static464.anInt8840 + (float) (Static139.anInt3067 - Static464.anInt8840) * local110);
		Static114.anInt2613 = (int) ((float) (Static114.anInt2613 - Static474.anInt1324) * local110 + (float) Static474.anInt1324);
		Static233.anInt4905 = (int) (local110 * (float) (Static233.anInt4905 - Static328.anInt6427) + (float) Static328.anInt6427);
		@Pc(162) int local162 = Static353.anInt6831 - Static108.anInt9764;
		if (local162 > 8192) {
			local162 -= 16384;
		} else if (local162 < -8192) {
			local162 += 16384;
		}
		Static353.anInt6831 = (int) ((float) Static108.anInt9764 + (float) local162 * local110);
		Static353.anInt6831 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method5881(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local14 > local11 && Static18.method809(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static18.method809(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(52) int local52 = local14 - local11;
		if (local52 < 1 || local52 > 12) {
			return null;
		}
		@Pc(67) StringBuffer local67 = new StringBuffer(local52);
		for (@Pc(69) int local69 = local11; local69 < local14; local69++) {
			@Pc(75) char local75 = arg0.charAt(local69);
			if (Static106.method1998(local75)) {
				@Pc(83) char local83 = Static147.method2542(local75);
				if (local83 != '\u0000') {
					local67.append(local83);
				}
			}
		}
		if (local67.length() == 0) {
			return null;
		} else {
			return local67.toString();
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!ek;I)Lclient!cda;")
	public static Class50_Sub1 method5886(@OriginalArg(0) Class4_Sub13 arg0) {
		@Pc(7) Class50 local7 = Static279.method4475(arg0);
		@Pc(16) int local16 = arg0.method6990();
		@Pc(20) int local20 = arg0.method6990();
		return new Class50_Sub1(local7.aClass347_11, local7.aClass214_11, local7.anInt7638, local7.anInt7633, local7.anInt7637, local7.anInt7630, local7.anInt7631, local7.anInt7632, local7.anInt7635, local16, local20);
	}
}
