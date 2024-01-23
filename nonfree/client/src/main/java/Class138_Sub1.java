import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public final class Class138_Sub1 extends Class138 {

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLclient!kf;)Lclient!kf;")
	@Override
	public Class3_Sub4_Sub5 method3546(@OriginalArg(1) Class3_Sub4_Sub5 arg0) {
		return new Class3_Sub4_Sub5_Sub1(arg0.method4033());
	}
}
