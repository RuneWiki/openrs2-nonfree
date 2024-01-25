import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public final class Class63_Sub1 extends Class63 {

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILclient!bea;)Lclient!bea;")
	@Override
	public Class1_Sub2_Sub3 method1813(@OriginalArg(1) Class1_Sub2_Sub3 arg0) {
		return new Class1_Sub2_Sub3_Sub1(arg0.method5995(), arg0.anInt6684);
	}
}
