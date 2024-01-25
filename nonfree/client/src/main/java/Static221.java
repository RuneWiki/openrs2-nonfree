import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!of", name = "q", descriptor = "I")
	public static int anInt4363;

	@OriginalMember(owner = "client!of", name = "t", descriptor = "Lclient!qj;")
	public static Class165 aClass165_69;

	@OriginalMember(owner = "client!of", name = "w", descriptor = "I")
	public static int anInt4366;

	@OriginalMember(owner = "client!of", name = "p", descriptor = "[I")
	public static final int[] anIntArray557 = new int[13];

	@OriginalMember(owner = "client!of", name = "v", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[100];

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Lclient!u;")
	public static Class202 method4034(@OriginalArg(0) int arg0) {
		@Pc(10) Class202 local10 = (Class202) Static190.aClass140_99.method3816((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static56.aClass165_21.method4508(arg0, 36);
		local10 = new Class202();
		local10.anInt5915 = arg0;
		if (local20 != null) {
			local10.method5173(new Class1_Sub7(local20));
		}
		local10.method5172();
		Static190.aClass140_99.method3817((long) arg0, local10);
		return local10;
	}
}
