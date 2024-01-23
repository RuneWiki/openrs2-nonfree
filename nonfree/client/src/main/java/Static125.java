import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
	public static int anInt2702;

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
	public static int anInt2704;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "Lclient!sc;")
	private static Class107 aClass107_732 = Static231.method3737("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "Lclient!sc;")
	public static Class107 aClass107_731 = aClass107_732;

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
	public static int anInt2700 = 0;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
	public static int anInt2701 = 1;

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "Lclient!sc;")
	private static Class107 aClass107_733 = Static231.method3737("Loading fonts )2 ");

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "Lclient!sc;")
	public static Class107 aClass107_734 = Static231.method3737("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "Lclient!sc;")
	public static Class107 aClass107_735 = Static231.method3737("<col=ffffff>");

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "Lclient!sc;")
	public static Class107 aClass107_736 = aClass107_733;

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "[I")
	public static int[] anIntArray242 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "[I")
	public static int[] anIntArray243 = new int[1000];

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIILclient!af;Lclient!af;IIIIJ)V")
	public static void method2097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class46 local6 = new Class46();
		local6.aLong57 = arg10;
		local6.anInt1688 = arg1 * 128 + 64;
		local6.anInt1698 = arg2 * 128 + 64;
		local6.anInt1689 = arg3;
		local6.aClass5_3 = arg4;
		local6.aClass5_2 = arg5;
		local6.anInt1685 = arg6;
		local6.anInt1687 = arg7;
		local6.anInt1692 = arg8;
		local6.anInt1697 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static174.aClass1_Sub9ArrayArrayArray2[local46][arg1][arg2] == null) {
				Static174.aClass1_Sub9ArrayArrayArray2[local46][arg1][arg2] = new Class1_Sub9(local46, arg1, arg2);
			}
		}
		Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2].aClass46_1 = local6;
	}
}
