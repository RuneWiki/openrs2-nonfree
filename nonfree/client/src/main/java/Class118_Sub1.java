import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public final class Class118_Sub1 extends Class118 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!ah;I)Lclient!ah;")
	@Override
	public Class1_Sub2_Sub2 method3134(@OriginalArg(0) Class1_Sub2_Sub2 arg0) {
		return new Class1_Sub2_Sub2_Sub2(arg0.method1808());
	}
}
