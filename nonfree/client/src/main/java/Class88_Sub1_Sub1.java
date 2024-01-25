import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class88_Sub1_Sub1 extends Class88_Sub1 {

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!pe;Lclient!pe;Lclient!pv;)V")
	public Class88_Sub1_Sub1(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class260_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method3340(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = super.aClass37_24.AA();
		@Pc(27) int local27 = ((Class260_Sub1_Sub1) super.aClass260_5).anInt8152 * Static594.method8380() / 10 % local7;
		super.aClass37_24.method7083(arg0 + local27 - local7, arg2, local7 + arg3 - local27, arg1);
	}
}
