import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public final class Class5_Sub2_Sub10 extends Class5_Sub2 {

	@OriginalMember(owner = "client!pga", name = "u", descriptor = "I")
	private int anInt7718 = -1;

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(BLclient!ib;)V")
	@Override
	public void method8188(@OriginalArg(1) Class5_Sub23 arg0) {
		this.anInt7718 = arg0.method8519();
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!kp;I)V")
	@Override
	public void method8190(@OriginalArg(0) Class205 arg0) {
		arg0.method4877(this.anInt7718);
	}
}
