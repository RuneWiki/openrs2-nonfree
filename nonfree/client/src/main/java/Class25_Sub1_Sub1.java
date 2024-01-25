import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class25_Sub1_Sub1 extends Class25_Sub1 {

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!la;Lclient!la;Lclient!ph;)V")
	public Class25_Sub1_Sub1(@OriginalArg(0) Class208 arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class31_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIB)V")
	@Override
	protected void method2007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15 = super.aClass134_19.method9231();
		@Pc(27) int local27 = ((Class31_Sub1_Sub1) super.aClass31_5).anInt7744 * Static201.method2892() / 10 % local15;
		super.aClass134_19.method9240(arg0 + local27 - local15, arg3, arg1 + local15 - local27, arg2);
	}
}
