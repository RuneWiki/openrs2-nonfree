import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
	public static int anInt3593;

	@OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
	public static int anInt3600;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "[B")
	public static final byte[] aByteArray48 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
	public static int anInt3595 = 1;

	@OriginalMember(owner = "client!gm", name = "j", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_70 = new Class44(129, 8);

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "()V")
	public static void method2993() {
		for (@Pc(1) int local1 = 0; local1 < Static585.anInt10026; local1++) {
			@Pc(6) Class12_Sub2_Sub2 local6 = Static217.aClass12_Sub2_Sub2Array1[local1];
			Static255.method3741(local6, true);
			Static217.aClass12_Sub2_Sub2Array1[local1] = null;
		}
		Static585.anInt10026 = 0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BII)Z")
	public static boolean method2994(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!pha;II)Lclient!fi;")
	public static Class14_Sub3_Sub8 method2995(@OriginalArg(0) int arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg2 << 10 | arg1.anInt7974;
		@Pc(19) Class14_Sub3_Sub8 local19 = (Class14_Sub3_Sub8) Static93.aClass57_9.method1424((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(36) byte[] local36 = Static366.aClass386_85.method9192(Static366.aClass386_85.method9187(local10));
		if (local36 == null) {
			local10 = arg1.anInt7974 | arg0 + 65536 << 10;
			local19 = (Class14_Sub3_Sub8) Static93.aClass57_9.method1424((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local36 = Static366.aClass386_85.method9192(Static366.aClass386_85.method9187(local10));
			if (local36 == null) {
				local10 = arg1.anInt7974 | 0x3FFFC00;
				local19 = (Class14_Sub3_Sub8) Static93.aClass57_9.method1424((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local36 = Static366.aClass386_85.method9192(Static366.aClass386_85.method9187(local10));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static414.method6184(local36);
					} catch (@Pc(194) Exception local194) {
						throw new RuntimeException(local194.getMessage() + " S: " + local10);
					}
					local19.aClass276_7 = arg1;
					Static93.aClass57_9.method1422(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local36.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static414.method6184(local36);
				} catch (@Pc(124) Exception local124) {
					throw new RuntimeException(local124.getMessage() + " S: " + local10);
				}
				local19.aClass276_7 = arg1;
				Static93.aClass57_9.method1422(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static414.method6184(local36);
			} catch (@Pc(50) Exception local50) {
				throw new RuntimeException(local50.getMessage() + " S: " + local10);
			}
			local19.aClass276_7 = arg1;
			Static93.aClass57_9.method1422(local19, (long) local10 << 16);
			return local19;
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method3000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class58 local7 = Static486.aClass58ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class43 local13 = local7.aClass43_4; local13 != null; local13 = local13.aClass43_3) {
			@Pc(17) Class12_Sub2_Sub2 local17 = local13.aClass12_Sub2_Sub2_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort111 == arg1 && local17.aShort110 == arg2) {
				Static255.method3741(local17, false);
				return;
			}
		}
	}
}
