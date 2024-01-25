import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!qj", name = "u", descriptor = "[I")
	public static int[] anIntArray612;

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "Lclient!db;")
	public static final Class64 aClass64_353 = new Class64(66, 1);

	@OriginalMember(owner = "client!qj", name = "t", descriptor = "[B")
	public static final byte[] aByteArray102 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

	@OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
	public static int anInt7462 = -1;

	@OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
	public static int anInt7463 = 0;

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(BZ)V")
	public static void method6179(@OriginalArg(1) boolean arg0) {
		Static252.method4233(arg0, Static249.anInt4945, Static2.anInt29, Static19.anInt390);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIZLjava/lang/String;BLjava/lang/String;Z)V")
	public static void method6180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) boolean arg5) {
		Static478.aClass31_103.anInt775 = 1;
		@Pc(11) String local11 = arg4.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg1 != -1) {
			@Pc(27) Class59 local27 = Static53.aClass152_1.method3679(arg1);
			if (local27 == null || local27.method1335() != arg2) {
				return;
			}
			if (local27.method1335()) {
				local18 = local27.aString17;
			} else {
				local16 = local27.anInt1575;
			}
		}
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < Static195.aClass99_1.anInt3088; local55++) {
			@Pc(62) Class222 local62 = Static195.aClass99_1.method2798(local55);
			if ((!arg5 || local62.aBoolean433) && local62.anInt5784 == -1 && local62.anInt5806 == -1 && local62.anInt5775 == 0 && local62.aString72.toLowerCase().indexOf(local11) != -1) {
				if (arg1 != -1) {
					if (arg2) {
						if (!arg3.equals(local62.method4920(arg1, local18))) {
							continue;
						}
					} else if (arg0 != local62.method4922(arg1, local16)) {
						continue;
					}
				}
				if (local53 >= 250) {
					Static3.anInt32 = -1;
					Static556.aShortArray132 = null;
					return;
				}
				if (local14.length <= local53) {
					@Pc(139) short[] local139 = new short[local14.length * 2];
					for (@Pc(141) int local141 = 0; local141 < local53; local141++) {
						local139[local141] = local14[local141];
					}
					local14 = local139;
				}
				local14[local53++] = (short) local55;
			}
		}
		Static178.anInt3781 = 0;
		Static3.anInt32 = local53;
		Static556.aShortArray132 = local14;
		@Pc(183) String[] local183 = new String[Static3.anInt32];
		for (@Pc(185) int local185 = 0; local185 < Static3.anInt32; local185++) {
			local183[local185] = Static195.aClass99_1.method2798(local14[local185]).aString72;
		}
		Static367.method6855(local183, Static556.aShortArray132);
		Static478.aClass31_103.method660();
		Static478.aClass31_103.anInt775 = 2;
	}
}
