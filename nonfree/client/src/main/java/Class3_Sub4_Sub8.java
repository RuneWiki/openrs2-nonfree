import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public final class Class3_Sub4_Sub8 extends Class3_Sub4 {

	@OriginalMember(owner = "client!sq", name = "w", descriptor = "I")
	private int anInt8956;

	@OriginalMember(owner = "client!sq", name = "z", descriptor = "J")
	private long aLong263;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILclient!fca;)V")
	@Override
	public void method8503(@OriginalArg(1) Class3_Sub17 arg0) {
		this.anInt8956 = arg0.method4868();
		this.aLong263 = arg0.method4865();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!rh;Z)V")
	@Override
	public void method8504(@OriginalArg(0) Class308 arg0) {
		arg0.method7277(this.anInt8956, this.aLong263);
	}
}
