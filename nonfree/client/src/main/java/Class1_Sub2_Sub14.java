import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public final class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pn", name = "z", descriptor = "Lclient!rj;")
	public final Class20_Sub1_Sub6 aClass20_Sub1_Sub6_1;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!rj;)V")
	public Class1_Sub2_Sub14(@OriginalArg(0) Class20_Sub1_Sub6 arg0) {
		this.aClass20_Sub1_Sub6_1 = arg0;
	}
}
