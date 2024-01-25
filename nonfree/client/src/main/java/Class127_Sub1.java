import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public final class Class127_Sub1 extends Class127 {

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!ph;I)Lclient!ph;")
	@Override
	public Class6_Sub2_Sub14 method3741(@OriginalArg(0) Class6_Sub2_Sub14 arg0) {
		return new Class6_Sub2_Sub14_Sub1(arg0.method3870());
	}
}
