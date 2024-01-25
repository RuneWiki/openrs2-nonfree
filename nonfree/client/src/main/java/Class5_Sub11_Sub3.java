import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class Class5_Sub11_Sub3 extends Class5_Sub11 {

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
	private int anInt7984 = -1;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLclient!ib;)V")
	@Override
	public void method7461(@OriginalArg(1) Class5_Sub23 arg0) {
		this.anInt7984 = arg0.method8519();
		arg0.method8529();
		if (arg0.method8529() != 255) {
			arg0.anInt9869--;
			arg0.method8509();
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!wca;)V")
	@Override
	public void method7459(@OriginalArg(1) Class5_Sub53 arg0) {
		arg0.method9053(this.anInt7984);
	}
}
