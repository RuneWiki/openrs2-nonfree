import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public final class Class14_Sub11_Sub4 extends Class14_Sub11 {

	@OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
	private int anInt6668;

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
	private int anInt6669;

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
	private int anInt6671;

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
	private int anInt6667 = -1;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLclient!jc;)V")
	@Override
	public void method9160(@OriginalArg(1) Class14_Sub21 arg0) {
		this.anInt6667 = arg0.method7717(-1978450544);
		this.anInt6669 = arg0.method7748();
		this.anInt6668 = arg0.method7695(98);
		this.anInt6671 = arg0.method7695(101);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!aq;I)V")
	@Override
	public void method9161(@OriginalArg(0) Class23 arg0) {
		arg0.method353(this.anInt6669, this.anInt6671, this.anInt6667, this.anInt6668);
	}
}
