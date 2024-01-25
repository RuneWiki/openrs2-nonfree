import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static613 {

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Lclient!wc;")
	public static Class397 aClass397_166 = new Class397(74, 8);

	@OriginalMember(owner = "client!td", name = "e", descriptor = "Lclient!fr;")
	public static final Class123 aClass123_12 = new Class123(14, 0, 4, 1);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIII)V")
	public static void method7849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = arg5 - arg4;
		@Pc(14) int local14 = arg4 + arg2;
		for (@Pc(16) int local16 = arg2; local16 < local14; local16++) {
			Static202.method3077(Static118.anIntArrayArray7[local16], arg1, arg0, arg3);
		}
		@Pc(37) int local37 = arg3 - arg4;
		@Pc(42) int local42 = arg1 + arg4;
		for (@Pc(44) int local44 = arg5; local44 > local10; local44--) {
			Static202.method3077(Static118.anIntArrayArray7[local44], arg1, arg0, arg3);
		}
		if (40000 != 40000) {
			aClass397_166 = null;
		}
		for (@Pc(79) int local79 = local14; local79 <= local10; local79++) {
			@Pc(85) int[] local85 = Static118.anIntArrayArray7[local79];
			Static202.method3077(local85, arg1, arg0, local42);
			Static202.method3077(local85, local37, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIILclient!ik;)Lclient!hw;")
	public static Class169 method7850(@OriginalArg(2) int arg0, @OriginalArg(3) Class182 arg1) {
		@Pc(15) byte[] local15 = arg1.method3985(0, arg0);
		return local15 == null ? null : new Class169(local15);
	}
}
