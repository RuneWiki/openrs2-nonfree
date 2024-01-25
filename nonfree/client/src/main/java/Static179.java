import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!g", name = "Z", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_43 = new Class341(53, -1);

	@OriginalMember(owner = "client!g", name = "qb", descriptor = "[F")
	public static final float[] aFloatArray20 = new float[4];

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLclient!ea;)V")
	public static void method3533(@OriginalArg(1) Class15_Sub3_Sub3_Sub1_Sub1 arg0) {
		@Pc(15) Class2_Sub12 local15 = (Class2_Sub12) Static555.aClass335_42.method8357((long) arg0.anInt3977);
		if (local15 == null) {
			return;
		}
		if (local15.aClass2_Sub26_Sub5_1 != null) {
			Static270.aClass2_Sub26_Sub4_2.method7390(local15.aClass2_Sub26_Sub5_1);
			local15.aClass2_Sub26_Sub5_1 = null;
		}
		local15.method9825();
	}
}
