import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public final class Class67_Sub1 extends Class67 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!hc;)Lclient!hc;")
	@Override
	public Class1_Sub5_Sub3 method2907(@OriginalArg(1) Class1_Sub5_Sub3 arg0) {
		return new Class1_Sub5_Sub3_Sub2(arg0.anInterface3_3, arg0.method1628(), arg0.anInt1963);
	}
}
