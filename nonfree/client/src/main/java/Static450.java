import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!qw", name = "P", descriptor = "I")
	public static int anInt7223;

	@OriginalMember(owner = "client!qw", name = "O", descriptor = "Lclient!co;")
	public static final Class61 aClass61_1 = new Class61();

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IZ[BI)[B")
	public static byte[] method5878(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static598.method4261(arg0, arg1, local6, 0, 32768);
		return local6;
	}
}
