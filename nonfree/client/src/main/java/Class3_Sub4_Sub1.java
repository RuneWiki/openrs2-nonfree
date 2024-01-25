import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class3_Sub4_Sub1 extends Class3_Sub4 {

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	private int anInt1072;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
	private int anInt1074;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!rh;Z)V")
	@Override
	public void method8504(@OriginalArg(0) Class308 arg0) {
		arg0.method7283(this.anInt1072, this.anInt1074);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!fca;)V")
	@Override
	public void method8503(@OriginalArg(1) Class3_Sub17 arg0) {
		this.anInt1072 = arg0.method4868();
		this.anInt1074 = arg0.method4868();
	}
}
