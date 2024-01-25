import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "Lclient!bda;")
	public static Class27 aClass27_8;

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "[I")
	public static int[] anIntArray626;

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
	public static int anInt9408 = 0;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	public static void method7776() {
		for (@Pc(10) Class1_Sub3_Sub18 local10 = (Class1_Sub3_Sub18) Static140.aClass361_34.method7854(); local10 != null; local10 = (Class1_Sub3_Sub18) Static140.aClass361_34.method7853()) {
			@Pc(19) Class20_Sub2_Sub4_Sub2 local19 = local10.aClass20_Sub2_Sub4_Sub2_1;
			if (local19.aBoolean448) {
				local10.method7878();
				local19.method5261();
			} else if (Static81.anInt1910 >= local19.anInt6294) {
				local19.method5258(Static236.anInt4451);
				if (local19.aBoolean448) {
					local10.method7878();
				} else {
					Static567.method7645(local19, true);
				}
			}
		}
	}
}
