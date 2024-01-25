import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public final class Class1_Sub3_Sub14 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ov", name = "v", descriptor = "Lclient!sl;")
	public final Class20_Sub2_Sub4_Sub4 aClass20_Sub2_Sub4_Sub4_1;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!sl;)V")
	public Class1_Sub3_Sub14(@OriginalArg(0) Class20_Sub2_Sub4_Sub4 arg0) {
		this.aClass20_Sub2_Sub4_Sub4_1 = arg0;
	}
}
