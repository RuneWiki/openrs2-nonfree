import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class137_Sub1_Sub1 extends Class137_Sub1 {

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!wu;Lclient!wu;Lclient!df;)V")
	public Class137_Sub1_Sub1(@OriginalArg(0) Class380 arg0, @OriginalArg(1) Class380 arg1, @OriginalArg(2) Class69_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method5466(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11 = super.aClass61_20.method6446();
		@Pc(23) int local23 = ((Class69_Sub1_Sub1) super.aClass69_5).anInt1784 * Static513.method7196() / 10 % local11;
		super.aClass61_20.method6439(local23 + arg0 - local11, arg1, local11 + arg3 - local23, arg2);
	}
}
