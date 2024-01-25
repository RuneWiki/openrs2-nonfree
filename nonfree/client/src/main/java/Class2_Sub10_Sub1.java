import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class2_Sub10_Sub1 extends Class2_Sub10 {

	@OriginalMember(owner = "client!cb", name = "I", descriptor = "Lclient!gt;")
	public final Class1_Sub5_Sub2 aClass1_Sub5_Sub2_1;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!gt;)V")
	public Class2_Sub10_Sub1(@OriginalArg(0) Class1_Sub5_Sub2 arg0) {
		this.aClass1_Sub5_Sub2_1 = arg0;
	}
}
