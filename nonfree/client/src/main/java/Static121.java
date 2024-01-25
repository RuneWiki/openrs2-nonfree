import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!er", name = "h", descriptor = "Lclient!kaa;")
	public static Class168 aClass168_4;

	@OriginalMember(owner = "client!er", name = "j", descriptor = "Lclient!fn;")
	public static Class99 aClass99_1;

	@OriginalMember(owner = "client!er", name = "k", descriptor = "Lclient!hd;")
	public static final Class128 aClass128_7 = new Class128(512);

	@OriginalMember(owner = "client!er", name = "l", descriptor = "[Lclient!tn;")
	public static final Class6_Sub2_Sub19[] aClass6_Sub2_Sub19Array4 = new Class6_Sub2_Sub19[14];

	@OriginalMember(owner = "client!er", name = "m", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_38 = new Class47(9, 3);

	@OriginalMember(owner = "client!er", name = "a", descriptor = "([BII)[B")
	public static byte[] method2518(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static601.method2938(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method2519(@OriginalArg(1) Class14 arg0) {
		if (Static587.aBoolean734) {
			Static156.method2932(arg0);
		} else {
			Static216.method3765(arg0);
		}
	}
}
