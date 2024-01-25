import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class5_Sub2_Sub4 extends Class5_Sub2 {

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	private int anInt1557;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	private int anInt1558;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!kp;I)V")
	@Override
	public void method8190(@OriginalArg(0) Class205 arg0) {
		arg0.method4889(this.anInt1557, this.anInt1558);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BLclient!ib;)V")
	@Override
	public void method8188(@OriginalArg(1) Class5_Sub23 arg0) {
		this.anInt1557 = arg0.method8527();
		this.anInt1558 = arg0.method8527();
	}
}
