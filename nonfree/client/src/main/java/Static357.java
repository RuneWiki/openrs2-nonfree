import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!kt", name = "kc", descriptor = "[Lclient!fca;")
	public static Class108[] aClass108Array6;

	@OriginalMember(owner = "client!kt", name = "jc", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_88 = new Class144(21, 8);

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I[BII)[B")
	public static byte[] method7482(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) byte[] local12 = new byte[32768];
		Static732.method6320(arg0, arg1, local12, 0, 32768);
		return local12;
	}
}
