import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
	public static int anInt944;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "Lclient!kf;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_1;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "Lclient!lf;")
	public static Class49 aClass49_483 = Static32.method683("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Lclient!lf;")
	public static Class49 aClass49_484 = Static32.method683(")3");

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "Lclient!lf;")
	public static Class49 aClass49_485 = Static32.method683("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
	public static int anInt943 = 0;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "Lclient!lf;")
	private static Class49 aClass49_487 = Static32.method683("Loaded input handler");

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "Lclient!lf;")
	public static Class49 aClass49_486 = aClass49_487;

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "[I")
	public static int[] anIntArray83 = new int[2000];

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "[I")
	public static int[] anIntArray84 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "[I")
	public static int[] anIntArray85 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "Lclient!lf;")
	public static Class49 aClass49_488 = Static32.method683("<br>(X100(U(Y");

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public static void method764() {
		aClass49_485 = null;
		anIntArray84 = null;
		anIntArray83 = null;
		aClass49_487 = null;
		aClass2_Sub2_Sub2_Sub3_1 = null;
		aClass49_486 = null;
		aClass49_488 = null;
		aClass49_484 = null;
		aClass49_483 = null;
		anIntArray85 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)Z")
	public static boolean method765(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!id;)V")
	public static void method766(@OriginalArg(1) Class2_Sub12 arg0) {
		Static120.method2045(arg0, 200000);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)Lclient!ed;")
	public static Class22 method767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub1 local7 = Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt15; local13++) {
			@Pc(19) Class22 local19 = local7.aClass22Array1[local13];
			if ((local19.aLong41 >> 29 & 0x3L) == 2L && local19.anInt1000 == arg1 && local19.anInt988 == arg2) {
				return local19;
			}
		}
		return null;
	}
}
