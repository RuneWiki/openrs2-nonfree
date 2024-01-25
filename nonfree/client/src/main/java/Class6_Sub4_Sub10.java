import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class6_Sub4_Sub10 extends Class6_Sub4 {

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
	private int anInt8265;

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "Ljava/lang/String;")
	private String aString92;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!jc;I)V")
	@Override
	public void method8699(@OriginalArg(0) Class6_Sub15 arg0) {
		this.anInt8265 = arg0.method3015();
		this.aString92 = arg0.method3046();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!wfa;)V")
	@Override
	public void method8698(@OriginalArg(1) Class391 arg0) {
		arg0.method8900(this.anInt8265, this.aString92);
	}
}
