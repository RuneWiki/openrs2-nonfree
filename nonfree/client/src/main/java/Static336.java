import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!lt", name = "o", descriptor = "I")
	public static int anInt5883;

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray66 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(III)I")
	public static int method5096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static365.anIntArray412[arg1 & 0x3] : Static433.anIntArray483[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "([I[IILclient!bi;ZI)Lclient!kia;")
	public static Class1_Sub2 method5099(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class13_Sub2 arg3, @OriginalArg(5) int arg4) {
		@Pc(15) byte[] local15 = new byte[arg4 * arg2];
		for (@Pc(17) int local17 = 0; local17 < arg2; local17++) {
			@Pc(27) int local27 = arg4 * local17 + arg1[local17];
			for (@Pc(29) int local29 = 0; local29 < arg0[local17]; local29++) {
				local15[local27++] = -1;
			}
		}
		return new Class1_Sub2(arg3, arg4, arg2, local15);
	}
}
