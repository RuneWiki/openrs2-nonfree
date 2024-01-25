import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public final class Class3_Sub11_Sub2 extends Class3_Sub11 {

	@OriginalMember(owner = "client!cda", name = "n", descriptor = "B")
	private byte aByte28;

	@OriginalMember(owner = "client!cda", name = "q", descriptor = "I")
	private int anInt1134 = -1;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lclient!rba;I)V")
	@Override
	public void method8782(@OriginalArg(0) Class3_Sub28 arg0) {
		this.anInt1134 = arg0.method5272();
		this.aByte28 = arg0.method5288();
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lclient!mea;B)V")
	@Override
	public void method8783(@OriginalArg(0) Class237 arg0) {
		arg0.method5852(this.anInt1134, this.aByte28);
	}
}
