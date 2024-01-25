import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public final class Class5_Sub2_Sub1 extends Class5_Sub2 {

	@OriginalMember(owner = "client!aea", name = "n", descriptor = "I")
	private int anInt98;

	@OriginalMember(owner = "client!aea", name = "u", descriptor = "I")
	private int anInt99;

	@OriginalMember(owner = "client!aea", name = "q", descriptor = "I")
	private int anInt100;

	@OriginalMember(owner = "client!aea", name = "r", descriptor = "I")
	private int anInt104;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lclient!kp;I)V")
	@Override
	public void method8190(@OriginalArg(0) Class205 arg0) {
		arg0.method4880(this.anInt104, this.anInt100, this.anInt99, this.anInt98);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(BLclient!ib;)V")
	@Override
	public void method8188(@OriginalArg(1) Class5_Sub23 arg0) {
		this.anInt98 = arg0.method8527();
		this.anInt104 = arg0.method8527();
		this.anInt100 = arg0.method8529();
		this.anInt99 = arg0.method8529();
	}
}
