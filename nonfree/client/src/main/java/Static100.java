import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!ev", name = "B", descriptor = "[I")
	public static int[] anIntArray40;

	@OriginalMember(owner = "client!ev", name = "K", descriptor = "Lclient!lt;")
	public static Class158 aClass158_8;

	@OriginalMember(owner = "client!ev", name = "F", descriptor = "[[I")
	public static final int[][] anIntArrayArray4 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ev", name = "L", descriptor = "Z")
	public static boolean aBoolean37 = false;

	@OriginalMember(owner = "client!ev", name = "i", descriptor = "(I)V")
	public static void method402() {
		Static300.aClass55_2.method4704();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static116.aLongArray3[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static269.aLongArray7[local24] = 0L;
		}
		Static213.anInt3693 = 0;
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(III)I")
	public static int method403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static266.anIntArray404[arg1 & 0x3] : 256;
	}
}
