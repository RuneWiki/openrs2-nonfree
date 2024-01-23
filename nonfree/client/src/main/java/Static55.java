import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!fd", name = "L", descriptor = "[Lclient!ia;")
	public static Class51[] aClass51Array8;

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "[I")
	public static int[] anIntArray79 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "J")
	public static volatile long aLong39 = 0L;

	@OriginalMember(owner = "client!fd", name = "F", descriptor = "Lclient!ie;")
	public static Class53 aClass53_10 = new Class53(50);

	@OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
	public static int anInt1279 = 0;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
	public static void method955(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static54.method933(arg0)) {
			Static7.method100(arg1, Static64.aClass71ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZZZI)Lclient!vb;")
	public static Class70_Sub1 method957(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(15) Class100 local15 = null;
		if (Static85.aClass112_1 != null) {
			local15 = new Class100(arg3, Static85.aClass112_1, Static195.aClass112Array3[arg3], 1000000);
		}
		return new Class70_Sub1(local15, Static42.aClass100_102, arg3, arg2, arg1, arg0);
	}
}
