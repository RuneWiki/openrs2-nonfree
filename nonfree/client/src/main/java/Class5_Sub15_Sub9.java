import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public final class Class5_Sub15_Sub9 extends Class5_Sub15 {

	@OriginalMember(owner = "client!ti", name = "C", descriptor = "B")
	private byte aByte127;

	@OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
	private int anInt9032 = -1;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!sca;I)V")
	@Override
	public void method9164(@OriginalArg(0) Class325 arg0) {
		arg0.method7388(this.aByte127, this.anInt9032);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!wq;)V")
	@Override
	public void method9163(@OriginalArg(1) Class5_Sub36 arg0) {
		this.anInt9032 = arg0.method7333();
		this.aByte127 = arg0.method7318();
	}
}
