import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static182 {

	@OriginalMember(owner = "client!gr", name = "J", descriptor = "[Lclient!em;")
	public static Class89[] aClass89Array1;

	@OriginalMember(owner = "client!gr", name = "P", descriptor = "Lclient!pj;")
	public static Class248 aClass248_25;

	@OriginalMember(owner = "client!gr", name = "H", descriptor = "I")
	public static int anInt3498 = 0;

	@OriginalMember(owner = "client!gr", name = "K", descriptor = "I")
	public static int anInt3500 = 1;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!ia;Lclient!ia;B)V")
	public static void method3030(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6 arg1) {
		if (arg0.aClass6_283 != null) {
			arg0.method7948();
		}
		arg0.aClass6_284 = arg1;
		arg0.aClass6_283 = arg1.aClass6_283;
		arg0.aClass6_283.aClass6_284 = arg0;
		arg0.aClass6_284.aClass6_283 = arg0;
	}
}
