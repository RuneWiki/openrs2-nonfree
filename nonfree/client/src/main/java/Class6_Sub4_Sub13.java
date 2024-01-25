import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public final class Class6_Sub4_Sub13 extends Class6_Sub4 {

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
	private int anInt10001;

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
	private int anInt10007;

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
	private int anInt10008;

	@OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
	private int anInt10002 = -1;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILclient!wfa;)V")
	@Override
	public void method8698(@OriginalArg(1) Class391 arg0) {
		arg0.method8897(this.anInt10008, this.anInt10007, this.anInt10001, this.anInt10002);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!jc;I)V")
	@Override
	public void method8699(@OriginalArg(0) Class6_Sub15 arg0) {
		this.anInt10002 = arg0.method3018();
		this.anInt10007 = arg0.method3015();
		this.anInt10008 = arg0.method3030();
		this.anInt10001 = arg0.method3030();
	}
}
