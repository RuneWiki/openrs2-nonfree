import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!lm", name = "F", descriptor = "J")
	public static long aLong141;

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "[I")
	public static final int[] anIntArray265 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "Lclient!co;")
	public static final Class35 aClass35_3 = new Class35("LOCAL", 4);

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "[I")
	public static final int[] anIntArray266 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!lm", name = "D", descriptor = "I")
	public static int anInt4081 = 0;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIIIIIIZ)V")
	public static void method3458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(11) Class3_Sub14 local11 = null;
		for (@Pc(16) Class3_Sub14 local16 = (Class3_Sub14) Static305.aClass193_49.method4519(); local16 != null; local16 = (Class3_Sub14) Static305.aClass193_49.method4525()) {
			if (arg4 == local16.anInt1621 && local16.anInt1627 == arg0 && local16.anInt1629 == arg2 && arg3 == local16.anInt1619) {
				local11 = local16;
				break;
			}
		}
		if (local11 == null) {
			local11 = new Class3_Sub14();
			local11.anInt1619 = arg3;
			local11.anInt1629 = arg2;
			local11.anInt1621 = arg4;
			local11.anInt1627 = arg0;
			if (arg0 >= 0 && arg2 >= 0 && Static373.anInt6324 > arg0 && Static291.anInt5062 > arg2) {
				Static344.method4827(local11);
			}
			Static305.aClass193_49.method4527(local11);
		}
		local11.anInt1628 = 0;
		local11.anInt1625 = arg1;
		local11.anInt1623 = arg6;
		local11.anInt1620 = arg5;
		local11.anInt1626 = -1;
	}
}
