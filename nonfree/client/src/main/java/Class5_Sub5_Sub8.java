import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public final class Class5_Sub5_Sub8 extends Class5_Sub5 {

	@OriginalMember(owner = "client!ria", name = "t", descriptor = "I")
	private int anInt8622 = -1;

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(ILclient!mia;)V")
	@Override
	public void method8345(@OriginalArg(1) Class233 arg0) {
		arg0.method5428(this.anInt8622);
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lclient!rv;I)V")
	@Override
	public void method8349(@OriginalArg(0) Class5_Sub15 arg0) {
		this.anInt8622 = arg0.method3698();
	}
}
