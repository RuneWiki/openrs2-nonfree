import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public final class Class5_Sub2_Sub12 extends Class5_Sub2 {

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
	private int anInt9546;

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "J")
	private long aLong280;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!kp;I)V")
	@Override
	public void method8190(@OriginalArg(0) Class205 arg0) {
		arg0.method4896(this.anInt9546, this.aLong280);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLclient!ib;)V")
	@Override
	public void method8188(@OriginalArg(1) Class5_Sub23 arg0) {
		this.anInt9546 = arg0.method8527();
		this.aLong280 = arg0.method8509();
	}
}
