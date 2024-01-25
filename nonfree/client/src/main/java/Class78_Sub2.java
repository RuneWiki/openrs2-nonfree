import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hfa")
public final class Class78_Sub2 extends Class78 {

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Lclient!aj;Lclient!aj;Lclient!mba;)V")
	public Class78_Sub2(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class106_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method5191(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method5193() * super.aClass106_5.anInt5840 / 10000;
		Static674.aClass13_22.aa(arg1, arg0 + 2, local13, super.aClass106_5.anInt5834 - 2, ((Class106_Sub3) super.aClass106_5).anInt5844, 0);
		Static674.aClass13_22.aa(local13 + arg1, arg0 + 2, super.aClass106_5.anInt5840 - local13, super.aClass106_5.anInt5834 + -2, 0, 0);
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ZBII)V")
	@Override
	protected void method5195(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static674.aClass13_22.method8511(arg0 - 2, arg1, super.aClass106_5.anInt5840 + 4, super.aClass106_5.anInt5834 + 2, ((Class106_Sub3) super.aClass106_5).anInt5847, 0);
		Static674.aClass13_22.method8511(arg0 - 1, arg1 + 1, super.aClass106_5.anInt5840 + 2, super.aClass106_5.anInt5834, 0, 0);
	}
}
