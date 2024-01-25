import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public final class Class6_Sub4_Sub6 extends Class6_Sub4 {

	@OriginalMember(owner = "client!hm", name = "m", descriptor = "B")
	private byte aByte68;

	@OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
	private int anInt4487 = -1;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!jc;I)V")
	@Override
	public void method8699(@OriginalArg(0) Class6_Sub15 arg0) {
		this.anInt4487 = arg0.method3018();
		this.aByte68 = arg0.method3027();
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!wfa;)V")
	@Override
	public void method8698(@OriginalArg(1) Class391 arg0) {
		arg0.method8886(this.anInt4487, this.aByte68);
	}
}
