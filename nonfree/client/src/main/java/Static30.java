import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "Lclient!m;")
	public static Class2_Sub1_Sub1_Sub3_Sub2 aClass2_Sub1_Sub1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "[I")
	public static int[] anIntArray86;

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "Lclient!je;")
	private static Class40 aClass40_430 = Static69.method1231("Unable to find ");

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "Lclient!je;")
	public static Class40 aClass40_428 = aClass40_430;

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
	public static int anInt730 = 0;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "[I")
	public static int[] anIntArray84 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "[I")
	public static int[] anIntArray85 = new int[1000];

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "Lclient!je;")
	private static Class40 aClass40_429 = Static69.method1231("Loading fonts )2 ");

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "Lclient!je;")
	public static Class40 aClass40_431 = aClass40_429;

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "[J")
	public static long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public static void method463() {
		anIntArray84 = null;
		anIntArray85 = null;
		aClass40_431 = null;
		aClass40_429 = null;
		aClass40_430 = null;
		aLongArray3 = null;
		aClass40_428 = null;
		anIntArray86 = null;
		aClass2_Sub1_Sub1_Sub3_Sub2_1 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIZ)Lclient!je;")
	public static Class40 method464(@OriginalArg(2) int arg0, @OriginalArg(3) boolean arg1) {
		@Pc(13) int local13 = 1;
		for (@Pc(17) int local17 = arg0 / 10; local17 != 0; local17 /= 10) {
			local13++;
		}
		@Pc(32) int local32 = local13;
		if (arg0 < 0 || arg1) {
			local32 = local13 + 1;
		}
		@Pc(48) byte[] local48 = new byte[local32];
		if (arg0 < 0) {
			local48[0] = 45;
		} else if (arg1) {
			local48[0] = 43;
		}
		for (@Pc(64) int local64 = 0; local64 < local13; local64++) {
			@Pc(70) int local70 = arg0 % 10;
			if (local70 < 0) {
				local70 = -local70;
			}
			if (local70 > 9) {
				local70 += 39;
			}
			arg0 /= 10;
			local48[local32 - local64 - 1] = (byte) (local70 + 48);
		}
		@Pc(112) Class40 local112 = new Class40();
		local112.aByteArray18 = local48;
		local112.anInt1425 = local32;
		return local112;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)Lclient!je;")
	public static Class40 method465(@OriginalArg(1) int arg0) {
		return Static25.aClass40Array1[arg0].method950() <= 0 ? Static45.aClass40Array4[arg0] : Static40.method722(new Class40[] { Static45.aClass40Array4[arg0], Static96.aClass40_1276, Static25.aClass40Array1[arg0] });
	}
}
