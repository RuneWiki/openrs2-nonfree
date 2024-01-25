import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public final class Class6_Sub4_Sub2 extends Class6_Sub4 {

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
	private int anInt1078 = -1;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!wfa;)V")
	@Override
	public void method8698(@OriginalArg(1) Class391 arg0) {
		arg0.method8895(this.anInt1078);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!jc;I)V")
	@Override
	public void method8699(@OriginalArg(0) Class6_Sub15 arg0) {
		this.anInt1078 = arg0.method3018();
	}
}
