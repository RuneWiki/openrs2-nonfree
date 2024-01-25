import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLclient!id;)Lclient!id;")
	@Override
	public Class1_Sub2_Sub6 method25(@OriginalArg(1) Class1_Sub2_Sub6 arg0) {
		return new Class1_Sub2_Sub6_Sub2(arg0.anInterface7_3, arg0.method2973());
	}
}
