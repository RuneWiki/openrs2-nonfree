import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static160 {

	@OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
	public static int anInt2501;

	@OriginalMember(owner = "client!fd", name = "C", descriptor = "Lclient!la;")
	public static Class208 aClass208_38;

	@OriginalMember(owner = "client!fd", name = "I", descriptor = "Lclient!eh;")
	public static final Class103 aClass103_3 = new Class103(1);

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "[I")
	public static final int[] anIntArray142 = new int[14];

	@OriginalMember(owner = "client!fd", name = "K", descriptor = "[B")
	public static final byte[] aByteArray12 = new byte[520];

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZZ)Z")
	public static boolean method2193(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
