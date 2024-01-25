import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!jia", name = "n", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_58 = new Class185(1, -1);

	@OriginalMember(owner = "client!jia", name = "x", descriptor = "Lclient!fha;")
	public static final Class101 aClass101_13 = new Class101(3, 2);

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(II[BB)[B")
	public static byte[] method4845(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(14) byte[] local14 = new byte[32768];
		Static653.method6537(arg1, arg0, local14, 0, 32768);
		return local14;
	}
}
