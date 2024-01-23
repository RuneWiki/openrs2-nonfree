import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "[Z")
	public static boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
	public static int anInt3299;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "Lclient!hi;")
	public static Class66 aClass66_28;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "[I")
	public static int[] anIntArray280;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Z")
	public static boolean aBoolean223;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
	public static int anInt3296 = 0;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "[Lclient!ui;")
	public static Class1_Sub2_Sub22[] aClass1_Sub2_Sub22Array5 = new Class1_Sub2_Sub22[14];

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "F")
	public static float aFloat100 = 0.0F;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "[I")
	public static int[] anIntArray281 = new int[2000];

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIII)V")
	public static void method2848(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == arg1) {
			Static137.method2373(arg1, arg3, arg0, arg2);
		} else if (arg0 - arg1 >= Static29.anInt517 && arg0 + arg1 <= Static11.anInt170 && Static98.anInt2007 <= arg3 - arg4 && arg3 + arg4 <= Static213.anInt4452) {
			Static45.method888(arg3, arg1, arg4, arg0, arg2);
		} else {
			Static165.method2819(arg2, arg1, arg0, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[BI)I")
	public static int method2849(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static102.method1862(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)I")
	public static int method2850(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method2852(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg2; local17++) {
			@Pc(32) int local32 = arg0[arg1 + local17] & 0xFF;
			if (local32 != 0) {
				if (local32 >= 128 && local32 < 160) {
					@Pc(54) char local54 = Static285.aCharArray4[local32 - 128];
					if (local54 == '\u0000') {
						local54 = '?';
					}
					local32 = local54;
				}
				local8[local10++] = (char) local32;
			}
		}
		return new String(local8, 0, local10);
	}
}
