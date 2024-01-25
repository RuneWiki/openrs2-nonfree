import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public final class Class37_Sub1 extends Class37 {

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BLclient!nh;)Lclient!nh;")
	@Override
	public Class5_Sub1_Sub5 method6036(@OriginalArg(1) Class5_Sub1_Sub5 arg0) {
		return new Class5_Sub1_Sub5_Sub2(arg0.method3819());
	}
}
