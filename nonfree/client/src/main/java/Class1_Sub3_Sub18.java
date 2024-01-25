import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public final class Class1_Sub3_Sub18 extends Class1_Sub3 {

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "Lclient!no;")
	public final Class20_Sub2_Sub4_Sub2 aClass20_Sub2_Sub4_Sub2_1;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!no;)V")
	public Class1_Sub3_Sub18(@OriginalArg(0) Class20_Sub2_Sub4_Sub2 arg0) {
		this.aClass20_Sub2_Sub4_Sub2_1 = arg0;
	}
}
