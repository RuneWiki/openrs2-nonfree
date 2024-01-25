import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!kd", name = "L", descriptor = "[I")
	public static int[] anIntArray337;

	@OriginalMember(owner = "client!kd", name = "M", descriptor = "Lclient!bc;")
	public static Class16 aClass16_4;

	@OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
	public static int anInt3268;

	@OriginalMember(owner = "client!kd", name = "Q", descriptor = "F")
	public static float aFloat24 = 0.0F;

	@OriginalMember(owner = "client!kd", name = "U", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)Lclient!qg;")
	public static Class5_Sub32 method2903() {
		if (Static290.aClass103_69 == null || Static155.aClass29_1 == null) {
			return null;
		}
		Static155.aClass29_1.method571(Static290.aClass103_69);
		@Pc(23) Class5_Sub32 local23 = (Class5_Sub32) Static155.aClass29_1.method576();
		if (local23 == null) {
			return null;
		} else {
			@Pc(32) Class215 local32 = Static252.method4463(local23.anInt5146);
			return local32 != null && local32.aBoolean588 && local32.method5994() ? local23 : Static56.method877();
		}
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)V")
	public static void method2904() {
		Static354.method6024(Static161.anInt3186);
		@Pc(14) int local14 = (Static271.anInt5301 >> 10) + (Static172.anInt4394 >> 3);
		@Pc(22) int local22 = (Static12.anInt3797 >> 3) + (Static21.anInt466 >> 10);
		Static78.anIntArray121 = new int[18];
		Static150.aByteArrayArray12 = new byte[18][];
		Static315.anIntArray593 = new int[18];
		Static182.anIntArrayArray67 = new int[18][4];
		Static318.aByteArrayArray20 = new byte[18][];
		Static209.anIntArray397 = new int[18];
		Static270.anIntArray508 = new int[18];
		Static245.aByteArrayArray15 = new byte[18][];
		Static251.anIntArray485 = new int[18];
		Static75.aByteArrayArray6 = new byte[18][];
		Static198.anIntArray387 = new int[18];
		Static252.aByteArrayArray16 = new byte[18][];
		@Pc(69) int local69 = 0;
		@Pc(92) int local92;
		for (@Pc(83) int local83 = (local14 - (Static22.anInt481 >> 4)) / 8; local83 <= (local14 + (Static22.anInt481 >> 4)) / 8; local83++) {
			for (local92 = (local22 - (Static269.anInt5281 >> 4)) / 8; local92 <= ((Static269.anInt5281 >> 4) + local22) / 8; local92++) {
				@Pc(99) int local99 = local92 + (local83 << 8);
				Static198.anIntArray387[local69] = local99;
				Static270.anIntArray508[local69] = Static351.aClass93_134.method2393("m" + local83 + "_" + local92);
				Static209.anIntArray397[local69] = Static351.aClass93_134.method2393("l" + local83 + "_" + local92);
				Static78.anIntArray121[local69] = Static351.aClass93_134.method2393("n" + local83 + "_" + local92);
				Static315.anIntArray593[local69] = Static351.aClass93_134.method2393("um" + local83 + "_" + local92);
				Static251.anIntArray485[local69] = Static351.aClass93_134.method2393("ul" + local83 + "_" + local92);
				if (Static78.anIntArray121[local69] == -1) {
					Static270.anIntArray508[local69] = -1;
					Static209.anIntArray397[local69] = -1;
					Static315.anIntArray593[local69] = -1;
					Static251.anIntArray485[local69] = -1;
				}
				local69++;
			}
		}
		for (local92 = local69; local92 < Static78.anIntArray121.length; local92++) {
			Static78.anIntArray121[local92] = -1;
			Static270.anIntArray508[local92] = -1;
			Static209.anIntArray397[local92] = -1;
			Static315.anIntArray593[local92] = -1;
			Static251.anIntArray485[local92] = -1;
		}
		Static144.method2634(0, 8, false, true, local22, local14, 8);
	}
}
