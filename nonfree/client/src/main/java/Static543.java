import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!uv", name = "x", descriptor = "[I")
	public static int[] anIntArray570 = new int[2];

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IBI)Lclient!vf;")
	public static Class3_Sub7_Sub18 method7218(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) Class3_Sub7_Sub18 local22 = (Class3_Sub7_Sub18) Static316.aClass354_26.method7689((long) arg0 << 32 | (long) arg1);
		if (local22 == null) {
			local22 = new Class3_Sub7_Sub18(arg0, arg1);
			Static316.aClass354_26.method7691(local22, local22.aLong273);
		}
		return local22;
	}
}
