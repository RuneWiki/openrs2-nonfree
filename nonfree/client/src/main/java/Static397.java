import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!tu", name = "y", descriptor = "[[B")
	public static byte[][] aByteArrayArray55;

	@OriginalMember(owner = "client!tu", name = "t", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_90 = new Class134("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!tu", name = "C", descriptor = "Lclient!de;")
	public static final Class50 aClass50_25 = new Class50(10, 2, 2, 0);

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILclient!jm;)I")
	public static int method5062(@OriginalArg(1) Class3_Sub4_Sub1_Sub1 arg0) {
		@Pc(8) Class245 local8 = arg0.aClass245_1;
		if (local8.anIntArray560 != null) {
			local8 = local8.method5205(Static138.aClass268_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(28) int local28 = local8.anInt6700;
		@Pc(32) Class173 local32 = arg0.method4001();
		if (arg0.aBoolean353) {
			local28 = local8.anInt6706;
		} else if (arg0.anInt4922 == local32.anInt4463 || local32.anInt4485 == arg0.anInt4922 || arg0.anInt4922 == local32.anInt4459 || local32.anInt4460 == arg0.anInt4922) {
			local28 = local8.anInt6736;
		} else if (local32.anInt4488 == arg0.anInt4922 || arg0.anInt4922 == local32.anInt4472 || local32.anInt4476 == arg0.anInt4922 || local32.anInt4454 == arg0.anInt4922) {
			local28 = local8.anInt6726;
		}
		return local28;
	}
}
