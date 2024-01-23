import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!be", name = "F", descriptor = "Lclient!fe;")
	public Class20_Sub2 aClass20_Sub2_1;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!fe;)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) Class20_Sub2 arg0) {
		this.aClass20_Sub2_1 = arg0;
	}
}
