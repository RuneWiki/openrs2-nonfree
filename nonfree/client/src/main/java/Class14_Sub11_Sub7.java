import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public final class Class14_Sub11_Sub7 extends Class14_Sub11 {

	@OriginalMember(owner = "client!pba", name = "q", descriptor = "I")
	private int anInt7631;

	@OriginalMember(owner = "client!pba", name = "u", descriptor = "I")
	private int anInt7632;

	@OriginalMember(owner = "client!pba", name = "t", descriptor = "I")
	private int anInt7633;

	@OriginalMember(owner = "client!pba", name = "v", descriptor = "I")
	private int anInt7638;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!aq;I)V")
	@Override
	public void method9161(@OriginalArg(0) Class23 arg0) {
		arg0.method344(this.anInt7631, this.anInt7638, this.anInt7633, this.anInt7632);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(BLclient!jc;)V")
	@Override
	public void method9160(@OriginalArg(1) Class14_Sub21 arg0) {
		this.anInt7632 = arg0.method7748();
		this.anInt7638 = arg0.method7748();
		this.anInt7633 = arg0.method7695(113);
		this.anInt7631 = arg0.method7695(101);
	}
}
