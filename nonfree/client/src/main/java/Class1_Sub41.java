import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public final class Class1_Sub41 extends Class1 {

	@OriginalMember(owner = "client!np", name = "p", descriptor = "Lclient!vi;")
	public final Class20_Sub1_Sub1_Sub2 aClass20_Sub1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!vi;)V")
	public Class1_Sub41(@OriginalArg(0) Class20_Sub1_Sub1_Sub2 arg0) {
		this.aClass20_Sub1_Sub1_Sub2_2 = arg0;
	}
}
