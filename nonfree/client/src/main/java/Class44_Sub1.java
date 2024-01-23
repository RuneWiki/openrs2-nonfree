import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public final class Class44_Sub1 extends Class44 {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!pe;Z)Lclient!pe;")
	@Override
	public Class4_Sub2_Sub8 method1444(@OriginalArg(0) Class4_Sub2_Sub8 arg0) {
		return new Class4_Sub2_Sub8_Sub2(arg0.method1815());
	}
}
