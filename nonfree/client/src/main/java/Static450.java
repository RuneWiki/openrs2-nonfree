import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!wq", name = "u", descriptor = "F")
	public static float aFloat96;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BI)I")
	public static int method6018(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static305.method4368(arg0);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)I")
	public static int method6019() {
		@Pc(10) Class83 local10 = Static92.aClass83_14;
		synchronized (Static92.aClass83_14) {
			return Static92.aClass83_14.method1674();
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "([SBI)[S")
	public static short[] method6023(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static460.method4218(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
