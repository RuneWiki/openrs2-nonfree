import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class53_Sub1_Sub1 extends Class53_Sub1 {

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lclient!in;Lclient!in;Lclient!fu;)V")
	public Class53_Sub1_Sub1(@OriginalArg(0) Class157 arg0, @OriginalArg(1) Class157 arg1, @OriginalArg(2) Class110_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIBII)V")
	@Override
	protected void method9242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = super.aClass46_36.method6205();
		@Pc(24) int local24 = ((Class110_Sub1_Sub1) super.aClass110_5).anInt4109 * Static331.method5701() / 10 % local12;
		super.aClass46_36.method6211(arg2 + local24 - local12, arg0, arg3 + local12 - local24, arg1);
	}
}
