import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public final class Class6_Sub4_Sub9 extends Class6_Sub4 {

	@OriginalMember(owner = "client!pba", name = "n", descriptor = "I")
	private int anInt7759;

	@OriginalMember(owner = "client!pba", name = "p", descriptor = "I")
	private int anInt7762;

	@OriginalMember(owner = "client!pba", name = "k", descriptor = "I")
	private int anInt7764;

	@OriginalMember(owner = "client!pba", name = "l", descriptor = "I")
	private int anInt7765;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILclient!wfa;)V")
	@Override
	public void method8698(@OriginalArg(1) Class391 arg0) {
		arg0.method8891(this.anInt7762, this.anInt7759, this.anInt7765, this.anInt7764);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!jc;I)V")
	@Override
	public void method8699(@OriginalArg(0) Class6_Sub15 arg0) {
		this.anInt7762 = arg0.method3015();
		this.anInt7765 = arg0.method3015();
		this.anInt7764 = arg0.method3030();
		this.anInt7759 = arg0.method3030();
	}
}
