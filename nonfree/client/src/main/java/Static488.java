import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!uca", name = "l", descriptor = "[Lclient!ld;")
	public static final Class184[] aClass184Array4 = new Class184[4];

	@OriginalMember(owner = "client!uca", name = "s", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_54 = new Class236(63, -1);

	@OriginalMember(owner = "client!uca", name = "z", descriptor = "I")
	public static int anInt6246 = 0;

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(I[BI)[B")
	public static byte[] method5186(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[arg0];
		Static553.method2534(arg1, 0, local11, 0, arg0);
		return local11;
	}
}
