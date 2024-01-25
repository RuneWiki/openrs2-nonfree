import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class5_Sub2_Sub7 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
	private int anInt4258;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
	private int anInt4262;

	@OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
	private int anInt4263;

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
	private int anInt4265 = -1;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLclient!ib;)V")
	@Override
	public void method8188(@OriginalArg(1) Class5_Sub23 arg0) {
		this.anInt4265 = arg0.method8519();
		this.anInt4263 = arg0.method8527();
		this.anInt4262 = arg0.method8529();
		this.anInt4258 = arg0.method8529();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!kp;I)V")
	@Override
	public void method8190(@OriginalArg(0) Class205 arg0) {
		arg0.method4893(this.anInt4258, this.anInt4263, this.anInt4262, this.anInt4265);
	}
}
