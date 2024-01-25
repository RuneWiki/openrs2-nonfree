import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lja")
public final class Class3_Sub11_Sub10 extends Class3_Sub11 {

	@OriginalMember(owner = "client!lja", name = "l", descriptor = "I")
	private int anInt6209;

	@OriginalMember(owner = "client!lja", name = "p", descriptor = "I")
	private int anInt6211;

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(Lclient!rba;I)V")
	@Override
	public void method8782(@OriginalArg(0) Class3_Sub28 arg0) {
		this.anInt6211 = arg0.method5312();
		this.anInt6209 = arg0.method5312();
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(Lclient!mea;B)V")
	@Override
	public void method8783(@OriginalArg(0) Class237 arg0) {
		arg0.method5843(this.anInt6209, this.anInt6211);
	}
}
