import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "[Lclient!pha;")
	public static Class23_Sub1_Sub2_Sub1[] aClass23_Sub1_Sub2_Sub1Array2;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_59 = new Class126(44, 2);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIJI)V")
	public static void method2997(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = (int) arg1 >> 14 & 0x1F;
		@Pc(25) int local25 = (int) arg1 >> 20 & 0x3;
		@Pc(32) int local32 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local18 != 10 && local18 != 11 && local18 != 22) {
			Static628.method8288(local25, 0, true, arg2, 0, arg0, local18, 0);
			return;
		}
		@Pc(64) Class178 local64 = Static349.aClass374_2.method8357(local32);
		@Pc(72) int local72;
		@Pc(75) int local75;
		if (local25 == 0 || local25 == 2) {
			local75 = local64.anInt4746;
			local72 = local64.anInt4774;
		} else {
			local72 = local64.anInt4746;
			local75 = local64.anInt4774;
		}
		@Pc(86) int local86 = local64.anInt4772;
		if (local25 != 0) {
			local86 = (local86 << local25 & 0xF) + (local86 >> 4 - local25);
		}
		Static628.method8288(0, local75, true, arg2, local72, arg0, 0, local86);
	}
}
