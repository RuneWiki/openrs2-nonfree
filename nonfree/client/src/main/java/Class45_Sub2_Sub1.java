import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Class45_Sub2_Sub1 extends Class45_Sub2 {

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lclient!jn;Lclient!jn;Lclient!vw;)V")
	public Class45_Sub2_Sub1(@OriginalArg(0) Class176 arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class108_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method5934(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = super.aClass78_27.A();
		@Pc(23) int local23 = ((Class108_Sub1_Sub1) super.aClass108_5).anInt10030 * Static95.method2113() / 10 % local7;
		super.aClass78_27.method8184(local23 + arg2 - local7, arg3, local7 + arg0 - local23, arg1);
	}
}
