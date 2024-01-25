import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gka")
public final class Class6_Sub4_Sub5 extends Class6_Sub4 {

	@OriginalMember(owner = "client!gka", name = "p", descriptor = "Ljava/lang/String;")
	private String aString44;

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(Lclient!jc;I)V")
	@Override
	public void method8699(@OriginalArg(0) Class6_Sub15 arg0) {
		this.aString44 = arg0.method3046();
		arg0.method3015();
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(ILclient!wfa;)V")
	@Override
	public void method8698(@OriginalArg(1) Class391 arg0) {
		arg0.aString129 = this.aString44;
	}
}
