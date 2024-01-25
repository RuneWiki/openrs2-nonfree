import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ola")
public final class Class64_Sub2_Sub1 extends Class64_Sub2 {

	@OriginalMember(owner = "client!ola", name = "<init>", descriptor = "(Lclient!ik;Lclient!ik;Lclient!io;)V")
	public Class64_Sub2_Sub1(@OriginalArg(0) Class182 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) Class104_Sub2_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ola", name = "a", descriptor = "(IIIBI)V")
	@Override
	protected void method6405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = super.aClass178_16.method7627();
		@Pc(19) int local19 = ((Class104_Sub2_Sub1) super.aClass104_5).anInt4421 * Static355.method9492() / 10 % local7;
		super.aClass178_16.method7621(local19 + arg1 - local7, arg0, arg2 + local7 - local19, arg3);
	}
}
