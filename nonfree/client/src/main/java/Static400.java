import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static400 {

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "Lclient!se;")
	public static Class265 aClass265_5;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
	public static int anInt6819 = 0;

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "Z")
	public static boolean aBoolean506 = true;

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "Lclient!et;")
	public static Class91 aClass91_12 = null;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!ff;Lclient!ff;)V")
	public static void method6152(@OriginalArg(1) Class1_Sub2 arg0, @OriginalArg(2) Class1_Sub2 arg1) {
		if (arg1.aClass1_Sub2_60 != null) {
			arg1.method7390();
		}
		arg1.aClass1_Sub2_60 = arg0;
		arg1.aClass1_Sub2_59 = arg0.aClass1_Sub2_59;
		arg1.aClass1_Sub2_60.aClass1_Sub2_59 = arg1;
		arg1.aClass1_Sub2_59.aClass1_Sub2_60 = arg1;
	}
}
