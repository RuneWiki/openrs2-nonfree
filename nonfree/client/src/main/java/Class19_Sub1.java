import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!bb;I)Lclient!bb;")
	@Override
	public Class1_Sub2_Sub2 method452(@OriginalArg(0) Class1_Sub2_Sub2 arg0) {
		return new Class1_Sub2_Sub2_Sub2(arg0.method3756());
	}
}
