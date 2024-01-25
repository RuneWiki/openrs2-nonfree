import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public final class Class5_Sub5_Sub9 extends Class5_Sub5 {

	@OriginalMember(owner = "client!sda", name = "r", descriptor = "I")
	private int anInt8784;

	@OriginalMember(owner = "client!sda", name = "s", descriptor = "I")
	private int anInt8785;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(ILclient!mia;)V")
	@Override
	public void method8345(@OriginalArg(1) Class233 arg0) {
		arg0.method5422(this.anInt8784, this.anInt8785);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Lclient!rv;I)V")
	@Override
	public void method8349(@OriginalArg(0) Class5_Sub15 arg0) {
		this.anInt8784 = arg0.method3671();
		this.anInt8785 = arg0.method3671();
	}
}
