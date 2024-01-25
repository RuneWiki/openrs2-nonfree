import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jla")
public final class Class3_Sub11_Sub9 extends Class3_Sub11 {

	@OriginalMember(owner = "client!jla", name = "p", descriptor = "I")
	private int anInt5519 = -1;

	@OriginalMember(owner = "client!jla", name = "a", descriptor = "(Lclient!rba;I)V")
	@Override
	public void method8782(@OriginalArg(0) Class3_Sub28 arg0) {
		this.anInt5519 = arg0.method5272();
	}

	@OriginalMember(owner = "client!jla", name = "a", descriptor = "(Lclient!mea;B)V")
	@Override
	public void method8783(@OriginalArg(0) Class237 arg0) {
		arg0.method5857(this.anInt5519);
	}
}
