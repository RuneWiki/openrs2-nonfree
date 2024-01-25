import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class3_Sub4_Sub6 extends Class3_Sub4 {

	@OriginalMember(owner = "client!lo", name = "v", descriptor = "I")
	private int anInt6252 = -1;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!rh;Z)V")
	@Override
	public void method8504(@OriginalArg(0) Class308 arg0) {
		arg0.method7284(this.anInt6252);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!fca;)V")
	@Override
	public void method8503(@OriginalArg(1) Class3_Sub17 arg0) {
		this.anInt6252 = arg0.method4858();
	}
}
