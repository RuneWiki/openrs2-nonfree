import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
	public static int anInt2068;

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "Lclient!dr;")
	public static Class73 aClass73_41;

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
	public static int anInt2079;

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_42 = new Class73(93, 8);

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "[B")
	public static final byte[] aByteArray10 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;ZJZ)V")
	public static void method1925(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2) {
		if (arg1) {
			Static1.method7670();
			if (Static4.aString3.equals("")) {
				Static119.anInt2844 = 39;
				return;
			}
		}
		@Pc(19) Class6_Sub21 local19 = new Class6_Sub21(576);
		local19.method6062(10);
		local19.method6052((int) (Math.random() * 65535.0D));
		local19.method6019(arg2);
		local19.method6052(arg1 ? Static175.anInt3692 : Static488.anInt5164);
		local19.method6022(arg0);
		local19.method6019(arg1 ? Static91.aLong54 : Static358.aLong177);
		if (arg1) {
			local19.method6019(Static568.method7610(Static4.aString3));
			try {
				local19.method6019(Long.parseLong(Static547.aString100));
			} catch (@Pc(103) Exception local103) {
				Static119.anInt2844 = 39;
				return;
			}
		} else {
			local19.method6033((int) (Math.random() * 9.9999999E7D));
			local19.method6033((int) (Math.random() * 9.9999999E7D));
			local19.method6033((int) (Math.random() * 9.9999999E7D));
			local19.method6033((int) (Math.random() * 9.9999999E7D));
		}
		local19.method6033((int) (Math.random() * 9.9999999E7D));
		local19.method6070(Static228.aBigInteger3, Static289.aBigInteger9);
		@Pc(121) Class6_Sub31 local121 = Static313.method4898();
		local121.aClass6_Sub21_Sub2_2.method6062(arg1 ? Static530.aClass46_12.anInt1234 : Static530.aClass46_9.anInt1234);
		local121.aClass6_Sub21_Sub2_2.method6052(local19.anInt7338 + 28);
		local121.aClass6_Sub21_Sub2_2.method6052(616);
		local121.aClass6_Sub21_Sub2_2.method6062(Static25.anInt769);
		local121.aClass6_Sub21_Sub2_2.method6062(Static317.aClass37_3.anInt1063);
		Static443.method6302(local121.aClass6_Sub21_Sub2_2);
		local121.aClass6_Sub21_Sub2_2.method6063(local19.aByteArray93, local19.anInt7338);
		Static534.method7251(local121);
		Static573.anInt9416 = 1;
		Static309.anInt5671 = 0;
		Static119.anInt2844 = -3;
		Static238.anInt7765 = 0;
	}
}
