import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "[Lclient!xa;")
	public static Class37[] aClass37Array1;

	@OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
	public static final int anInt1567 = 1407;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(CILjava/lang/String;)I")
	public static int method1557(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg1.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (arg0 == arg1.charAt(local10)) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIII)V")
	public static void method1558(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(9) Class357[] local9 = Static516.aClass357Array3;
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(16) Class357 local16 = local9[local11];
			if (local16 != null && local16.anInt10299 == 2) {
				Static479.method7343(arg1 >> 1, arg3 >> 1, local16.anInt10303, local16.anInt10298, local16.anInt10301 * 2, local16.anInt10300);
				if (Static580.anIntArray664[0] > -1 && Static129.anInt10429 % 20 < 10) {
					Static78.aClass37Array3[local16.anInt10304].method7076(arg0 + Static580.anIntArray664[0] - 12, arg2 + (Static580.anIntArray664[1] - 28));
				}
			}
		}
	}
}
