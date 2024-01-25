import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class172_Sub1 extends Class172 {

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILclient!wca;)Lclient!wca;")
	@Override
	public Class1_Sub3_Sub9 method3994(@OriginalArg(1) Class1_Sub3_Sub9 arg0) {
		return new Class1_Sub3_Sub9_Sub2(arg0.anInterface3_3, arg0.method4597(), arg0.anInt5382);
	}
}
