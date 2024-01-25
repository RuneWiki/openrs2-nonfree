import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public final class Class1_Sub3_Sub9 extends Class1_Sub3 {

	@OriginalMember(owner = "client!hp", name = "G", descriptor = "Lclient!nu;")
	public final Class20_Sub3_Sub4 aClass20_Sub3_Sub4_1;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!nu;)V")
	public Class1_Sub3_Sub9(@OriginalArg(0) Class20_Sub3_Sub4 arg0) {
		this.aClass20_Sub3_Sub4_1 = arg0;
	}
}
