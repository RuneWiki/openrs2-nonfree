import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public final class Class14_Sub11_Sub12 extends Class14_Sub11 {

	@OriginalMember(owner = "client!vba", name = "v", descriptor = "B")
	private byte aByte141;

	@OriginalMember(owner = "client!vba", name = "w", descriptor = "I")
	private int anInt10423 = -1;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lclient!aq;I)V")
	@Override
	public void method9161(@OriginalArg(0) Class23 arg0) {
		arg0.method340(this.anInt10423, this.aByte141);
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(BLclient!jc;)V")
	@Override
	public void method9160(@OriginalArg(1) Class14_Sub21 arg0) {
		this.anInt10423 = arg0.method7717(-1978450544);
		this.aByte141 = arg0.method7720();
	}
}
