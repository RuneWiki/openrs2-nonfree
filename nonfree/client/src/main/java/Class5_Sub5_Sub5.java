import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public final class Class5_Sub5_Sub5 extends Class5_Sub5 {

	@OriginalMember(owner = "client!iaa", name = "r", descriptor = "J")
	private long aLong142;

	@OriginalMember(owner = "client!iaa", name = "s", descriptor = "I")
	private int anInt3860;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ILclient!mia;)V")
	@Override
	public void method8345(@OriginalArg(1) Class233 arg0) {
		arg0.method5421(this.anInt3860, this.aLong142);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lclient!rv;I)V")
	@Override
	public void method8349(@OriginalArg(0) Class5_Sub15 arg0) {
		this.anInt3860 = arg0.method3671();
		this.aLong142 = arg0.method3634();
	}
}
