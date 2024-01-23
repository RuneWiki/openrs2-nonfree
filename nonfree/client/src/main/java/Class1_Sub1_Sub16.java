import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!re", name = "E", descriptor = "Lclient!td;")
	public Class20_Sub6 aClass20_Sub6_1;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!td;)V")
	public Class1_Sub1_Sub16(@OriginalArg(0) Class20_Sub6 arg0) {
		this.aClass20_Sub6_1 = arg0;
	}
}
