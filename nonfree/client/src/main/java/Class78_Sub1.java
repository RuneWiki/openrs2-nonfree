import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public final class Class78_Sub1 extends Class78 {

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZLclient!nv;)Lclient!nv;")
	@Override
	public Class2_Sub2_Sub10 method1519(@OriginalArg(1) Class2_Sub2_Sub10 arg0) {
		return new Class2_Sub2_Sub10_Sub1(arg0.anInterface19_3, arg0.method7668(), arg0.anInt9560);
	}
}
