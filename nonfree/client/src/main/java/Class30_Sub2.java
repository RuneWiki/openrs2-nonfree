import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class30_Sub2 extends Class30 {

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!ni;Lclient!ni;Lclient!uu;)V")
	public Class30_Sub2(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class109_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIBZ)V")
	@Override
	protected void method7537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static467.aClass5_13.method6142(arg1 - 2, arg0, super.aClass109_5.anInt9913 + 4, super.aClass109_5.anInt9904 - -2, ((Class109_Sub3) super.aClass109_5).anInt9915, 0);
		Static467.aClass5_13.method6142(arg1 - 1, arg0 + 1, super.aClass109_5.anInt9913 + 2, super.aClass109_5.anInt9904, 0, 0);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method7542(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.method7540() * super.aClass109_5.anInt9913 / 10000;
		Static467.aClass5_13.aa(arg1, arg0 + 2, local13, super.aClass109_5.anInt9904 - 2, ((Class109_Sub3) super.aClass109_5).anInt9916, 0);
		Static467.aClass5_13.aa(local13 + arg1, arg0 + 2, super.aClass109_5.anInt9913 - local13, super.aClass109_5.anInt9904 - 2, 0, 0);
	}
}
