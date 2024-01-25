import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!to", name = "e", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "[B")
	public static final byte[] aByteArray86 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

	@OriginalMember(owner = "client!to", name = "b", descriptor = "Lclient!ae;")
	public static final Class8 aClass8_60 = new Class8();

	@OriginalMember(owner = "client!to", name = "g", descriptor = "I")
	public static int anInt8580 = 0;

	@OriginalMember(owner = "client!to", name = "h", descriptor = "I")
	public static int anInt8581 = 0;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIB)Z")
	public static boolean method7138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!qda;Z)Z")
	public static boolean method7139(@OriginalArg(0) Class6_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static421.aClass67Array7 == Static592.aClass67Array4;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method6152();
		if (arg0.aShort85 < 0 || arg0.aShort83 < 0 || arg0.aShort86 >= Static496.anInt8369 || arg0.aShort84 >= Static357.anInt6390) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort85; local36 <= arg0.aShort86; local36++) {
			for (local40 = arg0.aShort83; local40 <= arg0.aShort84; local40++) {
				@Pc(47) Class346 local47 = Static308.method4598(arg0.aByte112, local36, local40);
				if (local47 != null) {
					@Pc(53) Class153 local53 = Static571.method7716(arg0);
					@Pc(56) Class153 local56 = local47.aClass153_3;
					if (local56 == null) {
						local47.aClass153_3 = local53;
					} else {
						while (local56.aClass153_1 != null) {
							local56 = local56.aClass153_1;
						}
						local56.aClass153_1 = local53;
					}
					if (local6 && (Static381.anIntArrayArray44[local36][local40] & 0xFF000000) != 0) {
						local8 = Static381.anIntArrayArray44[local36][local40];
						local10 = Static544.aShortArrayArray33[local36][local40];
						local12 = Static435.aByteArrayArray2[local36][local40];
					}
					if (!arg1 && local47.aClass6_Sub1_Sub2_1 != null && local47.aClass6_Sub1_Sub2_1.aShort96 > local33) {
						local33 = local47.aClass6_Sub1_Sub2_1.aShort96;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort85; local40 <= arg0.aShort86; local40++) {
				for (@Pc(136) int local136 = arg0.aShort83; local136 <= arg0.aShort84; local136++) {
					if ((Static381.anIntArrayArray44[local40][local136] & 0xFF000000) == 0) {
						Static381.anIntArrayArray44[local40][local136] = local8;
						Static544.aShortArrayArray33[local40][local136] = local10;
						Static435.aByteArrayArray2[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static497.aClass6_Sub1_Sub1Array1[Static2.anInt11++] = arg0;
		} else {
			local40 = Static421.aClass67Array7 == Static592.aClass67Array4 ? 1 : 0;
			if (!arg0.method7329()) {
				Static54.aClass6_Sub1ArrayArray2[local40][Static53.anIntArray64[local40]++] = arg0;
			} else if (arg0.method7318()) {
				Static312.aClass6_Sub1ArrayArray3[local40][Static142.anIntArray179[local40]++] = arg0;
			} else {
				Static3.aClass6_Sub1ArrayArray1[local40][Static26.anIntArray39[local40]++] = arg0;
			}
		}
		if (arg1) {
			arg0.anInt8759 -= local33;
		}
		return true;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIII)V")
	public static void method7140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) Class246[] local7 = Static134.aClass246Array1;
		for (@Pc(14) int local14 = 0; local14 < local7.length; local14++) {
			@Pc(20) Class246 local20 = local7[local14];
			if (local20 != null && local20.anInt6838 == 2) {
				Static213.method3440(local20.anInt6849, arg0 >> 1, local20.anInt6844, arg1 >> 1, local20.anInt6840 * 2, local20.anInt6850);
				if (Static318.anIntArray418[0] > -1 && Static412.anInt575 % 20 < 10) {
					Static568.aClass39Array19[local20.anInt6839].method7851(Static318.anIntArray418[0] + arg3 - 12, arg2 - -Static318.anIntArray418[1] + -28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(III)V")
	public static void method7142(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub3_Sub13 local8 = Static382.method5650(12, arg1);
		local8.method6098();
		local8.anInt7258 = arg0;
	}
}
