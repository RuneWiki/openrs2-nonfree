import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class45_Sub1 extends Class45 {

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!jn;Lclient!jn;Lclient!vaa;)V")
	public Class45_Sub1(@OriginalArg(0) Class176 arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class108_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIZZ)V")
	@Override
	protected void method5953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static440.aClass44_12.method4996(arg0 - 2, arg1, super.aClass108_5.anInt10015 + 4, super.aClass108_5.anInt10007 + 2, ((Class108_Sub3) super.aClass108_5).anInt9708, 0);
		Static440.aClass44_12.method4996(arg0 - 1, arg1 + 1, super.aClass108_5.anInt10015 + 2, super.aClass108_5.anInt10007, 0, 0);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method5952(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method5954() * super.aClass108_5.anInt10015 / 10000;
		Static440.aClass44_12.J(arg0, arg1 + 2, local13, super.aClass108_5.anInt10007 - 2, ((Class108_Sub3) super.aClass108_5).anInt9711, 0);
		Static440.aClass44_12.J(arg0 + local13, arg1 - -2, super.aClass108_5.anInt10015 - local13, super.aClass108_5.anInt10007 + -2, 0, 0);
	}
}
