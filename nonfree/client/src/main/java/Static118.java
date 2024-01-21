import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!nb", name = "S", descriptor = "I")
	public static int anInt2619;

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1028 = null;

	@OriginalMember(owner = "client!nb", name = "P", descriptor = "I")
	public static int anInt2616 = 0;

	@OriginalMember(owner = "client!nb", name = "T", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1029 = Static120.method1824("<col=c0ff00>");

	@OriginalMember(owner = "client!nb", name = "W", descriptor = "[I")
	public static final int[] anIntArray337 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!nb", name = "X", descriptor = "Lclient!of;")
	public static final Class70 aClass70_14 = new Class70();

	@OriginalMember(owner = "client!nb", name = "Y", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1030 = Static120.method1824("Members object");

	@OriginalMember(owner = "client!nb", name = "Z", descriptor = "[Lclient!rd;")
	public static final Class80[] aClass80Array18 = new Class80[100];

	@OriginalMember(owner = "client!nb", name = "ab", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1031 = aClass80_1030;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ob;III)V")
	public static void method1808(@OriginalArg(0) Class3_Sub1_Sub5_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class3_Sub15 local12;
		@Pc(27) Class3_Sub1_Sub5_Sub5 local27;
		if (arg2 < Static64.anInt1390) {
			local12 = Static185.aClass3_Sub15ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass13_1 != null && local12.aClass13_1.aClass3_Sub1_Sub5_2 instanceof Class3_Sub1_Sub5_Sub5) {
				local27 = (Class3_Sub1_Sub5_Sub5) local12.aClass13_1.aClass3_Sub1_Sub5_2;
				Static127.method1888(arg0, local27, 128, 0, 0, true);
			}
		}
		if (arg3 < Static64.anInt1390) {
			local12 = Static185.aClass3_Sub15ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass13_1 != null && local12.aClass13_1.aClass3_Sub1_Sub5_2 instanceof Class3_Sub1_Sub5_Sub5) {
				local27 = (Class3_Sub1_Sub5_Sub5) local12.aClass13_1.aClass3_Sub1_Sub5_2;
				Static127.method1888(arg0, local27, 0, 0, 128, true);
			}
		}
		if (arg2 < Static64.anInt1390 && arg3 < Static49.anInt1086) {
			local12 = Static185.aClass3_Sub15ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass13_1 != null && local12.aClass13_1.aClass3_Sub1_Sub5_2 instanceof Class3_Sub1_Sub5_Sub5) {
				local27 = (Class3_Sub1_Sub5_Sub5) local12.aClass13_1.aClass3_Sub1_Sub5_2;
				Static127.method1888(arg0, local27, 128, 0, 128, true);
			}
		}
		if (arg2 >= Static64.anInt1390 || arg3 <= 0) {
			return;
		}
		local12 = Static185.aClass3_Sub15ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local12 != null && local12.aClass13_1 != null && local12.aClass13_1.aClass3_Sub1_Sub5_2 instanceof Class3_Sub1_Sub5_Sub5) {
			local27 = (Class3_Sub1_Sub5_Sub5) local12.aClass13_1.aClass3_Sub1_Sub5_2;
			Static127.method1888(arg0, local27, 128, 0, -128, true);
		}
	}
}
