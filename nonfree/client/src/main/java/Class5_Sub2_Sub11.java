import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public final class Class5_Sub2_Sub11 extends Class5_Sub2 {

	@OriginalMember(owner = "client!rw", name = "r", descriptor = "B")
	private byte aByte126;

	@OriginalMember(owner = "client!rw", name = "n", descriptor = "I")
	private int anInt8850 = -1;

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!kp;I)V")
	@Override
	public void method8190(@OriginalArg(0) Class205 arg0) {
		arg0.method4892(this.anInt8850, this.aByte126);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(BLclient!ib;)V")
	@Override
	public void method8188(@OriginalArg(1) Class5_Sub23 arg0) {
		this.anInt8850 = arg0.method8519();
		this.aByte126 = arg0.method8488();
	}
}
