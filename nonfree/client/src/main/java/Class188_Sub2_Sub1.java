import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class188_Sub2_Sub1 extends Class188_Sub2 {

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!nd;Lclient!nd;Lclient!ufa;)V")
	public Class188_Sub2_Sub1(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) Class56_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIBI)V")
	@Override
	protected void method6399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11 = super.aClass31_29.method8788();
		@Pc(23) int local23 = ((Class56_Sub1_Sub1) super.aClass56_5).anInt9437 * Static415.method6261() / 10 % local11;
		super.aClass31_29.method8810(arg3 + local23 - local11, arg1, local11 + arg2 - local23, arg0);
	}
}
