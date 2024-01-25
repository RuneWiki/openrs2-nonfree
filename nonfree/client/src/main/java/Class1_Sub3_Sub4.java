import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public final class Class1_Sub3_Sub4 extends Class1_Sub3 {

	@OriginalMember(owner = "client!d", name = "J", descriptor = "Lclient!gq;")
	public final Class20_Sub3_Sub2 aClass20_Sub3_Sub2_1;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!gq;)V")
	public Class1_Sub3_Sub4(@OriginalArg(0) Class20_Sub3_Sub2 arg0) {
		this.aClass20_Sub3_Sub2_1 = arg0;
	}
}
