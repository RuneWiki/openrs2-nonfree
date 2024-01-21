import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!kc", name = "Y", descriptor = "I")
	public static int anInt2149;

	@OriginalMember(owner = "client!kc", name = "ab", descriptor = "Lclient!ke;")
	public static Class43 aClass43_23;

	@OriginalMember(owner = "client!kc", name = "P", descriptor = "Lclient!sg;")
	public static Class77 aClass77_849 = Static146.method2172("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!kc", name = "V", descriptor = "Lclient!sg;")
	private static Class77 aClass77_851 = Static146.method2172("shake:");

	@OriginalMember(owner = "client!kc", name = "R", descriptor = "Lclient!sg;")
	public static Class77 aClass77_850 = aClass77_851;

	@OriginalMember(owner = "client!kc", name = "W", descriptor = "Lclient!sg;")
	public static Class77 aClass77_852 = aClass77_851;

	@OriginalMember(owner = "client!kc", name = "Z", descriptor = "I")
	public static int anInt2150 = 0;

	@OriginalMember(owner = "client!kc", name = "bb", descriptor = "[Lclient!qd;")
	public static Class43_Sub1[] aClass43_Sub1Array1 = new Class43_Sub1[256];

	@OriginalMember(owner = "client!kc", name = "cb", descriptor = "[I")
	public static int[] anIntArray358 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
	public static void method1511() {
		aClass77_852 = null;
		aClass77_849 = null;
		anIntArray358 = null;
		aClass77_850 = null;
		aClass43_Sub1Array1 = null;
		aClass77_851 = null;
		aClass43_23 = null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)V")
	public static void method1512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class66 local8 = Static105.method1835(arg1, arg0);
		if (local8 != null && local8.anObjectArray8 != null) {
			@Pc(21) Class2_Sub21 local21 = new Class2_Sub21();
			local21.anObjectArray29 = local8.anObjectArray8;
			local21.aClass66_14 = local8;
			Static150.method2565(local21);
		}
		Static117.anInt2916 = arg1;
		Static11.anInt307 = arg2;
		Static6.anInt174 = arg0;
		Static16.aBoolean25 = true;
		Static57.method2994(local8);
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)Z")
	public static boolean method1514() {
		return Static176.anInt4481 == 0 ? Static136.aClass2_Sub9_Sub3_1.method2490() : true;
	}
}
