import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static590 {

	@OriginalMember(owner = "client!tja", name = "p", descriptor = "I")
	public static int anInt9393 = 1;

	@OriginalMember(owner = "client!tja", name = "r", descriptor = "[I")
	public static final int[] anIntArray610 = new int[13];

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(BLclient!ig;Lclient!ig;)V")
	public static void method8205(@OriginalArg(1) Class6_Sub2 arg0, @OriginalArg(2) Class6_Sub2 arg1) {
		if (arg0.aClass6_Sub2_66 != null) {
			arg0.method8464();
		}
		arg0.aClass6_Sub2_65 = arg1;
		arg0.aClass6_Sub2_66 = arg1.aClass6_Sub2_66;
		arg0.aClass6_Sub2_66.aClass6_Sub2_65 = arg0;
		arg0.aClass6_Sub2_65.aClass6_Sub2_66 = arg0;
	}
}
