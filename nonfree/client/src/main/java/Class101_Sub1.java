import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public final class Class101_Sub1 extends Class101 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLclient!gd;)Lclient!gd;")
	@Override
	public Class4_Sub1_Sub7 method2747(@OriginalArg(1) Class4_Sub1_Sub7 arg0) {
		return new Class4_Sub1_Sub7_Sub2(arg0.method5510());
	}
}
