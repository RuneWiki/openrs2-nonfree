import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static225 {

	@OriginalMember(owner = "client!ms", name = "D", descriptor = "I")
	public static int anInt4150;

	@OriginalMember(owner = "client!ms", name = "ic", descriptor = "I")
	public static int anInt4195;

	@OriginalMember(owner = "client!ms", name = "mc", descriptor = "Lclient!dg;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!ms", name = "Jc", descriptor = "[B")
	public static final byte[] aByteArray69 = new byte[2048];

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IZII)V")
	public static void method3766(@OriginalArg(1) boolean arg0) {
		Static6.anInt169 = 2;
		Static221.anInt4100 = 22050;
		Static148.aBoolean202 = arg0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method3769(@OriginalArg(0) String arg0) {
		return Static238.method3867(arg0);
	}
}
