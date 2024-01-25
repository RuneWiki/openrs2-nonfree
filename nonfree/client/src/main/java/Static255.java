import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
	public static int anInt4805;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
	public static int anInt4807;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
	public static int anInt4802 = 0;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_90 = new Class256("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
	public static int anInt4806 = 0;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "[I")
	public static int[] anIntArray326 = new int[2];

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ql;I)V")
	public static void method3890(@OriginalArg(0) Class4_Sub2_Sub2_Sub1 arg0) {
		@Pc(11) Class2_Sub23 local11 = (Class2_Sub23) Static69.aClass240_7.method5439((long) arg0.anInt6456);
		if (local11 == null) {
			return;
		}
		if (local11.aClass2_Sub18_Sub1_3 != null) {
			Static360.aClass2_Sub18_Sub4_2.method4456(local11.aClass2_Sub18_Sub1_3);
			local11.aClass2_Sub18_Sub1_3 = null;
		}
		local11.method6072();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IF)F")
	public static float method3891(@OriginalArg(1) float arg0) {
		return ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F) * arg0 * arg0 * arg0;
	}
}
