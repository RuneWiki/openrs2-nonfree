import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLclient!io;)V")
	public static void method7203(@OriginalArg(1) Class177 arg0) {
		Static558.aClass177_2 = arg0;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)V")
	public static void method7204(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub4_Sub2 local9 = Static502.method7211(10, (long) arg0);
		local9.method627();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZI)Z")
	public static boolean method7205(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
