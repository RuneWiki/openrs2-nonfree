import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!df;B)Lclient!df;")
	@Override
	public Class2_Sub8_Sub4 method825(@OriginalArg(0) Class2_Sub8_Sub4 arg0) {
		return new Class2_Sub8_Sub4_Sub1(arg0.method3754());
	}
}
