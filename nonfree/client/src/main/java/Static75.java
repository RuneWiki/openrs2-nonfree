import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!he", name = "o", descriptor = "I")
	public static int anInt1838;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "Lclient!kh;")
	public static Class60 aClass60_582 = Static200.method3116("welle2:");

	@OriginalMember(owner = "client!he", name = "k", descriptor = "Lclient!kh;")
	private static Class60 aClass60_587 = Static200.method3116("Service unavailable)3");

	@OriginalMember(owner = "client!he", name = "c", descriptor = "Lclient!kh;")
	public static Class60 aClass60_583 = aClass60_587;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "Z")
	public static boolean aBoolean98 = false;

	@OriginalMember(owner = "client!he", name = "e", descriptor = "Lclient!kh;")
	public static Class60 aClass60_584 = Static200.method3116("blinken3:");

	@OriginalMember(owner = "client!he", name = "q", descriptor = "Lclient!kh;")
	private static Class60 aClass60_589 = Static200.method3116("Close");

	@OriginalMember(owner = "client!he", name = "h", descriptor = "Lclient!kh;")
	public static Class60 aClass60_585 = aClass60_589;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "Lclient!kh;")
	public static Class60 aClass60_586 = Static200.method3116("Speicher wird zugewiesen)3");

	@OriginalMember(owner = "client!he", name = "l", descriptor = "Lclient!kh;")
	public static Class60 aClass60_588 = Static200.method3116("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!he", name = "m", descriptor = "I")
	public static int anInt1836 = 0;

	@OriginalMember(owner = "client!he", name = "u", descriptor = "[I")
	public static int[] anIntArray213 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	public static void method1348() {
		@Pc(14) int local14;
		for (@Pc(7) int local7 = -1; local7 < Static205.anInt4356; local7++) {
			if (local7 == -1) {
				local14 = 2047;
			} else {
				local14 = Static124.anIntArray353[local7];
			}
			@Pc(24) Class9_Sub4_Sub1 local24 = Static41.aClass9_Sub4_Sub1Array2[local14];
			if (local24 != null && local24.anInt3900 > 0) {
				local24.anInt3900--;
				if (local24.anInt3900 == 0) {
					local24.aClass60_1328 = null;
				}
			}
		}
		for (local14 = 0; local14 < Static56.anInt1482; local14++) {
			@Pc(63) int local63 = Static19.anIntArray73[local14];
			@Pc(67) Class9_Sub4_Sub2 local67 = Static1.aClass9_Sub4_Sub2Array1[local63];
			if (local67 != null && local67.anInt3900 > 0) {
				local67.anInt3900--;
				if (local67.anInt3900 == 0) {
					local67.aClass60_1328 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!ai;Lclient!ai;I)V")
	public static void method1349(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7 arg1) {
		Static16.aClass7_4 = arg1;
		Static206.aClass7_39 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method1350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(18) int local18 = Static107.method1863(Static141.anInt3163, arg0, Static200.anInt4273);
		@Pc(24) int local24 = Static107.method1863(Static141.anInt3163, arg3, Static200.anInt4273);
		@Pc(30) int local30 = Static107.method1863(Static214.anInt4572, arg1, Static130.anInt2847);
		@Pc(36) int local36 = Static107.method1863(Static214.anInt4572, arg5, Static130.anInt2847);
		@Pc(44) int local44 = Static107.method1863(Static141.anInt3163, arg4 + arg0, Static200.anInt4273);
		@Pc(53) int local53 = Static107.method1863(Static141.anInt3163, arg3 - arg4, Static200.anInt4273);
		for (@Pc(55) int local55 = local18; local55 < local44; local55++) {
			Static104.method1768(local30, local36, arg6, Static148.anIntArrayArray78[local55]);
		}
		for (@Pc(73) int local73 = local24; local73 > local53; local73--) {
			Static104.method1768(local30, local36, arg6, Static148.anIntArrayArray78[local73]);
		}
		@Pc(97) int local97 = Static107.method1863(Static214.anInt4572, arg1 + arg4, Static130.anInt2847);
		@Pc(105) int local105 = Static107.method1863(Static214.anInt4572, arg5 - arg4, Static130.anInt2847);
		for (@Pc(107) int local107 = local44; local107 <= local53; local107++) {
			@Pc(113) int[] local113 = Static148.anIntArrayArray78[local107];
			Static104.method1768(local30, local97, arg6, local113);
			Static104.method1768(local97, local105, arg2, local113);
			Static104.method1768(local105, local36, arg6, local113);
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)Lclient!ch;")
	public static Class1_Sub1_Sub6 method1351() {
		@Pc(13) int local13 = Static181.anIntArray504[0] * Static10.anIntArray46[0];
		@Pc(16) int[] local16 = new int[local13];
		@Pc(20) byte[] local20 = Static96.aByteArrayArray4[0];
		for (@Pc(22) int local22 = 0; local22 < local13; local22++) {
			local16[local22] = Static110.anIntArray317[local20[local22] & 0xFF];
		}
		@Pc(61) Class1_Sub1_Sub6_Sub1 local61 = new Class1_Sub1_Sub6_Sub1(Static97.anInt2261, Static176.anInt777, Static91.anIntArray251[0], Static97.anIntArray263[0], Static181.anIntArray504[0], Static10.anIntArray46[0], local16);
		Static43.method711();
		return local61;
	}
}
