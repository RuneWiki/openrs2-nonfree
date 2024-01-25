import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public final class Class3_Sub4_Sub11 extends Class3_Sub4 {

	@OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
	private int anInt9907;

	@OriginalMember(owner = "client!vm", name = "v", descriptor = "I")
	private int anInt9909;

	@OriginalMember(owner = "client!vm", name = "x", descriptor = "I")
	private int anInt9911;

	@OriginalMember(owner = "client!vm", name = "F", descriptor = "I")
	private int anInt9919 = -1;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILclient!fca;)V")
	@Override
	public void method8503(@OriginalArg(1) Class3_Sub17 arg0) {
		this.anInt9919 = arg0.method4858();
		this.anInt9911 = arg0.method4868();
		this.anInt9907 = arg0.method4888();
		this.anInt9909 = arg0.method4888();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!rh;Z)V")
	@Override
	public void method8504(@OriginalArg(0) Class308 arg0) {
		arg0.method7281(this.anInt9911, this.anInt9919, this.anInt9909, this.anInt9907);
	}
}
