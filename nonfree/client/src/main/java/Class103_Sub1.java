import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public final class Class103_Sub1 extends Class103 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLclient!ii;)Lclient!ii;")
	@Override
	public Class14_Sub2_Sub9 method2946(@OriginalArg(1) Class14_Sub2_Sub9 arg0) {
		return new Class14_Sub2_Sub9_Sub1(arg0.method4168());
	}
}
