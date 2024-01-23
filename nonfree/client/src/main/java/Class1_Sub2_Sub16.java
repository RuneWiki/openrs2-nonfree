import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 {

	@OriginalMember(owner = "client!rg", name = "I", descriptor = "Lclient!ea;")
	public Class15_Sub4 aClass15_Sub4_1;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!ea;)V")
	public Class1_Sub2_Sub16(@OriginalArg(0) Class15_Sub4 arg0) {
		this.aClass15_Sub4_1 = arg0;
	}
}
