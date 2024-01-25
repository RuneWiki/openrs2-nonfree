import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class27_Sub1_Sub1 extends Class27_Sub1 {

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!ae;Lclient!ae;Lclient!dd;)V")
	public Class27_Sub1_Sub1(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class63_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method6636(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11 = super.aClass9_34.method8937();
		@Pc(23) int local23 = ((Class63_Sub1_Sub1) super.aClass63_5).anInt1785 * Static268.method3983() / 10 % local11;
		super.aClass9_34.method8928(local23 + arg1 - local11, arg3, local11 + arg0 - local23, arg2);
	}
}
