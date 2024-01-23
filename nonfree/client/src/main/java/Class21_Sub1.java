import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class21_Sub1 extends Class21 {

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!hn;)Lclient!hn;")
	@Override
	public Class1_Sub5_Sub7 method568(@OriginalArg(1) Class1_Sub5_Sub7 arg0) {
		return new Class1_Sub5_Sub7_Sub1(arg0.method3312());
	}
}
