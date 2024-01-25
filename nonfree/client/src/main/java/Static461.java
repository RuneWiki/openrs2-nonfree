import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!sv", name = "Q", descriptor = "I")
	public static int anInt7924;

	@OriginalMember(owner = "client!sv", name = "O", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_195 = new Class150(59, -1);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!aj;I)I")
	public static int method6410(@OriginalArg(0) Class5_Sub3_Sub1 arg0) {
		@Pc(18) int local18 = arg0.method524(2);
		@Pc(31) int local31;
		if (local18 == 0) {
			local31 = 0;
		} else if (local18 == 1) {
			local31 = arg0.method524(5);
		} else if (local18 == 2) {
			local31 = arg0.method524(8);
		} else {
			local31 = arg0.method524(11);
		}
		return local31;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IB)V")
	public static void method6411(@OriginalArg(0) int arg0) {
		Static224.anInt4176 = 3;
		Static134.anInt2779 = arg0;
		Static263.anInt5182 = -1;
		Static183.anInt4083 = 100;
	}
}
