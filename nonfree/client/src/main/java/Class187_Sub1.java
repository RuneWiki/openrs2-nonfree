import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public final class Class187_Sub1 extends Class187 {

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILclient!vr;)Lclient!vr;")
	@Override
	public Class3_Sub7_Sub1 method5299(@OriginalArg(1) Class3_Sub7_Sub1 arg0) {
		return new Class3_Sub7_Sub1_Sub2(arg0.method4905());
	}
}
