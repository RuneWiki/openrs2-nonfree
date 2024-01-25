import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static400 {

	@OriginalMember(owner = "client!mm", name = "J", descriptor = "[B")
	public static byte[] aByteArray56;

	@OriginalMember(owner = "client!mm", name = "L", descriptor = "I")
	public static int anInt7156 = 0;

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "(I)V")
	public static void method6004() {
		Static548.aClass136_41.method3505();
		Static284.aClass136_26.method3505();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZLjava/lang/String;ZLclient!cea;Z)V")
	public static void method6006(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class47 arg2, @OriginalArg(4) boolean arg3) {
		Static177.method5465(arg1, arg2, arg3, arg0, "openjs");
	}
}
