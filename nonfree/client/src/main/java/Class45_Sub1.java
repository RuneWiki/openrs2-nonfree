import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public final class Class45_Sub1 extends Class45 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!gn;B)Lclient!gn;")
	@Override
	public Class7_Sub1_Sub3 method1110(@OriginalArg(0) Class7_Sub1_Sub3 arg0) {
		return new Class7_Sub1_Sub3_Sub1(arg0.method1191());
	}
}
