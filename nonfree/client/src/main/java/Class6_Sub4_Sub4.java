import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public final class Class6_Sub4_Sub4 extends Class6_Sub4 {

	@OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
	private int anInt3513;

	@OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
	private int anInt3514;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!jc;I)V")
	@Override
	public void method8699(@OriginalArg(0) Class6_Sub15 arg0) {
		this.anInt3513 = arg0.method3015();
		this.anInt3514 = arg0.method3015();
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!wfa;)V")
	@Override
	public void method8698(@OriginalArg(1) Class391 arg0) {
		arg0.method8882(this.anInt3514, this.anInt3513);
	}
}
