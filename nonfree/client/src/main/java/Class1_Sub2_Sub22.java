import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public final class Class1_Sub2_Sub22 extends Class1_Sub2 {

	@OriginalMember(owner = "client!vf", name = "C", descriptor = "Lclient!ve;")
	public Class25_Sub6 aClass25_Sub6_1;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!ve;)V")
	public Class1_Sub2_Sub22(@OriginalArg(0) Class25_Sub6 arg0) {
		this.aClass25_Sub6_1 = arg0;
	}
}
