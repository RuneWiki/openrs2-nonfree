import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public final class Class3_Sub4_Sub7 extends Class3_Sub4 {

	@OriginalMember(owner = "client!mia", name = "s", descriptor = "B")
	private byte aByte91;

	@OriginalMember(owner = "client!mia", name = "t", descriptor = "I")
	private int anInt6540 = -1;

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(Lclient!rh;Z)V")
	@Override
	public void method8504(@OriginalArg(0) Class308 arg0) {
		arg0.method7286(this.aByte91, this.anInt6540);
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(ILclient!fca;)V")
	@Override
	public void method8503(@OriginalArg(1) Class3_Sub17 arg0) {
		this.anInt6540 = arg0.method4858();
		this.aByte91 = arg0.method4861();
	}
}
