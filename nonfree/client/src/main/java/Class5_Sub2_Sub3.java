import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class5_Sub2_Sub3 extends Class5_Sub2 {

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	private int anInt989 = -1;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLclient!ib;)V")
	@Override
	public void method8188(@OriginalArg(1) Class5_Sub23 arg0) {
		this.anInt989 = arg0.method8519();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!kp;I)V")
	@Override
	public void method8190(@OriginalArg(0) Class205 arg0) {
		arg0.method4886(this.anInt989);
	}
}
