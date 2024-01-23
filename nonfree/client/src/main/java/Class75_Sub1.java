import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public final class Class75_Sub1 extends Class75 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!wl;B)Lclient!wl;")
	@Override
	public Class1_Sub2_Sub3 method2120(@OriginalArg(0) Class1_Sub2_Sub3 arg0) {
		return new Class1_Sub2_Sub3_Sub2(arg0.method2576());
	}
}
