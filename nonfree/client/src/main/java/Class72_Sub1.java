import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public final class Class72_Sub1 extends Class72 {

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZLclient!th;)Lclient!th;")
	@Override
	public Class1_Sub2_Sub3 method2284(@OriginalArg(1) Class1_Sub2_Sub3 arg0) {
		return new Class1_Sub2_Sub3_Sub1(arg0.method4241());
	}
}
