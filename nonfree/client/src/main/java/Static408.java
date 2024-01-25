import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "[I")
	public static int[] anIntArray407;

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIZ)I")
	public static int method5959(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class5_Sub31 local10 = Static93.method1470(arg2, arg1);
		if (local10 == null) {
			return -1;
		} else if (arg0 >= 0 && local10.anIntArray328.length > arg0) {
			return local10.anIntArray328[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)V")
	public static void method5960() {
		@Pc(13) Class5_Sub41 local13 = Static647.method8905(Static73.aClass381_35, Static4.aClass389_17.aClass393_2);
		local13.aClass5_Sub36_Sub2_1.method7287(Static682.anInt10922);
		Static4.aClass389_17.method9079(local13);
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IZ)V")
	public static void method5961(@OriginalArg(0) int arg0) {
		@Pc(14) Class5_Sub1_Sub18 local14 = Static123.method1827((long) arg0, 11);
		local14.method7444();
	}
}
