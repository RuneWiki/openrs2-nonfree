import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public final class Class3_Sub4_Sub3 extends Class3_Sub4 {

	@OriginalMember(owner = "client!gq", name = "s", descriptor = "I")
	private int anInt3811;

	@OriginalMember(owner = "client!gq", name = "u", descriptor = "Ljava/lang/String;")
	private String aString50;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!rh;Z)V")
	@Override
	public void method8504(@OriginalArg(0) Class308 arg0) {
		arg0.method7288(this.anInt3811, this.aString50);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILclient!fca;)V")
	@Override
	public void method8503(@OriginalArg(1) Class3_Sub17 arg0) {
		this.anInt3811 = arg0.method4868();
		this.aString50 = arg0.method4847();
	}
}
