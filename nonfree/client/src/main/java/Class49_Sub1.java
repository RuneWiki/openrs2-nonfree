import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public final class Class49_Sub1 extends Class49 {

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLclient!sn;)Lclient!sn;")
	@Override
	public Class2_Sub3_Sub20 method1690(@OriginalArg(1) Class2_Sub3_Sub20 arg0) {
		return new Class2_Sub3_Sub20_Sub1(arg0.method4413());
	}
}
