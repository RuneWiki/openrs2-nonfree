import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public final class Class169_Sub1 extends Class169 {

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!ji;I)Lclient!ji;")
	@Override
	public Class2_Sub2_Sub10 method3955(@OriginalArg(0) Class2_Sub2_Sub10 arg0) {
		return new Class2_Sub2_Sub10_Sub1(arg0.anInterface6_3, arg0.method5326(), arg0.anInt6787);
	}
}
