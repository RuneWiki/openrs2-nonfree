import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public final class Class6_Sub4_Sub1 extends Class6_Sub4 {

	@OriginalMember(owner = "client!baa", name = "m", descriptor = "Z")
	private boolean aBoolean36;

	@OriginalMember(owner = "client!baa", name = "p", descriptor = "B")
	private byte aByte4;

	@OriginalMember(owner = "client!baa", name = "t", descriptor = "B")
	private byte aByte5;

	@OriginalMember(owner = "client!baa", name = "j", descriptor = "B")
	private byte aByte6;

	@OriginalMember(owner = "client!baa", name = "k", descriptor = "B")
	private byte aByte7;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(ILclient!wfa;)V")
	@Override
	public void method8698(@OriginalArg(1) Class391 arg0) {
		arg0.aByte147 = this.aByte4;
		arg0.aByte150 = this.aByte7;
		arg0.aByte148 = this.aByte6;
		arg0.aByte149 = this.aByte5;
		arg0.aBoolean762 = this.aBoolean36;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lclient!jc;I)V")
	@Override
	public void method8699(@OriginalArg(0) Class6_Sub15 arg0) {
		this.aBoolean36 = arg0.method3030() == 1;
		this.aByte6 = arg0.method3027();
		this.aByte4 = arg0.method3027();
		this.aByte5 = arg0.method3027();
		this.aByte7 = arg0.method3027();
	}
}
