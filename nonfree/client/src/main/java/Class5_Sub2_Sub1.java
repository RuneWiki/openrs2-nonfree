import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public final class Class5_Sub2_Sub1 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ae", name = "G", descriptor = "Lclient!gh;")
	public final Class1_Sub3 aClass1_Sub3_1;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!gh;)V")
	public Class5_Sub2_Sub1(@OriginalArg(0) Class1_Sub3 arg0) {
		this.aClass1_Sub3_1 = arg0;
	}
}
