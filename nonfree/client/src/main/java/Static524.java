import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
	public static final int anInt8704 = 52;

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "[B")
	public static final byte[] aByteArray83 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "S")
	public static short aShort82 = 320;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!tia;I)I")
	public static int method7413(@OriginalArg(0) Class5_Sub41_Sub2 arg0) {
		@Pc(15) int local15 = arg0.method7871(2);
		@Pc(22) int local22;
		if (local15 == 0) {
			local22 = 0;
		} else if (local15 == 1) {
			local22 = arg0.method7871(5);
		} else if (local15 == 2) {
			local22 = arg0.method7871(8);
		} else {
			local22 = arg0.method7871(11);
		}
		return local22;
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)V")
	public static void method7414() {
		for (@Pc(10) Class5_Sub3_Sub12 local10 = (Class5_Sub3_Sub12) Static641.aClass114_67.method2805(); local10 != null; local10 = (Class5_Sub3_Sub12) Static641.aClass114_67.method2814()) {
			@Pc(15) Class28_Sub1_Sub4_Sub3 local15 = local10.aClass28_Sub1_Sub4_Sub3_1;
			if (local15.anInt7128 < Static26.anInt350) {
				local10.method9052();
				local15.method5895();
			} else if (local15.anInt7100 <= Static26.anInt350) {
				local15.method5894();
				if (local15.anInt7103 > 0) {
					@Pc(42) Class5_Sub25 local42 = (Class5_Sub25) Static56.aClass300_8.method7188((long) (local15.anInt7103 - 1));
					if (local42 != null) {
						@Pc(47) Class28_Sub1_Sub4_Sub2_Sub1 local47 = local42.aClass28_Sub1_Sub4_Sub2_Sub1_1;
						if (local47.anInt10781 >= 0 && local47.anInt10781 < Static201.anInt3834 * 512 && local47.anInt10784 >= 0 && Static626.anInt10238 * 512 > local47.anInt10784) {
							local15.method5899(Static441.method6444(local15.aByte145, local47.anInt10781, local47.anInt10784) - local15.anInt7130, local47.anInt10784, Static26.anInt350, local47.anInt10781);
						}
					}
				}
				if (local15.anInt7103 < 0) {
					@Pc(98) int local98 = -local15.anInt7103 - 1;
					@Pc(109) Class28_Sub1_Sub4_Sub2_Sub2 local109;
					if (Static216.anInt4046 == local98) {
						local109 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1;
					} else {
						local109 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local98];
					}
					if (local109 != null && local109.anInt10781 >= 0 && local109.anInt10781 < Static201.anInt3834 * 512 && local109.anInt10784 >= 0 && Static626.anInt10238 * 512 > local109.anInt10784) {
						local15.method5899(Static441.method6444(local15.aByte145, local109.anInt10781, local109.anInt10784) - local15.anInt7130, local109.anInt10784, Static26.anInt350, local109.anInt10781);
					}
				}
				local15.method5892(Static290.anInt5659);
				Static308.method4867(local15, true);
			}
		}
	}
}
