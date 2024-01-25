import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public final class Class5_Sub15_Sub8 extends Class5_Sub15 {

	@OriginalMember(owner = "client!tca", name = "u", descriptor = "I")
	private int anInt8946;

	@OriginalMember(owner = "client!tca", name = "x", descriptor = "I")
	private int anInt8947;

	@OriginalMember(owner = "client!tca", name = "p", descriptor = "I")
	private int anInt8948;

	@OriginalMember(owner = "client!tca", name = "v", descriptor = "I")
	private int anInt8945 = -1;

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ILclient!wq;)V")
	@Override
	public void method9163(@OriginalArg(1) Class5_Sub36 arg0) {
		this.anInt8945 = arg0.method7333();
		this.anInt8947 = arg0.method7268();
		this.anInt8946 = arg0.method7291();
		this.anInt8948 = arg0.method7291();
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!sca;I)V")
	@Override
	public void method9164(@OriginalArg(0) Class325 arg0) {
		arg0.method7402(this.anInt8948, this.anInt8947, this.anInt8945, this.anInt8946);
	}
}
