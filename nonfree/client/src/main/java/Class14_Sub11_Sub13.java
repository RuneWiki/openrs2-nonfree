import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public final class Class14_Sub11_Sub13 extends Class14_Sub11 {

	@OriginalMember(owner = "client!vp", name = "t", descriptor = "I")
	private int anInt10728 = -1;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!aq;I)V")
	@Override
	public void method9161(@OriginalArg(0) Class23 arg0) {
		arg0.method338(this.anInt10728);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLclient!jc;)V")
	@Override
	public void method9160(@OriginalArg(1) Class14_Sub21 arg0) {
		this.anInt10728 = arg0.method7717(-1978450544);
	}
}
