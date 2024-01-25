import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cfa", name = "Qb", descriptor = "I")
	public static int anInt1757;

	@OriginalMember(owner = "client!cfa", name = "yb", descriptor = "[I")
	public static final int[] anIntArray53 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!cfa", name = "Jc", descriptor = "[I")
	public static final int[] anIntArray56 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(II)Z")
	public static boolean method1566(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!ol;I)V")
	public static void method1575(@OriginalArg(0) Class25_Sub2_Sub2_Sub5 arg0) {
		@Pc(8) int local8 = arg0.anInt8533 - Static397.anInt6998;
		@Pc(24) int local24 = arg0.anInt8553 * 512 + arg0.method6668() * 256;
		@Pc(36) int local36 = arg0.anInt8546 * 512 + arg0.method6668() * 256;
		arg0.anInt8476 += (local24 - arg0.anInt8476) / local8;
		arg0.anInt8482 += (local36 - arg0.anInt8482) / local8;
		arg0.anInt8579 = 0;
		if (arg0.anInt8514 == 0) {
			arg0.method6662(8192);
		}
		if (arg0.anInt8514 == 1) {
			arg0.method6662(12288);
		}
		if (arg0.anInt8514 == 2) {
			arg0.method6662(0);
		}
		if (arg0.anInt8514 == 3) {
			arg0.method6662(4096);
		}
	}
}
