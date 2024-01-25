import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class94_Sub1 extends Class94 {

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!ri;Lclient!ri;Lclient!lf;)V")
	public Class94_Sub1(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Class284 arg1, @OriginalArg(2) Class38_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IZIZ)V")
	@Override
	protected void method4391(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static319.aClass31_11.method8035(arg0 - 2, arg1, super.aClass38_5.anInt8020 + 4, super.aClass38_5.anInt8019 + 2, ((Class38_Sub2) super.aClass38_5).anInt5680, 0);
		Static319.aClass31_11.method8035(arg0 - 1, arg1 + 1, super.aClass38_5.anInt8020 + 2, super.aClass38_5.anInt8019, 0, 0);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ZIII)V")
	@Override
	protected void method4388(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method4389() * super.aClass38_5.anInt8020 / 10000;
		Static319.aClass31_11.J(arg0, arg1 + 2, local13, super.aClass38_5.anInt8019 - 2, ((Class38_Sub2) super.aClass38_5).anInt5683, 0);
		Static319.aClass31_11.J(arg0 + local13, arg1 + 2, super.aClass38_5.anInt8020 - local13, super.aClass38_5.anInt8019 + -2, 0, 0);
	}
}
