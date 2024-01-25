import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public final class Class3_Sub4_Sub4 extends Class3_Sub4 {

	@OriginalMember(owner = "client!iq", name = "u", descriptor = "I")
	private int anInt4929 = -1;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!rh;Z)V")
	@Override
	public void method8504(@OriginalArg(0) Class308 arg0) {
		arg0.method7287(this.anInt4929);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!fca;)V")
	@Override
	public void method8503(@OriginalArg(1) Class3_Sub17 arg0) {
		this.anInt4929 = arg0.method4858();
	}
}
