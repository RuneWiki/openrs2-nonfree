import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public final class Class5_Sub15_Sub7 extends Class5_Sub15 {

	@OriginalMember(owner = "client!qda", name = "u", descriptor = "I")
	private int anInt7767;

	@OriginalMember(owner = "client!qda", name = "x", descriptor = "I")
	private int anInt7768;

	@OriginalMember(owner = "client!qda", name = "v", descriptor = "I")
	private int anInt7771;

	@OriginalMember(owner = "client!qda", name = "t", descriptor = "I")
	private int anInt7773;

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lclient!sca;I)V")
	@Override
	public void method9164(@OriginalArg(0) Class325 arg0) {
		arg0.method7401(this.anInt7767, this.anInt7773, this.anInt7771, this.anInt7768);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ILclient!wq;)V")
	@Override
	public void method9163(@OriginalArg(1) Class5_Sub36 arg0) {
		this.anInt7768 = arg0.method7268();
		this.anInt7767 = arg0.method7268();
		this.anInt7773 = arg0.method7291();
		this.anInt7771 = arg0.method7291();
	}
}
