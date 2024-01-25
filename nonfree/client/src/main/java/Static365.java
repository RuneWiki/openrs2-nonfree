import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static365 {

	@OriginalMember(owner = "client!mq", name = "F", descriptor = "[I")
	public static final int[] anIntArray412 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!mq", name = "G", descriptor = "I")
	public static int anInt6307 = 0;

	@OriginalMember(owner = "client!mq", name = "K", descriptor = "[Lclient!sl;")
	public static final Class2_Sub17[] aClass2_Sub17Array1 = new Class2_Sub17[2048];

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZII)V")
	public static void method5436(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		Static566.method7895(arg1, true, -1, arg3, arg0, arg2);
	}
}
