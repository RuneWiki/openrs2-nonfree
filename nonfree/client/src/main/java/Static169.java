import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!fw", name = "p", descriptor = "Lclient!kh;")
	public static Class187 aClass187_1;

	@OriginalMember(owner = "client!fw", name = "f", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_49 = new Class130(34, 2);

	@OriginalMember(owner = "client!fw", name = "k", descriptor = "[B")
	public static final byte[] aByteArray48 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
	public static void method2956() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("availableProcessors");
			if (local12 != null) {
				try {
					@Pc(16) Runtime local16 = Runtime.getRuntime();
					@Pc(22) Integer local22 = (Integer) local12.invoke(local16, (Object[]) null);
					Static529.anInt9056 = local22;
				} catch (@Pc(27) Throwable local27) {
				}
			}
		} catch (@Pc(35) Exception local35) {
		}
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(B)V")
	public static void method2961() {
		if (Static435.anInt7846 == -1 || Static147.anInt2910 == -1) {
			return;
		}
		@Pc(24) int local24 = Static221.anInt4214 + (Static190.anInt3603 * (Static598.anInt9784 - Static221.anInt4214) >> 16);
		Static190.anInt3603 += local24;
		if (Static190.anInt3603 >= 65535) {
			if (Static149.aBoolean193) {
				Static504.aBoolean616 = false;
			} else {
				Static504.aBoolean616 = true;
			}
			Static190.anInt3603 = 65535;
			Static149.aBoolean193 = true;
		} else {
			Static149.aBoolean193 = false;
			Static504.aBoolean616 = false;
		}
		@Pc(54) float local54 = (float) Static190.anInt3603 / 65535.0F;
		@Pc(57) float[] local57 = new float[3];
		@Pc(61) int local61 = Static601.anInt9791 * 2;
		@Pc(87) int local87;
		@Pc(120) int local120;
		@Pc(128) int local128;
		@Pc(133) int local133;
		@Pc(143) int local143;
		@Pc(159) int local159;
		for (@Pc(63) int local63 = 0; local63 < 3; local63++) {
			@Pc(75) int local75 = Static161.anIntArrayArrayArray9[Static435.anInt7846][local61][local63] * 3;
			local87 = Static161.anIntArrayArrayArray9[Static435.anInt7846][local61 + 1][local63] * 3;
			local120 = (Static161.anIntArrayArrayArray9[Static435.anInt7846][local61 + 2][local63] + Static161.anIntArrayArrayArray9[Static435.anInt7846][local61 + 2][local63] - Static161.anIntArrayArrayArray9[Static435.anInt7846][local61 + 3][local63]) * 3;
			local128 = Static161.anIntArrayArrayArray9[Static435.anInt7846][local61][local63];
			local133 = local87 - local75;
			local143 = local75 + local120 - local87 * 2;
			local159 = Static161.anIntArrayArrayArray9[Static435.anInt7846][local61 + 2][local63] + local87 - local128 - local120;
			local57[local63] = ((float) local133 + ((float) local143 + local54 * (float) local159) * local54) * local54 + (float) local128;
		}
		Static557.anInt9304 = (int) local57[1] * -1;
		Static611.anInt9892 = (int) local57[0] - Static299.anInt5307 * 512;
		Static20.anInt824 = (int) local57[2] - Static171.anInt3340 * 512;
		@Pc(213) float[] local213 = new float[3];
		local87 = Static526.anInt8991 * 2;
		for (local120 = 0; local120 < 3; local120++) {
			local128 = Static161.anIntArrayArrayArray9[Static147.anInt2910][local87][local120] * 3;
			local133 = Static161.anIntArrayArrayArray9[Static147.anInt2910][local87 + 1][local120] * 3;
			local143 = (Static161.anIntArrayArrayArray9[Static147.anInt2910][local87 + 2][local120] + Static161.anIntArrayArrayArray9[Static147.anInt2910][local87 + 2][local120] - Static161.anIntArrayArrayArray9[Static147.anInt2910][local87 + 3][local120]) * 3;
			local159 = Static161.anIntArrayArrayArray9[Static147.anInt2910][local87][local120];
			@Pc(289) int local289 = local133 - local128;
			@Pc(299) int local299 = local128 + local143 - local133 * 2;
			@Pc(316) int local316 = local133 + Static161.anIntArrayArrayArray9[Static147.anInt2910][local87 + 2][local120] - local143 - local159;
			local213[local120] = local54 * (((float) local299 + (float) local316 * local54) * local54 + (float) local289) + (float) local159;
		}
		@Pc(351) float local351 = local213[0] - local57[0];
		@Pc(361) float local361 = (local213[1] - local57[1]) * -1.0F;
		@Pc(378) float local378 = local213[2] - local57[2];
		@Pc(388) double local388 = Math.sqrt((double) (local351 * local351 + local378 * local378));
		Static393.anInt7268 = (int) (Math.atan2((double) local361, local388) * 2607.5945876176133D) & 0x3FFF;
		Static185.anInt5215 = (int) (-Math.atan2((double) local351, (double) local378) * 2607.5945876176133D) & 0x3FFF;
		Static72.anInt1723 = ((Static161.anIntArrayArrayArray9[Static435.anInt7846][local61 + 2][3] - Static161.anIntArrayArrayArray9[Static435.anInt7846][local61][3]) * Static190.anInt3603 >> 16) + Static161.anIntArrayArrayArray9[Static435.anInt7846][local61][3];
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(III)V")
	public static void method2963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class3_Sub4_Sub12 local13 = Static556.method8018(14, arg0);
		local13.method3608();
		local13.anInt4062 = arg1;
	}
}
