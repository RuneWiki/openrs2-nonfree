import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ia", name = "D", descriptor = "Lclient!wh;")
	public Class20_Sub7 aClass20_Sub7_1;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!wh;)V")
	public Class1_Sub1_Sub9(@OriginalArg(0) Class20_Sub7 arg0) {
		this.aClass20_Sub7_1 = arg0;
	}
}
