import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!ow", name = "k", descriptor = "I")
	public static int anInt6299;

	@OriginalMember(owner = "client!ow", name = "s", descriptor = "[I")
	public static int[] anIntArray641;

	@OriginalMember(owner = "client!ow", name = "e", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_74 = new Class306("M", "M", "M", "M");

	@OriginalMember(owner = "client!ow", name = "q", descriptor = "Lclient!bn;")
	public static final Class31 aClass31_10 = new Class31(2, 4, 4, 0);

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(II)I")
	public static int method5329(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(ZLclient!jj;)I")
	public static int method5334(@OriginalArg(1) Class1_Sub6_Sub2 arg0) {
		@Pc(10) int local10 = arg0.method3976(2);
		@Pc(26) int local26;
		if (local10 == 0) {
			local26 = 0;
		} else if (local10 == 1) {
			local26 = arg0.method3976(5);
		} else if (local10 == 2) {
			local26 = arg0.method3976(8);
		} else {
			local26 = arg0.method3976(11);
		}
		return local26;
	}
}
