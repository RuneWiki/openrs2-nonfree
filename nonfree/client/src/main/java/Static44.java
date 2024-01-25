import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!cl", name = "q", descriptor = "Z")
	public static boolean aBoolean66;

	@OriginalMember(owner = "client!cl", name = "t", descriptor = "[I")
	public static int[] anIntArray183;

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_13 = new Class11(8, 8);

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "[I")
	public static final int[] anIntArray182 = new int[100];

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!ve;B)V")
	public static void method736(@OriginalArg(0) Class2_Sub43 arg0) {
		if (Static64.aClass251ArrayArrayArray1 == null) {
			return;
		}
		@Pc(8) Interface2 local8 = null;
		if (arg0.anInt6043 == 0) {
			local8 = (Interface2) Static368.method4614(arg0.anInt6040, arg0.anInt6039, arg0.anInt6046);
		}
		if (arg0.anInt6043 == 1) {
			local8 = (Interface2) Static95.method5549(arg0.anInt6040, arg0.anInt6039, arg0.anInt6046);
		}
		if (arg0.anInt6043 == 2) {
			local8 = (Interface2) Static292.method4418(arg0.anInt6040, arg0.anInt6039, arg0.anInt6046, dc.class);
		}
		if (arg0.anInt6043 == 3) {
			local8 = (Interface2) Static102.method2138(arg0.anInt6040, arg0.anInt6039, arg0.anInt6046);
		}
		if (local8 == null) {
			arg0.anInt6047 = -1;
			arg0.anInt6035 = 0;
			arg0.anInt6038 = 0;
		} else {
			arg0.anInt6047 = local8.method5651();
			arg0.anInt6038 = local8.method5654();
			arg0.anInt6035 = local8.method5650();
		}
	}
}
