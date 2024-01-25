import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!es", name = "a", descriptor = "Lclient!mba;")
	public static final Class216 aClass216_21 = new Class216();

	@OriginalMember(owner = "client!es", name = "e", descriptor = "[B")
	public static final byte[] aByteArray28 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ILclient!ua;)V")
	public static void method2379(@OriginalArg(1) Class9_Sub10 arg0) {
		arg0.aClass9_Sub2_22 = null;
		@Pc(12) int local12 = arg0.aClass9_Sub5Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass9_Sub5Array1[local14].aBoolean433 = false;
		}
		@Pc(32) Class139[] local32 = Class66_Sub1.aClass139Array1;
		synchronized (Class66_Sub1.aClass139Array1) {
			if (local12 < Class66_Sub1.aClass139Array1.length && Static55.anIntArray64[local12] < 200) {
				Class66_Sub1.aClass139Array1[local12].method3203(arg0);
				@Pc(59) int local59 = Static55.anIntArray64[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ZIZILjava/lang/String;JBZIJIILjava/lang/String;)V")
	public static void method2380(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) long arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) long arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) String arg11) {
		if (!Static253.aBoolean362 && Static285.anInt7798 < 500) {
			@Pc(18) int local18 = arg1 == -1 ? Static80.anInt1600 : arg1;
			@Pc(34) Class3_Sub7_Sub19 local34 = new Class3_Sub7_Sub19(arg11, arg4, local18, arg10, arg3, arg8, arg9, arg7, arg0, arg2, arg5, arg6);
			Static378.method5963(local34);
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V")
	public static void method2381() {
		Static129.aClass153Array1 = new Class153[1000];
		Static292.anInt5626 = 0;
		Static414.anInt7270 = 0;
		Static454.anIntArrayArrayArray24 = new int[Static603.anInt9778][Static573.anInt6750 + 1][Static547.anInt9143 + 1];
		Static23.anInt340 = 0;
		Static161.anInt2907 = Static188.anInt3555;
		Static291.aClass153Array2 = new Class153[500];
		Static473.aClass153Array4 = new Class153[2000];
		Static609.anInt9813 = Static188.anInt3555;
		Static576.anInt9431 = 0;
		Static382.aClass153Array3 = new Class153[500];
		Static365.aBoolean485 = false;
		if (Static568.aClass82_14 instanceof oa) {
			Static480.aBoolean590 = false;
		} else {
			Static480.aBoolean590 = true;
		}
	}
}
