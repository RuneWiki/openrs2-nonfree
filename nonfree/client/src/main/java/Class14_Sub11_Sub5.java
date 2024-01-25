import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class14_Sub11_Sub5 extends Class14_Sub11 {

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
	private int anInt6974;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	private int anInt6978;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!aq;I)V")
	@Override
	public void method9161(@OriginalArg(0) Class23 arg0) {
		arg0.method337(this.anInt6978, this.anInt6974);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLclient!jc;)V")
	@Override
	public void method9160(@OriginalArg(1) Class14_Sub21 arg0) {
		this.anInt6978 = arg0.method7748();
		this.anInt6974 = arg0.method7748();
	}
}
