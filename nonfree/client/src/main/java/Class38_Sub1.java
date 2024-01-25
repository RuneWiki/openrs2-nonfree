import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public final class Class38_Sub1 extends Class38 {

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!oh;B)Lclient!oh;")
	@Override
	public Class2_Sub1_Sub4 method2428(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		return new Class2_Sub1_Sub4_Sub2(arg0.anInterface4_3, arg0.method1618(), arg0.anInt1791);
	}
}
