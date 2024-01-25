import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "I")
	public static int anInt1782 = 0;

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "Lclient!ou;")
	public static final Class260 aClass260_1 = new Class260();

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZI[B)[B")
	public static byte[] method1486(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[arg0];
		Static598.method774(arg1, 0, local11, 0, arg0);
		return local11;
	}
}
