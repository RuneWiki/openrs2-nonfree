import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!sm", name = "P", descriptor = "I")
	public static int anInt5286;

	@OriginalMember(owner = "client!sm", name = "S", descriptor = "I")
	public static int anInt5288;

	@OriginalMember(owner = "client!sm", name = "W", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!sm", name = "L", descriptor = "[C")
	public static char[] aCharArray36 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!sm", name = "M", descriptor = "[I")
	public static int[] anIntArray553 = new int[500];

	@OriginalMember(owner = "client!sm", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString188 = "Loaded title screen";

	@OriginalMember(owner = "client!sm", name = "O", descriptor = "Z")
	public static boolean aBoolean366 = false;

	@OriginalMember(owner = "client!sm", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString189 = "slide:";

	@OriginalMember(owner = "client!sm", name = "U", descriptor = "Lclient!l;")
	public static Class98 aClass98_42 = new Class98(4);

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "(II)I")
	public static int method4335(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "(I)V")
	public static void method4336() {
		if (Static87.aBoolean314) {
			return;
		}
		Static87.aBoolean314 = true;
		if (Static247.aBoolean348) {
			Static84.aFloat21 = (int) Static84.aFloat21 + 191 & 0xFFFFFF80;
		} else {
			Static199.aFloat53 += (24.0F - Static199.aFloat53) / 2.0F;
		}
		Static153.aBoolean205 = true;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILjava/lang/String;IIILclient!bi;ILclient!rg;II)V")
	public static void method4337(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3_Sub4_Sub2 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class151 arg7, @OriginalArg(9) int arg8) {
		@Pc(13) int local13;
		if (Static25.anInt467 == 4) {
			local13 = (int) Static84.aFloat21 & 0x7FF;
		} else {
			local13 = (int) Static84.aFloat21 + Static241.anInt4889 & 0x7FF;
		}
		@Pc(34) int local34 = Math.max(arg7.anInt4773 / 2, arg7.anInt4751 / 2) + 10;
		@Pc(42) int local42 = arg6 * arg6 + arg8 * arg8;
		if (local42 > local34 * local34) {
			return;
		}
		@Pc(52) int local52 = Class11.anIntArray26[local13];
		@Pc(56) int local56 = Class11.anIntArray27[local13];
		if (Static25.anInt467 != 4) {
			local52 = local52 * 256 / (Static125.anInt2421 + 256);
			local56 = local56 * 256 / (Static125.anInt2421 + 256);
		}
		@Pc(80) int local80 = arg5.method3688(arg1, 100);
		@Pc(86) int local86 = arg5.method3693(arg1);
		@Pc(96) int local96 = local52 * arg6 + local56 * arg8 >> 16;
		@Pc(102) int local102 = local96 - local80 / 2;
		@Pc(113) int local113 = local56 * arg6 - arg8 * local52 >> 16;
		if (-arg7.anInt4773 > local102 || local102 > arg7.anInt4773 || local113 < -arg7.anInt4751 || local113 > arg7.anInt4751) {
			return;
		}
		if (Static283.aBoolean393) {
			Static234.method3977((Class3_Sub4_Sub12_Sub1) arg7.method4000(false));
		} else {
			Static143.method2456(arg7.anIntArray509, arg7.anIntArray523);
		}
		arg5.method3711(arg1, arg7.anInt4773 / 2 + arg3 + local102, -local86 + -arg2 + -local113 + arg7.anInt4751 / 2 + arg4, local80, 50, arg0, 0, 1, 0, 0);
		if (Static283.aBoolean393) {
			Static234.method3967();
		} else {
			Static143.method2444();
		}
	}
}
