import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pfa")
public final class Class12_Sub2_Sub1 extends Class12_Sub2 {

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Lclient!sea;Lclient!sea;Lclient!efa;)V")
	public Class12_Sub2_Sub1(@OriginalArg(0) Class308 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) Class23_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method5762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) int local13 = super.aClass5_28.A();
		@Pc(25) int local25 = ((Class23_Sub1_Sub1) super.aClass23_5).anInt1988 * Static201.method3096() / 10 % local13;
		super.aClass5_28.method7794(arg2 + local25 - local13, arg3, arg0 + local13 - local25, arg1);
	}
}
