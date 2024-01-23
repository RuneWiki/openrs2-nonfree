import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public final class Class47_Sub1 extends Class47 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLclient!lh;)Lclient!lh;")
	@Override
	public Class1_Sub1_Sub5 method2550(@OriginalArg(1) Class1_Sub1_Sub5 arg0) {
		return new Class1_Sub1_Sub5_Sub1(arg0.method1271());
	}
}
