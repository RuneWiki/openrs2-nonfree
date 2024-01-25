import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public final class Class82_Sub1 extends Class82 {

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILclient!uh;)Lclient!uh;")
	@Override
	public Class1_Sub1_Sub3 method3567(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		return new Class1_Sub1_Sub3_Sub2(arg0.anInterface8_3, arg0.method2045(), arg0.anInt2771);
	}
}
