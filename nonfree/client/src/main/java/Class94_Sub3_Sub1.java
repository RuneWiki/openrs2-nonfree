import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class94_Sub3_Sub1 extends Class94_Sub3 {

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lclient!ri;Lclient!ri;Lclient!bl;)V")
	public Class94_Sub3_Sub1(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Class284 arg1, @OriginalArg(2) Class38_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method4401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = super.aClass73_26.A();
		@Pc(27) int local27 = ((Class38_Sub1_Sub1) super.aClass38_5).anInt1210 * Static585.method7968() / 10 % local15;
		super.aClass73_26.method7953(local27 + arg1 - local15, arg2, local15 + arg0 - local27, arg3);
	}
}
