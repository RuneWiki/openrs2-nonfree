import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "Lclient!tf;")
	public static final Class316 aClass316_12 = new Class316(4, 3);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)I")
	public static int method6209(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)[I")
	public static int[] method6210() {
		return new int[] { Static480.anInt8096, Static580.anInt9540, Static222.anInt4250 };
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!de;Z)I")
	public static int method6211(@OriginalArg(0) Class8_Sub3_Sub3_Sub1_Sub1 arg0) {
		@Pc(13) int local13 = arg0.anInt1753;
		@Pc(17) Class140 local17 = arg0.method5425();
		if (arg0.aBoolean553) {
			local13 = arg0.anInt1756;
		} else if (local17.anInt3597 == arg0.anInt6829 || arg0.anInt6829 == local17.anInt3625 || local17.anInt3610 == arg0.anInt6829 || local17.anInt3616 == arg0.anInt6829) {
			local13 = arg0.anInt1742;
		} else if (arg0.anInt6829 == local17.anInt3593 || local17.anInt3636 == arg0.anInt6829 || local17.anInt3628 == arg0.anInt6829 || local17.anInt3602 == arg0.anInt6829) {
			local13 = arg0.anInt1727;
		}
		return local13;
	}
}
