import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public final class Class3_Sub4_Sub9 extends Class3_Sub4 {

	@OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
	private int anInt9028;

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "I")
	private int anInt9029;

	@OriginalMember(owner = "client!sv", name = "w", descriptor = "I")
	private int anInt9032;

	@OriginalMember(owner = "client!sv", name = "y", descriptor = "I")
	private int anInt9034;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILclient!fca;)V")
	@Override
	public void method8503(@OriginalArg(1) Class3_Sub17 arg0) {
		this.anInt9028 = arg0.method4868();
		this.anInt9032 = arg0.method4868();
		this.anInt9034 = arg0.method4888();
		this.anInt9029 = arg0.method4888();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!rh;Z)V")
	@Override
	public void method8504(@OriginalArg(0) Class308 arg0) {
		arg0.method7289(this.anInt9034, this.anInt9029, this.anInt9028, this.anInt9032);
	}
}
