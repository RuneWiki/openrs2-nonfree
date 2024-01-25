import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public final class Class3_Sub11_Sub8 extends Class3_Sub11 {

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
	private int anInt5217 = -1;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!mea;B)V")
	@Override
	public void method8783(@OriginalArg(0) Class237 arg0) {
		arg0.method5850(this.anInt5217);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!rba;I)V")
	@Override
	public void method8782(@OriginalArg(0) Class3_Sub28 arg0) {
		this.anInt5217 = arg0.method5272();
	}
}
