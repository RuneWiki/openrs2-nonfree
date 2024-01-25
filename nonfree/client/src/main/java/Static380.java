import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static380 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "[B")
	public static final byte[] aByteArray69 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
	public static int anInt4486 = 0;

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_98 = new Class253(26, 8);

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "Lclient!oo;")
	public static final Class181 aClass181_6 = new Class181("RC", 1);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!tr;)V")
	public static void method3578(@OriginalArg(1) Class28_Sub8 arg0) {
		arg0.aClass26_Sub2_Sub4_1 = null;
		if (Static373.anInt5973 < 20) {
			Static377.aClass169_8.method3603(arg0);
			Static373.anInt5973++;
		}
	}
}
