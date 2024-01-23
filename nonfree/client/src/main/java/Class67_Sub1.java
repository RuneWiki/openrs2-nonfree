import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public final class Class67_Sub1 extends Class67 {

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!cn;)Lclient!cn;")
	@Override
	public Class4_Sub3_Sub4 method2016(@OriginalArg(1) Class4_Sub3_Sub4 arg0) {
		return new Class4_Sub3_Sub4_Sub2(arg0.method2326());
	}
}
