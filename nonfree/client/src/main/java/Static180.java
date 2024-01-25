import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static180 {

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "I")
	public static int anInt3623;

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
	public static int anInt3622 = -1;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!ub;)V")
	public static void method3233(@OriginalArg(0) Class1_Sub4 arg0) {
		Static468.aClass44_7.MA(arg0.anInt9934, arg0.anInt9932 + (arg0.method8117() >> 1), arg0.anInt9935, Static100.anIntArray91);
		arg0.anInt9937 = Static100.anIntArray91[0];
		arg0.anInt9939 = Static100.anIntArray91[1];
		arg0.anInt9938 = Static100.anIntArray91[2];
	}
}
