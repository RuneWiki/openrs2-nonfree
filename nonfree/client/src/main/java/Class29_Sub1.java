import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bga")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lclient!bi;Lclient!bi;Lclient!tq;)V")
	public Class29_Sub1(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class52_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method7807(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.method7813() * super.aClass52_5.anInt8822 / 10000;
		Static185.aClass66_14.C(arg1, arg0 + 2, local13, super.aClass52_5.anInt8828 - 2, ((Class52_Sub3) super.aClass52_5).anInt8835, 0);
		Static185.aClass66_14.C(local13 + arg1, arg0 + 2, super.aClass52_5.anInt8822 - local13, super.aClass52_5.anInt8828 - 2, 0, 0);
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "(IIIZ)V")
	@Override
	protected void method7812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static185.aClass66_14.method6786(arg1 - 2, arg0, super.aClass52_5.anInt8822 + 4, super.aClass52_5.anInt8828 + 2, ((Class52_Sub3) super.aClass52_5).anInt8840, 0);
		Static185.aClass66_14.method6786(arg1 - 1, arg0 + 1, super.aClass52_5.anInt8822 + 2, super.aClass52_5.anInt8828, 0, 0);
	}
}
