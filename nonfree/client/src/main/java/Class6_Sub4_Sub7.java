import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public final class Class6_Sub4_Sub7 extends Class6_Sub4 {

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
	private int anInt6043 = -1;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILclient!wfa;)V")
	@Override
	public void method8698(@OriginalArg(1) Class391 arg0) {
		arg0.method8890(this.anInt6043);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!jc;I)V")
	@Override
	public void method8699(@OriginalArg(0) Class6_Sub15 arg0) {
		this.anInt6043 = arg0.method3018();
	}
}
