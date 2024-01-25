import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public final class Class1_Sub39 extends Class1 {

	@OriginalMember(owner = "client!pt", name = "i", descriptor = "Lclient!nu;")
	public final Class20_Sub2_Sub4_Sub1_Sub2 aClass20_Sub2_Sub4_Sub1_Sub2_2;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!nu;)V")
	public Class1_Sub39(@OriginalArg(0) Class20_Sub2_Sub4_Sub1_Sub2 arg0) {
		this.aClass20_Sub2_Sub4_Sub1_Sub2_2 = arg0;
	}
}
